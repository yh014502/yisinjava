package tw.org.iii.java;

import java.io.File;
import java.io.IOException;

public class java36file {

	public static void main(String[] args) {
		File file=new File("c:/king/file1");
		//新建檔案
		if(file.isFile()){
			System.out.println("OK");
		}else{
			try{
			if(file.createNewFile()){
			System.out.println("creat OK");
			}else{
				System.out.println("creat fail");
			}
			}catch(IOException ie){
				System.out.println("傳輸失敗");
			}
		}
		
		
		//新建目錄
		File file1=new File("c:/test/dir1/dir2/dir3/dir4");
				if(!file1.isDirectory()){
					//如果要新建dir4但前面沒有dir2、3，mkdirs會新建。mkdir只會新建一個
					file1.mkdirs();
				}
		//查看電腦ROOTS
				File[]roots=File.listRoots();
				for(File root:roots){
					System.out.println(root.getAbsolutePath());
				}

	}

}
