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
package org.opens.tanaguru.contentadapter.css;

import org.w3c.css.sac.SACMediaList;

/**
 *
 * @author jkowalczyk
 */
public interface CSSImportedStyle {

    /**
     *
     * @return the path of the imported styleSheet
     */
    String getPath();

    /**
     * Set the path of the imported styleSheet
     * @param path
     */
    void setPath(String path);

    /**
     *
     * @return the sac media list of the imported styleSheet
     */
    SACMediaList getSACMediaList();

    /**
     * Set the sac media list of the imported styleSheet
     * @param sacMediaList
     */
    void setSACMediaList (SACMediaList sacMediaList);

}