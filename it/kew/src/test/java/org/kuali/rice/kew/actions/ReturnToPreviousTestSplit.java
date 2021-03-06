/**
 * Copyright 2005-2011 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.rice.kew.actions;

import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.kew.engine.RouteContext;
import org.kuali.rice.kew.engine.RouteHelper;
import org.kuali.rice.kew.engine.node.SplitNode;
import org.kuali.rice.kew.engine.node.SplitResult;

/**
 * Simple split node to help test ReturnToPreviousNode's interactions with split nodes
 * 
 * @author Kuali Rice Team (rice.collab@kuali.org)
 *
 */
public class ReturnToPreviousTestSplit implements SplitNode {
	org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(ReturnToPreviousTestSplit.class);

	/**
	 * Always redirects to the "There" branch
	 * @see org.kuali.rice.kew.engine.node.SplitNode#process(org.kuali.rice.kew.engine.RouteContext, org.kuali.rice.kew.engine.RouteHelper)
	 */
	public SplitResult process(RouteContext context, RouteHelper helper) throws Exception {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Evaluating ReturnToPreviousSplitTest");
		}
		List<String> results = new ArrayList<String>();
		results.add("There");
		return new SplitResult(results);
	}

}
