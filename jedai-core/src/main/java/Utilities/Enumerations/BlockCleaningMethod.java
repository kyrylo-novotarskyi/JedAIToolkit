/*
* Copyright [2016-2017] [George Papadakis (gpapadis@yahoo.gr)]
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package Utilities.Enumerations;

import BlockProcessing.BlockCleaning.BlockFiltering;
import BlockProcessing.BlockCleaning.ComparisonsBasedBlockPurging;
import BlockProcessing.BlockCleaning.SizeBasedBlockPurging;
import BlockProcessing.IBlockProcessing;

/**
 *
 * @author GAP2
 */

public enum BlockCleaningMethod {
    BLOCK_FILTERING,
    COMPARISON_BASED_BLOCK_PURGING,
    SIZE_BASED_BLOCK_PURGING;
    
    public static IBlockProcessing getDefaultConfiguration(BlockCleaningMethod blclMethod) {
        switch (blclMethod) {
            case BLOCK_FILTERING:
                return new BlockFiltering();
            case COMPARISON_BASED_BLOCK_PURGING:
                return new ComparisonsBasedBlockPurging();
            case SIZE_BASED_BLOCK_PURGING:
                return new SizeBasedBlockPurging();
            default:
                return new BlockFiltering();
        }
    }
}