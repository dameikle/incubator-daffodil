/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.daffodil.tdml

class TDMLException(msg: String, val causes: Seq[Throwable])
  extends Exception(msg, if (causes.length > 0) causes(0) else null) {

  def this(msg: String) = this(msg, Nil)

  def this(cause: Throwable) = this(cause.getMessage(), List(cause))

  def this(causes: Seq[Throwable]) = this(
    {
      causes.map { _.getMessage() }.mkString("\n")
    },
    causes)
}
