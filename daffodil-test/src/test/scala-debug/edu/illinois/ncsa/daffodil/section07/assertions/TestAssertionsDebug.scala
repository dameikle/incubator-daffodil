package edu.illinois.ncsa.daffodil.section07.assertions

/* Copyright (c) 2012-2014 Tresys Technology, LLC. All rights reserved.
 *
 * Developed by: Tresys Technology, LLC
 *               http://www.tresys.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal with
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimers.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimers in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. Neither the names of Tresys Technology, nor the names of its contributors
 *     may be used to endorse or promote products derived from this Software
 *     without specific prior written permission.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 */

import org.junit.Test
import junit.framework.Assert._
import edu.illinois.ncsa.daffodil.tdml.DFDLTestSuite
import edu.illinois.ncsa.daffodil.util.Misc
import edu.illinois.ncsa.daffodil.debugger.Debugger

class TestAssertionsDebug {
  val testDir = "/edu/illinois/ncsa/daffodil/section07/assertions/"
  val tdml = testDir + "assert.tdml"
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdml), validateTDMLFile = false)

  @Test def test_testPatternX() { runner.runOneTest("testPatternX") }
  @Test def test_testPatternHex() { runner.runOneTest("testPatternHex") }
  
  @Test def test_assertExpressionEmpty() { runner.runOneTest("assertExpressionEmpty") }
  @Test def test_assertPatternEmpty() { runner.runOneTest("assertPatternEmpty") }
  
  @Test def test_testPatternFreeFormat() { runner.runOneTest("testPatternFreeFormat") }
  @Test def test_testPatternUnicode() { runner.runOneTest("testPatternUnicode") }
  @Test def test_testPatternUregexUword() { runner.runOneTest("testPatternUregexUword") }

  //This test passes but it's not actually checking for the warning - see DFDL-831
  @Test def test_testPatternWordChar() { runner.runOneTest("testPatternWordChar") }
}