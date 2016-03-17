package java8.module1;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by MaBa on 17/03/16.
 */
public class FileFilterMain {

    public static void main(String[] args) {

//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter fileFilterLamda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("/Users/MaBa/IdeaProjects/lamba-sandbox/src/main/java/java8/module1");
        File[] files = dir.listFiles(fileFilterLamda);

        for (File file : files) {
            System.out.println(file);
        }
    }
}
