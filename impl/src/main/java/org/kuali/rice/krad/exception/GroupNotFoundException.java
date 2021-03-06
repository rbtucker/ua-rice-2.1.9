/**
 * Copyright 2005-2014 The Kuali Foundation
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
package org.kuali.rice.krad.exception;

/**
 * This class represents an exception that is thrown when a given group can not be retrieved from workflow.
 * 
 * 
 */
public class GroupNotFoundException extends Exception {

    private static final long serialVersionUID = -6387291917894932290L;

    public GroupNotFoundException() {
        super();
    }

    public GroupNotFoundException(String s) {
        super(s);
    }

    public GroupNotFoundException(Throwable t) {
        super(t);
    }

    public GroupNotFoundException(String s, Throwable t) {
        super(s, t);
    }

}
