package com.cao;

import com.cao.Mapper.TaskMapper;
import com.cao.bean.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringbootApplication.class)
public class DemoSpringbootApplicationTests {

    @Autowired
	private TaskMapper taskMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMapper() {
        Task task = taskMapper.findTaskById(1);
        System.out.println(task);
	}

}
