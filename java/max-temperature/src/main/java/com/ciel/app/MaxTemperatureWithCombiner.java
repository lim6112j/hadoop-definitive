package com.ciel.app;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MaxTemperatureWithCombiner {
		public static void main(String[] args) throws Exception {
				if (args.length != 2){
						System.err.println("Usage : MaxTemperatureWithCombiner <input path> " + "output path");
						System.exit(-1);
				}
				Job job = Job.getInstance();
				job.setJarByClass(MaxTemperatureWithCombiner.class);
				job.setJobName("Max Temperature");
				FileInputFormat.addInputPath(job, new Path(args[0]));
				FileOutputFormat.setOutputPath(job, new Path(args[1]));
				job.setMapperClass(MaxTemperatureMapper.class);
				job.setCombinerClass(MaxTemperatureReducer.class);
				job.setReducerClass(MaxTemperatureReducer.class);
				job.setMapOutputKeyClass(Text.class);
				job.setMapOutputValueClass(IntWritable.class);
				System.exit(job.waitForCompletion(true) ? 0 : 1);
		}
}
