package com.influence.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
		String example = "{ \"$ref\" : \"company\", \"$id\" : \"5babc4eb8aae900008a6aac4\" }";
		example = example.substring(example.lastIndexOf(":") + 1);
		example= example.substring(0, example.length() - 2);
		System.out.println(example);
		//{ "$ref" : "company", "$id" : "5babc4eb8aae900008a6aac4" }
	}

}
