/*
 * Copyright [2016-2018] [George Papadakis (gpapadis@yahoo.gr)]
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

package DataReader.EntityReader;

import DataModel.EntityProfile;
import DataReader.AbstractReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G.A.P. II
 */

public abstract class AbstractEntityReader extends AbstractReader implements IEntityReader {
    
    protected final List<EntityProfile> entityProfiles;
    
    public AbstractEntityReader (String filePath) {
        super(filePath);
        entityProfiles = new ArrayList<>();
    }
}