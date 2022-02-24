package chapter_7;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTestV {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ClassLoader myloader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if(is == null){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0 , b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myloader.loadClass("chapter_7.ClassLoaderTestV").newInstance();

        System.out.println(obj.getClass());
        System.out.println(obj instanceof chapter_7.ClassLoaderTestV);
    }

}
