# clojure-stemmer

A Clojure version of the [porter stemming](http://tartarus.org/martin/PorterStemmer/).

Use the ruby version [here](https://github.com/raypereda/stemmify/blob/master/lib/stemmify.rb) to do the contrast test.

Any bug report and comments are welcomed.

This is an open source program, you can copy it, modified it or redistribute it, but must comply with the new BSD licence.

## Usage
After you start the clojure repl with command `lein repl`, you can do as following to use it:

```
#!clojure
user=> (use '[clojure-stemmer.porter.stemmer])
nil
user=> (stemming "chinese")
"chines"
user=> (stemming "feeds")
"feed"
user=> (stemming "reeds")
"reed"
user=> (stemming "saying")
"sai"
```

You can also run the all test, if you use the lein to manager clojure project, just by typing `lein test` under
the project root directory.

My running result is here:

```
#!bash
➜  clojure-stemmer git:(master) ✗ lein test

lein test clojure-stemmer.core-test

Ran 10000 tests containing 10000 assertions.
0 failures, 0 errors.
➜  clojure-stemmer git:(master) ✗
```

The code was tested under Clojure version 1.4.0 and 1.5.1.

## License

Copyright © 2013 m00nlight

Distributed under the new BSD License.
