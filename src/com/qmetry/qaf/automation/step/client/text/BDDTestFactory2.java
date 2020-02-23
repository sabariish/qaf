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
package com.qmetry.qaf.automation.step.client.text;

import java.util.Arrays;
import java.util.List;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.client.ScenarioFactory;
import com.qmetry.qaf.automation.step.client.ScenarioFileParser;

/**
 * com.qmetry.qaf.automation.step.client.text.BDDFactory2.java
 * 
 * @author chirag.jayswal
 */
public class BDDTestFactory2 extends ScenarioFactory {

	@SuppressWarnings("unchecked")
	public BDDTestFactory2() {
		super(ConfigurationManager.getBundle().getList("txt.scenario.file.ext",
				Arrays.asList(new String[] { "feature", "bdl" })));
	}

	public BDDTestFactory2(List<String> ext) {
		super(ext);
	}

	@Override
	protected ScenarioFileParser getParser() {
		return new BDDFileParser2();
	}

}
