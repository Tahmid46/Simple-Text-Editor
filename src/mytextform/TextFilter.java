/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytextform;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class TextFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.getAbsolutePath().endsWith(".txt") 
                || f.getAbsolutePath().endsWith(".rtf")
                || f.getAbsolutePath().endsWith(".java")
                || f.isDirectory();
    }

    @Override
    public String getDescription() {
        return "Text Files";
    }

}
