package cn;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.Message;
import com.cn.hnust.service.IHistoryService;
import com.cn.hnust.service.IMessageService;
import com.cn.hnust.service.IUserService;

// 表示继承了SpringJUnit4ClassRunner类
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource(name = "userService")
	private IUserService userService;

	@Resource(name = "messageService")
	private IMessageService messageService;

	@Resource(name = "historyService")
	private IHistoryService historyService;

	@Test
	public void test() {
		List<Message> user = messageService.selectById(1, 1);

		logger.info(JSON.toJSONString(user));
	}
}