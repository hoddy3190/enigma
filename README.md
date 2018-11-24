# enigma

[![CircleCI](https://circleci.com/gh/altitude3190/enigma/tree/master.svg?style=svg)](https://circleci.com/gh/altitude3190/enigma/tree/master)

Enigma machines are a series of electro-mechanical rotor cipher machines mainly developed and used in the early- to mid-20th century to protect commercial, diplomatic and military communication.

This project is written by Kotlin and aims to reproduce an Enigma machine.

![Military Enigma machine](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/EnigmaMachineLabeled.jpg/360px-EnigmaMachineLabeled.jpg "Military Enigma machine")  
Image Source: Wikipedia

## Architecture

This software architecture refers to 'Validated Designs for Object-oriented Systems' which is authored by Fitzgerald, J., Larsen, P.G., Mukherjee, P., Plat, N., Verhoef, M.

The page of the UML models figure fortunately can be read online :)

1. jump to [the book page of Springer.com](https://www.springer.com/la/book/9781852338817)
2. click 'Download Sample pages 1 PDF'
3. open p8 and see 'Fig. 9.2: The revised Enigma UML model'

## Run Enigma!

1. clone this repository
2. command gradle run
   ```
   $ gradle run --args ABACCD
   ```
   --args receives words you want to encode. But sorry, there is a restriction that the words must be composed of 4 charactors of 'A', 'B', 'C', 'D'. If you want to remove the restriction, you have to change settings of SimpleEnigma class.


## Author

[Hodaka Suzuki](https://github.com/altitude3190)


## Lisense

[MIT](https://github.com/altitude3190/enigma/blob/master/LICENSE)
