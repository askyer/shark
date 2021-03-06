/*
 * Copyright (C) 2012 The Regents of The University California.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shark.memstore2

/**
 * A container for table metadata managed by Shark and Spark. Subclasses are responsible for
 * how RDDs are set, stored, and accessed.
 *
 * @param databaseName Namespace for this table.
 * @param tableName Name of this table.
 * @param cacheMode Type of memory storage used for the table (e.g., the Spark block manager).
 */
private[shark] abstract class Table(
    var databaseName: String,
    var tableName: String,
    var cacheMode: CacheType.CacheType)
