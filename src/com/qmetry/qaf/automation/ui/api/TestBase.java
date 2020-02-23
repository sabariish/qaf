/*******************************************************************************
 * Copyright (c) 2019 Infostretch Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.qmetry.qaf.automation.ui.api;

import java.lang.reflect.Method;

import com.qmetry.qaf.automation.core.MessageTypes;

/**
 * com.qmetry.qaf.automation.core.ui.api.TestBase.java
 * 
 * @author chirag
 */
public interface TestBase<D> {
	/**
	 * @return driver
	 */
	D getDriver();

	void setUp(Method m, String... args);

	void tearDown();

	void prepareForShutDown();

	boolean isPreparedForShutDown();

	void addTestStepLog(String msg);

	void addAssertionsLog(String msg);

	void addAssertionsLog(String msg, MessageTypes type);

	/**
	 * Get BaseUrl for current test base
	 * 
	 * @return
	 */
	String getBaseUrl();

	/**
	 * Get current running browser string i.e. *firefox, firefoxDriver,
	 * firefoxRemoteDriver ...
	 * 
	 * @return browser string
	 */
	String getBrowser();

}
