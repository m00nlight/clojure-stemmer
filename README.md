# clojure-stemmer

A Clojure version of the [porter stemming](http://tartarus.org/martin/PorterStemmer/).

Use the ruby version [here](https://github.com/raypereda/stemmify/blob/master/lib/stemmify.rb) to do the contrast test.

Any bug report and comments are welcomed.

This is an open source program, you can copy it, modified it or redistribute it, but must comply with the Eclipse public
licence and make sure the new program is still an open source software.

## Usage

```
#!clojure
user=> (clojure-stemmer.core/stemming "working")
"work"
user=> (clojure-stemmer.core/stemming "chinese")
"chines"
```

You can also run the all test, if you use the lein to manager clojure project, just by typing `lein test` under
the project root directory.

My running result is here:

```
#!bash
λ chakra-pc clojure-stemmer → lein test

lein test clojure-stemmer.core-test

Testing clojure-stemmer.core-test

Ran 1086 tests containing 1086 assertions.
0 failures, 0 errors.
```

## License

Copyright © 2013 m00nlight

Distributed under the Eclipse Public License, the same as Clojure.
