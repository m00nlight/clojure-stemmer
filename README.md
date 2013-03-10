# clojure-stemmer

A Clojure version of the [porter stemming](http://tartarus.org/martin/PorterStemmer/).

Use the ruby version [here](https://github.com/raypereda/stemmify/blob/master/lib/stemmify.rb) to do the test.

Any bug report and comments are welcomed to send to me.

## Usage

```
#!clojure
user=> (clojure-stemmer.core/stemming "working")
"work"
user=> (clojure-stemmer.core/stemming "chinese")
"chines"
```

You can also run the all test, if you use the lein to manager clojure project, just by typing `lein test` uner 
the project root directory.

My running result is here:

```
#!sh
λ chakra-pc clojure-stemmer → lein test

lein test clojure-stemmer.core-test

Testing clojure-stemmer.core-test

Ran 1086 tests containing 1086 assertions.
0 failures, 0 errors.
```

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
