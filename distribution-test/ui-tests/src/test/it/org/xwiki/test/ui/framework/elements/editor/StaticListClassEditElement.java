/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.test.ui.framework.elements.editor;

import org.openqa.selenium.By;
import org.xwiki.test.ui.framework.elements.BaseElement;
import org.xwiki.test.ui.framework.elements.FormElement;

/**
 * Represents a StaticListClass property form.
 * 
 * @version $Id$
 * @since 2.4M2
 */
public class StaticListClassEditElement extends BaseElement
{
    private final String propertyName;

    private final FormElement form;

    /** The display type for inputting to setDisplayType. */
    public enum DisplayType
    {
        INPUT("input"),
        SELECT("select"),
        RADIO("radio"),
        CHECKBOX("checkbox");

        private final String id;

        private DisplayType(final String id)
        {
            this.id = id;
        }

        public String toString()
        {
            return this.id;
        }
    }

    public StaticListClassEditElement(FormElement form, String propertyName)
    {
        this.form = form;
        this.propertyName = propertyName;
    }

    public void setValues(String values)
    {
        this.form.setFieldValue(By.id(this.propertyName + "_values"), values);
    }

    public void setMultiSelect(boolean isMultiSelect)
    {
        this.form.setFieldValue(By.id(this.propertyName + "_multiSelect"), isMultiSelect ? "true" : "false");
    }

    public void setDisplayType(DisplayType type)
    {
        this.form.setFieldValue(By.id(this.propertyName + "_displayType"), type.toString());
    }

    public void setRelationalStorage(boolean isRelationalStorage)
    {
        this.form.setFieldValue(By.id(this.propertyName + "_relationalStorage"),
                                isRelationalStorage ? "true" : "false");
    }
}
