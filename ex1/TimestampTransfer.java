package No1;  //在No1包下

import java.sql.Timestamp;  //导入java.sql.Timestamp包
import java.text.ParseException;  //导入ava.text.ParseException包
import java.text.SimpleDateFormat;  //导入java.text.SimpleDateFormat包
import java.util.Date;  //导入java.util.Date包
import java.util.Scanner;  //导入java.util.Scanner包

	/*
	 * 题目要求：
	 * 0. 在个人仓库下，创建分支yourname_ex1
	 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
	 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
	 * 3. 创建pull request，与主仓库的master分支对比
	 */
	public class TimestampTransfer {              //创建TimestampTransfer
		@SuppressWarnings("resource")              //
		public static void main(String[] args){   //定义main函数
			Scanner scanner = new Scanner(System.in);  //调用Scanner类重新定义一个scanner，作用是获取输入值
			SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //调用SimpleDateFormat函数重新定义一个inputFormat，格式为“yyyy-MM-dd HH:mm:ss”
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  //调用SimpleDateFormat函数重新定义一个outputFormat，格式为“yyyy-MM-dd HH:mm:ss”
			while (scanner.hasNext()){      //创造一个while循环
				String line = scanner.nextLine();   //定义一个string类型的变量line，读取scanner用nextLine方法读取的数据
				Date lineDate = null;    //定义一个Date类型的变量lineDate，值为空
				long lineTimestamp;     //定义一个long类型的变量lineTimestamp
				try {                //捕获异常
					lineDate = inputFormat.parse(line);   //将line中的数据更改为inputFormat的格式并输出给lineDate
					lineTimestamp = lineDate.getTime();   //根据lineDate的数据获得时间戳并且输入给lineTimestamp
					System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);  //输出“lineDate的值” to “lineTimestamp的值”
				} catch (ParseException e) {     //抛出异常
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

