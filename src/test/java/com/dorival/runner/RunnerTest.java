package com.dorival.runner;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dorival.acceptance.DefaultAcceptanceTestRunner;
import io.openbdt.run.SuiteTestRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/appcontext.xml")
public class RunnerTest {

	/**
	 * LOG
	 */
	private static final Logger LOG = Logger.getLogger(RunnerTest.class.getName());
	
	/**
	 * @Inject
	 */
	@Autowired
	private SuiteTestRunner suiteTestRunner;
	
	@Test
	public void test() {
		LOG.info(">>>>>>>>>>>>>>> Start test "); 
		
		this.suiteTestRunner.runWithJunit(DefaultAcceptanceTestRunner.class);
		
		LOG.info(">>>>>>>>>>>>>>> End test ");
	}
}
