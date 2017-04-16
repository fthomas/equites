[![Stories in Ready](https://badge.waffle.io/fthomas/equites.png?label=ready&title=Ready)](https://waffle.io/fthomas/equites)
# Equites, a Scala chess playground
[![Build Status](https://travis-ci.org/equites-chess/equites-core.svg?branch=master)](https://travis-ci.org/equites-chess/equites-core)
[![Coverage Status](https://img.shields.io/coveralls/equites-chess/equites-core.svg)](https://coveralls.io/r/equites-chess/equites-core?branch=master)
[![Download](https://api.bintray.com/packages/fthomas/maven/equites-core/images/download.svg)](https://bintray.com/fthomas/maven/equites-core/_latestVersion)

Equites is a bunch of chess related code mostly implemented in Scala.
Currently there is little usable from a chess player's point of view.
But it can animate random [Knight's tours][Equites] :-) and [talk with
chess engines][UciEngineVsItself] via the [Universal Chess Interface (UCI)][UCI].

[Equites]: http://equites.timepit.eu/
[UCI]: http://en.wikipedia.org/wiki/Universal_Chess_Interface
[UciEngineVsItself]: https://github.com/equites-chess/equites-cli/blob/master/src/main/scala/eu/timepit/equites/cli/UciEngineVsItself.scala

## Web resources

Equites also provides some free to use web resources:

* Convert [FEN] placements to other formats:
 * [/api/fen/figurine/]
 * [/api/fen/letter/]
 * [/api/fen/wiki/]

[FEN]: http://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation
[/api/fen/figurine/]: http://equites.timepit.eu/api/fen/figurine/rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR
[/api/fen/letter/]: http://equites.timepit.eu/api/fen/letter/rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR
[/api/fen/wiki/]: http://equites.timepit.eu/api/fen/wiki/rnbqkbnr/pp1ppppp/8/2p5/4P3/8/PPPP1PPP/RNBQKBNR

## Download

You can download the Equites sources in either [tar.gz][] or [zip][] formats.

[tar.gz]: https://github.com/equites-chess/equites-core/tarball/master
[zip]:    https://github.com/equites-chess/equites-core/zipball/master

The version control system used for development of Equites is Git. The [Git
repository][] can be inspected and browsed online at [GitHub][] and it can
be cloned by running:

    git clone git://github.com/equites-chess/equites-core.git

[Git repository]: http://github.com/equites-chess/equites-core
[GitHub]: http://github.com/

## License

Equites is [free software][] and licensed under the [GPLv3][]. The full text
of the license can be found in the file [`COPYING`][COPYING] in Equites'
source tree.

[free software]: http://www.gnu.org/philosophy/free-sw.html
[GPLv3]: http://www.gnu.org/licenses/gpl-3.0.html
[COPYING]: https://github.com/equites-chess/equites-core/blob/master/COPYING
