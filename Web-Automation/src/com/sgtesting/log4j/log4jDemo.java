package com.sgtesting.log4j;

import org.apache.log4j.Logger;
public class log4jDemo 
{
	public static void main(String[] args) 
	{
		getLogs();
	}
	private static Logger log=Logger.getLogger("Loop Output");
	private static void getLogs()
	{
		log.info("For Loop Execution started here");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even Number :"+i);
			}
		}
		log.info("For Loop Execution ended here");
	}

}
