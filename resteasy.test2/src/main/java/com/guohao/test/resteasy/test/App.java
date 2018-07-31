package com.guohao.test.resteasy.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Hello world!
 *
 */
@Path("path1")
public class App {

	/**
	 * 该测试是使用Resteasy实现JAX-RS规范
	 * 参考 https://blog.csdn.net/xudawenfighting/article/details/80126465
	 * 访问 http://localhost:8080/resteasy.test2/path1/path1/1
	 * @param personId
	 * @return
	 */
	@GET
	@Path("path1/{id}")
	@Produces("application/json")
	public String string(@PathParam("id") int personId) {
		String result = "person id=" + personId;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
