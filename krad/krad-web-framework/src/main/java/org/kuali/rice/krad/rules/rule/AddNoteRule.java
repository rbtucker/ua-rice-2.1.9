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
package org.kuali.rice.krad.rules.rule;

import org.kuali.rice.krad.bo.Note;
import org.kuali.rice.krad.document.Document;

/**
 * Defines a rule which gets invoked immediately before a document has a note added to it.
 * 
 * 
 */
public interface AddNoteRule extends BusinessRule {
    /**
     * This method is responsible for housing business rules that need to be checked before a note is added to a document.
     * 
     * @param document
     * @param note
     * @return false if the rule fails
     */
    public boolean processAddNote(Document document, Note note);
}
