// Equites, a Scala chess playground
// Copyright © 2013 Frank S. Thomas <frank@timepit.eu>
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

package eu.timepit.equites
package problem

import org.specs2.mutable._

import KnightsTour._

class KnightsTourSpec extends Specification {
  val squares = Rules.allSquares.toSet

  def alwaysVisitAllSquares(tourFn: Square => Stream[Square]) = {
    "visit all squares from all starting squares" in {
      squares.forall(sq => tourFn(sq).toSet == squares) must beTrue
    }
  }

  "warnsdorffTour" should {
    alwaysVisitAllSquares(warnsdorffTour)

    "produce at least one closed tour" in {
      squares.exists(sq => isClosed(warnsdorffTour(sq))) must beTrue
    }
  }

  "randomWarnsdorffTour" should {
    alwaysVisitAllSquares(randomWarnsdorffTour)
  }
}
