/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
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
package org.opens.tanaguru.entity.reference;

import java.util.Collection;

import org.opens.tanaguru.sdk.entity.Entity;

/**
 * 
 * @author jkowalczyk
 */
public interface Nomenclature extends Entity {

    /**
     *
     * @param element
     *            the element to add
     */
    void addElement(NomenclatureElement element);

    /**
     *
     * @return the code
     */
    String getCode();

    /**
     *
     * @return the description
     */
    String getDescription();

    /**
     *
     * @return the elements
     */
    Collection<NomenclatureElement> getElementList();

    /**
     *
     * @return the integer values of the elements
     */
    Collection<Integer> getIntegerValueList();

    /**
     *
     * @return the long label
     */
    String getLongLabel();

    /**
     *
     * @return the parent
     */
    Nomenclature getParent();

    /**
     *
     * @return the short label
     */
    String getShortLabel();

    /**
     *
     * @return the values from the elements
     */
    Collection<String> getValueList();

    /**
     *
     * @param code
     *            the code to set
     */
    void setCode(String code);

    /**
     *
     * @param description
     *            the description to set
     */
    void setDescription(String description);

    /**
     *
     * @param elements
     *            the elements to set
     */
    void setElementList(Collection<NomenclatureElement> elements);

    /**
     *
     * @param longLabel
     *            the long label to set
     */
    void setLongLabel(String longLabel);

    /**
     *
     * @param parent
     *            the parent to set
     */
    void setParent(Nomenclature parent);

    /**
     *
     * @param shortLabel
     *            the short label to set
     */
    void setShortLabel(String shortLabel);

}