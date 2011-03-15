// Equites, a simple chess interface
// Copyright © 2011 Frank S. Thomas <f.thomas@gmx.de>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package equites

object Move {
  def apply(str: String): Move = fromAlgebraicNotation(str)

  def fromAlgebraicNotation(str: String): Move = {
    require(str.length == 5)
    require(List('-', 'x') contains str(2))

    val start = Field(str.substring(0, 2))
    val end   = Field(str.substring(3, 5))
    new Move(start, end)
  }
}

case class Move(val start: Field, val end: Field) {
  def toAlgebraicNotation(): String = {
    start.toAlgebraicNotation + "-" + end.toAlgebraicNotation
  }

  override def equals(that: Any): Boolean = that match {
    case Move(that_start, that_end) => that_start == start && that_end == end
    case _ => false
  }
}
