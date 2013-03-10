(ns clojure-stemmer.core-test
  (:use clojure.test
        clojure-stemmer.core))

(deftest a-test
  (testing "Simple Test."
    (is (= 0 0))))

(deftest b-test
  (testing "Simple stemming test"
    (is (= (stemming "working") "work"))))


(deftest test-0001
  (testing "testting case 1"
    (is (= (stemming "SEOUL") "SEOUL"))))

(deftest test-0002
  (testing "testting case 2"
    (is (= (stemming "South") "South"))))

(deftest test-0003
  (testing "testting case 3"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0004
  (testing "testting case 4"
    (is (= (stemming "Angrily") "Angrili"))))

(deftest test-0005
  (testing "testting case 5"
    (is (= (stemming "responding") "respond"))))

(deftest test-0006
  (testing "testting case 6"
    (is (= (stemming "the") "the"))))

(deftest test-0007
  (testing "testting case 7"
    (is (= (stemming "United") "Unite"))))

(deftest test-0008
  (testing "testting case 8"
    (is (= (stemming "Nations") "Nation"))))

(deftest test-0009
  (testing "testting case 9"
    (is (= (stemming "Security") "Secur"))))

(deftest test-0010
  (testing "testting case 10"
    (is (= (stemming "Council") "Council"))))

(deftest test-0011
  (testing "testting case 11"
    (is (= (stemming "unanimous") "unanim"))))

(deftest test-0012
  (testing "testting case 12"
    (is (= (stemming "decision") "decis"))))

(deftest test-0013
  (testing "testting case 13"
    (is (= (stemming "impose") "impos"))))

(deftest test-0014
  (testing "testting case 14"
    (is (= (stemming "tightened") "tighten"))))

(deftest test-0015
  (testing "testting case 15"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0016
  (testing "testting case 16"
    (is (= (stemming "North") "North"))))

(deftest test-0017
  (testing "testting case 17"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0018
  (testing "testting case 18"
    (is (= (stemming "said") "said"))))

(deftest test-0019
  (testing "testting case 19"
    (is (= (stemming "Friday") "Fridai"))))

(deftest test-0020
  (testing "testting case 20"
    (is (= (stemming "that") "that"))))

(deftest test-0021
  (testing "testting case 21"
    (is (= (stemming "was") "wa"))))

(deftest test-0022
  (testing "testting case 22"
    (is (= (stemming "nullifying") "nullifi"))))

(deftest test-0023
  (testing "testting case 23"
    (is (= (stemming "all") "all"))))

(deftest test-0024
  (testing "testting case 24"
    (is (= (stemming "nonaggression") "nonaggress"))))

(deftest test-0025
  (testing "testting case 25"
    (is (= (stemming "agreements") "agreement"))))

(deftest test-0026
  (testing "testting case 26"
    (is (= (stemming "with") "with"))))

(deftest test-0027
  (testing "testting case 27"
    (is (= (stemming "South") "South"))))

(deftest test-0028
  (testing "testting case 28"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0029
  (testing "testting case 29"
    (is (= (stemming "with") "with"))))

(deftest test-0030
  (testing "testting case 30"
    (is (= (stemming "one") "on"))))

(deftest test-0031
  (testing "testting case 31"
    (is (= (stemming "its") "it"))))

(deftest test-0032
  (testing "testting case 32"
    (is (= (stemming "top") "top"))))

(deftest test-0033
  (testing "testting case 33"
    (is (= (stemming "generals") "gener"))))

(deftest test-0034
  (testing "testting case 34"
    (is (= (stemming "claiming") "claim"))))

(deftest test-0035
  (testing "testting case 35"
    (is (= (stemming "that") "that"))))

(deftest test-0036
  (testing "testting case 36"
    (is (= (stemming "his") "hi"))))

(deftest test-0037
  (testing "testting case 37"
    (is (= (stemming "country") "countri"))))

(deftest test-0038
  (testing "testting case 38"
    (is (= (stemming "had") "had"))))

(deftest test-0039
  (testing "testting case 39"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0040
  (testing "testting case 40"
    (is (= (stemming "tipped") "tip"))))

(deftest test-0041
  (testing "testting case 41"
    (is (= (stemming "intercontinental") "intercontinent"))))

(deftest test-0042
  (testing "testting case 42"
    (is (= (stemming "ballistic") "ballist"))))

(deftest test-0043
  (testing "testting case 43"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0044
  (testing "testting case 44"
    (is (= (stemming "ready") "readi"))))

(deftest test-0045
  (testing "testting case 45"
    (is (= (stemming "blast") "blast"))))

(deftest test-0046
  (testing "testting case 46"
    (is (= (stemming "off") "off"))))

(deftest test-0047
  (testing "testting case 47"
    (is (= (stemming "Matching") "Match"))))

(deftest test-0048
  (testing "testting case 48"
    (is (= (stemming "the") "the"))))

(deftest test-0049
  (testing "testting case 49"
    (is (= (stemming "harsh") "harsh"))))

(deftest test-0050
  (testing "testting case 50"
    (is (= (stemming "warning") "warn"))))

(deftest test-0051
  (testing "testting case 51"
    (is (= (stemming "with") "with"))))

(deftest test-0052
  (testing "testting case 52"
    (is (= (stemming "toughened") "toughen"))))

(deftest test-0053
  (testing "testting case 53"
    (is (= (stemming "stance") "stanc"))))

(deftest test-0054
  (testing "testting case 54"
    (is (= (stemming "South") "South"))))

(deftest test-0055
  (testing "testting case 55"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0056
  (testing "testting case 56"
    (is (= (stemming "said") "said"))))

(deftest test-0057
  (testing "testting case 57"
    (is (= (stemming "Friday") "Fridai"))))

(deftest test-0058
  (testing "testting case 58"
    (is (= (stemming "that") "that"))))

(deftest test-0059
  (testing "testting case 59"
    (is (= (stemming "Pyongyang") "Pyongyang"))))

(deftest test-0060
  (testing "testting case 60"
    (is (= (stemming "attacks") "attack"))))

(deftest test-0061
  (testing "testting case 61"
    (is (= (stemming "the") "the"))))

(deftest test-0062
  (testing "testting case 62"
    (is (= (stemming "South") "South"))))

(deftest test-0063
  (testing "testting case 63"
    (is (= (stemming "with") "with"))))

(deftest test-0064
  (testing "testting case 64"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0065
  (testing "testting case 65"
    (is (= (stemming "weapon") "weapon"))))

(deftest test-0066
  (testing "testting case 66"
    (is (= (stemming "the") "the"))))

(deftest test-0067
  (testing "testting case 67"
    (is (= (stemming "regime") "regim"))))

(deftest test-0068
  (testing "testting case 68"
    (is (= (stemming "the") "the"))))

(deftest test-0069
  (testing "testting case 69"
    (is (= (stemming "North") "North"))))

(deftest test-0070
  (testing "testting case 70"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0071
  (testing "testting case 71"
    (is (= (stemming "leader") "leader"))))

(deftest test-0072
  (testing "testting case 72"
    (is (= (stemming "Kim") "Kim"))))

(deftest test-0073
  (testing "testting case 73"
    (is (= (stemming "Jong") "Jong"))))

(deftest test-0074
  (testing "testting case 74"
    (is (= (stemming "will") "will"))))

(deftest test-0075
  (testing "testting case 75"
    (is (= (stemming "erased") "eras"))))

(deftest test-0076
  (testing "testting case 76"
    (is (= (stemming "from") "from"))))

(deftest test-0077
  (testing "testting case 77"
    (is (= (stemming "the") "the"))))

(deftest test-0078
  (testing "testting case 78"
    (is (= (stemming "earth") "earth"))))

(deftest test-0079
  (testing "testting case 79"
    (is (= (stemming "Such") "Such"))))

(deftest test-0080
  (testing "testting case 80"
    (is (= (stemming "language") "languag"))))

(deftest test-0081
  (testing "testting case 81"
    (is (= (stemming "marked") "mark"))))

(deftest test-0082
  (testing "testting case 82"
    (is (= (stemming "the") "the"))))

(deftest test-0083
  (testing "testting case 83"
    (is (= (stemming "most") "most"))))

(deftest test-0084
  (testing "testting case 84"
    (is (= (stemming "hostile") "hostil"))))

(deftest test-0085
  (testing "testting case 85"
    (is (= (stemming "exchange") "exchang"))))

(deftest test-0086
  (testing "testting case 86"
    (is (= (stemming "between") "between"))))

(deftest test-0087
  (testing "testting case 87"
    (is (= (stemming "the") "the"))))

(deftest test-0088
  (testing "testting case 88"
    (is (= (stemming "two") "two"))))

(deftest test-0089
  (testing "testting case 89"
    (is (= (stemming "Koreas") "Korea"))))

(deftest test-0090
  (testing "testting case 90"
    (is (= (stemming "still") "still"))))

(deftest test-0091
  (testing "testting case 91"
    (is (= (stemming "technically") "technic"))))

(deftest test-0092
  (testing "testting case 92"
    (is (= (stemming "war") "war"))))

(deftest test-0093
  (testing "testting case 93"
    (is (= (stemming "since") "sinc"))))

(deftest test-0094
  (testing "testting case 94"
    (is (= (stemming "they") "thei"))))

(deftest test-0095
  (testing "testting case 95"
    (is (= (stemming "engaged") "engag"))))

(deftest test-0096
  (testing "testting case 96"
    (is (= (stemming "artillery") "artilleri"))))

(deftest test-0097
  (testing "testting case 97"
    (is (= (stemming "skirmish") "skirmish"))))

(deftest test-0098
  (testing "testting case 98"
    (is (= (stemming "three") "three"))))

(deftest test-0099
  (testing "testting case 99"
    (is (= (stemming "years") "year"))))

(deftest test-0100
  (testing "testting case 100"
    (is (= (stemming "ago") "ago"))))

(deftest test-0101
  (testing "testting case 101"
    (is (= (stemming "The") "The"))))

(deftest test-0102
  (testing "testting case 102"
    (is (= (stemming "verbal") "verbal"))))

(deftest test-0103
  (testing "testting case 103"
    (is (= (stemming "warfare") "warfar"))))

(deftest test-0104
  (testing "testting case 104"
    (is (= (stemming "represented") "repres"))))

(deftest test-0105
  (testing "testting case 105"
    (is (= (stemming "clash") "clash"))))

(deftest test-0106
  (testing "testting case 106"
    (is (= (stemming "nerves") "nerv"))))

(deftest test-0107
  (testing "testting case 107"
    (is (= (stemming "between") "between"))))

(deftest test-0108
  (testing "testting case 108"
    (is (= (stemming "the") "the"))))

(deftest test-0109
  (testing "testting case 109"
    (is (= (stemming "young") "young"))))

(deftest test-0110
  (testing "testting case 110"
    (is (= (stemming "North") "North"))))

(deftest test-0111
  (testing "testting case 111"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0112
  (testing "testting case 112"
    (is (= (stemming "leader") "leader"))))

(deftest test-0113
  (testing "testting case 113"
    (is (= (stemming "who") "who"))))

(deftest test-0114
  (testing "testting case 114"
    (is (= (stemming "building") "build"))))

(deftest test-0115
  (testing "testting case 115"
    (is (= (stemming "his") "hi"))))

(deftest test-0116
  (testing "testting case 116"
    (is (= (stemming "credentials") "credenti"))))

(deftest test-0117
  (testing "testting case 117"
    (is (= (stemming "head") "head"))))

(deftest test-0118
  (testing "testting case 118"
    (is (= (stemming "his") "hi"))))

(deftest test-0119
  (testing "testting case 119"
    (is (= (stemming "militaristic") "militarist"))))

(deftest test-0120
  (testing "testting case 120"
    (is (= (stemming "country") "countri"))))

(deftest test-0121
  (testing "testting case 121"
    (is (= (stemming "and") "and"))))

(deftest test-0122
  (testing "testting case 122"
    (is (= (stemming "Park") "Park"))))

(deftest test-0123
  (testing "testting case 123"
    (is (= (stemming "Geun") "Geun"))))

(deftest test-0124
  (testing "testting case 124"
    (is (= (stemming "hye") "hye"))))

(deftest test-0125
  (testing "testting case 125"
    (is (= (stemming "South") "South"))))

(deftest test-0126
  (testing "testting case 126"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0127
  (testing "testting case 127"
    (is (= (stemming "first") "first"))))

(deftest test-0128
  (testing "testting case 128"
    (is (= (stemming "female") "femal"))))

(deftest test-0129
  (testing "testting case 129"
    (is (= (stemming "president") "presid"))))

(deftest test-0130
  (testing "testting case 130"
    (is (= (stemming "who") "who"))))

(deftest test-0131
  (testing "testting case 131"
    (is (= (stemming "considers") "consid"))))

(deftest test-0132
  (testing "testting case 132"
    (is (= (stemming "the") "the"))))

(deftest test-0133
  (testing "testting case 133"
    (is (= (stemming "former") "former"))))

(deftest test-0134
  (testing "testting case 134"
    (is (= (stemming "British") "British"))))

(deftest test-0135
  (testing "testting case 135"
    (is (= (stemming "Prime") "Prime"))))

(deftest test-0136
  (testing "testting case 136"
    (is (= (stemming "Minister") "Minist"))))

(deftest test-0137
  (testing "testting case 137"
    (is (= (stemming "Margaret") "Margaret"))))

(deftest test-0138
  (testing "testting case 138"
    (is (= (stemming "Thatcher") "Thatcher"))))

(deftest test-0139
  (testing "testting case 139"
    (is (= (stemming "her") "her"))))

(deftest test-0140
  (testing "testting case 140"
    (is (= (stemming "role") "role"))))

(deftest test-0141
  (testing "testting case 141"
    (is (= (stemming "model") "model"))))

(deftest test-0142
  (testing "testting case 142"
    (is (= (stemming "and") "and"))))

(deftest test-0143
  (testing "testting case 143"
    (is (= (stemming "has") "ha"))))

(deftest test-0144
  (testing "testting case 144"
    (is (= (stemming "stressed") "stress"))))

(deftest test-0145
  (testing "testting case 145"
    (is (= (stemming "security") "secur"))))

(deftest test-0146
  (testing "testting case 146"
    (is (= (stemming "her") "her"))))

(deftest test-0147
  (testing "testting case 147"
    (is (= (stemming "top") "top"))))

(deftest test-0148
  (testing "testting case 148"
    (is (= (stemming "priority") "prioriti"))))

(deftest test-0149
  (testing "testting case 149"
    (is (= (stemming "While") "While"))))

(deftest test-0150
  (testing "testting case 150"
    (is (= (stemming "weapons") "weapon"))))

(deftest test-0151
  (testing "testting case 151"
    (is (= (stemming "experts") "expert"))))

(deftest test-0152
  (testing "testting case 152"
    (is (= (stemming "say") "sai"))))

(deftest test-0153
  (testing "testting case 153"
    (is (= (stemming "North") "North"))))

(deftest test-0154
  (testing "testting case 154"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0155
  (testing "testting case 155"
    (is (= (stemming "does") "doe"))))

(deftest test-0156
  (testing "testting case 156"
    (is (= (stemming "not") "not"))))

(deftest test-0157
  (testing "testting case 157"
    (is (= (stemming "have") "have"))))

(deftest test-0158
  (testing "testting case 158"
    (is (= (stemming "the") "the"))))

(deftest test-0159
  (testing "testting case 159"
    (is (= (stemming "technical") "technic"))))

(deftest test-0160
  (testing "testting case 160"
    (is (= (stemming "capability") "capabl"))))

(deftest test-0161
  (testing "testting case 161"
    (is (= (stemming "use") "us"))))

(deftest test-0162
  (testing "testting case 162"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0163
  (testing "testting case 163"
    (is (= (stemming "tipped") "tip"))))

(deftest test-0164
  (testing "testting case 164"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0165
  (testing "testting case 165"
    (is (= (stemming "that") "that"))))

(deftest test-0166
  (testing "testting case 166"
    (is (= (stemming "did") "did"))))

(deftest test-0167
  (testing "testting case 167"
    (is (= (stemming "not") "not"))))

(deftest test-0168
  (testing "testting case 168"
    (is (= (stemming "stop") "stop"))))

(deftest test-0169
  (testing "testting case 169"
    (is (= (stemming "from") "from"))))

(deftest test-0170
  (testing "testting case 170"
    (is (= (stemming "warning") "warn"))))

(deftest test-0171
  (testing "testting case 171"
    (is (= (stemming "their") "their"))))

(deftest test-0172
  (testing "testting case 172"
    (is (= (stemming "deployment") "deploy"))))

(deftest test-0173
  (testing "testting case 173"
    (is (= (stemming "With") "With"))))

(deftest test-0174
  (testing "testting case 174"
    (is (= (stemming "their") "their"))))

(deftest test-0175
  (testing "testting case 175"
    (is (= (stemming "targets") "target"))))

(deftest test-0176
  (testing "testting case 176"
    (is (= (stemming "set") "set"))))

(deftest test-0177
  (testing "testting case 177"
    (is (= (stemming "our") "our"))))

(deftest test-0178
  (testing "testting case 178"
    (is (= (stemming "intercontinental") "intercontinent"))))

(deftest test-0179
  (testing "testting case 179"
    (is (= (stemming "ballistic") "ballist"))))

(deftest test-0180
  (testing "testting case 180"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0181
  (testing "testting case 181"
    (is (= (stemming "and") "and"))))

(deftest test-0182
  (testing "testting case 182"
    (is (= (stemming "other") "other"))))

(deftest test-0183
  (testing "testting case 183"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0184
  (testing "testting case 184"
    (is (= (stemming "are") "ar"))))

(deftest test-0185
  (testing "testting case 185"
    (is (= (stemming "standby") "standbi"))))

(deftest test-0186
  (testing "testting case 186"
    (is (= (stemming "loaded") "load"))))

(deftest test-0187
  (testing "testting case 187"
    (is (= (stemming "with") "with"))))

(deftest test-0188
  (testing "testting case 188"
    (is (= (stemming "lighter") "lighter"))))

(deftest test-0189
  (testing "testting case 189"
    (is (= (stemming "smaller") "smaller"))))

(deftest test-0190
  (testing "testting case 190"
    (is (= (stemming "and") "and"))))

(deftest test-0191
  (testing "testting case 191"
    (is (= (stemming "diversified") "diversifi"))))

(deftest test-0192
  (testing "testting case 192"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0193
  (testing "testting case 193"
    (is (= (stemming "warheads") "warhead"))))

(deftest test-0194
  (testing "testting case 194"
    (is (= (stemming "said") "said"))))

(deftest test-0195
  (testing "testting case 195"
    (is (= (stemming "Kang") "Kang"))))

(deftest test-0196
  (testing "testting case 196"
    (is (= (stemming "Pyo") "Pyo"))))

(deftest test-0197
  (testing "testting case 197"
    (is (= (stemming "yong") "yong"))))

(deftest test-0198
  (testing "testting case 198"
    (is (= (stemming "three") "three"))))

(deftest test-0199
  (testing "testting case 199"
    (is (= (stemming "star") "star"))))

(deftest test-0200
  (testing "testting case 200"
    (is (= (stemming "general") "gener"))))

(deftest test-0201
  (testing "testting case 201"
    (is (= (stemming "and") "and"))))

(deftest test-0202
  (testing "testting case 202"
    (is (= (stemming "vice") "vice"))))

(deftest test-0203
  (testing "testting case 203"
    (is (= (stemming "defense") "defens"))))

(deftest test-0204
  (testing "testting case 204"
    (is (= (stemming "minister") "minist"))))

(deftest test-0205
  (testing "testting case 205"
    (is (= (stemming "North") "North"))))

(deftest test-0206
  (testing "testting case 206"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0207
  (testing "testting case 207"
    (is (= (stemming "push") "push"))))

(deftest test-0208
  (testing "testting case 208"
    (is (= (stemming "the") "the"))))

(deftest test-0209
  (testing "testting case 209"
    (is (= (stemming "button") "button"))))

(deftest test-0210
  (testing "testting case 210"
    (is (= (stemming "they") "thei"))))

(deftest test-0211
  (testing "testting case 211"
    (is (= (stemming "will") "will"))))

(deftest test-0212
  (testing "testting case 212"
    (is (= (stemming "blast") "blast"))))

(deftest test-0213
  (testing "testting case 213"
    (is (= (stemming "off") "off"))))

(deftest test-0214
  (testing "testting case 214"
    (is (= (stemming "and") "and"))))

(deftest test-0215
  (testing "testting case 215"
    (is (= (stemming "their") "their"))))

(deftest test-0216
  (testing "testting case 216"
    (is (= (stemming "barrage") "barrag"))))

(deftest test-0217
  (testing "testting case 217"
    (is (= (stemming "will") "will"))))

(deftest test-0218
  (testing "testting case 218"
    (is (= (stemming "turn") "turn"))))

(deftest test-0219
  (testing "testting case 219"
    (is (= (stemming "Washington") "Washington"))))

(deftest test-0220
  (testing "testting case 220"
    (is (= (stemming "the") "the"))))

(deftest test-0221
  (testing "testting case 221"
    (is (= (stemming "stronghold") "stronghold"))))

(deftest test-0222
  (testing "testting case 222"
    (is (= (stemming "American") "American"))))

(deftest test-0223
  (testing "testting case 223"
    (is (= (stemming "imperialists") "imperialist"))))

(deftest test-0224
  (testing "testting case 224"
    (is (= (stemming "and") "and"))))

(deftest test-0225
  (testing "testting case 225"
    (is (= (stemming "the") "the"))))

(deftest test-0226
  (testing "testting case 226"
    (is (= (stemming "nest") "nest"))))

(deftest test-0227
  (testing "testting case 227"
    (is (= (stemming "evil") "evil"))))

(deftest test-0228
  (testing "testting case 228"
    (is (= (stemming "and") "and"))))

(deftest test-0229
  (testing "testting case 229"
    (is (= (stemming "its") "it"))))

(deftest test-0230
  (testing "testting case 230"
    (is (= (stemming "followers") "follow"))))

(deftest test-0231
  (testing "testting case 231"
    (is (= (stemming "into") "into"))))

(deftest test-0232
  (testing "testting case 232"
    (is (= (stemming "sea") "sea"))))

(deftest test-0233
  (testing "testting case 233"
    (is (= (stemming "fire") "fire"))))

(deftest test-0234
  (testing "testting case 234"
    (is (= (stemming "His") "Hi"))))

(deftest test-0235
  (testing "testting case 235"
    (is (= (stemming "comment") "comment"))))

(deftest test-0236
  (testing "testting case 236"
    (is (= (stemming "made") "made"))))

(deftest test-0237
  (testing "testting case 237"
    (is (= (stemming "during") "dure"))))

(deftest test-0238
  (testing "testting case 238"
    (is (= (stemming "speech") "speech"))))

(deftest test-0239
  (testing "testting case 239"
    (is (= (stemming "before") "befor"))))

(deftest test-0240
  (testing "testting case 240"
    (is (= (stemming "mass") "mass"))))

(deftest test-0241
  (testing "testting case 241"
    (is (= (stemming "rally") "ralli"))))

(deftest test-0242
  (testing "testting case 242"
    (is (= (stemming "Pyongyang") "Pyongyang"))))

(deftest test-0243
  (testing "testting case 243"
    (is (= (stemming "Thursday") "Thursdai"))))

(deftest test-0244
  (testing "testting case 244"
    (is (= (stemming "was") "wa"))))

(deftest test-0245
  (testing "testting case 245"
    (is (= (stemming "carried") "carri"))))

(deftest test-0246
  (testing "testting case 246"
    (is (= (stemming "the") "the"))))

(deftest test-0247
  (testing "testting case 247"
    (is (= (stemming "North") "North"))))

(deftest test-0248
  (testing "testting case 248"
    (is (= (stemming "main") "main"))))

(deftest test-0249
  (testing "testting case 249"
    (is (= (stemming "party") "parti"))))

(deftest test-0250
  (testing "testting case 250"
    (is (= (stemming "newspaper") "newspap"))))

(deftest test-0251
  (testing "testting case 251"
    (is (= (stemming "Rodong") "Rodong"))))

(deftest test-0252
  (testing "testting case 252"
    (is (= (stemming "Sinmun") "Sinmun"))))

(deftest test-0253
  (testing "testting case 253"
    (is (= (stemming "Friday") "Fridai"))))

(deftest test-0254
  (testing "testting case 254"
    (is (= (stemming "the") "the"))))

(deftest test-0255
  (testing "testting case 255"
    (is (= (stemming "last") "last"))))

(deftest test-0256
  (testing "testting case 256"
    (is (= (stemming "few") "few"))))

(deftest test-0257
  (testing "testting case 257"
    (is (= (stemming "days") "dai"))))

(deftest test-0258
  (testing "testting case 258"
    (is (= (stemming "the") "the"))))

(deftest test-0259
  (testing "testting case 259"
    (is (= (stemming "state") "state"))))

(deftest test-0260
  (testing "testting case 260"
    (is (= (stemming "run") "run"))))

(deftest test-0261
  (testing "testting case 261"
    (is (= (stemming "North") "North"))))

(deftest test-0262
  (testing "testting case 262"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0263
  (testing "testting case 263"
    (is (= (stemming "media") "media"))))

(deftest test-0264
  (testing "testting case 264"
    (is (= (stemming "has") "ha"))))

(deftest test-0265
  (testing "testting case 265"
    (is (= (stemming "carried") "carri"))))

(deftest test-0266
  (testing "testting case 266"
    (is (= (stemming "slew") "slew"))))

(deftest test-0267
  (testing "testting case 267"
    (is (= (stemming "official") "offici"))))

(deftest test-0268
  (testing "testting case 268"
    (is (= (stemming "remarks") "remark"))))

(deftest test-0269
  (testing "testting case 269"
    (is (= (stemming "threatening") "threaten"))))

(deftest test-0270
  (testing "testting case 270"
    (is (= (stemming "launch") "launch"))))

(deftest test-0271
  (testing "testting case 271"
    (is (= (stemming "pre") "pre"))))

(deftest test-0272
  (testing "testting case 272"
    (is (= (stemming "emptive") "emptiv"))))

(deftest test-0273
  (testing "testting case 273"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0274
  (testing "testting case 274"
    (is (= (stemming "strikes") "strike"))))

(deftest test-0275
  (testing "testting case 275"
    (is (= (stemming "Washington") "Washington"))))

(deftest test-0276
  (testing "testting case 276"
    (is (= (stemming "and") "and"))))

(deftest test-0277
  (testing "testting case 277"
    (is (= (stemming "Seoul") "Seoul"))))

(deftest test-0278
  (testing "testting case 278"
    (is (= (stemming "with") "with"))))

(deftest test-0279
  (testing "testting case 279"
    (is (= (stemming "lighter") "lighter"))))

(deftest test-0280
  (testing "testting case 280"
    (is (= (stemming "and") "and"))))

(deftest test-0281
  (testing "testting case 281"
    (is (= (stemming "smaller") "smaller"))))

(deftest test-0282
  (testing "testting case 282"
    (is (= (stemming "nukes") "nuke"))))

(deftest test-0283
  (testing "testting case 283"
    (is (= (stemming "hinting") "hint"))))

(deftest test-0284
  (testing "testting case 284"
    (is (= (stemming "that") "that"))))

(deftest test-0285
  (testing "testting case 285"
    (is (= (stemming "has") "ha"))))

(deftest test-0286
  (testing "testting case 286"
    (is (= (stemming "built") "built"))))

(deftest test-0287
  (testing "testting case 287"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0288
  (testing "testting case 288"
    (is (= (stemming "warheads") "warhead"))))

(deftest test-0289
  (testing "testting case 289"
    (is (= (stemming "small") "small"))))

(deftest test-0290
  (testing "testting case 290"
    (is (= (stemming "enough") "enough"))))

(deftest test-0291
  (testing "testting case 291"
    (is (= (stemming "mount") "mount"))))

(deftest test-0292
  (testing "testting case 292"
    (is (= (stemming "long") "long"))))

(deftest test-0293
  (testing "testting case 293"
    (is (= (stemming "range") "rang"))))

(deftest test-0294
  (testing "testting case 294"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0295
  (testing "testting case 295"
    (is (= (stemming "But") "But"))))

(deftest test-0296
  (testing "testting case 296"
    (is (= (stemming "and") "and"))))

(deftest test-0297
  (testing "testting case 297"
    (is (= (stemming "South") "South"))))

(deftest test-0298
  (testing "testting case 298"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0299
  (testing "testting case 299"
    (is (= (stemming "officials") "offici"))))

(deftest test-0300
  (testing "testting case 300"
    (is (= (stemming "strongly") "strongli"))))

(deftest test-0301
  (testing "testting case 301"
    (is (= (stemming "doubt") "doubt"))))

(deftest test-0302
  (testing "testting case 302"
    (is (= (stemming "North") "North"))))

(deftest test-0303
  (testing "testting case 303"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0304
  (testing "testting case 304"
    (is (= (stemming "has") "ha"))))

(deftest test-0305
  (testing "testting case 305"
    (is (= (stemming "mastered") "master"))))

(deftest test-0306
  (testing "testting case 306"
    (is (= (stemming "that") "that"))))

(deftest test-0307
  (testing "testting case 307"
    (is (= (stemming "technology") "technolog"))))

(deftest test-0308
  (testing "testting case 308"
    (is (= (stemming "despite") "despit"))))

(deftest test-0309
  (testing "testting case 309"
    (is (= (stemming "its") "it"))))

(deftest test-0310
  (testing "testting case 310"
    (is (= (stemming "successful") "success"))))

(deftest test-0311
  (testing "testting case 311"
    (is (= (stemming "launching") "launch"))))

(deftest test-0312
  (testing "testting case 312"
    (is (= (stemming "long") "long"))))

(deftest test-0313
  (testing "testting case 313"
    (is (= (stemming "range") "rang"))))

(deftest test-0314
  (testing "testting case 314"
    (is (= (stemming "rocket") "rocket"))))

(deftest test-0315
  (testing "testting case 315"
    (is (= (stemming "December") "Decemb"))))

(deftest test-0316
  (testing "testting case 316"
    (is (= (stemming "and") "and"))))

(deftest test-0317
  (testing "testting case 317"
    (is (= (stemming "its") "it"))))

(deftest test-0318
  (testing "testting case 318"
    (is (= (stemming "third") "third"))))

(deftest test-0319
  (testing "testting case 319"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0320
  (testing "testting case 320"
    (is (= (stemming "test") "test"))))

(deftest test-0321
  (testing "testting case 321"
    (is (= (stemming "last") "last"))))

(deftest test-0322
  (testing "testting case 322"
    (is (= (stemming "month") "month"))))

(deftest test-0323
  (testing "testting case 323"
    (is (= (stemming "South") "South"))))

(deftest test-0324
  (testing "testting case 324"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0325
  (testing "testting case 325"
    (is (= (stemming "military") "militari"))))

(deftest test-0326
  (testing "testting case 326"
    (is (= (stemming "officials") "offici"))))

(deftest test-0327
  (testing "testting case 327"
    (is (= (stemming "called") "call"))))

(deftest test-0328
  (testing "testting case 328"
    (is (= (stemming "the") "the"))))

(deftest test-0329
  (testing "testting case 329"
    (is (= (stemming "remarks") "remark"))))

(deftest test-0330
  (testing "testting case 330"
    (is (= (stemming "bluster") "bluster"))))

(deftest test-0331
  (testing "testting case 331"
    (is (= (stemming "designed") "design"))))

(deftest test-0332
  (testing "testting case 332"
    (is (= (stemming "not") "not"))))

(deftest test-0333
  (testing "testting case 333"
    (is (= (stemming "much") "much"))))

(deftest test-0334
  (testing "testting case 334"
    (is (= (stemming "threaten") "threaten"))))

(deftest test-0335
  (testing "testting case 335"
    (is (= (stemming "Washington") "Washington"))))

(deftest test-0336
  (testing "testting case 336"
    (is (= (stemming "infuse") "infus"))))

(deftest test-0337
  (testing "testting case 337"
    (is (= (stemming "its") "it"))))

(deftest test-0338
  (testing "testting case 338"
    (is (= (stemming "population") "popul"))))

(deftest test-0339
  (testing "testting case 339"
    (is (= (stemming "with") "with"))))

(deftest test-0340
  (testing "testting case 340"
    (is (= (stemming "sense") "sens"))))

(deftest test-0341
  (testing "testting case 341"
    (is (= (stemming "both") "both"))))

(deftest test-0342
  (testing "testting case 342"
    (is (= (stemming "crisis") "crisi"))))

(deftest test-0343
  (testing "testting case 343"
    (is (= (stemming "and") "and"))))

(deftest test-0344
  (testing "testting case 344"
    (is (= (stemming "empowerment") "empower"))))

(deftest test-0345
  (testing "testting case 345"
    (is (= (stemming "Kim") "Kim"))))

(deftest test-0346
  (testing "testting case 346"
    (is (= (stemming "Jong") "Jong"))))

(deftest test-0347
  (testing "testting case 347"
    (is (= (stemming "consolidates") "consolid"))))

(deftest test-0348
  (testing "testting case 348"
    (is (= (stemming "his") "hi"))))

(deftest test-0349
  (testing "testting case 349"
    (is (= (stemming "grip") "grip"))))

(deftest test-0350
  (testing "testting case 350"
    (is (= (stemming "North") "North"))))

(deftest test-0351
  (testing "testting case 351"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0352
  (testing "testting case 352"
    (is (= (stemming "its") "it"))))

(deftest test-0353
  (testing "testting case 353"
    (is (= (stemming "front") "front"))))

(deftest test-0354
  (testing "testting case 354"
    (is (= (stemming "page") "page"))))

(deftest test-0355
  (testing "testting case 355"
    (is (= (stemming "the") "the"))))

(deftest test-0356
  (testing "testting case 356"
    (is (= (stemming "Rodong") "Rodong"))))

(deftest test-0357
  (testing "testting case 357"
    (is (= (stemming "newspaper") "newspap"))))

(deftest test-0358
  (testing "testting case 358"
    (is (= (stemming "carried") "carri"))))

(deftest test-0359
  (testing "testting case 359"
    (is (= (stemming "large") "larg"))))

(deftest test-0360
  (testing "testting case 360"
    (is (= (stemming "picture") "pictur"))))

(deftest test-0361
  (testing "testting case 361"
    (is (= (stemming "showing") "show"))))

(deftest test-0362
  (testing "testting case 362"
    (is (= (stemming "North") "North"))))

(deftest test-0363
  (testing "testting case 363"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0364
  (testing "testting case 364"
    (is (= (stemming "new") "new"))))

(deftest test-0365
  (testing "testting case 365"
    (is (= (stemming "generation") "gener"))))

(deftest test-0366
  (testing "testting case 366"
    (is (= (stemming "mobile") "mobil"))))

(deftest test-0367
  (testing "testting case 367"
    (is (= (stemming "missiles") "missil"))))

(deftest test-0368
  (testing "testting case 368"
    (is (= (stemming "South") "South"))))

(deftest test-0369
  (testing "testting case 369"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0370
  (testing "testting case 370"
    (is (= (stemming "new") "new"))))

(deftest test-0371
  (testing "testting case 371"
    (is (= (stemming "leader") "leader"))))

(deftest test-0372
  (testing "testting case 372"
    (is (= (stemming "warned") "warn"))))

(deftest test-0373
  (testing "testting case 373"
    (is (= (stemming "that") "that"))))

(deftest test-0374
  (testing "testting case 374"
    (is (= (stemming "with") "with"))))

(deftest test-0375
  (testing "testting case 375"
    (is (= (stemming "its") "it"))))

(deftest test-0376
  (testing "testting case 376"
    (is (= (stemming "behavior") "behavior"))))

(deftest test-0377
  (testing "testting case 377"
    (is (= (stemming "North") "North"))))

(deftest test-0378
  (testing "testting case 378"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0379
  (testing "testting case 379"
    (is (= (stemming "was") "wa"))))

(deftest test-0380
  (testing "testting case 380"
    (is (= (stemming "only") "onli"))))

(deftest test-0381
  (testing "testting case 381"
    (is (= (stemming "hurting") "hurt"))))

(deftest test-0382
  (testing "testting case 382"
    (is (= (stemming "itself") "itself"))))

(deftest test-0383
  (testing "testting case 383"
    (is (= (stemming "North") "North"))))

(deftest test-0384
  (testing "testting case 384"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0385
  (testing "testting case 385"
    (is (= (stemming "will") "will"))))

(deftest test-0386
  (testing "testting case 386"
    (is (= (stemming "collapse") "collaps"))))

(deftest test-0387
  (testing "testting case 387"
    (is (= (stemming "self") "self"))))

(deftest test-0388
  (testing "testting case 388"
    (is (= (stemming "destruction") "destruct"))))

(deftest test-0389
  (testing "testting case 389"
    (is (= (stemming "continue") "continu"))))

(deftest test-0390
  (testing "testting case 390"
    (is (= (stemming "waste") "wast"))))

(deftest test-0391
  (testing "testting case 391"
    (is (= (stemming "its") "it"))))

(deftest test-0392
  (testing "testting case 392"
    (is (= (stemming "resources") "resourc"))))

(deftest test-0393
  (testing "testting case 393"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0394
  (testing "testting case 394"
    (is (= (stemming "weapons") "weapon"))))

(deftest test-0395
  (testing "testting case 395"
    (is (= (stemming "development") "develop"))))

(deftest test-0396
  (testing "testting case 396"
    (is (= (stemming "while") "while"))))

(deftest test-0397
  (testing "testting case 397"
    (is (= (stemming "its") "it"))))

(deftest test-0398
  (testing "testting case 398"
    (is (= (stemming "people") "peopl"))))

(deftest test-0399
  (testing "testting case 399"
    (is (= (stemming "are") "ar"))))

(deftest test-0400
  (testing "testting case 400"
    (is (= (stemming "going") "go"))))

(deftest test-0401
  (testing "testting case 401"
    (is (= (stemming "hungry") "hungri"))))

(deftest test-0402
  (testing "testting case 402"
    (is (= (stemming "President") "Presid"))))

(deftest test-0403
  (testing "testting case 403"
    (is (= (stemming "Park") "Park"))))

(deftest test-0404
  (testing "testting case 404"
    (is (= (stemming "said") "said"))))

(deftest test-0405
  (testing "testting case 405"
    (is (= (stemming "during") "dure"))))

(deftest test-0406
  (testing "testting case 406"
    (is (= (stemming "commission") "commiss"))))

(deftest test-0407
  (testing "testting case 407"
    (is (= (stemming "ceremony") "ceremoni"))))

(deftest test-0408
  (testing "testting case 408"
    (is (= (stemming "for") "for"))))

(deftest test-0409
  (testing "testting case 409"
    (is (= (stemming "young") "young"))))

(deftest test-0410
  (testing "testting case 410"
    (is (= (stemming "military") "militari"))))

(deftest test-0411
  (testing "testting case 411"
    (is (= (stemming "officers") "offic"))))

(deftest test-0412
  (testing "testting case 412"
    (is (= (stemming "Friday") "Fridai"))))

(deftest test-0413
  (testing "testting case 413"
    (is (= (stemming "She") "She"))))

(deftest test-0414
  (testing "testting case 414"
    (is (= (stemming "promised") "promis"))))

(deftest test-0415
  (testing "testting case 415"
    (is (= (stemming "strong") "strong"))))

(deftest test-0416
  (testing "testting case 416"
    (is (= (stemming "response") "respons"))))

(deftest test-0417
  (testing "testting case 417"
    (is (= (stemming "provocation") "provoc"))))

(deftest test-0418
  (testing "testting case 418"
    (is (= (stemming "but") "but"))))

(deftest test-0419
  (testing "testting case 419"
    (is (= (stemming "also") "also"))))

(deftest test-0420
  (testing "testting case 420"
    (is (= (stemming "offered") "offer"))))

(deftest test-0421
  (testing "testting case 421"
    (is (= (stemming "cooperative") "cooper"))))

(deftest test-0422
  (testing "testting case 422"
    (is (= (stemming "future") "futur"))))

(deftest test-0423
  (testing "testting case 423"
    (is (= (stemming "North") "North"))))

(deftest test-0424
  (testing "testting case 424"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0425
  (testing "testting case 425"
    (is (= (stemming "changed") "chang"))))

(deftest test-0426
  (testing "testting case 426"
    (is (= (stemming "Also") "Also"))))

(deftest test-0427
  (testing "testting case 427"
    (is (= (stemming "Friday") "Fridai"))))

(deftest test-0428
  (testing "testting case 428"
    (is (= (stemming "North") "North"))))

(deftest test-0429
  (testing "testting case 429"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0430
  (testing "testting case 430"
    (is (= (stemming "said") "said"))))

(deftest test-0431
  (testing "testting case 431"
    (is (= (stemming "was") "wa"))))

(deftest test-0432
  (testing "testting case 432"
    (is (= (stemming "nullifying") "nullifi"))))

(deftest test-0433
  (testing "testting case 433"
    (is (= (stemming "all") "all"))))

(deftest test-0434
  (testing "testting case 434"
    (is (= (stemming "agreements") "agreement"))))

(deftest test-0435
  (testing "testting case 435"
    (is (= (stemming "nonaggression") "nonaggress"))))

(deftest test-0436
  (testing "testting case 436"
    (is (= (stemming "and") "and"))))

(deftest test-0437
  (testing "testting case 437"
    (is (= (stemming "denuclearization") "denuclear"))))

(deftest test-0438
  (testing "testting case 438"
    (is (= (stemming "with") "with"))))

(deftest test-0439
  (testing "testting case 439"
    (is (= (stemming "South") "South"))))

(deftest test-0440
  (testing "testting case 440"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0441
  (testing "testting case 441"
    (is (= (stemming "and") "and"))))

(deftest test-0442
  (testing "testting case 442"
    (is (= (stemming "cutting") "cut"))))

(deftest test-0443
  (testing "testting case 443"
    (is (= (stemming "off") "off"))))

(deftest test-0444
  (testing "testting case 444"
    (is (= (stemming "the") "the"))))

(deftest test-0445
  (testing "testting case 445"
    (is (= (stemming "North") "North"))))

(deftest test-0446
  (testing "testting case 446"
    (is (= (stemming "South") "South"))))

(deftest test-0447
  (testing "testting case 447"
    (is (= (stemming "hot") "hot"))))

(deftest test-0448
  (testing "testting case 448"
    (is (= (stemming "line") "line"))))

(deftest test-0449
  (testing "testting case 449"
    (is (= (stemming "retaliation") "retali"))))

(deftest test-0450
  (testing "testting case 450"
    (is (= (stemming "for") "for"))))

(deftest test-0451
  (testing "testting case 451"
    (is (= (stemming "the") "the"))))

(deftest test-0452
  (testing "testting case 452"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0453
  (testing "testting case 453"
    (is (= (stemming "and") "and"))))

(deftest test-0454
  (testing "testting case 454"
    (is (= (stemming "the") "the"))))

(deftest test-0455
  (testing "testting case 455"
    (is (= (stemming "joint") "joint"))))

(deftest test-0456
  (testing "testting case 456"
    (is (= (stemming "military") "militari"))))

(deftest test-0457
  (testing "testting case 457"
    (is (= (stemming "exercises") "exercis"))))

(deftest test-0458
  (testing "testting case 458"
    (is (= (stemming "South") "South"))))

(deftest test-0459
  (testing "testting case 459"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0460
  (testing "testting case 460"
    (is (= (stemming "was") "wa"))))

(deftest test-0461
  (testing "testting case 461"
    (is (= (stemming "staging") "stage"))))

(deftest test-0462
  (testing "testting case 462"
    (is (= (stemming "with") "with"))))

(deftest test-0463
  (testing "testting case 463"
    (is (= (stemming "the") "the"))))

(deftest test-0464
  (testing "testting case 464"
    (is (= (stemming "United") "Unite"))))

(deftest test-0465
  (testing "testting case 465"
    (is (= (stemming "States") "State"))))

(deftest test-0466
  (testing "testting case 466"
    (is (= (stemming "But") "But"))))

(deftest test-0467
  (testing "testting case 467"
    (is (= (stemming "beyond") "beyond"))))

(deftest test-0468
  (testing "testting case 468"
    (is (= (stemming "North") "North"))))

(deftest test-0469
  (testing "testting case 469"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0470
  (testing "testting case 470"
    (is (= (stemming "belligerent") "belliger"))))

(deftest test-0471
  (testing "testting case 471"
    (is (= (stemming "statements") "statement"))))

(deftest test-0472
  (testing "testting case 472"
    (is (= (stemming "was") "wa"))))

(deftest test-0473
  (testing "testting case 473"
    (is (= (stemming "unclear") "unclear"))))

(deftest test-0474
  (testing "testting case 474"
    (is (= (stemming "how") "how"))))

(deftest test-0475
  (testing "testting case 475"
    (is (= (stemming "all") "all"))))

(deftest test-0476
  (testing "testting case 476"
    (is (= (stemming "the") "the"))))

(deftest test-0477
  (testing "testting case 477"
    (is (= (stemming "country") "countri"))))

(deftest test-0478
  (testing "testting case 478"
    (is (= (stemming "young") "young"))))

(deftest test-0479
  (testing "testting case 479"
    (is (= (stemming "and") "and"))))

(deftest test-0480
  (testing "testting case 480"
    (is (= (stemming "untested") "untest"))))

(deftest test-0481
  (testing "testting case 481"
    (is (= (stemming "leader") "leader"))))

(deftest test-0482
  (testing "testting case 482"
    (is (= (stemming "would") "would"))))

(deftest test-0483
  (testing "testting case 483"
    (is (= (stemming "react") "react"))))

(deftest test-0484
  (testing "testting case 484"
    (is (= (stemming "the") "the"))))

(deftest test-0485
  (testing "testting case 485"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0486
  (testing "testting case 486"
    (is (= (stemming "Any") "Any"))))

(deftest test-0487
  (testing "testting case 487"
    (is (= (stemming "North") "North"))))

(deftest test-0488
  (testing "testting case 488"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0489
  (testing "testting case 489"
    (is (= (stemming "military") "militari"))))

(deftest test-0490
  (testing "testting case 490"
    (is (= (stemming "action") "action"))))

(deftest test-0491
  (testing "testting case 491"
    (is (= (stemming "could") "could"))))

(deftest test-0492
  (testing "testting case 492"
    (is (= (stemming "end") "end"))))

(deftest test-0493
  (testing "testting case 493"
    (is (= (stemming "involving") "involv"))))

(deftest test-0494
  (testing "testting case 494"
    (is (= (stemming "the") "the"))))

(deftest test-0495
  (testing "testting case 495"
    (is (= (stemming "American") "American"))))

(deftest test-0496
  (testing "testting case 496"
    (is (= (stemming "forces") "forc"))))

(deftest test-0497
  (testing "testting case 497"
    (is (= (stemming "that") "that"))))

(deftest test-0498
  (testing "testting case 498"
    (is (= (stemming "have") "have"))))

(deftest test-0499
  (testing "testting case 499"
    (is (= (stemming "remained") "remain"))))

(deftest test-0500
  (testing "testting case 500"
    (is (= (stemming "South") "South"))))

(deftest test-0501
  (testing "testting case 501"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0502
  (testing "testting case 502"
    (is (= (stemming "has") "ha"))))

(deftest test-0503
  (testing "testting case 503"
    (is (= (stemming "turned") "turn"))))

(deftest test-0504
  (testing "testting case 504"
    (is (= (stemming "from") "from"))))

(deftest test-0505
  (testing "testting case 505"
    (is (= (stemming "war") "war"))))

(deftest test-0506
  (testing "testting case 506"
    (is (= (stemming "ravaged") "ravag"))))

(deftest test-0507
  (testing "testting case 507"
    (is (= (stemming "ruin") "ruin"))))

(deftest test-0508
  (testing "testting case 508"
    (is (= (stemming "into") "into"))))

(deftest test-0509
  (testing "testting case 509"
    (is (= (stemming "one") "on"))))

(deftest test-0510
  (testing "testting case 510"
    (is (= (stemming "the") "the"))))

(deftest test-0511
  (testing "testting case 511"
    (is (= (stemming "most") "most"))))

(deftest test-0512
  (testing "testting case 512"
    (is (= (stemming "advanced") "advanc"))))

(deftest test-0513
  (testing "testting case 513"
    (is (= (stemming "industrialized") "industri"))))

(deftest test-0514
  (testing "testting case 514"
    (is (= (stemming "powerhouses") "powerhous"))))

(deftest test-0515
  (testing "testting case 515"
    (is (= (stemming "The") "The"))))

(deftest test-0516
  (testing "testting case 516"
    (is (= (stemming "Security") "Secur"))))

(deftest test-0517
  (testing "testting case 517"
    (is (= (stemming "Council") "Council"))))

(deftest test-0518
  (testing "testting case 518"
    (is (= (stemming "vote") "vote"))))

(deftest test-0519
  (testing "testting case 519"
    (is (= (stemming "places") "place"))))

(deftest test-0520
  (testing "testting case 520"
    (is (= (stemming "potentially") "potenti"))))

(deftest test-0521
  (testing "testting case 521"
    (is (= (stemming "painful") "pain"))))

(deftest test-0522
  (testing "testting case 522"
    (is (= (stemming "new") "new"))))

(deftest test-0523
  (testing "testting case 523"
    (is (= (stemming "constraints") "constraint"))))

(deftest test-0524
  (testing "testting case 524"
    (is (= (stemming "North") "North"))))

(deftest test-0525
  (testing "testting case 525"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0526
  (testing "testting case 526"
    (is (= (stemming "banking") "bank"))))

(deftest test-0527
  (testing "testting case 527"
    (is (= (stemming "trade") "trade"))))

(deftest test-0528
  (testing "testting case 528"
    (is (= (stemming "and") "and"))))

(deftest test-0529
  (testing "testting case 529"
    (is (= (stemming "travel") "travel"))))

(deftest test-0530
  (testing "testting case 530"
    (is (= (stemming "pressures") "pressur"))))

(deftest test-0531
  (testing "testting case 531"
    (is (= (stemming "countries") "countri"))))

(deftest test-0532
  (testing "testting case 532"
    (is (= (stemming "search") "search"))))

(deftest test-0533
  (testing "testting case 533"
    (is (= (stemming "suspect") "suspect"))))

(deftest test-0534
  (testing "testting case 534"
    (is (= (stemming "North") "North"))))

(deftest test-0535
  (testing "testting case 535"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0536
  (testing "testting case 536"
    (is (= (stemming "cargo") "cargo"))))

(deftest test-0537
  (testing "testting case 537"
    (is (= (stemming "and") "and"))))

(deftest test-0538
  (testing "testting case 538"
    (is (= (stemming "includes") "includ"))))

(deftest test-0539
  (testing "testting case 539"
    (is (= (stemming "new") "new"))))

(deftest test-0540
  (testing "testting case 540"
    (is (= (stemming "enforcement") "enforc"))))

(deftest test-0541
  (testing "testting case 541"
    (is (= (stemming "language") "languag"))))

(deftest test-0542
  (testing "testting case 542"
    (is (= (stemming "absent") "absent"))))

(deftest test-0543
  (testing "testting case 543"
    (is (= (stemming "from") "from"))))

(deftest test-0544
  (testing "testting case 544"
    (is (= (stemming "previous") "previou"))))

(deftest test-0545
  (testing "testting case 545"
    (is (= (stemming "measures") "measur"))))

(deftest test-0546
  (testing "testting case 546"
    (is (= (stemming "But") "But"))))

(deftest test-0547
  (testing "testting case 547"
    (is (= (stemming "the") "the"))))

(deftest test-0548
  (testing "testting case 548"
    (is (= (stemming "provisions") "provis"))))

(deftest test-0549
  (testing "testting case 549"
    (is (= (stemming "are") "ar"))))

(deftest test-0550
  (testing "testting case 550"
    (is (= (stemming "some") "some"))))

(deftest test-0551
  (testing "testting case 551"
    (is (= (stemming "ways") "wai"))))

(deftest test-0552
  (testing "testting case 552"
    (is (= (stemming "less") "less"))))

(deftest test-0553
  (testing "testting case 553"
    (is (= (stemming "important") "import"))))

(deftest test-0554
  (testing "testting case 554"
    (is (= (stemming "than") "than"))))

(deftest test-0555
  (testing "testting case 555"
    (is (= (stemming "China") "China"))))

(deftest test-0556
  (testing "testting case 556"
    (is (= (stemming "participation") "particip"))))

(deftest test-0557
  (testing "testting case 557"
    (is (= (stemming "writing") "write"))))

(deftest test-0558
  (testing "testting case 558"
    (is (= (stemming "them") "them"))))

(deftest test-0559
  (testing "testting case 559"
    (is (= (stemming "suggesting") "suggest"))))

(deftest test-0560
  (testing "testting case 560"
    (is (= (stemming "that") "that"))))

(deftest test-0561
  (testing "testting case 561"
    (is (= (stemming "the") "the"))))

(deftest test-0562
  (testing "testting case 562"
    (is (= (stemming "country") "countri"))))

(deftest test-0563
  (testing "testting case 563"
    (is (= (stemming "has") "ha"))))

(deftest test-0564
  (testing "testting case 564"
    (is (= (stemming "lost") "lost"))))

(deftest test-0565
  (testing "testting case 565"
    (is (= (stemming "patience") "patienc"))))

(deftest test-0566
  (testing "testting case 566"
    (is (= (stemming "with") "with"))))

(deftest test-0567
  (testing "testting case 567"
    (is (= (stemming "the") "the"))))

(deftest test-0568
  (testing "testting case 568"
    (is (= (stemming "neighbor") "neighbor"))))

(deftest test-0569
  (testing "testting case 569"
    (is (= (stemming "supported") "support"))))

(deftest test-0570
  (testing "testting case 570"
    (is (= (stemming "the") "the"))))

(deftest test-0571
  (testing "testting case 571"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0572
  (testing "testting case 572"
    (is (= (stemming "War") "War"))))

(deftest test-0573
  (testing "testting case 573"
    (is (= (stemming "While") "While"))))

(deftest test-0574
  (testing "testting case 574"
    (is (= (stemming "China") "China"))))

(deftest test-0575
  (testing "testting case 575"
    (is (= (stemming "enforcement") "enforc"))))

(deftest test-0576
  (testing "testting case 576"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0577
  (testing "testting case 577"
    (is (= (stemming "North") "North"))))

(deftest test-0578
  (testing "testting case 578"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0579
  (testing "testting case 579"
    (is (= (stemming "remains") "remain"))))

(deftest test-0580
  (testing "testting case 580"
    (is (= (stemming "seen") "seen"))))

(deftest test-0581
  (testing "testting case 581"
    (is (= (stemming "may") "mai"))))

(deftest test-0582
  (testing "testting case 582"
    (is (= (stemming "now") "now"))))

(deftest test-0583
  (testing "testting case 583"
    (is (= (stemming "more") "more"))))

(deftest test-0584
  (testing "testting case 584"
    (is (= (stemming "assertive") "assert"))))

(deftest test-0585
  (testing "testting case 585"
    (is (= (stemming "This") "Thi"))))

(deftest test-0586
  (testing "testting case 586"
    (is (= (stemming "not") "not"))))

(deftest test-0587
  (testing "testting case 587"
    (is (= (stemming "about") "about"))))

(deftest test-0588
  (testing "testting case 588"
    (is (= (stemming "the") "the"))))

(deftest test-0589
  (testing "testting case 589"
    (is (= (stemming "words") "word"))))

(deftest test-0590
  (testing "testting case 590"
    (is (= (stemming "about") "about"))))

(deftest test-0591
  (testing "testting case 591"
    (is (= (stemming "the") "the"))))

(deftest test-0592
  (testing "testting case 592"
    (is (= (stemming "music") "music"))))

(deftest test-0593
  (testing "testting case 593"
    (is (= (stemming "said") "said"))))

(deftest test-0594
  (testing "testting case 594"
    (is (= (stemming "Christopher") "Christoph"))))

(deftest test-0595
  (testing "testting case 595"
    (is (= (stemming "Hill") "Hill"))))

(deftest test-0596
  (testing "testting case 596"
    (is (= (stemming "the") "the"))))

(deftest test-0597
  (testing "testting case 597"
    (is (= (stemming "former") "former"))))

(deftest test-0598
  (testing "testting case 598"
    (is (= (stemming "American") "American"))))

(deftest test-0599
  (testing "testting case 599"
    (is (= (stemming "diplomat") "diplomat"))))

(deftest test-0600
  (testing "testting case 600"
    (is (= (stemming "who") "who"))))

(deftest test-0601
  (testing "testting case 601"
    (is (= (stemming "negotiated") "negoti"))))

(deftest test-0602
  (testing "testting case 602"
    (is (= (stemming "deal") "deal"))))

(deftest test-0603
  (testing "testting case 603"
    (is (= (stemming "with") "with"))))

(deftest test-0604
  (testing "testting case 604"
    (is (= (stemming "the") "the"))))

(deftest test-0605
  (testing "testting case 605"
    (is (= (stemming "North") "North"))))

(deftest test-0606
  (testing "testting case 606"
    (is (= (stemming "during") "dure"))))

(deftest test-0607
  (testing "testting case 607"
    (is (= (stemming "the") "the"))))

(deftest test-0608
  (testing "testting case 608"
    (is (= (stemming "George") "Georg"))))

(deftest test-0609
  (testing "testting case 609"
    (is (= (stemming "Bush") "Bush"))))

(deftest test-0610
  (testing "testting case 610"
    (is (= (stemming "administration") "administr"))))

(deftest test-0611
  (testing "testting case 611"
    (is (= (stemming "dismantle") "dismantl"))))

(deftest test-0612
  (testing "testting case 612"
    (is (= (stemming "its") "it"))))

(deftest test-0613
  (testing "testting case 613"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0614
  (testing "testting case 614"
    (is (= (stemming "facilities") "facil"))))

(deftest test-0615
  (testing "testting case 615"
    (is (= (stemming "accord") "accord"))))

(deftest test-0616
  (testing "testting case 616"
    (is (= (stemming "that") "that"))))

(deftest test-0617
  (testing "testting case 617"
    (is (= (stemming "quickly") "quickli"))))

(deftest test-0618
  (testing "testting case 618"
    (is (= (stemming "collapsed") "collaps"))))

(deftest test-0619
  (testing "testting case 619"
    (is (= (stemming "China") "China"))))

(deftest test-0620
  (testing "testting case 620"
    (is (= (stemming "cosponsorship") "cosponsorship"))))

(deftest test-0621
  (testing "testting case 621"
    (is (= (stemming "the") "the"))))

(deftest test-0622
  (testing "testting case 622"
    (is (= (stemming "resolution") "resolut"))))

(deftest test-0623
  (testing "testting case 623"
    (is (= (stemming "suggests") "suggest"))))

(deftest test-0624
  (testing "testting case 624"
    (is (= (stemming "that") "that"))))

(deftest test-0625
  (testing "testting case 625"
    (is (= (stemming "after") "after"))))

(deftest test-0626
  (testing "testting case 626"
    (is (= (stemming "many") "mani"))))

(deftest test-0627
  (testing "testting case 627"
    (is (= (stemming "years") "year"))))

(deftest test-0628
  (testing "testting case 628"
    (is (= (stemming "the") "the"))))

(deftest test-0629
  (testing "testting case 629"
    (is (= (stemming "screws") "screw"))))

(deftest test-0630
  (testing "testting case 630"
    (is (= (stemming "are") "ar"))))

(deftest test-0631
  (testing "testting case 631"
    (is (= (stemming "beginning") "begin"))))

(deftest test-0632
  (testing "testting case 632"
    (is (= (stemming "turn") "turn"))))

(deftest test-0633
  (testing "testting case 633"
    (is (= (stemming "said") "said"))))

(deftest test-0634
  (testing "testting case 634"
    (is (= (stemming "Hill") "Hill"))))

(deftest test-0635
  (testing "testting case 635"
    (is (= (stemming "now") "now"))))

(deftest test-0636
  (testing "testting case 636"
    (is (= (stemming "the") "the"))))

(deftest test-0637
  (testing "testting case 637"
    (is (= (stemming "dean") "dean"))))

(deftest test-0638
  (testing "testting case 638"
    (is (= (stemming "the") "the"))))

(deftest test-0639
  (testing "testting case 639"
    (is (= (stemming "Josef") "Josef"))))

(deftest test-0640
  (testing "testting case 640"
    (is (= (stemming "Korbel") "Korbel"))))

(deftest test-0641
  (testing "testting case 641"
    (is (= (stemming "School") "School"))))

(deftest test-0642
  (testing "testting case 642"
    (is (= (stemming "International") "Internat"))))

(deftest test-0643
  (testing "testting case 643"
    (is (= (stemming "Studies") "Studi"))))

(deftest test-0644
  (testing "testting case 644"
    (is (= (stemming "the") "the"))))

(deftest test-0645
  (testing "testting case 645"
    (is (= (stemming "University") "Univers"))))

(deftest test-0646
  (testing "testting case 646"
    (is (= (stemming "Denver") "Denver"))))

(deftest test-0647
  (testing "testting case 647"
    (is (= (stemming "Still") "Still"))))

(deftest test-0648
  (testing "testting case 648"
    (is (= (stemming "another") "anoth"))))

(deftest test-0649
  (testing "testting case 649"
    (is (= (stemming "North") "North"))))

(deftest test-0650
  (testing "testting case 650"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0651
  (testing "testting case 651"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0652
  (testing "testting case 652"
    (is (= (stemming "test") "test"))))

(deftest test-0653
  (testing "testting case 653"
    (is (= (stemming "possible") "possibl"))))

(deftest test-0654
  (testing "testting case 654"
    (is (= (stemming "another") "anoth"))))

(deftest test-0655
  (testing "testting case 655"
    (is (= (stemming "ballistic") "ballist"))))

(deftest test-0656
  (testing "testting case 656"
    (is (= (stemming "missile") "missil"))))

(deftest test-0657
  (testing "testting case 657"
    (is (= (stemming "launching") "launch"))))

(deftest test-0658
  (testing "testting case 658"
    (is (= (stemming "perhaps") "perhap"))))

(deftest test-0659
  (testing "testting case 659"
    (is (= (stemming "armed") "arm"))))

(deftest test-0660
  (testing "testting case 660"
    (is (= (stemming "provocation") "provoc"))))

(deftest test-0661
  (testing "testting case 661"
    (is (= (stemming "aimed") "aim"))))

(deftest test-0662
  (testing "testting case 662"
    (is (= (stemming "South") "South"))))

(deftest test-0663
  (testing "testting case 663"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0664
  (testing "testting case 664"
    (is (= (stemming "where") "where"))))

(deftest test-0665
  (testing "testting case 665"
    (is (= (stemming "the") "the"))))

(deftest test-0666
  (testing "testting case 666"
    (is (= (stemming "new") "new"))))

(deftest test-0667
  (testing "testting case 667"
    (is (= (stemming "president") "presid"))))

(deftest test-0668
  (testing "testting case 668"
    (is (= (stemming "Park") "Park"))))

(deftest test-0669
  (testing "testting case 669"
    (is (= (stemming "the") "the"))))

(deftest test-0670
  (testing "testting case 670"
    (is (= (stemming "daughter") "daughter"))))

(deftest test-0671
  (testing "testting case 671"
    (is (= (stemming "former") "former"))))

(deftest test-0672
  (testing "testting case 672"
    (is (= (stemming "South") "South"))))

(deftest test-0673
  (testing "testting case 673"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0674
  (testing "testting case 674"
    (is (= (stemming "dictator") "dictat"))))

(deftest test-0675
  (testing "testting case 675"
    (is (= (stemming "who") "who"))))

(deftest test-0676
  (testing "testting case 676"
    (is (= (stemming "was") "wa"))))

(deftest test-0677
  (testing "testting case 677"
    (is (= (stemming "known") "known"))))

(deftest test-0678
  (testing "testting case 678"
    (is (= (stemming "for") "for"))))

(deftest test-0679
  (testing "testting case 679"
    (is (= (stemming "taking") "take"))))

(deftest test-0680
  (testing "testting case 680"
    (is (= (stemming "hard") "hard"))))

(deftest test-0681
  (testing "testting case 681"
    (is (= (stemming "stand") "stand"))))

(deftest test-0682
  (testing "testting case 682"
    (is (= (stemming "with") "with"))))

(deftest test-0683
  (testing "testting case 683"
    (is (= (stemming "the") "the"))))

(deftest test-0684
  (testing "testting case 684"
    (is (= (stemming "North") "North"))))

(deftest test-0685
  (testing "testting case 685"
    (is (= (stemming "could") "could"))))

(deftest test-0686
  (testing "testting case 686"
    (is (= (stemming "forced") "forc"))))

(deftest test-0687
  (testing "testting case 687"
    (is (= (stemming "respond") "respond"))))

(deftest test-0688
  (testing "testting case 688"
    (is (= (stemming "Some") "Some"))))

(deftest test-0689
  (testing "testting case 689"
    (is (= (stemming "regarded") "regard"))))

(deftest test-0690
  (testing "testting case 690"
    (is (= (stemming "the") "the"))))

(deftest test-0691
  (testing "testting case 691"
    (is (= (stemming "North") "North"))))

(deftest test-0692
  (testing "testting case 692"
    (is (= (stemming "dire") "dire"))))

(deftest test-0693
  (testing "testting case 693"
    (is (= (stemming "warnings") "warn"))))

(deftest test-0694
  (testing "testting case 694"
    (is (= (stemming "signal") "signal"))))

(deftest test-0695
  (testing "testting case 695"
    (is (= (stemming "that") "that"))))

(deftest test-0696
  (testing "testting case 696"
    (is (= (stemming "some") "some"))))

(deftest test-0697
  (testing "testting case 697"
    (is (= (stemming "military") "militari"))))

(deftest test-0698
  (testing "testting case 698"
    (is (= (stemming "response") "respons"))))

(deftest test-0699
  (testing "testting case 699"
    (is (= (stemming "was") "wa"))))

(deftest test-0700
  (testing "testting case 700"
    (is (= (stemming "looming") "loom"))))

(deftest test-0701
  (testing "testting case 701"
    (is (= (stemming "The") "The"))))

(deftest test-0702
  (testing "testting case 702"
    (is (= (stemming "higher") "higher"))))

(deftest test-0703
  (testing "testting case 703"
    (is (= (stemming "decibel") "decibel"))))

(deftest test-0704
  (testing "testting case 704"
    (is (= (stemming "invective") "invect"))))

(deftest test-0705
  (testing "testting case 705"
    (is (= (stemming "bit") "bit"))))

(deftest test-0706
  (testing "testting case 706"
    (is (= (stemming "worrisome") "worrisom"))))

(deftest test-0707
  (testing "testting case 707"
    (is (= (stemming "said") "said"))))

(deftest test-0708
  (testing "testting case 708"
    (is (= (stemming "Bill") "Bill"))))

(deftest test-0709
  (testing "testting case 709"
    (is (= (stemming "Richardson") "Richardson"))))

(deftest test-0710
  (testing "testting case 710"
    (is (= (stemming "the") "the"))))

(deftest test-0711
  (testing "testting case 711"
    (is (= (stemming "former") "former"))))

(deftest test-0712
  (testing "testting case 712"
    (is (= (stemming "governor") "governor"))))

(deftest test-0713
  (testing "testting case 713"
    (is (= (stemming "New") "New"))))

(deftest test-0714
  (testing "testting case 714"
    (is (= (stemming "Mexico") "Mexico"))))

(deftest test-0715
  (testing "testting case 715"
    (is (= (stemming "and") "and"))))

(deftest test-0716
  (testing "testting case 716"
    (is (= (stemming "presidential") "presidenti"))))

(deftest test-0717
  (testing "testting case 717"
    (is (= (stemming "candidate") "candid"))))

(deftest test-0718
  (testing "testting case 718"
    (is (= (stemming "who") "who"))))

(deftest test-0719
  (testing "testting case 719"
    (is (= (stemming "has") "ha"))))

(deftest test-0720
  (testing "testting case 720"
    (is (= (stemming "traveled") "travel"))))

(deftest test-0721
  (testing "testting case 721"
    (is (= (stemming "North") "North"))))

(deftest test-0722
  (testing "testting case 722"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0723
  (testing "testting case 723"
    (is (= (stemming "eight") "eight"))))

(deftest test-0724
  (testing "testting case 724"
    (is (= (stemming "times") "time"))))

(deftest test-0725
  (testing "testting case 725"
    (is (= (stemming "most") "most"))))

(deftest test-0726
  (testing "testting case 726"
    (is (= (stemming "recently") "recent"))))

(deftest test-0727
  (testing "testting case 727"
    (is (= (stemming "January") "Januari"))))

(deftest test-0728
  (testing "testting case 728"
    (is (= (stemming "the") "the"))))

(deftest test-0729
  (testing "testting case 729"
    (is (= (stemming "highest") "highest"))))

(deftest test-0730
  (testing "testting case 730"
    (is (= (stemming "negative") "neg"))))

(deftest test-0731
  (testing "testting case 731"
    (is (= (stemming "level") "level"))))

(deftest test-0732
  (testing "testting case 732"
    (is (= (stemming "ever") "ever"))))

(deftest test-0733
  (testing "testting case 733"
    (is (= (stemming "seen") "seen"))))

(deftest test-0734
  (testing "testting case 734"
    (is (= (stemming "and") "and"))))

(deftest test-0735
  (testing "testting case 735"
    (is (= (stemming "probably") "probabl"))))

(deftest test-0736
  (testing "testting case 736"
    (is (= (stemming "means") "mean"))))

(deftest test-0737
  (testing "testting case 737"
    (is (= (stemming "that") "that"))))

(deftest test-0738
  (testing "testting case 738"
    (is (= (stemming "the") "the"))))

(deftest test-0739
  (testing "testting case 739"
    (is (= (stemming "hard") "hard"))))

(deftest test-0740
  (testing "testting case 740"
    (is (= (stemming "line") "line"))))

(deftest test-0741
  (testing "testting case 741"
    (is (= (stemming "elements") "element"))))

(deftest test-0742
  (testing "testting case 742"
    (is (= (stemming "particularly") "particularli"))))

(deftest test-0743
  (testing "testting case 743"
    (is (= (stemming "the") "the"))))

(deftest test-0744
  (testing "testting case 744"
    (is (= (stemming "military") "militari"))))

(deftest test-0745
  (testing "testting case 745"
    (is (= (stemming "and") "and"))))

(deftest test-0746
  (testing "testting case 746"
    (is (= (stemming "not") "not"))))

(deftest test-0747
  (testing "testting case 747"
    (is (= (stemming "the") "the"))))

(deftest test-0748
  (testing "testting case 748"
    (is (= (stemming "Foreign") "Foreign"))))

(deftest test-0749
  (testing "testting case 749"
    (is (= (stemming "Ministry") "Ministri"))))

(deftest test-0750
  (testing "testting case 750"
    (is (= (stemming "are") "ar"))))

(deftest test-0751
  (testing "testting case 751"
    (is (= (stemming "control") "control"))))

(deftest test-0752
  (testing "testting case 752"
    (is (= (stemming "the") "the"))))

(deftest test-0753
  (testing "testting case 753"
    (is (= (stemming "other") "other"))))

(deftest test-0754
  (testing "testting case 754"
    (is (= (stemming "hand") "hand"))))

(deftest test-0755
  (testing "testting case 755"
    (is (= (stemming "Richardson") "Richardson"))))

(deftest test-0756
  (testing "testting case 756"
    (is (= (stemming "said") "said"))))

(deftest test-0757
  (testing "testting case 757"
    (is (= (stemming "China") "China"))))

(deftest test-0758
  (testing "testting case 758"
    (is (= (stemming "part") "part"))))

(deftest test-0759
  (testing "testting case 759"
    (is (= (stemming "significant") "signific"))))

(deftest test-0760
  (testing "testting case 760"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0761
  (testing "testting case 761"
    (is (= (stemming "effort") "effort"))))

(deftest test-0762
  (testing "testting case 762"
    (is (= (stemming "and") "and"))))

(deftest test-0763
  (testing "testting case 763"
    (is (= (stemming "this") "thi"))))

(deftest test-0764
  (testing "testting case 764"
    (is (= (stemming "may") "mai"))))

(deftest test-0765
  (testing "testting case 765"
    (is (= (stemming "cool") "cool"))))

(deftest test-0766
  (testing "testting case 766"
    (is (= (stemming "the") "the"))))

(deftest test-0767
  (testing "testting case 767"
    (is (= (stemming "North") "North"))))

(deftest test-0768
  (testing "testting case 768"
    (is (= (stemming "Koreans") "Korean"))))

(deftest test-0769
  (testing "testting case 769"
    (is (= (stemming "down") "down"))))

(deftest test-0770
  (testing "testting case 770"
    (is (= (stemming "may") "mai"))))

(deftest test-0771
  (testing "testting case 771"
    (is (= (stemming "temper") "temper"))))

(deftest test-0772
  (testing "testting case 772"
    (is (= (stemming "their") "their"))))

(deftest test-0773
  (testing "testting case 773"
    (is (= (stemming "response") "respons"))))

(deftest test-0774
  (testing "testting case 774"
    (is (= (stemming "also") "also"))))

(deftest test-0775
  (testing "testting case 775"
    (is (= (stemming "possible") "possibl"))))

(deftest test-0776
  (testing "testting case 776"
    (is (= (stemming "that") "that"))))

(deftest test-0777
  (testing "testting case 777"
    (is (= (stemming "the") "the"))))

(deftest test-0778
  (testing "testting case 778"
    (is (= (stemming "new") "new"))))

(deftest test-0779
  (testing "testting case 779"
    (is (= (stemming "and") "and"))))

(deftest test-0780
  (testing "testting case 780"
    (is (= (stemming "isolated") "isol"))))

(deftest test-0781
  (testing "testting case 781"
    (is (= (stemming "North") "North"))))

(deftest test-0782
  (testing "testting case 782"
    (is (= (stemming "Korean") "Korean"))))

(deftest test-0783
  (testing "testting case 783"
    (is (= (stemming "government") "govern"))))

(deftest test-0784
  (testing "testting case 784"
    (is (= (stemming "may") "mai"))))

(deftest test-0785
  (testing "testting case 785"
    (is (= (stemming "have") "have"))))

(deftest test-0786
  (testing "testting case 786"
    (is (= (stemming "misjudged") "misjudg"))))

(deftest test-0787
  (testing "testting case 787"
    (is (= (stemming "the") "the"))))

(deftest test-0788
  (testing "testting case 788"
    (is (= (stemming "reaction") "reaction"))))

(deftest test-0789
  (testing "testting case 789"
    (is (= (stemming "talk") "talk"))))

(deftest test-0790
  (testing "testting case 790"
    (is (= (stemming "pre") "pre"))))

(deftest test-0791
  (testing "testting case 791"
    (is (= (stemming "emptive") "emptiv"))))

(deftest test-0792
  (testing "testting case 792"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0793
  (testing "testting case 793"
    (is (= (stemming "attack") "attack"))))

(deftest test-0794
  (testing "testting case 794"
    (is (= (stemming "wording") "word"))))

(deftest test-0795
  (testing "testting case 795"
    (is (= (stemming "rarely") "rare"))))

(deftest test-0796
  (testing "testting case 796"
    (is (= (stemming "heard") "heard"))))

(deftest test-0797
  (testing "testting case 797"
    (is (= (stemming "since") "sinc"))))

(deftest test-0798
  (testing "testting case 798"
    (is (= (stemming "the") "the"))))

(deftest test-0799
  (testing "testting case 799"
    (is (= (stemming "cold") "cold"))))

(deftest test-0800
  (testing "testting case 800"
    (is (= (stemming "war") "war"))))

(deftest test-0801
  (testing "testting case 801"
    (is (= (stemming "ended") "end"))))

(deftest test-0802
  (testing "testting case 802"
    (is (= (stemming "could") "could"))))

(deftest test-0803
  (testing "testting case 803"
    (is (= (stemming "another") "anoth"))))

(deftest test-0804
  (testing "testting case 804"
    (is (= (stemming "way") "wai"))))

(deftest test-0805
  (testing "testting case 805"
    (is (= (stemming "which") "which"))))

(deftest test-0806
  (testing "testting case 806"
    (is (= (stemming "the") "the"))))

(deftest test-0807
  (testing "testting case 807"
    (is (= (stemming "North") "North"))))

(deftest test-0808
  (testing "testting case 808"
    (is (= (stemming "demanding") "demand"))))

(deftest test-0809
  (testing "testting case 809"
    (is (= (stemming "talks") "talk"))))

(deftest test-0810
  (testing "testting case 810"
    (is (= (stemming "with") "with"))))

(deftest test-0811
  (testing "testting case 811"
    (is (= (stemming "President") "Presid"))))

(deftest test-0812
  (testing "testting case 812"
    (is (= (stemming "Obama") "Obama"))))

(deftest test-0813
  (testing "testting case 813"
    (is (= (stemming "only") "onli"))))

(deftest test-0814
  (testing "testting case 814"
    (is (= (stemming "last") "last"))))

(deftest test-0815
  (testing "testting case 815"
    (is (= (stemming "week") "week"))))

(deftest test-0816
  (testing "testting case 816"
    (is (= (stemming "Kim") "Kim"))))

(deftest test-0817
  (testing "testting case 817"
    (is (= (stemming "told") "told"))))

(deftest test-0818
  (testing "testting case 818"
    (is (= (stemming "Dennis") "Denni"))))

(deftest test-0819
  (testing "testting case 819"
    (is (= (stemming "Rodman") "Rodman"))))

(deftest test-0820
  (testing "testting case 820"
    (is (= (stemming "the") "the"))))

(deftest test-0821
  (testing "testting case 821"
    (is (= (stemming "visiting") "visit"))))

(deftest test-0822
  (testing "testting case 822"
    (is (= (stemming "former") "former"))))

(deftest test-0823
  (testing "testting case 823"
    (is (= (stemming "basketball") "basketbal"))))

(deftest test-0824
  (testing "testting case 824"
    (is (= (stemming "star") "star"))))

(deftest test-0825
  (testing "testting case 825"
    (is (= (stemming "that") "that"))))

(deftest test-0826
  (testing "testting case 826"
    (is (= (stemming "wanted") "want"))))

(deftest test-0827
  (testing "testting case 827"
    (is (= (stemming "Obama") "Obama"))))

(deftest test-0828
  (testing "testting case 828"
    (is (= (stemming "call") "call"))))

(deftest test-0829
  (testing "testting case 829"
    (is (= (stemming "him") "him"))))

(deftest test-0830
  (testing "testting case 830"
    (is (= (stemming "But") "But"))))

(deftest test-0831
  (testing "testting case 831"
    (is (= (stemming "could") "could"))))

(deftest test-0832
  (testing "testting case 832"
    (is (= (stemming "also") "also"))))

(deftest test-0833
  (testing "testting case 833"
    (is (= (stemming "way") "wai"))))

(deftest test-0834
  (testing "testting case 834"
    (is (= (stemming "saying") "sai"))))

(deftest test-0835
  (testing "testting case 835"
    (is (= (stemming "that") "that"))))

(deftest test-0836
  (testing "testting case 836"
    (is (= (stemming "North") "North"))))

(deftest test-0837
  (testing "testting case 837"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0838
  (testing "testting case 838"
    (is (= (stemming "now") "now"))))

(deftest test-0839
  (testing "testting case 839"
    (is (= (stemming "expected") "expect"))))

(deftest test-0840
  (testing "testting case 840"
    (is (= (stemming "treated") "treat"))))

(deftest test-0841
  (testing "testting case 841"
    (is (= (stemming "the") "the"))))

(deftest test-0842
  (testing "testting case 842"
    (is (= (stemming "way") "wai"))))

(deftest test-0843
  (testing "testting case 843"
    (is (= (stemming "Pakistan") "Pakistan"))))

(deftest test-0844
  (testing "testting case 844"
    (is (= (stemming "established") "establish"))))

(deftest test-0845
  (testing "testting case 845"
    (is (= (stemming "formally") "formal"))))

(deftest test-0846
  (testing "testting case 846"
    (is (= (stemming "unrecognized") "unrecogn"))))

(deftest test-0847
  (testing "testting case 847"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0848
  (testing "testting case 848"
    (is (= (stemming "power") "power"))))

(deftest test-0849
  (testing "testting case 849"
    (is (= (stemming "This") "Thi"))))

(deftest test-0850
  (testing "testting case 850"
    (is (= (stemming "tactic") "tactic"))))

(deftest test-0851
  (testing "testting case 851"
    (is (= (stemming "they") "thei"))))

(deftest test-0852
  (testing "testting case 852"
    (is (= (stemming "have") "have"))))

(deftest test-0853
  (testing "testting case 853"
    (is (= (stemming "employed") "emploi"))))

(deftest test-0854
  (testing "testting case 854"
    (is (= (stemming "when") "when"))))

(deftest test-0855
  (testing "testting case 855"
    (is (= (stemming "they") "thei"))))

(deftest test-0856
  (testing "testting case 856"
    (is (= (stemming "don") "don"))))

(deftest test-0857
  (testing "testting case 857"
    (is (= (stemming "get") "get"))))

(deftest test-0858
  (testing "testting case 858"
    (is (= (stemming "their") "their"))))

(deftest test-0859
  (testing "testting case 859"
    (is (= (stemming "way") "wai"))))

(deftest test-0860
  (testing "testting case 860"
    (is (= (stemming "when") "when"))))

(deftest test-0861
  (testing "testting case 861"
    (is (= (stemming "the") "the"))))

(deftest test-0862
  (testing "testting case 862"
    (is (= (stemming "international") "intern"))))

(deftest test-0863
  (testing "testting case 863"
    (is (= (stemming "community") "commun"))))

(deftest test-0864
  (testing "testting case 864"
    (is (= (stemming "brings") "bring"))))

(deftest test-0865
  (testing "testting case 865"
    (is (= (stemming "more") "more"))))

(deftest test-0866
  (testing "testting case 866"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0867
  (testing "testting case 867"
    (is (= (stemming "bear") "bear"))))

(deftest test-0868
  (testing "testting case 868"
    (is (= (stemming "said") "said"))))

(deftest test-0869
  (testing "testting case 869"
    (is (= (stemming "Suzanne") "Suzann"))))

(deftest test-0870
  (testing "testting case 870"
    (is (= (stemming "DiMaggio") "DiMaggio"))))

(deftest test-0871
  (testing "testting case 871"
    (is (= (stemming "vice") "vice"))))

(deftest test-0872
  (testing "testting case 872"
    (is (= (stemming "president") "presid"))))

(deftest test-0873
  (testing "testting case 873"
    (is (= (stemming "global") "global"))))

(deftest test-0874
  (testing "testting case 874"
    (is (= (stemming "policy") "polici"))))

(deftest test-0875
  (testing "testting case 875"
    (is (= (stemming "programs") "program"))))

(deftest test-0876
  (testing "testting case 876"
    (is (= (stemming "the") "the"))))

(deftest test-0877
  (testing "testting case 877"
    (is (= (stemming "Asia") "Asia"))))

(deftest test-0878
  (testing "testting case 878"
    (is (= (stemming "Society") "Societi"))))

(deftest test-0879
  (testing "testting case 879"
    (is (= (stemming "New") "New"))))

(deftest test-0880
  (testing "testting case 880"
    (is (= (stemming "York") "york"))))

(deftest test-0881
  (testing "testting case 881"
    (is (= (stemming "Whether") "Whether"))))

(deftest test-0882
  (testing "testting case 882"
    (is (= (stemming "that") "that"))))

(deftest test-0883
  (testing "testting case 883"
    (is (= (stemming "will") "will"))))

(deftest test-0884
  (testing "testting case 884"
    (is (= (stemming "happen") "happen"))))

(deftest test-0885
  (testing "testting case 885"
    (is (= (stemming "this") "thi"))))

(deftest test-0886
  (testing "testting case 886"
    (is (= (stemming "time") "time"))))

(deftest test-0887
  (testing "testting case 887"
    (is (= (stemming "unclear") "unclear"))))

(deftest test-0888
  (testing "testting case 888"
    (is (= (stemming "given") "given"))))

(deftest test-0889
  (testing "testting case 889"
    (is (= (stemming "the") "the"))))

(deftest test-0890
  (testing "testting case 890"
    (is (= (stemming "level") "level"))))

(deftest test-0891
  (testing "testting case 891"
    (is (= (stemming "hostile") "hostil"))))

(deftest test-0892
  (testing "testting case 892"
    (is (= (stemming "rhetoric") "rhetor"))))

(deftest test-0893
  (testing "testting case 893"
    (is (= (stemming "she") "she"))))

(deftest test-0894
  (testing "testting case 894"
    (is (= (stemming "said") "said"))))

(deftest test-0895
  (testing "testting case 895"
    (is (= (stemming "not") "not"))))

(deftest test-0896
  (testing "testting case 896"
    (is (= (stemming "sure") "sure"))))

(deftest test-0897
  (testing "testting case 897"
    (is (= (stemming "Pyongyang") "Pyongyang"))))

(deftest test-0898
  (testing "testting case 898"
    (is (= (stemming "recognizes") "recogn"))))

(deftest test-0899
  (testing "testting case 899"
    (is (= (stemming "that") "that"))))

(deftest test-0900
  (testing "testting case 900"
    (is (= (stemming "fact") "fact"))))

(deftest test-0901
  (testing "testting case 901"
    (is (= (stemming "The") "The"))))

(deftest test-0902
  (testing "testting case 902"
    (is (= (stemming "United") "Unite"))))

(deftest test-0903
  (testing "testting case 903"
    (is (= (stemming "Nations") "Nation"))))

(deftest test-0904
  (testing "testting case 904"
    (is (= (stemming "vote") "vote"))))

(deftest test-0905
  (testing "testting case 905"
    (is (= (stemming "and") "and"))))

(deftest test-0906
  (testing "testting case 906"
    (is (= (stemming "North") "North"))))

(deftest test-0907
  (testing "testting case 907"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0908
  (testing "testting case 908"
    (is (= (stemming "threat") "threat"))))

(deftest test-0909
  (testing "testting case 909"
    (is (= (stemming "come") "come"))))

(deftest test-0910
  (testing "testting case 910"
    (is (= (stemming "time") "time"))))

(deftest test-0911
  (testing "testting case 911"
    (is (= (stemming "when") "when"))))

(deftest test-0912
  (testing "testting case 912"
    (is (= (stemming "internally") "intern"))))

(deftest test-0913
  (testing "testting case 913"
    (is (= (stemming "the") "the"))))

(deftest test-0914
  (testing "testting case 914"
    (is (= (stemming "Obama") "Obama"))))

(deftest test-0915
  (testing "testting case 915"
    (is (= (stemming "administration") "administr"))))

(deftest test-0916
  (testing "testting case 916"
    (is (= (stemming "debating") "debat"))))

(deftest test-0917
  (testing "testting case 917"
    (is (= (stemming "the") "the"))))

(deftest test-0918
  (testing "testting case 918"
    (is (= (stemming "wisdom") "wisdom"))))

(deftest test-0919
  (testing "testting case 919"
    (is (= (stemming "its") "it"))))

(deftest test-0920
  (testing "testting case 920"
    (is (= (stemming "policy") "polici"))))

(deftest test-0921
  (testing "testting case 921"
    (is (= (stemming "essentially") "essenti"))))

(deftest test-0922
  (testing "testting case 922"
    (is (= (stemming "ignoring") "ignor"))))

(deftest test-0923
  (testing "testting case 923"
    (is (= (stemming "the") "the"))))

(deftest test-0924
  (testing "testting case 924"
    (is (= (stemming "North") "North"))))

(deftest test-0925
  (testing "testting case 925"
    (is (= (stemming "for") "for"))))

(deftest test-0926
  (testing "testting case 926"
    (is (= (stemming "the") "the"))))

(deftest test-0927
  (testing "testting case 927"
    (is (= (stemming "past") "past"))))

(deftest test-0928
  (testing "testting case 928"
    (is (= (stemming "four") "four"))))

(deftest test-0929
  (testing "testting case 929"
    (is (= (stemming "years") "year"))))

(deftest test-0930
  (testing "testting case 930"
    (is (= (stemming "and") "and"))))

(deftest test-0931
  (testing "testting case 931"
    (is (= (stemming "responding") "respond"))))

(deftest test-0932
  (testing "testting case 932"
    (is (= (stemming "any") "ani"))))

(deftest test-0933
  (testing "testting case 933"
    (is (= (stemming "provocations") "provoc"))))

(deftest test-0934
  (testing "testting case 934"
    (is (= (stemming "with") "with"))))

(deftest test-0935
  (testing "testting case 935"
    (is (= (stemming "new") "new"))))

(deftest test-0936
  (testing "testting case 936"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-0937
  (testing "testting case 937"
    (is (= (stemming "According") "Accord"))))

(deftest test-0938
  (testing "testting case 938"
    (is (= (stemming "current") "current"))))

(deftest test-0939
  (testing "testting case 939"
    (is (= (stemming "and") "and"))))

(deftest test-0940
  (testing "testting case 940"
    (is (= (stemming "former") "former"))))

(deftest test-0941
  (testing "testting case 941"
    (is (= (stemming "administration") "administr"))))

(deftest test-0942
  (testing "testting case 942"
    (is (= (stemming "officials") "offici"))))

(deftest test-0943
  (testing "testting case 943"
    (is (= (stemming "there") "there"))))

(deftest test-0944
  (testing "testting case 944"
    (is (= (stemming "growing") "grow"))))

(deftest test-0945
  (testing "testting case 945"
    (is (= (stemming "discussion") "discuss"))))

(deftest test-0946
  (testing "testting case 946"
    (is (= (stemming "within") "within"))))

(deftest test-0947
  (testing "testting case 947"
    (is (= (stemming "the") "the"))))

(deftest test-0948
  (testing "testting case 948"
    (is (= (stemming "White") "White"))))

(deftest test-0949
  (testing "testting case 949"
    (is (= (stemming "House") "Hous"))))

(deftest test-0950
  (testing "testting case 950"
    (is (= (stemming "the") "the"))))

(deftest test-0951
  (testing "testting case 951"
    (is (= (stemming "State") "State"))))

(deftest test-0952
  (testing "testting case 952"
    (is (= (stemming "Department") "Depart"))))

(deftest test-0953
  (testing "testting case 953"
    (is (= (stemming "and") "and"))))

(deftest test-0954
  (testing "testting case 954"
    (is (= (stemming "the") "the"))))

(deftest test-0955
  (testing "testting case 955"
    (is (= (stemming "Pentagon") "Pentagon"))))

(deftest test-0956
  (testing "testting case 956"
    (is (= (stemming "over") "over"))))

(deftest test-0957
  (testing "testting case 957"
    (is (= (stemming "whether") "whether"))))

(deftest test-0958
  (testing "testting case 958"
    (is (= (stemming "Kim") "Kim"))))

(deftest test-0959
  (testing "testting case 959"
    (is (= (stemming "using") "us"))))

(deftest test-0960
  (testing "testting case 960"
    (is (= (stemming "each") "each"))))

(deftest test-0961
  (testing "testting case 961"
    (is (= (stemming "new") "new"))))

(deftest test-0962
  (testing "testting case 962"
    (is (= (stemming "test") "test"))))

(deftest test-0963
  (testing "testting case 963"
    (is (= (stemming "rockets") "rocket"))))

(deftest test-0964
  (testing "testting case 964"
    (is (= (stemming "and") "and"))))

(deftest test-0965
  (testing "testting case 965"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-0966
  (testing "testting case 966"
    (is (= (stemming "devices") "devic"))))

(deftest test-0967
  (testing "testting case 967"
    (is (= (stemming "solidify") "solidifi"))))

(deftest test-0968
  (testing "testting case 968"
    (is (= (stemming "his") "hi"))))

(deftest test-0969
  (testing "testting case 969"
    (is (= (stemming "position") "posit"))))

(deftest test-0970
  (testing "testting case 970"
    (is (= (stemming "with") "with"))))

(deftest test-0971
  (testing "testting case 971"
    (is (= (stemming "the") "the"))))

(deftest test-0972
  (testing "testting case 972"
    (is (= (stemming "military") "militari"))))

(deftest test-0973
  (testing "testting case 973"
    (is (= (stemming "his") "hi"))))

(deftest test-0974
  (testing "testting case 974"
    (is (= (stemming "most") "most"))))

(deftest test-0975
  (testing "testting case 975"
    (is (= (stemming "important") "import"))))

(deftest test-0976
  (testing "testting case 976"
    (is (= (stemming "single") "singl"))))

(deftest test-0977
  (testing "testting case 977"
    (is (= (stemming "constituency") "constitu"))))

(deftest test-0978
  (testing "testting case 978"
    (is (= (stemming "Under") "Under"))))

(deftest test-0979
  (testing "testting case 979"
    (is (= (stemming "that") "that"))))

(deftest test-0980
  (testing "testting case 980"
    (is (= (stemming "theory") "theori"))))

(deftest test-0981
  (testing "testting case 981"
    (is (= (stemming "one") "on"))))

(deftest test-0982
  (testing "testting case 982"
    (is (= (stemming "official") "offici"))))

(deftest test-0983
  (testing "testting case 983"
    (is (= (stemming "who") "who"))))

(deftest test-0984
  (testing "testting case 984"
    (is (= (stemming "has") "ha"))))

(deftest test-0985
  (testing "testting case 985"
    (is (= (stemming "dealt") "dealt"))))

(deftest test-0986
  (testing "testting case 986"
    (is (= (stemming "with") "with"))))

(deftest test-0987
  (testing "testting case 987"
    (is (= (stemming "North") "North"))))

(deftest test-0988
  (testing "testting case 988"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-0989
  (testing "testting case 989"
    (is (= (stemming "often") "often"))))

(deftest test-0990
  (testing "testting case 990"
    (is (= (stemming "said") "said"))))

(deftest test-0991
  (testing "testting case 991"
    (is (= (stemming "recently") "recent"))))

(deftest test-0992
  (testing "testting case 992"
    (is (= (stemming "even") "even"))))

(deftest test-0993
  (testing "testting case 993"
    (is (= (stemming "firefight") "firefight"))))

(deftest test-0994
  (testing "testting case 994"
    (is (= (stemming "with") "with"))))

(deftest test-0995
  (testing "testting case 995"
    (is (= (stemming "the") "the"))))

(deftest test-0996
  (testing "testting case 996"
    (is (= (stemming "South") "South"))))

(deftest test-0997
  (testing "testting case 997"
    (is (= (stemming "Koreans") "Korean"))))

(deftest test-0998
  (testing "testting case 998"
    (is (= (stemming "might") "might"))))

(deftest test-0999
  (testing "testting case 999"
    (is (= (stemming "help") "help"))))

(deftest test-1000
  (testing "testting case 1000"
    (is (= (stemming "him") "him"))))

(deftest test-1001
  (testing "testting case 1001"
    (is (= (stemming "long") "long"))))

(deftest test-1002
  (testing "testting case 1002"
    (is (= (stemming "doesn") "doesn"))))

(deftest test-1003
  (testing "testting case 1003"
    (is (= (stemming "escalate") "escal"))))

(deftest test-1004
  (testing "testting case 1004"
    (is (= (stemming "into") "into"))))

(deftest test-1005
  (testing "testting case 1005"
    (is (= (stemming "something") "someth"))))

(deftest test-1006
  (testing "testting case 1006"
    (is (= (stemming "that") "that"))))

(deftest test-1007
  (testing "testting case 1007"
    (is (= (stemming "threatens") "threaten"))))

(deftest test-1008
  (testing "testting case 1008"
    (is (= (stemming "the") "the"))))

(deftest test-1009
  (testing "testting case 1009"
    (is (= (stemming "regime") "regim"))))

(deftest test-1010
  (testing "testting case 1010"
    (is (= (stemming "testimony") "testimoni"))))

(deftest test-1011
  (testing "testting case 1011"
    (is (= (stemming "Thursday") "Thursdai"))))

(deftest test-1012
  (testing "testting case 1012"
    (is (= (stemming "before") "befor"))))

(deftest test-1013
  (testing "testting case 1013"
    (is (= (stemming "the") "the"))))

(deftest test-1014
  (testing "testting case 1014"
    (is (= (stemming "Senate") "Senat"))))

(deftest test-1015
  (testing "testting case 1015"
    (is (= (stemming "Foreign") "Foreign"))))

(deftest test-1016
  (testing "testting case 1016"
    (is (= (stemming "Relations") "Relat"))))

(deftest test-1017
  (testing "testting case 1017"
    (is (= (stemming "Committee") "Committe"))))

(deftest test-1018
  (testing "testting case 1018"
    (is (= (stemming "Glyn") "Glyn"))))

(deftest test-1019
  (testing "testting case 1019"
    (is (= (stemming "Davies") "Davi"))))

(deftest test-1020
  (testing "testting case 1020"
    (is (= (stemming "the") "the"))))

(deftest test-1021
  (testing "testting case 1021"
    (is (= (stemming "administration") "administr"))))

(deftest test-1022
  (testing "testting case 1022"
    (is (= (stemming "special") "special"))))

(deftest test-1023
  (testing "testting case 1023"
    (is (= (stemming "representative") "repres"))))

(deftest test-1024
  (testing "testting case 1024"
    (is (= (stemming "for") "for"))))

(deftest test-1025
  (testing "testting case 1025"
    (is (= (stemming "North") "North"))))

(deftest test-1026
  (testing "testting case 1026"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-1027
  (testing "testting case 1027"
    (is (= (stemming "policy") "polici"))))

(deftest test-1028
  (testing "testting case 1028"
    (is (= (stemming "argued") "argu"))))

(deftest test-1029
  (testing "testting case 1029"
    (is (= (stemming "that") "that"))))

(deftest test-1030
  (testing "testting case 1030"
    (is (= (stemming "the") "the"))))

(deftest test-1031
  (testing "testting case 1031"
    (is (= (stemming "best") "best"))))

(deftest test-1032
  (testing "testting case 1032"
    (is (= (stemming "course") "cours"))))

(deftest test-1033
  (testing "testting case 1033"
    (is (= (stemming "was") "wa"))))

(deftest test-1034
  (testing "testting case 1034"
    (is (= (stemming "continue") "continu"))))

(deftest test-1035
  (testing "testting case 1035"
    (is (= (stemming "with") "with"))))

(deftest test-1036
  (testing "testting case 1036"
    (is (= (stemming "Obama") "Obama"))))

(deftest test-1037
  (testing "testting case 1037"
    (is (= (stemming "current") "current"))))

(deftest test-1038
  (testing "testting case 1038"
    (is (= (stemming "policy") "polici"))))

(deftest test-1039
  (testing "testting case 1039"
    (is (= (stemming "using") "us"))))

(deftest test-1040
  (testing "testting case 1040"
    (is (= (stemming "tests") "test"))))

(deftest test-1041
  (testing "testting case 1041"
    (is (= (stemming "and") "and"))))

(deftest test-1042
  (testing "testting case 1042"
    (is (= (stemming "provocations") "provoc"))))

(deftest test-1043
  (testing "testting case 1043"
    (is (= (stemming "tighten") "tighten"))))

(deftest test-1044
  (testing "testting case 1044"
    (is (= (stemming "sanctions") "sanction"))))

(deftest test-1045
  (testing "testting case 1045"
    (is (= (stemming "and") "and"))))

(deftest test-1046
  (testing "testting case 1046"
    (is (= (stemming "try") "try"))))

(deftest test-1047
  (testing "testting case 1047"
    (is (= (stemming "starve") "starv"))))

(deftest test-1048
  (testing "testting case 1048"
    (is (= (stemming "development") "develop"))))

(deftest test-1049
  (testing "testting case 1049"
    (is (= (stemming "the") "the"))))

(deftest test-1050
  (testing "testting case 1050"
    (is (= (stemming "North") "North"))))

(deftest test-1051
  (testing "testting case 1051"
    (is (= (stemming "long") "long"))))

(deftest test-1052
  (testing "testting case 1052"
    (is (= (stemming "range") "rang"))))

(deftest test-1053
  (testing "testting case 1053"
    (is (= (stemming "missiles") "missil"))))

(deftest test-1054
  (testing "testting case 1054"
    (is (= (stemming "and") "and"))))

(deftest test-1055
  (testing "testting case 1055"
    (is (= (stemming "its") "it"))))

(deftest test-1056
  (testing "testting case 1056"
    (is (= (stemming "effort") "effort"))))

(deftest test-1057
  (testing "testting case 1057"
    (is (= (stemming "design") "design"))))

(deftest test-1058
  (testing "testting case 1058"
    (is (= (stemming "nuclear") "nuclear"))))

(deftest test-1059
  (testing "testting case 1059"
    (is (= (stemming "weapons") "weapon"))))

(deftest test-1060
  (testing "testting case 1060"
    (is (= (stemming "small") "small"))))

(deftest test-1061
  (testing "testting case 1061"
    (is (= (stemming "enough") "enough"))))

(deftest test-1062
  (testing "testting case 1062"
    (is (= (stemming "for") "for"))))

(deftest test-1063
  (testing "testting case 1063"
    (is (= (stemming "those") "those"))))

(deftest test-1064
  (testing "testting case 1064"
    (is (= (stemming "missiles") "missil"))))

(deftest test-1065
  (testing "testting case 1065"
    (is (= (stemming "Choe") "Choe"))))

(deftest test-1066
  (testing "testting case 1066"
    (is (= (stemming "Sang") "Sang"))))

(deftest test-1067
  (testing "testting case 1067"
    (is (= (stemming "Hun") "Hun"))))

(deftest test-1068
  (testing "testting case 1068"
    (is (= (stemming "reported") "report"))))

(deftest test-1069
  (testing "testting case 1069"
    (is (= (stemming "from") "from"))))

(deftest test-1070
  (testing "testting case 1070"
    (is (= (stemming "Seoul") "Seoul"))))

(deftest test-1071
  (testing "testting case 1071"
    (is (= (stemming "South") "South"))))

(deftest test-1072
  (testing "testting case 1072"
    (is (= (stemming "Korea") "Korea"))))

(deftest test-1073
  (testing "testting case 1073"
    (is (= (stemming "and") "and"))))

(deftest test-1074
  (testing "testting case 1074"
    (is (= (stemming "Rick") "Rick"))))

(deftest test-1075
  (testing "testting case 1075"
    (is (= (stemming "Gladstone") "Gladston"))))

(deftest test-1076
  (testing "testting case 1076"
    (is (= (stemming "from") "from"))))

(deftest test-1077
  (testing "testting case 1077"
    (is (= (stemming "New") "New"))))

(deftest test-1078
  (testing "testting case 1078"
    (is (= (stemming "York") "york"))))

(deftest test-1079
  (testing "testting case 1079"
    (is (= (stemming "David") "David"))))

(deftest test-1080
  (testing "testting case 1080"
    (is (= (stemming "Sanger") "Sanger"))))

(deftest test-1081
  (testing "testting case 1081"
    (is (= (stemming "contributed") "contribut"))))

(deftest test-1082
  (testing "testting case 1082"
    (is (= (stemming "reporting") "report"))))

(deftest test-1083
  (testing "testting case 1083"
    (is (= (stemming "from") "from"))))

(deftest test-1084
  (testing "testting case 1084"
    (is (= (stemming "Washington") "Washington"))))


