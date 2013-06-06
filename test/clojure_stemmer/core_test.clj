(ns clojure-stemmer.core-test
  (:use clojure.test)
  (:require [clojure-stemmer.clj.stemmer]))

(deftest a-test
  (testing "Simple Test."
    (is (= 0 0))))

(deftest b-test
  (testing "Simple clj.stemmer/stemming test"
    (is (= (clj.stemmer/stemming "working") "work"))))


(deftest test-0001
  (testing "testting case 1"
    (is (= (clj.stemmer/stemming "seoul") "seoul"))))

(deftest test-0002
  (testing "testting case 2"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0003
  (testing "testting case 3"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0004
  (testing "testting case 4"
    (is (= (clj.stemmer/stemming "angrily") "angrili"))))

(deftest test-0005
  (testing "testting case 5"
    (is (= (clj.stemmer/stemming "responding") "respond"))))

(deftest test-0006
  (testing "testting case 6"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0007
  (testing "testting case 7"
    (is (= (clj.stemmer/stemming "united") "unit"))))

(deftest test-0008
  (testing "testting case 8"
    (is (= (clj.stemmer/stemming "nations") "nation"))))

(deftest test-0009
  (testing "testting case 9"
    (is (= (clj.stemmer/stemming "security") "secur"))))

(deftest test-0010
  (testing "testting case 10"
    (is (= (clj.stemmer/stemming "council") "council"))))

(deftest test-0011
  (testing "testting case 11"
    (is (= (clj.stemmer/stemming "unanimous") "unanim"))))

(deftest test-0012
  (testing "testting case 12"
    (is (= (clj.stemmer/stemming "decision") "decis"))))

(deftest test-0013
  (testing "testting case 13"
    (is (= (clj.stemmer/stemming "impose") "impos"))))

(deftest test-0014
  (testing "testting case 14"
    (is (= (clj.stemmer/stemming "tightened") "tighten"))))

(deftest test-0015
  (testing "testting case 15"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0016
  (testing "testting case 16"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0017
  (testing "testting case 17"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0018
  (testing "testting case 18"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0019
  (testing "testting case 19"
    (is (= (clj.stemmer/stemming "friday") "fridai"))))

(deftest test-0020
  (testing "testting case 20"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0021
  (testing "testting case 21"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0022
  (testing "testting case 22"
    (is (= (clj.stemmer/stemming "nullifying") "nullifi"))))

(deftest test-0023
  (testing "testting case 23"
    (is (= (clj.stemmer/stemming "all") "all"))))

(deftest test-0024
  (testing "testting case 24"
    (is (= (clj.stemmer/stemming "nonaggression") "nonaggress"))))

(deftest test-0025
  (testing "testting case 25"
    (is (= (clj.stemmer/stemming "agreements") "agreement"))))

(deftest test-0026
  (testing "testting case 26"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0027
  (testing "testting case 27"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0028
  (testing "testting case 28"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0029
  (testing "testting case 29"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0030
  (testing "testting case 30"
    (is (= (clj.stemmer/stemming "one") "on"))))

(deftest test-0031
  (testing "testting case 31"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0032
  (testing "testting case 32"
    (is (= (clj.stemmer/stemming "top") "top"))))

(deftest test-0033
  (testing "testting case 33"
    (is (= (clj.stemmer/stemming "generals") "gener"))))

(deftest test-0034
  (testing "testting case 34"
    (is (= (clj.stemmer/stemming "claiming") "claim"))))

(deftest test-0035
  (testing "testting case 35"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0036
  (testing "testting case 36"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0037
  (testing "testting case 37"
    (is (= (clj.stemmer/stemming "country") "countri"))))

(deftest test-0038
  (testing "testting case 38"
    (is (= (clj.stemmer/stemming "had") "had"))))

(deftest test-0039
  (testing "testting case 39"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0040
  (testing "testting case 40"
    (is (= (clj.stemmer/stemming "tipped") "tip"))))

(deftest test-0041
  (testing "testting case 41"
    (is (= (clj.stemmer/stemming "intercontinental") "intercontinent"))))

(deftest test-0042
  (testing "testting case 42"
    (is (= (clj.stemmer/stemming "ballistic") "ballist"))))

(deftest test-0043
  (testing "testting case 43"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0044
  (testing "testting case 44"
    (is (= (clj.stemmer/stemming "ready") "readi"))))

(deftest test-0045
  (testing "testting case 45"
    (is (= (clj.stemmer/stemming "blast") "blast"))))

(deftest test-0046
  (testing "testting case 46"
    (is (= (clj.stemmer/stemming "off") "off"))))

(deftest test-0047
  (testing "testting case 47"
    (is (= (clj.stemmer/stemming "matching") "match"))))

(deftest test-0048
  (testing "testting case 48"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0049
  (testing "testting case 49"
    (is (= (clj.stemmer/stemming "harsh") "harsh"))))

(deftest test-0050
  (testing "testting case 50"
    (is (= (clj.stemmer/stemming "warning") "warn"))))

(deftest test-0051
  (testing "testting case 51"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0052
  (testing "testting case 52"
    (is (= (clj.stemmer/stemming "toughened") "toughen"))))

(deftest test-0053
  (testing "testting case 53"
    (is (= (clj.stemmer/stemming "stance") "stanc"))))

(deftest test-0054
  (testing "testting case 54"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0055
  (testing "testting case 55"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0056
  (testing "testting case 56"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0057
  (testing "testting case 57"
    (is (= (clj.stemmer/stemming "friday") "fridai"))))

(deftest test-0058
  (testing "testting case 58"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0059
  (testing "testting case 59"
    (is (= (clj.stemmer/stemming "pyongyang") "pyongyang"))))

(deftest test-0060
  (testing "testting case 60"
    (is (= (clj.stemmer/stemming "attacks") "attack"))))

(deftest test-0061
  (testing "testting case 61"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0062
  (testing "testting case 62"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0063
  (testing "testting case 63"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0064
  (testing "testting case 64"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0065
  (testing "testting case 65"
    (is (= (clj.stemmer/stemming "weapon") "weapon"))))

(deftest test-0066
  (testing "testting case 66"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0067
  (testing "testting case 67"
    (is (= (clj.stemmer/stemming "regime") "regim"))))

(deftest test-0068
  (testing "testting case 68"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0069
  (testing "testting case 69"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0070
  (testing "testting case 70"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0071
  (testing "testting case 71"
    (is (= (clj.stemmer/stemming "leader") "leader"))))

(deftest test-0072
  (testing "testting case 72"
    (is (= (clj.stemmer/stemming "kim") "kim"))))

(deftest test-0073
  (testing "testting case 73"
    (is (= (clj.stemmer/stemming "jong") "jong"))))

(deftest test-0074
  (testing "testting case 74"
    (is (= (clj.stemmer/stemming "will") "will"))))

(deftest test-0075
  (testing "testting case 75"
    (is (= (clj.stemmer/stemming "erased") "eras"))))

(deftest test-0076
  (testing "testting case 76"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-0077
  (testing "testting case 77"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0078
  (testing "testting case 78"
    (is (= (clj.stemmer/stemming "earth") "earth"))))

(deftest test-0079
  (testing "testting case 79"
    (is (= (clj.stemmer/stemming "such") "such"))))

(deftest test-0080
  (testing "testting case 80"
    (is (= (clj.stemmer/stemming "language") "languag"))))

(deftest test-0081
  (testing "testting case 81"
    (is (= (clj.stemmer/stemming "marked") "mark"))))

(deftest test-0082
  (testing "testting case 82"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0083
  (testing "testting case 83"
    (is (= (clj.stemmer/stemming "most") "most"))))

(deftest test-0084
  (testing "testting case 84"
    (is (= (clj.stemmer/stemming "hostile") "hostil"))))

(deftest test-0085
  (testing "testting case 85"
    (is (= (clj.stemmer/stemming "exchange") "exchang"))))

(deftest test-0086
  (testing "testting case 86"
    (is (= (clj.stemmer/stemming "between") "between"))))

(deftest test-0087
  (testing "testting case 87"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0088
  (testing "testting case 88"
    (is (= (clj.stemmer/stemming "two") "two"))))

(deftest test-0089
  (testing "testting case 89"
    (is (= (clj.stemmer/stemming "koreas") "korea"))))

(deftest test-0090
  (testing "testting case 90"
    (is (= (clj.stemmer/stemming "still") "still"))))

(deftest test-0091
  (testing "testting case 91"
    (is (= (clj.stemmer/stemming "technically") "technic"))))

(deftest test-0092
  (testing "testting case 92"
    (is (= (clj.stemmer/stemming "war") "war"))))

(deftest test-0093
  (testing "testting case 93"
    (is (= (clj.stemmer/stemming "since") "sinc"))))

(deftest test-0094
  (testing "testting case 94"
    (is (= (clj.stemmer/stemming "they") "thei"))))

(deftest test-0095
  (testing "testting case 95"
    (is (= (clj.stemmer/stemming "engaged") "engag"))))

(deftest test-0096
  (testing "testting case 96"
    (is (= (clj.stemmer/stemming "artillery") "artilleri"))))

(deftest test-0097
  (testing "testting case 97"
    (is (= (clj.stemmer/stemming "skirmish") "skirmish"))))

(deftest test-0098
  (testing "testting case 98"
    (is (= (clj.stemmer/stemming "three") "three"))))

(deftest test-0099
  (testing "testting case 99"
    (is (= (clj.stemmer/stemming "years") "year"))))

(deftest test-0100
  (testing "testting case 100"
    (is (= (clj.stemmer/stemming "ago") "ago"))))

(deftest test-0101
  (testing "testting case 101"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0102
  (testing "testting case 102"
    (is (= (clj.stemmer/stemming "verbal") "verbal"))))

(deftest test-0103
  (testing "testting case 103"
    (is (= (clj.stemmer/stemming "warfare") "warfar"))))

(deftest test-0104
  (testing "testting case 104"
    (is (= (clj.stemmer/stemming "represented") "repres"))))

(deftest test-0105
  (testing "testting case 105"
    (is (= (clj.stemmer/stemming "clash") "clash"))))

(deftest test-0106
  (testing "testting case 106"
    (is (= (clj.stemmer/stemming "nerves") "nerv"))))

(deftest test-0107
  (testing "testting case 107"
    (is (= (clj.stemmer/stemming "between") "between"))))

(deftest test-0108
  (testing "testting case 108"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0109
  (testing "testting case 109"
    (is (= (clj.stemmer/stemming "young") "young"))))

(deftest test-0110
  (testing "testting case 110"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0111
  (testing "testting case 111"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0112
  (testing "testting case 112"
    (is (= (clj.stemmer/stemming "leader") "leader"))))

(deftest test-0113
  (testing "testting case 113"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0114
  (testing "testting case 114"
    (is (= (clj.stemmer/stemming "building") "build"))))

(deftest test-0115
  (testing "testting case 115"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0116
  (testing "testting case 116"
    (is (= (clj.stemmer/stemming "credentials") "credenti"))))

(deftest test-0117
  (testing "testting case 117"
    (is (= (clj.stemmer/stemming "head") "head"))))

(deftest test-0118
  (testing "testting case 118"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0119
  (testing "testting case 119"
    (is (= (clj.stemmer/stemming "militaristic") "militarist"))))

(deftest test-0120
  (testing "testting case 120"
    (is (= (clj.stemmer/stemming "country") "countri"))))

(deftest test-0121
  (testing "testting case 121"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0122
  (testing "testting case 122"
    (is (= (clj.stemmer/stemming "park") "park"))))

(deftest test-0123
  (testing "testting case 123"
    (is (= (clj.stemmer/stemming "geun") "geun"))))

(deftest test-0124
  (testing "testting case 124"
    (is (= (clj.stemmer/stemming "hye") "hye"))))

(deftest test-0125
  (testing "testting case 125"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0126
  (testing "testting case 126"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0127
  (testing "testting case 127"
    (is (= (clj.stemmer/stemming "first") "first"))))

(deftest test-0128
  (testing "testting case 128"
    (is (= (clj.stemmer/stemming "female") "femal"))))

(deftest test-0129
  (testing "testting case 129"
    (is (= (clj.stemmer/stemming "president") "presid"))))

(deftest test-0130
  (testing "testting case 130"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0131
  (testing "testting case 131"
    (is (= (clj.stemmer/stemming "considers") "consid"))))

(deftest test-0132
  (testing "testting case 132"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0133
  (testing "testting case 133"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0134
  (testing "testting case 134"
    (is (= (clj.stemmer/stemming "british") "british"))))

(deftest test-0135
  (testing "testting case 135"
    (is (= (clj.stemmer/stemming "prime") "prime"))))

(deftest test-0136
  (testing "testting case 136"
    (is (= (clj.stemmer/stemming "minister") "minist"))))

(deftest test-0137
  (testing "testting case 137"
    (is (= (clj.stemmer/stemming "margaret") "margaret"))))

(deftest test-0138
  (testing "testting case 138"
    (is (= (clj.stemmer/stemming "thatcher") "thatcher"))))

(deftest test-0139
  (testing "testting case 139"
    (is (= (clj.stemmer/stemming "her") "her"))))

(deftest test-0140
  (testing "testting case 140"
    (is (= (clj.stemmer/stemming "role") "role"))))

(deftest test-0141
  (testing "testting case 141"
    (is (= (clj.stemmer/stemming "model") "model"))))

(deftest test-0142
  (testing "testting case 142"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0143
  (testing "testting case 143"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0144
  (testing "testting case 144"
    (is (= (clj.stemmer/stemming "stressed") "stress"))))

(deftest test-0145
  (testing "testting case 145"
    (is (= (clj.stemmer/stemming "security") "secur"))))

(deftest test-0146
  (testing "testting case 146"
    (is (= (clj.stemmer/stemming "her") "her"))))

(deftest test-0147
  (testing "testting case 147"
    (is (= (clj.stemmer/stemming "top") "top"))))

(deftest test-0148
  (testing "testting case 148"
    (is (= (clj.stemmer/stemming "priority") "prioriti"))))

(deftest test-0149
  (testing "testting case 149"
    (is (= (clj.stemmer/stemming "while") "while"))))

(deftest test-0150
  (testing "testting case 150"
    (is (= (clj.stemmer/stemming "weapons") "weapon"))))

(deftest test-0151
  (testing "testting case 151"
    (is (= (clj.stemmer/stemming "experts") "expert"))))

(deftest test-0152
  (testing "testting case 152"
    (is (= (clj.stemmer/stemming "say") "sai"))))

(deftest test-0153
  (testing "testting case 153"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0154
  (testing "testting case 154"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0155
  (testing "testting case 155"
    (is (= (clj.stemmer/stemming "does") "doe"))))

(deftest test-0156
  (testing "testting case 156"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0157
  (testing "testting case 157"
    (is (= (clj.stemmer/stemming "have") "have"))))

(deftest test-0158
  (testing "testting case 158"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0159
  (testing "testting case 159"
    (is (= (clj.stemmer/stemming "technical") "technic"))))

(deftest test-0160
  (testing "testting case 160"
    (is (= (clj.stemmer/stemming "capability") "capabl"))))

(deftest test-0161
  (testing "testting case 161"
    (is (= (clj.stemmer/stemming "use") "us"))))

(deftest test-0162
  (testing "testting case 162"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0163
  (testing "testting case 163"
    (is (= (clj.stemmer/stemming "tipped") "tip"))))

(deftest test-0164
  (testing "testting case 164"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0165
  (testing "testting case 165"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0166
  (testing "testting case 166"
    (is (= (clj.stemmer/stemming "did") "did"))))

(deftest test-0167
  (testing "testting case 167"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0168
  (testing "testting case 168"
    (is (= (clj.stemmer/stemming "stop") "stop"))))

(deftest test-0169
  (testing "testting case 169"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-0170
  (testing "testting case 170"
    (is (= (clj.stemmer/stemming "warning") "warn"))))

(deftest test-0171
  (testing "testting case 171"
    (is (= (clj.stemmer/stemming "their") "their"))))

(deftest test-0172
  (testing "testting case 172"
    (is (= (clj.stemmer/stemming "deployment") "deploy"))))

(deftest test-0173
  (testing "testting case 173"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0174
  (testing "testting case 174"
    (is (= (clj.stemmer/stemming "their") "their"))))

(deftest test-0175
  (testing "testting case 175"
    (is (= (clj.stemmer/stemming "targets") "target"))))

(deftest test-0176
  (testing "testting case 176"
    (is (= (clj.stemmer/stemming "set") "set"))))

(deftest test-0177
  (testing "testting case 177"
    (is (= (clj.stemmer/stemming "our") "our"))))

(deftest test-0178
  (testing "testting case 178"
    (is (= (clj.stemmer/stemming "intercontinental") "intercontinent"))))

(deftest test-0179
  (testing "testting case 179"
    (is (= (clj.stemmer/stemming "ballistic") "ballist"))))

(deftest test-0180
  (testing "testting case 180"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0181
  (testing "testting case 181"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0182
  (testing "testting case 182"
    (is (= (clj.stemmer/stemming "other") "other"))))

(deftest test-0183
  (testing "testting case 183"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0184
  (testing "testting case 184"
    (is (= (clj.stemmer/stemming "are") "ar"))))

(deftest test-0185
  (testing "testting case 185"
    (is (= (clj.stemmer/stemming "standby") "standbi"))))

(deftest test-0186
  (testing "testting case 186"
    (is (= (clj.stemmer/stemming "loaded") "load"))))

(deftest test-0187
  (testing "testting case 187"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0188
  (testing "testting case 188"
    (is (= (clj.stemmer/stemming "lighter") "lighter"))))

(deftest test-0189
  (testing "testting case 189"
    (is (= (clj.stemmer/stemming "smaller") "smaller"))))

(deftest test-0190
  (testing "testting case 190"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0191
  (testing "testting case 191"
    (is (= (clj.stemmer/stemming "diversified") "diversifi"))))

(deftest test-0192
  (testing "testting case 192"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0193
  (testing "testting case 193"
    (is (= (clj.stemmer/stemming "warheads") "warhead"))))

(deftest test-0194
  (testing "testting case 194"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0195
  (testing "testting case 195"
    (is (= (clj.stemmer/stemming "kang") "kang"))))

(deftest test-0196
  (testing "testting case 196"
    (is (= (clj.stemmer/stemming "pyo") "pyo"))))

(deftest test-0197
  (testing "testting case 197"
    (is (= (clj.stemmer/stemming "yong") "yong"))))

(deftest test-0198
  (testing "testting case 198"
    (is (= (clj.stemmer/stemming "three") "three"))))

(deftest test-0199
  (testing "testting case 199"
    (is (= (clj.stemmer/stemming "star") "star"))))

(deftest test-0200
  (testing "testting case 200"
    (is (= (clj.stemmer/stemming "general") "gener"))))

(deftest test-0201
  (testing "testting case 201"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0202
  (testing "testting case 202"
    (is (= (clj.stemmer/stemming "vice") "vice"))))

(deftest test-0203
  (testing "testting case 203"
    (is (= (clj.stemmer/stemming "defense") "defens"))))

(deftest test-0204
  (testing "testting case 204"
    (is (= (clj.stemmer/stemming "minister") "minist"))))

(deftest test-0205
  (testing "testting case 205"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0206
  (testing "testting case 206"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0207
  (testing "testting case 207"
    (is (= (clj.stemmer/stemming "push") "push"))))

(deftest test-0208
  (testing "testting case 208"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0209
  (testing "testting case 209"
    (is (= (clj.stemmer/stemming "button") "button"))))

(deftest test-0210
  (testing "testting case 210"
    (is (= (clj.stemmer/stemming "they") "thei"))))

(deftest test-0211
  (testing "testting case 211"
    (is (= (clj.stemmer/stemming "will") "will"))))

(deftest test-0212
  (testing "testting case 212"
    (is (= (clj.stemmer/stemming "blast") "blast"))))

(deftest test-0213
  (testing "testting case 213"
    (is (= (clj.stemmer/stemming "off") "off"))))

(deftest test-0214
  (testing "testting case 214"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0215
  (testing "testting case 215"
    (is (= (clj.stemmer/stemming "their") "their"))))

(deftest test-0216
  (testing "testting case 216"
    (is (= (clj.stemmer/stemming "barrage") "barrag"))))

(deftest test-0217
  (testing "testting case 217"
    (is (= (clj.stemmer/stemming "will") "will"))))

(deftest test-0218
  (testing "testting case 218"
    (is (= (clj.stemmer/stemming "turn") "turn"))))

(deftest test-0219
  (testing "testting case 219"
    (is (= (clj.stemmer/stemming "washington") "washington"))))

(deftest test-0220
  (testing "testting case 220"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0221
  (testing "testting case 221"
    (is (= (clj.stemmer/stemming "stronghold") "stronghold"))))

(deftest test-0222
  (testing "testting case 222"
    (is (= (clj.stemmer/stemming "american") "american"))))

(deftest test-0223
  (testing "testting case 223"
    (is (= (clj.stemmer/stemming "imperialists") "imperialist"))))

(deftest test-0224
  (testing "testting case 224"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0225
  (testing "testting case 225"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0226
  (testing "testting case 226"
    (is (= (clj.stemmer/stemming "nest") "nest"))))

(deftest test-0227
  (testing "testting case 227"
    (is (= (clj.stemmer/stemming "evil") "evil"))))

(deftest test-0228
  (testing "testting case 228"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0229
  (testing "testting case 229"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0230
  (testing "testting case 230"
    (is (= (clj.stemmer/stemming "followers") "follow"))))

(deftest test-0231
  (testing "testting case 231"
    (is (= (clj.stemmer/stemming "into") "into"))))

(deftest test-0232
  (testing "testting case 232"
    (is (= (clj.stemmer/stemming "sea") "sea"))))

(deftest test-0233
  (testing "testting case 233"
    (is (= (clj.stemmer/stemming "fire") "fire"))))

(deftest test-0234
  (testing "testting case 234"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0235
  (testing "testting case 235"
    (is (= (clj.stemmer/stemming "comment") "comment"))))

(deftest test-0236
  (testing "testting case 236"
    (is (= (clj.stemmer/stemming "made") "made"))))

(deftest test-0237
  (testing "testting case 237"
    (is (= (clj.stemmer/stemming "during") "dure"))))

(deftest test-0238
  (testing "testting case 238"
    (is (= (clj.stemmer/stemming "speech") "speech"))))

(deftest test-0239
  (testing "testting case 239"
    (is (= (clj.stemmer/stemming "before") "befor"))))

(deftest test-0240
  (testing "testting case 240"
    (is (= (clj.stemmer/stemming "mass") "mass"))))

(deftest test-0241
  (testing "testting case 241"
    (is (= (clj.stemmer/stemming "rally") "ralli"))))

(deftest test-0242
  (testing "testting case 242"
    (is (= (clj.stemmer/stemming "pyongyang") "pyongyang"))))

(deftest test-0243
  (testing "testting case 243"
    (is (= (clj.stemmer/stemming "thursday") "thursdai"))))

(deftest test-0244
  (testing "testting case 244"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0245
  (testing "testting case 245"
    (is (= (clj.stemmer/stemming "carried") "carri"))))

(deftest test-0246
  (testing "testting case 246"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0247
  (testing "testting case 247"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0248
  (testing "testting case 248"
    (is (= (clj.stemmer/stemming "main") "main"))))

(deftest test-0249
  (testing "testting case 249"
    (is (= (clj.stemmer/stemming "party") "parti"))))

(deftest test-0250
  (testing "testting case 250"
    (is (= (clj.stemmer/stemming "newspaper") "newspap"))))

(deftest test-0251
  (testing "testting case 251"
    (is (= (clj.stemmer/stemming "rodong") "rodong"))))

(deftest test-0252
  (testing "testting case 252"
    (is (= (clj.stemmer/stemming "sinmun") "sinmun"))))

(deftest test-0253
  (testing "testting case 253"
    (is (= (clj.stemmer/stemming "friday") "fridai"))))

(deftest test-0254
  (testing "testting case 254"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0255
  (testing "testting case 255"
    (is (= (clj.stemmer/stemming "last") "last"))))

(deftest test-0256
  (testing "testting case 256"
    (is (= (clj.stemmer/stemming "few") "few"))))

(deftest test-0257
  (testing "testting case 257"
    (is (= (clj.stemmer/stemming "days") "dai"))))

(deftest test-0258
  (testing "testting case 258"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0259
  (testing "testting case 259"
    (is (= (clj.stemmer/stemming "state") "state"))))

(deftest test-0260
  (testing "testting case 260"
    (is (= (clj.stemmer/stemming "run") "run"))))

(deftest test-0261
  (testing "testting case 261"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0262
  (testing "testting case 262"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0263
  (testing "testting case 263"
    (is (= (clj.stemmer/stemming "media") "media"))))

(deftest test-0264
  (testing "testting case 264"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0265
  (testing "testting case 265"
    (is (= (clj.stemmer/stemming "carried") "carri"))))

(deftest test-0266
  (testing "testting case 266"
    (is (= (clj.stemmer/stemming "slew") "slew"))))

(deftest test-0267
  (testing "testting case 267"
    (is (= (clj.stemmer/stemming "official") "offici"))))

(deftest test-0268
  (testing "testting case 268"
    (is (= (clj.stemmer/stemming "remarks") "remark"))))

(deftest test-0269
  (testing "testting case 269"
    (is (= (clj.stemmer/stemming "threatening") "threaten"))))

(deftest test-0270
  (testing "testting case 270"
    (is (= (clj.stemmer/stemming "launch") "launch"))))

(deftest test-0271
  (testing "testting case 271"
    (is (= (clj.stemmer/stemming "pre") "pre"))))

(deftest test-0272
  (testing "testting case 272"
    (is (= (clj.stemmer/stemming "emptive") "emptiv"))))

(deftest test-0273
  (testing "testting case 273"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0274
  (testing "testting case 274"
    (is (= (clj.stemmer/stemming "strikes") "strike"))))

(deftest test-0275
  (testing "testting case 275"
    (is (= (clj.stemmer/stemming "washington") "washington"))))

(deftest test-0276
  (testing "testting case 276"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0277
  (testing "testting case 277"
    (is (= (clj.stemmer/stemming "seoul") "seoul"))))

(deftest test-0278
  (testing "testting case 278"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0279
  (testing "testting case 279"
    (is (= (clj.stemmer/stemming "lighter") "lighter"))))

(deftest test-0280
  (testing "testting case 280"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0281
  (testing "testting case 281"
    (is (= (clj.stemmer/stemming "smaller") "smaller"))))

(deftest test-0282
  (testing "testting case 282"
    (is (= (clj.stemmer/stemming "nukes") "nuke"))))

(deftest test-0283
  (testing "testting case 283"
    (is (= (clj.stemmer/stemming "hinting") "hint"))))

(deftest test-0284
  (testing "testting case 284"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0285
  (testing "testting case 285"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0286
  (testing "testting case 286"
    (is (= (clj.stemmer/stemming "built") "built"))))

(deftest test-0287
  (testing "testting case 287"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0288
  (testing "testting case 288"
    (is (= (clj.stemmer/stemming "warheads") "warhead"))))

(deftest test-0289
  (testing "testting case 289"
    (is (= (clj.stemmer/stemming "small") "small"))))

(deftest test-0290
  (testing "testting case 290"
    (is (= (clj.stemmer/stemming "enough") "enough"))))

(deftest test-0291
  (testing "testting case 291"
    (is (= (clj.stemmer/stemming "mount") "mount"))))

(deftest test-0292
  (testing "testting case 292"
    (is (= (clj.stemmer/stemming "long") "long"))))

(deftest test-0293
  (testing "testting case 293"
    (is (= (clj.stemmer/stemming "range") "rang"))))

(deftest test-0294
  (testing "testting case 294"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0295
  (testing "testting case 295"
    (is (= (clj.stemmer/stemming "but") "but"))))

(deftest test-0296
  (testing "testting case 296"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0297
  (testing "testting case 297"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0298
  (testing "testting case 298"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0299
  (testing "testting case 299"
    (is (= (clj.stemmer/stemming "officials") "offici"))))

(deftest test-0300
  (testing "testting case 300"
    (is (= (clj.stemmer/stemming "strongly") "strongli"))))

(deftest test-0301
  (testing "testting case 301"
    (is (= (clj.stemmer/stemming "doubt") "doubt"))))

(deftest test-0302
  (testing "testting case 302"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0303
  (testing "testting case 303"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0304
  (testing "testting case 304"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0305
  (testing "testting case 305"
    (is (= (clj.stemmer/stemming "mastered") "master"))))

(deftest test-0306
  (testing "testting case 306"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0307
  (testing "testting case 307"
    (is (= (clj.stemmer/stemming "technology") "technolog"))))

(deftest test-0308
  (testing "testting case 308"
    (is (= (clj.stemmer/stemming "despite") "despit"))))

(deftest test-0309
  (testing "testting case 309"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0310
  (testing "testting case 310"
    (is (= (clj.stemmer/stemming "successful") "success"))))

(deftest test-0311
  (testing "testting case 311"
    (is (= (clj.stemmer/stemming "launching") "launch"))))

(deftest test-0312
  (testing "testting case 312"
    (is (= (clj.stemmer/stemming "long") "long"))))

(deftest test-0313
  (testing "testting case 313"
    (is (= (clj.stemmer/stemming "range") "rang"))))

(deftest test-0314
  (testing "testting case 314"
    (is (= (clj.stemmer/stemming "rocket") "rocket"))))

(deftest test-0315
  (testing "testting case 315"
    (is (= (clj.stemmer/stemming "december") "decemb"))))

(deftest test-0316
  (testing "testting case 316"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0317
  (testing "testting case 317"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0318
  (testing "testting case 318"
    (is (= (clj.stemmer/stemming "third") "third"))))

(deftest test-0319
  (testing "testting case 319"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0320
  (testing "testting case 320"
    (is (= (clj.stemmer/stemming "test") "test"))))

(deftest test-0321
  (testing "testting case 321"
    (is (= (clj.stemmer/stemming "last") "last"))))

(deftest test-0322
  (testing "testting case 322"
    (is (= (clj.stemmer/stemming "month") "month"))))

(deftest test-0323
  (testing "testting case 323"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0324
  (testing "testting case 324"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0325
  (testing "testting case 325"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0326
  (testing "testting case 326"
    (is (= (clj.stemmer/stemming "officials") "offici"))))

(deftest test-0327
  (testing "testting case 327"
    (is (= (clj.stemmer/stemming "called") "call"))))

(deftest test-0328
  (testing "testting case 328"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0329
  (testing "testting case 329"
    (is (= (clj.stemmer/stemming "remarks") "remark"))))

(deftest test-0330
  (testing "testting case 330"
    (is (= (clj.stemmer/stemming "bluster") "bluster"))))

(deftest test-0331
  (testing "testting case 331"
    (is (= (clj.stemmer/stemming "designed") "design"))))

(deftest test-0332
  (testing "testting case 332"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0333
  (testing "testting case 333"
    (is (= (clj.stemmer/stemming "much") "much"))))

(deftest test-0334
  (testing "testting case 334"
    (is (= (clj.stemmer/stemming "threaten") "threaten"))))

(deftest test-0335
  (testing "testting case 335"
    (is (= (clj.stemmer/stemming "washington") "washington"))))

(deftest test-0336
  (testing "testting case 336"
    (is (= (clj.stemmer/stemming "infuse") "infus"))))

(deftest test-0337
  (testing "testting case 337"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0338
  (testing "testting case 338"
    (is (= (clj.stemmer/stemming "population") "popul"))))

(deftest test-0339
  (testing "testting case 339"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0340
  (testing "testting case 340"
    (is (= (clj.stemmer/stemming "sense") "sens"))))

(deftest test-0341
  (testing "testting case 341"
    (is (= (clj.stemmer/stemming "both") "both"))))

(deftest test-0342
  (testing "testting case 342"
    (is (= (clj.stemmer/stemming "crisis") "crisi"))))

(deftest test-0343
  (testing "testting case 343"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0344
  (testing "testting case 344"
    (is (= (clj.stemmer/stemming "empowerment") "empower"))))

(deftest test-0345
  (testing "testting case 345"
    (is (= (clj.stemmer/stemming "kim") "kim"))))

(deftest test-0346
  (testing "testting case 346"
    (is (= (clj.stemmer/stemming "jong") "jong"))))

(deftest test-0347
  (testing "testting case 347"
    (is (= (clj.stemmer/stemming "consolidates") "consolid"))))

(deftest test-0348
  (testing "testting case 348"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0349
  (testing "testting case 349"
    (is (= (clj.stemmer/stemming "grip") "grip"))))

(deftest test-0350
  (testing "testting case 350"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0351
  (testing "testting case 351"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0352
  (testing "testting case 352"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0353
  (testing "testting case 353"
    (is (= (clj.stemmer/stemming "front") "front"))))

(deftest test-0354
  (testing "testting case 354"
    (is (= (clj.stemmer/stemming "page") "page"))))

(deftest test-0355
  (testing "testting case 355"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0356
  (testing "testting case 356"
    (is (= (clj.stemmer/stemming "rodong") "rodong"))))

(deftest test-0357
  (testing "testting case 357"
    (is (= (clj.stemmer/stemming "newspaper") "newspap"))))

(deftest test-0358
  (testing "testting case 358"
    (is (= (clj.stemmer/stemming "carried") "carri"))))

(deftest test-0359
  (testing "testting case 359"
    (is (= (clj.stemmer/stemming "large") "larg"))))

(deftest test-0360
  (testing "testting case 360"
    (is (= (clj.stemmer/stemming "picture") "pictur"))))

(deftest test-0361
  (testing "testting case 361"
    (is (= (clj.stemmer/stemming "showing") "show"))))

(deftest test-0362
  (testing "testting case 362"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0363
  (testing "testting case 363"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0364
  (testing "testting case 364"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0365
  (testing "testting case 365"
    (is (= (clj.stemmer/stemming "generation") "gener"))))

(deftest test-0366
  (testing "testting case 366"
    (is (= (clj.stemmer/stemming "mobile") "mobil"))))

(deftest test-0367
  (testing "testting case 367"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-0368
  (testing "testting case 368"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0369
  (testing "testting case 369"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0370
  (testing "testting case 370"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0371
  (testing "testting case 371"
    (is (= (clj.stemmer/stemming "leader") "leader"))))

(deftest test-0372
  (testing "testting case 372"
    (is (= (clj.stemmer/stemming "warned") "warn"))))

(deftest test-0373
  (testing "testting case 373"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0374
  (testing "testting case 374"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0375
  (testing "testting case 375"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0376
  (testing "testting case 376"
    (is (= (clj.stemmer/stemming "behavior") "behavior"))))

(deftest test-0377
  (testing "testting case 377"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0378
  (testing "testting case 378"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0379
  (testing "testting case 379"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0380
  (testing "testting case 380"
    (is (= (clj.stemmer/stemming "only") "onli"))))

(deftest test-0381
  (testing "testting case 381"
    (is (= (clj.stemmer/stemming "hurting") "hurt"))))

(deftest test-0382
  (testing "testting case 382"
    (is (= (clj.stemmer/stemming "itself") "itself"))))

(deftest test-0383
  (testing "testting case 383"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0384
  (testing "testting case 384"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0385
  (testing "testting case 385"
    (is (= (clj.stemmer/stemming "will") "will"))))

(deftest test-0386
  (testing "testting case 386"
    (is (= (clj.stemmer/stemming "collapse") "collaps"))))

(deftest test-0387
  (testing "testting case 387"
    (is (= (clj.stemmer/stemming "self") "self"))))

(deftest test-0388
  (testing "testting case 388"
    (is (= (clj.stemmer/stemming "destruction") "destruct"))))

(deftest test-0389
  (testing "testting case 389"
    (is (= (clj.stemmer/stemming "continue") "continu"))))

(deftest test-0390
  (testing "testting case 390"
    (is (= (clj.stemmer/stemming "waste") "wast"))))

(deftest test-0391
  (testing "testting case 391"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0392
  (testing "testting case 392"
    (is (= (clj.stemmer/stemming "resources") "resourc"))))

(deftest test-0393
  (testing "testting case 393"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0394
  (testing "testting case 394"
    (is (= (clj.stemmer/stemming "weapons") "weapon"))))

(deftest test-0395
  (testing "testting case 395"
    (is (= (clj.stemmer/stemming "development") "develop"))))

(deftest test-0396
  (testing "testting case 396"
    (is (= (clj.stemmer/stemming "while") "while"))))

(deftest test-0397
  (testing "testting case 397"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0398
  (testing "testting case 398"
    (is (= (clj.stemmer/stemming "people") "peopl"))))

(deftest test-0399
  (testing "testting case 399"
    (is (= (clj.stemmer/stemming "are") "ar"))))

(deftest test-0400
  (testing "testting case 400"
    (is (= (clj.stemmer/stemming "going") "go"))))

(deftest test-0401
  (testing "testting case 401"
    (is (= (clj.stemmer/stemming "hungry") "hungri"))))

(deftest test-0402
  (testing "testting case 402"
    (is (= (clj.stemmer/stemming "president") "presid"))))

(deftest test-0403
  (testing "testting case 403"
    (is (= (clj.stemmer/stemming "park") "park"))))

(deftest test-0404
  (testing "testting case 404"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0405
  (testing "testting case 405"
    (is (= (clj.stemmer/stemming "during") "dure"))))

(deftest test-0406
  (testing "testting case 406"
    (is (= (clj.stemmer/stemming "commission") "commiss"))))

(deftest test-0407
  (testing "testting case 407"
    (is (= (clj.stemmer/stemming "ceremony") "ceremoni"))))

(deftest test-0408
  (testing "testting case 408"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-0409
  (testing "testting case 409"
    (is (= (clj.stemmer/stemming "young") "young"))))

(deftest test-0410
  (testing "testting case 410"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0411
  (testing "testting case 411"
    (is (= (clj.stemmer/stemming "officers") "offic"))))

(deftest test-0412
  (testing "testting case 412"
    (is (= (clj.stemmer/stemming "friday") "fridai"))))

(deftest test-0413
  (testing "testting case 413"
    (is (= (clj.stemmer/stemming "she") "she"))))

(deftest test-0414
  (testing "testting case 414"
    (is (= (clj.stemmer/stemming "promised") "promis"))))

(deftest test-0415
  (testing "testting case 415"
    (is (= (clj.stemmer/stemming "strong") "strong"))))

(deftest test-0416
  (testing "testting case 416"
    (is (= (clj.stemmer/stemming "response") "respons"))))

(deftest test-0417
  (testing "testting case 417"
    (is (= (clj.stemmer/stemming "provocation") "provoc"))))

(deftest test-0418
  (testing "testting case 418"
    (is (= (clj.stemmer/stemming "but") "but"))))

(deftest test-0419
  (testing "testting case 419"
    (is (= (clj.stemmer/stemming "also") "also"))))

(deftest test-0420
  (testing "testting case 420"
    (is (= (clj.stemmer/stemming "offered") "offer"))))

(deftest test-0421
  (testing "testting case 421"
    (is (= (clj.stemmer/stemming "cooperative") "cooper"))))

(deftest test-0422
  (testing "testting case 422"
    (is (= (clj.stemmer/stemming "future") "futur"))))

(deftest test-0423
  (testing "testting case 423"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0424
  (testing "testting case 424"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0425
  (testing "testting case 425"
    (is (= (clj.stemmer/stemming "changed") "chang"))))

(deftest test-0426
  (testing "testting case 426"
    (is (= (clj.stemmer/stemming "also") "also"))))

(deftest test-0427
  (testing "testting case 427"
    (is (= (clj.stemmer/stemming "friday") "fridai"))))

(deftest test-0428
  (testing "testting case 428"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0429
  (testing "testting case 429"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0430
  (testing "testting case 430"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0431
  (testing "testting case 431"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0432
  (testing "testting case 432"
    (is (= (clj.stemmer/stemming "nullifying") "nullifi"))))

(deftest test-0433
  (testing "testting case 433"
    (is (= (clj.stemmer/stemming "all") "all"))))

(deftest test-0434
  (testing "testting case 434"
    (is (= (clj.stemmer/stemming "agreements") "agreement"))))

(deftest test-0435
  (testing "testting case 435"
    (is (= (clj.stemmer/stemming "nonaggression") "nonaggress"))))

(deftest test-0436
  (testing "testting case 436"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0437
  (testing "testting case 437"
    (is (= (clj.stemmer/stemming "denuclearization") "denuclear"))))

(deftest test-0438
  (testing "testting case 438"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0439
  (testing "testting case 439"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0440
  (testing "testting case 440"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0441
  (testing "testting case 441"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0442
  (testing "testting case 442"
    (is (= (clj.stemmer/stemming "cutting") "cut"))))

(deftest test-0443
  (testing "testting case 443"
    (is (= (clj.stemmer/stemming "off") "off"))))

(deftest test-0444
  (testing "testting case 444"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0445
  (testing "testting case 445"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0446
  (testing "testting case 446"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0447
  (testing "testting case 447"
    (is (= (clj.stemmer/stemming "hot") "hot"))))

(deftest test-0448
  (testing "testting case 448"
    (is (= (clj.stemmer/stemming "line") "line"))))

(deftest test-0449
  (testing "testting case 449"
    (is (= (clj.stemmer/stemming "retaliation") "retali"))))

(deftest test-0450
  (testing "testting case 450"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-0451
  (testing "testting case 451"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0452
  (testing "testting case 452"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0453
  (testing "testting case 453"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0454
  (testing "testting case 454"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0455
  (testing "testting case 455"
    (is (= (clj.stemmer/stemming "joint") "joint"))))

(deftest test-0456
  (testing "testting case 456"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0457
  (testing "testting case 457"
    (is (= (clj.stemmer/stemming "exercises") "exercis"))))

(deftest test-0458
  (testing "testting case 458"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0459
  (testing "testting case 459"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0460
  (testing "testting case 460"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0461
  (testing "testting case 461"
    (is (= (clj.stemmer/stemming "staging") "stage"))))

(deftest test-0462
  (testing "testting case 462"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0463
  (testing "testting case 463"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0464
  (testing "testting case 464"
    (is (= (clj.stemmer/stemming "united") "unit"))))

(deftest test-0465
  (testing "testting case 465"
    (is (= (clj.stemmer/stemming "states") "state"))))

(deftest test-0466
  (testing "testting case 466"
    (is (= (clj.stemmer/stemming "but") "but"))))

(deftest test-0467
  (testing "testting case 467"
    (is (= (clj.stemmer/stemming "beyond") "beyond"))))

(deftest test-0468
  (testing "testting case 468"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0469
  (testing "testting case 469"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0470
  (testing "testting case 470"
    (is (= (clj.stemmer/stemming "belligerent") "belliger"))))

(deftest test-0471
  (testing "testting case 471"
    (is (= (clj.stemmer/stemming "statements") "statement"))))

(deftest test-0472
  (testing "testting case 472"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0473
  (testing "testting case 473"
    (is (= (clj.stemmer/stemming "unclear") "unclear"))))

(deftest test-0474
  (testing "testting case 474"
    (is (= (clj.stemmer/stemming "how") "how"))))

(deftest test-0475
  (testing "testting case 475"
    (is (= (clj.stemmer/stemming "all") "all"))))

(deftest test-0476
  (testing "testting case 476"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0477
  (testing "testting case 477"
    (is (= (clj.stemmer/stemming "country") "countri"))))

(deftest test-0478
  (testing "testting case 478"
    (is (= (clj.stemmer/stemming "young") "young"))))

(deftest test-0479
  (testing "testting case 479"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0480
  (testing "testting case 480"
    (is (= (clj.stemmer/stemming "untested") "untest"))))

(deftest test-0481
  (testing "testting case 481"
    (is (= (clj.stemmer/stemming "leader") "leader"))))

(deftest test-0482
  (testing "testting case 482"
    (is (= (clj.stemmer/stemming "would") "would"))))

(deftest test-0483
  (testing "testting case 483"
    (is (= (clj.stemmer/stemming "react") "react"))))

(deftest test-0484
  (testing "testting case 484"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0485
  (testing "testting case 485"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0486
  (testing "testting case 486"
    (is (= (clj.stemmer/stemming "any") "ani"))))

(deftest test-0487
  (testing "testting case 487"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0488
  (testing "testting case 488"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0489
  (testing "testting case 489"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0490
  (testing "testting case 490"
    (is (= (clj.stemmer/stemming "action") "action"))))

(deftest test-0491
  (testing "testting case 491"
    (is (= (clj.stemmer/stemming "could") "could"))))

(deftest test-0492
  (testing "testting case 492"
    (is (= (clj.stemmer/stemming "end") "end"))))

(deftest test-0493
  (testing "testting case 493"
    (is (= (clj.stemmer/stemming "involving") "involv"))))

(deftest test-0494
  (testing "testting case 494"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0495
  (testing "testting case 495"
    (is (= (clj.stemmer/stemming "american") "american"))))

(deftest test-0496
  (testing "testting case 496"
    (is (= (clj.stemmer/stemming "forces") "forc"))))

(deftest test-0497
  (testing "testting case 497"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0498
  (testing "testting case 498"
    (is (= (clj.stemmer/stemming "have") "have"))))

(deftest test-0499
  (testing "testting case 499"
    (is (= (clj.stemmer/stemming "remained") "remain"))))

(deftest test-0500
  (testing "testting case 500"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0501
  (testing "testting case 501"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0502
  (testing "testting case 502"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0503
  (testing "testting case 503"
    (is (= (clj.stemmer/stemming "turned") "turn"))))

(deftest test-0504
  (testing "testting case 504"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-0505
  (testing "testting case 505"
    (is (= (clj.stemmer/stemming "war") "war"))))

(deftest test-0506
  (testing "testting case 506"
    (is (= (clj.stemmer/stemming "ravaged") "ravag"))))

(deftest test-0507
  (testing "testting case 507"
    (is (= (clj.stemmer/stemming "ruin") "ruin"))))

(deftest test-0508
  (testing "testting case 508"
    (is (= (clj.stemmer/stemming "into") "into"))))

(deftest test-0509
  (testing "testting case 509"
    (is (= (clj.stemmer/stemming "one") "on"))))

(deftest test-0510
  (testing "testting case 510"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0511
  (testing "testting case 511"
    (is (= (clj.stemmer/stemming "most") "most"))))

(deftest test-0512
  (testing "testting case 512"
    (is (= (clj.stemmer/stemming "advanced") "advanc"))))

(deftest test-0513
  (testing "testting case 513"
    (is (= (clj.stemmer/stemming "industrialized") "industri"))))

(deftest test-0514
  (testing "testting case 514"
    (is (= (clj.stemmer/stemming "powerhouses") "powerhous"))))

(deftest test-0515
  (testing "testting case 515"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0516
  (testing "testting case 516"
    (is (= (clj.stemmer/stemming "security") "secur"))))

(deftest test-0517
  (testing "testting case 517"
    (is (= (clj.stemmer/stemming "council") "council"))))

(deftest test-0518
  (testing "testting case 518"
    (is (= (clj.stemmer/stemming "vote") "vote"))))

(deftest test-0519
  (testing "testting case 519"
    (is (= (clj.stemmer/stemming "places") "place"))))

(deftest test-0520
  (testing "testting case 520"
    (is (= (clj.stemmer/stemming "potentially") "potenti"))))

(deftest test-0521
  (testing "testting case 521"
    (is (= (clj.stemmer/stemming "painful") "pain"))))

(deftest test-0522
  (testing "testting case 522"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0523
  (testing "testting case 523"
    (is (= (clj.stemmer/stemming "constraints") "constraint"))))

(deftest test-0524
  (testing "testting case 524"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0525
  (testing "testting case 525"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0526
  (testing "testting case 526"
    (is (= (clj.stemmer/stemming "banking") "bank"))))

(deftest test-0527
  (testing "testting case 527"
    (is (= (clj.stemmer/stemming "trade") "trade"))))

(deftest test-0528
  (testing "testting case 528"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0529
  (testing "testting case 529"
    (is (= (clj.stemmer/stemming "travel") "travel"))))

(deftest test-0530
  (testing "testting case 530"
    (is (= (clj.stemmer/stemming "pressures") "pressur"))))

(deftest test-0531
  (testing "testting case 531"
    (is (= (clj.stemmer/stemming "countries") "countri"))))

(deftest test-0532
  (testing "testting case 532"
    (is (= (clj.stemmer/stemming "search") "search"))))

(deftest test-0533
  (testing "testting case 533"
    (is (= (clj.stemmer/stemming "suspect") "suspect"))))

(deftest test-0534
  (testing "testting case 534"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0535
  (testing "testting case 535"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0536
  (testing "testting case 536"
    (is (= (clj.stemmer/stemming "cargo") "cargo"))))

(deftest test-0537
  (testing "testting case 537"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0538
  (testing "testting case 538"
    (is (= (clj.stemmer/stemming "includes") "includ"))))

(deftest test-0539
  (testing "testting case 539"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0540
  (testing "testting case 540"
    (is (= (clj.stemmer/stemming "enforcement") "enforc"))))

(deftest test-0541
  (testing "testting case 541"
    (is (= (clj.stemmer/stemming "language") "languag"))))

(deftest test-0542
  (testing "testting case 542"
    (is (= (clj.stemmer/stemming "absent") "absent"))))

(deftest test-0543
  (testing "testting case 543"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-0544
  (testing "testting case 544"
    (is (= (clj.stemmer/stemming "previous") "previou"))))

(deftest test-0545
  (testing "testting case 545"
    (is (= (clj.stemmer/stemming "measures") "measur"))))

(deftest test-0546
  (testing "testting case 546"
    (is (= (clj.stemmer/stemming "but") "but"))))

(deftest test-0547
  (testing "testting case 547"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0548
  (testing "testting case 548"
    (is (= (clj.stemmer/stemming "provisions") "provis"))))

(deftest test-0549
  (testing "testting case 549"
    (is (= (clj.stemmer/stemming "are") "ar"))))

(deftest test-0550
  (testing "testting case 550"
    (is (= (clj.stemmer/stemming "some") "some"))))

(deftest test-0551
  (testing "testting case 551"
    (is (= (clj.stemmer/stemming "ways") "wai"))))

(deftest test-0552
  (testing "testting case 552"
    (is (= (clj.stemmer/stemming "less") "less"))))

(deftest test-0553
  (testing "testting case 553"
    (is (= (clj.stemmer/stemming "important") "import"))))

(deftest test-0554
  (testing "testting case 554"
    (is (= (clj.stemmer/stemming "than") "than"))))

(deftest test-0555
  (testing "testting case 555"
    (is (= (clj.stemmer/stemming "china") "china"))))

(deftest test-0556
  (testing "testting case 556"
    (is (= (clj.stemmer/stemming "participation") "particip"))))

(deftest test-0557
  (testing "testting case 557"
    (is (= (clj.stemmer/stemming "writing") "write"))))

(deftest test-0558
  (testing "testting case 558"
    (is (= (clj.stemmer/stemming "them") "them"))))

(deftest test-0559
  (testing "testting case 559"
    (is (= (clj.stemmer/stemming "suggesting") "suggest"))))

(deftest test-0560
  (testing "testting case 560"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0561
  (testing "testting case 561"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0562
  (testing "testting case 562"
    (is (= (clj.stemmer/stemming "country") "countri"))))

(deftest test-0563
  (testing "testting case 563"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0564
  (testing "testting case 564"
    (is (= (clj.stemmer/stemming "lost") "lost"))))

(deftest test-0565
  (testing "testting case 565"
    (is (= (clj.stemmer/stemming "patience") "patienc"))))

(deftest test-0566
  (testing "testting case 566"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0567
  (testing "testting case 567"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0568
  (testing "testting case 568"
    (is (= (clj.stemmer/stemming "neighbor") "neighbor"))))

(deftest test-0569
  (testing "testting case 569"
    (is (= (clj.stemmer/stemming "supported") "support"))))

(deftest test-0570
  (testing "testting case 570"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0571
  (testing "testting case 571"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0572
  (testing "testting case 572"
    (is (= (clj.stemmer/stemming "war") "war"))))

(deftest test-0573
  (testing "testting case 573"
    (is (= (clj.stemmer/stemming "while") "while"))))

(deftest test-0574
  (testing "testting case 574"
    (is (= (clj.stemmer/stemming "china") "china"))))

(deftest test-0575
  (testing "testting case 575"
    (is (= (clj.stemmer/stemming "enforcement") "enforc"))))

(deftest test-0576
  (testing "testting case 576"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0577
  (testing "testting case 577"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0578
  (testing "testting case 578"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0579
  (testing "testting case 579"
    (is (= (clj.stemmer/stemming "remains") "remain"))))

(deftest test-0580
  (testing "testting case 580"
    (is (= (clj.stemmer/stemming "seen") "seen"))))

(deftest test-0581
  (testing "testting case 581"
    (is (= (clj.stemmer/stemming "may") "mai"))))

(deftest test-0582
  (testing "testting case 582"
    (is (= (clj.stemmer/stemming "now") "now"))))

(deftest test-0583
  (testing "testting case 583"
    (is (= (clj.stemmer/stemming "more") "more"))))

(deftest test-0584
  (testing "testting case 584"
    (is (= (clj.stemmer/stemming "assertive") "assert"))))

(deftest test-0585
  (testing "testting case 585"
    (is (= (clj.stemmer/stemming "this") "thi"))))

(deftest test-0586
  (testing "testting case 586"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0587
  (testing "testting case 587"
    (is (= (clj.stemmer/stemming "about") "about"))))

(deftest test-0588
  (testing "testting case 588"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0589
  (testing "testting case 589"
    (is (= (clj.stemmer/stemming "words") "word"))))

(deftest test-0590
  (testing "testting case 590"
    (is (= (clj.stemmer/stemming "about") "about"))))

(deftest test-0591
  (testing "testting case 591"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0592
  (testing "testting case 592"
    (is (= (clj.stemmer/stemming "music") "music"))))

(deftest test-0593
  (testing "testting case 593"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0594
  (testing "testting case 594"
    (is (= (clj.stemmer/stemming "christopher") "christoph"))))

(deftest test-0595
  (testing "testting case 595"
    (is (= (clj.stemmer/stemming "hill") "hill"))))

(deftest test-0596
  (testing "testting case 596"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0597
  (testing "testting case 597"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0598
  (testing "testting case 598"
    (is (= (clj.stemmer/stemming "american") "american"))))

(deftest test-0599
  (testing "testting case 599"
    (is (= (clj.stemmer/stemming "diplomat") "diplomat"))))

(deftest test-0600
  (testing "testting case 600"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0601
  (testing "testting case 601"
    (is (= (clj.stemmer/stemming "negotiated") "negoti"))))

(deftest test-0602
  (testing "testting case 602"
    (is (= (clj.stemmer/stemming "deal") "deal"))))

(deftest test-0603
  (testing "testting case 603"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0604
  (testing "testting case 604"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0605
  (testing "testting case 605"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0606
  (testing "testting case 606"
    (is (= (clj.stemmer/stemming "during") "dure"))))

(deftest test-0607
  (testing "testting case 607"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0608
  (testing "testting case 608"
    (is (= (clj.stemmer/stemming "george") "georg"))))

(deftest test-0609
  (testing "testting case 609"
    (is (= (clj.stemmer/stemming "bush") "bush"))))

(deftest test-0610
  (testing "testting case 610"
    (is (= (clj.stemmer/stemming "administration") "administr"))))

(deftest test-0611
  (testing "testting case 611"
    (is (= (clj.stemmer/stemming "dismantle") "dismantl"))))

(deftest test-0612
  (testing "testting case 612"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0613
  (testing "testting case 613"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0614
  (testing "testting case 614"
    (is (= (clj.stemmer/stemming "facilities") "facil"))))

(deftest test-0615
  (testing "testting case 615"
    (is (= (clj.stemmer/stemming "accord") "accord"))))

(deftest test-0616
  (testing "testting case 616"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0617
  (testing "testting case 617"
    (is (= (clj.stemmer/stemming "quickly") "quickli"))))

(deftest test-0618
  (testing "testting case 618"
    (is (= (clj.stemmer/stemming "collapsed") "collaps"))))

(deftest test-0619
  (testing "testting case 619"
    (is (= (clj.stemmer/stemming "china") "china"))))

(deftest test-0620
  (testing "testting case 620"
    (is (= (clj.stemmer/stemming "cosponsorship") "cosponsorship"))))

(deftest test-0621
  (testing "testting case 621"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0622
  (testing "testting case 622"
    (is (= (clj.stemmer/stemming "resolution") "resolut"))))

(deftest test-0623
  (testing "testting case 623"
    (is (= (clj.stemmer/stemming "suggests") "suggest"))))

(deftest test-0624
  (testing "testting case 624"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0625
  (testing "testting case 625"
    (is (= (clj.stemmer/stemming "after") "after"))))

(deftest test-0626
  (testing "testting case 626"
    (is (= (clj.stemmer/stemming "many") "mani"))))

(deftest test-0627
  (testing "testting case 627"
    (is (= (clj.stemmer/stemming "years") "year"))))

(deftest test-0628
  (testing "testting case 628"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0629
  (testing "testting case 629"
    (is (= (clj.stemmer/stemming "screws") "screw"))))

(deftest test-0630
  (testing "testting case 630"
    (is (= (clj.stemmer/stemming "are") "ar"))))

(deftest test-0631
  (testing "testting case 631"
    (is (= (clj.stemmer/stemming "beginning") "begin"))))

(deftest test-0632
  (testing "testting case 632"
    (is (= (clj.stemmer/stemming "turn") "turn"))))

(deftest test-0633
  (testing "testting case 633"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0634
  (testing "testting case 634"
    (is (= (clj.stemmer/stemming "hill") "hill"))))

(deftest test-0635
  (testing "testting case 635"
    (is (= (clj.stemmer/stemming "now") "now"))))

(deftest test-0636
  (testing "testting case 636"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0637
  (testing "testting case 637"
    (is (= (clj.stemmer/stemming "dean") "dean"))))

(deftest test-0638
  (testing "testting case 638"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0639
  (testing "testting case 639"
    (is (= (clj.stemmer/stemming "josef") "josef"))))

(deftest test-0640
  (testing "testting case 640"
    (is (= (clj.stemmer/stemming "korbel") "korbel"))))

(deftest test-0641
  (testing "testting case 641"
    (is (= (clj.stemmer/stemming "school") "school"))))

(deftest test-0642
  (testing "testting case 642"
    (is (= (clj.stemmer/stemming "international") "intern"))))

(deftest test-0643
  (testing "testting case 643"
    (is (= (clj.stemmer/stemming "studies") "studi"))))

(deftest test-0644
  (testing "testting case 644"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0645
  (testing "testting case 645"
    (is (= (clj.stemmer/stemming "university") "univers"))))

(deftest test-0646
  (testing "testting case 646"
    (is (= (clj.stemmer/stemming "denver") "denver"))))

(deftest test-0647
  (testing "testting case 647"
    (is (= (clj.stemmer/stemming "still") "still"))))

(deftest test-0648
  (testing "testting case 648"
    (is (= (clj.stemmer/stemming "another") "anoth"))))

(deftest test-0649
  (testing "testting case 649"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0650
  (testing "testting case 650"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0651
  (testing "testting case 651"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0652
  (testing "testting case 652"
    (is (= (clj.stemmer/stemming "test") "test"))))

(deftest test-0653
  (testing "testting case 653"
    (is (= (clj.stemmer/stemming "possible") "possibl"))))

(deftest test-0654
  (testing "testting case 654"
    (is (= (clj.stemmer/stemming "another") "anoth"))))

(deftest test-0655
  (testing "testting case 655"
    (is (= (clj.stemmer/stemming "ballistic") "ballist"))))

(deftest test-0656
  (testing "testting case 656"
    (is (= (clj.stemmer/stemming "missile") "missil"))))

(deftest test-0657
  (testing "testting case 657"
    (is (= (clj.stemmer/stemming "launching") "launch"))))

(deftest test-0658
  (testing "testting case 658"
    (is (= (clj.stemmer/stemming "perhaps") "perhap"))))

(deftest test-0659
  (testing "testting case 659"
    (is (= (clj.stemmer/stemming "armed") "arm"))))

(deftest test-0660
  (testing "testting case 660"
    (is (= (clj.stemmer/stemming "provocation") "provoc"))))

(deftest test-0661
  (testing "testting case 661"
    (is (= (clj.stemmer/stemming "aimed") "aim"))))

(deftest test-0662
  (testing "testting case 662"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0663
  (testing "testting case 663"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0664
  (testing "testting case 664"
    (is (= (clj.stemmer/stemming "where") "where"))))

(deftest test-0665
  (testing "testting case 665"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0666
  (testing "testting case 666"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0667
  (testing "testting case 667"
    (is (= (clj.stemmer/stemming "president") "presid"))))

(deftest test-0668
  (testing "testting case 668"
    (is (= (clj.stemmer/stemming "park") "park"))))

(deftest test-0669
  (testing "testting case 669"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0670
  (testing "testting case 670"
    (is (= (clj.stemmer/stemming "daughter") "daughter"))))

(deftest test-0671
  (testing "testting case 671"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0672
  (testing "testting case 672"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0673
  (testing "testting case 673"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0674
  (testing "testting case 674"
    (is (= (clj.stemmer/stemming "dictator") "dictat"))))

(deftest test-0675
  (testing "testting case 675"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0676
  (testing "testting case 676"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0677
  (testing "testting case 677"
    (is (= (clj.stemmer/stemming "known") "known"))))

(deftest test-0678
  (testing "testting case 678"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-0679
  (testing "testting case 679"
    (is (= (clj.stemmer/stemming "taking") "take"))))

(deftest test-0680
  (testing "testting case 680"
    (is (= (clj.stemmer/stemming "hard") "hard"))))

(deftest test-0681
  (testing "testting case 681"
    (is (= (clj.stemmer/stemming "stand") "stand"))))

(deftest test-0682
  (testing "testting case 682"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0683
  (testing "testting case 683"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0684
  (testing "testting case 684"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0685
  (testing "testting case 685"
    (is (= (clj.stemmer/stemming "could") "could"))))

(deftest test-0686
  (testing "testting case 686"
    (is (= (clj.stemmer/stemming "forced") "forc"))))

(deftest test-0687
  (testing "testting case 687"
    (is (= (clj.stemmer/stemming "respond") "respond"))))

(deftest test-0688
  (testing "testting case 688"
    (is (= (clj.stemmer/stemming "some") "some"))))

(deftest test-0689
  (testing "testting case 689"
    (is (= (clj.stemmer/stemming "regarded") "regard"))))

(deftest test-0690
  (testing "testting case 690"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0691
  (testing "testting case 691"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0692
  (testing "testting case 692"
    (is (= (clj.stemmer/stemming "dire") "dire"))))

(deftest test-0693
  (testing "testting case 693"
    (is (= (clj.stemmer/stemming "warnings") "warn"))))

(deftest test-0694
  (testing "testting case 694"
    (is (= (clj.stemmer/stemming "signal") "signal"))))

(deftest test-0695
  (testing "testting case 695"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0696
  (testing "testting case 696"
    (is (= (clj.stemmer/stemming "some") "some"))))

(deftest test-0697
  (testing "testting case 697"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0698
  (testing "testting case 698"
    (is (= (clj.stemmer/stemming "response") "respons"))))

(deftest test-0699
  (testing "testting case 699"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-0700
  (testing "testting case 700"
    (is (= (clj.stemmer/stemming "looming") "loom"))))

(deftest test-0701
  (testing "testting case 701"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0702
  (testing "testting case 702"
    (is (= (clj.stemmer/stemming "higher") "higher"))))

(deftest test-0703
  (testing "testting case 703"
    (is (= (clj.stemmer/stemming "decibel") "decibel"))))

(deftest test-0704
  (testing "testting case 704"
    (is (= (clj.stemmer/stemming "invective") "invect"))))

(deftest test-0705
  (testing "testting case 705"
    (is (= (clj.stemmer/stemming "bit") "bit"))))

(deftest test-0706
  (testing "testting case 706"
    (is (= (clj.stemmer/stemming "worrisome") "worrisom"))))

(deftest test-0707
  (testing "testting case 707"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0708
  (testing "testting case 708"
    (is (= (clj.stemmer/stemming "bill") "bill"))))

(deftest test-0709
  (testing "testting case 709"
    (is (= (clj.stemmer/stemming "richardson") "richardson"))))

(deftest test-0710
  (testing "testting case 710"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0711
  (testing "testting case 711"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0712
  (testing "testting case 712"
    (is (= (clj.stemmer/stemming "governor") "governor"))))

(deftest test-0713
  (testing "testting case 713"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0714
  (testing "testting case 714"
    (is (= (clj.stemmer/stemming "mexico") "mexico"))))

(deftest test-0715
  (testing "testting case 715"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0716
  (testing "testting case 716"
    (is (= (clj.stemmer/stemming "presidential") "presidenti"))))

(deftest test-0717
  (testing "testting case 717"
    (is (= (clj.stemmer/stemming "candidate") "candid"))))

(deftest test-0718
  (testing "testting case 718"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0719
  (testing "testting case 719"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0720
  (testing "testting case 720"
    (is (= (clj.stemmer/stemming "traveled") "travel"))))

(deftest test-0721
  (testing "testting case 721"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0722
  (testing "testting case 722"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0723
  (testing "testting case 723"
    (is (= (clj.stemmer/stemming "eight") "eight"))))

(deftest test-0724
  (testing "testting case 724"
    (is (= (clj.stemmer/stemming "times") "time"))))

(deftest test-0725
  (testing "testting case 725"
    (is (= (clj.stemmer/stemming "most") "most"))))

(deftest test-0726
  (testing "testting case 726"
    (is (= (clj.stemmer/stemming "recently") "recent"))))

(deftest test-0727
  (testing "testting case 727"
    (is (= (clj.stemmer/stemming "january") "januari"))))

(deftest test-0728
  (testing "testting case 728"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0729
  (testing "testting case 729"
    (is (= (clj.stemmer/stemming "highest") "highest"))))

(deftest test-0730
  (testing "testting case 730"
    (is (= (clj.stemmer/stemming "negative") "neg"))))

(deftest test-0731
  (testing "testting case 731"
    (is (= (clj.stemmer/stemming "level") "level"))))

(deftest test-0732
  (testing "testting case 732"
    (is (= (clj.stemmer/stemming "ever") "ever"))))

(deftest test-0733
  (testing "testting case 733"
    (is (= (clj.stemmer/stemming "seen") "seen"))))

(deftest test-0734
  (testing "testting case 734"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0735
  (testing "testting case 735"
    (is (= (clj.stemmer/stemming "probably") "probabl"))))

(deftest test-0736
  (testing "testting case 736"
    (is (= (clj.stemmer/stemming "means") "mean"))))

(deftest test-0737
  (testing "testting case 737"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0738
  (testing "testting case 738"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0739
  (testing "testting case 739"
    (is (= (clj.stemmer/stemming "hard") "hard"))))

(deftest test-0740
  (testing "testting case 740"
    (is (= (clj.stemmer/stemming "line") "line"))))

(deftest test-0741
  (testing "testting case 741"
    (is (= (clj.stemmer/stemming "elements") "element"))))

(deftest test-0742
  (testing "testting case 742"
    (is (= (clj.stemmer/stemming "particularly") "particularli"))))

(deftest test-0743
  (testing "testting case 743"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0744
  (testing "testting case 744"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0745
  (testing "testting case 745"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0746
  (testing "testting case 746"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0747
  (testing "testting case 747"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0748
  (testing "testting case 748"
    (is (= (clj.stemmer/stemming "foreign") "foreign"))))

(deftest test-0749
  (testing "testting case 749"
    (is (= (clj.stemmer/stemming "ministry") "ministri"))))

(deftest test-0750
  (testing "testting case 750"
    (is (= (clj.stemmer/stemming "are") "ar"))))

(deftest test-0751
  (testing "testting case 751"
    (is (= (clj.stemmer/stemming "control") "control"))))

(deftest test-0752
  (testing "testting case 752"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0753
  (testing "testting case 753"
    (is (= (clj.stemmer/stemming "other") "other"))))

(deftest test-0754
  (testing "testting case 754"
    (is (= (clj.stemmer/stemming "hand") "hand"))))

(deftest test-0755
  (testing "testting case 755"
    (is (= (clj.stemmer/stemming "richardson") "richardson"))))

(deftest test-0756
  (testing "testting case 756"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0757
  (testing "testting case 757"
    (is (= (clj.stemmer/stemming "china") "china"))))

(deftest test-0758
  (testing "testting case 758"
    (is (= (clj.stemmer/stemming "part") "part"))))

(deftest test-0759
  (testing "testting case 759"
    (is (= (clj.stemmer/stemming "significant") "signific"))))

(deftest test-0760
  (testing "testting case 760"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0761
  (testing "testting case 761"
    (is (= (clj.stemmer/stemming "effort") "effort"))))

(deftest test-0762
  (testing "testting case 762"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0763
  (testing "testting case 763"
    (is (= (clj.stemmer/stemming "this") "thi"))))

(deftest test-0764
  (testing "testting case 764"
    (is (= (clj.stemmer/stemming "may") "mai"))))

(deftest test-0765
  (testing "testting case 765"
    (is (= (clj.stemmer/stemming "cool") "cool"))))

(deftest test-0766
  (testing "testting case 766"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0767
  (testing "testting case 767"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0768
  (testing "testting case 768"
    (is (= (clj.stemmer/stemming "koreans") "korean"))))

(deftest test-0769
  (testing "testting case 769"
    (is (= (clj.stemmer/stemming "down") "down"))))

(deftest test-0770
  (testing "testting case 770"
    (is (= (clj.stemmer/stemming "may") "mai"))))

(deftest test-0771
  (testing "testting case 771"
    (is (= (clj.stemmer/stemming "temper") "temper"))))

(deftest test-0772
  (testing "testting case 772"
    (is (= (clj.stemmer/stemming "their") "their"))))

(deftest test-0773
  (testing "testting case 773"
    (is (= (clj.stemmer/stemming "response") "respons"))))

(deftest test-0774
  (testing "testting case 774"
    (is (= (clj.stemmer/stemming "also") "also"))))

(deftest test-0775
  (testing "testting case 775"
    (is (= (clj.stemmer/stemming "possible") "possibl"))))

(deftest test-0776
  (testing "testting case 776"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0777
  (testing "testting case 777"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0778
  (testing "testting case 778"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0779
  (testing "testting case 779"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0780
  (testing "testting case 780"
    (is (= (clj.stemmer/stemming "isolated") "isol"))))

(deftest test-0781
  (testing "testting case 781"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0782
  (testing "testting case 782"
    (is (= (clj.stemmer/stemming "korean") "korean"))))

(deftest test-0783
  (testing "testting case 783"
    (is (= (clj.stemmer/stemming "government") "govern"))))

(deftest test-0784
  (testing "testting case 784"
    (is (= (clj.stemmer/stemming "may") "mai"))))

(deftest test-0785
  (testing "testting case 785"
    (is (= (clj.stemmer/stemming "have") "have"))))

(deftest test-0786
  (testing "testting case 786"
    (is (= (clj.stemmer/stemming "misjudged") "misjudg"))))

(deftest test-0787
  (testing "testting case 787"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0788
  (testing "testting case 788"
    (is (= (clj.stemmer/stemming "reaction") "reaction"))))

(deftest test-0789
  (testing "testting case 789"
    (is (= (clj.stemmer/stemming "talk") "talk"))))

(deftest test-0790
  (testing "testting case 790"
    (is (= (clj.stemmer/stemming "pre") "pre"))))

(deftest test-0791
  (testing "testting case 791"
    (is (= (clj.stemmer/stemming "emptive") "emptiv"))))

(deftest test-0792
  (testing "testting case 792"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0793
  (testing "testting case 793"
    (is (= (clj.stemmer/stemming "attack") "attack"))))

(deftest test-0794
  (testing "testting case 794"
    (is (= (clj.stemmer/stemming "wording") "word"))))

(deftest test-0795
  (testing "testting case 795"
    (is (= (clj.stemmer/stemming "rarely") "rare"))))

(deftest test-0796
  (testing "testting case 796"
    (is (= (clj.stemmer/stemming "heard") "heard"))))

(deftest test-0797
  (testing "testting case 797"
    (is (= (clj.stemmer/stemming "since") "sinc"))))

(deftest test-0798
  (testing "testting case 798"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0799
  (testing "testting case 799"
    (is (= (clj.stemmer/stemming "cold") "cold"))))

(deftest test-0800
  (testing "testting case 800"
    (is (= (clj.stemmer/stemming "war") "war"))))

(deftest test-0801
  (testing "testting case 801"
    (is (= (clj.stemmer/stemming "ended") "end"))))

(deftest test-0802
  (testing "testting case 802"
    (is (= (clj.stemmer/stemming "could") "could"))))

(deftest test-0803
  (testing "testting case 803"
    (is (= (clj.stemmer/stemming "another") "anoth"))))

(deftest test-0804
  (testing "testting case 804"
    (is (= (clj.stemmer/stemming "way") "wai"))))

(deftest test-0805
  (testing "testting case 805"
    (is (= (clj.stemmer/stemming "which") "which"))))

(deftest test-0806
  (testing "testting case 806"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0807
  (testing "testting case 807"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0808
  (testing "testting case 808"
    (is (= (clj.stemmer/stemming "demanding") "demand"))))

(deftest test-0809
  (testing "testting case 809"
    (is (= (clj.stemmer/stemming "talks") "talk"))))

(deftest test-0810
  (testing "testting case 810"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0811
  (testing "testting case 811"
    (is (= (clj.stemmer/stemming "president") "presid"))))

(deftest test-0812
  (testing "testting case 812"
    (is (= (clj.stemmer/stemming "obama") "obama"))))

(deftest test-0813
  (testing "testting case 813"
    (is (= (clj.stemmer/stemming "only") "onli"))))

(deftest test-0814
  (testing "testting case 814"
    (is (= (clj.stemmer/stemming "last") "last"))))

(deftest test-0815
  (testing "testting case 815"
    (is (= (clj.stemmer/stemming "week") "week"))))

(deftest test-0816
  (testing "testting case 816"
    (is (= (clj.stemmer/stemming "kim") "kim"))))

(deftest test-0817
  (testing "testting case 817"
    (is (= (clj.stemmer/stemming "told") "told"))))

(deftest test-0818
  (testing "testting case 818"
    (is (= (clj.stemmer/stemming "dennis") "denni"))))

(deftest test-0819
  (testing "testting case 819"
    (is (= (clj.stemmer/stemming "rodman") "rodman"))))

(deftest test-0820
  (testing "testting case 820"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0821
  (testing "testting case 821"
    (is (= (clj.stemmer/stemming "visiting") "visit"))))

(deftest test-0822
  (testing "testting case 822"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0823
  (testing "testting case 823"
    (is (= (clj.stemmer/stemming "basketball") "basketbal"))))

(deftest test-0824
  (testing "testting case 824"
    (is (= (clj.stemmer/stemming "star") "star"))))

(deftest test-0825
  (testing "testting case 825"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0826
  (testing "testting case 826"
    (is (= (clj.stemmer/stemming "wanted") "want"))))

(deftest test-0827
  (testing "testting case 827"
    (is (= (clj.stemmer/stemming "obama") "obama"))))

(deftest test-0828
  (testing "testting case 828"
    (is (= (clj.stemmer/stemming "call") "call"))))

(deftest test-0829
  (testing "testting case 829"
    (is (= (clj.stemmer/stemming "him") "him"))))

(deftest test-0830
  (testing "testting case 830"
    (is (= (clj.stemmer/stemming "but") "but"))))

(deftest test-0831
  (testing "testting case 831"
    (is (= (clj.stemmer/stemming "could") "could"))))

(deftest test-0832
  (testing "testting case 832"
    (is (= (clj.stemmer/stemming "also") "also"))))

(deftest test-0833
  (testing "testting case 833"
    (is (= (clj.stemmer/stemming "way") "wai"))))

(deftest test-0834
  (testing "testting case 834"
    (is (= (clj.stemmer/stemming "saying") "sai"))))

(deftest test-0835
  (testing "testting case 835"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0836
  (testing "testting case 836"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0837
  (testing "testting case 837"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0838
  (testing "testting case 838"
    (is (= (clj.stemmer/stemming "now") "now"))))

(deftest test-0839
  (testing "testting case 839"
    (is (= (clj.stemmer/stemming "expected") "expect"))))

(deftest test-0840
  (testing "testting case 840"
    (is (= (clj.stemmer/stemming "treated") "treat"))))

(deftest test-0841
  (testing "testting case 841"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0842
  (testing "testting case 842"
    (is (= (clj.stemmer/stemming "way") "wai"))))

(deftest test-0843
  (testing "testting case 843"
    (is (= (clj.stemmer/stemming "pakistan") "pakistan"))))

(deftest test-0844
  (testing "testting case 844"
    (is (= (clj.stemmer/stemming "established") "establish"))))

(deftest test-0845
  (testing "testting case 845"
    (is (= (clj.stemmer/stemming "formally") "formal"))))

(deftest test-0846
  (testing "testting case 846"
    (is (= (clj.stemmer/stemming "unrecognized") "unrecogn"))))

(deftest test-0847
  (testing "testting case 847"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0848
  (testing "testting case 848"
    (is (= (clj.stemmer/stemming "power") "power"))))

(deftest test-0849
  (testing "testting case 849"
    (is (= (clj.stemmer/stemming "this") "thi"))))

(deftest test-0850
  (testing "testting case 850"
    (is (= (clj.stemmer/stemming "tactic") "tactic"))))

(deftest test-0851
  (testing "testting case 851"
    (is (= (clj.stemmer/stemming "they") "thei"))))

(deftest test-0852
  (testing "testting case 852"
    (is (= (clj.stemmer/stemming "have") "have"))))

(deftest test-0853
  (testing "testting case 853"
    (is (= (clj.stemmer/stemming "employed") "emploi"))))

(deftest test-0854
  (testing "testting case 854"
    (is (= (clj.stemmer/stemming "when") "when"))))

(deftest test-0855
  (testing "testting case 855"
    (is (= (clj.stemmer/stemming "they") "thei"))))

(deftest test-0856
  (testing "testting case 856"
    (is (= (clj.stemmer/stemming "don") "don"))))

(deftest test-0857
  (testing "testting case 857"
    (is (= (clj.stemmer/stemming "get") "get"))))

(deftest test-0858
  (testing "testting case 858"
    (is (= (clj.stemmer/stemming "their") "their"))))

(deftest test-0859
  (testing "testting case 859"
    (is (= (clj.stemmer/stemming "way") "wai"))))

(deftest test-0860
  (testing "testting case 860"
    (is (= (clj.stemmer/stemming "when") "when"))))

(deftest test-0861
  (testing "testting case 861"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0862
  (testing "testting case 862"
    (is (= (clj.stemmer/stemming "international") "intern"))))

(deftest test-0863
  (testing "testting case 863"
    (is (= (clj.stemmer/stemming "community") "commun"))))

(deftest test-0864
  (testing "testting case 864"
    (is (= (clj.stemmer/stemming "brings") "bring"))))

(deftest test-0865
  (testing "testting case 865"
    (is (= (clj.stemmer/stemming "more") "more"))))

(deftest test-0866
  (testing "testting case 866"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0867
  (testing "testting case 867"
    (is (= (clj.stemmer/stemming "bear") "bear"))))

(deftest test-0868
  (testing "testting case 868"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0869
  (testing "testting case 869"
    (is (= (clj.stemmer/stemming "suzanne") "suzann"))))

(deftest test-0870
  (testing "testting case 870"
    (is (= (clj.stemmer/stemming "dimaggio") "dimaggio"))))

(deftest test-0871
  (testing "testting case 871"
    (is (= (clj.stemmer/stemming "vice") "vice"))))

(deftest test-0872
  (testing "testting case 872"
    (is (= (clj.stemmer/stemming "president") "presid"))))

(deftest test-0873
  (testing "testting case 873"
    (is (= (clj.stemmer/stemming "global") "global"))))

(deftest test-0874
  (testing "testting case 874"
    (is (= (clj.stemmer/stemming "policy") "polici"))))

(deftest test-0875
  (testing "testting case 875"
    (is (= (clj.stemmer/stemming "programs") "program"))))

(deftest test-0876
  (testing "testting case 876"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0877
  (testing "testting case 877"
    (is (= (clj.stemmer/stemming "asia") "asia"))))

(deftest test-0878
  (testing "testting case 878"
    (is (= (clj.stemmer/stemming "society") "societi"))))

(deftest test-0879
  (testing "testting case 879"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0880
  (testing "testting case 880"
    (is (= (clj.stemmer/stemming "york") "york"))))

(deftest test-0881
  (testing "testting case 881"
    (is (= (clj.stemmer/stemming "whether") "whether"))))

(deftest test-0882
  (testing "testting case 882"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0883
  (testing "testting case 883"
    (is (= (clj.stemmer/stemming "will") "will"))))

(deftest test-0884
  (testing "testting case 884"
    (is (= (clj.stemmer/stemming "happen") "happen"))))

(deftest test-0885
  (testing "testting case 885"
    (is (= (clj.stemmer/stemming "this") "thi"))))

(deftest test-0886
  (testing "testting case 886"
    (is (= (clj.stemmer/stemming "time") "time"))))

(deftest test-0887
  (testing "testting case 887"
    (is (= (clj.stemmer/stemming "unclear") "unclear"))))

(deftest test-0888
  (testing "testting case 888"
    (is (= (clj.stemmer/stemming "given") "given"))))

(deftest test-0889
  (testing "testting case 889"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0890
  (testing "testting case 890"
    (is (= (clj.stemmer/stemming "level") "level"))))

(deftest test-0891
  (testing "testting case 891"
    (is (= (clj.stemmer/stemming "hostile") "hostil"))))

(deftest test-0892
  (testing "testting case 892"
    (is (= (clj.stemmer/stemming "rhetoric") "rhetor"))))

(deftest test-0893
  (testing "testting case 893"
    (is (= (clj.stemmer/stemming "she") "she"))))

(deftest test-0894
  (testing "testting case 894"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0895
  (testing "testting case 895"
    (is (= (clj.stemmer/stemming "not") "not"))))

(deftest test-0896
  (testing "testting case 896"
    (is (= (clj.stemmer/stemming "sure") "sure"))))

(deftest test-0897
  (testing "testting case 897"
    (is (= (clj.stemmer/stemming "pyongyang") "pyongyang"))))

(deftest test-0898
  (testing "testting case 898"
    (is (= (clj.stemmer/stemming "recognizes") "recogn"))))

(deftest test-0899
  (testing "testting case 899"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0900
  (testing "testting case 900"
    (is (= (clj.stemmer/stemming "fact") "fact"))))

(deftest test-0901
  (testing "testting case 901"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0902
  (testing "testting case 902"
    (is (= (clj.stemmer/stemming "united") "unit"))))

(deftest test-0903
  (testing "testting case 903"
    (is (= (clj.stemmer/stemming "nations") "nation"))))

(deftest test-0904
  (testing "testting case 904"
    (is (= (clj.stemmer/stemming "vote") "vote"))))

(deftest test-0905
  (testing "testting case 905"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0906
  (testing "testting case 906"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0907
  (testing "testting case 907"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0908
  (testing "testting case 908"
    (is (= (clj.stemmer/stemming "threat") "threat"))))

(deftest test-0909
  (testing "testting case 909"
    (is (= (clj.stemmer/stemming "come") "come"))))

(deftest test-0910
  (testing "testting case 910"
    (is (= (clj.stemmer/stemming "time") "time"))))

(deftest test-0911
  (testing "testting case 911"
    (is (= (clj.stemmer/stemming "when") "when"))))

(deftest test-0912
  (testing "testting case 912"
    (is (= (clj.stemmer/stemming "internally") "intern"))))

(deftest test-0913
  (testing "testting case 913"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0914
  (testing "testting case 914"
    (is (= (clj.stemmer/stemming "obama") "obama"))))

(deftest test-0915
  (testing "testting case 915"
    (is (= (clj.stemmer/stemming "administration") "administr"))))

(deftest test-0916
  (testing "testting case 916"
    (is (= (clj.stemmer/stemming "debating") "debat"))))

(deftest test-0917
  (testing "testting case 917"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0918
  (testing "testting case 918"
    (is (= (clj.stemmer/stemming "wisdom") "wisdom"))))

(deftest test-0919
  (testing "testting case 919"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-0920
  (testing "testting case 920"
    (is (= (clj.stemmer/stemming "policy") "polici"))))

(deftest test-0921
  (testing "testting case 921"
    (is (= (clj.stemmer/stemming "essentially") "essenti"))))

(deftest test-0922
  (testing "testting case 922"
    (is (= (clj.stemmer/stemming "ignoring") "ignor"))))

(deftest test-0923
  (testing "testting case 923"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0924
  (testing "testting case 924"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0925
  (testing "testting case 925"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-0926
  (testing "testting case 926"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0927
  (testing "testting case 927"
    (is (= (clj.stemmer/stemming "past") "past"))))

(deftest test-0928
  (testing "testting case 928"
    (is (= (clj.stemmer/stemming "four") "four"))))

(deftest test-0929
  (testing "testting case 929"
    (is (= (clj.stemmer/stemming "years") "year"))))

(deftest test-0930
  (testing "testting case 930"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0931
  (testing "testting case 931"
    (is (= (clj.stemmer/stemming "responding") "respond"))))

(deftest test-0932
  (testing "testting case 932"
    (is (= (clj.stemmer/stemming "any") "ani"))))

(deftest test-0933
  (testing "testting case 933"
    (is (= (clj.stemmer/stemming "provocations") "provoc"))))

(deftest test-0934
  (testing "testting case 934"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0935
  (testing "testting case 935"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0936
  (testing "testting case 936"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-0937
  (testing "testting case 937"
    (is (= (clj.stemmer/stemming "according") "accord"))))

(deftest test-0938
  (testing "testting case 938"
    (is (= (clj.stemmer/stemming "current") "current"))))

(deftest test-0939
  (testing "testting case 939"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0940
  (testing "testting case 940"
    (is (= (clj.stemmer/stemming "former") "former"))))

(deftest test-0941
  (testing "testting case 941"
    (is (= (clj.stemmer/stemming "administration") "administr"))))

(deftest test-0942
  (testing "testting case 942"
    (is (= (clj.stemmer/stemming "officials") "offici"))))

(deftest test-0943
  (testing "testting case 943"
    (is (= (clj.stemmer/stemming "there") "there"))))

(deftest test-0944
  (testing "testting case 944"
    (is (= (clj.stemmer/stemming "growing") "grow"))))

(deftest test-0945
  (testing "testting case 945"
    (is (= (clj.stemmer/stemming "discussion") "discuss"))))

(deftest test-0946
  (testing "testting case 946"
    (is (= (clj.stemmer/stemming "within") "within"))))

(deftest test-0947
  (testing "testting case 947"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0948
  (testing "testting case 948"
    (is (= (clj.stemmer/stemming "white") "white"))))

(deftest test-0949
  (testing "testting case 949"
    (is (= (clj.stemmer/stemming "house") "hous"))))

(deftest test-0950
  (testing "testting case 950"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0951
  (testing "testting case 951"
    (is (= (clj.stemmer/stemming "state") "state"))))

(deftest test-0952
  (testing "testting case 952"
    (is (= (clj.stemmer/stemming "department") "depart"))))

(deftest test-0953
  (testing "testting case 953"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0954
  (testing "testting case 954"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0955
  (testing "testting case 955"
    (is (= (clj.stemmer/stemming "pentagon") "pentagon"))))

(deftest test-0956
  (testing "testting case 956"
    (is (= (clj.stemmer/stemming "over") "over"))))

(deftest test-0957
  (testing "testting case 957"
    (is (= (clj.stemmer/stemming "whether") "whether"))))

(deftest test-0958
  (testing "testting case 958"
    (is (= (clj.stemmer/stemming "kim") "kim"))))

(deftest test-0959
  (testing "testting case 959"
    (is (= (clj.stemmer/stemming "using") "us"))))

(deftest test-0960
  (testing "testting case 960"
    (is (= (clj.stemmer/stemming "each") "each"))))

(deftest test-0961
  (testing "testting case 961"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-0962
  (testing "testting case 962"
    (is (= (clj.stemmer/stemming "test") "test"))))

(deftest test-0963
  (testing "testting case 963"
    (is (= (clj.stemmer/stemming "rockets") "rocket"))))

(deftest test-0964
  (testing "testting case 964"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-0965
  (testing "testting case 965"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-0966
  (testing "testting case 966"
    (is (= (clj.stemmer/stemming "devices") "devic"))))

(deftest test-0967
  (testing "testting case 967"
    (is (= (clj.stemmer/stemming "solidify") "solidifi"))))

(deftest test-0968
  (testing "testting case 968"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0969
  (testing "testting case 969"
    (is (= (clj.stemmer/stemming "position") "posit"))))

(deftest test-0970
  (testing "testting case 970"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0971
  (testing "testting case 971"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0972
  (testing "testting case 972"
    (is (= (clj.stemmer/stemming "military") "militari"))))

(deftest test-0973
  (testing "testting case 973"
    (is (= (clj.stemmer/stemming "his") "hi"))))

(deftest test-0974
  (testing "testting case 974"
    (is (= (clj.stemmer/stemming "most") "most"))))

(deftest test-0975
  (testing "testting case 975"
    (is (= (clj.stemmer/stemming "important") "import"))))

(deftest test-0976
  (testing "testting case 976"
    (is (= (clj.stemmer/stemming "single") "singl"))))

(deftest test-0977
  (testing "testting case 977"
    (is (= (clj.stemmer/stemming "constituency") "constitu"))))

(deftest test-0978
  (testing "testting case 978"
    (is (= (clj.stemmer/stemming "under") "under"))))

(deftest test-0979
  (testing "testting case 979"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-0980
  (testing "testting case 980"
    (is (= (clj.stemmer/stemming "theory") "theori"))))

(deftest test-0981
  (testing "testting case 981"
    (is (= (clj.stemmer/stemming "one") "on"))))

(deftest test-0982
  (testing "testting case 982"
    (is (= (clj.stemmer/stemming "official") "offici"))))

(deftest test-0983
  (testing "testting case 983"
    (is (= (clj.stemmer/stemming "who") "who"))))

(deftest test-0984
  (testing "testting case 984"
    (is (= (clj.stemmer/stemming "has") "ha"))))

(deftest test-0985
  (testing "testting case 985"
    (is (= (clj.stemmer/stemming "dealt") "dealt"))))

(deftest test-0986
  (testing "testting case 986"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0987
  (testing "testting case 987"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-0988
  (testing "testting case 988"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-0989
  (testing "testting case 989"
    (is (= (clj.stemmer/stemming "often") "often"))))

(deftest test-0990
  (testing "testting case 990"
    (is (= (clj.stemmer/stemming "said") "said"))))

(deftest test-0991
  (testing "testting case 991"
    (is (= (clj.stemmer/stemming "recently") "recent"))))

(deftest test-0992
  (testing "testting case 992"
    (is (= (clj.stemmer/stemming "even") "even"))))

(deftest test-0993
  (testing "testting case 993"
    (is (= (clj.stemmer/stemming "firefight") "firefight"))))

(deftest test-0994
  (testing "testting case 994"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-0995
  (testing "testting case 995"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-0996
  (testing "testting case 996"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-0997
  (testing "testting case 997"
    (is (= (clj.stemmer/stemming "koreans") "korean"))))

(deftest test-0998
  (testing "testting case 998"
    (is (= (clj.stemmer/stemming "might") "might"))))

(deftest test-0999
  (testing "testting case 999"
    (is (= (clj.stemmer/stemming "help") "help"))))

(deftest test-1000
  (testing "testting case 1000"
    (is (= (clj.stemmer/stemming "him") "him"))))

(deftest test-1001
  (testing "testting case 1001"
    (is (= (clj.stemmer/stemming "long") "long"))))

(deftest test-1002
  (testing "testting case 1002"
    (is (= (clj.stemmer/stemming "doesn") "doesn"))))

(deftest test-1003
  (testing "testting case 1003"
    (is (= (clj.stemmer/stemming "escalate") "escal"))))

(deftest test-1004
  (testing "testting case 1004"
    (is (= (clj.stemmer/stemming "into") "into"))))

(deftest test-1005
  (testing "testting case 1005"
    (is (= (clj.stemmer/stemming "something") "someth"))))

(deftest test-1006
  (testing "testting case 1006"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-1007
  (testing "testting case 1007"
    (is (= (clj.stemmer/stemming "threatens") "threaten"))))

(deftest test-1008
  (testing "testting case 1008"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-1009
  (testing "testting case 1009"
    (is (= (clj.stemmer/stemming "regime") "regim"))))

(deftest test-1010
  (testing "testting case 1010"
    (is (= (clj.stemmer/stemming "testimony") "testimoni"))))

(deftest test-1011
  (testing "testting case 1011"
    (is (= (clj.stemmer/stemming "thursday") "thursdai"))))

(deftest test-1012
  (testing "testting case 1012"
    (is (= (clj.stemmer/stemming "before") "befor"))))

(deftest test-1013
  (testing "testting case 1013"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-1014
  (testing "testting case 1014"
    (is (= (clj.stemmer/stemming "senate") "senat"))))

(deftest test-1015
  (testing "testting case 1015"
    (is (= (clj.stemmer/stemming "foreign") "foreign"))))

(deftest test-1016
  (testing "testting case 1016"
    (is (= (clj.stemmer/stemming "relations") "relat"))))

(deftest test-1017
  (testing "testting case 1017"
    (is (= (clj.stemmer/stemming "committee") "committe"))))

(deftest test-1018
  (testing "testting case 1018"
    (is (= (clj.stemmer/stemming "glyn") "glyn"))))

(deftest test-1019
  (testing "testting case 1019"
    (is (= (clj.stemmer/stemming "davies") "davi"))))

(deftest test-1020
  (testing "testting case 1020"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-1021
  (testing "testting case 1021"
    (is (= (clj.stemmer/stemming "administration") "administr"))))

(deftest test-1022
  (testing "testting case 1022"
    (is (= (clj.stemmer/stemming "special") "special"))))

(deftest test-1023
  (testing "testting case 1023"
    (is (= (clj.stemmer/stemming "representative") "repres"))))

(deftest test-1024
  (testing "testting case 1024"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-1025
  (testing "testting case 1025"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-1026
  (testing "testting case 1026"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-1027
  (testing "testting case 1027"
    (is (= (clj.stemmer/stemming "policy") "polici"))))

(deftest test-1028
  (testing "testting case 1028"
    (is (= (clj.stemmer/stemming "argued") "argu"))))

(deftest test-1029
  (testing "testting case 1029"
    (is (= (clj.stemmer/stemming "that") "that"))))

(deftest test-1030
  (testing "testting case 1030"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-1031
  (testing "testting case 1031"
    (is (= (clj.stemmer/stemming "best") "best"))))

(deftest test-1032
  (testing "testting case 1032"
    (is (= (clj.stemmer/stemming "course") "cours"))))

(deftest test-1033
  (testing "testting case 1033"
    (is (= (clj.stemmer/stemming "was") "wa"))))

(deftest test-1034
  (testing "testting case 1034"
    (is (= (clj.stemmer/stemming "continue") "continu"))))

(deftest test-1035
  (testing "testting case 1035"
    (is (= (clj.stemmer/stemming "with") "with"))))

(deftest test-1036
  (testing "testting case 1036"
    (is (= (clj.stemmer/stemming "obama") "obama"))))

(deftest test-1037
  (testing "testting case 1037"
    (is (= (clj.stemmer/stemming "current") "current"))))

(deftest test-1038
  (testing "testting case 1038"
    (is (= (clj.stemmer/stemming "policy") "polici"))))

(deftest test-1039
  (testing "testting case 1039"
    (is (= (clj.stemmer/stemming "using") "us"))))

(deftest test-1040
  (testing "testting case 1040"
    (is (= (clj.stemmer/stemming "tests") "test"))))

(deftest test-1041
  (testing "testting case 1041"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-1042
  (testing "testting case 1042"
    (is (= (clj.stemmer/stemming "provocations") "provoc"))))

(deftest test-1043
  (testing "testting case 1043"
    (is (= (clj.stemmer/stemming "tighten") "tighten"))))

(deftest test-1044
  (testing "testting case 1044"
    (is (= (clj.stemmer/stemming "sanctions") "sanction"))))

(deftest test-1045
  (testing "testting case 1045"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-1046
  (testing "testting case 1046"
    (is (= (clj.stemmer/stemming "try") "try"))))

(deftest test-1047
  (testing "testting case 1047"
    (is (= (clj.stemmer/stemming "starve") "starv"))))

(deftest test-1048
  (testing "testting case 1048"
    (is (= (clj.stemmer/stemming "development") "develop"))))

(deftest test-1049
  (testing "testting case 1049"
    (is (= (clj.stemmer/stemming "the") "the"))))

(deftest test-1050
  (testing "testting case 1050"
    (is (= (clj.stemmer/stemming "north") "north"))))

(deftest test-1051
  (testing "testting case 1051"
    (is (= (clj.stemmer/stemming "long") "long"))))

(deftest test-1052
  (testing "testting case 1052"
    (is (= (clj.stemmer/stemming "range") "rang"))))

(deftest test-1053
  (testing "testting case 1053"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-1054
  (testing "testting case 1054"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-1055
  (testing "testting case 1055"
    (is (= (clj.stemmer/stemming "its") "it"))))

(deftest test-1056
  (testing "testting case 1056"
    (is (= (clj.stemmer/stemming "effort") "effort"))))

(deftest test-1057
  (testing "testting case 1057"
    (is (= (clj.stemmer/stemming "design") "design"))))

(deftest test-1058
  (testing "testting case 1058"
    (is (= (clj.stemmer/stemming "nuclear") "nuclear"))))

(deftest test-1059
  (testing "testting case 1059"
    (is (= (clj.stemmer/stemming "weapons") "weapon"))))

(deftest test-1060
  (testing "testting case 1060"
    (is (= (clj.stemmer/stemming "small") "small"))))

(deftest test-1061
  (testing "testting case 1061"
    (is (= (clj.stemmer/stemming "enough") "enough"))))

(deftest test-1062
  (testing "testting case 1062"
    (is (= (clj.stemmer/stemming "for") "for"))))

(deftest test-1063
  (testing "testting case 1063"
    (is (= (clj.stemmer/stemming "those") "those"))))

(deftest test-1064
  (testing "testting case 1064"
    (is (= (clj.stemmer/stemming "missiles") "missil"))))

(deftest test-1065
  (testing "testting case 1065"
    (is (= (clj.stemmer/stemming "choe") "choe"))))

(deftest test-1066
  (testing "testting case 1066"
    (is (= (clj.stemmer/stemming "sang") "sang"))))

(deftest test-1067
  (testing "testting case 1067"
    (is (= (clj.stemmer/stemming "hun") "hun"))))

(deftest test-1068
  (testing "testting case 1068"
    (is (= (clj.stemmer/stemming "reported") "report"))))

(deftest test-1069
  (testing "testting case 1069"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-1070
  (testing "testting case 1070"
    (is (= (clj.stemmer/stemming "seoul") "seoul"))))

(deftest test-1071
  (testing "testting case 1071"
    (is (= (clj.stemmer/stemming "south") "south"))))

(deftest test-1072
  (testing "testting case 1072"
    (is (= (clj.stemmer/stemming "korea") "korea"))))

(deftest test-1073
  (testing "testting case 1073"
    (is (= (clj.stemmer/stemming "and") "and"))))

(deftest test-1074
  (testing "testting case 1074"
    (is (= (clj.stemmer/stemming "rick") "rick"))))

(deftest test-1075
  (testing "testting case 1075"
    (is (= (clj.stemmer/stemming "gladstone") "gladston"))))

(deftest test-1076
  (testing "testting case 1076"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-1077
  (testing "testting case 1077"
    (is (= (clj.stemmer/stemming "new") "new"))))

(deftest test-1078
  (testing "testting case 1078"
    (is (= (clj.stemmer/stemming "york") "york"))))

(deftest test-1079
  (testing "testting case 1079"
    (is (= (clj.stemmer/stemming "david") "david"))))

(deftest test-1080
  (testing "testting case 1080"
    (is (= (clj.stemmer/stemming "sanger") "sanger"))))

(deftest test-1081
  (testing "testting case 1081"
    (is (= (clj.stemmer/stemming "contributed") "contribut"))))

(deftest test-1082
  (testing "testting case 1082"
    (is (= (clj.stemmer/stemming "reporting") "report"))))

(deftest test-1083
  (testing "testting case 1083"
    (is (= (clj.stemmer/stemming "from") "from"))))

(deftest test-1084
  (testing "testting case 1084"
    (is (= (clj.stemmer/stemming "washington") "washington"))))

