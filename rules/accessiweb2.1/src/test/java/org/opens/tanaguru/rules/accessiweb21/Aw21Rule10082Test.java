/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2012  Open-S Company
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.rules.accessiweb21;

import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.accessiweb21.test.Aw21RuleImplementationTestCase;

/**
 * Unit test class for the implementation of the rule 10.8.2 of the referential Accessiweb 2.1.
 *
 * @author jkowalczyk
 */
public class Aw21Rule10082Test extends Aw21RuleImplementationTestCase {

    /**
     * Default constructor
     */
    public Aw21Rule10082Test (String testName){
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.opens.tanaguru.rules.accessiweb21.Aw21Rule10082");
    }

    @Override
    protected void setUpWebResourceMap() {
//        getWebResourceMap().put("Aw21.Test.10.8.2-1Passed-01",
//              getWebResourceFactory().createPage(
//              getTestcasesFilePath() + "AW21/Aw21Rule10082/Aw21.Test.10.8.2-1Passed-01.html"));
//        getWebResourceMap().put("Aw21.Test.10.8.2-2Failed-01",
//              getWebResourceFactory().createPage(
//              getTestcasesFilePath() + "AW21/Aw21Rule10082/Aw21.Test.10.8.2-2Failed-01.html"));
        getWebResourceMap().put("Aw21.Test.10.8.2-3NMI-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule10082/Aw21.Test.10.8.2-3NMI-01.html"));
//        getWebResourceMap().put("Aw21.Test.10.8.2-4NA-01",
//              getWebResourceFactory().createPage(
//              getTestcasesFilePath() + "AW21/Aw21Rule10082/Aw21.Test.10.8.2-4NA-01.html"));
    }

    @Override
    protected void setProcess() {
//        assertEquals(TestSolution.PASSED,
//                processPageTest("Aw21.Test.10.8.2-1Passed-01").getValue());
//        assertEquals(TestSolution.FAILED,
//                processPageTest("Aw21.Test.10.8.2-2Failed-01").getValue());
        assertEquals(TestSolution.NOT_TESTED,
                processPageTest("Aw21.Test.10.8.2-3NMI-01").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                processPageTest("Aw21.Test.10.8.2-4NA-01").getValue());
    }

    @Override
    protected void setConsolidate() {
//        assertEquals(TestSolution.PASSED,
//                consolidate("Aw21.Test.10.8.2-1Passed-01").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Aw21.Test.10.8.2-2Failed-01").getValue());
        assertEquals(TestSolution.NOT_TESTED,
                consolidate("Aw21.Test.10.8.2-3NMI-01").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Aw21.Test.10.8.2-4NA-01").getValue());
    }

}