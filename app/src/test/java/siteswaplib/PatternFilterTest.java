/*
* Siteswap Generator: Android App for generating juggling siteswaps
* Copyright (C) 2018 Tilman Sinning
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package siteswaplib;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PatternFilterTest {

    @Test
    public void testParsableStringConversion() {
        PatternFilter filter1 = new PatternFilter(new Siteswap("ppsps"), PatternFilter.Type.EXCLUDE);
        PatternFilter filter2 = new PatternFilter(new Siteswap("972"), PatternFilter.Type.INCLUDE);

        String filter1str = filter1.toParsableString();
        String filter2str = filter2.toParsableString();

        PatternFilter filter1conv = new PatternFilter(filter1str);
        PatternFilter filter2conv = new PatternFilter(filter2str);

        assertEquals(filter1, filter1conv);
        assertEquals(filter2, filter2conv);

    }

}
