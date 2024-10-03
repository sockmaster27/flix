/*
 * Copyright 2024 Holger Dal Mogensen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.uwaterloo.flix.language.ast.shared

import ca.uwaterloo.flix.language.ast.SourceLocation

/**
  * Documentation.
  *
  * @param lines the lines of the comments.
  * @param loc   the source location of the text.
  */
case class Doc(lines: List[String], loc: SourceLocation) {
  def text: String = lines.
    dropWhile(_.trim.isEmpty).
    map(_.trim).
    mkString("\n")

  /**
    * Returns a string representation that hides the internals.
    */
  override def toString: String = "Doc(...)"
}