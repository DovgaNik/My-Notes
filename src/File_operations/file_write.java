//********************
//*DovgaNik 2018-2019* 
//********************
/*
This class writes text to file.
To write text to file you must type text and file name in function arguments. For example 

import File_operatons.file_write;
file_write write = new file_write();
writer.write("text", "file_name");
If the writing was succesfull function will return null, if there is IOException function will return 1
*/
package File_operations;

import java.io.*;

public class file_write {
    public String write(String txt, String name){
        try{
        FileWriter write = new FileWriter(name);
        BufferedWriter buffer = new BufferedWriter(write);
        buffer.write(txt);
        buffer.close();
        }catch(IOException ex){
            return("1");
        }
        return(null);
    }
}
