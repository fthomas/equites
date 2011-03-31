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
package implicits

object RichPieceImplicit {
  implicit def pieceWrapper(piece: Piece) = new RichPiece(piece)
}

final class RichPiece(val piece: Piece) {
  def toAlgebraic: String = piece.pieceType match {
    case King   => "K"
    case Queen  => "Q"
    case Rook   => "R"
    case Bishop => "B"
    case Knight => "N"
    case Pawn   => ""
  }

  def toLetter: String = {
    val letter = if (piece.pieceType == Pawn) "P" else toAlgebraic
    if (piece.color == White) letter else letter.toLowerCase
  }

  def toFigurine: String = {
    val figurine = piece.pieceType match {
      case King   => ("\u2654", "\u265A") // ♔ ♚
      case Queen  => ("\u2655", "\u265B") // ♕ ♛
      case Rook   => ("\u2656", "\u265C") // ♖ ♜
      case Bishop => ("\u2657", "\u265D") // ♗ ♝
      case Knight => ("\u2658", "\u265E") // ♘ ♞
      case Pawn   => ("\u2659", "\u265F") // ♙ ♟
    }
    if (piece.color == White) figurine._1 else figurine._2
  }

  def toWikiLetters: String = {
    val color = if (piece.color == White) "l" else "d"
    toLetter.toLowerCase + color
  }
}
