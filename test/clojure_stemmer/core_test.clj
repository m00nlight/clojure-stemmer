(ns clojure-stemmer.core-test
  (:use clojure.test
        clojure-stemmer.porter.stemmer))


(deftest test-1
  (testing "test case 1"
    (is (= (stemming "pestilentially") "pestilenti"))))

(deftest test-2
  (testing "test case 2"
    (is (= (stemming "corrodes") "corrod"))))

(deftest test-3
  (testing "test case 3"
    (is (= (stemming "allergology") "allergolog"))))

(deftest test-4
  (testing "test case 4"
    (is (= (stemming "calvinism") "calvin"))))

(deftest test-5
  (testing "test case 5"
    (is (= (stemming "harriers") "harrier"))))

(deftest test-6
  (testing "test case 6"
    (is (= (stemming "ables") "abl"))))

(deftest test-7
  (testing "test case 7"
    (is (= (stemming "refrigeration") "refriger"))))

(deftest test-8
  (testing "test case 8"
    (is (= (stemming "maltase") "maltas"))))

(deftest test-9
  (testing "test case 9"
    (is (= (stemming "furiously") "furious"))))

(deftest test-10
  (testing "test case 10"
    (is (= (stemming "trigonometric") "trigonometr"))))

(deftest test-11
  (testing "test case 11"
    (is (= (stemming "frillings") "frill"))))

(deftest test-12
  (testing "test case 12"
    (is (= (stemming "cupolas") "cupola"))))

(deftest test-13
  (testing "test case 13"
    (is (= (stemming "rawer") "rawer"))))

(deftest test-14
  (testing "test case 14"
    (is (= (stemming "repossesses") "repossess"))))

(deftest test-15
  (testing "test case 15"
    (is (= (stemming "burglarious") "burglari"))))

(deftest test-16
  (testing "test case 16"
    (is (= (stemming "admits") "admit"))))

(deftest test-17
  (testing "test case 17"
    (is (= (stemming "weewee") "weewe"))))

(deftest test-18
  (testing "test case 18"
    (is (= (stemming "harking") "hark"))))

(deftest test-19
  (testing "test case 19"
    (is (= (stemming "tracheids") "tracheid"))))

(deftest test-20
  (testing "test case 20"
    (is (= (stemming "broker") "broker"))))

(deftest test-21
  (testing "test case 21"
    (is (= (stemming "ointment") "ointment"))))

(deftest test-22
  (testing "test case 22"
    (is (= (stemming "cockerels") "cockerel"))))

(deftest test-23
  (testing "test case 23"
    (is (= (stemming "nonempirical") "nonempir"))))

(deftest test-24
  (testing "test case 24"
    (is (= (stemming "scampish") "scampish"))))

(deftest test-25
  (testing "test case 25"
    (is (= (stemming "bleaks") "bleak"))))

(deftest test-26
  (testing "test case 26"
    (is (= (stemming "squall") "squall"))))

(deftest test-27
  (testing "test case 27"
    (is (= (stemming "thickety") "thicketi"))))

(deftest test-28
  (testing "test case 28"
    (is (= (stemming "steering") "steer"))))

(deftest test-29
  (testing "test case 29"
    (is (= (stemming "crooked") "crook"))))

(deftest test-30
  (testing "test case 30"
    (is (= (stemming "maggots") "maggot"))))

(deftest test-31
  (testing "test case 31"
    (is (= (stemming "confiscate") "confisc"))))

(deftest test-32
  (testing "test case 32"
    (is (= (stemming "unjudicial") "unjudici"))))

(deftest test-33
  (testing "test case 33"
    (is (= (stemming "bongo") "bongo"))))

(deftest test-34
  (testing "test case 34"
    (is (= (stemming "seminarian") "seminarian"))))

(deftest test-35
  (testing "test case 35"
    (is (= (stemming "appaloosa") "appaloosa"))))

(deftest test-36
  (testing "test case 36"
    (is (= (stemming "haftorahs") "haftorah"))))

(deftest test-37
  (testing "test case 37"
    (is (= (stemming "cadette") "cadett"))))

(deftest test-38
  (testing "test case 38"
    (is (= (stemming "turnstiles") "turnstil"))))

(deftest test-39
  (testing "test case 39"
    (is (= (stemming "conga") "conga"))))

(deftest test-40
  (testing "test case 40"
    (is (= (stemming "mesas") "mesa"))))

(deftest test-41
  (testing "test case 41"
    (is (= (stemming "untimely") "untim"))))

(deftest test-42
  (testing "test case 42"
    (is (= (stemming "terracing") "terrac"))))

(deftest test-43
  (testing "test case 43"
    (is (= (stemming "partnerships") "partnership"))))

(deftest test-44
  (testing "test case 44"
    (is (= (stemming "comb") "comb"))))

(deftest test-45
  (testing "test case 45"
    (is (= (stemming "hardpans") "hardpan"))))

(deftest test-46
  (testing "test case 46"
    (is (= (stemming "blatant") "blatant"))))

(deftest test-47
  (testing "test case 47"
    (is (= (stemming "corollary") "corollari"))))

(deftest test-48
  (testing "test case 48"
    (is (= (stemming "indigent") "indig"))))

(deftest test-49
  (testing "test case 49"
    (is (= (stemming "prorogues") "prorogu"))))

(deftest test-50
  (testing "test case 50"
    (is (= (stemming "molecular") "molecular"))))

(deftest test-51
  (testing "test case 51"
    (is (= (stemming "pm") "pm"))))

(deftest test-52
  (testing "test case 52"
    (is (= (stemming "angularly") "angularli"))))

(deftest test-53
  (testing "test case 53"
    (is (= (stemming "gloxinia") "gloxinia"))))

(deftest test-54
  (testing "test case 54"
    (is (= (stemming "androgyny") "androgyni"))))

(deftest test-55
  (testing "test case 55"
    (is (= (stemming "cubist") "cubist"))))

(deftest test-56
  (testing "test case 56"
    (is (= (stemming "choleras") "cholera"))))

(deftest test-57
  (testing "test case 57"
    (is (= (stemming "futureless") "futureless"))))

(deftest test-58
  (testing "test case 58"
    (is (= (stemming "buffeters") "buffet"))))

(deftest test-59
  (testing "test case 59"
    (is (= (stemming "theories") "theori"))))

(deftest test-60
  (testing "test case 60"
    (is (= (stemming "concubines") "concubin"))))

(deftest test-61
  (testing "test case 61"
    (is (= (stemming "cluster") "cluster"))))

(deftest test-62
  (testing "test case 62"
    (is (= (stemming "penancing") "penanc"))))

(deftest test-63
  (testing "test case 63"
    (is (= (stemming "loungy") "loungi"))))

(deftest test-64
  (testing "test case 64"
    (is (= (stemming "churches") "church"))))

(deftest test-65
  (testing "test case 65"
    (is (= (stemming "semidependently") "semidepend"))))

(deftest test-66
  (testing "test case 66"
    (is (= (stemming "bedamn") "bedamn"))))

(deftest test-67
  (testing "test case 67"
    (is (= (stemming "piloted") "pilot"))))

(deftest test-68
  (testing "test case 68"
    (is (= (stemming "excluder") "exclud"))))

(deftest test-69
  (testing "test case 69"
    (is (= (stemming "frecklier") "frecklier"))))

(deftest test-70
  (testing "test case 70"
    (is (= (stemming "arcing") "arc"))))

(deftest test-71
  (testing "test case 71"
    (is (= (stemming "kiloliter") "kilolit"))))

(deftest test-72
  (testing "test case 72"
    (is (= (stemming "anytime") "anytim"))))

(deftest test-73
  (testing "test case 73"
    (is (= (stemming "autarky") "autarki"))))

(deftest test-74
  (testing "test case 74"
    (is (= (stemming "establishable") "establish"))))

(deftest test-75
  (testing "test case 75"
    (is (= (stemming "anthems") "anthem"))))

(deftest test-76
  (testing "test case 76"
    (is (= (stemming "butts") "butt"))))

(deftest test-77
  (testing "test case 77"
    (is (= (stemming "jonahs") "jonah"))))

(deftest test-78
  (testing "test case 78"
    (is (= (stemming "bowdlerizations") "bowdler"))))

(deftest test-79
  (testing "test case 79"
    (is (= (stemming "widen") "widen"))))

(deftest test-80
  (testing "test case 80"
    (is (= (stemming "wishful") "wish"))))

(deftest test-81
  (testing "test case 81"
    (is (= (stemming "staphylococcemia") "staphylococcemia"))))

(deftest test-82
  (testing "test case 82"
    (is (= (stemming "fellow") "fellow"))))

(deftest test-83
  (testing "test case 83"
    (is (= (stemming "screams") "scream"))))

(deftest test-84
  (testing "test case 84"
    (is (= (stemming "tapestries") "tapestri"))))

(deftest test-85
  (testing "test case 85"
    (is (= (stemming "dug") "dug"))))

(deftest test-86
  (testing "test case 86"
    (is (= (stemming "unpins") "unpin"))))

(deftest test-87
  (testing "test case 87"
    (is (= (stemming "ivy") "ivi"))))

(deftest test-88
  (testing "test case 88"
    (is (= (stemming "farthings") "farth"))))

(deftest test-89
  (testing "test case 89"
    (is (= (stemming "unsex") "unsex"))))

(deftest test-90
  (testing "test case 90"
    (is (= (stemming "needlework") "needlework"))))

(deftest test-91
  (testing "test case 91"
    (is (= (stemming "sophisticating") "sophist"))))

(deftest test-92
  (testing "test case 92"
    (is (= (stemming "trunked") "trunk"))))

(deftest test-93
  (testing "test case 93"
    (is (= (stemming "plumbs") "plumb"))))

(deftest test-94
  (testing "test case 94"
    (is (= (stemming "plummets") "plummet"))))

(deftest test-95
  (testing "test case 95"
    (is (= (stemming "spieled") "spiel"))))

(deftest test-96
  (testing "test case 96"
    (is (= (stemming "nonconformists") "nonconformist"))))

(deftest test-97
  (testing "test case 97"
    (is (= (stemming "baronies") "baroni"))))

(deftest test-98
  (testing "test case 98"
    (is (= (stemming "unmarked") "unmark"))))

(deftest test-99
  (testing "test case 99"
    (is (= (stemming "gaucheries") "gaucheri"))))

(deftest test-100
  (testing "test case 100"
    (is (= (stemming "playfellow") "playfellow"))))

(deftest test-101
  (testing "test case 101"
    (is (= (stemming "daftest") "daftest"))))

(deftest test-102
  (testing "test case 102"
    (is (= (stemming "orderings") "order"))))

(deftest test-103
  (testing "test case 103"
    (is (= (stemming "dobber") "dobber"))))

(deftest test-104
  (testing "test case 104"
    (is (= (stemming "pitifulness") "piti"))))

(deftest test-105
  (testing "test case 105"
    (is (= (stemming "digger") "digger"))))

(deftest test-106
  (testing "test case 106"
    (is (= (stemming "olivia") "olivia"))))

(deftest test-107
  (testing "test case 107"
    (is (= (stemming "blackguards") "blackguard"))))

(deftest test-108
  (testing "test case 108"
    (is (= (stemming "malfeasants") "malfeas"))))

(deftest test-109
  (testing "test case 109"
    (is (= (stemming "beebee") "beebe"))))

(deftest test-110
  (testing "test case 110"
    (is (= (stemming "urogenital") "urogenit"))))

(deftest test-111
  (testing "test case 111"
    (is (= (stemming "monarchial") "monarchi"))))

(deftest test-112
  (testing "test case 112"
    (is (= (stemming "valvelet") "valvelet"))))

(deftest test-113
  (testing "test case 113"
    (is (= (stemming "hazelnut") "hazelnut"))))

(deftest test-114
  (testing "test case 114"
    (is (= (stemming "inflationary") "inflationari"))))

(deftest test-115
  (testing "test case 115"
    (is (= (stemming "palpators") "palpat"))))

(deftest test-116
  (testing "test case 116"
    (is (= (stemming "fizz") "fizz"))))

(deftest test-117
  (testing "test case 117"
    (is (= (stemming "teakwood") "teakwood"))))

(deftest test-118
  (testing "test case 118"
    (is (= (stemming "negatrons") "negatron"))))

(deftest test-119
  (testing "test case 119"
    (is (= (stemming "analyzer") "analyz"))))

(deftest test-120
  (testing "test case 120"
    (is (= (stemming "symptomatically") "symptomat"))))

(deftest test-121
  (testing "test case 121"
    (is (= (stemming "unstop") "unstop"))))

(deftest test-122
  (testing "test case 122"
    (is (= (stemming "growliest") "growliest"))))

(deftest test-123
  (testing "test case 123"
    (is (= (stemming "lands") "land"))))

(deftest test-124
  (testing "test case 124"
    (is (= (stemming "praesidia") "praesidia"))))

(deftest test-125
  (testing "test case 125"
    (is (= (stemming "leakages") "leakag"))))

(deftest test-126
  (testing "test case 126"
    (is (= (stemming "insets") "inset"))))

(deftest test-127
  (testing "test case 127"
    (is (= (stemming "bequeathing") "bequeath"))))

(deftest test-128
  (testing "test case 128"
    (is (= (stemming "tippy") "tippi"))))

(deftest test-129
  (testing "test case 129"
    (is (= (stemming "digits") "digit"))))

(deftest test-130
  (testing "test case 130"
    (is (= (stemming "prosecutable") "prosecut"))))

(deftest test-131
  (testing "test case 131"
    (is (= (stemming "respectively") "respect"))))

(deftest test-132
  (testing "test case 132"
    (is (= (stemming "smallish") "smallish"))))

(deftest test-133
  (testing "test case 133"
    (is (= (stemming "proadoption") "proadopt"))))

(deftest test-134
  (testing "test case 134"
    (is (= (stemming "photoreceptor") "photoreceptor"))))

(deftest test-135
  (testing "test case 135"
    (is (= (stemming "supplementary") "supplementari"))))

(deftest test-136
  (testing "test case 136"
    (is (= (stemming "unstack") "unstack"))))

(deftest test-137
  (testing "test case 137"
    (is (= (stemming "postulant") "postul"))))

(deftest test-138
  (testing "test case 138"
    (is (= (stemming "dressily") "dressili"))))

(deftest test-139
  (testing "test case 139"
    (is (= (stemming "landlordship") "landlordship"))))

(deftest test-140
  (testing "test case 140"
    (is (= (stemming "ignition") "ignit"))))

(deftest test-141
  (testing "test case 141"
    (is (= (stemming "rapes") "rape"))))

(deftest test-142
  (testing "test case 142"
    (is (= (stemming "detract") "detract"))))

(deftest test-143
  (testing "test case 143"
    (is (= (stemming "noncompliance") "noncompli"))))

(deftest test-144
  (testing "test case 144"
    (is (= (stemming "northwestwardly") "northwestwardli"))))

(deftest test-145
  (testing "test case 145"
    (is (= (stemming "coquettish") "coquettish"))))

(deftest test-146
  (testing "test case 146"
    (is (= (stemming "sue") "sue"))))

(deftest test-147
  (testing "test case 147"
    (is (= (stemming "insensateness") "insens"))))

(deftest test-148
  (testing "test case 148"
    (is (= (stemming "parkinsonism") "parkinson"))))

(deftest test-149
  (testing "test case 149"
    (is (= (stemming "mack") "mack"))))

(deftest test-150
  (testing "test case 150"
    (is (= (stemming "prosaically") "prosaic"))))

(deftest test-151
  (testing "test case 151"
    (is (= (stemming "dostoevsky") "dostoevski"))))

(deftest test-152
  (testing "test case 152"
    (is (= (stemming "enneagons") "enneagon"))))

(deftest test-153
  (testing "test case 153"
    (is (= (stemming "mistitles") "mistitl"))))

(deftest test-154
  (testing "test case 154"
    (is (= (stemming "dippings") "dip"))))

(deftest test-155
  (testing "test case 155"
    (is (= (stemming "prelimits") "prelimit"))))

(deftest test-156
  (testing "test case 156"
    (is (= (stemming "silage") "silag"))))

(deftest test-157
  (testing "test case 157"
    (is (= (stemming "dissemblance") "dissembl"))))

(deftest test-158
  (testing "test case 158"
    (is (= (stemming "trainers") "trainer"))))

(deftest test-159
  (testing "test case 159"
    (is (= (stemming "thudded") "thud"))))

(deftest test-160
  (testing "test case 160"
    (is (= (stemming "mauve") "mauv"))))

(deftest test-161
  (testing "test case 161"
    (is (= (stemming "malays") "malai"))))

(deftest test-162
  (testing "test case 162"
    (is (= (stemming "knolls") "knoll"))))

(deftest test-163
  (testing "test case 163"
    (is (= (stemming "incommensurate") "incommensur"))))

(deftest test-164
  (testing "test case 164"
    (is (= (stemming "corselet") "corselet"))))

(deftest test-165
  (testing "test case 165"
    (is (= (stemming "ratifies") "ratifi"))))

(deftest test-166
  (testing "test case 166"
    (is (= (stemming "prosperousness") "prosper"))))

(deftest test-167
  (testing "test case 167"
    (is (= (stemming "footsore") "footsor"))))

(deftest test-168
  (testing "test case 168"
    (is (= (stemming "earmuffs") "earmuff"))))

(deftest test-169
  (testing "test case 169"
    (is (= (stemming "moveably") "moveabl"))))

(deftest test-170
  (testing "test case 170"
    (is (= (stemming "expeditiousness") "expediti"))))

(deftest test-171
  (testing "test case 171"
    (is (= (stemming "becalm") "becalm"))))

(deftest test-172
  (testing "test case 172"
    (is (= (stemming "manila") "manila"))))

(deftest test-173
  (testing "test case 173"
    (is (= (stemming "respective") "respect"))))

(deftest test-174
  (testing "test case 174"
    (is (= (stemming "greenland") "greenland"))))

(deftest test-175
  (testing "test case 175"
    (is (= (stemming "cruelness") "cruel"))))

(deftest test-176
  (testing "test case 176"
    (is (= (stemming "cyanoacrylate") "cyanoacryl"))))

(deftest test-177
  (testing "test case 177"
    (is (= (stemming "maritally") "marit"))))

(deftest test-178
  (testing "test case 178"
    (is (= (stemming "duplicitous") "duplicit"))))

(deftest test-179
  (testing "test case 179"
    (is (= (stemming "pubs") "pub"))))

(deftest test-180
  (testing "test case 180"
    (is (= (stemming "towheaded") "towhead"))))

(deftest test-181
  (testing "test case 181"
    (is (= (stemming "lanced") "lanc"))))

(deftest test-182
  (testing "test case 182"
    (is (= (stemming "sublime") "sublim"))))

(deftest test-183
  (testing "test case 183"
    (is (= (stemming "tensioning") "tension"))))

(deftest test-184
  (testing "test case 184"
    (is (= (stemming "scatologies") "scatolog"))))

(deftest test-185
  (testing "test case 185"
    (is (= (stemming "hives") "hive"))))

(deftest test-186
  (testing "test case 186"
    (is (= (stemming "weakener") "weaken"))))

(deftest test-187
  (testing "test case 187"
    (is (= (stemming "cains") "cain"))))

(deftest test-188
  (testing "test case 188"
    (is (= (stemming "mallards") "mallard"))))

(deftest test-189
  (testing "test case 189"
    (is (= (stemming "enlightening") "enlighten"))))

(deftest test-190
  (testing "test case 190"
    (is (= (stemming "casts") "cast"))))

(deftest test-191
  (testing "test case 191"
    (is (= (stemming "asphaltum") "asphaltum"))))

(deftest test-192
  (testing "test case 192"
    (is (= (stemming "secondines") "secondin"))))

(deftest test-193
  (testing "test case 193"
    (is (= (stemming "sheaves") "sheav"))))

(deftest test-194
  (testing "test case 194"
    (is (= (stemming "geophysicists") "geophysicist"))))

(deftest test-195
  (testing "test case 195"
    (is (= (stemming "bitching") "bitch"))))

(deftest test-196
  (testing "test case 196"
    (is (= (stemming "copperas") "coppera"))))

(deftest test-197
  (testing "test case 197"
    (is (= (stemming "trailed") "trail"))))

(deftest test-198
  (testing "test case 198"
    (is (= (stemming "serologic") "serolog"))))

(deftest test-199
  (testing "test case 199"
    (is (= (stemming "prolixity") "prolix"))))

(deftest test-200
  (testing "test case 200"
    (is (= (stemming "pinchers") "pincher"))))

(deftest test-201
  (testing "test case 201"
    (is (= (stemming "lout") "lout"))))

(deftest test-202
  (testing "test case 202"
    (is (= (stemming "semidependent") "semidepend"))))

(deftest test-203
  (testing "test case 203"
    (is (= (stemming "interlocutresses") "interlocutress"))))

(deftest test-204
  (testing "test case 204"
    (is (= (stemming "threshing") "thresh"))))

(deftest test-205
  (testing "test case 205"
    (is (= (stemming "requests") "request"))))

(deftest test-206
  (testing "test case 206"
    (is (= (stemming "pressruns") "pressrun"))))

(deftest test-207
  (testing "test case 207"
    (is (= (stemming "queue") "queue"))))

(deftest test-208
  (testing "test case 208"
    (is (= (stemming "czarevnas") "czarevna"))))

(deftest test-209
  (testing "test case 209"
    (is (= (stemming "increase") "increas"))))

(deftest test-210
  (testing "test case 210"
    (is (= (stemming "holism") "holism"))))

(deftest test-211
  (testing "test case 211"
    (is (= (stemming "drugstores") "drugstor"))))

(deftest test-212
  (testing "test case 212"
    (is (= (stemming "tetched") "tetch"))))

(deftest test-213
  (testing "test case 213"
    (is (= (stemming "baggages") "baggag"))))

(deftest test-214
  (testing "test case 214"
    (is (= (stemming "achiest") "achiest"))))

(deftest test-215
  (testing "test case 215"
    (is (= (stemming "fusils") "fusil"))))

(deftest test-216
  (testing "test case 216"
    (is (= (stemming "feedstuff") "feedstuff"))))

(deftest test-217
  (testing "test case 217"
    (is (= (stemming "laundrywoman") "laundrywoman"))))

(deftest test-218
  (testing "test case 218"
    (is (= (stemming "falconers") "falcon"))))

(deftest test-219
  (testing "test case 219"
    (is (= (stemming "overtly") "overtli"))))

(deftest test-220
  (testing "test case 220"
    (is (= (stemming "spathe") "spath"))))

(deftest test-221
  (testing "test case 221"
    (is (= (stemming "chanticleer") "chanticl"))))

(deftest test-222
  (testing "test case 222"
    (is (= (stemming "epistasies") "epistasi"))))

(deftest test-223
  (testing "test case 223"
    (is (= (stemming "retransferred") "retransf"))))

(deftest test-224
  (testing "test case 224"
    (is (= (stemming "hypersensitizing") "hypersensit"))))

(deftest test-225
  (testing "test case 225"
    (is (= (stemming "chemosterilant") "chemosteril"))))

(deftest test-226
  (testing "test case 226"
    (is (= (stemming "interlock") "interlock"))))

(deftest test-227
  (testing "test case 227"
    (is (= (stemming "bub") "bub"))))

(deftest test-228
  (testing "test case 228"
    (is (= (stemming "reverends") "reverend"))))

(deftest test-229
  (testing "test case 229"
    (is (= (stemming "microspacing") "microspac"))))

(deftest test-230
  (testing "test case 230"
    (is (= (stemming "financier") "financi"))))

(deftest test-231
  (testing "test case 231"
    (is (= (stemming "imbibed") "imbib"))))

(deftest test-232
  (testing "test case 232"
    (is (= (stemming "trial") "trial"))))

(deftest test-233
  (testing "test case 233"
    (is (= (stemming "doeskin") "doeskin"))))

(deftest test-234
  (testing "test case 234"
    (is (= (stemming "pinfeather") "pinfeath"))))

(deftest test-235
  (testing "test case 235"
    (is (= (stemming "advocated") "advoc"))))

(deftest test-236
  (testing "test case 236"
    (is (= (stemming "improvisors") "improvisor"))))

(deftest test-237
  (testing "test case 237"
    (is (= (stemming "stung") "stung"))))

(deftest test-238
  (testing "test case 238"
    (is (= (stemming "goliaths") "goliath"))))

(deftest test-239
  (testing "test case 239"
    (is (= (stemming "upswings") "upsw"))))

(deftest test-240
  (testing "test case 240"
    (is (= (stemming "affixal") "affix"))))

(deftest test-241
  (testing "test case 241"
    (is (= (stemming "tm") "tm"))))

(deftest test-242
  (testing "test case 242"
    (is (= (stemming "deadwood") "deadwood"))))

(deftest test-243
  (testing "test case 243"
    (is (= (stemming "foreconscious") "foreconsci"))))

(deftest test-244
  (testing "test case 244"
    (is (= (stemming "restfully") "restfulli"))))

(deftest test-245
  (testing "test case 245"
    (is (= (stemming "chuffing") "chuf"))))

(deftest test-246
  (testing "test case 246"
    (is (= (stemming "evangelicals") "evangel"))))

(deftest test-247
  (testing "test case 247"
    (is (= (stemming "omits") "omit"))))

(deftest test-248
  (testing "test case 248"
    (is (= (stemming "superannuity") "superannu"))))

(deftest test-249
  (testing "test case 249"
    (is (= (stemming "parochialism") "parochi"))))

(deftest test-250
  (testing "test case 250"
    (is (= (stemming "deviled") "devil"))))

(deftest test-251
  (testing "test case 251"
    (is (= (stemming "visceromotor") "visceromotor"))))

(deftest test-252
  (testing "test case 252"
    (is (= (stemming "scupper") "scupper"))))

(deftest test-253
  (testing "test case 253"
    (is (= (stemming "interracial") "interraci"))))

(deftest test-254
  (testing "test case 254"
    (is (= (stemming "cannie") "canni"))))

(deftest test-255
  (testing "test case 255"
    (is (= (stemming "morgue") "morgu"))))

(deftest test-256
  (testing "test case 256"
    (is (= (stemming "grunted") "grunt"))))

(deftest test-257
  (testing "test case 257"
    (is (= (stemming "contentious") "contenti"))))

(deftest test-258
  (testing "test case 258"
    (is (= (stemming "reliever") "reliev"))))

(deftest test-259
  (testing "test case 259"
    (is (= (stemming "semaphore") "semaphor"))))

(deftest test-260
  (testing "test case 260"
    (is (= (stemming "suicidology") "suicidolog"))))

(deftest test-261
  (testing "test case 261"
    (is (= (stemming "bowheads") "bowhead"))))

(deftest test-262
  (testing "test case 262"
    (is (= (stemming "liberalization") "liber"))))

(deftest test-263
  (testing "test case 263"
    (is (= (stemming "librettist") "librettist"))))

(deftest test-264
  (testing "test case 264"
    (is (= (stemming "gleaned") "glean"))))

(deftest test-265
  (testing "test case 265"
    (is (= (stemming "concertize") "concert"))))

(deftest test-266
  (testing "test case 266"
    (is (= (stemming "beliefs") "belief"))))

(deftest test-267
  (testing "test case 267"
    (is (= (stemming "subfractional") "subfract"))))

(deftest test-268
  (testing "test case 268"
    (is (= (stemming "taint") "taint"))))

(deftest test-269
  (testing "test case 269"
    (is (= (stemming "curd") "curd"))))

(deftest test-270
  (testing "test case 270"
    (is (= (stemming "airbills") "airbil"))))

(deftest test-271
  (testing "test case 271"
    (is (= (stemming "outyelled") "outyel"))))

(deftest test-272
  (testing "test case 272"
    (is (= (stemming "misplayed") "misplai"))))

(deftest test-273
  (testing "test case 273"
    (is (= (stemming "coiffeur") "coiffeur"))))

(deftest test-274
  (testing "test case 274"
    (is (= (stemming "figworts") "figwort"))))

(deftest test-275
  (testing "test case 275"
    (is (= (stemming "sweethearts") "sweetheart"))))

(deftest test-276
  (testing "test case 276"
    (is (= (stemming "rehardening") "reharden"))))

(deftest test-277
  (testing "test case 277"
    (is (= (stemming "prospected") "prospect"))))

(deftest test-278
  (testing "test case 278"
    (is (= (stemming "swill") "swill"))))

(deftest test-279
  (testing "test case 279"
    (is (= (stemming "depreciating") "depreci"))))

(deftest test-280
  (testing "test case 280"
    (is (= (stemming "resistive") "resist"))))

(deftest test-281
  (testing "test case 281"
    (is (= (stemming "usuals") "usual"))))

(deftest test-282
  (testing "test case 282"
    (is (= (stemming "solarized") "solar"))))

(deftest test-283
  (testing "test case 283"
    (is (= (stemming "hirsute") "hirsut"))))

(deftest test-284
  (testing "test case 284"
    (is (= (stemming "trundle") "trundl"))))

(deftest test-285
  (testing "test case 285"
    (is (= (stemming "undergird") "undergird"))))

(deftest test-286
  (testing "test case 286"
    (is (= (stemming "servile") "servil"))))

(deftest test-287
  (testing "test case 287"
    (is (= (stemming "in") "in"))))

(deftest test-288
  (testing "test case 288"
    (is (= (stemming "wagtail") "wagtail"))))

(deftest test-289
  (testing "test case 289"
    (is (= (stemming "marihuana") "marihuana"))))

(deftest test-290
  (testing "test case 290"
    (is (= (stemming "wretched") "wretch"))))

(deftest test-291
  (testing "test case 291"
    (is (= (stemming "dexes") "dex"))))

(deftest test-292
  (testing "test case 292"
    (is (= (stemming "hydroponic") "hydropon"))))

(deftest test-293
  (testing "test case 293"
    (is (= (stemming "bikeways") "bikewai"))))

(deftest test-294
  (testing "test case 294"
    (is (= (stemming "offcut") "offcut"))))

(deftest test-295
  (testing "test case 295"
    (is (= (stemming "capitalists") "capitalist"))))

(deftest test-296
  (testing "test case 296"
    (is (= (stemming "pressurizer") "pressur"))))

(deftest test-297
  (testing "test case 297"
    (is (= (stemming "raws") "raw"))))

(deftest test-298
  (testing "test case 298"
    (is (= (stemming "competitor") "competitor"))))

(deftest test-299
  (testing "test case 299"
    (is (= (stemming "pokiness") "poki"))))

(deftest test-300
  (testing "test case 300"
    (is (= (stemming "tutor") "tutor"))))

(deftest test-301
  (testing "test case 301"
    (is (= (stemming "ceria") "ceria"))))

(deftest test-302
  (testing "test case 302"
    (is (= (stemming "corking") "cork"))))

(deftest test-303
  (testing "test case 303"
    (is (= (stemming "deflections") "deflect"))))

(deftest test-304
  (testing "test case 304"
    (is (= (stemming "humbleness") "humbl"))))

(deftest test-305
  (testing "test case 305"
    (is (= (stemming "tensional") "tension"))))

(deftest test-306
  (testing "test case 306"
    (is (= (stemming "sufficing") "suffic"))))

(deftest test-307
  (testing "test case 307"
    (is (= (stemming "loathly") "loathli"))))

(deftest test-308
  (testing "test case 308"
    (is (= (stemming "insensitive") "insensit"))))

(deftest test-309
  (testing "test case 309"
    (is (= (stemming "juicy") "juici"))))

(deftest test-310
  (testing "test case 310"
    (is (= (stemming "interlocutrices") "interlocutric"))))

(deftest test-311
  (testing "test case 311"
    (is (= (stemming "tnpk") "tnpk"))))

(deftest test-312
  (testing "test case 312"
    (is (= (stemming "rehang") "rehang"))))

(deftest test-313
  (testing "test case 313"
    (is (= (stemming "inexpressiveness") "inexpress"))))

(deftest test-314
  (testing "test case 314"
    (is (= (stemming "redded") "red"))))

(deftest test-315
  (testing "test case 315"
    (is (= (stemming "magnesias") "magnesia"))))

(deftest test-316
  (testing "test case 316"
    (is (= (stemming "gogo") "gogo"))))

(deftest test-317
  (testing "test case 317"
    (is (= (stemming "viscously") "viscous"))))

(deftest test-318
  (testing "test case 318"
    (is (= (stemming "smearers") "smearer"))))

(deftest test-319
  (testing "test case 319"
    (is (= (stemming "loverly") "loverli"))))

(deftest test-320
  (testing "test case 320"
    (is (= (stemming "fleecily") "fleecili"))))

(deftest test-321
  (testing "test case 321"
    (is (= (stemming "sands") "sand"))))

(deftest test-322
  (testing "test case 322"
    (is (= (stemming "memoranda") "memoranda"))))

(deftest test-323
  (testing "test case 323"
    (is (= (stemming "imperceptibleness") "impercept"))))

(deftest test-324
  (testing "test case 324"
    (is (= (stemming "cyprus") "cypru"))))

(deftest test-325
  (testing "test case 325"
    (is (= (stemming "winterizing") "winter"))))

(deftest test-326
  (testing "test case 326"
    (is (= (stemming "preplans") "preplan"))))

(deftest test-327
  (testing "test case 327"
    (is (= (stemming "identity") "ident"))))

(deftest test-328
  (testing "test case 328"
    (is (= (stemming "striver") "striver"))))

(deftest test-329
  (testing "test case 329"
    (is (= (stemming "palestinians") "palestinian"))))

(deftest test-330
  (testing "test case 330"
    (is (= (stemming "hardly") "hardli"))))

(deftest test-331
  (testing "test case 331"
    (is (= (stemming "battling") "battl"))))

(deftest test-332
  (testing "test case 332"
    (is (= (stemming "skewer") "skewer"))))

(deftest test-333
  (testing "test case 333"
    (is (= (stemming "irruptions") "irrupt"))))

(deftest test-334
  (testing "test case 334"
    (is (= (stemming "unfledged") "unfledg"))))

(deftest test-335
  (testing "test case 335"
    (is (= (stemming "mullion") "mullion"))))

(deftest test-336
  (testing "test case 336"
    (is (= (stemming "confidentially") "confidenti"))))

(deftest test-337
  (testing "test case 337"
    (is (= (stemming "carolled") "carol"))))

(deftest test-338
  (testing "test case 338"
    (is (= (stemming "interdisciplinary") "interdisciplinari"))))

(deftest test-339
  (testing "test case 339"
    (is (= (stemming "speciosity") "specios"))))

(deftest test-340
  (testing "test case 340"
    (is (= (stemming "tripling") "tripl"))))

(deftest test-341
  (testing "test case 341"
    (is (= (stemming "subscripting") "subscript"))))

(deftest test-342
  (testing "test case 342"
    (is (= (stemming "vehicle") "vehicl"))))

(deftest test-343
  (testing "test case 343"
    (is (= (stemming "homo") "homo"))))

(deftest test-344
  (testing "test case 344"
    (is (= (stemming "deprivals") "depriv"))))

(deftest test-345
  (testing "test case 345"
    (is (= (stemming "ichthyism") "ichthyism"))))

(deftest test-346
  (testing "test case 346"
    (is (= (stemming "exorcising") "exorcis"))))

(deftest test-347
  (testing "test case 347"
    (is (= (stemming "federalization") "feder"))))

(deftest test-348
  (testing "test case 348"
    (is (= (stemming "shoeing") "shoe"))))

(deftest test-349
  (testing "test case 349"
    (is (= (stemming "cajoles") "cajol"))))

(deftest test-350
  (testing "test case 350"
    (is (= (stemming "mope") "mope"))))

(deftest test-351
  (testing "test case 351"
    (is (= (stemming "redundancy") "redund"))))

(deftest test-352
  (testing "test case 352"
    (is (= (stemming "cenacle") "cenacl"))))

(deftest test-353
  (testing "test case 353"
    (is (= (stemming "purposely") "purpos"))))

(deftest test-354
  (testing "test case 354"
    (is (= (stemming "triangulating") "triangul"))))

(deftest test-355
  (testing "test case 355"
    (is (= (stemming "ostia") "ostia"))))

(deftest test-356
  (testing "test case 356"
    (is (= (stemming "versified") "versifi"))))

(deftest test-357
  (testing "test case 357"
    (is (= (stemming "overprinted") "overprint"))))

(deftest test-358
  (testing "test case 358"
    (is (= (stemming "roisterers") "roister"))))

(deftest test-359
  (testing "test case 359"
    (is (= (stemming "purloined") "purloin"))))

(deftest test-360
  (testing "test case 360"
    (is (= (stemming "belittlement") "belittl"))))

(deftest test-361
  (testing "test case 361"
    (is (= (stemming "gimbaled") "gimbal"))))

(deftest test-362
  (testing "test case 362"
    (is (= (stemming "pardoner") "pardon"))))

(deftest test-363
  (testing "test case 363"
    (is (= (stemming "laburnums") "laburnum"))))

(deftest test-364
  (testing "test case 364"
    (is (= (stemming "concerns") "concern"))))

(deftest test-365
  (testing "test case 365"
    (is (= (stemming "extorted") "extort"))))

(deftest test-366
  (testing "test case 366"
    (is (= (stemming "pug") "pug"))))

(deftest test-367
  (testing "test case 367"
    (is (= (stemming "fringed") "fring"))))

(deftest test-368
  (testing "test case 368"
    (is (= (stemming "wooers") "wooer"))))

(deftest test-369
  (testing "test case 369"
    (is (= (stemming "sleeking") "sleek"))))

(deftest test-370
  (testing "test case 370"
    (is (= (stemming "togs") "tog"))))

(deftest test-371
  (testing "test case 371"
    (is (= (stemming "sacramental") "sacrament"))))

(deftest test-372
  (testing "test case 372"
    (is (= (stemming "louisville") "louisvil"))))

(deftest test-373
  (testing "test case 373"
    (is (= (stemming "masculines") "masculin"))))

(deftest test-374
  (testing "test case 374"
    (is (= (stemming "engirdle") "engirdl"))))

(deftest test-375
  (testing "test case 375"
    (is (= (stemming "flaunted") "flaunt"))))

(deftest test-376
  (testing "test case 376"
    (is (= (stemming "mucking") "muck"))))

(deftest test-377
  (testing "test case 377"
    (is (= (stemming "brio") "brio"))))

(deftest test-378
  (testing "test case 378"
    (is (= (stemming "nonpartisans") "nonpartisan"))))

(deftest test-379
  (testing "test case 379"
    (is (= (stemming "imperfectability") "imperfect"))))

(deftest test-380
  (testing "test case 380"
    (is (= (stemming "noisier") "noisier"))))

(deftest test-381
  (testing "test case 381"
    (is (= (stemming "bier") "bier"))))

(deftest test-382
  (testing "test case 382"
    (is (= (stemming "redescribed") "redescrib"))))

(deftest test-383
  (testing "test case 383"
    (is (= (stemming "administerings") "administ"))))

(deftest test-384
  (testing "test case 384"
    (is (= (stemming "sangrias") "sangria"))))

(deftest test-385
  (testing "test case 385"
    (is (= (stemming "snaking") "snake"))))

(deftest test-386
  (testing "test case 386"
    (is (= (stemming "unfalteringly") "unfalteringli"))))

(deftest test-387
  (testing "test case 387"
    (is (= (stemming "irremediable") "irremedi"))))

(deftest test-388
  (testing "test case 388"
    (is (= (stemming "misdealing") "misdeal"))))

(deftest test-389
  (testing "test case 389"
    (is (= (stemming "mounding") "mound"))))

(deftest test-390
  (testing "test case 390"
    (is (= (stemming "restored") "restor"))))

(deftest test-391
  (testing "test case 391"
    (is (= (stemming "overcomes") "overcom"))))

(deftest test-392
  (testing "test case 392"
    (is (= (stemming "sinuous") "sinuou"))))

(deftest test-393
  (testing "test case 393"
    (is (= (stemming "cockroach") "cockroach"))))

(deftest test-394
  (testing "test case 394"
    (is (= (stemming "mystifyingly") "mystifyingli"))))

(deftest test-395
  (testing "test case 395"
    (is (= (stemming "goddamning") "goddamn"))))

(deftest test-396
  (testing "test case 396"
    (is (= (stemming "paroling") "parol"))))

(deftest test-397
  (testing "test case 397"
    (is (= (stemming "damselfly") "damselfli"))))

(deftest test-398
  (testing "test case 398"
    (is (= (stemming "sauropod") "sauropod"))))

(deftest test-399
  (testing "test case 399"
    (is (= (stemming "brandish") "brandish"))))

(deftest test-400
  (testing "test case 400"
    (is (= (stemming "gangly") "gangli"))))

(deftest test-401
  (testing "test case 401"
    (is (= (stemming "ooze") "ooz"))))

(deftest test-402
  (testing "test case 402"
    (is (= (stemming "carriage") "carriag"))))

(deftest test-403
  (testing "test case 403"
    (is (= (stemming "rotisserie") "rotisseri"))))

(deftest test-404
  (testing "test case 404"
    (is (= (stemming "anions") "anion"))))

(deftest test-405
  (testing "test case 405"
    (is (= (stemming "fumitory") "fumitori"))))

(deftest test-406
  (testing "test case 406"
    (is (= (stemming "fielder") "fielder"))))

(deftest test-407
  (testing "test case 407"
    (is (= (stemming "coigne") "coign"))))

(deftest test-408
  (testing "test case 408"
    (is (= (stemming "ratifying") "ratifi"))))

(deftest test-409
  (testing "test case 409"
    (is (= (stemming "diagrammatic") "diagrammat"))))

(deftest test-410
  (testing "test case 410"
    (is (= (stemming "blondest") "blondest"))))

(deftest test-411
  (testing "test case 411"
    (is (= (stemming "concurrently") "concurr"))))

(deftest test-412
  (testing "test case 412"
    (is (= (stemming "interruption") "interrupt"))))

(deftest test-413
  (testing "test case 413"
    (is (= (stemming "conventicles") "conventicl"))))

(deftest test-414
  (testing "test case 414"
    (is (= (stemming "nudies") "nudi"))))

(deftest test-415
  (testing "test case 415"
    (is (= (stemming "imperfections") "imperfect"))))

(deftest test-416
  (testing "test case 416"
    (is (= (stemming "jackknives") "jackkniv"))))

(deftest test-417
  (testing "test case 417"
    (is (= (stemming "bacteriologist") "bacteriologist"))))

(deftest test-418
  (testing "test case 418"
    (is (= (stemming "avouch") "avouch"))))

(deftest test-419
  (testing "test case 419"
    (is (= (stemming "provoking") "provok"))))

(deftest test-420
  (testing "test case 420"
    (is (= (stemming "betrayers") "betray"))))

(deftest test-421
  (testing "test case 421"
    (is (= (stemming "counseled") "counsel"))))

(deftest test-422
  (testing "test case 422"
    (is (= (stemming "ungulates") "ungul"))))

(deftest test-423
  (testing "test case 423"
    (is (= (stemming "preregistering") "preregist"))))

(deftest test-424
  (testing "test case 424"
    (is (= (stemming "durabilities") "durabl"))))

(deftest test-425
  (testing "test case 425"
    (is (= (stemming "bowled") "bowl"))))

(deftest test-426
  (testing "test case 426"
    (is (= (stemming "briberies") "briberi"))))

(deftest test-427
  (testing "test case 427"
    (is (= (stemming "causer") "causer"))))

(deftest test-428
  (testing "test case 428"
    (is (= (stemming "psychosis") "psychosi"))))

(deftest test-429
  (testing "test case 429"
    (is (= (stemming "readying") "readi"))))

(deftest test-430
  (testing "test case 430"
    (is (= (stemming "vibrance") "vibranc"))))

(deftest test-431
  (testing "test case 431"
    (is (= (stemming "forepart") "forepart"))))

(deftest test-432
  (testing "test case 432"
    (is (= (stemming "insurmountably") "insurmount"))))

(deftest test-433
  (testing "test case 433"
    (is (= (stemming "reminiscing") "reminisc"))))

(deftest test-434
  (testing "test case 434"
    (is (= (stemming "contes") "cont"))))

(deftest test-435
  (testing "test case 435"
    (is (= (stemming "ordonnance") "ordonn"))))

(deftest test-436
  (testing "test case 436"
    (is (= (stemming "inherent") "inher"))))

(deftest test-437
  (testing "test case 437"
    (is (= (stemming "miscuing") "miscu"))))

(deftest test-438
  (testing "test case 438"
    (is (= (stemming "interviewees") "interviewe"))))

(deftest test-439
  (testing "test case 439"
    (is (= (stemming "tugger") "tugger"))))

(deftest test-440
  (testing "test case 440"
    (is (= (stemming "acrylate") "acryl"))))

(deftest test-441
  (testing "test case 441"
    (is (= (stemming "alternates") "altern"))))

(deftest test-442
  (testing "test case 442"
    (is (= (stemming "unworkably") "unwork"))))

(deftest test-443
  (testing "test case 443"
    (is (= (stemming "unripened") "unripen"))))

(deftest test-444
  (testing "test case 444"
    (is (= (stemming "regulator") "regul"))))

(deftest test-445
  (testing "test case 445"
    (is (= (stemming "skater") "skater"))))

(deftest test-446
  (testing "test case 446"
    (is (= (stemming "coverups") "coverup"))))

(deftest test-447
  (testing "test case 447"
    (is (= (stemming "dogteeth") "dogteeth"))))

(deftest test-448
  (testing "test case 448"
    (is (= (stemming "megacycles") "megacycl"))))

(deftest test-449
  (testing "test case 449"
    (is (= (stemming "cymbalist") "cymbalist"))))

(deftest test-450
  (testing "test case 450"
    (is (= (stemming "siring") "sire"))))

(deftest test-451
  (testing "test case 451"
    (is (= (stemming "unsuccessful") "unsuccess"))))

(deftest test-452
  (testing "test case 452"
    (is (= (stemming "typified") "typifi"))))

(deftest test-453
  (testing "test case 453"
    (is (= (stemming "nightjar") "nightjar"))))

(deftest test-454
  (testing "test case 454"
    (is (= (stemming "bellmen") "bellmen"))))

(deftest test-455
  (testing "test case 455"
    (is (= (stemming "sifting") "sift"))))

(deftest test-456
  (testing "test case 456"
    (is (= (stemming "wives") "wive"))))

(deftest test-457
  (testing "test case 457"
    (is (= (stemming "mongolian") "mongolian"))))

(deftest test-458
  (testing "test case 458"
    (is (= (stemming "lee") "lee"))))

(deftest test-459
  (testing "test case 459"
    (is (= (stemming "convex") "convex"))))

(deftest test-460
  (testing "test case 460"
    (is (= (stemming "decompensating") "decompens"))))

(deftest test-461
  (testing "test case 461"
    (is (= (stemming "overweighed") "overweigh"))))

(deftest test-462
  (testing "test case 462"
    (is (= (stemming "genuflected") "genuflect"))))

(deftest test-463
  (testing "test case 463"
    (is (= (stemming "doctrinally") "doctrin"))))

(deftest test-464
  (testing "test case 464"
    (is (= (stemming "perforated") "perfor"))))

(deftest test-465
  (testing "test case 465"
    (is (= (stemming "shrewder") "shrewder"))))

(deftest test-466
  (testing "test case 466"
    (is (= (stemming "mylar") "mylar"))))

(deftest test-467
  (testing "test case 467"
    (is (= (stemming "interweaving") "interweav"))))

(deftest test-468
  (testing "test case 468"
    (is (= (stemming "deerstalker") "deerstalk"))))

(deftest test-469
  (testing "test case 469"
    (is (= (stemming "microdissection") "microdissect"))))

(deftest test-470
  (testing "test case 470"
    (is (= (stemming "playground") "playground"))))

(deftest test-471
  (testing "test case 471"
    (is (= (stemming "exchange") "exchang"))))

(deftest test-472
  (testing "test case 472"
    (is (= (stemming "bleakly") "bleakli"))))

(deftest test-473
  (testing "test case 473"
    (is (= (stemming "hopelessness") "hopeless"))))

(deftest test-474
  (testing "test case 474"
    (is (= (stemming "painting") "paint"))))

(deftest test-475
  (testing "test case 475"
    (is (= (stemming "cadres") "cadr"))))

(deftest test-476
  (testing "test case 476"
    (is (= (stemming "bullet") "bullet"))))

(deftest test-477
  (testing "test case 477"
    (is (= (stemming "ostensibly") "ostens"))))

(deftest test-478
  (testing "test case 478"
    (is (= (stemming "prosecutive") "prosecut"))))

(deftest test-479
  (testing "test case 479"
    (is (= (stemming "blends") "blend"))))

(deftest test-480
  (testing "test case 480"
    (is (= (stemming "zap") "zap"))))

(deftest test-481
  (testing "test case 481"
    (is (= (stemming "almanacs") "almanac"))))

(deftest test-482
  (testing "test case 482"
    (is (= (stemming "staying") "stai"))))

(deftest test-483
  (testing "test case 483"
    (is (= (stemming "nolle") "noll"))))

(deftest test-484
  (testing "test case 484"
    (is (= (stemming "ragbags") "ragbag"))))

(deftest test-485
  (testing "test case 485"
    (is (= (stemming "divisible") "divis"))))

(deftest test-486
  (testing "test case 486"
    (is (= (stemming "kiddoes") "kiddo"))))

(deftest test-487
  (testing "test case 487"
    (is (= (stemming "intervertebral") "intervertebr"))))

(deftest test-488
  (testing "test case 488"
    (is (= (stemming "trickly") "trickli"))))

(deftest test-489
  (testing "test case 489"
    (is (= (stemming "besmeared") "besmear"))))

(deftest test-490
  (testing "test case 490"
    (is (= (stemming "sweeten") "sweeten"))))

(deftest test-491
  (testing "test case 491"
    (is (= (stemming "gluiest") "gluiest"))))

(deftest test-492
  (testing "test case 492"
    (is (= (stemming "minacity") "minac"))))

(deftest test-493
  (testing "test case 493"
    (is (= (stemming "luncheonettes") "luncheonett"))))

(deftest test-494
  (testing "test case 494"
    (is (= (stemming "hermitry") "hermitri"))))

(deftest test-495
  (testing "test case 495"
    (is (= (stemming "noway") "nowai"))))

(deftest test-496
  (testing "test case 496"
    (is (= (stemming "zillionth") "zillionth"))))

(deftest test-497
  (testing "test case 497"
    (is (= (stemming "appertained") "appertain"))))

(deftest test-498
  (testing "test case 498"
    (is (= (stemming "watchout") "watchout"))))

(deftest test-499
  (testing "test case 499"
    (is (= (stemming "wigglier") "wigglier"))))

(deftest test-500
  (testing "test case 500"
    (is (= (stemming "remarker") "remark"))))

(deftest test-501
  (testing "test case 501"
    (is (= (stemming "plied") "pli"))))

(deftest test-502
  (testing "test case 502"
    (is (= (stemming "imam") "imam"))))

(deftest test-503
  (testing "test case 503"
    (is (= (stemming "leva") "leva"))))

(deftest test-504
  (testing "test case 504"
    (is (= (stemming "scenes") "scene"))))

(deftest test-505
  (testing "test case 505"
    (is (= (stemming "snowpack") "snowpack"))))

(deftest test-506
  (testing "test case 506"
    (is (= (stemming "desalinizing") "desalin"))))

(deftest test-507
  (testing "test case 507"
    (is (= (stemming "shists") "shist"))))

(deftest test-508
  (testing "test case 508"
    (is (= (stemming "amyl") "amyl"))))

(deftest test-509
  (testing "test case 509"
    (is (= (stemming "elements") "element"))))

(deftest test-510
  (testing "test case 510"
    (is (= (stemming "angling") "angl"))))

(deftest test-511
  (testing "test case 511"
    (is (= (stemming "bitten") "bitten"))))

(deftest test-512
  (testing "test case 512"
    (is (= (stemming "halibuts") "halibut"))))

(deftest test-513
  (testing "test case 513"
    (is (= (stemming "benes") "bene"))))

(deftest test-514
  (testing "test case 514"
    (is (= (stemming "renominated") "renomin"))))

(deftest test-515
  (testing "test case 515"
    (is (= (stemming "serial") "serial"))))

(deftest test-516
  (testing "test case 516"
    (is (= (stemming "insofar") "insofar"))))

(deftest test-517
  (testing "test case 517"
    (is (= (stemming "nothingness") "nothing"))))

(deftest test-518
  (testing "test case 518"
    (is (= (stemming "lallygag") "lallygag"))))

(deftest test-519
  (testing "test case 519"
    (is (= (stemming "prexies") "prexi"))))

(deftest test-520
  (testing "test case 520"
    (is (= (stemming "boardmen") "boardmen"))))

(deftest test-521
  (testing "test case 521"
    (is (= (stemming "infold") "infold"))))

(deftest test-522
  (testing "test case 522"
    (is (= (stemming "counterinsurgents") "counterinsurg"))))

(deftest test-523
  (testing "test case 523"
    (is (= (stemming "chowing") "chow"))))

(deftest test-524
  (testing "test case 524"
    (is (= (stemming "lasher") "lasher"))))

(deftest test-525
  (testing "test case 525"
    (is (= (stemming "mugwort") "mugwort"))))

(deftest test-526
  (testing "test case 526"
    (is (= (stemming "chestnut") "chestnut"))))

(deftest test-527
  (testing "test case 527"
    (is (= (stemming "steamboats") "steamboat"))))

(deftest test-528
  (testing "test case 528"
    (is (= (stemming "repeopled") "repeopl"))))

(deftest test-529
  (testing "test case 529"
    (is (= (stemming "gunmetals") "gunmet"))))

(deftest test-530
  (testing "test case 530"
    (is (= (stemming "photomicrographic") "photomicrograph"))))

(deftest test-531
  (testing "test case 531"
    (is (= (stemming "nonreaders") "nonread"))))

(deftest test-532
  (testing "test case 532"
    (is (= (stemming "despoliations") "despoli"))))

(deftest test-533
  (testing "test case 533"
    (is (= (stemming "nonspecialized") "nonspeci"))))

(deftest test-534
  (testing "test case 534"
    (is (= (stemming "chewy") "chewi"))))

(deftest test-535
  (testing "test case 535"
    (is (= (stemming "prefabricated") "prefabr"))))

(deftest test-536
  (testing "test case 536"
    (is (= (stemming "foresters") "forest"))))

(deftest test-537
  (testing "test case 537"
    (is (= (stemming "jane") "jane"))))

(deftest test-538
  (testing "test case 538"
    (is (= (stemming "lodestars") "lodestar"))))

(deftest test-539
  (testing "test case 539"
    (is (= (stemming "suzerain") "suzerain"))))

(deftest test-540
  (testing "test case 540"
    (is (= (stemming "additive") "addit"))))

(deftest test-541
  (testing "test case 541"
    (is (= (stemming "causes") "caus"))))

(deftest test-542
  (testing "test case 542"
    (is (= (stemming "photographic") "photograph"))))

(deftest test-543
  (testing "test case 543"
    (is (= (stemming "teaspoonful") "teaspoon"))))

(deftest test-544
  (testing "test case 544"
    (is (= (stemming "crofter") "crofter"))))

(deftest test-545
  (testing "test case 545"
    (is (= (stemming "lutherans") "lutheran"))))

(deftest test-546
  (testing "test case 546"
    (is (= (stemming "immutableness") "immut"))))

(deftest test-547
  (testing "test case 547"
    (is (= (stemming "decomposing") "decompos"))))

(deftest test-548
  (testing "test case 548"
    (is (= (stemming "libellers") "libel"))))

(deftest test-549
  (testing "test case 549"
    (is (= (stemming "advising") "advis"))))

(deftest test-550
  (testing "test case 550"
    (is (= (stemming "palpable") "palpabl"))))

(deftest test-551
  (testing "test case 551"
    (is (= (stemming "insurance") "insur"))))

(deftest test-552
  (testing "test case 552"
    (is (= (stemming "eject") "eject"))))

(deftest test-553
  (testing "test case 553"
    (is (= (stemming "unburdening") "unburden"))))

(deftest test-554
  (testing "test case 554"
    (is (= (stemming "administratrices") "administratric"))))

(deftest test-555
  (testing "test case 555"
    (is (= (stemming "whimsies") "whimsi"))))

(deftest test-556
  (testing "test case 556"
    (is (= (stemming "unpleasant") "unpleas"))))

(deftest test-557
  (testing "test case 557"
    (is (= (stemming "corroboratively") "corrobor"))))

(deftest test-558
  (testing "test case 558"
    (is (= (stemming "intelligences") "intellig"))))

(deftest test-559
  (testing "test case 559"
    (is (= (stemming "topmost") "topmost"))))

(deftest test-560
  (testing "test case 560"
    (is (= (stemming "logging") "log"))))

(deftest test-561
  (testing "test case 561"
    (is (= (stemming "frambesia") "frambesia"))))

(deftest test-562
  (testing "test case 562"
    (is (= (stemming "moralizer") "moral"))))

(deftest test-563
  (testing "test case 563"
    (is (= (stemming "linguistics") "linguist"))))

(deftest test-564
  (testing "test case 564"
    (is (= (stemming "goggle") "goggl"))))

(deftest test-565
  (testing "test case 565"
    (is (= (stemming "grotesquely") "grotesqu"))))

(deftest test-566
  (testing "test case 566"
    (is (= (stemming "serge") "serg"))))

(deftest test-567
  (testing "test case 567"
    (is (= (stemming "sacrifices") "sacrific"))))

(deftest test-568
  (testing "test case 568"
    (is (= (stemming "reconditions") "recondit"))))

(deftest test-569
  (testing "test case 569"
    (is (= (stemming "morphologists") "morphologist"))))

(deftest test-570
  (testing "test case 570"
    (is (= (stemming "matchlocks") "matchlock"))))

(deftest test-571
  (testing "test case 571"
    (is (= (stemming "uprisings") "upris"))))

(deftest test-572
  (testing "test case 572"
    (is (= (stemming "ceaseless") "ceaseless"))))

(deftest test-573
  (testing "test case 573"
    (is (= (stemming "vancouver") "vancouv"))))

(deftest test-574
  (testing "test case 574"
    (is (= (stemming "cesura") "cesura"))))

(deftest test-575
  (testing "test case 575"
    (is (= (stemming "teamsters") "teamster"))))

(deftest test-576
  (testing "test case 576"
    (is (= (stemming "consensuses") "consensus"))))

(deftest test-577
  (testing "test case 577"
    (is (= (stemming "serenities") "seren"))))

(deftest test-578
  (testing "test case 578"
    (is (= (stemming "rainwater") "rainwat"))))

(deftest test-579
  (testing "test case 579"
    (is (= (stemming "ghoul") "ghoul"))))

(deftest test-580
  (testing "test case 580"
    (is (= (stemming "whooplas") "whoopla"))))

(deftest test-581
  (testing "test case 581"
    (is (= (stemming "quackism") "quackism"))))

(deftest test-582
  (testing "test case 582"
    (is (= (stemming "overvalue") "overvalu"))))

(deftest test-583
  (testing "test case 583"
    (is (= (stemming "puritanism") "puritan"))))

(deftest test-584
  (testing "test case 584"
    (is (= (stemming "preexists") "preexist"))))

(deftest test-585
  (testing "test case 585"
    (is (= (stemming "attribute") "attribut"))))

(deftest test-586
  (testing "test case 586"
    (is (= (stemming "toastmistresses") "toastmistress"))))

(deftest test-587
  (testing "test case 587"
    (is (= (stemming "barnstormer") "barnstorm"))))

(deftest test-588
  (testing "test case 588"
    (is (= (stemming "undergirded") "undergird"))))

(deftest test-589
  (testing "test case 589"
    (is (= (stemming "acorn") "acorn"))))

(deftest test-590
  (testing "test case 590"
    (is (= (stemming "independents") "independ"))))

(deftest test-591
  (testing "test case 591"
    (is (= (stemming "agents") "agent"))))

(deftest test-592
  (testing "test case 592"
    (is (= (stemming "scullers") "sculler"))))

(deftest test-593
  (testing "test case 593"
    (is (= (stemming "pinioned") "pinion"))))

(deftest test-594
  (testing "test case 594"
    (is (= (stemming "calculational") "calcul"))))

(deftest test-595
  (testing "test case 595"
    (is (= (stemming "drachmae") "drachma"))))

(deftest test-596
  (testing "test case 596"
    (is (= (stemming "cautery") "cauteri"))))

(deftest test-597
  (testing "test case 597"
    (is (= (stemming "thoughts") "thought"))))

(deftest test-598
  (testing "test case 598"
    (is (= (stemming "cycloid") "cycloid"))))

(deftest test-599
  (testing "test case 599"
    (is (= (stemming "desirability") "desir"))))

(deftest test-600
  (testing "test case 600"
    (is (= (stemming "volumetrically") "volumetr"))))

(deftest test-601
  (testing "test case 601"
    (is (= (stemming "misplacing") "misplac"))))

(deftest test-602
  (testing "test case 602"
    (is (= (stemming "whomps") "whomp"))))

(deftest test-603
  (testing "test case 603"
    (is (= (stemming "waggon") "waggon"))))

(deftest test-604
  (testing "test case 604"
    (is (= (stemming "unpracticable") "unpractic"))))

(deftest test-605
  (testing "test case 605"
    (is (= (stemming "retrenches") "retrench"))))

(deftest test-606
  (testing "test case 606"
    (is (= (stemming "submergibility") "submerg"))))

(deftest test-607
  (testing "test case 607"
    (is (= (stemming "boughs") "bough"))))

(deftest test-608
  (testing "test case 608"
    (is (= (stemming "compts") "compt"))))

(deftest test-609
  (testing "test case 609"
    (is (= (stemming "clangs") "clang"))))

(deftest test-610
  (testing "test case 610"
    (is (= (stemming "distillations") "distil"))))

(deftest test-611
  (testing "test case 611"
    (is (= (stemming "morphin") "morphin"))))

(deftest test-612
  (testing "test case 612"
    (is (= (stemming "grunter") "grunter"))))

(deftest test-613
  (testing "test case 613"
    (is (= (stemming "dietetics") "dietet"))))

(deftest test-614
  (testing "test case 614"
    (is (= (stemming "gnosis") "gnosi"))))

(deftest test-615
  (testing "test case 615"
    (is (= (stemming "anecdotic") "anecdot"))))

(deftest test-616
  (testing "test case 616"
    (is (= (stemming "phoniest") "phoniest"))))

(deftest test-617
  (testing "test case 617"
    (is (= (stemming "heavily") "heavili"))))

(deftest test-618
  (testing "test case 618"
    (is (= (stemming "iambics") "iambic"))))

(deftest test-619
  (testing "test case 619"
    (is (= (stemming "expendable") "expend"))))

(deftest test-620
  (testing "test case 620"
    (is (= (stemming "woolsorter") "woolsort"))))

(deftest test-621
  (testing "test case 621"
    (is (= (stemming "uniforming") "uniform"))))

(deftest test-622
  (testing "test case 622"
    (is (= (stemming "troopers") "trooper"))))

(deftest test-623
  (testing "test case 623"
    (is (= (stemming "learning") "learn"))))

(deftest test-624
  (testing "test case 624"
    (is (= (stemming "vice") "vice"))))

(deftest test-625
  (testing "test case 625"
    (is (= (stemming "schmeer") "schmeer"))))

(deftest test-626
  (testing "test case 626"
    (is (= (stemming "unshaven") "unshaven"))))

(deftest test-627
  (testing "test case 627"
    (is (= (stemming "patina") "patina"))))

(deftest test-628
  (testing "test case 628"
    (is (= (stemming "mackintosh") "mackintosh"))))

(deftest test-629
  (testing "test case 629"
    (is (= (stemming "abscission") "absciss"))))

(deftest test-630
  (testing "test case 630"
    (is (= (stemming "pericardium") "pericardium"))))

(deftest test-631
  (testing "test case 631"
    (is (= (stemming "incubi") "incubi"))))

(deftest test-632
  (testing "test case 632"
    (is (= (stemming "outsmarting") "outsmart"))))

(deftest test-633
  (testing "test case 633"
    (is (= (stemming "theatergoers") "theatergo"))))

(deftest test-634
  (testing "test case 634"
    (is (= (stemming "underrating") "underr"))))

(deftest test-635
  (testing "test case 635"
    (is (= (stemming "wrang") "wrang"))))

(deftest test-636
  (testing "test case 636"
    (is (= (stemming "yawl") "yawl"))))

(deftest test-637
  (testing "test case 637"
    (is (= (stemming "contrariness") "contrari"))))

(deftest test-638
  (testing "test case 638"
    (is (= (stemming "flavoring") "flavor"))))

(deftest test-639
  (testing "test case 639"
    (is (= (stemming "backwater") "backwat"))))

(deftest test-640
  (testing "test case 640"
    (is (= (stemming "captors") "captor"))))

(deftest test-641
  (testing "test case 641"
    (is (= (stemming "reencounters") "reencount"))))

(deftest test-642
  (testing "test case 642"
    (is (= (stemming "etymological") "etymolog"))))

(deftest test-643
  (testing "test case 643"
    (is (= (stemming "atomizer") "atom"))))

(deftest test-644
  (testing "test case 644"
    (is (= (stemming "pencilled") "pencil"))))

(deftest test-645
  (testing "test case 645"
    (is (= (stemming "windburned") "windburn"))))

(deftest test-646
  (testing "test case 646"
    (is (= (stemming "mystifies") "mystifi"))))

(deftest test-647
  (testing "test case 647"
    (is (= (stemming "climacteric") "climacter"))))

(deftest test-648
  (testing "test case 648"
    (is (= (stemming "haul") "haul"))))

(deftest test-649
  (testing "test case 649"
    (is (= (stemming "biotechnological") "biotechnolog"))))

(deftest test-650
  (testing "test case 650"
    (is (= (stemming "adorability") "ador"))))

(deftest test-651
  (testing "test case 651"
    (is (= (stemming "hawthorn") "hawthorn"))))

(deftest test-652
  (testing "test case 652"
    (is (= (stemming "ruglike") "ruglik"))))

(deftest test-653
  (testing "test case 653"
    (is (= (stemming "shrinker") "shrinker"))))

(deftest test-654
  (testing "test case 654"
    (is (= (stemming "surcoats") "surcoat"))))

(deftest test-655
  (testing "test case 655"
    (is (= (stemming "midis") "midi"))))

(deftest test-656
  (testing "test case 656"
    (is (= (stemming "aurorae") "aurora"))))

(deftest test-657
  (testing "test case 657"
    (is (= (stemming "allocator") "alloc"))))

(deftest test-658
  (testing "test case 658"
    (is (= (stemming "umteenth") "umteenth"))))

(deftest test-659
  (testing "test case 659"
    (is (= (stemming "thereamong") "thereamong"))))

(deftest test-660
  (testing "test case 660"
    (is (= (stemming "ninety") "nineti"))))

(deftest test-661
  (testing "test case 661"
    (is (= (stemming "matchless") "matchless"))))

(deftest test-662
  (testing "test case 662"
    (is (= (stemming "obliques") "obliqu"))))

(deftest test-663
  (testing "test case 663"
    (is (= (stemming "bombast") "bombast"))))

(deftest test-664
  (testing "test case 664"
    (is (= (stemming "thickener") "thicken"))))

(deftest test-665
  (testing "test case 665"
    (is (= (stemming "shipmate") "shipmat"))))

(deftest test-666
  (testing "test case 666"
    (is (= (stemming "marinas") "marina"))))

(deftest test-667
  (testing "test case 667"
    (is (= (stemming "alopecias") "alopecia"))))

(deftest test-668
  (testing "test case 668"
    (is (= (stemming "downlink") "downlink"))))

(deftest test-669
  (testing "test case 669"
    (is (= (stemming "toothpastes") "toothpast"))))

(deftest test-670
  (testing "test case 670"
    (is (= (stemming "disaggregation") "disaggreg"))))

(deftest test-671
  (testing "test case 671"
    (is (= (stemming "arrowhead") "arrowhead"))))

(deftest test-672
  (testing "test case 672"
    (is (= (stemming "debuts") "debut"))))

(deftest test-673
  (testing "test case 673"
    (is (= (stemming "fluttered") "flutter"))))

(deftest test-674
  (testing "test case 674"
    (is (= (stemming "rippling") "rippl"))))

(deftest test-675
  (testing "test case 675"
    (is (= (stemming "lunies") "luni"))))

(deftest test-676
  (testing "test case 676"
    (is (= (stemming "stacker") "stacker"))))

(deftest test-677
  (testing "test case 677"
    (is (= (stemming "sectile") "sectil"))))

(deftest test-678
  (testing "test case 678"
    (is (= (stemming "tempered") "temper"))))

(deftest test-679
  (testing "test case 679"
    (is (= (stemming "tremblier") "tremblier"))))

(deftest test-680
  (testing "test case 680"
    (is (= (stemming "hairspray") "hairsprai"))))

(deftest test-681
  (testing "test case 681"
    (is (= (stemming "scalpels") "scalpel"))))

(deftest test-682
  (testing "test case 682"
    (is (= (stemming "besprinkled") "besprinkl"))))

(deftest test-683
  (testing "test case 683"
    (is (= (stemming "declinable") "declin"))))

(deftest test-684
  (testing "test case 684"
    (is (= (stemming "couturier") "couturi"))))

(deftest test-685
  (testing "test case 685"
    (is (= (stemming "subrule") "subrul"))))

(deftest test-686
  (testing "test case 686"
    (is (= (stemming "cardiologies") "cardiolog"))))

(deftest test-687
  (testing "test case 687"
    (is (= (stemming "karsts") "karst"))))

(deftest test-688
  (testing "test case 688"
    (is (= (stemming "reproof") "reproof"))))

(deftest test-689
  (testing "test case 689"
    (is (= (stemming "adduced") "adduc"))))

(deftest test-690
  (testing "test case 690"
    (is (= (stemming "evens") "even"))))

(deftest test-691
  (testing "test case 691"
    (is (= (stemming "beseecher") "beseech"))))

(deftest test-692
  (testing "test case 692"
    (is (= (stemming "oilskins") "oilskin"))))

(deftest test-693
  (testing "test case 693"
    (is (= (stemming "instilling") "instil"))))

(deftest test-694
  (testing "test case 694"
    (is (= (stemming "anopia") "anopia"))))

(deftest test-695
  (testing "test case 695"
    (is (= (stemming "assuagement") "assuag"))))

(deftest test-696
  (testing "test case 696"
    (is (= (stemming "manubrial") "manubri"))))

(deftest test-697
  (testing "test case 697"
    (is (= (stemming "hrs") "hr"))))

(deftest test-698
  (testing "test case 698"
    (is (= (stemming "deponents") "depon"))))

(deftest test-699
  (testing "test case 699"
    (is (= (stemming "bichlorides") "bichlorid"))))

(deftest test-700
  (testing "test case 700"
    (is (= (stemming "enswathed") "enswath"))))

(deftest test-701
  (testing "test case 701"
    (is (= (stemming "upholstering") "upholst"))))

(deftest test-702
  (testing "test case 702"
    (is (= (stemming "disquietude") "disquietud"))))

(deftest test-703
  (testing "test case 703"
    (is (= (stemming "subcells") "subcel"))))

(deftest test-704
  (testing "test case 704"
    (is (= (stemming "baddy") "baddi"))))

(deftest test-705
  (testing "test case 705"
    (is (= (stemming "rakishness") "rakish"))))

(deftest test-706
  (testing "test case 706"
    (is (= (stemming "zircon") "zircon"))))

(deftest test-707
  (testing "test case 707"
    (is (= (stemming "stellar") "stellar"))))

(deftest test-708
  (testing "test case 708"
    (is (= (stemming "gnomist") "gnomist"))))

(deftest test-709
  (testing "test case 709"
    (is (= (stemming "alderwomen") "alderwomen"))))

(deftest test-710
  (testing "test case 710"
    (is (= (stemming "stoppages") "stoppag"))))

(deftest test-711
  (testing "test case 711"
    (is (= (stemming "furthest") "furthest"))))

(deftest test-712
  (testing "test case 712"
    (is (= (stemming "deficits") "deficit"))))

(deftest test-713
  (testing "test case 713"
    (is (= (stemming "eyes") "ey"))))

(deftest test-714
  (testing "test case 714"
    (is (= (stemming "isosceles") "isoscel"))))

(deftest test-715
  (testing "test case 715"
    (is (= (stemming "suffocating") "suffoc"))))

(deftest test-716
  (testing "test case 716"
    (is (= (stemming "loadings") "load"))))

(deftest test-717
  (testing "test case 717"
    (is (= (stemming "liars") "liar"))))

(deftest test-718
  (testing "test case 718"
    (is (= (stemming "originally") "origin"))))

(deftest test-719
  (testing "test case 719"
    (is (= (stemming "july") "juli"))))

(deftest test-720
  (testing "test case 720"
    (is (= (stemming "metaphors") "metaphor"))))

(deftest test-721
  (testing "test case 721"
    (is (= (stemming "samisen") "samisen"))))

(deftest test-722
  (testing "test case 722"
    (is (= (stemming "keyset") "keyset"))))

(deftest test-723
  (testing "test case 723"
    (is (= (stemming "transliterating") "transliter"))))

(deftest test-724
  (testing "test case 724"
    (is (= (stemming "gruellings") "gruell"))))

(deftest test-725
  (testing "test case 725"
    (is (= (stemming "hortatory") "hortatori"))))

(deftest test-726
  (testing "test case 726"
    (is (= (stemming "seasider") "seasid"))))

(deftest test-727
  (testing "test case 727"
    (is (= (stemming "sawbucks") "sawbuck"))))

(deftest test-728
  (testing "test case 728"
    (is (= (stemming "convokes") "convok"))))

(deftest test-729
  (testing "test case 729"
    (is (= (stemming "ledgy") "ledgi"))))

(deftest test-730
  (testing "test case 730"
    (is (= (stemming "rachitis") "rachiti"))))

(deftest test-731
  (testing "test case 731"
    (is (= (stemming "hare") "hare"))))

(deftest test-732
  (testing "test case 732"
    (is (= (stemming "scalloper") "scallop"))))

(deftest test-733
  (testing "test case 733"
    (is (= (stemming "fellable") "fellabl"))))

(deftest test-734
  (testing "test case 734"
    (is (= (stemming "displace") "displac"))))

(deftest test-735
  (testing "test case 735"
    (is (= (stemming "drumhead") "drumhead"))))

(deftest test-736
  (testing "test case 736"
    (is (= (stemming "reinforced") "reinforc"))))

(deftest test-737
  (testing "test case 737"
    (is (= (stemming "logbook") "logbook"))))

(deftest test-738
  (testing "test case 738"
    (is (= (stemming "dries") "dri"))))

(deftest test-739
  (testing "test case 739"
    (is (= (stemming "heaviness") "heavi"))))

(deftest test-740
  (testing "test case 740"
    (is (= (stemming "cockiest") "cockiest"))))

(deftest test-741
  (testing "test case 741"
    (is (= (stemming "alterability") "alter"))))

(deftest test-742
  (testing "test case 742"
    (is (= (stemming "conj") "conj"))))

(deftest test-743
  (testing "test case 743"
    (is (= (stemming "inexcusable") "inexcus"))))

(deftest test-744
  (testing "test case 744"
    (is (= (stemming "maraschino") "maraschino"))))

(deftest test-745
  (testing "test case 745"
    (is (= (stemming "vestibule") "vestibul"))))

(deftest test-746
  (testing "test case 746"
    (is (= (stemming "orison") "orison"))))

(deftest test-747
  (testing "test case 747"
    (is (= (stemming "cheesecloths") "cheesecloth"))))

(deftest test-748
  (testing "test case 748"
    (is (= (stemming "chattiness") "chatti"))))

(deftest test-749
  (testing "test case 749"
    (is (= (stemming "angelic") "angel"))))

(deftest test-750
  (testing "test case 750"
    (is (= (stemming "casketing") "casket"))))

(deftest test-751
  (testing "test case 751"
    (is (= (stemming "dressers") "dresser"))))

(deftest test-752
  (testing "test case 752"
    (is (= (stemming "epidemiologies") "epidemiolog"))))

(deftest test-753
  (testing "test case 753"
    (is (= (stemming "surfy") "surfi"))))

(deftest test-754
  (testing "test case 754"
    (is (= (stemming "tightened") "tighten"))))

(deftest test-755
  (testing "test case 755"
    (is (= (stemming "assuage") "assuag"))))

(deftest test-756
  (testing "test case 756"
    (is (= (stemming "pecuniarily") "pecuniarili"))))

(deftest test-757
  (testing "test case 757"
    (is (= (stemming "liverworts") "liverwort"))))

(deftest test-758
  (testing "test case 758"
    (is (= (stemming "mated") "mate"))))

(deftest test-759
  (testing "test case 759"
    (is (= (stemming "underemployment") "underemploy"))))

(deftest test-760
  (testing "test case 760"
    (is (= (stemming "nonaffiliated") "nonaffili"))))

(deftest test-761
  (testing "test case 761"
    (is (= (stemming "nepenthes") "nepenth"))))

(deftest test-762
  (testing "test case 762"
    (is (= (stemming "sounds") "sound"))))

(deftest test-763
  (testing "test case 763"
    (is (= (stemming "pure") "pure"))))

(deftest test-764
  (testing "test case 764"
    (is (= (stemming "doubtful") "doubt"))))

(deftest test-765
  (testing "test case 765"
    (is (= (stemming "enters") "enter"))))

(deftest test-766
  (testing "test case 766"
    (is (= (stemming "democrat") "democrat"))))

(deftest test-767
  (testing "test case 767"
    (is (= (stemming "urban") "urban"))))

(deftest test-768
  (testing "test case 768"
    (is (= (stemming "sopor") "sopor"))))

(deftest test-769
  (testing "test case 769"
    (is (= (stemming "infielders") "infield"))))

(deftest test-770
  (testing "test case 770"
    (is (= (stemming "terminators") "termin"))))

(deftest test-771
  (testing "test case 771"
    (is (= (stemming "uremic") "urem"))))

(deftest test-772
  (testing "test case 772"
    (is (= (stemming "hexagrams") "hexagram"))))

(deftest test-773
  (testing "test case 773"
    (is (= (stemming "zygote") "zygot"))))

(deftest test-774
  (testing "test case 774"
    (is (= (stemming "oratorios") "oratorio"))))

(deftest test-775
  (testing "test case 775"
    (is (= (stemming "soliloquy") "soliloqui"))))

(deftest test-776
  (testing "test case 776"
    (is (= (stemming "padshah") "padshah"))))

(deftest test-777
  (testing "test case 777"
    (is (= (stemming "musicotherapy") "musicotherapi"))))

(deftest test-778
  (testing "test case 778"
    (is (= (stemming "stainability") "stainabl"))))

(deftest test-779
  (testing "test case 779"
    (is (= (stemming "thither") "thither"))))

(deftest test-780
  (testing "test case 780"
    (is (= (stemming "chalkboards") "chalkboard"))))

(deftest test-781
  (testing "test case 781"
    (is (= (stemming "torchiers") "torchier"))))

(deftest test-782
  (testing "test case 782"
    (is (= (stemming "unmoral") "unmor"))))

(deftest test-783
  (testing "test case 783"
    (is (= (stemming "auxins") "auxin"))))

(deftest test-784
  (testing "test case 784"
    (is (= (stemming "gastroscopic") "gastroscop"))))

(deftest test-785
  (testing "test case 785"
    (is (= (stemming "exposits") "exposit"))))

(deftest test-786
  (testing "test case 786"
    (is (= (stemming "reconversion") "reconvers"))))

(deftest test-787
  (testing "test case 787"
    (is (= (stemming "rabble") "rabbl"))))

(deftest test-788
  (testing "test case 788"
    (is (= (stemming "withal") "withal"))))

(deftest test-789
  (testing "test case 789"
    (is (= (stemming "schlemiel") "schlemiel"))))

(deftest test-790
  (testing "test case 790"
    (is (= (stemming "plagiarism") "plagiar"))))

(deftest test-791
  (testing "test case 791"
    (is (= (stemming "floodlighting") "floodlight"))))

(deftest test-792
  (testing "test case 792"
    (is (= (stemming "urbanities") "urban"))))

(deftest test-793
  (testing "test case 793"
    (is (= (stemming "gawking") "gawk"))))

(deftest test-794
  (testing "test case 794"
    (is (= (stemming "shrining") "shrine"))))

(deftest test-795
  (testing "test case 795"
    (is (= (stemming "arraigner") "arraign"))))

(deftest test-796
  (testing "test case 796"
    (is (= (stemming "cooperage") "cooperag"))))

(deftest test-797
  (testing "test case 797"
    (is (= (stemming "blasting") "blast"))))

(deftest test-798
  (testing "test case 798"
    (is (= (stemming "haloing") "halo"))))

(deftest test-799
  (testing "test case 799"
    (is (= (stemming "haunter") "haunter"))))

(deftest test-800
  (testing "test case 800"
    (is (= (stemming "djinny") "djinni"))))

(deftest test-801
  (testing "test case 801"
    (is (= (stemming "soapier") "soapier"))))

(deftest test-802
  (testing "test case 802"
    (is (= (stemming "lionization") "lioniz"))))

(deftest test-803
  (testing "test case 803"
    (is (= (stemming "mimic") "mimic"))))

(deftest test-804
  (testing "test case 804"
    (is (= (stemming "cribbing") "crib"))))

(deftest test-805
  (testing "test case 805"
    (is (= (stemming "unfortunates") "unfortun"))))

(deftest test-806
  (testing "test case 806"
    (is (= (stemming "duellos") "duello"))))

(deftest test-807
  (testing "test case 807"
    (is (= (stemming "calcareousness") "calcar"))))

(deftest test-808
  (testing "test case 808"
    (is (= (stemming "headpin") "headpin"))))

(deftest test-809
  (testing "test case 809"
    (is (= (stemming "crushed") "crush"))))

(deftest test-810
  (testing "test case 810"
    (is (= (stemming "phenolphthalein") "phenolphthalein"))))

(deftest test-811
  (testing "test case 811"
    (is (= (stemming "demobilizing") "demobil"))))

(deftest test-812
  (testing "test case 812"
    (is (= (stemming "kaleidoscopes") "kaleidoscop"))))

(deftest test-813
  (testing "test case 813"
    (is (= (stemming "eased") "eas"))))

(deftest test-814
  (testing "test case 814"
    (is (= (stemming "hardtops") "hardtop"))))

(deftest test-815
  (testing "test case 815"
    (is (= (stemming "hayrick") "hayrick"))))

(deftest test-816
  (testing "test case 816"
    (is (= (stemming "insectivorous") "insectivor"))))

(deftest test-817
  (testing "test case 817"
    (is (= (stemming "photosynthesize") "photosynthes"))))

(deftest test-818
  (testing "test case 818"
    (is (= (stemming "lento") "lento"))))

(deftest test-819
  (testing "test case 819"
    (is (= (stemming "sliming") "slime"))))

(deftest test-820
  (testing "test case 820"
    (is (= (stemming "puckered") "pucker"))))

(deftest test-821
  (testing "test case 821"
    (is (= (stemming "vanquish") "vanquish"))))

(deftest test-822
  (testing "test case 822"
    (is (= (stemming "hipping") "hip"))))

(deftest test-823
  (testing "test case 823"
    (is (= (stemming "anvil") "anvil"))))

(deftest test-824
  (testing "test case 824"
    (is (= (stemming "whomp") "whomp"))))

(deftest test-825
  (testing "test case 825"
    (is (= (stemming "officers") "offic"))))

(deftest test-826
  (testing "test case 826"
    (is (= (stemming "hemstitch") "hemstitch"))))

(deftest test-827
  (testing "test case 827"
    (is (= (stemming "sicknesses") "sick"))))

(deftest test-828
  (testing "test case 828"
    (is (= (stemming "mignonette") "mignonett"))))

(deftest test-829
  (testing "test case 829"
    (is (= (stemming "overmagnifying") "overmagnifi"))))

(deftest test-830
  (testing "test case 830"
    (is (= (stemming "affirmers") "affirm"))))

(deftest test-831
  (testing "test case 831"
    (is (= (stemming "lobbing") "lob"))))

(deftest test-832
  (testing "test case 832"
    (is (= (stemming "bilabial") "bilabi"))))

(deftest test-833
  (testing "test case 833"
    (is (= (stemming "periphrasis") "periphrasi"))))

(deftest test-834
  (testing "test case 834"
    (is (= (stemming "thirsted") "thirst"))))

(deftest test-835
  (testing "test case 835"
    (is (= (stemming "preaccepting") "preaccept"))))

(deftest test-836
  (testing "test case 836"
    (is (= (stemming "launderers") "launder"))))

(deftest test-837
  (testing "test case 837"
    (is (= (stemming "bemoan") "bemoan"))))

(deftest test-838
  (testing "test case 838"
    (is (= (stemming "curvaceously") "curvac"))))

(deftest test-839
  (testing "test case 839"
    (is (= (stemming "leary") "leari"))))

(deftest test-840
  (testing "test case 840"
    (is (= (stemming "fruiters") "fruiter"))))

(deftest test-841
  (testing "test case 841"
    (is (= (stemming "brutality") "brutal"))))

(deftest test-842
  (testing "test case 842"
    (is (= (stemming "inference") "infer"))))

(deftest test-843
  (testing "test case 843"
    (is (= (stemming "diane") "dian"))))

(deftest test-844
  (testing "test case 844"
    (is (= (stemming "used") "us"))))

(deftest test-845
  (testing "test case 845"
    (is (= (stemming "froggiest") "froggiest"))))

(deftest test-846
  (testing "test case 846"
    (is (= (stemming "somersault") "somersault"))))

(deftest test-847
  (testing "test case 847"
    (is (= (stemming "barfing") "barf"))))

(deftest test-848
  (testing "test case 848"
    (is (= (stemming "salaams") "salaam"))))

(deftest test-849
  (testing "test case 849"
    (is (= (stemming "dictronics") "dictron"))))

(deftest test-850
  (testing "test case 850"
    (is (= (stemming "wadis") "wadi"))))

(deftest test-851
  (testing "test case 851"
    (is (= (stemming "parcel") "parcel"))))

(deftest test-852
  (testing "test case 852"
    (is (= (stemming "misappropriating") "misappropri"))))

(deftest test-853
  (testing "test case 853"
    (is (= (stemming "exhausting") "exhaust"))))

(deftest test-854
  (testing "test case 854"
    (is (= (stemming "assentor") "assentor"))))

(deftest test-855
  (testing "test case 855"
    (is (= (stemming "cinch") "cinch"))))

(deftest test-856
  (testing "test case 856"
    (is (= (stemming "hexahedrons") "hexahedron"))))

(deftest test-857
  (testing "test case 857"
    (is (= (stemming "swills") "swill"))))

(deftest test-858
  (testing "test case 858"
    (is (= (stemming "welshing") "welsh"))))

(deftest test-859
  (testing "test case 859"
    (is (= (stemming "patriot") "patriot"))))

(deftest test-860
  (testing "test case 860"
    (is (= (stemming "vomitive") "vomit"))))

(deftest test-861
  (testing "test case 861"
    (is (= (stemming "taker") "taker"))))

(deftest test-862
  (testing "test case 862"
    (is (= (stemming "absoluter") "absolut"))))

(deftest test-863
  (testing "test case 863"
    (is (= (stemming "welched") "welch"))))

(deftest test-864
  (testing "test case 864"
    (is (= (stemming "undercooked") "undercook"))))

(deftest test-865
  (testing "test case 865"
    (is (= (stemming "tzaritza") "tzaritza"))))

(deftest test-866
  (testing "test case 866"
    (is (= (stemming "mutagen") "mutagen"))))

(deftest test-867
  (testing "test case 867"
    (is (= (stemming "feign") "feign"))))

(deftest test-868
  (testing "test case 868"
    (is (= (stemming "notches") "notch"))))

(deftest test-869
  (testing "test case 869"
    (is (= (stemming "shenanigans") "shenanigan"))))

(deftest test-870
  (testing "test case 870"
    (is (= (stemming "zairian") "zairian"))))

(deftest test-871
  (testing "test case 871"
    (is (= (stemming "cateresses") "cateress"))))

(deftest test-872
  (testing "test case 872"
    (is (= (stemming "evacuated") "evacu"))))

(deftest test-873
  (testing "test case 873"
    (is (= (stemming "psychologism") "psycholog"))))

(deftest test-874
  (testing "test case 874"
    (is (= (stemming "pseudo") "pseudo"))))

(deftest test-875
  (testing "test case 875"
    (is (= (stemming "crimsoning") "crimson"))))

(deftest test-876
  (testing "test case 876"
    (is (= (stemming "waylay") "waylai"))))

(deftest test-877
  (testing "test case 877"
    (is (= (stemming "scurrilities") "scurril"))))

(deftest test-878
  (testing "test case 878"
    (is (= (stemming "zwieback") "zwieback"))))

(deftest test-879
  (testing "test case 879"
    (is (= (stemming "radiations") "radiat"))))

(deftest test-880
  (testing "test case 880"
    (is (= (stemming "burgling") "burgl"))))

(deftest test-881
  (testing "test case 881"
    (is (= (stemming "waked") "wake"))))

(deftest test-882
  (testing "test case 882"
    (is (= (stemming "pendency") "pendenc"))))

(deftest test-883
  (testing "test case 883"
    (is (= (stemming "scampi") "scampi"))))

(deftest test-884
  (testing "test case 884"
    (is (= (stemming "betted") "bet"))))

(deftest test-885
  (testing "test case 885"
    (is (= (stemming "devest") "devest"))))

(deftest test-886
  (testing "test case 886"
    (is (= (stemming "harlem") "harlem"))))

(deftest test-887
  (testing "test case 887"
    (is (= (stemming "youths") "youth"))))

(deftest test-888
  (testing "test case 888"
    (is (= (stemming "significance") "signific"))))

(deftest test-889
  (testing "test case 889"
    (is (= (stemming "phenotypic") "phenotyp"))))

(deftest test-890
  (testing "test case 890"
    (is (= (stemming "midmorning") "midmorn"))))

(deftest test-891
  (testing "test case 891"
    (is (= (stemming "parodying") "parodi"))))

(deftest test-892
  (testing "test case 892"
    (is (= (stemming "salvia") "salvia"))))

(deftest test-893
  (testing "test case 893"
    (is (= (stemming "trainman") "trainman"))))

(deftest test-894
  (testing "test case 894"
    (is (= (stemming "showered") "shower"))))

(deftest test-895
  (testing "test case 895"
    (is (= (stemming "chapped") "chap"))))

(deftest test-896
  (testing "test case 896"
    (is (= (stemming "capitalistically") "capitalist"))))

(deftest test-897
  (testing "test case 897"
    (is (= (stemming "apostatizing") "apostat"))))

(deftest test-898
  (testing "test case 898"
    (is (= (stemming "rontgen") "rontgen"))))

(deftest test-899
  (testing "test case 899"
    (is (= (stemming "greying") "grei"))))

(deftest test-900
  (testing "test case 900"
    (is (= (stemming "froes") "froe"))))

(deftest test-901
  (testing "test case 901"
    (is (= (stemming "strauss") "strauss"))))

(deftest test-902
  (testing "test case 902"
    (is (= (stemming "cotangent") "cotang"))))

(deftest test-903
  (testing "test case 903"
    (is (= (stemming "vanquishment") "vanquish"))))

(deftest test-904
  (testing "test case 904"
    (is (= (stemming "treadle") "treadl"))))

(deftest test-905
  (testing "test case 905"
    (is (= (stemming "sidetracks") "sidetrack"))))

(deftest test-906
  (testing "test case 906"
    (is (= (stemming "persevered") "persev"))))

(deftest test-907
  (testing "test case 907"
    (is (= (stemming "hocused") "hocus"))))

(deftest test-908
  (testing "test case 908"
    (is (= (stemming "canthal") "canthal"))))

(deftest test-909
  (testing "test case 909"
    (is (= (stemming "mitiest") "mitiest"))))

(deftest test-910
  (testing "test case 910"
    (is (= (stemming "dramatist") "dramatist"))))

(deftest test-911
  (testing "test case 911"
    (is (= (stemming "vulcan") "vulcan"))))

(deftest test-912
  (testing "test case 912"
    (is (= (stemming "doltishly") "doltishli"))))

(deftest test-913
  (testing "test case 913"
    (is (= (stemming "thermosphere") "thermospher"))))

(deftest test-914
  (testing "test case 914"
    (is (= (stemming "diastrophic") "diastroph"))))

(deftest test-915
  (testing "test case 915"
    (is (= (stemming "epicenter") "epicent"))))

(deftest test-916
  (testing "test case 916"
    (is (= (stemming "frosteds") "frost"))))

(deftest test-917
  (testing "test case 917"
    (is (= (stemming "kiddingly") "kiddingli"))))

(deftest test-918
  (testing "test case 918"
    (is (= (stemming "rocket") "rocket"))))

(deftest test-919
  (testing "test case 919"
    (is (= (stemming "cornstarch") "cornstarch"))))

(deftest test-920
  (testing "test case 920"
    (is (= (stemming "handstand") "handstand"))))

(deftest test-921
  (testing "test case 921"
    (is (= (stemming "socially") "social"))))

(deftest test-922
  (testing "test case 922"
    (is (= (stemming "inaugurates") "inaugur"))))

(deftest test-923
  (testing "test case 923"
    (is (= (stemming "acetifies") "acetifi"))))

(deftest test-924
  (testing "test case 924"
    (is (= (stemming "complicities") "complic"))))

(deftest test-925
  (testing "test case 925"
    (is (= (stemming "cudweeds") "cudwe"))))

(deftest test-926
  (testing "test case 926"
    (is (= (stemming "based") "base"))))

(deftest test-927
  (testing "test case 927"
    (is (= (stemming "parathyroidal") "parathyroid"))))

(deftest test-928
  (testing "test case 928"
    (is (= (stemming "misinterpreting") "misinterpret"))))

(deftest test-929
  (testing "test case 929"
    (is (= (stemming "corns") "corn"))))

(deftest test-930
  (testing "test case 930"
    (is (= (stemming "potful") "pot"))))

(deftest test-931
  (testing "test case 931"
    (is (= (stemming "splice") "splice"))))

(deftest test-932
  (testing "test case 932"
    (is (= (stemming "beret") "beret"))))

(deftest test-933
  (testing "test case 933"
    (is (= (stemming "masthead") "masthead"))))

(deftest test-934
  (testing "test case 934"
    (is (= (stemming "cleverer") "clever"))))

(deftest test-935
  (testing "test case 935"
    (is (= (stemming "derivation") "deriv"))))

(deftest test-936
  (testing "test case 936"
    (is (= (stemming "ignominiously") "ignomini"))))

(deftest test-937
  (testing "test case 937"
    (is (= (stemming "park") "park"))))

(deftest test-938
  (testing "test case 938"
    (is (= (stemming "vectoring") "vector"))))

(deftest test-939
  (testing "test case 939"
    (is (= (stemming "biffies") "biffi"))))

(deftest test-940
  (testing "test case 940"
    (is (= (stemming "mandolinist") "mandolinist"))))

(deftest test-941
  (testing "test case 941"
    (is (= (stemming "unmolested") "unmolest"))))

(deftest test-942
  (testing "test case 942"
    (is (= (stemming "fourths") "fourth"))))

(deftest test-943
  (testing "test case 943"
    (is (= (stemming "horticulturists") "horticulturist"))))

(deftest test-944
  (testing "test case 944"
    (is (= (stemming "garbling") "garbl"))))

(deftest test-945
  (testing "test case 945"
    (is (= (stemming "bondage") "bondag"))))

(deftest test-946
  (testing "test case 946"
    (is (= (stemming "archaeological") "archaeolog"))))

(deftest test-947
  (testing "test case 947"
    (is (= (stemming "obstetricians") "obstetrician"))))

(deftest test-948
  (testing "test case 948"
    (is (= (stemming "fragging") "frag"))))

(deftest test-949
  (testing "test case 949"
    (is (= (stemming "reattempting") "reattempt"))))

(deftest test-950
  (testing "test case 950"
    (is (= (stemming "petitional") "petit"))))

(deftest test-951
  (testing "test case 951"
    (is (= (stemming "workups") "workup"))))

(deftest test-952
  (testing "test case 952"
    (is (= (stemming "ruby") "rubi"))))

(deftest test-953
  (testing "test case 953"
    (is (= (stemming "instrumentality") "instrument"))))

(deftest test-954
  (testing "test case 954"
    (is (= (stemming "incautious") "incauti"))))

(deftest test-955
  (testing "test case 955"
    (is (= (stemming "monotremata") "monotremata"))))

(deftest test-956
  (testing "test case 956"
    (is (= (stemming "seed") "seed"))))

(deftest test-957
  (testing "test case 957"
    (is (= (stemming "wellhead") "wellhead"))))

(deftest test-958
  (testing "test case 958"
    (is (= (stemming "psychotherapists") "psychotherapist"))))

(deftest test-959
  (testing "test case 959"
    (is (= (stemming "arrangement") "arrang"))))

(deftest test-960
  (testing "test case 960"
    (is (= (stemming "implicit") "implicit"))))

(deftest test-961
  (testing "test case 961"
    (is (= (stemming "careen") "careen"))))

(deftest test-962
  (testing "test case 962"
    (is (= (stemming "ancillaries") "ancillari"))))

(deftest test-963
  (testing "test case 963"
    (is (= (stemming "blahs") "blah"))))

(deftest test-964
  (testing "test case 964"
    (is (= (stemming "summations") "summat"))))

(deftest test-965
  (testing "test case 965"
    (is (= (stemming "habitable") "habit"))))

(deftest test-966
  (testing "test case 966"
    (is (= (stemming "navahos") "navaho"))))

(deftest test-967
  (testing "test case 967"
    (is (= (stemming "slackly") "slackli"))))

(deftest test-968
  (testing "test case 968"
    (is (= (stemming "parboiling") "parboil"))))

(deftest test-969
  (testing "test case 969"
    (is (= (stemming "declaimers") "declaim"))))

(deftest test-970
  (testing "test case 970"
    (is (= (stemming "tremendously") "tremend"))))

(deftest test-971
  (testing "test case 971"
    (is (= (stemming "reader") "reader"))))

(deftest test-972
  (testing "test case 972"
    (is (= (stemming "endocrinic") "endocrin"))))

(deftest test-973
  (testing "test case 973"
    (is (= (stemming "colloq") "colloq"))))

(deftest test-974
  (testing "test case 974"
    (is (= (stemming "jaywalks") "jaywalk"))))

(deftest test-975
  (testing "test case 975"
    (is (= (stemming "helluva") "helluva"))))

(deftest test-976
  (testing "test case 976"
    (is (= (stemming "beldams") "beldam"))))

(deftest test-977
  (testing "test case 977"
    (is (= (stemming "kicky") "kicki"))))

(deftest test-978
  (testing "test case 978"
    (is (= (stemming "newscast") "newscast"))))

(deftest test-979
  (testing "test case 979"
    (is (= (stemming "jellybeans") "jellybean"))))

(deftest test-980
  (testing "test case 980"
    (is (= (stemming "yardsticks") "yardstick"))))

(deftest test-981
  (testing "test case 981"
    (is (= (stemming "notarization") "notar"))))

(deftest test-982
  (testing "test case 982"
    (is (= (stemming "improvising") "improvis"))))

(deftest test-983
  (testing "test case 983"
    (is (= (stemming "uncrystallized") "uncrystal"))))

(deftest test-984
  (testing "test case 984"
    (is (= (stemming "furculae") "furcula"))))

(deftest test-985
  (testing "test case 985"
    (is (= (stemming "furled") "furl"))))

(deftest test-986
  (testing "test case 986"
    (is (= (stemming "likable") "likabl"))))

(deftest test-987
  (testing "test case 987"
    (is (= (stemming "proscriptions") "proscript"))))

(deftest test-988
  (testing "test case 988"
    (is (= (stemming "beadier") "beadier"))))

(deftest test-989
  (testing "test case 989"
    (is (= (stemming "flashlight") "flashlight"))))

(deftest test-990
  (testing "test case 990"
    (is (= (stemming "vendors") "vendor"))))

(deftest test-991
  (testing "test case 991"
    (is (= (stemming "garrulously") "garrul"))))

(deftest test-992
  (testing "test case 992"
    (is (= (stemming "waistlines") "waistlin"))))

(deftest test-993
  (testing "test case 993"
    (is (= (stemming "nerving") "nerv"))))

(deftest test-994
  (testing "test case 994"
    (is (= (stemming "phlegmatic") "phlegmat"))))

(deftest test-995
  (testing "test case 995"
    (is (= (stemming "halyards") "halyard"))))

(deftest test-996
  (testing "test case 996"
    (is (= (stemming "misfortune") "misfortun"))))

(deftest test-997
  (testing "test case 997"
    (is (= (stemming "permeate") "permeat"))))

(deftest test-998
  (testing "test case 998"
    (is (= (stemming "laureating") "laureat"))))

(deftest test-999
  (testing "test case 999"
    (is (= (stemming "deprival") "depriv"))))

(deftest test-1000
  (testing "test case 1000"
    (is (= (stemming "blenching") "blench"))))

(deftest test-1001
  (testing "test case 1001"
    (is (= (stemming "unhatted") "unhat"))))

(deftest test-1002
  (testing "test case 1002"
    (is (= (stemming "flashbacks") "flashback"))))

(deftest test-1003
  (testing "test case 1003"
    (is (= (stemming "tablespoonfuls") "tablespoon"))))

(deftest test-1004
  (testing "test case 1004"
    (is (= (stemming "commandeered") "command"))))

(deftest test-1005
  (testing "test case 1005"
    (is (= (stemming "handicappers") "handicapp"))))

(deftest test-1006
  (testing "test case 1006"
    (is (= (stemming "jelling") "jell"))))

(deftest test-1007
  (testing "test case 1007"
    (is (= (stemming "acidifier") "acidifi"))))

(deftest test-1008
  (testing "test case 1008"
    (is (= (stemming "superposes") "superpos"))))

(deftest test-1009
  (testing "test case 1009"
    (is (= (stemming "remotely") "remot"))))

(deftest test-1010
  (testing "test case 1010"
    (is (= (stemming "toilet") "toilet"))))

(deftest test-1011
  (testing "test case 1011"
    (is (= (stemming "punkie") "punki"))))

(deftest test-1012
  (testing "test case 1012"
    (is (= (stemming "blackfeet") "blackfeet"))))

(deftest test-1013
  (testing "test case 1013"
    (is (= (stemming "demographically") "demograph"))))

(deftest test-1014
  (testing "test case 1014"
    (is (= (stemming "responsive") "respons"))))

(deftest test-1015
  (testing "test case 1015"
    (is (= (stemming "privities") "priviti"))))

(deftest test-1016
  (testing "test case 1016"
    (is (= (stemming "nubble") "nubbl"))))

(deftest test-1017
  (testing "test case 1017"
    (is (= (stemming "auctions") "auction"))))

(deftest test-1018
  (testing "test case 1018"
    (is (= (stemming "termagants") "termag"))))

(deftest test-1019
  (testing "test case 1019"
    (is (= (stemming "rustily") "rustili"))))

(deftest test-1020
  (testing "test case 1020"
    (is (= (stemming "yoga") "yoga"))))

(deftest test-1021
  (testing "test case 1021"
    (is (= (stemming "blueings") "blue"))))

(deftest test-1022
  (testing "test case 1022"
    (is (= (stemming "fluoridations") "fluorid"))))

(deftest test-1023
  (testing "test case 1023"
    (is (= (stemming "exertive") "exert"))))

(deftest test-1024
  (testing "test case 1024"
    (is (= (stemming "reckless") "reckless"))))

(deftest test-1025
  (testing "test case 1025"
    (is (= (stemming "sheepdogs") "sheepdog"))))

(deftest test-1026
  (testing "test case 1026"
    (is (= (stemming "inaptly") "inaptli"))))

(deftest test-1027
  (testing "test case 1027"
    (is (= (stemming "inducting") "induct"))))

(deftest test-1028
  (testing "test case 1028"
    (is (= (stemming "scythes") "scyth"))))

(deftest test-1029
  (testing "test case 1029"
    (is (= (stemming "titling") "titl"))))

(deftest test-1030
  (testing "test case 1030"
    (is (= (stemming "constitutes") "constitut"))))

(deftest test-1031
  (testing "test case 1031"
    (is (= (stemming "economized") "econom"))))

(deftest test-1032
  (testing "test case 1032"
    (is (= (stemming "rhetorically") "rhetor"))))

(deftest test-1033
  (testing "test case 1033"
    (is (= (stemming "corridor") "corridor"))))

(deftest test-1034
  (testing "test case 1034"
    (is (= (stemming "fulls") "full"))))

(deftest test-1035
  (testing "test case 1035"
    (is (= (stemming "insipid") "insipid"))))

(deftest test-1036
  (testing "test case 1036"
    (is (= (stemming "clown") "clown"))))

(deftest test-1037
  (testing "test case 1037"
    (is (= (stemming "herpetologists") "herpetologist"))))

(deftest test-1038
  (testing "test case 1038"
    (is (= (stemming "germfree") "germfre"))))

(deftest test-1039
  (testing "test case 1039"
    (is (= (stemming "casseroles") "casserol"))))

(deftest test-1040
  (testing "test case 1040"
    (is (= (stemming "unopposed") "unoppos"))))

(deftest test-1041
  (testing "test case 1041"
    (is (= (stemming "lithographing") "lithograph"))))

(deftest test-1042
  (testing "test case 1042"
    (is (= (stemming "rebuses") "rebus"))))

(deftest test-1043
  (testing "test case 1043"
    (is (= (stemming "profanity") "profan"))))

(deftest test-1044
  (testing "test case 1044"
    (is (= (stemming "backstairs") "backstair"))))

(deftest test-1045
  (testing "test case 1045"
    (is (= (stemming "shorebirds") "shorebird"))))

(deftest test-1046
  (testing "test case 1046"
    (is (= (stemming "bereavements") "bereav"))))

(deftest test-1047
  (testing "test case 1047"
    (is (= (stemming "suedes") "sued"))))

(deftest test-1048
  (testing "test case 1048"
    (is (= (stemming "atomical") "atom"))))

(deftest test-1049
  (testing "test case 1049"
    (is (= (stemming "pincher") "pincher"))))

(deftest test-1050
  (testing "test case 1050"
    (is (= (stemming "interveners") "interven"))))

(deftest test-1051
  (testing "test case 1051"
    (is (= (stemming "foxings") "fox"))))

(deftest test-1052
  (testing "test case 1052"
    (is (= (stemming "unsystematically") "unsystemat"))))

(deftest test-1053
  (testing "test case 1053"
    (is (= (stemming "carver") "carver"))))

(deftest test-1054
  (testing "test case 1054"
    (is (= (stemming "centrals") "central"))))

(deftest test-1055
  (testing "test case 1055"
    (is (= (stemming "iscose") "iscos"))))

(deftest test-1056
  (testing "test case 1056"
    (is (= (stemming "corrugation") "corrug"))))

(deftest test-1057
  (testing "test case 1057"
    (is (= (stemming "obviators") "obviat"))))

(deftest test-1058
  (testing "test case 1058"
    (is (= (stemming "yardmen") "yardmen"))))

(deftest test-1059
  (testing "test case 1059"
    (is (= (stemming "kneeing") "knee"))))

(deftest test-1060
  (testing "test case 1060"
    (is (= (stemming "vomited") "vomit"))))

(deftest test-1061
  (testing "test case 1061"
    (is (= (stemming "rasers") "raser"))))

(deftest test-1062
  (testing "test case 1062"
    (is (= (stemming "foothill") "foothil"))))

(deftest test-1063
  (testing "test case 1063"
    (is (= (stemming "alliterating") "alliter"))))

(deftest test-1064
  (testing "test case 1064"
    (is (= (stemming "cheekfuls") "cheek"))))

(deftest test-1065
  (testing "test case 1065"
    (is (= (stemming "peasantry") "peasantri"))))

(deftest test-1066
  (testing "test case 1066"
    (is (= (stemming "departmentalization") "department"))))

(deftest test-1067
  (testing "test case 1067"
    (is (= (stemming "rightness") "right"))))

(deftest test-1068
  (testing "test case 1068"
    (is (= (stemming "sparrow") "sparrow"))))

(deftest test-1069
  (testing "test case 1069"
    (is (= (stemming "chattily") "chattili"))))

(deftest test-1070
  (testing "test case 1070"
    (is (= (stemming "umpteen") "umpteen"))))

(deftest test-1071
  (testing "test case 1071"
    (is (= (stemming "yesses") "yess"))))

(deftest test-1072
  (testing "test case 1072"
    (is (= (stemming "sutures") "sutur"))))

(deftest test-1073
  (testing "test case 1073"
    (is (= (stemming "protista") "protista"))))

(deftest test-1074
  (testing "test case 1074"
    (is (= (stemming "weaponry") "weaponri"))))

(deftest test-1075
  (testing "test case 1075"
    (is (= (stemming "barrenness") "barren"))))

(deftest test-1076
  (testing "test case 1076"
    (is (= (stemming "inflicts") "inflict"))))

(deftest test-1077
  (testing "test case 1077"
    (is (= (stemming "whosoever") "whosoev"))))

(deftest test-1078
  (testing "test case 1078"
    (is (= (stemming "charitably") "charit"))))

(deftest test-1079
  (testing "test case 1079"
    (is (= (stemming "massiness") "massi"))))

(deftest test-1080
  (testing "test case 1080"
    (is (= (stemming "centenarian") "centenarian"))))

(deftest test-1081
  (testing "test case 1081"
    (is (= (stemming "bilge") "bilg"))))

(deftest test-1082
  (testing "test case 1082"
    (is (= (stemming "abbacy") "abbaci"))))

(deftest test-1083
  (testing "test case 1083"
    (is (= (stemming "sources") "sourc"))))

(deftest test-1084
  (testing "test case 1084"
    (is (= (stemming "delphinia") "delphinia"))))

(deftest test-1085
  (testing "test case 1085"
    (is (= (stemming "toadfish") "toadfish"))))

(deftest test-1086
  (testing "test case 1086"
    (is (= (stemming "jonah") "jonah"))))

(deftest test-1087
  (testing "test case 1087"
    (is (= (stemming "petrographical") "petrograph"))))

(deftest test-1088
  (testing "test case 1088"
    (is (= (stemming "unescorted") "unescort"))))

(deftest test-1089
  (testing "test case 1089"
    (is (= (stemming "purr") "purr"))))

(deftest test-1090
  (testing "test case 1090"
    (is (= (stemming "apparelled") "apparel"))))

(deftest test-1091
  (testing "test case 1091"
    (is (= (stemming "sophomoric") "sophomor"))))

(deftest test-1092
  (testing "test case 1092"
    (is (= (stemming "defoliation") "defoli"))))

(deftest test-1093
  (testing "test case 1093"
    (is (= (stemming "dominates") "domin"))))

(deftest test-1094
  (testing "test case 1094"
    (is (= (stemming "broadcasted") "broadcast"))))

(deftest test-1095
  (testing "test case 1095"
    (is (= (stemming "stannous") "stannou"))))

(deftest test-1096
  (testing "test case 1096"
    (is (= (stemming "sobbers") "sobber"))))

(deftest test-1097
  (testing "test case 1097"
    (is (= (stemming "biopsychology") "biopsycholog"))))

(deftest test-1098
  (testing "test case 1098"
    (is (= (stemming "scrawls") "scrawl"))))

(deftest test-1099
  (testing "test case 1099"
    (is (= (stemming "stumpy") "stumpi"))))

(deftest test-1100
  (testing "test case 1100"
    (is (= (stemming "remaking") "remak"))))

(deftest test-1101
  (testing "test case 1101"
    (is (= (stemming "dive") "dive"))))

(deftest test-1102
  (testing "test case 1102"
    (is (= (stemming "irreformable") "irreform"))))

(deftest test-1103
  (testing "test case 1103"
    (is (= (stemming "tennises") "tennis"))))

(deftest test-1104
  (testing "test case 1104"
    (is (= (stemming "twangles") "twangl"))))

(deftest test-1105
  (testing "test case 1105"
    (is (= (stemming "superfluous") "superflu"))))

(deftest test-1106
  (testing "test case 1106"
    (is (= (stemming "paragraphs") "paragraph"))))

(deftest test-1107
  (testing "test case 1107"
    (is (= (stemming "padishah") "padishah"))))

(deftest test-1108
  (testing "test case 1108"
    (is (= (stemming "lassoers") "lassoer"))))

(deftest test-1109
  (testing "test case 1109"
    (is (= (stemming "laicizing") "laiciz"))))

(deftest test-1110
  (testing "test case 1110"
    (is (= (stemming "galas") "gala"))))

(deftest test-1111
  (testing "test case 1111"
    (is (= (stemming "contemporarily") "contemporarili"))))

(deftest test-1112
  (testing "test case 1112"
    (is (= (stemming "child") "child"))))

(deftest test-1113
  (testing "test case 1113"
    (is (= (stemming "overweight") "overweight"))))

(deftest test-1114
  (testing "test case 1114"
    (is (= (stemming "syllabification") "syllabif"))))

(deftest test-1115
  (testing "test case 1115"
    (is (= (stemming "tittered") "titter"))))

(deftest test-1116
  (testing "test case 1116"
    (is (= (stemming "preascertains") "preascertain"))))

(deftest test-1117
  (testing "test case 1117"
    (is (= (stemming "nimbused") "nimbus"))))

(deftest test-1118
  (testing "test case 1118"
    (is (= (stemming "exonerated") "exoner"))))

(deftest test-1119
  (testing "test case 1119"
    (is (= (stemming "roiled") "roil"))))

(deftest test-1120
  (testing "test case 1120"
    (is (= (stemming "absorbed") "absorb"))))

(deftest test-1121
  (testing "test case 1121"
    (is (= (stemming "lilied") "lili"))))

(deftest test-1122
  (testing "test case 1122"
    (is (= (stemming "king") "king"))))

(deftest test-1123
  (testing "test case 1123"
    (is (= (stemming "originators") "origin"))))

(deftest test-1124
  (testing "test case 1124"
    (is (= (stemming "interscholastic") "interscholast"))))

(deftest test-1125
  (testing "test case 1125"
    (is (= (stemming "halloos") "halloo"))))

(deftest test-1126
  (testing "test case 1126"
    (is (= (stemming "stagnating") "stagnat"))))

(deftest test-1127
  (testing "test case 1127"
    (is (= (stemming "weeklong") "weeklong"))))

(deftest test-1128
  (testing "test case 1128"
    (is (= (stemming "virginal") "virgin"))))

(deftest test-1129
  (testing "test case 1129"
    (is (= (stemming "gunsmith") "gunsmith"))))

(deftest test-1130
  (testing "test case 1130"
    (is (= (stemming "suspectable") "suspect"))))

(deftest test-1131
  (testing "test case 1131"
    (is (= (stemming "whitest") "whitest"))))

(deftest test-1132
  (testing "test case 1132"
    (is (= (stemming "relieves") "reliev"))))

(deftest test-1133
  (testing "test case 1133"
    (is (= (stemming "clarkia") "clarkia"))))

(deftest test-1134
  (testing "test case 1134"
    (is (= (stemming "imbecilities") "imbecil"))))

(deftest test-1135
  (testing "test case 1135"
    (is (= (stemming "dyewood") "dyewood"))))

(deftest test-1136
  (testing "test case 1136"
    (is (= (stemming "roscoes") "rosco"))))

(deftest test-1137
  (testing "test case 1137"
    (is (= (stemming "numskull") "numskul"))))

(deftest test-1138
  (testing "test case 1138"
    (is (= (stemming "hunnishness") "hunnish"))))

(deftest test-1139
  (testing "test case 1139"
    (is (= (stemming "damsels") "damsel"))))

(deftest test-1140
  (testing "test case 1140"
    (is (= (stemming "piroshki") "piroshki"))))

(deftest test-1141
  (testing "test case 1141"
    (is (= (stemming "inalterably") "inalter"))))

(deftest test-1142
  (testing "test case 1142"
    (is (= (stemming "sportscasts") "sportscast"))))

(deftest test-1143
  (testing "test case 1143"
    (is (= (stemming "zizzled") "zizzl"))))

(deftest test-1144
  (testing "test case 1144"
    (is (= (stemming "donovan") "donovan"))))

(deftest test-1145
  (testing "test case 1145"
    (is (= (stemming "romanticize") "romantic"))))

(deftest test-1146
  (testing "test case 1146"
    (is (= (stemming "prodigies") "prodigi"))))

(deftest test-1147
  (testing "test case 1147"
    (is (= (stemming "gesturer") "gestur"))))

(deftest test-1148
  (testing "test case 1148"
    (is (= (stemming "jeering") "jeer"))))

(deftest test-1149
  (testing "test case 1149"
    (is (= (stemming "sedimented") "sediment"))))

(deftest test-1150
  (testing "test case 1150"
    (is (= (stemming "annular") "annular"))))

(deftest test-1151
  (testing "test case 1151"
    (is (= (stemming "frillers") "friller"))))

(deftest test-1152
  (testing "test case 1152"
    (is (= (stemming "microfiche") "microfich"))))

(deftest test-1153
  (testing "test case 1153"
    (is (= (stemming "hellcat") "hellcat"))))

(deftest test-1154
  (testing "test case 1154"
    (is (= (stemming "fatless") "fatless"))))

(deftest test-1155
  (testing "test case 1155"
    (is (= (stemming "defences") "defenc"))))

(deftest test-1156
  (testing "test case 1156"
    (is (= (stemming "evils") "evil"))))

(deftest test-1157
  (testing "test case 1157"
    (is (= (stemming "consult") "consult"))))

(deftest test-1158
  (testing "test case 1158"
    (is (= (stemming "mestizo") "mestizo"))))

(deftest test-1159
  (testing "test case 1159"
    (is (= (stemming "vasopressin") "vasopressin"))))

(deftest test-1160
  (testing "test case 1160"
    (is (= (stemming "botchily") "botchili"))))

(deftest test-1161
  (testing "test case 1161"
    (is (= (stemming "enlarge") "enlarg"))))

(deftest test-1162
  (testing "test case 1162"
    (is (= (stemming "alerting") "alert"))))

(deftest test-1163
  (testing "test case 1163"
    (is (= (stemming "effectors") "effector"))))

(deftest test-1164
  (testing "test case 1164"
    (is (= (stemming "bono") "bono"))))

(deftest test-1165
  (testing "test case 1165"
    (is (= (stemming "papery") "paperi"))))

(deftest test-1166
  (testing "test case 1166"
    (is (= (stemming "epiglottises") "epiglottis"))))

(deftest test-1167
  (testing "test case 1167"
    (is (= (stemming "purlieus") "purlieu"))))

(deftest test-1168
  (testing "test case 1168"
    (is (= (stemming "dashers") "dasher"))))

(deftest test-1169
  (testing "test case 1169"
    (is (= (stemming "pamphlet") "pamphlet"))))

(deftest test-1170
  (testing "test case 1170"
    (is (= (stemming "fascination") "fascin"))))

(deftest test-1171
  (testing "test case 1171"
    (is (= (stemming "hymnody") "hymnodi"))))

(deftest test-1172
  (testing "test case 1172"
    (is (= (stemming "presentence") "present"))))

(deftest test-1173
  (testing "test case 1173"
    (is (= (stemming "nereids") "nereid"))))

(deftest test-1174
  (testing "test case 1174"
    (is (= (stemming "creepily") "creepili"))))

(deftest test-1175
  (testing "test case 1175"
    (is (= (stemming "elaborations") "elabor"))))

(deftest test-1176
  (testing "test case 1176"
    (is (= (stemming "larcenies") "larceni"))))

(deftest test-1177
  (testing "test case 1177"
    (is (= (stemming "freest") "freest"))))

(deftest test-1178
  (testing "test case 1178"
    (is (= (stemming "ansi") "ansi"))))

(deftest test-1179
  (testing "test case 1179"
    (is (= (stemming "illustriously") "illustri"))))

(deftest test-1180
  (testing "test case 1180"
    (is (= (stemming "objected") "object"))))

(deftest test-1181
  (testing "test case 1181"
    (is (= (stemming "precarious") "precari"))))

(deftest test-1182
  (testing "test case 1182"
    (is (= (stemming "sublimate") "sublim"))))

(deftest test-1183
  (testing "test case 1183"
    (is (= (stemming "predaciousness") "predaci"))))

(deftest test-1184
  (testing "test case 1184"
    (is (= (stemming "pun") "pun"))))

(deftest test-1185
  (testing "test case 1185"
    (is (= (stemming "uncountable") "uncount"))))

(deftest test-1186
  (testing "test case 1186"
    (is (= (stemming "ulnar") "ulnar"))))

(deftest test-1187
  (testing "test case 1187"
    (is (= (stemming "concluders") "conclud"))))

(deftest test-1188
  (testing "test case 1188"
    (is (= (stemming "tuesday") "tuesdai"))))

(deftest test-1189
  (testing "test case 1189"
    (is (= (stemming "diabolic") "diabol"))))

(deftest test-1190
  (testing "test case 1190"
    (is (= (stemming "reshipments") "reship"))))

(deftest test-1191
  (testing "test case 1191"
    (is (= (stemming "battalion") "battalion"))))

(deftest test-1192
  (testing "test case 1192"
    (is (= (stemming "hydro") "hydro"))))

(deftest test-1193
  (testing "test case 1193"
    (is (= (stemming "careened") "careen"))))

(deftest test-1194
  (testing "test case 1194"
    (is (= (stemming "hated") "hate"))))

(deftest test-1195
  (testing "test case 1195"
    (is (= (stemming "dobras") "dobra"))))

(deftest test-1196
  (testing "test case 1196"
    (is (= (stemming "voidance") "voidanc"))))

(deftest test-1197
  (testing "test case 1197"
    (is (= (stemming "friendly") "friendli"))))

(deftest test-1198
  (testing "test case 1198"
    (is (= (stemming "exported") "export"))))

(deftest test-1199
  (testing "test case 1199"
    (is (= (stemming "deluxe") "delux"))))

(deftest test-1200
  (testing "test case 1200"
    (is (= (stemming "bantamweight") "bantamweight"))))

(deftest test-1201
  (testing "test case 1201"
    (is (= (stemming "chaises") "chais"))))

(deftest test-1202
  (testing "test case 1202"
    (is (= (stemming "vaporous") "vapor"))))

(deftest test-1203
  (testing "test case 1203"
    (is (= (stemming "meniscuses") "meniscus"))))

(deftest test-1204
  (testing "test case 1204"
    (is (= (stemming "shirks") "shirk"))))

(deftest test-1205
  (testing "test case 1205"
    (is (= (stemming "platooning") "platoon"))))

(deftest test-1206
  (testing "test case 1206"
    (is (= (stemming "roentgenometer") "roentgenomet"))))

(deftest test-1207
  (testing "test case 1207"
    (is (= (stemming "steeply") "steepli"))))

(deftest test-1208
  (testing "test case 1208"
    (is (= (stemming "misjudgment") "misjudg"))))

(deftest test-1209
  (testing "test case 1209"
    (is (= (stemming "peak") "peak"))))

(deftest test-1210
  (testing "test case 1210"
    (is (= (stemming "rhododendrons") "rhododendron"))))

(deftest test-1211
  (testing "test case 1211"
    (is (= (stemming "anticipate") "anticip"))))

(deftest test-1212
  (testing "test case 1212"
    (is (= (stemming "presifted") "presift"))))

(deftest test-1213
  (testing "test case 1213"
    (is (= (stemming "jockstraps") "jockstrap"))))

(deftest test-1214
  (testing "test case 1214"
    (is (= (stemming "punchy") "punchi"))))

(deftest test-1215
  (testing "test case 1215"
    (is (= (stemming "graduands") "graduand"))))

(deftest test-1216
  (testing "test case 1216"
    (is (= (stemming "contumelious") "contumeli"))))

(deftest test-1217
  (testing "test case 1217"
    (is (= (stemming "babushkas") "babushka"))))

(deftest test-1218
  (testing "test case 1218"
    (is (= (stemming "denser") "denser"))))

(deftest test-1219
  (testing "test case 1219"
    (is (= (stemming "attempts") "attempt"))))

(deftest test-1220
  (testing "test case 1220"
    (is (= (stemming "untenable") "unten"))))

(deftest test-1221
  (testing "test case 1221"
    (is (= (stemming "besot") "besot"))))

(deftest test-1222
  (testing "test case 1222"
    (is (= (stemming "subbranch") "subbranch"))))

(deftest test-1223
  (testing "test case 1223"
    (is (= (stemming "implies") "impli"))))

(deftest test-1224
  (testing "test case 1224"
    (is (= (stemming "bullyrags") "bullyrag"))))

(deftest test-1225
  (testing "test case 1225"
    (is (= (stemming "stenography") "stenographi"))))

(deftest test-1226
  (testing "test case 1226"
    (is (= (stemming "cocooned") "cocoon"))))

(deftest test-1227
  (testing "test case 1227"
    (is (= (stemming "ovulate") "ovul"))))

(deftest test-1228
  (testing "test case 1228"
    (is (= (stemming "apathies") "apathi"))))

(deftest test-1229
  (testing "test case 1229"
    (is (= (stemming "redactor") "redactor"))))

(deftest test-1230
  (testing "test case 1230"
    (is (= (stemming "alarmed") "alarm"))))

(deftest test-1231
  (testing "test case 1231"
    (is (= (stemming "quatre") "quatr"))))

(deftest test-1232
  (testing "test case 1232"
    (is (= (stemming "neatherd") "neatherd"))))

(deftest test-1233
  (testing "test case 1233"
    (is (= (stemming "radiobroadcaster") "radiobroadcast"))))

(deftest test-1234
  (testing "test case 1234"
    (is (= (stemming "plotters") "plotter"))))

(deftest test-1235
  (testing "test case 1235"
    (is (= (stemming "fantasticalness") "fantastic"))))

(deftest test-1236
  (testing "test case 1236"
    (is (= (stemming "weeklies") "weekli"))))

(deftest test-1237
  (testing "test case 1237"
    (is (= (stemming "relabelling") "relabel"))))

(deftest test-1238
  (testing "test case 1238"
    (is (= (stemming "nonfascist") "nonfascist"))))

(deftest test-1239
  (testing "test case 1239"
    (is (= (stemming "bastiles") "bastil"))))

(deftest test-1240
  (testing "test case 1240"
    (is (= (stemming "inditer") "indit"))))

(deftest test-1241
  (testing "test case 1241"
    (is (= (stemming "endorsor") "endorsor"))))

(deftest test-1242
  (testing "test case 1242"
    (is (= (stemming "faired") "fair"))))

(deftest test-1243
  (testing "test case 1243"
    (is (= (stemming "propanes") "propan"))))

(deftest test-1244
  (testing "test case 1244"
    (is (= (stemming "boskiest") "boskiest"))))

(deftest test-1245
  (testing "test case 1245"
    (is (= (stemming "chapmen") "chapmen"))))

(deftest test-1246
  (testing "test case 1246"
    (is (= (stemming "apatites") "apatit"))))

(deftest test-1247
  (testing "test case 1247"
    (is (= (stemming "ins") "in"))))

(deftest test-1248
  (testing "test case 1248"
    (is (= (stemming "romany") "romani"))))

(deftest test-1249
  (testing "test case 1249"
    (is (= (stemming "salvageability") "salvag"))))

(deftest test-1250
  (testing "test case 1250"
    (is (= (stemming "killdeers") "killdeer"))))

(deftest test-1251
  (testing "test case 1251"
    (is (= (stemming "newest") "newest"))))

(deftest test-1252
  (testing "test case 1252"
    (is (= (stemming "denunciatory") "denunciatori"))))

(deftest test-1253
  (testing "test case 1253"
    (is (= (stemming "guarantied") "guaranti"))))

(deftest test-1254
  (testing "test case 1254"
    (is (= (stemming "whishing") "whish"))))

(deftest test-1255
  (testing "test case 1255"
    (is (= (stemming "deepest") "deepest"))))

(deftest test-1256
  (testing "test case 1256"
    (is (= (stemming "relishable") "relish"))))

(deftest test-1257
  (testing "test case 1257"
    (is (= (stemming "milliard") "milliard"))))

(deftest test-1258
  (testing "test case 1258"
    (is (= (stemming "harmfully") "harmfulli"))))

(deftest test-1259
  (testing "test case 1259"
    (is (= (stemming "darken") "darken"))))

(deftest test-1260
  (testing "test case 1260"
    (is (= (stemming "batsmen") "batsmen"))))

(deftest test-1261
  (testing "test case 1261"
    (is (= (stemming "knobbiest") "knobbiest"))))

(deftest test-1262
  (testing "test case 1262"
    (is (= (stemming "overattentiveness") "overattent"))))

(deftest test-1263
  (testing "test case 1263"
    (is (= (stemming "zones") "zone"))))

(deftest test-1264
  (testing "test case 1264"
    (is (= (stemming "redesignated") "redesign"))))

(deftest test-1265
  (testing "test case 1265"
    (is (= (stemming "neatest") "neatest"))))

(deftest test-1266
  (testing "test case 1266"
    (is (= (stemming "barkers") "barker"))))

(deftest test-1267
  (testing "test case 1267"
    (is (= (stemming "covets") "covet"))))

(deftest test-1268
  (testing "test case 1268"
    (is (= (stemming "archaisms") "archaism"))))

(deftest test-1269
  (testing "test case 1269"
    (is (= (stemming "fishbowls") "fishbowl"))))

(deftest test-1270
  (testing "test case 1270"
    (is (= (stemming "maculate") "macul"))))

(deftest test-1271
  (testing "test case 1271"
    (is (= (stemming "heighten") "heighten"))))

(deftest test-1272
  (testing "test case 1272"
    (is (= (stemming "dibbed") "dib"))))

(deftest test-1273
  (testing "test case 1273"
    (is (= (stemming "taillight") "taillight"))))

(deftest test-1274
  (testing "test case 1274"
    (is (= (stemming "kids") "kid"))))

(deftest test-1275
  (testing "test case 1275"
    (is (= (stemming "chronicles") "chronicl"))))

(deftest test-1276
  (testing "test case 1276"
    (is (= (stemming "vermonter") "vermont"))))

(deftest test-1277
  (testing "test case 1277"
    (is (= (stemming "imbue") "imbu"))))

(deftest test-1278
  (testing "test case 1278"
    (is (= (stemming "patinas") "patina"))))

(deftest test-1279
  (testing "test case 1279"
    (is (= (stemming "rapier") "rapier"))))

(deftest test-1280
  (testing "test case 1280"
    (is (= (stemming "armories") "armori"))))

(deftest test-1281
  (testing "test case 1281"
    (is (= (stemming "catalyzing") "catalyz"))))

(deftest test-1282
  (testing "test case 1282"
    (is (= (stemming "cions") "cion"))))

(deftest test-1283
  (testing "test case 1283"
    (is (= (stemming "classifier") "classifi"))))

(deftest test-1284
  (testing "test case 1284"
    (is (= (stemming "negus") "negu"))))

(deftest test-1285
  (testing "test case 1285"
    (is (= (stemming "polysyllable") "polysyl"))))

(deftest test-1286
  (testing "test case 1286"
    (is (= (stemming "sanitarian") "sanitarian"))))

(deftest test-1287
  (testing "test case 1287"
    (is (= (stemming "pavement") "pavement"))))

(deftest test-1288
  (testing "test case 1288"
    (is (= (stemming "cappers") "capper"))))

(deftest test-1289
  (testing "test case 1289"
    (is (= (stemming "deliria") "deliria"))))

(deftest test-1290
  (testing "test case 1290"
    (is (= (stemming "idolizing") "idol"))))

(deftest test-1291
  (testing "test case 1291"
    (is (= (stemming "incised") "incis"))))

(deftest test-1292
  (testing "test case 1292"
    (is (= (stemming "dill") "dill"))))

(deftest test-1293
  (testing "test case 1293"
    (is (= (stemming "tattooers") "tattooer"))))

(deftest test-1294
  (testing "test case 1294"
    (is (= (stemming "spectral") "spectral"))))

(deftest test-1295
  (testing "test case 1295"
    (is (= (stemming "fabricator") "fabric"))))

(deftest test-1296
  (testing "test case 1296"
    (is (= (stemming "bulkage") "bulkag"))))

(deftest test-1297
  (testing "test case 1297"
    (is (= (stemming "southwester") "southwest"))))

(deftest test-1298
  (testing "test case 1298"
    (is (= (stemming "zoogeography") "zoogeographi"))))

(deftest test-1299
  (testing "test case 1299"
    (is (= (stemming "misspent") "misspent"))))

(deftest test-1300
  (testing "test case 1300"
    (is (= (stemming "deselects") "deselect"))))

(deftest test-1301
  (testing "test case 1301"
    (is (= (stemming "xenophobia") "xenophobia"))))

(deftest test-1302
  (testing "test case 1302"
    (is (= (stemming "diverts") "divert"))))

(deftest test-1303
  (testing "test case 1303"
    (is (= (stemming "pals") "pal"))))

(deftest test-1304
  (testing "test case 1304"
    (is (= (stemming "mistitling") "mistitl"))))

(deftest test-1305
  (testing "test case 1305"
    (is (= (stemming "brockets") "brocket"))))

(deftest test-1306
  (testing "test case 1306"
    (is (= (stemming "shoved") "shove"))))

(deftest test-1307
  (testing "test case 1307"
    (is (= (stemming "british") "british"))))

(deftest test-1308
  (testing "test case 1308"
    (is (= (stemming "coeducationally") "coeducation"))))

(deftest test-1309
  (testing "test case 1309"
    (is (= (stemming "pusillanimity") "pusillanim"))))

(deftest test-1310
  (testing "test case 1310"
    (is (= (stemming "monosyllables") "monosyl"))))

(deftest test-1311
  (testing "test case 1311"
    (is (= (stemming "coconuts") "coconut"))))

(deftest test-1312
  (testing "test case 1312"
    (is (= (stemming "amortization") "amort"))))

(deftest test-1313
  (testing "test case 1313"
    (is (= (stemming "furcular") "furcular"))))

(deftest test-1314
  (testing "test case 1314"
    (is (= (stemming "greenhorn") "greenhorn"))))

(deftest test-1315
  (testing "test case 1315"
    (is (= (stemming "memorizes") "memor"))))

(deftest test-1316
  (testing "test case 1316"
    (is (= (stemming "breve") "breve"))))

(deftest test-1317
  (testing "test case 1317"
    (is (= (stemming "igniting") "ignit"))))

(deftest test-1318
  (testing "test case 1318"
    (is (= (stemming "amputees") "ampute"))))

(deftest test-1319
  (testing "test case 1319"
    (is (= (stemming "eyebolts") "eyebolt"))))

(deftest test-1320
  (testing "test case 1320"
    (is (= (stemming "dognaps") "dognap"))))

(deftest test-1321
  (testing "test case 1321"
    (is (= (stemming "screechier") "screechier"))))

(deftest test-1322
  (testing "test case 1322"
    (is (= (stemming "isolators") "isol"))))

(deftest test-1323
  (testing "test case 1323"
    (is (= (stemming "civilizes") "civil"))))

(deftest test-1324
  (testing "test case 1324"
    (is (= (stemming "semiskilled") "semiskil"))))

(deftest test-1325
  (testing "test case 1325"
    (is (= (stemming "folders") "folder"))))

(deftest test-1326
  (testing "test case 1326"
    (is (= (stemming "stipulation") "stipul"))))

(deftest test-1327
  (testing "test case 1327"
    (is (= (stemming "versatility") "versatil"))))

(deftest test-1328
  (testing "test case 1328"
    (is (= (stemming "clayed") "clai"))))

(deftest test-1329
  (testing "test case 1329"
    (is (= (stemming "curve") "curv"))))

(deftest test-1330
  (testing "test case 1330"
    (is (= (stemming "pads") "pad"))))

(deftest test-1331
  (testing "test case 1331"
    (is (= (stemming "calcified") "calcifi"))))

(deftest test-1332
  (testing "test case 1332"
    (is (= (stemming "developments") "develop"))))

(deftest test-1333
  (testing "test case 1333"
    (is (= (stemming "sheeters") "sheeter"))))

(deftest test-1334
  (testing "test case 1334"
    (is (= (stemming "linnets") "linnet"))))

(deftest test-1335
  (testing "test case 1335"
    (is (= (stemming "ninetieth") "ninetieth"))))

(deftest test-1336
  (testing "test case 1336"
    (is (= (stemming "absenting") "absent"))))

(deftest test-1337
  (testing "test case 1337"
    (is (= (stemming "hagged") "hag"))))

(deftest test-1338
  (testing "test case 1338"
    (is (= (stemming "distant") "distant"))))

(deftest test-1339
  (testing "test case 1339"
    (is (= (stemming "yardmaster") "yardmast"))))

(deftest test-1340
  (testing "test case 1340"
    (is (= (stemming "smilaxes") "smilax"))))

(deftest test-1341
  (testing "test case 1341"
    (is (= (stemming "gustatorily") "gustatorili"))))

(deftest test-1342
  (testing "test case 1342"
    (is (= (stemming "hoover") "hoover"))))

(deftest test-1343
  (testing "test case 1343"
    (is (= (stemming "nymphomaniacs") "nymphomaniac"))))

(deftest test-1344
  (testing "test case 1344"
    (is (= (stemming "expenders") "expend"))))

(deftest test-1345
  (testing "test case 1345"
    (is (= (stemming "moles") "mole"))))

(deftest test-1346
  (testing "test case 1346"
    (is (= (stemming "reassured") "reassur"))))

(deftest test-1347
  (testing "test case 1347"
    (is (= (stemming "dribblets") "dribblet"))))

(deftest test-1348
  (testing "test case 1348"
    (is (= (stemming "jerry") "jerri"))))

(deftest test-1349
  (testing "test case 1349"
    (is (= (stemming "luckiness") "lucki"))))

(deftest test-1350
  (testing "test case 1350"
    (is (= (stemming "heights") "height"))))

(deftest test-1351
  (testing "test case 1351"
    (is (= (stemming "factualism") "factual"))))

(deftest test-1352
  (testing "test case 1352"
    (is (= (stemming "upmost") "upmost"))))

(deftest test-1353
  (testing "test case 1353"
    (is (= (stemming "thrashes") "thrash"))))

(deftest test-1354
  (testing "test case 1354"
    (is (= (stemming "shoddier") "shoddier"))))

(deftest test-1355
  (testing "test case 1355"
    (is (= (stemming "interrogates") "interrog"))))

(deftest test-1356
  (testing "test case 1356"
    (is (= (stemming "kneepads") "kneepad"))))

(deftest test-1357
  (testing "test case 1357"
    (is (= (stemming "constellation") "constel"))))

(deftest test-1358
  (testing "test case 1358"
    (is (= (stemming "mariposa") "mariposa"))))

(deftest test-1359
  (testing "test case 1359"
    (is (= (stemming "pac") "pac"))))

(deftest test-1360
  (testing "test case 1360"
    (is (= (stemming "sensual") "sensual"))))

(deftest test-1361
  (testing "test case 1361"
    (is (= (stemming "hackers") "hacker"))))

(deftest test-1362
  (testing "test case 1362"
    (is (= (stemming "debasedness") "debased"))))

(deftest test-1363
  (testing "test case 1363"
    (is (= (stemming "whoppers") "whopper"))))

(deftest test-1364
  (testing "test case 1364"
    (is (= (stemming "scanting") "scant"))))

(deftest test-1365
  (testing "test case 1365"
    (is (= (stemming "adjudicate") "adjud"))))

(deftest test-1366
  (testing "test case 1366"
    (is (= (stemming "semestral") "semestr"))))

(deftest test-1367
  (testing "test case 1367"
    (is (= (stemming "italicizing") "italic"))))

(deftest test-1368
  (testing "test case 1368"
    (is (= (stemming "unsnapped") "unsnap"))))

(deftest test-1369
  (testing "test case 1369"
    (is (= (stemming "titillatingly") "titillatingli"))))

(deftest test-1370
  (testing "test case 1370"
    (is (= (stemming "fisheries") "fisheri"))))

(deftest test-1371
  (testing "test case 1371"
    (is (= (stemming "semicircle") "semicircl"))))

(deftest test-1372
  (testing "test case 1372"
    (is (= (stemming "discomfits") "discomfit"))))

(deftest test-1373
  (testing "test case 1373"
    (is (= (stemming "divisibility") "divis"))))

(deftest test-1374
  (testing "test case 1374"
    (is (= (stemming "nationalistic") "nationalist"))))

(deftest test-1375
  (testing "test case 1375"
    (is (= (stemming "diviners") "divin"))))

(deftest test-1376
  (testing "test case 1376"
    (is (= (stemming "nonsuccessiveness") "nonsuccess"))))

(deftest test-1377
  (testing "test case 1377"
    (is (= (stemming "dignity") "digniti"))))

(deftest test-1378
  (testing "test case 1378"
    (is (= (stemming "yellowly") "yellowli"))))

(deftest test-1379
  (testing "test case 1379"
    (is (= (stemming "foreplays") "foreplai"))))

(deftest test-1380
  (testing "test case 1380"
    (is (= (stemming "swampy") "swampi"))))

(deftest test-1381
  (testing "test case 1381"
    (is (= (stemming "straddling") "straddl"))))

(deftest test-1382
  (testing "test case 1382"
    (is (= (stemming "dangled") "dangl"))))

(deftest test-1383
  (testing "test case 1383"
    (is (= (stemming "quiverer") "quiver"))))

(deftest test-1384
  (testing "test case 1384"
    (is (= (stemming "beadles") "beadl"))))

(deftest test-1385
  (testing "test case 1385"
    (is (= (stemming "shilling") "shill"))))

(deftest test-1386
  (testing "test case 1386"
    (is (= (stemming "endives") "endiv"))))

(deftest test-1387
  (testing "test case 1387"
    (is (= (stemming "fluoridate") "fluorid"))))

(deftest test-1388
  (testing "test case 1388"
    (is (= (stemming "timidity") "timid"))))

(deftest test-1389
  (testing "test case 1389"
    (is (= (stemming "unripest") "unripest"))))

(deftest test-1390
  (testing "test case 1390"
    (is (= (stemming "bindable") "bindabl"))))

(deftest test-1391
  (testing "test case 1391"
    (is (= (stemming "drunkometer") "drunkomet"))))

(deftest test-1392
  (testing "test case 1392"
    (is (= (stemming "rechristening") "rechristen"))))

(deftest test-1393
  (testing "test case 1393"
    (is (= (stemming "impoliteness") "impolit"))))

(deftest test-1394
  (testing "test case 1394"
    (is (= (stemming "acromegalic") "acromegal"))))

(deftest test-1395
  (testing "test case 1395"
    (is (= (stemming "enclasping") "enclasp"))))

(deftest test-1396
  (testing "test case 1396"
    (is (= (stemming "restating") "restat"))))

(deftest test-1397
  (testing "test case 1397"
    (is (= (stemming "beebreads") "beebread"))))

(deftest test-1398
  (testing "test case 1398"
    (is (= (stemming "intuito") "intuito"))))

(deftest test-1399
  (testing "test case 1399"
    (is (= (stemming "bluegums") "bluegum"))))

(deftest test-1400
  (testing "test case 1400"
    (is (= (stemming "weensier") "weensier"))))

(deftest test-1401
  (testing "test case 1401"
    (is (= (stemming "twirlers") "twirler"))))

(deftest test-1402
  (testing "test case 1402"
    (is (= (stemming "apologetic") "apologet"))))

(deftest test-1403
  (testing "test case 1403"
    (is (= (stemming "canthus") "canthu"))))

(deftest test-1404
  (testing "test case 1404"
    (is (= (stemming "obvious") "obviou"))))

(deftest test-1405
  (testing "test case 1405"
    (is (= (stemming "cardamums") "cardamum"))))

(deftest test-1406
  (testing "test case 1406"
    (is (= (stemming "launderette") "launderett"))))

(deftest test-1407
  (testing "test case 1407"
    (is (= (stemming "matrilinear") "matrilinear"))))

(deftest test-1408
  (testing "test case 1408"
    (is (= (stemming "supercedes") "superced"))))

(deftest test-1409
  (testing "test case 1409"
    (is (= (stemming "sloppy") "sloppi"))))

(deftest test-1410
  (testing "test case 1410"
    (is (= (stemming "tenemented") "tenement"))))

(deftest test-1411
  (testing "test case 1411"
    (is (= (stemming "sprinkler") "sprinkler"))))

(deftest test-1412
  (testing "test case 1412"
    (is (= (stemming "obstruct") "obstruct"))))

(deftest test-1413
  (testing "test case 1413"
    (is (= (stemming "untilled") "until"))))

(deftest test-1414
  (testing "test case 1414"
    (is (= (stemming "daughterly") "daughterli"))))

(deftest test-1415
  (testing "test case 1415"
    (is (= (stemming "incompetencies") "incompet"))))

(deftest test-1416
  (testing "test case 1416"
    (is (= (stemming "intermix") "intermix"))))

(deftest test-1417
  (testing "test case 1417"
    (is (= (stemming "piscatorial") "piscatori"))))

(deftest test-1418
  (testing "test case 1418"
    (is (= (stemming "embers") "ember"))))

(deftest test-1419
  (testing "test case 1419"
    (is (= (stemming "schismatize") "schismat"))))

(deftest test-1420
  (testing "test case 1420"
    (is (= (stemming "forjudge") "forjudg"))))

(deftest test-1421
  (testing "test case 1421"
    (is (= (stemming "recension") "recens"))))

(deftest test-1422
  (testing "test case 1422"
    (is (= (stemming "depending") "depend"))))

(deftest test-1423
  (testing "test case 1423"
    (is (= (stemming "interprets") "interpret"))))

(deftest test-1424
  (testing "test case 1424"
    (is (= (stemming "promoting") "promot"))))

(deftest test-1425
  (testing "test case 1425"
    (is (= (stemming "haunched") "haunch"))))

(deftest test-1426
  (testing "test case 1426"
    (is (= (stemming "reship") "reship"))))

(deftest test-1427
  (testing "test case 1427"
    (is (= (stemming "experimenter") "experiment"))))

(deftest test-1428
  (testing "test case 1428"
    (is (= (stemming "boxlike") "boxlik"))))

(deftest test-1429
  (testing "test case 1429"
    (is (= (stemming "heelballs") "heelbal"))))

(deftest test-1430
  (testing "test case 1430"
    (is (= (stemming "allegiance") "allegi"))))

(deftest test-1431
  (testing "test case 1431"
    (is (= (stemming "flocked") "flock"))))

(deftest test-1432
  (testing "test case 1432"
    (is (= (stemming "footless") "footless"))))

(deftest test-1433
  (testing "test case 1433"
    (is (= (stemming "sling") "sling"))))

(deftest test-1434
  (testing "test case 1434"
    (is (= (stemming "heroized") "heroiz"))))

(deftest test-1435
  (testing "test case 1435"
    (is (= (stemming "buttes") "butt"))))

(deftest test-1436
  (testing "test case 1436"
    (is (= (stemming "dictatorially") "dictatori"))))

(deftest test-1437
  (testing "test case 1437"
    (is (= (stemming "condescendingly") "condescendingli"))))

(deftest test-1438
  (testing "test case 1438"
    (is (= (stemming "unshorn") "unshorn"))))

(deftest test-1439
  (testing "test case 1439"
    (is (= (stemming "americanizes") "american"))))

(deftest test-1440
  (testing "test case 1440"
    (is (= (stemming "hurrayed") "hurrai"))))

(deftest test-1441
  (testing "test case 1441"
    (is (= (stemming "roadsides") "roadsid"))))

(deftest test-1442
  (testing "test case 1442"
    (is (= (stemming "jowliest") "jowliest"))))

(deftest test-1443
  (testing "test case 1443"
    (is (= (stemming "movies") "movi"))))

(deftest test-1444
  (testing "test case 1444"
    (is (= (stemming "breastbone") "breastbon"))))

(deftest test-1445
  (testing "test case 1445"
    (is (= (stemming "argols") "argol"))))

(deftest test-1446
  (testing "test case 1446"
    (is (= (stemming "threaded") "thread"))))

(deftest test-1447
  (testing "test case 1447"
    (is (= (stemming "hidalgos") "hidalgo"))))

(deftest test-1448
  (testing "test case 1448"
    (is (= (stemming "dishwasher") "dishwash"))))

(deftest test-1449
  (testing "test case 1449"
    (is (= (stemming "indolently") "indol"))))

(deftest test-1450
  (testing "test case 1450"
    (is (= (stemming "rosalind") "rosalind"))))

(deftest test-1451
  (testing "test case 1451"
    (is (= (stemming "uncork") "uncork"))))

(deftest test-1452
  (testing "test case 1452"
    (is (= (stemming "zoologic") "zoolog"))))

(deftest test-1453
  (testing "test case 1453"
    (is (= (stemming "overviews") "overview"))))

(deftest test-1454
  (testing "test case 1454"
    (is (= (stemming "ivied") "ivi"))))

(deftest test-1455
  (testing "test case 1455"
    (is (= (stemming "eponymies") "eponymi"))))

(deftest test-1456
  (testing "test case 1456"
    (is (= (stemming "quivered") "quiver"))))

(deftest test-1457
  (testing "test case 1457"
    (is (= (stemming "hilly") "hilli"))))

(deftest test-1458
  (testing "test case 1458"
    (is (= (stemming "clangors") "clangor"))))

(deftest test-1459
  (testing "test case 1459"
    (is (= (stemming "stipulate") "stipul"))))

(deftest test-1460
  (testing "test case 1460"
    (is (= (stemming "xviii") "xviii"))))

(deftest test-1461
  (testing "test case 1461"
    (is (= (stemming "batteaux") "batteaux"))))

(deftest test-1462
  (testing "test case 1462"
    (is (= (stemming "yellowing") "yellow"))))

(deftest test-1463
  (testing "test case 1463"
    (is (= (stemming "curmudgeons") "curmudgeon"))))

(deftest test-1464
  (testing "test case 1464"
    (is (= (stemming "gritted") "grit"))))

(deftest test-1465
  (testing "test case 1465"
    (is (= (stemming "stationed") "station"))))

(deftest test-1466
  (testing "test case 1466"
    (is (= (stemming "duodenal") "duoden"))))

(deftest test-1467
  (testing "test case 1467"
    (is (= (stemming "revoir") "revoir"))))

(deftest test-1468
  (testing "test case 1468"
    (is (= (stemming "rehearsing") "rehears"))))

(deftest test-1469
  (testing "test case 1469"
    (is (= (stemming "spelunk") "spelunk"))))

(deftest test-1470
  (testing "test case 1470"
    (is (= (stemming "resulted") "result"))))

(deftest test-1471
  (testing "test case 1471"
    (is (= (stemming "depressional") "depression"))))

(deftest test-1472
  (testing "test case 1472"
    (is (= (stemming "polyesters") "polyest"))))

(deftest test-1473
  (testing "test case 1473"
    (is (= (stemming "typhoid") "typhoid"))))

(deftest test-1474
  (testing "test case 1474"
    (is (= (stemming "furbelows") "furbelow"))))

(deftest test-1475
  (testing "test case 1475"
    (is (= (stemming "sucklers") "suckler"))))

(deftest test-1476
  (testing "test case 1476"
    (is (= (stemming "strangulated") "strangul"))))

(deftest test-1477
  (testing "test case 1477"
    (is (= (stemming "impersonalized") "imperson"))))

(deftest test-1478
  (testing "test case 1478"
    (is (= (stemming "unrobing") "unrob"))))

(deftest test-1479
  (testing "test case 1479"
    (is (= (stemming "infinities") "infin"))))

(deftest test-1480
  (testing "test case 1480"
    (is (= (stemming "unconcealed") "unconc"))))

(deftest test-1481
  (testing "test case 1481"
    (is (= (stemming "fenestration") "fenestr"))))

(deftest test-1482
  (testing "test case 1482"
    (is (= (stemming "walkovers") "walkov"))))

(deftest test-1483
  (testing "test case 1483"
    (is (= (stemming "freedmen") "freedmen"))))

(deftest test-1484
  (testing "test case 1484"
    (is (= (stemming "nonunion") "nonunion"))))

(deftest test-1485
  (testing "test case 1485"
    (is (= (stemming "approves") "approv"))))

(deftest test-1486
  (testing "test case 1486"
    (is (= (stemming "beakers") "beaker"))))

(deftest test-1487
  (testing "test case 1487"
    (is (= (stemming "refuse") "refus"))))

(deftest test-1488
  (testing "test case 1488"
    (is (= (stemming "gumtree") "gumtre"))))

(deftest test-1489
  (testing "test case 1489"
    (is (= (stemming "subclinical") "subclin"))))

(deftest test-1490
  (testing "test case 1490"
    (is (= (stemming "resistor") "resistor"))))

(deftest test-1491
  (testing "test case 1491"
    (is (= (stemming "mantises") "mantis"))))

(deftest test-1492
  (testing "test case 1492"
    (is (= (stemming "celtic") "celtic"))))

(deftest test-1493
  (testing "test case 1493"
    (is (= (stemming "chittered") "chitter"))))

(deftest test-1494
  (testing "test case 1494"
    (is (= (stemming "mentation") "mentat"))))

(deftest test-1495
  (testing "test case 1495"
    (is (= (stemming "mn") "mn"))))

(deftest test-1496
  (testing "test case 1496"
    (is (= (stemming "circumstantial") "circumstanti"))))

(deftest test-1497
  (testing "test case 1497"
    (is (= (stemming "kinema") "kinema"))))

(deftest test-1498
  (testing "test case 1498"
    (is (= (stemming "descant") "descant"))))

(deftest test-1499
  (testing "test case 1499"
    (is (= (stemming "jesuits") "jesuit"))))

(deftest test-1500
  (testing "test case 1500"
    (is (= (stemming "strengthens") "strengthen"))))

(deftest test-1501
  (testing "test case 1501"
    (is (= (stemming "chuted") "chute"))))

(deftest test-1502
  (testing "test case 1502"
    (is (= (stemming "ardently") "ardent"))))

(deftest test-1503
  (testing "test case 1503"
    (is (= (stemming "fellaheen") "fellaheen"))))

(deftest test-1504
  (testing "test case 1504"
    (is (= (stemming "coiffeuses") "coiffeus"))))

(deftest test-1505
  (testing "test case 1505"
    (is (= (stemming "bah") "bah"))))

(deftest test-1506
  (testing "test case 1506"
    (is (= (stemming "apocryphalness") "apocryph"))))

(deftest test-1507
  (testing "test case 1507"
    (is (= (stemming "perpetration") "perpetr"))))

(deftest test-1508
  (testing "test case 1508"
    (is (= (stemming "dynamical") "dynam"))))

(deftest test-1509
  (testing "test case 1509"
    (is (= (stemming "nitrile") "nitril"))))

(deftest test-1510
  (testing "test case 1510"
    (is (= (stemming "entombed") "entomb"))))

(deftest test-1511
  (testing "test case 1511"
    (is (= (stemming "birchism") "birchism"))))

(deftest test-1512
  (testing "test case 1512"
    (is (= (stemming "lamella") "lamella"))))

(deftest test-1513
  (testing "test case 1513"
    (is (= (stemming "percenter") "percent"))))

(deftest test-1514
  (testing "test case 1514"
    (is (= (stemming "grimness") "grim"))))

(deftest test-1515
  (testing "test case 1515"
    (is (= (stemming "astrologist") "astrologist"))))

(deftest test-1516
  (testing "test case 1516"
    (is (= (stemming "sheepishly") "sheepishli"))))

(deftest test-1517
  (testing "test case 1517"
    (is (= (stemming "intensified") "intensifi"))))

(deftest test-1518
  (testing "test case 1518"
    (is (= (stemming "commonplace") "commonplac"))))

(deftest test-1519
  (testing "test case 1519"
    (is (= (stemming "embrocating") "embroc"))))

(deftest test-1520
  (testing "test case 1520"
    (is (= (stemming "handwrote") "handwrot"))))

(deftest test-1521
  (testing "test case 1521"
    (is (= (stemming "profligacy") "profligaci"))))

(deftest test-1522
  (testing "test case 1522"
    (is (= (stemming "specializes") "special"))))

(deftest test-1523
  (testing "test case 1523"
    (is (= (stemming "capers") "caper"))))

(deftest test-1524
  (testing "test case 1524"
    (is (= (stemming "unterminated") "untermin"))))

(deftest test-1525
  (testing "test case 1525"
    (is (= (stemming "sledgehammers") "sledgehamm"))))

(deftest test-1526
  (testing "test case 1526"
    (is (= (stemming "booed") "boo"))))

(deftest test-1527
  (testing "test case 1527"
    (is (= (stemming "matildas") "matilda"))))

(deftest test-1528
  (testing "test case 1528"
    (is (= (stemming "martialled") "martial"))))

(deftest test-1529
  (testing "test case 1529"
    (is (= (stemming "flamming") "flam"))))

(deftest test-1530
  (testing "test case 1530"
    (is (= (stemming "negligibly") "neglig"))))

(deftest test-1531
  (testing "test case 1531"
    (is (= (stemming "pressmark") "pressmark"))))

(deftest test-1532
  (testing "test case 1532"
    (is (= (stemming "conduct") "conduct"))))

(deftest test-1533
  (testing "test case 1533"
    (is (= (stemming "marted") "mart"))))

(deftest test-1534
  (testing "test case 1534"
    (is (= (stemming "outsides") "outsid"))))

(deftest test-1535
  (testing "test case 1535"
    (is (= (stemming "fatsoes") "fatso"))))

(deftest test-1536
  (testing "test case 1536"
    (is (= (stemming "nucleoplasm") "nucleoplasm"))))

(deftest test-1537
  (testing "test case 1537"
    (is (= (stemming "linecut") "linecut"))))

(deftest test-1538
  (testing "test case 1538"
    (is (= (stemming "jiggers") "jigger"))))

(deftest test-1539
  (testing "test case 1539"
    (is (= (stemming "tympanums") "tympanum"))))

(deftest test-1540
  (testing "test case 1540"
    (is (= (stemming "sangria") "sangria"))))

(deftest test-1541
  (testing "test case 1541"
    (is (= (stemming "devoir") "devoir"))))

(deftest test-1542
  (testing "test case 1542"
    (is (= (stemming "rationed") "ration"))))

(deftest test-1543
  (testing "test case 1543"
    (is (= (stemming "chemists") "chemist"))))

(deftest test-1544
  (testing "test case 1544"
    (is (= (stemming "invariant") "invari"))))

(deftest test-1545
  (testing "test case 1545"
    (is (= (stemming "icecap") "icecap"))))

(deftest test-1546
  (testing "test case 1546"
    (is (= (stemming "reproductiveness") "reproduct"))))

(deftest test-1547
  (testing "test case 1547"
    (is (= (stemming "archaistic") "archaist"))))

(deftest test-1548
  (testing "test case 1548"
    (is (= (stemming "magnesia") "magnesia"))))

(deftest test-1549
  (testing "test case 1549"
    (is (= (stemming "gluily") "gluili"))))

(deftest test-1550
  (testing "test case 1550"
    (is (= (stemming "fistula") "fistula"))))

(deftest test-1551
  (testing "test case 1551"
    (is (= (stemming "metabolical") "metabol"))))

(deftest test-1552
  (testing "test case 1552"
    (is (= (stemming "coarsest") "coarsest"))))

(deftest test-1553
  (testing "test case 1553"
    (is (= (stemming "algebra") "algebra"))))

(deftest test-1554
  (testing "test case 1554"
    (is (= (stemming "okie") "oki"))))

(deftest test-1555
  (testing "test case 1555"
    (is (= (stemming "spatteringly") "spatteringli"))))

(deftest test-1556
  (testing "test case 1556"
    (is (= (stemming "coteries") "coteri"))))

(deftest test-1557
  (testing "test case 1557"
    (is (= (stemming "outers") "outer"))))

(deftest test-1558
  (testing "test case 1558"
    (is (= (stemming "dooryards") "dooryard"))))

(deftest test-1559
  (testing "test case 1559"
    (is (= (stemming "readopt") "readopt"))))

(deftest test-1560
  (testing "test case 1560"
    (is (= (stemming "marmots") "marmot"))))

(deftest test-1561
  (testing "test case 1561"
    (is (= (stemming "depravities") "deprav"))))

(deftest test-1562
  (testing "test case 1562"
    (is (= (stemming "stigmatizes") "stigmat"))))

(deftest test-1563
  (testing "test case 1563"
    (is (= (stemming "dwarf") "dwarf"))))

(deftest test-1564
  (testing "test case 1564"
    (is (= (stemming "apologue") "apologu"))))

(deftest test-1565
  (testing "test case 1565"
    (is (= (stemming "stylar") "stylar"))))

(deftest test-1566
  (testing "test case 1566"
    (is (= (stemming "males") "male"))))

(deftest test-1567
  (testing "test case 1567"
    (is (= (stemming "homagers") "homag"))))

(deftest test-1568
  (testing "test case 1568"
    (is (= (stemming "intimated") "intim"))))

(deftest test-1569
  (testing "test case 1569"
    (is (= (stemming "fashionableness") "fashion"))))

(deftest test-1570
  (testing "test case 1570"
    (is (= (stemming "secretaries") "secretari"))))

(deftest test-1571
  (testing "test case 1571"
    (is (= (stemming "degrader") "degrad"))))

(deftest test-1572
  (testing "test case 1572"
    (is (= (stemming "maxi") "maxi"))))

(deftest test-1573
  (testing "test case 1573"
    (is (= (stemming "vaporishness") "vaporish"))))

(deftest test-1574
  (testing "test case 1574"
    (is (= (stemming "devilling") "devil"))))

(deftest test-1575
  (testing "test case 1575"
    (is (= (stemming "witherer") "wither"))))

(deftest test-1576
  (testing "test case 1576"
    (is (= (stemming "quarterdecks") "quarterdeck"))))

(deftest test-1577
  (testing "test case 1577"
    (is (= (stemming "boatswain") "boatswain"))))

(deftest test-1578
  (testing "test case 1578"
    (is (= (stemming "queasily") "queasili"))))

(deftest test-1579
  (testing "test case 1579"
    (is (= (stemming "trimmest") "trimmest"))))

(deftest test-1580
  (testing "test case 1580"
    (is (= (stemming "gibbon") "gibbon"))))

(deftest test-1581
  (testing "test case 1581"
    (is (= (stemming "ultimo") "ultimo"))))

(deftest test-1582
  (testing "test case 1582"
    (is (= (stemming "monument") "monument"))))

(deftest test-1583
  (testing "test case 1583"
    (is (= (stemming "thane") "thane"))))

(deftest test-1584
  (testing "test case 1584"
    (is (= (stemming "reconcilers") "reconcil"))))

(deftest test-1585
  (testing "test case 1585"
    (is (= (stemming "estates") "estat"))))

(deftest test-1586
  (testing "test case 1586"
    (is (= (stemming "dislike") "dislik"))))

(deftest test-1587
  (testing "test case 1587"
    (is (= (stemming "discordant") "discord"))))

(deftest test-1588
  (testing "test case 1588"
    (is (= (stemming "woodland") "woodland"))))

(deftest test-1589
  (testing "test case 1589"
    (is (= (stemming "fiscal") "fiscal"))))

(deftest test-1590
  (testing "test case 1590"
    (is (= (stemming "apply") "appli"))))

(deftest test-1591
  (testing "test case 1591"
    (is (= (stemming "subsists") "subsist"))))

(deftest test-1592
  (testing "test case 1592"
    (is (= (stemming "trilling") "trill"))))

(deftest test-1593
  (testing "test case 1593"
    (is (= (stemming "abominated") "abomin"))))

(deftest test-1594
  (testing "test case 1594"
    (is (= (stemming "runny") "runni"))))

(deftest test-1595
  (testing "test case 1595"
    (is (= (stemming "ineffectual") "ineffectu"))))

(deftest test-1596
  (testing "test case 1596"
    (is (= (stemming "landau") "landau"))))

(deftest test-1597
  (testing "test case 1597"
    (is (= (stemming "solemnizes") "solemn"))))

(deftest test-1598
  (testing "test case 1598"
    (is (= (stemming "representation") "represent"))))

(deftest test-1599
  (testing "test case 1599"
    (is (= (stemming "irrigation") "irrig"))))

(deftest test-1600
  (testing "test case 1600"
    (is (= (stemming "constricted") "constrict"))))

(deftest test-1601
  (testing "test case 1601"
    (is (= (stemming "disestablishing") "disestablish"))))

(deftest test-1602
  (testing "test case 1602"
    (is (= (stemming "dactyls") "dactyl"))))

(deftest test-1603
  (testing "test case 1603"
    (is (= (stemming "tinted") "tint"))))

(deftest test-1604
  (testing "test case 1604"
    (is (= (stemming "quiescence") "quiescenc"))))

(deftest test-1605
  (testing "test case 1605"
    (is (= (stemming "bluefish") "bluefish"))))

(deftest test-1606
  (testing "test case 1606"
    (is (= (stemming "crosby") "crosbi"))))

(deftest test-1607
  (testing "test case 1607"
    (is (= (stemming "salamis") "salami"))))

(deftest test-1608
  (testing "test case 1608"
    (is (= (stemming "transcend") "transcend"))))

(deftest test-1609
  (testing "test case 1609"
    (is (= (stemming "exurbanite") "exurbanit"))))

(deftest test-1610
  (testing "test case 1610"
    (is (= (stemming "applies") "appli"))))

(deftest test-1611
  (testing "test case 1611"
    (is (= (stemming "doddered") "dodder"))))

(deftest test-1612
  (testing "test case 1612"
    (is (= (stemming "overexpansion") "overexpans"))))

(deftest test-1613
  (testing "test case 1613"
    (is (= (stemming "excitability") "excit"))))

(deftest test-1614
  (testing "test case 1614"
    (is (= (stemming "quo") "quo"))))

(deftest test-1615
  (testing "test case 1615"
    (is (= (stemming "ops") "op"))))

(deftest test-1616
  (testing "test case 1616"
    (is (= (stemming "dally") "dalli"))))

(deftest test-1617
  (testing "test case 1617"
    (is (= (stemming "timeworks") "timework"))))

(deftest test-1618
  (testing "test case 1618"
    (is (= (stemming "embalming") "embalm"))))

(deftest test-1619
  (testing "test case 1619"
    (is (= (stemming "galoshes") "galosh"))))

(deftest test-1620
  (testing "test case 1620"
    (is (= (stemming "mull") "mull"))))

(deftest test-1621
  (testing "test case 1621"
    (is (= (stemming "standardbearer") "standardbear"))))

(deftest test-1622
  (testing "test case 1622"
    (is (= (stemming "radar") "radar"))))

(deftest test-1623
  (testing "test case 1623"
    (is (= (stemming "shetland") "shetland"))))

(deftest test-1624
  (testing "test case 1624"
    (is (= (stemming "arid") "arid"))))

(deftest test-1625
  (testing "test case 1625"
    (is (= (stemming "commissariats") "commissariat"))))

(deftest test-1626
  (testing "test case 1626"
    (is (= (stemming "roundups") "roundup"))))

(deftest test-1627
  (testing "test case 1627"
    (is (= (stemming "vivisected") "vivisect"))))

(deftest test-1628
  (testing "test case 1628"
    (is (= (stemming "ban") "ban"))))

(deftest test-1629
  (testing "test case 1629"
    (is (= (stemming "quoted") "quot"))))

(deftest test-1630
  (testing "test case 1630"
    (is (= (stemming "entertainingly") "entertainingli"))))

(deftest test-1631
  (testing "test case 1631"
    (is (= (stemming "shipwrecked") "shipwreck"))))

(deftest test-1632
  (testing "test case 1632"
    (is (= (stemming "subrace") "subrac"))))

(deftest test-1633
  (testing "test case 1633"
    (is (= (stemming "avocado") "avocado"))))

(deftest test-1634
  (testing "test case 1634"
    (is (= (stemming "textiles") "textil"))))

(deftest test-1635
  (testing "test case 1635"
    (is (= (stemming "toolers") "tooler"))))

(deftest test-1636
  (testing "test case 1636"
    (is (= (stemming "flouts") "flout"))))

(deftest test-1637
  (testing "test case 1637"
    (is (= (stemming "sedum") "sedum"))))

(deftest test-1638
  (testing "test case 1638"
    (is (= (stemming "evanescence") "evanesc"))))

(deftest test-1639
  (testing "test case 1639"
    (is (= (stemming "preservatives") "preserv"))))

(deftest test-1640
  (testing "test case 1640"
    (is (= (stemming "itch") "itch"))))

(deftest test-1641
  (testing "test case 1641"
    (is (= (stemming "preview") "preview"))))

(deftest test-1642
  (testing "test case 1642"
    (is (= (stemming "aluminic") "alumin"))))

(deftest test-1643
  (testing "test case 1643"
    (is (= (stemming "piosity") "piositi"))))

(deftest test-1644
  (testing "test case 1644"
    (is (= (stemming "monogamists") "monogamist"))))

(deftest test-1645
  (testing "test case 1645"
    (is (= (stemming "modulators") "modul"))))

(deftest test-1646
  (testing "test case 1646"
    (is (= (stemming "businesses") "busi"))))

(deftest test-1647
  (testing "test case 1647"
    (is (= (stemming "swaggerers") "swagger"))))

(deftest test-1648
  (testing "test case 1648"
    (is (= (stemming "adolescence") "adolesc"))))

(deftest test-1649
  (testing "test case 1649"
    (is (= (stemming "zincked") "zinck"))))

(deftest test-1650
  (testing "test case 1650"
    (is (= (stemming "whalings") "whale"))))

(deftest test-1651
  (testing "test case 1651"
    (is (= (stemming "solidification") "solidif"))))

(deftest test-1652
  (testing "test case 1652"
    (is (= (stemming "unarm") "unarm"))))

(deftest test-1653
  (testing "test case 1653"
    (is (= (stemming "chem") "chem"))))

(deftest test-1654
  (testing "test case 1654"
    (is (= (stemming "fatigued") "fatigu"))))

(deftest test-1655
  (testing "test case 1655"
    (is (= (stemming "tackler") "tackler"))))

(deftest test-1656
  (testing "test case 1656"
    (is (= (stemming "pare") "pare"))))

(deftest test-1657
  (testing "test case 1657"
    (is (= (stemming "sophomores") "sophomor"))))

(deftest test-1658
  (testing "test case 1658"
    (is (= (stemming "gymnastic") "gymnast"))))

(deftest test-1659
  (testing "test case 1659"
    (is (= (stemming "opposites") "opposit"))))

(deftest test-1660
  (testing "test case 1660"
    (is (= (stemming "sourpuss") "sourpuss"))))

(deftest test-1661
  (testing "test case 1661"
    (is (= (stemming "hencoops") "hencoop"))))

(deftest test-1662
  (testing "test case 1662"
    (is (= (stemming "rifts") "rift"))))

(deftest test-1663
  (testing "test case 1663"
    (is (= (stemming "berlins") "berlin"))))

(deftest test-1664
  (testing "test case 1664"
    (is (= (stemming "cornell") "cornel"))))

(deftest test-1665
  (testing "test case 1665"
    (is (= (stemming "nudniks") "nudnik"))))

(deftest test-1666
  (testing "test case 1666"
    (is (= (stemming "intermitted") "intermit"))))

(deftest test-1667
  (testing "test case 1667"
    (is (= (stemming "vitrioled") "vitriol"))))

(deftest test-1668
  (testing "test case 1668"
    (is (= (stemming "desert") "desert"))))

(deftest test-1669
  (testing "test case 1669"
    (is (= (stemming "eyehole") "eyehol"))))

(deftest test-1670
  (testing "test case 1670"
    (is (= (stemming "hiker") "hiker"))))

(deftest test-1671
  (testing "test case 1671"
    (is (= (stemming "misappropriated") "misappropri"))))

(deftest test-1672
  (testing "test case 1672"
    (is (= (stemming "prepacking") "prepack"))))

(deftest test-1673
  (testing "test case 1673"
    (is (= (stemming "tweezed") "tweez"))))

(deftest test-1674
  (testing "test case 1674"
    (is (= (stemming "insensitivities") "insensit"))))

(deftest test-1675
  (testing "test case 1675"
    (is (= (stemming "lacunas") "lacuna"))))

(deftest test-1676
  (testing "test case 1676"
    (is (= (stemming "boost") "boost"))))

(deftest test-1677
  (testing "test case 1677"
    (is (= (stemming "blanc") "blanc"))))

(deftest test-1678
  (testing "test case 1678"
    (is (= (stemming "beseem") "beseem"))))

(deftest test-1679
  (testing "test case 1679"
    (is (= (stemming "presaging") "presag"))))

(deftest test-1680
  (testing "test case 1680"
    (is (= (stemming "billion") "billion"))))

(deftest test-1681
  (testing "test case 1681"
    (is (= (stemming "infatuation") "infatu"))))

(deftest test-1682
  (testing "test case 1682"
    (is (= (stemming "assignable") "assign"))))

(deftest test-1683
  (testing "test case 1683"
    (is (= (stemming "polliwog") "polliwog"))))

(deftest test-1684
  (testing "test case 1684"
    (is (= (stemming "shrouding") "shroud"))))

(deftest test-1685
  (testing "test case 1685"
    (is (= (stemming "posterities") "poster"))))

(deftest test-1686
  (testing "test case 1686"
    (is (= (stemming "unlivable") "unliv"))))

(deftest test-1687
  (testing "test case 1687"
    (is (= (stemming "ionizing") "ioniz"))))

(deftest test-1688
  (testing "test case 1688"
    (is (= (stemming "pantheism") "pantheism"))))

(deftest test-1689
  (testing "test case 1689"
    (is (= (stemming "quetzal") "quetzal"))))

(deftest test-1690
  (testing "test case 1690"
    (is (= (stemming "wooled") "wool"))))

(deftest test-1691
  (testing "test case 1691"
    (is (= (stemming "chamisos") "chamiso"))))

(deftest test-1692
  (testing "test case 1692"
    (is (= (stemming "riser") "riser"))))

(deftest test-1693
  (testing "test case 1693"
    (is (= (stemming "perfects") "perfect"))))

(deftest test-1694
  (testing "test case 1694"
    (is (= (stemming "obsessed") "obsess"))))

(deftest test-1695
  (testing "test case 1695"
    (is (= (stemming "ender") "ender"))))

(deftest test-1696
  (testing "test case 1696"
    (is (= (stemming "smoothy") "smoothi"))))

(deftest test-1697
  (testing "test case 1697"
    (is (= (stemming "earthed") "earth"))))

(deftest test-1698
  (testing "test case 1698"
    (is (= (stemming "estreating") "estreat"))))

(deftest test-1699
  (testing "test case 1699"
    (is (= (stemming "kilometers") "kilomet"))))

(deftest test-1700
  (testing "test case 1700"
    (is (= (stemming "skinless") "skinless"))))

(deftest test-1701
  (testing "test case 1701"
    (is (= (stemming "snacking") "snack"))))

(deftest test-1702
  (testing "test case 1702"
    (is (= (stemming "radiocast") "radiocast"))))

(deftest test-1703
  (testing "test case 1703"
    (is (= (stemming "inflicting") "inflict"))))

(deftest test-1704
  (testing "test case 1704"
    (is (= (stemming "peacoats") "peacoat"))))

(deftest test-1705
  (testing "test case 1705"
    (is (= (stemming "caucuses") "caucus"))))

(deftest test-1706
  (testing "test case 1706"
    (is (= (stemming "mongol") "mongol"))))

(deftest test-1707
  (testing "test case 1707"
    (is (= (stemming "ochres") "ochr"))))

(deftest test-1708
  (testing "test case 1708"
    (is (= (stemming "elation") "elat"))))

(deftest test-1709
  (testing "test case 1709"
    (is (= (stemming "copular") "copular"))))

(deftest test-1710
  (testing "test case 1710"
    (is (= (stemming "end") "end"))))

(deftest test-1711
  (testing "test case 1711"
    (is (= (stemming "issuances") "issuanc"))))

(deftest test-1712
  (testing "test case 1712"
    (is (= (stemming "unsuspicious") "unsuspici"))))

(deftest test-1713
  (testing "test case 1713"
    (is (= (stemming "misapply") "misappli"))))

(deftest test-1714
  (testing "test case 1714"
    (is (= (stemming "coexistent") "coexist"))))

(deftest test-1715
  (testing "test case 1715"
    (is (= (stemming "untucked") "untuck"))))

(deftest test-1716
  (testing "test case 1716"
    (is (= (stemming "belittler") "belittl"))))

(deftest test-1717
  (testing "test case 1717"
    (is (= (stemming "blabbed") "blab"))))

(deftest test-1718
  (testing "test case 1718"
    (is (= (stemming "toe") "toe"))))

(deftest test-1719
  (testing "test case 1719"
    (is (= (stemming "committal") "committ"))))

(deftest test-1720
  (testing "test case 1720"
    (is (= (stemming "granularity") "granular"))))

(deftest test-1721
  (testing "test case 1721"
    (is (= (stemming "keypunching") "keypunch"))))

(deftest test-1722
  (testing "test case 1722"
    (is (= (stemming "antiwar") "antiwar"))))

(deftest test-1723
  (testing "test case 1723"
    (is (= (stemming "aggressed") "aggress"))))

(deftest test-1724
  (testing "test case 1724"
    (is (= (stemming "clacks") "clack"))))

(deftest test-1725
  (testing "test case 1725"
    (is (= (stemming "manhood") "manhood"))))

(deftest test-1726
  (testing "test case 1726"
    (is (= (stemming "arnica") "arnica"))))

(deftest test-1727
  (testing "test case 1727"
    (is (= (stemming "aversive") "avers"))))

(deftest test-1728
  (testing "test case 1728"
    (is (= (stemming "weaves") "weav"))))

(deftest test-1729
  (testing "test case 1729"
    (is (= (stemming "spawning") "spawn"))))

(deftest test-1730
  (testing "test case 1730"
    (is (= (stemming "nuthatches") "nuthatch"))))

(deftest test-1731
  (testing "test case 1731"
    (is (= (stemming "rocketing") "rocket"))))

(deftest test-1732
  (testing "test case 1732"
    (is (= (stemming "doxy") "doxi"))))

(deftest test-1733
  (testing "test case 1733"
    (is (= (stemming "valediction") "valedict"))))

(deftest test-1734
  (testing "test case 1734"
    (is (= (stemming "rails") "rail"))))

(deftest test-1735
  (testing "test case 1735"
    (is (= (stemming "erupt") "erupt"))))

(deftest test-1736
  (testing "test case 1736"
    (is (= (stemming "disappoint") "disappoint"))))

(deftest test-1737
  (testing "test case 1737"
    (is (= (stemming "clearing") "clear"))))

(deftest test-1738
  (testing "test case 1738"
    (is (= (stemming "lazying") "lazi"))))

(deftest test-1739
  (testing "test case 1739"
    (is (= (stemming "proprietaries") "proprietari"))))

(deftest test-1740
  (testing "test case 1740"
    (is (= (stemming "corelate") "corel"))))

(deftest test-1741
  (testing "test case 1741"
    (is (= (stemming "quantimeter") "quantimet"))))

(deftest test-1742
  (testing "test case 1742"
    (is (= (stemming "unmown") "unmown"))))

(deftest test-1743
  (testing "test case 1743"
    (is (= (stemming "misalliance") "misalli"))))

(deftest test-1744
  (testing "test case 1744"
    (is (= (stemming "dawdling") "dawdl"))))

(deftest test-1745
  (testing "test case 1745"
    (is (= (stemming "clags") "clag"))))

(deftest test-1746
  (testing "test case 1746"
    (is (= (stemming "hymnist") "hymnist"))))

(deftest test-1747
  (testing "test case 1747"
    (is (= (stemming "regicidal") "regicid"))))

(deftest test-1748
  (testing "test case 1748"
    (is (= (stemming "dragonflies") "dragonfli"))))

(deftest test-1749
  (testing "test case 1749"
    (is (= (stemming "usefulness") "us"))))

(deftest test-1750
  (testing "test case 1750"
    (is (= (stemming "goals") "goal"))))

(deftest test-1751
  (testing "test case 1751"
    (is (= (stemming "splats") "splat"))))

(deftest test-1752
  (testing "test case 1752"
    (is (= (stemming "singled") "singl"))))

(deftest test-1753
  (testing "test case 1753"
    (is (= (stemming "overloads") "overload"))))

(deftest test-1754
  (testing "test case 1754"
    (is (= (stemming "fitnesses") "fit"))))

(deftest test-1755
  (testing "test case 1755"
    (is (= (stemming "jag") "jag"))))

(deftest test-1756
  (testing "test case 1756"
    (is (= (stemming "benefactrix") "benefactrix"))))

(deftest test-1757
  (testing "test case 1757"
    (is (= (stemming "corrugations") "corrug"))))

(deftest test-1758
  (testing "test case 1758"
    (is (= (stemming "development") "develop"))))

(deftest test-1759
  (testing "test case 1759"
    (is (= (stemming "hellishly") "hellishli"))))

(deftest test-1760
  (testing "test case 1760"
    (is (= (stemming "encirclements") "encircl"))))

(deftest test-1761
  (testing "test case 1761"
    (is (= (stemming "picturesque") "picturesqu"))))

(deftest test-1762
  (testing "test case 1762"
    (is (= (stemming "displeased") "displeas"))))

(deftest test-1763
  (testing "test case 1763"
    (is (= (stemming "sneerer") "sneerer"))))

(deftest test-1764
  (testing "test case 1764"
    (is (= (stemming "meltdowns") "meltdown"))))

(deftest test-1765
  (testing "test case 1765"
    (is (= (stemming "storekeeper") "storekeep"))))

(deftest test-1766
  (testing "test case 1766"
    (is (= (stemming "celiac") "celiac"))))

(deftest test-1767
  (testing "test case 1767"
    (is (= (stemming "glassman") "glassman"))))

(deftest test-1768
  (testing "test case 1768"
    (is (= (stemming "typhoidal") "typhoid"))))

(deftest test-1769
  (testing "test case 1769"
    (is (= (stemming "washroom") "washroom"))))

(deftest test-1770
  (testing "test case 1770"
    (is (= (stemming "tyrannis") "tyranni"))))

(deftest test-1771
  (testing "test case 1771"
    (is (= (stemming "banquet") "banquet"))))

(deftest test-1772
  (testing "test case 1772"
    (is (= (stemming "perilous") "peril"))))

(deftest test-1773
  (testing "test case 1773"
    (is (= (stemming "overissue") "overissu"))))

(deftest test-1774
  (testing "test case 1774"
    (is (= (stemming "otiosity") "otios"))))

(deftest test-1775
  (testing "test case 1775"
    (is (= (stemming "jacinth") "jacinth"))))

(deftest test-1776
  (testing "test case 1776"
    (is (= (stemming "mignons") "mignon"))))

(deftest test-1777
  (testing "test case 1777"
    (is (= (stemming "knucklehead") "knucklehead"))))

(deftest test-1778
  (testing "test case 1778"
    (is (= (stemming "proprietresses") "proprietress"))))

(deftest test-1779
  (testing "test case 1779"
    (is (= (stemming "halcyon") "halcyon"))))

(deftest test-1780
  (testing "test case 1780"
    (is (= (stemming "victorian") "victorian"))))

(deftest test-1781
  (testing "test case 1781"
    (is (= (stemming "harmfulness") "harm"))))

(deftest test-1782
  (testing "test case 1782"
    (is (= (stemming "reasonable") "reason"))))

(deftest test-1783
  (testing "test case 1783"
    (is (= (stemming "avatars") "avatar"))))

(deftest test-1784
  (testing "test case 1784"
    (is (= (stemming "cursively") "cursiv"))))

(deftest test-1785
  (testing "test case 1785"
    (is (= (stemming "epiphytes") "epiphyt"))))

(deftest test-1786
  (testing "test case 1786"
    (is (= (stemming "eschalots") "eschalot"))))

(deftest test-1787
  (testing "test case 1787"
    (is (= (stemming "untroubled") "untroubl"))))

(deftest test-1788
  (testing "test case 1788"
    (is (= (stemming "asbestic") "asbest"))))

(deftest test-1789
  (testing "test case 1789"
    (is (= (stemming "unfamiliarly") "unfamiliarli"))))

(deftest test-1790
  (testing "test case 1790"
    (is (= (stemming "overthrows") "overthrow"))))

(deftest test-1791
  (testing "test case 1791"
    (is (= (stemming "reacceding") "reacced"))))

(deftest test-1792
  (testing "test case 1792"
    (is (= (stemming "paraquat") "paraquat"))))

(deftest test-1793
  (testing "test case 1793"
    (is (= (stemming "vocalizers") "vocal"))))

(deftest test-1794
  (testing "test case 1794"
    (is (= (stemming "hustler") "hustler"))))

(deftest test-1795
  (testing "test case 1795"
    (is (= (stemming "atomic") "atom"))))

(deftest test-1796
  (testing "test case 1796"
    (is (= (stemming "directional") "direct"))))

(deftest test-1797
  (testing "test case 1797"
    (is (= (stemming "backmost") "backmost"))))

(deftest test-1798
  (testing "test case 1798"
    (is (= (stemming "duelist") "duelist"))))

(deftest test-1799
  (testing "test case 1799"
    (is (= (stemming "nonsalable") "nonsal"))))

(deftest test-1800
  (testing "test case 1800"
    (is (= (stemming "unlimber") "unlimb"))))

(deftest test-1801
  (testing "test case 1801"
    (is (= (stemming "hobnobs") "hobnob"))))

(deftest test-1802
  (testing "test case 1802"
    (is (= (stemming "typescripts") "typescript"))))

(deftest test-1803
  (testing "test case 1803"
    (is (= (stemming "interdependent") "interdepend"))))

(deftest test-1804
  (testing "test case 1804"
    (is (= (stemming "balladeer") "ballad"))))

(deftest test-1805
  (testing "test case 1805"
    (is (= (stemming "gorses") "gors"))))

(deftest test-1806
  (testing "test case 1806"
    (is (= (stemming "succories") "succori"))))

(deftest test-1807
  (testing "test case 1807"
    (is (= (stemming "overreacts") "overreact"))))

(deftest test-1808
  (testing "test case 1808"
    (is (= (stemming "cub") "cub"))))

(deftest test-1809
  (testing "test case 1809"
    (is (= (stemming "spiff") "spiff"))))

(deftest test-1810
  (testing "test case 1810"
    (is (= (stemming "viably") "viabli"))))

(deftest test-1811
  (testing "test case 1811"
    (is (= (stemming "completely") "complet"))))

(deftest test-1812
  (testing "test case 1812"
    (is (= (stemming "ammeters") "ammet"))))

(deftest test-1813
  (testing "test case 1813"
    (is (= (stemming "rebaptize") "rebapt"))))

(deftest test-1814
  (testing "test case 1814"
    (is (= (stemming "iodizes") "iodiz"))))

(deftest test-1815
  (testing "test case 1815"
    (is (= (stemming "rhombs") "rhomb"))))

(deftest test-1816
  (testing "test case 1816"
    (is (= (stemming "exploitee") "exploite"))))

(deftest test-1817
  (testing "test case 1817"
    (is (= (stemming "guerrilla") "guerrilla"))))

(deftest test-1818
  (testing "test case 1818"
    (is (= (stemming "shoestring") "shoestr"))))

(deftest test-1819
  (testing "test case 1819"
    (is (= (stemming "quipus") "quipu"))))

(deftest test-1820
  (testing "test case 1820"
    (is (= (stemming "aboveboard") "aboveboard"))))

(deftest test-1821
  (testing "test case 1821"
    (is (= (stemming "packthread") "packthread"))))

(deftest test-1822
  (testing "test case 1822"
    (is (= (stemming "imps") "imp"))))

(deftest test-1823
  (testing "test case 1823"
    (is (= (stemming "ex") "ex"))))

(deftest test-1824
  (testing "test case 1824"
    (is (= (stemming "independent") "independ"))))

(deftest test-1825
  (testing "test case 1825"
    (is (= (stemming "boutonnieres") "boutonnier"))))

(deftest test-1826
  (testing "test case 1826"
    (is (= (stemming "curber") "curber"))))

(deftest test-1827
  (testing "test case 1827"
    (is (= (stemming "campfire") "campfir"))))

(deftest test-1828
  (testing "test case 1828"
    (is (= (stemming "gladiolus") "gladiolu"))))

(deftest test-1829
  (testing "test case 1829"
    (is (= (stemming "everblooming") "everbloom"))))

(deftest test-1830
  (testing "test case 1830"
    (is (= (stemming "takeovers") "takeov"))))

(deftest test-1831
  (testing "test case 1831"
    (is (= (stemming "carps") "carp"))))

(deftest test-1832
  (testing "test case 1832"
    (is (= (stemming "weened") "ween"))))

(deftest test-1833
  (testing "test case 1833"
    (is (= (stemming "vivisectionist") "vivisectionist"))))

(deftest test-1834
  (testing "test case 1834"
    (is (= (stemming "stopovers") "stopov"))))

(deftest test-1835
  (testing "test case 1835"
    (is (= (stemming "tripart") "tripart"))))

(deftest test-1836
  (testing "test case 1836"
    (is (= (stemming "hardcovers") "hardcov"))))

(deftest test-1837
  (testing "test case 1837"
    (is (= (stemming "ahoy") "ahoi"))))

(deftest test-1838
  (testing "test case 1838"
    (is (= (stemming "albania") "albania"))))

(deftest test-1839
  (testing "test case 1839"
    (is (= (stemming "autogyro") "autogyro"))))

(deftest test-1840
  (testing "test case 1840"
    (is (= (stemming "wharf") "wharf"))))

(deftest test-1841
  (testing "test case 1841"
    (is (= (stemming "amoeboid") "amoeboid"))))

(deftest test-1842
  (testing "test case 1842"
    (is (= (stemming "physis") "physi"))))

(deftest test-1843
  (testing "test case 1843"
    (is (= (stemming "odourful") "odour"))))

(deftest test-1844
  (testing "test case 1844"
    (is (= (stemming "feasible") "feasibl"))))

(deftest test-1845
  (testing "test case 1845"
    (is (= (stemming "desalinated") "desalin"))))

(deftest test-1846
  (testing "test case 1846"
    (is (= (stemming "instrumentally") "instrument"))))

(deftest test-1847
  (testing "test case 1847"
    (is (= (stemming "intertwinements") "intertwin"))))

(deftest test-1848
  (testing "test case 1848"
    (is (= (stemming "fads") "fad"))))

(deftest test-1849
  (testing "test case 1849"
    (is (= (stemming "pantheist") "pantheist"))))

(deftest test-1850
  (testing "test case 1850"
    (is (= (stemming "photojournalist") "photojournalist"))))

(deftest test-1851
  (testing "test case 1851"
    (is (= (stemming "eludes") "elud"))))

(deftest test-1852
  (testing "test case 1852"
    (is (= (stemming "subthreshold") "subthreshold"))))

(deftest test-1853
  (testing "test case 1853"
    (is (= (stemming "supinates") "supin"))))

(deftest test-1854
  (testing "test case 1854"
    (is (= (stemming "councilwomen") "councilwomen"))))

(deftest test-1855
  (testing "test case 1855"
    (is (= (stemming "wrastle") "wrastl"))))

(deftest test-1856
  (testing "test case 1856"
    (is (= (stemming "curriculums") "curriculum"))))

(deftest test-1857
  (testing "test case 1857"
    (is (= (stemming "sulfur") "sulfur"))))

(deftest test-1858
  (testing "test case 1858"
    (is (= (stemming "dupes") "dupe"))))

(deftest test-1859
  (testing "test case 1859"
    (is (= (stemming "wingers") "winger"))))

(deftest test-1860
  (testing "test case 1860"
    (is (= (stemming "netted") "net"))))

(deftest test-1861
  (testing "test case 1861"
    (is (= (stemming "entomologists") "entomologist"))))

(deftest test-1862
  (testing "test case 1862"
    (is (= (stemming "stripper") "stripper"))))

(deftest test-1863
  (testing "test case 1863"
    (is (= (stemming "multifactorial") "multifactori"))))

(deftest test-1864
  (testing "test case 1864"
    (is (= (stemming "foxes") "fox"))))

(deftest test-1865
  (testing "test case 1865"
    (is (= (stemming "lend") "lend"))))

(deftest test-1866
  (testing "test case 1866"
    (is (= (stemming "paunch") "paunch"))))

(deftest test-1867
  (testing "test case 1867"
    (is (= (stemming "harbor") "harbor"))))

(deftest test-1868
  (testing "test case 1868"
    (is (= (stemming "retrograding") "retrograd"))))

(deftest test-1869
  (testing "test case 1869"
    (is (= (stemming "wag") "wag"))))

(deftest test-1870
  (testing "test case 1870"
    (is (= (stemming "flaunty") "flaunti"))))

(deftest test-1871
  (testing "test case 1871"
    (is (= (stemming "emceed") "emce"))))

(deftest test-1872
  (testing "test case 1872"
    (is (= (stemming "benightedly") "benightedli"))))

(deftest test-1873
  (testing "test case 1873"
    (is (= (stemming "corrigible") "corrig"))))

(deftest test-1874
  (testing "test case 1874"
    (is (= (stemming "ingloriousness") "inglori"))))

(deftest test-1875
  (testing "test case 1875"
    (is (= (stemming "horribleness") "horribl"))))

(deftest test-1876
  (testing "test case 1876"
    (is (= (stemming "trades") "trade"))))

(deftest test-1877
  (testing "test case 1877"
    (is (= (stemming "gila") "gila"))))

(deftest test-1878
  (testing "test case 1878"
    (is (= (stemming "brashiest") "brashiest"))))

(deftest test-1879
  (testing "test case 1879"
    (is (= (stemming "comptroller") "comptrol"))))

(deftest test-1880
  (testing "test case 1880"
    (is (= (stemming "haitians") "haitian"))))

(deftest test-1881
  (testing "test case 1881"
    (is (= (stemming "foodservices") "foodservic"))))

(deftest test-1882
  (testing "test case 1882"
    (is (= (stemming "brackishness") "brackish"))))

(deftest test-1883
  (testing "test case 1883"
    (is (= (stemming "catastrophes") "catastroph"))))

(deftest test-1884
  (testing "test case 1884"
    (is (= (stemming "datary") "datari"))))

(deftest test-1885
  (testing "test case 1885"
    (is (= (stemming "humanities") "human"))))

(deftest test-1886
  (testing "test case 1886"
    (is (= (stemming "fragmented") "fragment"))))

(deftest test-1887
  (testing "test case 1887"
    (is (= (stemming "hounders") "hounder"))))

(deftest test-1888
  (testing "test case 1888"
    (is (= (stemming "narcs") "narc"))))

(deftest test-1889
  (testing "test case 1889"
    (is (= (stemming "restriction") "restrict"))))

(deftest test-1890
  (testing "test case 1890"
    (is (= (stemming "bloodstained") "bloodstain"))))

(deftest test-1891
  (testing "test case 1891"
    (is (= (stemming "lauras") "laura"))))

(deftest test-1892
  (testing "test case 1892"
    (is (= (stemming "thunderheads") "thunderhead"))))

(deftest test-1893
  (testing "test case 1893"
    (is (= (stemming "settling") "settl"))))

(deftest test-1894
  (testing "test case 1894"
    (is (= (stemming "limply") "limpli"))))

(deftest test-1895
  (testing "test case 1895"
    (is (= (stemming "cowling") "cowl"))))

(deftest test-1896
  (testing "test case 1896"
    (is (= (stemming "tardy") "tardi"))))

(deftest test-1897
  (testing "test case 1897"
    (is (= (stemming "gimbal") "gimbal"))))

(deftest test-1898
  (testing "test case 1898"
    (is (= (stemming "jalap") "jalap"))))

(deftest test-1899
  (testing "test case 1899"
    (is (= (stemming "isms") "ism"))))

(deftest test-1900
  (testing "test case 1900"
    (is (= (stemming "severally") "sever"))))

(deftest test-1901
  (testing "test case 1901"
    (is (= (stemming "hinges") "hing"))))

(deftest test-1902
  (testing "test case 1902"
    (is (= (stemming "diluent") "diluent"))))

(deftest test-1903
  (testing "test case 1903"
    (is (= (stemming "dualized") "dualiz"))))

(deftest test-1904
  (testing "test case 1904"
    (is (= (stemming "testiness") "testi"))))

(deftest test-1905
  (testing "test case 1905"
    (is (= (stemming "scabrously") "scabrous"))))

(deftest test-1906
  (testing "test case 1906"
    (is (= (stemming "coccyges") "coccyg"))))

(deftest test-1907
  (testing "test case 1907"
    (is (= (stemming "cuneate") "cuneat"))))

(deftest test-1908
  (testing "test case 1908"
    (is (= (stemming "executives") "execut"))))

(deftest test-1909
  (testing "test case 1909"
    (is (= (stemming "suspensive") "suspens"))))

(deftest test-1910
  (testing "test case 1910"
    (is (= (stemming "thronged") "throng"))))

(deftest test-1911
  (testing "test case 1911"
    (is (= (stemming "doorless") "doorless"))))

(deftest test-1912
  (testing "test case 1912"
    (is (= (stemming "rededicating") "reded"))))

(deftest test-1913
  (testing "test case 1913"
    (is (= (stemming "corker") "corker"))))

(deftest test-1914
  (testing "test case 1914"
    (is (= (stemming "kindredness") "kindred"))))

(deftest test-1915
  (testing "test case 1915"
    (is (= (stemming "autopsying") "autopsi"))))

(deftest test-1916
  (testing "test case 1916"
    (is (= (stemming "humorousness") "humor"))))

(deftest test-1917
  (testing "test case 1917"
    (is (= (stemming "shriveling") "shrivel"))))

(deftest test-1918
  (testing "test case 1918"
    (is (= (stemming "tends") "tend"))))

(deftest test-1919
  (testing "test case 1919"
    (is (= (stemming "birdies") "birdi"))))

(deftest test-1920
  (testing "test case 1920"
    (is (= (stemming "undersheriff") "undersheriff"))))

(deftest test-1921
  (testing "test case 1921"
    (is (= (stemming "livelong") "livelong"))))

(deftest test-1922
  (testing "test case 1922"
    (is (= (stemming "glyceryls") "glyceryl"))))

(deftest test-1923
  (testing "test case 1923"
    (is (= (stemming "federator") "feder"))))

(deftest test-1924
  (testing "test case 1924"
    (is (= (stemming "pensione") "pension"))))

(deftest test-1925
  (testing "test case 1925"
    (is (= (stemming "plaudit") "plaudit"))))

(deftest test-1926
  (testing "test case 1926"
    (is (= (stemming "jellybean") "jellybean"))))

(deftest test-1927
  (testing "test case 1927"
    (is (= (stemming "geomorphology") "geomorpholog"))))

(deftest test-1928
  (testing "test case 1928"
    (is (= (stemming "overworking") "overwork"))))

(deftest test-1929
  (testing "test case 1929"
    (is (= (stemming "accretes") "accret"))))

(deftest test-1930
  (testing "test case 1930"
    (is (= (stemming "outwork") "outwork"))))

(deftest test-1931
  (testing "test case 1931"
    (is (= (stemming "restatements") "restat"))))

(deftest test-1932
  (testing "test case 1932"
    (is (= (stemming "nonvenomous") "nonvenom"))))

(deftest test-1933
  (testing "test case 1933"
    (is (= (stemming "judged") "judg"))))

(deftest test-1934
  (testing "test case 1934"
    (is (= (stemming "calcine") "calcin"))))

(deftest test-1935
  (testing "test case 1935"
    (is (= (stemming "folia") "folia"))))

(deftest test-1936
  (testing "test case 1936"
    (is (= (stemming "arbored") "arbor"))))

(deftest test-1937
  (testing "test case 1937"
    (is (= (stemming "justifying") "justifi"))))

(deftest test-1938
  (testing "test case 1938"
    (is (= (stemming "breakpoints") "breakpoint"))))

(deftest test-1939
  (testing "test case 1939"
    (is (= (stemming "tinting") "tint"))))

(deftest test-1940
  (testing "test case 1940"
    (is (= (stemming "filamentary") "filamentari"))))

(deftest test-1941
  (testing "test case 1941"
    (is (= (stemming "sitzmark") "sitzmark"))))

(deftest test-1942
  (testing "test case 1942"
    (is (= (stemming "badmouth") "badmouth"))))

(deftest test-1943
  (testing "test case 1943"
    (is (= (stemming "depositions") "deposit"))))

(deftest test-1944
  (testing "test case 1944"
    (is (= (stemming "geld") "geld"))))

(deftest test-1945
  (testing "test case 1945"
    (is (= (stemming "roughhouse") "roughhous"))))

(deftest test-1946
  (testing "test case 1946"
    (is (= (stemming "manumission") "manumiss"))))

(deftest test-1947
  (testing "test case 1947"
    (is (= (stemming "putridity") "putrid"))))

(deftest test-1948
  (testing "test case 1948"
    (is (= (stemming "rickettsial") "rickettsi"))))

(deftest test-1949
  (testing "test case 1949"
    (is (= (stemming "reflexed") "reflex"))))

(deftest test-1950
  (testing "test case 1950"
    (is (= (stemming "pigged") "pig"))))

(deftest test-1951
  (testing "test case 1951"
    (is (= (stemming "thralls") "thrall"))))

(deftest test-1952
  (testing "test case 1952"
    (is (= (stemming "preemptive") "preemptiv"))))

(deftest test-1953
  (testing "test case 1953"
    (is (= (stemming "bedeviled") "bedevil"))))

(deftest test-1954
  (testing "test case 1954"
    (is (= (stemming "craftily") "craftili"))))

(deftest test-1955
  (testing "test case 1955"
    (is (= (stemming "enclosers") "enclos"))))

(deftest test-1956
  (testing "test case 1956"
    (is (= (stemming "telecaster") "telecast"))))

(deftest test-1957
  (testing "test case 1957"
    (is (= (stemming "inflammabilities") "inflamm"))))

(deftest test-1958
  (testing "test case 1958"
    (is (= (stemming "helicoids") "helicoid"))))

(deftest test-1959
  (testing "test case 1959"
    (is (= (stemming "adduce") "adduc"))))

(deftest test-1960
  (testing "test case 1960"
    (is (= (stemming "eon") "eon"))))

(deftest test-1961
  (testing "test case 1961"
    (is (= (stemming "knitwears") "knitwear"))))

(deftest test-1962
  (testing "test case 1962"
    (is (= (stemming "paunches") "paunch"))))

(deftest test-1963
  (testing "test case 1963"
    (is (= (stemming "composure") "composur"))))

(deftest test-1964
  (testing "test case 1964"
    (is (= (stemming "vaporously") "vapor"))))

(deftest test-1965
  (testing "test case 1965"
    (is (= (stemming "ennead") "ennead"))))

(deftest test-1966
  (testing "test case 1966"
    (is (= (stemming "peeked") "peek"))))

(deftest test-1967
  (testing "test case 1967"
    (is (= (stemming "not") "not"))))

(deftest test-1968
  (testing "test case 1968"
    (is (= (stemming "annealers") "anneal"))))

(deftest test-1969
  (testing "test case 1969"
    (is (= (stemming "unendurable") "unendur"))))

(deftest test-1970
  (testing "test case 1970"
    (is (= (stemming "donor") "donor"))))

(deftest test-1971
  (testing "test case 1971"
    (is (= (stemming "shuteye") "shutey"))))

(deftest test-1972
  (testing "test case 1972"
    (is (= (stemming "parcels") "parcel"))))

(deftest test-1973
  (testing "test case 1973"
    (is (= (stemming "ballpoints") "ballpoint"))))

(deftest test-1974
  (testing "test case 1974"
    (is (= (stemming "emeralds") "emerald"))))

(deftest test-1975
  (testing "test case 1975"
    (is (= (stemming "ejecting") "eject"))))

(deftest test-1976
  (testing "test case 1976"
    (is (= (stemming "orreries") "orreri"))))

(deftest test-1977
  (testing "test case 1977"
    (is (= (stemming "specific") "specif"))))

(deftest test-1978
  (testing "test case 1978"
    (is (= (stemming "marcs") "marc"))))

(deftest test-1979
  (testing "test case 1979"
    (is (= (stemming "ambitioned") "ambit"))))

(deftest test-1980
  (testing "test case 1980"
    (is (= (stemming "typographer") "typograph"))))

(deftest test-1981
  (testing "test case 1981"
    (is (= (stemming "despotism") "despot"))))

(deftest test-1982
  (testing "test case 1982"
    (is (= (stemming "papuan") "papuan"))))

(deftest test-1983
  (testing "test case 1983"
    (is (= (stemming "doggoned") "doggon"))))

(deftest test-1984
  (testing "test case 1984"
    (is (= (stemming "unauthentic") "unauthent"))))

(deftest test-1985
  (testing "test case 1985"
    (is (= (stemming "anticommunist") "anticommunist"))))

(deftest test-1986
  (testing "test case 1986"
    (is (= (stemming "daftness") "daft"))))

(deftest test-1987
  (testing "test case 1987"
    (is (= (stemming "moulds") "mould"))))

(deftest test-1988
  (testing "test case 1988"
    (is (= (stemming "sepulchral") "sepulchr"))))

(deftest test-1989
  (testing "test case 1989"
    (is (= (stemming "faming") "fame"))))

(deftest test-1990
  (testing "test case 1990"
    (is (= (stemming "minim") "minim"))))

(deftest test-1991
  (testing "test case 1991"
    (is (= (stemming "detectors") "detector"))))

(deftest test-1992
  (testing "test case 1992"
    (is (= (stemming "nonspeaking") "nonspeak"))))

(deftest test-1993
  (testing "test case 1993"
    (is (= (stemming "percale") "percal"))))

(deftest test-1994
  (testing "test case 1994"
    (is (= (stemming "milliliter") "millilit"))))

(deftest test-1995
  (testing "test case 1995"
    (is (= (stemming "chocolate") "chocol"))))

(deftest test-1996
  (testing "test case 1996"
    (is (= (stemming "sequestering") "sequest"))))

(deftest test-1997
  (testing "test case 1997"
    (is (= (stemming "maenads") "maenad"))))

(deftest test-1998
  (testing "test case 1998"
    (is (= (stemming "subway") "subwai"))))

(deftest test-1999
  (testing "test case 1999"
    (is (= (stemming "railway") "railwai"))))

(deftest test-2000
  (testing "test case 2000"
    (is (= (stemming "lancers") "lancer"))))

(deftest test-2001
  (testing "test case 2001"
    (is (= (stemming "commodious") "commodi"))))

(deftest test-2002
  (testing "test case 2002"
    (is (= (stemming "ensure") "ensur"))))

(deftest test-2003
  (testing "test case 2003"
    (is (= (stemming "bigamists") "bigamist"))))

(deftest test-2004
  (testing "test case 2004"
    (is (= (stemming "declining") "declin"))))

(deftest test-2005
  (testing "test case 2005"
    (is (= (stemming "laicisms") "laicism"))))

(deftest test-2006
  (testing "test case 2006"
    (is (= (stemming "appliers") "applier"))))

(deftest test-2007
  (testing "test case 2007"
    (is (= (stemming "runic") "runic"))))

(deftest test-2008
  (testing "test case 2008"
    (is (= (stemming "sagest") "sagest"))))

(deftest test-2009
  (testing "test case 2009"
    (is (= (stemming "zoomanias") "zoomania"))))

(deftest test-2010
  (testing "test case 2010"
    (is (= (stemming "tricked") "trick"))))

(deftest test-2011
  (testing "test case 2011"
    (is (= (stemming "furnished") "furnish"))))

(deftest test-2012
  (testing "test case 2012"
    (is (= (stemming "compatibility") "compat"))))

(deftest test-2013
  (testing "test case 2013"
    (is (= (stemming "epithets") "epithet"))))

(deftest test-2014
  (testing "test case 2014"
    (is (= (stemming "lordling") "lordl"))))

(deftest test-2015
  (testing "test case 2015"
    (is (= (stemming "audiological") "audiolog"))))

(deftest test-2016
  (testing "test case 2016"
    (is (= (stemming "cracksman") "cracksman"))))

(deftest test-2017
  (testing "test case 2017"
    (is (= (stemming "farthermost") "farthermost"))))

(deftest test-2018
  (testing "test case 2018"
    (is (= (stemming "fledge") "fledg"))))

(deftest test-2019
  (testing "test case 2019"
    (is (= (stemming "prevaricator") "prevar"))))

(deftest test-2020
  (testing "test case 2020"
    (is (= (stemming "owns") "own"))))

(deftest test-2021
  (testing "test case 2021"
    (is (= (stemming "ploying") "ploi"))))

(deftest test-2022
  (testing "test case 2022"
    (is (= (stemming "charros") "charro"))))

(deftest test-2023
  (testing "test case 2023"
    (is (= (stemming "overcharging") "overcharg"))))

(deftest test-2024
  (testing "test case 2024"
    (is (= (stemming "baalism") "baalism"))))

(deftest test-2025
  (testing "test case 2025"
    (is (= (stemming "brat") "brat"))))

(deftest test-2026
  (testing "test case 2026"
    (is (= (stemming "beaut") "beaut"))))

(deftest test-2027
  (testing "test case 2027"
    (is (= (stemming "pliancy") "plianci"))))

(deftest test-2028
  (testing "test case 2028"
    (is (= (stemming "congregates") "congreg"))))

(deftest test-2029
  (testing "test case 2029"
    (is (= (stemming "hexagons") "hexagon"))))

(deftest test-2030
  (testing "test case 2030"
    (is (= (stemming "poisons") "poison"))))

(deftest test-2031
  (testing "test case 2031"
    (is (= (stemming "looniness") "looni"))))

(deftest test-2032
  (testing "test case 2032"
    (is (= (stemming "ailurophobe") "ailurophob"))))

(deftest test-2033
  (testing "test case 2033"
    (is (= (stemming "rill") "rill"))))

(deftest test-2034
  (testing "test case 2034"
    (is (= (stemming "chatting") "chat"))))

(deftest test-2035
  (testing "test case 2035"
    (is (= (stemming "cuff") "cuff"))))

(deftest test-2036
  (testing "test case 2036"
    (is (= (stemming "airbus") "airbu"))))

(deftest test-2037
  (testing "test case 2037"
    (is (= (stemming "deleterious") "deleteri"))))

(deftest test-2038
  (testing "test case 2038"
    (is (= (stemming "bondages") "bondag"))))

(deftest test-2039
  (testing "test case 2039"
    (is (= (stemming "regraded") "regrad"))))

(deftest test-2040
  (testing "test case 2040"
    (is (= (stemming "nestles") "nestl"))))

(deftest test-2041
  (testing "test case 2041"
    (is (= (stemming "pullouts") "pullout"))))

(deftest test-2042
  (testing "test case 2042"
    (is (= (stemming "entailment") "entail"))))

(deftest test-2043
  (testing "test case 2043"
    (is (= (stemming "lever") "lever"))))

(deftest test-2044
  (testing "test case 2044"
    (is (= (stemming "coward") "coward"))))

(deftest test-2045
  (testing "test case 2045"
    (is (= (stemming "phosgenes") "phosgen"))))

(deftest test-2046
  (testing "test case 2046"
    (is (= (stemming "butchering") "butcher"))))

(deftest test-2047
  (testing "test case 2047"
    (is (= (stemming "subhumans") "subhuman"))))

(deftest test-2048
  (testing "test case 2048"
    (is (= (stemming "misbehaved") "misbehav"))))

(deftest test-2049
  (testing "test case 2049"
    (is (= (stemming "manures") "manur"))))

(deftest test-2050
  (testing "test case 2050"
    (is (= (stemming "blintzes") "blintz"))))

(deftest test-2051
  (testing "test case 2051"
    (is (= (stemming "housemen") "housemen"))))

(deftest test-2052
  (testing "test case 2052"
    (is (= (stemming "auscultating") "auscult"))))

(deftest test-2053
  (testing "test case 2053"
    (is (= (stemming "unseen") "unseen"))))

(deftest test-2054
  (testing "test case 2054"
    (is (= (stemming "handgrips") "handgrip"))))

(deftest test-2055
  (testing "test case 2055"
    (is (= (stemming "upswung") "upswung"))))

(deftest test-2056
  (testing "test case 2056"
    (is (= (stemming "conclusiveness") "conclus"))))

(deftest test-2057
  (testing "test case 2057"
    (is (= (stemming "cylindrically") "cylindr"))))

(deftest test-2058
  (testing "test case 2058"
    (is (= (stemming "tangle") "tangl"))))

(deftest test-2059
  (testing "test case 2059"
    (is (= (stemming "forerunners") "forerunn"))))

(deftest test-2060
  (testing "test case 2060"
    (is (= (stemming "trussers") "trusser"))))

(deftest test-2061
  (testing "test case 2061"
    (is (= (stemming "heartsickness") "heartsick"))))

(deftest test-2062
  (testing "test case 2062"
    (is (= (stemming "disgracing") "disgrac"))))

(deftest test-2063
  (testing "test case 2063"
    (is (= (stemming "earlobes") "earlob"))))

(deftest test-2064
  (testing "test case 2064"
    (is (= (stemming "disciplines") "disciplin"))))

(deftest test-2065
  (testing "test case 2065"
    (is (= (stemming "abashedly") "abashedli"))))

(deftest test-2066
  (testing "test case 2066"
    (is (= (stemming "helpless") "helpless"))))

(deftest test-2067
  (testing "test case 2067"
    (is (= (stemming "pneuma") "pneuma"))))

(deftest test-2068
  (testing "test case 2068"
    (is (= (stemming "flockiest") "flockiest"))))

(deftest test-2069
  (testing "test case 2069"
    (is (= (stemming "concatenated") "concaten"))))

(deftest test-2070
  (testing "test case 2070"
    (is (= (stemming "probations") "probat"))))

(deftest test-2071
  (testing "test case 2071"
    (is (= (stemming "mellow") "mellow"))))

(deftest test-2072
  (testing "test case 2072"
    (is (= (stemming "unbudging") "unbudg"))))

(deftest test-2073
  (testing "test case 2073"
    (is (= (stemming "recapped") "recap"))))

(deftest test-2074
  (testing "test case 2074"
    (is (= (stemming "anciently") "ancient"))))

(deftest test-2075
  (testing "test case 2075"
    (is (= (stemming "pack") "pack"))))

(deftest test-2076
  (testing "test case 2076"
    (is (= (stemming "kickoff") "kickoff"))))

(deftest test-2077
  (testing "test case 2077"
    (is (= (stemming "anecdotal") "anecdot"))))

(deftest test-2078
  (testing "test case 2078"
    (is (= (stemming "samaritans") "samaritan"))))

(deftest test-2079
  (testing "test case 2079"
    (is (= (stemming "skeletons") "skeleton"))))

(deftest test-2080
  (testing "test case 2080"
    (is (= (stemming "megahertz") "megahertz"))))

(deftest test-2081
  (testing "test case 2081"
    (is (= (stemming "masturbate") "masturb"))))

(deftest test-2082
  (testing "test case 2082"
    (is (= (stemming "quackeries") "quackeri"))))

(deftest test-2083
  (testing "test case 2083"
    (is (= (stemming "joshes") "josh"))))

(deftest test-2084
  (testing "test case 2084"
    (is (= (stemming "sharecrop") "sharecrop"))))

(deftest test-2085
  (testing "test case 2085"
    (is (= (stemming "crestfallen") "crestfallen"))))

(deftest test-2086
  (testing "test case 2086"
    (is (= (stemming "woeness") "woeness"))))

(deftest test-2087
  (testing "test case 2087"
    (is (= (stemming "laserjet") "laserjet"))))

(deftest test-2088
  (testing "test case 2088"
    (is (= (stemming "restaurant") "restaur"))))

(deftest test-2089
  (testing "test case 2089"
    (is (= (stemming "niobium") "niobium"))))

(deftest test-2090
  (testing "test case 2090"
    (is (= (stemming "containing") "contain"))))

(deftest test-2091
  (testing "test case 2091"
    (is (= (stemming "honoraries") "honorari"))))

(deftest test-2092
  (testing "test case 2092"
    (is (= (stemming "malconstruction") "malconstruct"))))

(deftest test-2093
  (testing "test case 2093"
    (is (= (stemming "sublicenses") "sublicens"))))

(deftest test-2094
  (testing "test case 2094"
    (is (= (stemming "byzantium") "byzantium"))))

(deftest test-2095
  (testing "test case 2095"
    (is (= (stemming "sabered") "saber"))))

(deftest test-2096
  (testing "test case 2096"
    (is (= (stemming "naturals") "natur"))))

(deftest test-2097
  (testing "test case 2097"
    (is (= (stemming "anticommunists") "anticommunist"))))

(deftest test-2098
  (testing "test case 2098"
    (is (= (stemming "circumnavigating") "circumnavig"))))

(deftest test-2099
  (testing "test case 2099"
    (is (= (stemming "plucker") "plucker"))))

(deftest test-2100
  (testing "test case 2100"
    (is (= (stemming "frighted") "fright"))))

(deftest test-2101
  (testing "test case 2101"
    (is (= (stemming "pretexts") "pretext"))))

(deftest test-2102
  (testing "test case 2102"
    (is (= (stemming "highlighted") "highlight"))))

(deftest test-2103
  (testing "test case 2103"
    (is (= (stemming "brothel") "brothel"))))

(deftest test-2104
  (testing "test case 2104"
    (is (= (stemming "incongruent") "incongru"))))

(deftest test-2105
  (testing "test case 2105"
    (is (= (stemming "trains") "train"))))

(deftest test-2106
  (testing "test case 2106"
    (is (= (stemming "cosy") "cosi"))))

(deftest test-2107
  (testing "test case 2107"
    (is (= (stemming "incurrable") "incurr"))))

(deftest test-2108
  (testing "test case 2108"
    (is (= (stemming "guzzle") "guzzl"))))

(deftest test-2109
  (testing "test case 2109"
    (is (= (stemming "kitten") "kitten"))))

(deftest test-2110
  (testing "test case 2110"
    (is (= (stemming "despise") "despis"))))

(deftest test-2111
  (testing "test case 2111"
    (is (= (stemming "sophisticates") "sophist"))))

(deftest test-2112
  (testing "test case 2112"
    (is (= (stemming "vividness") "vivid"))))

(deftest test-2113
  (testing "test case 2113"
    (is (= (stemming "mollification") "mollif"))))

(deftest test-2114
  (testing "test case 2114"
    (is (= (stemming "proposed") "propos"))))

(deftest test-2115
  (testing "test case 2115"
    (is (= (stemming "choreographically") "choreograph"))))

(deftest test-2116
  (testing "test case 2116"
    (is (= (stemming "affaire") "affair"))))

(deftest test-2117
  (testing "test case 2117"
    (is (= (stemming "maw") "maw"))))

(deftest test-2118
  (testing "test case 2118"
    (is (= (stemming "disparate") "dispar"))))

(deftest test-2119
  (testing "test case 2119"
    (is (= (stemming "orangish") "orangish"))))

(deftest test-2120
  (testing "test case 2120"
    (is (= (stemming "whelm") "whelm"))))

(deftest test-2121
  (testing "test case 2121"
    (is (= (stemming "watercolor") "watercolor"))))

(deftest test-2122
  (testing "test case 2122"
    (is (= (stemming "dreamy") "dreami"))))

(deftest test-2123
  (testing "test case 2123"
    (is (= (stemming "elm") "elm"))))

(deftest test-2124
  (testing "test case 2124"
    (is (= (stemming "capsizing") "capsiz"))))

(deftest test-2125
  (testing "test case 2125"
    (is (= (stemming "export") "export"))))

(deftest test-2126
  (testing "test case 2126"
    (is (= (stemming "anuses") "anus"))))

(deftest test-2127
  (testing "test case 2127"
    (is (= (stemming "moose") "moos"))))

(deftest test-2128
  (testing "test case 2128"
    (is (= (stemming "grounder") "grounder"))))

(deftest test-2129
  (testing "test case 2129"
    (is (= (stemming "letterers") "letter"))))

(deftest test-2130
  (testing "test case 2130"
    (is (= (stemming "stylist") "stylist"))))

(deftest test-2131
  (testing "test case 2131"
    (is (= (stemming "regains") "regain"))))

(deftest test-2132
  (testing "test case 2132"
    (is (= (stemming "inattention") "inattent"))))

(deftest test-2133
  (testing "test case 2133"
    (is (= (stemming "vector") "vector"))))

(deftest test-2134
  (testing "test case 2134"
    (is (= (stemming "moussaka") "moussaka"))))

(deftest test-2135
  (testing "test case 2135"
    (is (= (stemming "euphonious") "euphoni"))))

(deftest test-2136
  (testing "test case 2136"
    (is (= (stemming "tottering") "totter"))))

(deftest test-2137
  (testing "test case 2137"
    (is (= (stemming "craals") "craal"))))

(deftest test-2138
  (testing "test case 2138"
    (is (= (stemming "beanies") "beani"))))

(deftest test-2139
  (testing "test case 2139"
    (is (= (stemming "contrary") "contrari"))))

(deftest test-2140
  (testing "test case 2140"
    (is (= (stemming "chauffeur") "chauffeur"))))

(deftest test-2141
  (testing "test case 2141"
    (is (= (stemming "urbanized") "urban"))))

(deftest test-2142
  (testing "test case 2142"
    (is (= (stemming "crusader") "crusad"))))

(deftest test-2143
  (testing "test case 2143"
    (is (= (stemming "seraglios") "seraglio"))))

(deftest test-2144
  (testing "test case 2144"
    (is (= (stemming "gloating") "gloat"))))

(deftest test-2145
  (testing "test case 2145"
    (is (= (stemming "demonstrated") "demonstr"))))

(deftest test-2146
  (testing "test case 2146"
    (is (= (stemming "plagiarizers") "plagiar"))))

(deftest test-2147
  (testing "test case 2147"
    (is (= (stemming "slatted") "slat"))))

(deftest test-2148
  (testing "test case 2148"
    (is (= (stemming "misguiders") "misguid"))))

(deftest test-2149
  (testing "test case 2149"
    (is (= (stemming "indeterminate") "indetermin"))))

(deftest test-2150
  (testing "test case 2150"
    (is (= (stemming "conceptive") "concept"))))

(deftest test-2151
  (testing "test case 2151"
    (is (= (stemming "enzymologist") "enzymologist"))))

(deftest test-2152
  (testing "test case 2152"
    (is (= (stemming "punish") "punish"))))

(deftest test-2153
  (testing "test case 2153"
    (is (= (stemming "tatterdemalions") "tatterdemalion"))))

(deftest test-2154
  (testing "test case 2154"
    (is (= (stemming "motoric") "motor"))))

(deftest test-2155
  (testing "test case 2155"
    (is (= (stemming "totters") "totter"))))

(deftest test-2156
  (testing "test case 2156"
    (is (= (stemming "muttonchops") "muttonchop"))))

(deftest test-2157
  (testing "test case 2157"
    (is (= (stemming "vitals") "vital"))))

(deftest test-2158
  (testing "test case 2158"
    (is (= (stemming "disjoin") "disjoin"))))

(deftest test-2159
  (testing "test case 2159"
    (is (= (stemming "stovepipes") "stovepip"))))

(deftest test-2160
  (testing "test case 2160"
    (is (= (stemming "hispanic") "hispan"))))

(deftest test-2161
  (testing "test case 2161"
    (is (= (stemming "commandeering") "command"))))

(deftest test-2162
  (testing "test case 2162"
    (is (= (stemming "seaborne") "seaborn"))))

(deftest test-2163
  (testing "test case 2163"
    (is (= (stemming "picarooned") "picaroon"))))

(deftest test-2164
  (testing "test case 2164"
    (is (= (stemming "regionalism") "region"))))

(deftest test-2165
  (testing "test case 2165"
    (is (= (stemming "iranians") "iranian"))))

(deftest test-2166
  (testing "test case 2166"
    (is (= (stemming "jousters") "jouster"))))

(deftest test-2167
  (testing "test case 2167"
    (is (= (stemming "dresser") "dresser"))))

(deftest test-2168
  (testing "test case 2168"
    (is (= (stemming "silhouettes") "silhouett"))))

(deftest test-2169
  (testing "test case 2169"
    (is (= (stemming "smilax") "smilax"))))

(deftest test-2170
  (testing "test case 2170"
    (is (= (stemming "comprehension") "comprehens"))))

(deftest test-2171
  (testing "test case 2171"
    (is (= (stemming "jurisdictionally") "jurisdiction"))))

(deftest test-2172
  (testing "test case 2172"
    (is (= (stemming "colloquialism") "colloqui"))))

(deftest test-2173
  (testing "test case 2173"
    (is (= (stemming "holes") "hole"))))

(deftest test-2174
  (testing "test case 2174"
    (is (= (stemming "supercargos") "supercargo"))))

(deftest test-2175
  (testing "test case 2175"
    (is (= (stemming "files") "file"))))

(deftest test-2176
  (testing "test case 2176"
    (is (= (stemming "hun") "hun"))))

(deftest test-2177
  (testing "test case 2177"
    (is (= (stemming "orderlies") "orderli"))))

(deftest test-2178
  (testing "test case 2178"
    (is (= (stemming "quarrelsome") "quarrelsom"))))

(deftest test-2179
  (testing "test case 2179"
    (is (= (stemming "reconsignment") "reconsign"))))

(deftest test-2180
  (testing "test case 2180"
    (is (= (stemming "picasso") "picasso"))))

(deftest test-2181
  (testing "test case 2181"
    (is (= (stemming "nibbed") "nib"))))

(deftest test-2182
  (testing "test case 2182"
    (is (= (stemming "pongee") "ponge"))))

(deftest test-2183
  (testing "test case 2183"
    (is (= (stemming "reflexively") "reflex"))))

(deftest test-2184
  (testing "test case 2184"
    (is (= (stemming "cassiterite") "cassiterit"))))

(deftest test-2185
  (testing "test case 2185"
    (is (= (stemming "giveable") "giveabl"))))

(deftest test-2186
  (testing "test case 2186"
    (is (= (stemming "already") "alreadi"))))

(deftest test-2187
  (testing "test case 2187"
    (is (= (stemming "brutify") "brutifi"))))

(deftest test-2188
  (testing "test case 2188"
    (is (= (stemming "rewriting") "rewrit"))))

(deftest test-2189
  (testing "test case 2189"
    (is (= (stemming "corpulences") "corpul"))))

(deftest test-2190
  (testing "test case 2190"
    (is (= (stemming "primitives") "primit"))))

(deftest test-2191
  (testing "test case 2191"
    (is (= (stemming "recasts") "recast"))))

(deftest test-2192
  (testing "test case 2192"
    (is (= (stemming "methanols") "methanol"))))

(deftest test-2193
  (testing "test case 2193"
    (is (= (stemming "summarization") "summar"))))

(deftest test-2194
  (testing "test case 2194"
    (is (= (stemming "cursed") "curs"))))

(deftest test-2195
  (testing "test case 2195"
    (is (= (stemming "outfielder") "outfield"))))

(deftest test-2196
  (testing "test case 2196"
    (is (= (stemming "snowflake") "snowflak"))))

(deftest test-2197
  (testing "test case 2197"
    (is (= (stemming "plasms") "plasm"))))

(deftest test-2198
  (testing "test case 2198"
    (is (= (stemming "unification") "unif"))))

(deftest test-2199
  (testing "test case 2199"
    (is (= (stemming "interdependence") "interdepend"))))

(deftest test-2200
  (testing "test case 2200"
    (is (= (stemming "cashoos") "cashoo"))))

(deftest test-2201
  (testing "test case 2201"
    (is (= (stemming "tusks") "tusk"))))

(deftest test-2202
  (testing "test case 2202"
    (is (= (stemming "tunnellers") "tunnel"))))

(deftest test-2203
  (testing "test case 2203"
    (is (= (stemming "compromising") "compromis"))))

(deftest test-2204
  (testing "test case 2204"
    (is (= (stemming "fugued") "fugu"))))

(deftest test-2205
  (testing "test case 2205"
    (is (= (stemming "chasing") "chase"))))

(deftest test-2206
  (testing "test case 2206"
    (is (= (stemming "wining") "wine"))))

(deftest test-2207
  (testing "test case 2207"
    (is (= (stemming "readdressing") "readdress"))))

(deftest test-2208
  (testing "test case 2208"
    (is (= (stemming "slurries") "slurri"))))

(deftest test-2209
  (testing "test case 2209"
    (is (= (stemming "waylaying") "waylai"))))

(deftest test-2210
  (testing "test case 2210"
    (is (= (stemming "barman") "barman"))))

(deftest test-2211
  (testing "test case 2211"
    (is (= (stemming "bagsful") "bags"))))

(deftest test-2212
  (testing "test case 2212"
    (is (= (stemming "yammers") "yammer"))))

(deftest test-2213
  (testing "test case 2213"
    (is (= (stemming "mountaineered") "mountain"))))

(deftest test-2214
  (testing "test case 2214"
    (is (= (stemming "francisco") "francisco"))))

(deftest test-2215
  (testing "test case 2215"
    (is (= (stemming "communicants") "communic"))))

(deftest test-2216
  (testing "test case 2216"
    (is (= (stemming "bombay") "bombai"))))

(deftest test-2217
  (testing "test case 2217"
    (is (= (stemming "greasier") "greasier"))))

(deftest test-2218
  (testing "test case 2218"
    (is (= (stemming "sentimentally") "sentiment"))))

(deftest test-2219
  (testing "test case 2219"
    (is (= (stemming "defective") "defect"))))

(deftest test-2220
  (testing "test case 2220"
    (is (= (stemming "countervailed") "countervail"))))

(deftest test-2221
  (testing "test case 2221"
    (is (= (stemming "rethreading") "rethread"))))

(deftest test-2222
  (testing "test case 2222"
    (is (= (stemming "truckdriver") "truckdriv"))))

(deftest test-2223
  (testing "test case 2223"
    (is (= (stemming "bobble") "bobbl"))))

(deftest test-2224
  (testing "test case 2224"
    (is (= (stemming "snugger") "snugger"))))

(deftest test-2225
  (testing "test case 2225"
    (is (= (stemming "capacitive") "capacit"))))

(deftest test-2226
  (testing "test case 2226"
    (is (= (stemming "woefulness") "woeful"))))

(deftest test-2227
  (testing "test case 2227"
    (is (= (stemming "unalienable") "unalien"))))

(deftest test-2228
  (testing "test case 2228"
    (is (= (stemming "seventieths") "seventieth"))))

(deftest test-2229
  (testing "test case 2229"
    (is (= (stemming "nuncle") "nuncl"))))

(deftest test-2230
  (testing "test case 2230"
    (is (= (stemming "idol") "idol"))))

(deftest test-2231
  (testing "test case 2231"
    (is (= (stemming "rearrangement") "rearrang"))))

(deftest test-2232
  (testing "test case 2232"
    (is (= (stemming "reruns") "rerun"))))

(deftest test-2233
  (testing "test case 2233"
    (is (= (stemming "moistureless") "moistureless"))))

(deftest test-2234
  (testing "test case 2234"
    (is (= (stemming "clabber") "clabber"))))

(deftest test-2235
  (testing "test case 2235"
    (is (= (stemming "repetitious") "repetiti"))))

(deftest test-2236
  (testing "test case 2236"
    (is (= (stemming "desultory") "desultori"))))

(deftest test-2237
  (testing "test case 2237"
    (is (= (stemming "bedlams") "bedlam"))))

(deftest test-2238
  (testing "test case 2238"
    (is (= (stemming "zealousness") "zealous"))))

(deftest test-2239
  (testing "test case 2239"
    (is (= (stemming "amalgamation") "amalgam"))))

(deftest test-2240
  (testing "test case 2240"
    (is (= (stemming "overexposure") "overexposur"))))

(deftest test-2241
  (testing "test case 2241"
    (is (= (stemming "ripens") "ripen"))))

(deftest test-2242
  (testing "test case 2242"
    (is (= (stemming "kismet") "kismet"))))

(deftest test-2243
  (testing "test case 2243"
    (is (= (stemming "enframing") "enfram"))))

(deftest test-2244
  (testing "test case 2244"
    (is (= (stemming "spake") "spake"))))

(deftest test-2245
  (testing "test case 2245"
    (is (= (stemming "somnambulation") "somnambul"))))

(deftest test-2246
  (testing "test case 2246"
    (is (= (stemming "chippewas") "chippewa"))))

(deftest test-2247
  (testing "test case 2247"
    (is (= (stemming "shamefully") "shamefulli"))))

(deftest test-2248
  (testing "test case 2248"
    (is (= (stemming "aphrodisiacs") "aphrodisiac"))))

(deftest test-2249
  (testing "test case 2249"
    (is (= (stemming "boohoo") "boohoo"))))

(deftest test-2250
  (testing "test case 2250"
    (is (= (stemming "waviest") "waviest"))))

(deftest test-2251
  (testing "test case 2251"
    (is (= (stemming "effervescent") "effervesc"))))

(deftest test-2252
  (testing "test case 2252"
    (is (= (stemming "corruptible") "corrupt"))))

(deftest test-2253
  (testing "test case 2253"
    (is (= (stemming "retaliate") "retali"))))

(deftest test-2254
  (testing "test case 2254"
    (is (= (stemming "effendi") "effendi"))))

(deftest test-2255
  (testing "test case 2255"
    (is (= (stemming "artefact") "artefact"))))

(deftest test-2256
  (testing "test case 2256"
    (is (= (stemming "whirler") "whirler"))))

(deftest test-2257
  (testing "test case 2257"
    (is (= (stemming "cannibalizes") "cannib"))))

(deftest test-2258
  (testing "test case 2258"
    (is (= (stemming "jeers") "jeer"))))

(deftest test-2259
  (testing "test case 2259"
    (is (= (stemming "gunman") "gunman"))))

(deftest test-2260
  (testing "test case 2260"
    (is (= (stemming "untouchable") "untouch"))))

(deftest test-2261
  (testing "test case 2261"
    (is (= (stemming "woody") "woodi"))))

(deftest test-2262
  (testing "test case 2262"
    (is (= (stemming "doorplates") "doorplat"))))

(deftest test-2263
  (testing "test case 2263"
    (is (= (stemming "bisque") "bisqu"))))

(deftest test-2264
  (testing "test case 2264"
    (is (= (stemming "reconstructing") "reconstruct"))))

(deftest test-2265
  (testing "test case 2265"
    (is (= (stemming "monosyllabic") "monosyllab"))))

(deftest test-2266
  (testing "test case 2266"
    (is (= (stemming "rectories") "rectori"))))

(deftest test-2267
  (testing "test case 2267"
    (is (= (stemming "substrate") "substrat"))))

(deftest test-2268
  (testing "test case 2268"
    (is (= (stemming "glassiness") "glassi"))))

(deftest test-2269
  (testing "test case 2269"
    (is (= (stemming "covalences") "coval"))))

(deftest test-2270
  (testing "test case 2270"
    (is (= (stemming "vernaculars") "vernacular"))))

(deftest test-2271
  (testing "test case 2271"
    (is (= (stemming "stagehands") "stagehand"))))

(deftest test-2272
  (testing "test case 2272"
    (is (= (stemming "hospice") "hospic"))))

(deftest test-2273
  (testing "test case 2273"
    (is (= (stemming "eaters") "eater"))))

(deftest test-2274
  (testing "test case 2274"
    (is (= (stemming "healthful") "health"))))

(deftest test-2275
  (testing "test case 2275"
    (is (= (stemming "abide") "abid"))))

(deftest test-2276
  (testing "test case 2276"
    (is (= (stemming "request") "request"))))

(deftest test-2277
  (testing "test case 2277"
    (is (= (stemming "strikeout") "strikeout"))))

(deftest test-2278
  (testing "test case 2278"
    (is (= (stemming "success") "success"))))

(deftest test-2279
  (testing "test case 2279"
    (is (= (stemming "grouchiest") "grouchiest"))))

(deftest test-2280
  (testing "test case 2280"
    (is (= (stemming "homonymies") "homonymi"))))

(deftest test-2281
  (testing "test case 2281"
    (is (= (stemming "expounders") "expound"))))

(deftest test-2282
  (testing "test case 2282"
    (is (= (stemming "sunshine") "sunshin"))))

(deftest test-2283
  (testing "test case 2283"
    (is (= (stemming "ascribing") "ascrib"))))

(deftest test-2284
  (testing "test case 2284"
    (is (= (stemming "ordainment") "ordain"))))

(deftest test-2285
  (testing "test case 2285"
    (is (= (stemming "hep") "hep"))))

(deftest test-2286
  (testing "test case 2286"
    (is (= (stemming "subdividable") "subdivid"))))

(deftest test-2287
  (testing "test case 2287"
    (is (= (stemming "jackanapes") "jackanap"))))

(deftest test-2288
  (testing "test case 2288"
    (is (= (stemming "gammas") "gamma"))))

(deftest test-2289
  (testing "test case 2289"
    (is (= (stemming "skinheads") "skinhead"))))

(deftest test-2290
  (testing "test case 2290"
    (is (= (stemming "damages") "damag"))))

(deftest test-2291
  (testing "test case 2291"
    (is (= (stemming "hardest") "hardest"))))

(deftest test-2292
  (testing "test case 2292"
    (is (= (stemming "persuade") "persuad"))))

(deftest test-2293
  (testing "test case 2293"
    (is (= (stemming "unsolved") "unsolv"))))

(deftest test-2294
  (testing "test case 2294"
    (is (= (stemming "coddler") "coddler"))))

(deftest test-2295
  (testing "test case 2295"
    (is (= (stemming "wigs") "wig"))))

(deftest test-2296
  (testing "test case 2296"
    (is (= (stemming "bouffants") "bouffant"))))

(deftest test-2297
  (testing "test case 2297"
    (is (= (stemming "lightest") "lightest"))))

(deftest test-2298
  (testing "test case 2298"
    (is (= (stemming "centripetally") "centripet"))))

(deftest test-2299
  (testing "test case 2299"
    (is (= (stemming "sourdoughs") "sourdough"))))

(deftest test-2300
  (testing "test case 2300"
    (is (= (stemming "undergoing") "undergo"))))

(deftest test-2301
  (testing "test case 2301"
    (is (= (stemming "russety") "russeti"))))

(deftest test-2302
  (testing "test case 2302"
    (is (= (stemming "stella") "stella"))))

(deftest test-2303
  (testing "test case 2303"
    (is (= (stemming "hadjes") "hadj"))))

(deftest test-2304
  (testing "test case 2304"
    (is (= (stemming "seismologist") "seismologist"))))

(deftest test-2305
  (testing "test case 2305"
    (is (= (stemming "coverages") "coverag"))))

(deftest test-2306
  (testing "test case 2306"
    (is (= (stemming "workmanlike") "workmanlik"))))

(deftest test-2307
  (testing "test case 2307"
    (is (= (stemming "spectrographic") "spectrograph"))))

(deftest test-2308
  (testing "test case 2308"
    (is (= (stemming "baht") "baht"))))

(deftest test-2309
  (testing "test case 2309"
    (is (= (stemming "cheeps") "cheep"))))

(deftest test-2310
  (testing "test case 2310"
    (is (= (stemming "masticate") "mastic"))))

(deftest test-2311
  (testing "test case 2311"
    (is (= (stemming "yules") "yule"))))

(deftest test-2312
  (testing "test case 2312"
    (is (= (stemming "elicit") "elicit"))))

(deftest test-2313
  (testing "test case 2313"
    (is (= (stemming "residue") "residu"))))

(deftest test-2314
  (testing "test case 2314"
    (is (= (stemming "hagiography") "hagiographi"))))

(deftest test-2315
  (testing "test case 2315"
    (is (= (stemming "moneybags") "moneybag"))))

(deftest test-2316
  (testing "test case 2316"
    (is (= (stemming "doctrine") "doctrin"))))

(deftest test-2317
  (testing "test case 2317"
    (is (= (stemming "solariums") "solarium"))))

(deftest test-2318
  (testing "test case 2318"
    (is (= (stemming "ripplers") "rippler"))))

(deftest test-2319
  (testing "test case 2319"
    (is (= (stemming "cockscomb") "cockscomb"))))

(deftest test-2320
  (testing "test case 2320"
    (is (= (stemming "lavation") "lavat"))))

(deftest test-2321
  (testing "test case 2321"
    (is (= (stemming "nihilistic") "nihilist"))))

(deftest test-2322
  (testing "test case 2322"
    (is (= (stemming "scarlets") "scarlet"))))

(deftest test-2323
  (testing "test case 2323"
    (is (= (stemming "empaneling") "empanel"))))

(deftest test-2324
  (testing "test case 2324"
    (is (= (stemming "elate") "elat"))))

(deftest test-2325
  (testing "test case 2325"
    (is (= (stemming "aliments") "aliment"))))

(deftest test-2326
  (testing "test case 2326"
    (is (= (stemming "busting") "bust"))))

(deftest test-2327
  (testing "test case 2327"
    (is (= (stemming "foreshadower") "foreshadow"))))

(deftest test-2328
  (testing "test case 2328"
    (is (= (stemming "truer") "truer"))))

(deftest test-2329
  (testing "test case 2329"
    (is (= (stemming "arm") "arm"))))

(deftest test-2330
  (testing "test case 2330"
    (is (= (stemming "ortolans") "ortolan"))))

(deftest test-2331
  (testing "test case 2331"
    (is (= (stemming "gilly") "gilli"))))

(deftest test-2332
  (testing "test case 2332"
    (is (= (stemming "fantasts") "fantast"))))

(deftest test-2333
  (testing "test case 2333"
    (is (= (stemming "overshooting") "overshoot"))))

(deftest test-2334
  (testing "test case 2334"
    (is (= (stemming "mow") "mow"))))

(deftest test-2335
  (testing "test case 2335"
    (is (= (stemming "inadmissable") "inadmiss"))))

(deftest test-2336
  (testing "test case 2336"
    (is (= (stemming "tabulation") "tabul"))))

(deftest test-2337
  (testing "test case 2337"
    (is (= (stemming "sues") "sue"))))

(deftest test-2338
  (testing "test case 2338"
    (is (= (stemming "jailing") "jail"))))

(deftest test-2339
  (testing "test case 2339"
    (is (= (stemming "legatees") "legate"))))

(deftest test-2340
  (testing "test case 2340"
    (is (= (stemming "hoed") "ho"))))

(deftest test-2341
  (testing "test case 2341"
    (is (= (stemming "barrettes") "barrett"))))

(deftest test-2342
  (testing "test case 2342"
    (is (= (stemming "blimey") "blimei"))))

(deftest test-2343
  (testing "test case 2343"
    (is (= (stemming "homburgs") "homburg"))))

(deftest test-2344
  (testing "test case 2344"
    (is (= (stemming "periodontal") "periodont"))))

(deftest test-2345
  (testing "test case 2345"
    (is (= (stemming "hypnotizing") "hypnot"))))

(deftest test-2346
  (testing "test case 2346"
    (is (= (stemming "baths") "bath"))))

(deftest test-2347
  (testing "test case 2347"
    (is (= (stemming "alarm") "alarm"))))

(deftest test-2348
  (testing "test case 2348"
    (is (= (stemming "lurk") "lurk"))))

(deftest test-2349
  (testing "test case 2349"
    (is (= (stemming "oilway") "oilwai"))))

(deftest test-2350
  (testing "test case 2350"
    (is (= (stemming "achenes") "achen"))))

(deftest test-2351
  (testing "test case 2351"
    (is (= (stemming "forwardly") "forwardli"))))

(deftest test-2352
  (testing "test case 2352"
    (is (= (stemming "acidhead") "acidhead"))))

(deftest test-2353
  (testing "test case 2353"
    (is (= (stemming "alkaloid") "alkaloid"))))

(deftest test-2354
  (testing "test case 2354"
    (is (= (stemming "denseness") "dens"))))

(deftest test-2355
  (testing "test case 2355"
    (is (= (stemming "asexual") "asexu"))))

(deftest test-2356
  (testing "test case 2356"
    (is (= (stemming "defied") "defi"))))

(deftest test-2357
  (testing "test case 2357"
    (is (= (stemming "nm") "nm"))))

(deftest test-2358
  (testing "test case 2358"
    (is (= (stemming "flower") "flower"))))

(deftest test-2359
  (testing "test case 2359"
    (is (= (stemming "suit") "suit"))))

(deftest test-2360
  (testing "test case 2360"
    (is (= (stemming "solutes") "solut"))))

(deftest test-2361
  (testing "test case 2361"
    (is (= (stemming "despatcher") "despatch"))))

(deftest test-2362
  (testing "test case 2362"
    (is (= (stemming "tentered") "tenter"))))

(deftest test-2363
  (testing "test case 2363"
    (is (= (stemming "tensor") "tensor"))))

(deftest test-2364
  (testing "test case 2364"
    (is (= (stemming "rape") "rape"))))

(deftest test-2365
  (testing "test case 2365"
    (is (= (stemming "dundee") "dunde"))))

(deftest test-2366
  (testing "test case 2366"
    (is (= (stemming "colonies") "coloni"))))

(deftest test-2367
  (testing "test case 2367"
    (is (= (stemming "unguents") "unguent"))))

(deftest test-2368
  (testing "test case 2368"
    (is (= (stemming "embezzles") "embezzl"))))

(deftest test-2369
  (testing "test case 2369"
    (is (= (stemming "eligibly") "elig"))))

(deftest test-2370
  (testing "test case 2370"
    (is (= (stemming "retroactivity") "retroact"))))

(deftest test-2371
  (testing "test case 2371"
    (is (= (stemming "hooch") "hooch"))))

(deftest test-2372
  (testing "test case 2372"
    (is (= (stemming "ejector") "ejector"))))

(deftest test-2373
  (testing "test case 2373"
    (is (= (stemming "gladioluses") "gladiolus"))))

(deftest test-2374
  (testing "test case 2374"
    (is (= (stemming "cobwebs") "cobweb"))))

(deftest test-2375
  (testing "test case 2375"
    (is (= (stemming "nutritively") "nutrit"))))

(deftest test-2376
  (testing "test case 2376"
    (is (= (stemming "chicane") "chican"))))

(deftest test-2377
  (testing "test case 2377"
    (is (= (stemming "minidisks") "minidisk"))))

(deftest test-2378
  (testing "test case 2378"
    (is (= (stemming "guised") "guis"))))

(deftest test-2379
  (testing "test case 2379"
    (is (= (stemming "cadets") "cadet"))))

(deftest test-2380
  (testing "test case 2380"
    (is (= (stemming "redemonstrating") "redemonstr"))))

(deftest test-2381
  (testing "test case 2381"
    (is (= (stemming "judiciary") "judiciari"))))

(deftest test-2382
  (testing "test case 2382"
    (is (= (stemming "razoring") "razor"))))

(deftest test-2383
  (testing "test case 2383"
    (is (= (stemming "emigrates") "emigr"))))

(deftest test-2384
  (testing "test case 2384"
    (is (= (stemming "salvias") "salvia"))))

(deftest test-2385
  (testing "test case 2385"
    (is (= (stemming "xenocryst") "xenocryst"))))

(deftest test-2386
  (testing "test case 2386"
    (is (= (stemming "lysin") "lysin"))))

(deftest test-2387
  (testing "test case 2387"
    (is (= (stemming "garble") "garbl"))))

(deftest test-2388
  (testing "test case 2388"
    (is (= (stemming "tabula") "tabula"))))

(deftest test-2389
  (testing "test case 2389"
    (is (= (stemming "clamper") "clamper"))))

(deftest test-2390
  (testing "test case 2390"
    (is (= (stemming "moonstones") "moonston"))))

(deftest test-2391
  (testing "test case 2391"
    (is (= (stemming "selfward") "selfward"))))

(deftest test-2392
  (testing "test case 2392"
    (is (= (stemming "nazi") "nazi"))))

(deftest test-2393
  (testing "test case 2393"
    (is (= (stemming "archaizing") "archaiz"))))

(deftest test-2394
  (testing "test case 2394"
    (is (= (stemming "loos") "loo"))))

(deftest test-2395
  (testing "test case 2395"
    (is (= (stemming "pacifist") "pacifist"))))

(deftest test-2396
  (testing "test case 2396"
    (is (= (stemming "brachium") "brachium"))))

(deftest test-2397
  (testing "test case 2397"
    (is (= (stemming "noised") "nois"))))

(deftest test-2398
  (testing "test case 2398"
    (is (= (stemming "wackiness") "wacki"))))

(deftest test-2399
  (testing "test case 2399"
    (is (= (stemming "redundancies") "redund"))))

(deftest test-2400
  (testing "test case 2400"
    (is (= (stemming "caffeins") "caffein"))))

(deftest test-2401
  (testing "test case 2401"
    (is (= (stemming "vexatious") "vexati"))))

(deftest test-2402
  (testing "test case 2402"
    (is (= (stemming "bicycler") "bicycl"))))

(deftest test-2403
  (testing "test case 2403"
    (is (= (stemming "pericarditis") "pericard"))))

(deftest test-2404
  (testing "test case 2404"
    (is (= (stemming "effluent") "effluent"))))

(deftest test-2405
  (testing "test case 2405"
    (is (= (stemming "disorientates") "disorient"))))

(deftest test-2406
  (testing "test case 2406"
    (is (= (stemming "taxicabs") "taxicab"))))

(deftest test-2407
  (testing "test case 2407"
    (is (= (stemming "camomile") "camomil"))))

(deftest test-2408
  (testing "test case 2408"
    (is (= (stemming "tobacco") "tobacco"))))

(deftest test-2409
  (testing "test case 2409"
    (is (= (stemming "enzymes") "enzym"))))

(deftest test-2410
  (testing "test case 2410"
    (is (= (stemming "couching") "couch"))))

(deftest test-2411
  (testing "test case 2411"
    (is (= (stemming "accretions") "accret"))))

(deftest test-2412
  (testing "test case 2412"
    (is (= (stemming "proctored") "proctor"))))

(deftest test-2413
  (testing "test case 2413"
    (is (= (stemming "aphasia") "aphasia"))))

(deftest test-2414
  (testing "test case 2414"
    (is (= (stemming "flak") "flak"))))

(deftest test-2415
  (testing "test case 2415"
    (is (= (stemming "skywards") "skyward"))))

(deftest test-2416
  (testing "test case 2416"
    (is (= (stemming "syphilized") "syphil"))))

(deftest test-2417
  (testing "test case 2417"
    (is (= (stemming "mite") "mite"))))

(deftest test-2418
  (testing "test case 2418"
    (is (= (stemming "neap") "neap"))))

(deftest test-2419
  (testing "test case 2419"
    (is (= (stemming "inheritably") "inherit"))))

(deftest test-2420
  (testing "test case 2420"
    (is (= (stemming "rephrasing") "rephras"))))

(deftest test-2421
  (testing "test case 2421"
    (is (= (stemming "panging") "pang"))))

(deftest test-2422
  (testing "test case 2422"
    (is (= (stemming "disembark") "disembark"))))

(deftest test-2423
  (testing "test case 2423"
    (is (= (stemming "ballyrag") "ballyrag"))))

(deftest test-2424
  (testing "test case 2424"
    (is (= (stemming "anemia") "anemia"))))

(deftest test-2425
  (testing "test case 2425"
    (is (= (stemming "dynatrons") "dynatron"))))

(deftest test-2426
  (testing "test case 2426"
    (is (= (stemming "his") "hi"))))

(deftest test-2427
  (testing "test case 2427"
    (is (= (stemming "sweetbriers") "sweetbrier"))))

(deftest test-2428
  (testing "test case 2428"
    (is (= (stemming "alehouse") "alehous"))))

(deftest test-2429
  (testing "test case 2429"
    (is (= (stemming "crocheter") "crochet"))))

(deftest test-2430
  (testing "test case 2430"
    (is (= (stemming "wafter") "wafter"))))

(deftest test-2431
  (testing "test case 2431"
    (is (= (stemming "smokable") "smokabl"))))

(deftest test-2432
  (testing "test case 2432"
    (is (= (stemming "gradual") "gradual"))))

(deftest test-2433
  (testing "test case 2433"
    (is (= (stemming "combustion") "combust"))))

(deftest test-2434
  (testing "test case 2434"
    (is (= (stemming "adders") "adder"))))

(deftest test-2435
  (testing "test case 2435"
    (is (= (stemming "emblazoning") "emblazon"))))

(deftest test-2436
  (testing "test case 2436"
    (is (= (stemming "abettors") "abettor"))))

(deftest test-2437
  (testing "test case 2437"
    (is (= (stemming "mezcals") "mezcal"))))

(deftest test-2438
  (testing "test case 2438"
    (is (= (stemming "panama") "panama"))))

(deftest test-2439
  (testing "test case 2439"
    (is (= (stemming "glaciologist") "glaciologist"))))

(deftest test-2440
  (testing "test case 2440"
    (is (= (stemming "jolliness") "jolli"))))

(deftest test-2441
  (testing "test case 2441"
    (is (= (stemming "enamors") "enamor"))))

(deftest test-2442
  (testing "test case 2442"
    (is (= (stemming "instrument") "instrument"))))

(deftest test-2443
  (testing "test case 2443"
    (is (= (stemming "ribaldly") "ribaldli"))))

(deftest test-2444
  (testing "test case 2444"
    (is (= (stemming "triste") "trist"))))

(deftest test-2445
  (testing "test case 2445"
    (is (= (stemming "sweepy") "sweepi"))))

(deftest test-2446
  (testing "test case 2446"
    (is (= (stemming "phi") "phi"))))

(deftest test-2447
  (testing "test case 2447"
    (is (= (stemming "augers") "auger"))))

(deftest test-2448
  (testing "test case 2448"
    (is (= (stemming "aerofoil") "aerofoil"))))

(deftest test-2449
  (testing "test case 2449"
    (is (= (stemming "oozes") "ooz"))))

(deftest test-2450
  (testing "test case 2450"
    (is (= (stemming "pickaxing") "pickax"))))

(deftest test-2451
  (testing "test case 2451"
    (is (= (stemming "shirtsleeve") "shirtsleev"))))

(deftest test-2452
  (testing "test case 2452"
    (is (= (stemming "updating") "updat"))))

(deftest test-2453
  (testing "test case 2453"
    (is (= (stemming "enrages") "enrag"))))

(deftest test-2454
  (testing "test case 2454"
    (is (= (stemming "scabby") "scabbi"))))

(deftest test-2455
  (testing "test case 2455"
    (is (= (stemming "pauper") "pauper"))))

(deftest test-2456
  (testing "test case 2456"
    (is (= (stemming "uptime") "uptim"))))

(deftest test-2457
  (testing "test case 2457"
    (is (= (stemming "cine") "cine"))))

(deftest test-2458
  (testing "test case 2458"
    (is (= (stemming "frizzliest") "frizzliest"))))

(deftest test-2459
  (testing "test case 2459"
    (is (= (stemming "hominized") "homin"))))

(deftest test-2460
  (testing "test case 2460"
    (is (= (stemming "withdrawn") "withdrawn"))))

(deftest test-2461
  (testing "test case 2461"
    (is (= (stemming "stratospheric") "stratospher"))))

(deftest test-2462
  (testing "test case 2462"
    (is (= (stemming "interposes") "interpos"))))

(deftest test-2463
  (testing "test case 2463"
    (is (= (stemming "handholds") "handhold"))))

(deftest test-2464
  (testing "test case 2464"
    (is (= (stemming "gabbroic") "gabbroic"))))

(deftest test-2465
  (testing "test case 2465"
    (is (= (stemming "suspends") "suspend"))))

(deftest test-2466
  (testing "test case 2466"
    (is (= (stemming "instability") "instabl"))))

(deftest test-2467
  (testing "test case 2467"
    (is (= (stemming "flossier") "flossier"))))

(deftest test-2468
  (testing "test case 2468"
    (is (= (stemming "gripsack") "gripsack"))))

(deftest test-2469
  (testing "test case 2469"
    (is (= (stemming "frequency") "frequenc"))))

(deftest test-2470
  (testing "test case 2470"
    (is (= (stemming "fizzes") "fizz"))))

(deftest test-2471
  (testing "test case 2471"
    (is (= (stemming "sadden") "sadden"))))

(deftest test-2472
  (testing "test case 2472"
    (is (= (stemming "asker") "asker"))))

(deftest test-2473
  (testing "test case 2473"
    (is (= (stemming "exemplification") "exemplif"))))

(deftest test-2474
  (testing "test case 2474"
    (is (= (stemming "coolie") "cooli"))))

(deftest test-2475
  (testing "test case 2475"
    (is (= (stemming "hotheaded") "hothead"))))

(deftest test-2476
  (testing "test case 2476"
    (is (= (stemming "reffed") "ref"))))

(deftest test-2477
  (testing "test case 2477"
    (is (= (stemming "legators") "legat"))))

(deftest test-2478
  (testing "test case 2478"
    (is (= (stemming "masqueraders") "masquerad"))))

(deftest test-2479
  (testing "test case 2479"
    (is (= (stemming "miscast") "miscast"))))

(deftest test-2480
  (testing "test case 2480"
    (is (= (stemming "zombies") "zombi"))))

(deftest test-2481
  (testing "test case 2481"
    (is (= (stemming "urn") "urn"))))

(deftest test-2482
  (testing "test case 2482"
    (is (= (stemming "bellboy") "bellboi"))))

(deftest test-2483
  (testing "test case 2483"
    (is (= (stemming "resorts") "resort"))))

(deftest test-2484
  (testing "test case 2484"
    (is (= (stemming "versailles") "versail"))))

(deftest test-2485
  (testing "test case 2485"
    (is (= (stemming "identifiability") "identifi"))))

(deftest test-2486
  (testing "test case 2486"
    (is (= (stemming "herbal") "herbal"))))

(deftest test-2487
  (testing "test case 2487"
    (is (= (stemming "foresheet") "foresheet"))))

(deftest test-2488
  (testing "test case 2488"
    (is (= (stemming "likelihood") "likelihood"))))

(deftest test-2489
  (testing "test case 2489"
    (is (= (stemming "consists") "consist"))))

(deftest test-2490
  (testing "test case 2490"
    (is (= (stemming "supra") "supra"))))

(deftest test-2491
  (testing "test case 2491"
    (is (= (stemming "exorcizing") "exorc"))))

(deftest test-2492
  (testing "test case 2492"
    (is (= (stemming "rightest") "rightest"))))

(deftest test-2493
  (testing "test case 2493"
    (is (= (stemming "boilers") "boiler"))))

(deftest test-2494
  (testing "test case 2494"
    (is (= (stemming "flavorer") "flavor"))))

(deftest test-2495
  (testing "test case 2495"
    (is (= (stemming "gunbarrel") "gunbarrel"))))

(deftest test-2496
  (testing "test case 2496"
    (is (= (stemming "talcs") "talc"))))

(deftest test-2497
  (testing "test case 2497"
    (is (= (stemming "bloodstones") "bloodston"))))

(deftest test-2498
  (testing "test case 2498"
    (is (= (stemming "bateau") "bateau"))))

(deftest test-2499
  (testing "test case 2499"
    (is (= (stemming "paring") "pare"))))

(deftest test-2500
  (testing "test case 2500"
    (is (= (stemming "canonizations") "canon"))))

(deftest test-2501
  (testing "test case 2501"
    (is (= (stemming "bonded") "bond"))))

(deftest test-2502
  (testing "test case 2502"
    (is (= (stemming "stealthiness") "stealthi"))))

(deftest test-2503
  (testing "test case 2503"
    (is (= (stemming "paraguayans") "paraguayan"))))

(deftest test-2504
  (testing "test case 2504"
    (is (= (stemming "mendelianism") "mendelian"))))

(deftest test-2505
  (testing "test case 2505"
    (is (= (stemming "canzone") "canzon"))))

(deftest test-2506
  (testing "test case 2506"
    (is (= (stemming "nonflowering") "nonflow"))))

(deftest test-2507
  (testing "test case 2507"
    (is (= (stemming "tricots") "tricot"))))

(deftest test-2508
  (testing "test case 2508"
    (is (= (stemming "muezzins") "muezzin"))))

(deftest test-2509
  (testing "test case 2509"
    (is (= (stemming "avionic") "avion"))))

(deftest test-2510
  (testing "test case 2510"
    (is (= (stemming "mumblers") "mumbler"))))

(deftest test-2511
  (testing "test case 2511"
    (is (= (stemming "vigorish") "vigorish"))))

(deftest test-2512
  (testing "test case 2512"
    (is (= (stemming "dhole") "dhole"))))

(deftest test-2513
  (testing "test case 2513"
    (is (= (stemming "outstations") "outstat"))))

(deftest test-2514
  (testing "test case 2514"
    (is (= (stemming "cantraps") "cantrap"))))

(deftest test-2515
  (testing "test case 2515"
    (is (= (stemming "taipei") "taipei"))))

(deftest test-2516
  (testing "test case 2516"
    (is (= (stemming "helicopter") "helicopt"))))

(deftest test-2517
  (testing "test case 2517"
    (is (= (stemming "bodkin") "bodkin"))))

(deftest test-2518
  (testing "test case 2518"
    (is (= (stemming "destitution") "destitut"))))

(deftest test-2519
  (testing "test case 2519"
    (is (= (stemming "hearing") "hear"))))

(deftest test-2520
  (testing "test case 2520"
    (is (= (stemming "quanted") "quant"))))

(deftest test-2521
  (testing "test case 2521"
    (is (= (stemming "regroups") "regroup"))))

(deftest test-2522
  (testing "test case 2522"
    (is (= (stemming "heirdoms") "heirdom"))))

(deftest test-2523
  (testing "test case 2523"
    (is (= (stemming "biome") "biom"))))

(deftest test-2524
  (testing "test case 2524"
    (is (= (stemming "horsefeathers") "horsefeath"))))

(deftest test-2525
  (testing "test case 2525"
    (is (= (stemming "typifiers") "typifi"))))

(deftest test-2526
  (testing "test case 2526"
    (is (= (stemming "slanginess") "slangi"))))

(deftest test-2527
  (testing "test case 2527"
    (is (= (stemming "tidings") "tide"))))

(deftest test-2528
  (testing "test case 2528"
    (is (= (stemming "preascertain") "preascertain"))))

(deftest test-2529
  (testing "test case 2529"
    (is (= (stemming "housebreaking") "housebreak"))))

(deftest test-2530
  (testing "test case 2530"
    (is (= (stemming "skies") "ski"))))

(deftest test-2531
  (testing "test case 2531"
    (is (= (stemming "errs") "err"))))

(deftest test-2532
  (testing "test case 2532"
    (is (= (stemming "kindliest") "kindliest"))))

(deftest test-2533
  (testing "test case 2533"
    (is (= (stemming "parities") "pariti"))))

(deftest test-2534
  (testing "test case 2534"
    (is (= (stemming "seafronts") "seafront"))))

(deftest test-2535
  (testing "test case 2535"
    (is (= (stemming "sepulcher") "sepulch"))))

(deftest test-2536
  (testing "test case 2536"
    (is (= (stemming "trematode") "trematod"))))

(deftest test-2537
  (testing "test case 2537"
    (is (= (stemming "paraphrase") "paraphras"))))

(deftest test-2538
  (testing "test case 2538"
    (is (= (stemming "implore") "implor"))))

(deftest test-2539
  (testing "test case 2539"
    (is (= (stemming "mimer") "mimer"))))

(deftest test-2540
  (testing "test case 2540"
    (is (= (stemming "rattail") "rattail"))))

(deftest test-2541
  (testing "test case 2541"
    (is (= (stemming "dishpans") "dishpan"))))

(deftest test-2542
  (testing "test case 2542"
    (is (= (stemming "incages") "incag"))))

(deftest test-2543
  (testing "test case 2543"
    (is (= (stemming "tonnes") "tonn"))))

(deftest test-2544
  (testing "test case 2544"
    (is (= (stemming "weightily") "weightili"))))

(deftest test-2545
  (testing "test case 2545"
    (is (= (stemming "promodern") "promodern"))))

(deftest test-2546
  (testing "test case 2546"
    (is (= (stemming "pricy") "prici"))))

(deftest test-2547
  (testing "test case 2547"
    (is (= (stemming "crowdies") "crowdi"))))

(deftest test-2548
  (testing "test case 2548"
    (is (= (stemming "enchantresses") "enchantress"))))

(deftest test-2549
  (testing "test case 2549"
    (is (= (stemming "suborning") "suborn"))))

(deftest test-2550
  (testing "test case 2550"
    (is (= (stemming "materialities") "materi"))))

(deftest test-2551
  (testing "test case 2551"
    (is (= (stemming "spaced") "space"))))

(deftest test-2552
  (testing "test case 2552"
    (is (= (stemming "stress") "stress"))))

(deftest test-2553
  (testing "test case 2553"
    (is (= (stemming "slav") "slav"))))

(deftest test-2554
  (testing "test case 2554"
    (is (= (stemming "whish") "whish"))))

(deftest test-2555
  (testing "test case 2555"
    (is (= (stemming "fluffiest") "fluffiest"))))

(deftest test-2556
  (testing "test case 2556"
    (is (= (stemming "inexcusability") "inexcus"))))

(deftest test-2557
  (testing "test case 2557"
    (is (= (stemming "leukemias") "leukemia"))))

(deftest test-2558
  (testing "test case 2558"
    (is (= (stemming "fowlers") "fowler"))))

(deftest test-2559
  (testing "test case 2559"
    (is (= (stemming "forworn") "forworn"))))

(deftest test-2560
  (testing "test case 2560"
    (is (= (stemming "kludge") "kludg"))))

(deftest test-2561
  (testing "test case 2561"
    (is (= (stemming "popinjay") "popinjai"))))

(deftest test-2562
  (testing "test case 2562"
    (is (= (stemming "encomiums") "encomium"))))

(deftest test-2563
  (testing "test case 2563"
    (is (= (stemming "aliveness") "aliv"))))

(deftest test-2564
  (testing "test case 2564"
    (is (= (stemming "hinnies") "hinni"))))

(deftest test-2565
  (testing "test case 2565"
    (is (= (stemming "cinematheque") "cinemathequ"))))

(deftest test-2566
  (testing "test case 2566"
    (is (= (stemming "humdinger") "humding"))))

(deftest test-2567
  (testing "test case 2567"
    (is (= (stemming "ataxy") "ataxi"))))

(deftest test-2568
  (testing "test case 2568"
    (is (= (stemming "invalidly") "invalidli"))))

(deftest test-2569
  (testing "test case 2569"
    (is (= (stemming "fraternalism") "fratern"))))

(deftest test-2570
  (testing "test case 2570"
    (is (= (stemming "smooched") "smooch"))))

(deftest test-2571
  (testing "test case 2571"
    (is (= (stemming "physiologists") "physiologist"))))

(deftest test-2572
  (testing "test case 2572"
    (is (= (stemming "spearheading") "spearhead"))))

(deftest test-2573
  (testing "test case 2573"
    (is (= (stemming "enterprises") "enterpris"))))

(deftest test-2574
  (testing "test case 2574"
    (is (= (stemming "plainly") "plainli"))))

(deftest test-2575
  (testing "test case 2575"
    (is (= (stemming "aquaplane") "aquaplan"))))

(deftest test-2576
  (testing "test case 2576"
    (is (= (stemming "knucks") "knuck"))))

(deftest test-2577
  (testing "test case 2577"
    (is (= (stemming "ventricles") "ventricl"))))

(deftest test-2578
  (testing "test case 2578"
    (is (= (stemming "calmer") "calmer"))))

(deftest test-2579
  (testing "test case 2579"
    (is (= (stemming "crape") "crape"))))

(deftest test-2580
  (testing "test case 2580"
    (is (= (stemming "rassles") "rassl"))))

(deftest test-2581
  (testing "test case 2581"
    (is (= (stemming "nave") "nave"))))

(deftest test-2582
  (testing "test case 2582"
    (is (= (stemming "reasserts") "reassert"))))

(deftest test-2583
  (testing "test case 2583"
    (is (= (stemming "necklines") "necklin"))))

(deftest test-2584
  (testing "test case 2584"
    (is (= (stemming "standishes") "standish"))))

(deftest test-2585
  (testing "test case 2585"
    (is (= (stemming "misanthropist") "misanthropist"))))

(deftest test-2586
  (testing "test case 2586"
    (is (= (stemming "sexes") "sex"))))

(deftest test-2587
  (testing "test case 2587"
    (is (= (stemming "macs") "mac"))))

(deftest test-2588
  (testing "test case 2588"
    (is (= (stemming "shiksa") "shiksa"))))

(deftest test-2589
  (testing "test case 2589"
    (is (= (stemming "reprieving") "repriev"))))

(deftest test-2590
  (testing "test case 2590"
    (is (= (stemming "cannoned") "cannon"))))

(deftest test-2591
  (testing "test case 2591"
    (is (= (stemming "centeredness") "centered"))))

(deftest test-2592
  (testing "test case 2592"
    (is (= (stemming "cloaking") "cloak"))))

(deftest test-2593
  (testing "test case 2593"
    (is (= (stemming "nulliparous") "nullipar"))))

(deftest test-2594
  (testing "test case 2594"
    (is (= (stemming "iridescence") "iridesc"))))

(deftest test-2595
  (testing "test case 2595"
    (is (= (stemming "fittingly") "fittingli"))))

(deftest test-2596
  (testing "test case 2596"
    (is (= (stemming "couther") "couther"))))

(deftest test-2597
  (testing "test case 2597"
    (is (= (stemming "sellout") "sellout"))))

(deftest test-2598
  (testing "test case 2598"
    (is (= (stemming "instigated") "instig"))))

(deftest test-2599
  (testing "test case 2599"
    (is (= (stemming "finnickier") "finnicki"))))

(deftest test-2600
  (testing "test case 2600"
    (is (= (stemming "cams") "cam"))))

(deftest test-2601
  (testing "test case 2601"
    (is (= (stemming "occidental") "occident"))))

(deftest test-2602
  (testing "test case 2602"
    (is (= (stemming "cosmetologist") "cosmetologist"))))

(deftest test-2603
  (testing "test case 2603"
    (is (= (stemming "violator") "violat"))))

(deftest test-2604
  (testing "test case 2604"
    (is (= (stemming "suppers") "supper"))))

(deftest test-2605
  (testing "test case 2605"
    (is (= (stemming "reindeer") "reindeer"))))

(deftest test-2606
  (testing "test case 2606"
    (is (= (stemming "glaives") "glaiv"))))

(deftest test-2607
  (testing "test case 2607"
    (is (= (stemming "sorrel") "sorrel"))))

(deftest test-2608
  (testing "test case 2608"
    (is (= (stemming "dubonnets") "dubonnet"))))

(deftest test-2609
  (testing "test case 2609"
    (is (= (stemming "admonitions") "admonit"))))

(deftest test-2610
  (testing "test case 2610"
    (is (= (stemming "pow") "pow"))))

(deftest test-2611
  (testing "test case 2611"
    (is (= (stemming "intaglio") "intaglio"))))

(deftest test-2612
  (testing "test case 2612"
    (is (= (stemming "treetops") "treetop"))))

(deftest test-2613
  (testing "test case 2613"
    (is (= (stemming "overvalues") "overvalu"))))

(deftest test-2614
  (testing "test case 2614"
    (is (= (stemming "outwards") "outward"))))

(deftest test-2615
  (testing "test case 2615"
    (is (= (stemming "cowpat") "cowpat"))))

(deftest test-2616
  (testing "test case 2616"
    (is (= (stemming "cabalistic") "cabalist"))))

(deftest test-2617
  (testing "test case 2617"
    (is (= (stemming "yelps") "yelp"))))

(deftest test-2618
  (testing "test case 2618"
    (is (= (stemming "jogged") "jog"))))

(deftest test-2619
  (testing "test case 2619"
    (is (= (stemming "libeled") "libel"))))

(deftest test-2620
  (testing "test case 2620"
    (is (= (stemming "wariest") "wariest"))))

(deftest test-2621
  (testing "test case 2621"
    (is (= (stemming "remelts") "remelt"))))

(deftest test-2622
  (testing "test case 2622"
    (is (= (stemming "firecracker") "firecrack"))))

(deftest test-2623
  (testing "test case 2623"
    (is (= (stemming "nudnik") "nudnik"))))

(deftest test-2624
  (testing "test case 2624"
    (is (= (stemming "outnumber") "outnumb"))))

(deftest test-2625
  (testing "test case 2625"
    (is (= (stemming "consumptions") "consumpt"))))

(deftest test-2626
  (testing "test case 2626"
    (is (= (stemming "hostesses") "hostess"))))

(deftest test-2627
  (testing "test case 2627"
    (is (= (stemming "redetermined") "redetermin"))))

(deftest test-2628
  (testing "test case 2628"
    (is (= (stemming "modification") "modif"))))

(deftest test-2629
  (testing "test case 2629"
    (is (= (stemming "acerber") "acerb"))))

(deftest test-2630
  (testing "test case 2630"
    (is (= (stemming "atomisms") "atom"))))

(deftest test-2631
  (testing "test case 2631"
    (is (= (stemming "monosyllabically") "monosyllab"))))

(deftest test-2632
  (testing "test case 2632"
    (is (= (stemming "thirstiest") "thirstiest"))))

(deftest test-2633
  (testing "test case 2633"
    (is (= (stemming "grasshoppers") "grasshopp"))))

(deftest test-2634
  (testing "test case 2634"
    (is (= (stemming "antiaircraft") "antiaircraft"))))

(deftest test-2635
  (testing "test case 2635"
    (is (= (stemming "suborn") "suborn"))))

(deftest test-2636
  (testing "test case 2636"
    (is (= (stemming "abstained") "abstain"))))

(deftest test-2637
  (testing "test case 2637"
    (is (= (stemming "family") "famili"))))

(deftest test-2638
  (testing "test case 2638"
    (is (= (stemming "toolmaking") "toolmak"))))

(deftest test-2639
  (testing "test case 2639"
    (is (= (stemming "numeral") "numer"))))

(deftest test-2640
  (testing "test case 2640"
    (is (= (stemming "blondes") "blond"))))

(deftest test-2641
  (testing "test case 2641"
    (is (= (stemming "laundered") "launder"))))

(deftest test-2642
  (testing "test case 2642"
    (is (= (stemming "styled") "style"))))

(deftest test-2643
  (testing "test case 2643"
    (is (= (stemming "triller") "triller"))))

(deftest test-2644
  (testing "test case 2644"
    (is (= (stemming "juxtapose") "juxtapos"))))

(deftest test-2645
  (testing "test case 2645"
    (is (= (stemming "estrange") "estrang"))))

(deftest test-2646
  (testing "test case 2646"
    (is (= (stemming "shags") "shag"))))

(deftest test-2647
  (testing "test case 2647"
    (is (= (stemming "macroscopic") "macroscop"))))

(deftest test-2648
  (testing "test case 2648"
    (is (= (stemming "creaked") "creak"))))

(deftest test-2649
  (testing "test case 2649"
    (is (= (stemming "adaptable") "adapt"))))

(deftest test-2650
  (testing "test case 2650"
    (is (= (stemming "elegancies") "eleg"))))

(deftest test-2651
  (testing "test case 2651"
    (is (= (stemming "reneging") "reneg"))))

(deftest test-2652
  (testing "test case 2652"
    (is (= (stemming "remitter") "remitt"))))

(deftest test-2653
  (testing "test case 2653"
    (is (= (stemming "fwd") "fwd"))))

(deftest test-2654
  (testing "test case 2654"
    (is (= (stemming "pressures") "pressur"))))

(deftest test-2655
  (testing "test case 2655"
    (is (= (stemming "therapeutics") "therapeut"))))

(deftest test-2656
  (testing "test case 2656"
    (is (= (stemming "pinkish") "pinkish"))))

(deftest test-2657
  (testing "test case 2657"
    (is (= (stemming "hatted") "hat"))))

(deftest test-2658
  (testing "test case 2658"
    (is (= (stemming "preserving") "preserv"))))

(deftest test-2659
  (testing "test case 2659"
    (is (= (stemming "vendettas") "vendetta"))))

(deftest test-2660
  (testing "test case 2660"
    (is (= (stemming "voicedness") "voiced"))))

(deftest test-2661
  (testing "test case 2661"
    (is (= (stemming "frogmen") "frogmen"))))

(deftest test-2662
  (testing "test case 2662"
    (is (= (stemming "vaccinial") "vaccini"))))

(deftest test-2663
  (testing "test case 2663"
    (is (= (stemming "hisn") "hisn"))))

(deftest test-2664
  (testing "test case 2664"
    (is (= (stemming "metal") "metal"))))

(deftest test-2665
  (testing "test case 2665"
    (is (= (stemming "depict") "depict"))))

(deftest test-2666
  (testing "test case 2666"
    (is (= (stemming "phantasmagoria") "phantasmagoria"))))

(deftest test-2667
  (testing "test case 2667"
    (is (= (stemming "attic") "attic"))))

(deftest test-2668
  (testing "test case 2668"
    (is (= (stemming "antic") "antic"))))

(deftest test-2669
  (testing "test case 2669"
    (is (= (stemming "habiliments") "habili"))))

(deftest test-2670
  (testing "test case 2670"
    (is (= (stemming "mudguards") "mudguard"))))

(deftest test-2671
  (testing "test case 2671"
    (is (= (stemming "nailers") "nailer"))))

(deftest test-2672
  (testing "test case 2672"
    (is (= (stemming "argosy") "argosi"))))

(deftest test-2673
  (testing "test case 2673"
    (is (= (stemming "transporter") "transport"))))

(deftest test-2674
  (testing "test case 2674"
    (is (= (stemming "aweless") "aweless"))))

(deftest test-2675
  (testing "test case 2675"
    (is (= (stemming "vivants") "vivant"))))

(deftest test-2676
  (testing "test case 2676"
    (is (= (stemming "allottable") "allott"))))

(deftest test-2677
  (testing "test case 2677"
    (is (= (stemming "capacitor") "capacitor"))))

(deftest test-2678
  (testing "test case 2678"
    (is (= (stemming "attributively") "attribut"))))

(deftest test-2679
  (testing "test case 2679"
    (is (= (stemming "caveatee") "caveate"))))

(deftest test-2680
  (testing "test case 2680"
    (is (= (stemming "peaces") "peac"))))

(deftest test-2681
  (testing "test case 2681"
    (is (= (stemming "arrayers") "array"))))

(deftest test-2682
  (testing "test case 2682"
    (is (= (stemming "hydrargyrum") "hydrargyrum"))))

(deftest test-2683
  (testing "test case 2683"
    (is (= (stemming "mildness") "mild"))))

(deftest test-2684
  (testing "test case 2684"
    (is (= (stemming "pneumoconiosis") "pneumoconiosi"))))

(deftest test-2685
  (testing "test case 2685"
    (is (= (stemming "grape") "grape"))))

(deftest test-2686
  (testing "test case 2686"
    (is (= (stemming "apiece") "apiec"))))

(deftest test-2687
  (testing "test case 2687"
    (is (= (stemming "coati") "coati"))))

(deftest test-2688
  (testing "test case 2688"
    (is (= (stemming "crapes") "crape"))))

(deftest test-2689
  (testing "test case 2689"
    (is (= (stemming "formica") "formica"))))

(deftest test-2690
  (testing "test case 2690"
    (is (= (stemming "corroborator") "corrobor"))))

(deftest test-2691
  (testing "test case 2691"
    (is (= (stemming "tunelessly") "tunelessli"))))

(deftest test-2692
  (testing "test case 2692"
    (is (= (stemming "eardrops") "eardrop"))))

(deftest test-2693
  (testing "test case 2693"
    (is (= (stemming "protean") "protean"))))

(deftest test-2694
  (testing "test case 2694"
    (is (= (stemming "preternatural") "preternatur"))))

(deftest test-2695
  (testing "test case 2695"
    (is (= (stemming "fraulein") "fraulein"))))

(deftest test-2696
  (testing "test case 2696"
    (is (= (stemming "mincemeat") "mincemeat"))))

(deftest test-2697
  (testing "test case 2697"
    (is (= (stemming "mailbag") "mailbag"))))

(deftest test-2698
  (testing "test case 2698"
    (is (= (stemming "masked") "mask"))))

(deftest test-2699
  (testing "test case 2699"
    (is (= (stemming "gloriously") "glorious"))))

(deftest test-2700
  (testing "test case 2700"
    (is (= (stemming "sepia") "sepia"))))

(deftest test-2701
  (testing "test case 2701"
    (is (= (stemming "vacuoles") "vacuol"))))

(deftest test-2702
  (testing "test case 2702"
    (is (= (stemming "thyroidectomize") "thyroidectom"))))

(deftest test-2703
  (testing "test case 2703"
    (is (= (stemming "gentlest") "gentlest"))))

(deftest test-2704
  (testing "test case 2704"
    (is (= (stemming "outrigger") "outrigg"))))

(deftest test-2705
  (testing "test case 2705"
    (is (= (stemming "rendezvouses") "rendezvous"))))

(deftest test-2706
  (testing "test case 2706"
    (is (= (stemming "adenoidectomy") "adenoidectomi"))))

(deftest test-2707
  (testing "test case 2707"
    (is (= (stemming "nooser") "nooser"))))

(deftest test-2708
  (testing "test case 2708"
    (is (= (stemming "enclosing") "enclos"))))

(deftest test-2709
  (testing "test case 2709"
    (is (= (stemming "eyestrain") "eyestrain"))))

(deftest test-2710
  (testing "test case 2710"
    (is (= (stemming "umbras") "umbra"))))

(deftest test-2711
  (testing "test case 2711"
    (is (= (stemming "negotiates") "negoti"))))

(deftest test-2712
  (testing "test case 2712"
    (is (= (stemming "vaunt") "vaunt"))))

(deftest test-2713
  (testing "test case 2713"
    (is (= (stemming "explanations") "explan"))))

(deftest test-2714
  (testing "test case 2714"
    (is (= (stemming "advised") "advis"))))

(deftest test-2715
  (testing "test case 2715"
    (is (= (stemming "psychosomatic") "psychosomat"))))

(deftest test-2716
  (testing "test case 2716"
    (is (= (stemming "cookbooks") "cookbook"))))

(deftest test-2717
  (testing "test case 2717"
    (is (= (stemming "slumped") "slump"))))

(deftest test-2718
  (testing "test case 2718"
    (is (= (stemming "chestful") "chest"))))

(deftest test-2719
  (testing "test case 2719"
    (is (= (stemming "indraft") "indraft"))))

(deftest test-2720
  (testing "test case 2720"
    (is (= (stemming "hearken") "hearken"))))

(deftest test-2721
  (testing "test case 2721"
    (is (= (stemming "stockpiles") "stockpil"))))

(deftest test-2722
  (testing "test case 2722"
    (is (= (stemming "astounded") "astound"))))

(deftest test-2723
  (testing "test case 2723"
    (is (= (stemming "indianan") "indianan"))))

(deftest test-2724
  (testing "test case 2724"
    (is (= (stemming "aptness") "apt"))))

(deftest test-2725
  (testing "test case 2725"
    (is (= (stemming "imperatives") "imper"))))

(deftest test-2726
  (testing "test case 2726"
    (is (= (stemming "quavers") "quaver"))))

(deftest test-2727
  (testing "test case 2727"
    (is (= (stemming "bandwidth") "bandwidth"))))

(deftest test-2728
  (testing "test case 2728"
    (is (= (stemming "celebs") "celeb"))))

(deftest test-2729
  (testing "test case 2729"
    (is (= (stemming "glancing") "glanc"))))

(deftest test-2730
  (testing "test case 2730"
    (is (= (stemming "wifehoods") "wifehood"))))

(deftest test-2731
  (testing "test case 2731"
    (is (= (stemming "sporule") "sporul"))))

(deftest test-2732
  (testing "test case 2732"
    (is (= (stemming "penalizes") "penal"))))

(deftest test-2733
  (testing "test case 2733"
    (is (= (stemming "juiciness") "juici"))))

(deftest test-2734
  (testing "test case 2734"
    (is (= (stemming "fortresses") "fortress"))))

(deftest test-2735
  (testing "test case 2735"
    (is (= (stemming "proselytizes") "proselyt"))))

(deftest test-2736
  (testing "test case 2736"
    (is (= (stemming "tritely") "trite"))))

(deftest test-2737
  (testing "test case 2737"
    (is (= (stemming "outsmart") "outsmart"))))

(deftest test-2738
  (testing "test case 2738"
    (is (= (stemming "carrageenin") "carrageenin"))))

(deftest test-2739
  (testing "test case 2739"
    (is (= (stemming "vedic") "vedic"))))

(deftest test-2740
  (testing "test case 2740"
    (is (= (stemming "exempt") "exempt"))))

(deftest test-2741
  (testing "test case 2741"
    (is (= (stemming "chagrining") "chagrin"))))

(deftest test-2742
  (testing "test case 2742"
    (is (= (stemming "libre") "libr"))))

(deftest test-2743
  (testing "test case 2743"
    (is (= (stemming "wisecrackers") "wisecrack"))))

(deftest test-2744
  (testing "test case 2744"
    (is (= (stemming "pemmican") "pemmican"))))

(deftest test-2745
  (testing "test case 2745"
    (is (= (stemming "commotion") "commot"))))

(deftest test-2746
  (testing "test case 2746"
    (is (= (stemming "resubscribes") "resubscrib"))))

(deftest test-2747
  (testing "test case 2747"
    (is (= (stemming "ageist") "ageist"))))

(deftest test-2748
  (testing "test case 2748"
    (is (= (stemming "recept") "recept"))))

(deftest test-2749
  (testing "test case 2749"
    (is (= (stemming "nonpossessive") "nonpossess"))))

(deftest test-2750
  (testing "test case 2750"
    (is (= (stemming "remixes") "remix"))))

(deftest test-2751
  (testing "test case 2751"
    (is (= (stemming "restyling") "restyl"))))

(deftest test-2752
  (testing "test case 2752"
    (is (= (stemming "harnessed") "har"))))

(deftest test-2753
  (testing "test case 2753"
    (is (= (stemming "bubby") "bubbi"))))

(deftest test-2754
  (testing "test case 2754"
    (is (= (stemming "danglers") "dangler"))))

(deftest test-2755
  (testing "test case 2755"
    (is (= (stemming "acknowledgements") "acknowledg"))))

(deftest test-2756
  (testing "test case 2756"
    (is (= (stemming "woollen") "woollen"))))

(deftest test-2757
  (testing "test case 2757"
    (is (= (stemming "westings") "west"))))

(deftest test-2758
  (testing "test case 2758"
    (is (= (stemming "kaliph") "kaliph"))))

(deftest test-2759
  (testing "test case 2759"
    (is (= (stemming "revenger") "reveng"))))

(deftest test-2760
  (testing "test case 2760"
    (is (= (stemming "aztecan") "aztecan"))))

(deftest test-2761
  (testing "test case 2761"
    (is (= (stemming "premised") "premis"))))

(deftest test-2762
  (testing "test case 2762"
    (is (= (stemming "disintegrated") "disintegr"))))

(deftest test-2763
  (testing "test case 2763"
    (is (= (stemming "weirder") "weirder"))))

(deftest test-2764
  (testing "test case 2764"
    (is (= (stemming "willies") "willi"))))

(deftest test-2765
  (testing "test case 2765"
    (is (= (stemming "chiton") "chiton"))))

(deftest test-2766
  (testing "test case 2766"
    (is (= (stemming "broncobusters") "broncobust"))))

(deftest test-2767
  (testing "test case 2767"
    (is (= (stemming "deceiving") "deceiv"))))

(deftest test-2768
  (testing "test case 2768"
    (is (= (stemming "umlaut") "umlaut"))))

(deftest test-2769
  (testing "test case 2769"
    (is (= (stemming "thailand") "thailand"))))

(deftest test-2770
  (testing "test case 2770"
    (is (= (stemming "gastrolavage") "gastrolavag"))))

(deftest test-2771
  (testing "test case 2771"
    (is (= (stemming "criticizable") "criticiz"))))

(deftest test-2772
  (testing "test case 2772"
    (is (= (stemming "chorine") "chorin"))))

(deftest test-2773
  (testing "test case 2773"
    (is (= (stemming "neutralistic") "neutralist"))))

(deftest test-2774
  (testing "test case 2774"
    (is (= (stemming "voiders") "voider"))))

(deftest test-2775
  (testing "test case 2775"
    (is (= (stemming "paeons") "paeon"))))

(deftest test-2776
  (testing "test case 2776"
    (is (= (stemming "ultrafiltration") "ultrafiltr"))))

(deftest test-2777
  (testing "test case 2777"
    (is (= (stemming "mongolism") "mongol"))))

(deftest test-2778
  (testing "test case 2778"
    (is (= (stemming "decoction") "decoct"))))

(deftest test-2779
  (testing "test case 2779"
    (is (= (stemming "rosiny") "rosini"))))

(deftest test-2780
  (testing "test case 2780"
    (is (= (stemming "zambia") "zambia"))))

(deftest test-2781
  (testing "test case 2781"
    (is (= (stemming "equestrians") "equestrian"))))

(deftest test-2782
  (testing "test case 2782"
    (is (= (stemming "pyre") "pyre"))))

(deftest test-2783
  (testing "test case 2783"
    (is (= (stemming "chiropody") "chiropodi"))))

(deftest test-2784
  (testing "test case 2784"
    (is (= (stemming "charry") "charri"))))

(deftest test-2785
  (testing "test case 2785"
    (is (= (stemming "brined") "brine"))))

(deftest test-2786
  (testing "test case 2786"
    (is (= (stemming "vizards") "vizard"))))

(deftest test-2787
  (testing "test case 2787"
    (is (= (stemming "baywood") "baywood"))))

(deftest test-2788
  (testing "test case 2788"
    (is (= (stemming "hundreds") "hundr"))))

(deftest test-2789
  (testing "test case 2789"
    (is (= (stemming "deflagrating") "deflagr"))))

(deftest test-2790
  (testing "test case 2790"
    (is (= (stemming "tampon") "tampon"))))

(deftest test-2791
  (testing "test case 2791"
    (is (= (stemming "edgeless") "edgeless"))))

(deftest test-2792
  (testing "test case 2792"
    (is (= (stemming "diminution") "diminut"))))

(deftest test-2793
  (testing "test case 2793"
    (is (= (stemming "fireproof") "fireproof"))))

(deftest test-2794
  (testing "test case 2794"
    (is (= (stemming "polyglot") "polyglot"))))

(deftest test-2795
  (testing "test case 2795"
    (is (= (stemming "gudgeon") "gudgeon"))))

(deftest test-2796
  (testing "test case 2796"
    (is (= (stemming "nutpicks") "nutpick"))))

(deftest test-2797
  (testing "test case 2797"
    (is (= (stemming "unmeasured") "unmeasur"))))

(deftest test-2798
  (testing "test case 2798"
    (is (= (stemming "airglow") "airglow"))))

(deftest test-2799
  (testing "test case 2799"
    (is (= (stemming "dowdily") "dowdili"))))

(deftest test-2800
  (testing "test case 2800"
    (is (= (stemming "meliorations") "melior"))))

(deftest test-2801
  (testing "test case 2801"
    (is (= (stemming "precox") "precox"))))

(deftest test-2802
  (testing "test case 2802"
    (is (= (stemming "tincture") "tinctur"))))

(deftest test-2803
  (testing "test case 2803"
    (is (= (stemming "comprizing") "compriz"))))

(deftest test-2804
  (testing "test case 2804"
    (is (= (stemming "boxing") "box"))))

(deftest test-2805
  (testing "test case 2805"
    (is (= (stemming "forkless") "forkless"))))

(deftest test-2806
  (testing "test case 2806"
    (is (= (stemming "devisals") "devis"))))

(deftest test-2807
  (testing "test case 2807"
    (is (= (stemming "nancy") "nanci"))))

(deftest test-2808
  (testing "test case 2808"
    (is (= (stemming "angelus") "angelu"))))

(deftest test-2809
  (testing "test case 2809"
    (is (= (stemming "tokens") "token"))))

(deftest test-2810
  (testing "test case 2810"
    (is (= (stemming "rapidly") "rapidli"))))

(deftest test-2811
  (testing "test case 2811"
    (is (= (stemming "mock") "mock"))))

(deftest test-2812
  (testing "test case 2812"
    (is (= (stemming "sandals") "sandal"))))

(deftest test-2813
  (testing "test case 2813"
    (is (= (stemming "immunochemistry") "immunochemistri"))))

(deftest test-2814
  (testing "test case 2814"
    (is (= (stemming "satchel") "satchel"))))

(deftest test-2815
  (testing "test case 2815"
    (is (= (stemming "soviet") "soviet"))))

(deftest test-2816
  (testing "test case 2816"
    (is (= (stemming "trampler") "trampler"))))

(deftest test-2817
  (testing "test case 2817"
    (is (= (stemming "conflicting") "conflict"))))

(deftest test-2818
  (testing "test case 2818"
    (is (= (stemming "mach") "mach"))))

(deftest test-2819
  (testing "test case 2819"
    (is (= (stemming "snippers") "snipper"))))

(deftest test-2820
  (testing "test case 2820"
    (is (= (stemming "riot") "riot"))))

(deftest test-2821
  (testing "test case 2821"
    (is (= (stemming "tariff") "tariff"))))

(deftest test-2822
  (testing "test case 2822"
    (is (= (stemming "adjudicators") "adjud"))))

(deftest test-2823
  (testing "test case 2823"
    (is (= (stemming "tawny") "tawni"))))

(deftest test-2824
  (testing "test case 2824"
    (is (= (stemming "unstrung") "unstrung"))))

(deftest test-2825
  (testing "test case 2825"
    (is (= (stemming "proscribed") "proscrib"))))

(deftest test-2826
  (testing "test case 2826"
    (is (= (stemming "rarebit") "rarebit"))))

(deftest test-2827
  (testing "test case 2827"
    (is (= (stemming "rhapsodies") "rhapsodi"))))

(deftest test-2828
  (testing "test case 2828"
    (is (= (stemming "concussions") "concuss"))))

(deftest test-2829
  (testing "test case 2829"
    (is (= (stemming "complimentary") "complimentari"))))

(deftest test-2830
  (testing "test case 2830"
    (is (= (stemming "tartness") "tart"))))

(deftest test-2831
  (testing "test case 2831"
    (is (= (stemming "lictors") "lictor"))))

(deftest test-2832
  (testing "test case 2832"
    (is (= (stemming "vegetational") "veget"))))

(deftest test-2833
  (testing "test case 2833"
    (is (= (stemming "treatable") "treatabl"))))

(deftest test-2834
  (testing "test case 2834"
    (is (= (stemming "proconsulates") "proconsul"))))

(deftest test-2835
  (testing "test case 2835"
    (is (= (stemming "score") "score"))))

(deftest test-2836
  (testing "test case 2836"
    (is (= (stemming "hibernation") "hibern"))))

(deftest test-2837
  (testing "test case 2837"
    (is (= (stemming "townless") "townless"))))

(deftest test-2838
  (testing "test case 2838"
    (is (= (stemming "ascots") "ascot"))))

(deftest test-2839
  (testing "test case 2839"
    (is (= (stemming "defenseless") "defenseless"))))

(deftest test-2840
  (testing "test case 2840"
    (is (= (stemming "teeing") "tee"))))

(deftest test-2841
  (testing "test case 2841"
    (is (= (stemming "wackiest") "wackiest"))))

(deftest test-2842
  (testing "test case 2842"
    (is (= (stemming "shrieked") "shriek"))))

(deftest test-2843
  (testing "test case 2843"
    (is (= (stemming "serener") "seren"))))

(deftest test-2844
  (testing "test case 2844"
    (is (= (stemming "foresaw") "foresaw"))))

(deftest test-2845
  (testing "test case 2845"
    (is (= (stemming "structures") "structur"))))

(deftest test-2846
  (testing "test case 2846"
    (is (= (stemming "ceases") "ceas"))))

(deftest test-2847
  (testing "test case 2847"
    (is (= (stemming "delawarean") "delawarean"))))

(deftest test-2848
  (testing "test case 2848"
    (is (= (stemming "muffled") "muffl"))))

(deftest test-2849
  (testing "test case 2849"
    (is (= (stemming "connoisseur") "connoisseur"))))

(deftest test-2850
  (testing "test case 2850"
    (is (= (stemming "whipsawn") "whipsawn"))))

(deftest test-2851
  (testing "test case 2851"
    (is (= (stemming "statutable") "statut"))))

(deftest test-2852
  (testing "test case 2852"
    (is (= (stemming "bushwack") "bushwack"))))

(deftest test-2853
  (testing "test case 2853"
    (is (= (stemming "trainsick") "trainsick"))))

(deftest test-2854
  (testing "test case 2854"
    (is (= (stemming "plunder") "plunder"))))

(deftest test-2855
  (testing "test case 2855"
    (is (= (stemming "administrants") "administr"))))

(deftest test-2856
  (testing "test case 2856"
    (is (= (stemming "sandpaper") "sandpap"))))

(deftest test-2857
  (testing "test case 2857"
    (is (= (stemming "brimstone") "brimston"))))

(deftest test-2858
  (testing "test case 2858"
    (is (= (stemming "melters") "melter"))))

(deftest test-2859
  (testing "test case 2859"
    (is (= (stemming "scrawniest") "scrawniest"))))

(deftest test-2860
  (testing "test case 2860"
    (is (= (stemming "fulltime") "fulltim"))))

(deftest test-2861
  (testing "test case 2861"
    (is (= (stemming "incapacitated") "incapacit"))))

(deftest test-2862
  (testing "test case 2862"
    (is (= (stemming "interceptors") "interceptor"))))

(deftest test-2863
  (testing "test case 2863"
    (is (= (stemming "everywhere") "everywher"))))

(deftest test-2864
  (testing "test case 2864"
    (is (= (stemming "smirker") "smirker"))))

(deftest test-2865
  (testing "test case 2865"
    (is (= (stemming "photoluminescent") "photoluminesc"))))

(deftest test-2866
  (testing "test case 2866"
    (is (= (stemming "blander") "blander"))))

(deftest test-2867
  (testing "test case 2867"
    (is (= (stemming "methodizing") "method"))))

(deftest test-2868
  (testing "test case 2868"
    (is (= (stemming "williwaws") "williwaw"))))

(deftest test-2869
  (testing "test case 2869"
    (is (= (stemming "tabard") "tabard"))))

(deftest test-2870
  (testing "test case 2870"
    (is (= (stemming "informers") "inform"))))

(deftest test-2871
  (testing "test case 2871"
    (is (= (stemming "proctoscopy") "proctoscopi"))))

(deftest test-2872
  (testing "test case 2872"
    (is (= (stemming "synaesthesia") "synaesthesia"))))

(deftest test-2873
  (testing "test case 2873"
    (is (= (stemming "eyeshade") "eyeshad"))))

(deftest test-2874
  (testing "test case 2874"
    (is (= (stemming "abhorrence") "abhorr"))))

(deftest test-2875
  (testing "test case 2875"
    (is (= (stemming "rags") "rag"))))

(deftest test-2876
  (testing "test case 2876"
    (is (= (stemming "playsuits") "playsuit"))))

(deftest test-2877
  (testing "test case 2877"
    (is (= (stemming "oscillometric") "oscillometr"))))

(deftest test-2878
  (testing "test case 2878"
    (is (= (stemming "thew") "thew"))))

(deftest test-2879
  (testing "test case 2879"
    (is (= (stemming "jato") "jato"))))

(deftest test-2880
  (testing "test case 2880"
    (is (= (stemming "parses") "pars"))))

(deftest test-2881
  (testing "test case 2881"
    (is (= (stemming "steeplejacks") "steeplejack"))))

(deftest test-2882
  (testing "test case 2882"
    (is (= (stemming "reinsuring") "reinsur"))))

(deftest test-2883
  (testing "test case 2883"
    (is (= (stemming "tangencies") "tangenc"))))

(deftest test-2884
  (testing "test case 2884"
    (is (= (stemming "nonimmunities") "nonimmun"))))

(deftest test-2885
  (testing "test case 2885"
    (is (= (stemming "verbalize") "verbal"))))

(deftest test-2886
  (testing "test case 2886"
    (is (= (stemming "trails") "trail"))))

(deftest test-2887
  (testing "test case 2887"
    (is (= (stemming "unmanning") "unman"))))

(deftest test-2888
  (testing "test case 2888"
    (is (= (stemming "gutters") "gutter"))))

(deftest test-2889
  (testing "test case 2889"
    (is (= (stemming "fightings") "fight"))))

(deftest test-2890
  (testing "test case 2890"
    (is (= (stemming "nicotines") "nicotin"))))

(deftest test-2891
  (testing "test case 2891"
    (is (= (stemming "pierces") "pierc"))))

(deftest test-2892
  (testing "test case 2892"
    (is (= (stemming "dogger") "dogger"))))

(deftest test-2893
  (testing "test case 2893"
    (is (= (stemming "simplest") "simplest"))))

(deftest test-2894
  (testing "test case 2894"
    (is (= (stemming "aligners") "align"))))

(deftest test-2895
  (testing "test case 2895"
    (is (= (stemming "forsee") "forse"))))

(deftest test-2896
  (testing "test case 2896"
    (is (= (stemming "trauma") "trauma"))))

(deftest test-2897
  (testing "test case 2897"
    (is (= (stemming "counsels") "counsel"))))

(deftest test-2898
  (testing "test case 2898"
    (is (= (stemming "savaging") "savag"))))

(deftest test-2899
  (testing "test case 2899"
    (is (= (stemming "trivially") "trivial"))))

(deftest test-2900
  (testing "test case 2900"
    (is (= (stemming "binocular") "binocular"))))

(deftest test-2901
  (testing "test case 2901"
    (is (= (stemming "increaser") "increas"))))

(deftest test-2902
  (testing "test case 2902"
    (is (= (stemming "bating") "bate"))))

(deftest test-2903
  (testing "test case 2903"
    (is (= (stemming "terminating") "termin"))))

(deftest test-2904
  (testing "test case 2904"
    (is (= (stemming "troubleshooters") "troubleshoot"))))

(deftest test-2905
  (testing "test case 2905"
    (is (= (stemming "videotape") "videotap"))))

(deftest test-2906
  (testing "test case 2906"
    (is (= (stemming "opting") "opt"))))

(deftest test-2907
  (testing "test case 2907"
    (is (= (stemming "underproduction") "underproduct"))))

(deftest test-2908
  (testing "test case 2908"
    (is (= (stemming "scalelike") "scalelik"))))

(deftest test-2909
  (testing "test case 2909"
    (is (= (stemming "beech") "beech"))))

(deftest test-2910
  (testing "test case 2910"
    (is (= (stemming "verses") "vers"))))

(deftest test-2911
  (testing "test case 2911"
    (is (= (stemming "catafalque") "catafalqu"))))

(deftest test-2912
  (testing "test case 2912"
    (is (= (stemming "willfully") "willfulli"))))

(deftest test-2913
  (testing "test case 2913"
    (is (= (stemming "unable") "unabl"))))

(deftest test-2914
  (testing "test case 2914"
    (is (= (stemming "depilatory") "depilatori"))))

(deftest test-2915
  (testing "test case 2915"
    (is (= (stemming "pituitaries") "pituitari"))))

(deftest test-2916
  (testing "test case 2916"
    (is (= (stemming "jetport") "jetport"))))

(deftest test-2917
  (testing "test case 2917"
    (is (= (stemming "bacteriophage") "bacteriophag"))))

(deftest test-2918
  (testing "test case 2918"
    (is (= (stemming "pickier") "pickier"))))

(deftest test-2919
  (testing "test case 2919"
    (is (= (stemming "teacake") "teacak"))))

(deftest test-2920
  (testing "test case 2920"
    (is (= (stemming "scrabbles") "scrabbl"))))

(deftest test-2921
  (testing "test case 2921"
    (is (= (stemming "mutilate") "mutil"))))

(deftest test-2922
  (testing "test case 2922"
    (is (= (stemming "devolved") "devolv"))))

(deftest test-2923
  (testing "test case 2923"
    (is (= (stemming "trajectory") "trajectori"))))

(deftest test-2924
  (testing "test case 2924"
    (is (= (stemming "sizzles") "sizzl"))))

(deftest test-2925
  (testing "test case 2925"
    (is (= (stemming "recommits") "recommit"))))

(deftest test-2926
  (testing "test case 2926"
    (is (= (stemming "frogfishes") "frogfish"))))

(deftest test-2927
  (testing "test case 2927"
    (is (= (stemming "tameness") "tame"))))

(deftest test-2928
  (testing "test case 2928"
    (is (= (stemming "stunning") "stun"))))

(deftest test-2929
  (testing "test case 2929"
    (is (= (stemming "phylae") "phyla"))))

(deftest test-2930
  (testing "test case 2930"
    (is (= (stemming "octavo") "octavo"))))

(deftest test-2931
  (testing "test case 2931"
    (is (= (stemming "torsoes") "torso"))))

(deftest test-2932
  (testing "test case 2932"
    (is (= (stemming "osculating") "oscul"))))

(deftest test-2933
  (testing "test case 2933"
    (is (= (stemming "chopper") "chopper"))))

(deftest test-2934
  (testing "test case 2934"
    (is (= (stemming "stonecutting") "stonecut"))))

(deftest test-2935
  (testing "test case 2935"
    (is (= (stemming "recognizable") "recogniz"))))

(deftest test-2936
  (testing "test case 2936"
    (is (= (stemming "emphasized") "emphas"))))

(deftest test-2937
  (testing "test case 2937"
    (is (= (stemming "kris") "kri"))))

(deftest test-2938
  (testing "test case 2938"
    (is (= (stemming "cupric") "cupric"))))

(deftest test-2939
  (testing "test case 2939"
    (is (= (stemming "minus") "minu"))))

(deftest test-2940
  (testing "test case 2940"
    (is (= (stemming "rehangs") "rehang"))))

(deftest test-2941
  (testing "test case 2941"
    (is (= (stemming "crinklier") "crinklier"))))

(deftest test-2942
  (testing "test case 2942"
    (is (= (stemming "ambers") "amber"))))

(deftest test-2943
  (testing "test case 2943"
    (is (= (stemming "nonoccurrence") "nonoccurr"))))

(deftest test-2944
  (testing "test case 2944"
    (is (= (stemming "attitudinizes") "attitudin"))))

(deftest test-2945
  (testing "test case 2945"
    (is (= (stemming "doodlers") "doodler"))))

(deftest test-2946
  (testing "test case 2946"
    (is (= (stemming "midnight") "midnight"))))

(deftest test-2947
  (testing "test case 2947"
    (is (= (stemming "calculuses") "calculus"))))

(deftest test-2948
  (testing "test case 2948"
    (is (= (stemming "kudus") "kudu"))))

(deftest test-2949
  (testing "test case 2949"
    (is (= (stemming "equivokes") "equivok"))))

(deftest test-2950
  (testing "test case 2950"
    (is (= (stemming "sugarcoated") "sugarco"))))

(deftest test-2951
  (testing "test case 2951"
    (is (= (stemming "spumes") "spume"))))

(deftest test-2952
  (testing "test case 2952"
    (is (= (stemming "electrotherapy") "electrotherapi"))))

(deftest test-2953
  (testing "test case 2953"
    (is (= (stemming "juveniles") "juvenil"))))

(deftest test-2954
  (testing "test case 2954"
    (is (= (stemming "cements") "cement"))))

(deftest test-2955
  (testing "test case 2955"
    (is (= (stemming "bipartisan") "bipartisan"))))

(deftest test-2956
  (testing "test case 2956"
    (is (= (stemming "raggle") "raggl"))))

(deftest test-2957
  (testing "test case 2957"
    (is (= (stemming "muckraked") "muckrak"))))

(deftest test-2958
  (testing "test case 2958"
    (is (= (stemming "scroll") "scroll"))))

(deftest test-2959
  (testing "test case 2959"
    (is (= (stemming "lepton") "lepton"))))

(deftest test-2960
  (testing "test case 2960"
    (is (= (stemming "amanitas") "amanita"))))

(deftest test-2961
  (testing "test case 2961"
    (is (= (stemming "suburbia") "suburbia"))))

(deftest test-2962
  (testing "test case 2962"
    (is (= (stemming "statesman") "statesman"))))

(deftest test-2963
  (testing "test case 2963"
    (is (= (stemming "wallahs") "wallah"))))

(deftest test-2964
  (testing "test case 2964"
    (is (= (stemming "gagger") "gagger"))))

(deftest test-2965
  (testing "test case 2965"
    (is (= (stemming "ruination") "ruinat"))))

(deftest test-2966
  (testing "test case 2966"
    (is (= (stemming "spectacle") "spectacl"))))

(deftest test-2967
  (testing "test case 2967"
    (is (= (stemming "fezzed") "fezz"))))

(deftest test-2968
  (testing "test case 2968"
    (is (= (stemming "humidifying") "humidifi"))))

(deftest test-2969
  (testing "test case 2969"
    (is (= (stemming "hausfraus") "hausfrau"))))

(deftest test-2970
  (testing "test case 2970"
    (is (= (stemming "newsier") "newsier"))))

(deftest test-2971
  (testing "test case 2971"
    (is (= (stemming "sundogs") "sundog"))))

(deftest test-2972
  (testing "test case 2972"
    (is (= (stemming "indecent") "indec"))))

(deftest test-2973
  (testing "test case 2973"
    (is (= (stemming "showrooms") "showroom"))))

(deftest test-2974
  (testing "test case 2974"
    (is (= (stemming "nonvascularly") "nonvascularli"))))

(deftest test-2975
  (testing "test case 2975"
    (is (= (stemming "encrusted") "encrust"))))

(deftest test-2976
  (testing "test case 2976"
    (is (= (stemming "masturbatory") "masturbatori"))))

(deftest test-2977
  (testing "test case 2977"
    (is (= (stemming "deletion") "delet"))))

(deftest test-2978
  (testing "test case 2978"
    (is (= (stemming "hoarder") "hoarder"))))

(deftest test-2979
  (testing "test case 2979"
    (is (= (stemming "micros") "micro"))))

(deftest test-2980
  (testing "test case 2980"
    (is (= (stemming "dapperer") "dapper"))))

(deftest test-2981
  (testing "test case 2981"
    (is (= (stemming "admixtures") "admixtur"))))

(deftest test-2982
  (testing "test case 2982"
    (is (= (stemming "tons") "ton"))))

(deftest test-2983
  (testing "test case 2983"
    (is (= (stemming "revelries") "revelri"))))

(deftest test-2984
  (testing "test case 2984"
    (is (= (stemming "gantlets") "gantlet"))))

(deftest test-2985
  (testing "test case 2985"
    (is (= (stemming "flanker") "flanker"))))

(deftest test-2986
  (testing "test case 2986"
    (is (= (stemming "encamping") "encamp"))))

(deftest test-2987
  (testing "test case 2987"
    (is (= (stemming "viragoes") "virago"))))

(deftest test-2988
  (testing "test case 2988"
    (is (= (stemming "rioter") "rioter"))))

(deftest test-2989
  (testing "test case 2989"
    (is (= (stemming "parsleys") "parslei"))))

(deftest test-2990
  (testing "test case 2990"
    (is (= (stemming "safflowers") "safflow"))))

(deftest test-2991
  (testing "test case 2991"
    (is (= (stemming "prosecuting") "prosecut"))))

(deftest test-2992
  (testing "test case 2992"
    (is (= (stemming "respiting") "respit"))))

(deftest test-2993
  (testing "test case 2993"
    (is (= (stemming "blowpipe") "blowpip"))))

(deftest test-2994
  (testing "test case 2994"
    (is (= (stemming "mined") "mine"))))

(deftest test-2995
  (testing "test case 2995"
    (is (= (stemming "amiable") "amiabl"))))

(deftest test-2996
  (testing "test case 2996"
    (is (= (stemming "thanklessly") "thanklessli"))))

(deftest test-2997
  (testing "test case 2997"
    (is (= (stemming "mayday") "maydai"))))

(deftest test-2998
  (testing "test case 2998"
    (is (= (stemming "heartstrings") "heartstr"))))

(deftest test-2999
  (testing "test case 2999"
    (is (= (stemming "troubled") "troubl"))))

(deftest test-3000
  (testing "test case 3000"
    (is (= (stemming "oligarch") "oligarch"))))

(deftest test-3001
  (testing "test case 3001"
    (is (= (stemming "programers") "program"))))

(deftest test-3002
  (testing "test case 3002"
    (is (= (stemming "mellowest") "mellowest"))))

(deftest test-3003
  (testing "test case 3003"
    (is (= (stemming "pasteurizer") "pasteur"))))

(deftest test-3004
  (testing "test case 3004"
    (is (= (stemming "windowless") "windowless"))))

(deftest test-3005
  (testing "test case 3005"
    (is (= (stemming "ginner") "ginner"))))

(deftest test-3006
  (testing "test case 3006"
    (is (= (stemming "outfitting") "outfit"))))

(deftest test-3007
  (testing "test case 3007"
    (is (= (stemming "landright") "landright"))))

(deftest test-3008
  (testing "test case 3008"
    (is (= (stemming "residual") "residu"))))

(deftest test-3009
  (testing "test case 3009"
    (is (= (stemming "blusher") "blusher"))))

(deftest test-3010
  (testing "test case 3010"
    (is (= (stemming "medusoid") "medusoid"))))

(deftest test-3011
  (testing "test case 3011"
    (is (= (stemming "heftier") "heftier"))))

(deftest test-3012
  (testing "test case 3012"
    (is (= (stemming "yachters") "yachter"))))

(deftest test-3013
  (testing "test case 3013"
    (is (= (stemming "hubris") "hubri"))))

(deftest test-3014
  (testing "test case 3014"
    (is (= (stemming "beseeches") "beseech"))))

(deftest test-3015
  (testing "test case 3015"
    (is (= (stemming "abreact") "abreact"))))

(deftest test-3016
  (testing "test case 3016"
    (is (= (stemming "gargler") "gargler"))))

(deftest test-3017
  (testing "test case 3017"
    (is (= (stemming "overlying") "overli"))))

(deftest test-3018
  (testing "test case 3018"
    (is (= (stemming "keeners") "keener"))))

(deftest test-3019
  (testing "test case 3019"
    (is (= (stemming "objurgated") "objurg"))))

(deftest test-3020
  (testing "test case 3020"
    (is (= (stemming "pinnate") "pinnat"))))

(deftest test-3021
  (testing "test case 3021"
    (is (= (stemming "discountenance") "discounten"))))

(deftest test-3022
  (testing "test case 3022"
    (is (= (stemming "segos") "sego"))))

(deftest test-3023
  (testing "test case 3023"
    (is (= (stemming "hayers") "hayer"))))

(deftest test-3024
  (testing "test case 3024"
    (is (= (stemming "mead") "mead"))))

(deftest test-3025
  (testing "test case 3025"
    (is (= (stemming "increases") "increas"))))

(deftest test-3026
  (testing "test case 3026"
    (is (= (stemming "enclave") "enclav"))))

(deftest test-3027
  (testing "test case 3027"
    (is (= (stemming "budgers") "budger"))))

(deftest test-3028
  (testing "test case 3028"
    (is (= (stemming "valiancy") "valianc"))))

(deftest test-3029
  (testing "test case 3029"
    (is (= (stemming "imagism") "imag"))))

(deftest test-3030
  (testing "test case 3030"
    (is (= (stemming "nomadically") "nomad"))))

(deftest test-3031
  (testing "test case 3031"
    (is (= (stemming "mackerel") "mackerel"))))

(deftest test-3032
  (testing "test case 3032"
    (is (= (stemming "conferring") "confer"))))

(deftest test-3033
  (testing "test case 3033"
    (is (= (stemming "predatory") "predatori"))))

(deftest test-3034
  (testing "test case 3034"
    (is (= (stemming "mandate") "mandat"))))

(deftest test-3035
  (testing "test case 3035"
    (is (= (stemming "disrupt") "disrupt"))))

(deftest test-3036
  (testing "test case 3036"
    (is (= (stemming "headforemost") "headforemost"))))

(deftest test-3037
  (testing "test case 3037"
    (is (= (stemming "hartford") "hartford"))))

(deftest test-3038
  (testing "test case 3038"
    (is (= (stemming "myna") "myna"))))

(deftest test-3039
  (testing "test case 3039"
    (is (= (stemming "undemonstrable") "undemonstr"))))

(deftest test-3040
  (testing "test case 3040"
    (is (= (stemming "arrowy") "arrowi"))))

(deftest test-3041
  (testing "test case 3041"
    (is (= (stemming "hawkbill") "hawkbil"))))

(deftest test-3042
  (testing "test case 3042"
    (is (= (stemming "herpetic") "herpet"))))

(deftest test-3043
  (testing "test case 3043"
    (is (= (stemming "canceling") "cancel"))))

(deftest test-3044
  (testing "test case 3044"
    (is (= (stemming "mismatch") "mismatch"))))

(deftest test-3045
  (testing "test case 3045"
    (is (= (stemming "shrink") "shrink"))))

(deftest test-3046
  (testing "test case 3046"
    (is (= (stemming "snappiness") "snappi"))))

(deftest test-3047
  (testing "test case 3047"
    (is (= (stemming "dissuading") "dissuad"))))

(deftest test-3048
  (testing "test case 3048"
    (is (= (stemming "expediency") "expedi"))))

(deftest test-3049
  (testing "test case 3049"
    (is (= (stemming "cycloids") "cycloid"))))

(deftest test-3050
  (testing "test case 3050"
    (is (= (stemming "tallowed") "tallow"))))

(deftest test-3051
  (testing "test case 3051"
    (is (= (stemming "aureolas") "aureola"))))

(deftest test-3052
  (testing "test case 3052"
    (is (= (stemming "unpin") "unpin"))))

(deftest test-3053
  (testing "test case 3053"
    (is (= (stemming "elf") "elf"))))

(deftest test-3054
  (testing "test case 3054"
    (is (= (stemming "pervaded") "pervad"))))

(deftest test-3055
  (testing "test case 3055"
    (is (= (stemming "lilliput") "lilliput"))))

(deftest test-3056
  (testing "test case 3056"
    (is (= (stemming "interludes") "interlud"))))

(deftest test-3057
  (testing "test case 3057"
    (is (= (stemming "ginghams") "gingham"))))

(deftest test-3058
  (testing "test case 3058"
    (is (= (stemming "subagencies") "subag"))))

(deftest test-3059
  (testing "test case 3059"
    (is (= (stemming "coopers") "cooper"))))

(deftest test-3060
  (testing "test case 3060"
    (is (= (stemming "granulate") "granul"))))

(deftest test-3061
  (testing "test case 3061"
    (is (= (stemming "isomerization") "isomer"))))

(deftest test-3062
  (testing "test case 3062"
    (is (= (stemming "voyageur") "voyageur"))))

(deftest test-3063
  (testing "test case 3063"
    (is (= (stemming "roomette") "roomett"))))

(deftest test-3064
  (testing "test case 3064"
    (is (= (stemming "unhorse") "unhors"))))

(deftest test-3065
  (testing "test case 3065"
    (is (= (stemming "charioting") "chariot"))))

(deftest test-3066
  (testing "test case 3066"
    (is (= (stemming "thiamin") "thiamin"))))

(deftest test-3067
  (testing "test case 3067"
    (is (= (stemming "smudging") "smudg"))))

(deftest test-3068
  (testing "test case 3068"
    (is (= (stemming "flashforwards") "flashforward"))))

(deftest test-3069
  (testing "test case 3069"
    (is (= (stemming "dragster") "dragster"))))

(deftest test-3070
  (testing "test case 3070"
    (is (= (stemming "patella") "patella"))))

(deftest test-3071
  (testing "test case 3071"
    (is (= (stemming "back") "back"))))

(deftest test-3072
  (testing "test case 3072"
    (is (= (stemming "recognizability") "recogniz"))))

(deftest test-3073
  (testing "test case 3073"
    (is (= (stemming "scream") "scream"))))

(deftest test-3074
  (testing "test case 3074"
    (is (= (stemming "dainties") "dainti"))))

(deftest test-3075
  (testing "test case 3075"
    (is (= (stemming "shamelessly") "shamelessli"))))

(deftest test-3076
  (testing "test case 3076"
    (is (= (stemming "blazonry") "blazonri"))))

(deftest test-3077
  (testing "test case 3077"
    (is (= (stemming "googols") "googol"))))

(deftest test-3078
  (testing "test case 3078"
    (is (= (stemming "afghani") "afghani"))))

(deftest test-3079
  (testing "test case 3079"
    (is (= (stemming "lusciousness") "luscious"))))

(deftest test-3080
  (testing "test case 3080"
    (is (= (stemming "fathering") "father"))))

(deftest test-3081
  (testing "test case 3081"
    (is (= (stemming "aquarium") "aquarium"))))

(deftest test-3082
  (testing "test case 3082"
    (is (= (stemming "iconoclasm") "iconoclasm"))))

(deftest test-3083
  (testing "test case 3083"
    (is (= (stemming "caffeines") "caffein"))))

(deftest test-3084
  (testing "test case 3084"
    (is (= (stemming "hampshireman") "hampshireman"))))

(deftest test-3085
  (testing "test case 3085"
    (is (= (stemming "unofficial") "unoffici"))))

(deftest test-3086
  (testing "test case 3086"
    (is (= (stemming "proctorial") "proctori"))))

(deftest test-3087
  (testing "test case 3087"
    (is (= (stemming "qualifiers") "qualifi"))))

(deftest test-3088
  (testing "test case 3088"
    (is (= (stemming "deprave") "deprav"))))

(deftest test-3089
  (testing "test case 3089"
    (is (= (stemming "tubulate") "tubul"))))

(deftest test-3090
  (testing "test case 3090"
    (is (= (stemming "crematories") "crematori"))))

(deftest test-3091
  (testing "test case 3091"
    (is (= (stemming "wirelessed") "wireless"))))

(deftest test-3092
  (testing "test case 3092"
    (is (= (stemming "unemployability") "unemploy"))))

(deftest test-3093
  (testing "test case 3093"
    (is (= (stemming "wassailer") "wassail"))))

(deftest test-3094
  (testing "test case 3094"
    (is (= (stemming "sludge") "sludg"))))

(deftest test-3095
  (testing "test case 3095"
    (is (= (stemming "statesmanship") "statesmanship"))))

(deftest test-3096
  (testing "test case 3096"
    (is (= (stemming "laureateship") "laureateship"))))

(deftest test-3097
  (testing "test case 3097"
    (is (= (stemming "autolyze") "autolyz"))))

(deftest test-3098
  (testing "test case 3098"
    (is (= (stemming "cubital") "cubit"))))

(deftest test-3099
  (testing "test case 3099"
    (is (= (stemming "gormandized") "gormand"))))

(deftest test-3100
  (testing "test case 3100"
    (is (= (stemming "arresters") "arrest"))))

(deftest test-3101
  (testing "test case 3101"
    (is (= (stemming "samisens") "samisen"))))

(deftest test-3102
  (testing "test case 3102"
    (is (= (stemming "greenhouse") "greenhous"))))

(deftest test-3103
  (testing "test case 3103"
    (is (= (stemming "extenuates") "extenu"))))

(deftest test-3104
  (testing "test case 3104"
    (is (= (stemming "laryngitic") "laryngit"))))

(deftest test-3105
  (testing "test case 3105"
    (is (= (stemming "malayan") "malayan"))))

(deftest test-3106
  (testing "test case 3106"
    (is (= (stemming "overburden") "overburden"))))

(deftest test-3107
  (testing "test case 3107"
    (is (= (stemming "articled") "articl"))))

(deftest test-3108
  (testing "test case 3108"
    (is (= (stemming "certainties") "certainti"))))

(deftest test-3109
  (testing "test case 3109"
    (is (= (stemming "cubbies") "cubbi"))))

(deftest test-3110
  (testing "test case 3110"
    (is (= (stemming "unsought") "unsought"))))

(deftest test-3111
  (testing "test case 3111"
    (is (= (stemming "cacaos") "cacao"))))

(deftest test-3112
  (testing "test case 3112"
    (is (= (stemming "outperform") "outperform"))))

(deftest test-3113
  (testing "test case 3113"
    (is (= (stemming "specifications") "specif"))))

(deftest test-3114
  (testing "test case 3114"
    (is (= (stemming "majestical") "majest"))))

(deftest test-3115
  (testing "test case 3115"
    (is (= (stemming "puttee") "putte"))))

(deftest test-3116
  (testing "test case 3116"
    (is (= (stemming "parable") "parabl"))))

(deftest test-3117
  (testing "test case 3117"
    (is (= (stemming "acceptor") "acceptor"))))

(deftest test-3118
  (testing "test case 3118"
    (is (= (stemming "fetuses") "fetus"))))

(deftest test-3119
  (testing "test case 3119"
    (is (= (stemming "malapert") "malapert"))))

(deftest test-3120
  (testing "test case 3120"
    (is (= (stemming "optometric") "optometr"))))

(deftest test-3121
  (testing "test case 3121"
    (is (= (stemming "taillights") "taillight"))))

(deftest test-3122
  (testing "test case 3122"
    (is (= (stemming "berm") "berm"))))

(deftest test-3123
  (testing "test case 3123"
    (is (= (stemming "shutterbug") "shutterbug"))))

(deftest test-3124
  (testing "test case 3124"
    (is (= (stemming "legibly") "legibl"))))

(deftest test-3125
  (testing "test case 3125"
    (is (= (stemming "mechanical") "mechan"))))

(deftest test-3126
  (testing "test case 3126"
    (is (= (stemming "stogies") "stogi"))))

(deftest test-3127
  (testing "test case 3127"
    (is (= (stemming "dooryard") "dooryard"))))

(deftest test-3128
  (testing "test case 3128"
    (is (= (stemming "nurseryman") "nurseryman"))))

(deftest test-3129
  (testing "test case 3129"
    (is (= (stemming "sheeter") "sheeter"))))

(deftest test-3130
  (testing "test case 3130"
    (is (= (stemming "annually") "annual"))))

(deftest test-3131
  (testing "test case 3131"
    (is (= (stemming "marquee") "marque"))))

(deftest test-3132
  (testing "test case 3132"
    (is (= (stemming "estimation") "estim"))))

(deftest test-3133
  (testing "test case 3133"
    (is (= (stemming "adit") "adit"))))

(deftest test-3134
  (testing "test case 3134"
    (is (= (stemming "enviers") "envier"))))

(deftest test-3135
  (testing "test case 3135"
    (is (= (stemming "peakish") "peakish"))))

(deftest test-3136
  (testing "test case 3136"
    (is (= (stemming "bossiest") "bossiest"))))

(deftest test-3137
  (testing "test case 3137"
    (is (= (stemming "exposition") "exposit"))))

(deftest test-3138
  (testing "test case 3138"
    (is (= (stemming "cathouse") "cathous"))))

(deftest test-3139
  (testing "test case 3139"
    (is (= (stemming "tranced") "tranc"))))

(deftest test-3140
  (testing "test case 3140"
    (is (= (stemming "emoting") "emot"))))

(deftest test-3141
  (testing "test case 3141"
    (is (= (stemming "lances") "lanc"))))

(deftest test-3142
  (testing "test case 3142"
    (is (= (stemming "humbles") "humbl"))))

(deftest test-3143
  (testing "test case 3143"
    (is (= (stemming "mantuas") "mantua"))))

(deftest test-3144
  (testing "test case 3144"
    (is (= (stemming "liveries") "liveri"))))

(deftest test-3145
  (testing "test case 3145"
    (is (= (stemming "eutrophication") "eutroph"))))

(deftest test-3146
  (testing "test case 3146"
    (is (= (stemming "wipeouts") "wipeout"))))

(deftest test-3147
  (testing "test case 3147"
    (is (= (stemming "chondrites") "chondrit"))))

(deftest test-3148
  (testing "test case 3148"
    (is (= (stemming "backfield") "backfield"))))

(deftest test-3149
  (testing "test case 3149"
    (is (= (stemming "wrinkled") "wrinkl"))))

(deftest test-3150
  (testing "test case 3150"
    (is (= (stemming "validated") "valid"))))

(deftest test-3151
  (testing "test case 3151"
    (is (= (stemming "pyromania") "pyromania"))))

(deftest test-3152
  (testing "test case 3152"
    (is (= (stemming "thirstiness") "thirsti"))))

(deftest test-3153
  (testing "test case 3153"
    (is (= (stemming "savate") "savat"))))

(deftest test-3154
  (testing "test case 3154"
    (is (= (stemming "ballroom") "ballroom"))))

(deftest test-3155
  (testing "test case 3155"
    (is (= (stemming "preacher") "preacher"))))

(deftest test-3156
  (testing "test case 3156"
    (is (= (stemming "humidistat") "humidistat"))))

(deftest test-3157
  (testing "test case 3157"
    (is (= (stemming "filmed") "film"))))

(deftest test-3158
  (testing "test case 3158"
    (is (= (stemming "incubation") "incub"))))

(deftest test-3159
  (testing "test case 3159"
    (is (= (stemming "job") "job"))))

(deftest test-3160
  (testing "test case 3160"
    (is (= (stemming "outproduces") "outproduc"))))

(deftest test-3161
  (testing "test case 3161"
    (is (= (stemming "glossies") "glossi"))))

(deftest test-3162
  (testing "test case 3162"
    (is (= (stemming "leasings") "leas"))))

(deftest test-3163
  (testing "test case 3163"
    (is (= (stemming "proffer") "proffer"))))

(deftest test-3164
  (testing "test case 3164"
    (is (= (stemming "disassimilated") "disassimil"))))

(deftest test-3165
  (testing "test case 3165"
    (is (= (stemming "annulled") "annul"))))

(deftest test-3166
  (testing "test case 3166"
    (is (= (stemming "credulity") "credul"))))

(deftest test-3167
  (testing "test case 3167"
    (is (= (stemming "foliates") "foliat"))))

(deftest test-3168
  (testing "test case 3168"
    (is (= (stemming "propositions") "proposit"))))

(deftest test-3169
  (testing "test case 3169"
    (is (= (stemming "negro") "negro"))))

(deftest test-3170
  (testing "test case 3170"
    (is (= (stemming "sn") "sn"))))

(deftest test-3171
  (testing "test case 3171"
    (is (= (stemming "unconscious") "unconsci"))))

(deftest test-3172
  (testing "test case 3172"
    (is (= (stemming "hoodless") "hoodless"))))

(deftest test-3173
  (testing "test case 3173"
    (is (= (stemming "pikeman") "pikeman"))))

(deftest test-3174
  (testing "test case 3174"
    (is (= (stemming "torpedoed") "torpedo"))))

(deftest test-3175
  (testing "test case 3175"
    (is (= (stemming "catmint") "catmint"))))

(deftest test-3176
  (testing "test case 3176"
    (is (= (stemming "interfering") "interf"))))

(deftest test-3177
  (testing "test case 3177"
    (is (= (stemming "closefitting") "closefit"))))

(deftest test-3178
  (testing "test case 3178"
    (is (= (stemming "wherever") "wherev"))))

(deftest test-3179
  (testing "test case 3179"
    (is (= (stemming "hosting") "host"))))

(deftest test-3180
  (testing "test case 3180"
    (is (= (stemming "salacity") "salac"))))

(deftest test-3181
  (testing "test case 3181"
    (is (= (stemming "fatstocks") "fatstock"))))

(deftest test-3182
  (testing "test case 3182"
    (is (= (stemming "beaten") "beaten"))))

(deftest test-3183
  (testing "test case 3183"
    (is (= (stemming "manipulation") "manipul"))))

(deftest test-3184
  (testing "test case 3184"
    (is (= (stemming "indiscreetness") "indiscreet"))))

(deftest test-3185
  (testing "test case 3185"
    (is (= (stemming "umbilicuses") "umbilicus"))))

(deftest test-3186
  (testing "test case 3186"
    (is (= (stemming "ingested") "ingest"))))

(deftest test-3187
  (testing "test case 3187"
    (is (= (stemming "imbecilic") "imbecil"))))

(deftest test-3188
  (testing "test case 3188"
    (is (= (stemming "rookier") "rookier"))))

(deftest test-3189
  (testing "test case 3189"
    (is (= (stemming "monitories") "monitori"))))

(deftest test-3190
  (testing "test case 3190"
    (is (= (stemming "pockier") "pockier"))))

(deftest test-3191
  (testing "test case 3191"
    (is (= (stemming "tudor") "tudor"))))

(deftest test-3192
  (testing "test case 3192"
    (is (= (stemming "mantelpieces") "mantelpiec"))))

(deftest test-3193
  (testing "test case 3193"
    (is (= (stemming "basils") "basil"))))

(deftest test-3194
  (testing "test case 3194"
    (is (= (stemming "rancours") "rancour"))))

(deftest test-3195
  (testing "test case 3195"
    (is (= (stemming "tympani") "tympani"))))

(deftest test-3196
  (testing "test case 3196"
    (is (= (stemming "ministrant") "ministr"))))

(deftest test-3197
  (testing "test case 3197"
    (is (= (stemming "burrows") "burrow"))))

(deftest test-3198
  (testing "test case 3198"
    (is (= (stemming "unlabeled") "unlabel"))))

(deftest test-3199
  (testing "test case 3199"
    (is (= (stemming "negativeness") "neg"))))

(deftest test-3200
  (testing "test case 3200"
    (is (= (stemming "marooned") "maroon"))))

(deftest test-3201
  (testing "test case 3201"
    (is (= (stemming "newtonian") "newtonian"))))

(deftest test-3202
  (testing "test case 3202"
    (is (= (stemming "schoolmistress") "schoolmistress"))))

(deftest test-3203
  (testing "test case 3203"
    (is (= (stemming "enscrolled") "enscrol"))))

(deftest test-3204
  (testing "test case 3204"
    (is (= (stemming "grograms") "grogram"))))

(deftest test-3205
  (testing "test case 3205"
    (is (= (stemming "undone") "undon"))))

(deftest test-3206
  (testing "test case 3206"
    (is (= (stemming "mistypes") "mistyp"))))

(deftest test-3207
  (testing "test case 3207"
    (is (= (stemming "rubes") "rube"))))

(deftest test-3208
  (testing "test case 3208"
    (is (= (stemming "crawlspace") "crawlspac"))))

(deftest test-3209
  (testing "test case 3209"
    (is (= (stemming "fractured") "fractur"))))

(deftest test-3210
  (testing "test case 3210"
    (is (= (stemming "bazaar") "bazaar"))))

(deftest test-3211
  (testing "test case 3211"
    (is (= (stemming "locoing") "loco"))))

(deftest test-3212
  (testing "test case 3212"
    (is (= (stemming "molecules") "molecul"))))

(deftest test-3213
  (testing "test case 3213"
    (is (= (stemming "lignification") "lignif"))))

(deftest test-3214
  (testing "test case 3214"
    (is (= (stemming "utilizes") "util"))))

(deftest test-3215
  (testing "test case 3215"
    (is (= (stemming "disruptively") "disrupt"))))

(deftest test-3216
  (testing "test case 3216"
    (is (= (stemming "cockspurs") "cockspur"))))

(deftest test-3217
  (testing "test case 3217"
    (is (= (stemming "rhyta") "rhyta"))))

(deftest test-3218
  (testing "test case 3218"
    (is (= (stemming "lackeys") "lackei"))))

(deftest test-3219
  (testing "test case 3219"
    (is (= (stemming "eurasians") "eurasian"))))

(deftest test-3220
  (testing "test case 3220"
    (is (= (stemming "trustee") "truste"))))

(deftest test-3221
  (testing "test case 3221"
    (is (= (stemming "sitters") "sitter"))))

(deftest test-3222
  (testing "test case 3222"
    (is (= (stemming "confectioneries") "confectioneri"))))

(deftest test-3223
  (testing "test case 3223"
    (is (= (stemming "dishevelment") "dishevel"))))

(deftest test-3224
  (testing "test case 3224"
    (is (= (stemming "sucroses") "sucros"))))

(deftest test-3225
  (testing "test case 3225"
    (is (= (stemming "sherberts") "sherbert"))))

(deftest test-3226
  (testing "test case 3226"
    (is (= (stemming "airedale") "airedal"))))

(deftest test-3227
  (testing "test case 3227"
    (is (= (stemming "toepieces") "toepiec"))))

(deftest test-3228
  (testing "test case 3228"
    (is (= (stemming "heavies") "heavi"))))

(deftest test-3229
  (testing "test case 3229"
    (is (= (stemming "incloser") "inclos"))))

(deftest test-3230
  (testing "test case 3230"
    (is (= (stemming "searchable") "searchabl"))))

(deftest test-3231
  (testing "test case 3231"
    (is (= (stemming "edison") "edison"))))

(deftest test-3232
  (testing "test case 3232"
    (is (= (stemming "spellbinders") "spellbind"))))

(deftest test-3233
  (testing "test case 3233"
    (is (= (stemming "ribosomes") "ribosom"))))

(deftest test-3234
  (testing "test case 3234"
    (is (= (stemming "alterations") "alter"))))

(deftest test-3235
  (testing "test case 3235"
    (is (= (stemming "transportability") "transport"))))

(deftest test-3236
  (testing "test case 3236"
    (is (= (stemming "unscarred") "unscar"))))

(deftest test-3237
  (testing "test case 3237"
    (is (= (stemming "sublimity") "sublim"))))

(deftest test-3238
  (testing "test case 3238"
    (is (= (stemming "overdramatized") "overdramat"))))

(deftest test-3239
  (testing "test case 3239"
    (is (= (stemming "guttersnipe") "guttersnip"))))

(deftest test-3240
  (testing "test case 3240"
    (is (= (stemming "unrentable") "unrent"))))

(deftest test-3241
  (testing "test case 3241"
    (is (= (stemming "undergone") "undergon"))))

(deftest test-3242
  (testing "test case 3242"
    (is (= (stemming "millable") "millabl"))))

(deftest test-3243
  (testing "test case 3243"
    (is (= (stemming "morocco") "morocco"))))

(deftest test-3244
  (testing "test case 3244"
    (is (= (stemming "windpipe") "windpip"))))

(deftest test-3245
  (testing "test case 3245"
    (is (= (stemming "rubbery") "rubberi"))))

(deftest test-3246
  (testing "test case 3246"
    (is (= (stemming "hencoop") "hencoop"))))

(deftest test-3247
  (testing "test case 3247"
    (is (= (stemming "insurability") "insur"))))

(deftest test-3248
  (testing "test case 3248"
    (is (= (stemming "metrifies") "metrifi"))))

(deftest test-3249
  (testing "test case 3249"
    (is (= (stemming "backbend") "backbend"))))

(deftest test-3250
  (testing "test case 3250"
    (is (= (stemming "expectorated") "expector"))))

(deftest test-3251
  (testing "test case 3251"
    (is (= (stemming "quacked") "quack"))))

(deftest test-3252
  (testing "test case 3252"
    (is (= (stemming "parakeets") "parakeet"))))

(deftest test-3253
  (testing "test case 3253"
    (is (= (stemming "standardizes") "standard"))))

(deftest test-3254
  (testing "test case 3254"
    (is (= (stemming "teetotaled") "teetot"))))

(deftest test-3255
  (testing "test case 3255"
    (is (= (stemming "blocks") "block"))))

(deftest test-3256
  (testing "test case 3256"
    (is (= (stemming "clammy") "clammi"))))

(deftest test-3257
  (testing "test case 3257"
    (is (= (stemming "covenantor") "covenantor"))))

(deftest test-3258
  (testing "test case 3258"
    (is (= (stemming "schmaltz") "schmaltz"))))

(deftest test-3259
  (testing "test case 3259"
    (is (= (stemming "shrieky") "shrieki"))))

(deftest test-3260
  (testing "test case 3260"
    (is (= (stemming "flaggy") "flaggi"))))

(deftest test-3261
  (testing "test case 3261"
    (is (= (stemming "pressrun") "pressrun"))))

(deftest test-3262
  (testing "test case 3262"
    (is (= (stemming "anterior") "anterior"))))

(deftest test-3263
  (testing "test case 3263"
    (is (= (stemming "dogmatism") "dogmat"))))

(deftest test-3264
  (testing "test case 3264"
    (is (= (stemming "wriggle") "wriggl"))))

(deftest test-3265
  (testing "test case 3265"
    (is (= (stemming "unstructured") "unstructur"))))

(deftest test-3266
  (testing "test case 3266"
    (is (= (stemming "saith") "saith"))))

(deftest test-3267
  (testing "test case 3267"
    (is (= (stemming "haughtier") "haughtier"))))

(deftest test-3268
  (testing "test case 3268"
    (is (= (stemming "inflections") "inflect"))))

(deftest test-3269
  (testing "test case 3269"
    (is (= (stemming "grays") "grai"))))

(deftest test-3270
  (testing "test case 3270"
    (is (= (stemming "checkable") "checkabl"))))

(deftest test-3271
  (testing "test case 3271"
    (is (= (stemming "archimandrites") "archimandrit"))))

(deftest test-3272
  (testing "test case 3272"
    (is (= (stemming "toolmaker") "toolmak"))))

(deftest test-3273
  (testing "test case 3273"
    (is (= (stemming "vaporizers") "vapor"))))

(deftest test-3274
  (testing "test case 3274"
    (is (= (stemming "depoliticizing") "depolitic"))))

(deftest test-3275
  (testing "test case 3275"
    (is (= (stemming "train") "train"))))

(deftest test-3276
  (testing "test case 3276"
    (is (= (stemming "magniloquence") "magniloqu"))))

(deftest test-3277
  (testing "test case 3277"
    (is (= (stemming "statable") "statabl"))))

(deftest test-3278
  (testing "test case 3278"
    (is (= (stemming "protectresses") "protectress"))))

(deftest test-3279
  (testing "test case 3279"
    (is (= (stemming "ascendence") "ascend"))))

(deftest test-3280
  (testing "test case 3280"
    (is (= (stemming "illumes") "illum"))))

(deftest test-3281
  (testing "test case 3281"
    (is (= (stemming "subdeacon") "subdeacon"))))

(deftest test-3282
  (testing "test case 3282"
    (is (= (stemming "clickers") "clicker"))))

(deftest test-3283
  (testing "test case 3283"
    (is (= (stemming "presentations") "present"))))

(deftest test-3284
  (testing "test case 3284"
    (is (= (stemming "grubstakes") "grubstak"))))

(deftest test-3285
  (testing "test case 3285"
    (is (= (stemming "silt") "silt"))))

(deftest test-3286
  (testing "test case 3286"
    (is (= (stemming "hid") "hid"))))

(deftest test-3287
  (testing "test case 3287"
    (is (= (stemming "frankness") "frank"))))

(deftest test-3288
  (testing "test case 3288"
    (is (= (stemming "eavesdropping") "eavesdrop"))))

(deftest test-3289
  (testing "test case 3289"
    (is (= (stemming "psychotomimetic") "psychotomimet"))))

(deftest test-3290
  (testing "test case 3290"
    (is (= (stemming "buicks") "buick"))))

(deftest test-3291
  (testing "test case 3291"
    (is (= (stemming "greenbacks") "greenback"))))

(deftest test-3292
  (testing "test case 3292"
    (is (= (stemming "werewolf") "werewolf"))))

(deftest test-3293
  (testing "test case 3293"
    (is (= (stemming "manuscript") "manuscript"))))

(deftest test-3294
  (testing "test case 3294"
    (is (= (stemming "crayons") "crayon"))))

(deftest test-3295
  (testing "test case 3295"
    (is (= (stemming "nexuses") "nexus"))))

(deftest test-3296
  (testing "test case 3296"
    (is (= (stemming "granularly") "granularli"))))

(deftest test-3297
  (testing "test case 3297"
    (is (= (stemming "unisexual") "unisexu"))))

(deftest test-3298
  (testing "test case 3298"
    (is (= (stemming "saddlebows") "saddlebow"))))

(deftest test-3299
  (testing "test case 3299"
    (is (= (stemming "brokerly") "brokerli"))))

(deftest test-3300
  (testing "test case 3300"
    (is (= (stemming "astrology") "astrolog"))))

(deftest test-3301
  (testing "test case 3301"
    (is (= (stemming "methodological") "methodolog"))))

(deftest test-3302
  (testing "test case 3302"
    (is (= (stemming "jimsonweed") "jimsonwe"))))

(deftest test-3303
  (testing "test case 3303"
    (is (= (stemming "vacationers") "vacation"))))

(deftest test-3304
  (testing "test case 3304"
    (is (= (stemming "misfitted") "misfit"))))

(deftest test-3305
  (testing "test case 3305"
    (is (= (stemming "sandstone") "sandston"))))

(deftest test-3306
  (testing "test case 3306"
    (is (= (stemming "locators") "locat"))))

(deftest test-3307
  (testing "test case 3307"
    (is (= (stemming "demote") "demot"))))

(deftest test-3308
  (testing "test case 3308"
    (is (= (stemming "linguist") "linguist"))))

(deftest test-3309
  (testing "test case 3309"
    (is (= (stemming "sobbingly") "sobbingli"))))

(deftest test-3310
  (testing "test case 3310"
    (is (= (stemming "sveltest") "sveltest"))))

(deftest test-3311
  (testing "test case 3311"
    (is (= (stemming "mall") "mall"))))

(deftest test-3312
  (testing "test case 3312"
    (is (= (stemming "savannahs") "savannah"))))

(deftest test-3313
  (testing "test case 3313"
    (is (= (stemming "pressurize") "pressur"))))

(deftest test-3314
  (testing "test case 3314"
    (is (= (stemming "episcopally") "episcop"))))

(deftest test-3315
  (testing "test case 3315"
    (is (= (stemming "funnies") "funni"))))

(deftest test-3316
  (testing "test case 3316"
    (is (= (stemming "hygienists") "hygienist"))))

(deftest test-3317
  (testing "test case 3317"
    (is (= (stemming "hotboxes") "hotbox"))))

(deftest test-3318
  (testing "test case 3318"
    (is (= (stemming "instituting") "institut"))))

(deftest test-3319
  (testing "test case 3319"
    (is (= (stemming "mournful") "mourn"))))

(deftest test-3320
  (testing "test case 3320"
    (is (= (stemming "intersected") "intersect"))))

(deftest test-3321
  (testing "test case 3321"
    (is (= (stemming "abeyancies") "abey"))))

(deftest test-3322
  (testing "test case 3322"
    (is (= (stemming "ejects") "eject"))))

(deftest test-3323
  (testing "test case 3323"
    (is (= (stemming "elastomer") "elastom"))))

(deftest test-3324
  (testing "test case 3324"
    (is (= (stemming "tate") "tate"))))

(deftest test-3325
  (testing "test case 3325"
    (is (= (stemming "calmed") "calm"))))

(deftest test-3326
  (testing "test case 3326"
    (is (= (stemming "lampposts") "lamppost"))))

(deftest test-3327
  (testing "test case 3327"
    (is (= (stemming "sultry") "sultri"))))

(deftest test-3328
  (testing "test case 3328"
    (is (= (stemming "tellers") "teller"))))

(deftest test-3329
  (testing "test case 3329"
    (is (= (stemming "immoderately") "immoder"))))

(deftest test-3330
  (testing "test case 3330"
    (is (= (stemming "unfrozen") "unfrozen"))))

(deftest test-3331
  (testing "test case 3331"
    (is (= (stemming "thralldom") "thralldom"))))

(deftest test-3332
  (testing "test case 3332"
    (is (= (stemming "dilatory") "dilatori"))))

(deftest test-3333
  (testing "test case 3333"
    (is (= (stemming "coiffed") "coif"))))

(deftest test-3334
  (testing "test case 3334"
    (is (= (stemming "inviters") "invit"))))

(deftest test-3335
  (testing "test case 3335"
    (is (= (stemming "yellow") "yellow"))))

(deftest test-3336
  (testing "test case 3336"
    (is (= (stemming "paralyzed") "paralyz"))))

(deftest test-3337
  (testing "test case 3337"
    (is (= (stemming "rationalities") "ration"))))

(deftest test-3338
  (testing "test case 3338"
    (is (= (stemming "bagging") "bag"))))

(deftest test-3339
  (testing "test case 3339"
    (is (= (stemming "grimmer") "grimmer"))))

(deftest test-3340
  (testing "test case 3340"
    (is (= (stemming "anoia") "anoia"))))

(deftest test-3341
  (testing "test case 3341"
    (is (= (stemming "downcast") "downcast"))))

(deftest test-3342
  (testing "test case 3342"
    (is (= (stemming "carbonless") "carbonless"))))

(deftest test-3343
  (testing "test case 3343"
    (is (= (stemming "versus") "versu"))))

(deftest test-3344
  (testing "test case 3344"
    (is (= (stemming "dramamine") "dramamin"))))

(deftest test-3345
  (testing "test case 3345"
    (is (= (stemming "drys") "dry"))))

(deftest test-3346
  (testing "test case 3346"
    (is (= (stemming "klystron") "klystron"))))

(deftest test-3347
  (testing "test case 3347"
    (is (= (stemming "earshots") "earshot"))))

(deftest test-3348
  (testing "test case 3348"
    (is (= (stemming "sawfish") "sawfish"))))

(deftest test-3349
  (testing "test case 3349"
    (is (= (stemming "shelver") "shelver"))))

(deftest test-3350
  (testing "test case 3350"
    (is (= (stemming "wonky") "wonki"))))

(deftest test-3351
  (testing "test case 3351"
    (is (= (stemming "churching") "church"))))

(deftest test-3352
  (testing "test case 3352"
    (is (= (stemming "storehouse") "storehous"))))

(deftest test-3353
  (testing "test case 3353"
    (is (= (stemming "laundering") "launder"))))

(deftest test-3354
  (testing "test case 3354"
    (is (= (stemming "coulters") "coulter"))))

(deftest test-3355
  (testing "test case 3355"
    (is (= (stemming "singeing") "sing"))))

(deftest test-3356
  (testing "test case 3356"
    (is (= (stemming "storybooks") "storybook"))))

(deftest test-3357
  (testing "test case 3357"
    (is (= (stemming "dryad") "dryad"))))

(deftest test-3358
  (testing "test case 3358"
    (is (= (stemming "thousandths") "thousandth"))))

(deftest test-3359
  (testing "test case 3359"
    (is (= (stemming "ego") "ego"))))

(deftest test-3360
  (testing "test case 3360"
    (is (= (stemming "rabbiting") "rabbit"))))

(deftest test-3361
  (testing "test case 3361"
    (is (= (stemming "veneration") "vener"))))

(deftest test-3362
  (testing "test case 3362"
    (is (= (stemming "goy") "goi"))))

(deftest test-3363
  (testing "test case 3363"
    (is (= (stemming "hats") "hat"))))

(deftest test-3364
  (testing "test case 3364"
    (is (= (stemming "law") "law"))))

(deftest test-3365
  (testing "test case 3365"
    (is (= (stemming "constitutionally") "constitution"))))

(deftest test-3366
  (testing "test case 3366"
    (is (= (stemming "defrosters") "defrost"))))

(deftest test-3367
  (testing "test case 3367"
    (is (= (stemming "plasticizer") "plastic"))))

(deftest test-3368
  (testing "test case 3368"
    (is (= (stemming "swerves") "swerv"))))

(deftest test-3369
  (testing "test case 3369"
    (is (= (stemming "statistical") "statist"))))

(deftest test-3370
  (testing "test case 3370"
    (is (= (stemming "sulphuring") "sulphur"))))

(deftest test-3371
  (testing "test case 3371"
    (is (= (stemming "precipitousness") "precipit"))))

(deftest test-3372
  (testing "test case 3372"
    (is (= (stemming "piker") "piker"))))

(deftest test-3373
  (testing "test case 3373"
    (is (= (stemming "infinity") "infin"))))

(deftest test-3374
  (testing "test case 3374"
    (is (= (stemming "blipped") "blip"))))

(deftest test-3375
  (testing "test case 3375"
    (is (= (stemming "antagonist") "antagonist"))))

(deftest test-3376
  (testing "test case 3376"
    (is (= (stemming "tragedienne") "tragedienn"))))

(deftest test-3377
  (testing "test case 3377"
    (is (= (stemming "potherb") "potherb"))))

(deftest test-3378
  (testing "test case 3378"
    (is (= (stemming "puffery") "pufferi"))))

(deftest test-3379
  (testing "test case 3379"
    (is (= (stemming "immunize") "immun"))))

(deftest test-3380
  (testing "test case 3380"
    (is (= (stemming "carrom") "carrom"))))

(deftest test-3381
  (testing "test case 3381"
    (is (= (stemming "disembarkations") "disembark"))))

(deftest test-3382
  (testing "test case 3382"
    (is (= (stemming "galvanizations") "galvan"))))

(deftest test-3383
  (testing "test case 3383"
    (is (= (stemming "aeolian") "aeolian"))))

(deftest test-3384
  (testing "test case 3384"
    (is (= (stemming "wagoner") "wagon"))))

(deftest test-3385
  (testing "test case 3385"
    (is (= (stemming "routing") "rout"))))

(deftest test-3386
  (testing "test case 3386"
    (is (= (stemming "inflammative") "inflamm"))))

(deftest test-3387
  (testing "test case 3387"
    (is (= (stemming "catabolizing") "catabol"))))

(deftest test-3388
  (testing "test case 3388"
    (is (= (stemming "congers") "conger"))))

(deftest test-3389
  (testing "test case 3389"
    (is (= (stemming "anchorites") "anchorit"))))

(deftest test-3390
  (testing "test case 3390"
    (is (= (stemming "trisects") "trisect"))))

(deftest test-3391
  (testing "test case 3391"
    (is (= (stemming "bedcover") "bedcov"))))

(deftest test-3392
  (testing "test case 3392"
    (is (= (stemming "retinues") "retinu"))))

(deftest test-3393
  (testing "test case 3393"
    (is (= (stemming "horribly") "horribl"))))

(deftest test-3394
  (testing "test case 3394"
    (is (= (stemming "cheap") "cheap"))))

(deftest test-3395
  (testing "test case 3395"
    (is (= (stemming "eunuchoid") "eunuchoid"))))

(deftest test-3396
  (testing "test case 3396"
    (is (= (stemming "bottleneck") "bottleneck"))))

(deftest test-3397
  (testing "test case 3397"
    (is (= (stemming "accountant") "account"))))

(deftest test-3398
  (testing "test case 3398"
    (is (= (stemming "moulded") "mould"))))

(deftest test-3399
  (testing "test case 3399"
    (is (= (stemming "unknot") "unknot"))))

(deftest test-3400
  (testing "test case 3400"
    (is (= (stemming "crematoria") "crematoria"))))

(deftest test-3401
  (testing "test case 3401"
    (is (= (stemming "crabbily") "crabbili"))))

(deftest test-3402
  (testing "test case 3402"
    (is (= (stemming "tyrannies") "tyranni"))))

(deftest test-3403
  (testing "test case 3403"
    (is (= (stemming "councilor") "councilor"))))

(deftest test-3404
  (testing "test case 3404"
    (is (= (stemming "cowled") "cowl"))))

(deftest test-3405
  (testing "test case 3405"
    (is (= (stemming "milkier") "milkier"))))

(deftest test-3406
  (testing "test case 3406"
    (is (= (stemming "handling") "handl"))))

(deftest test-3407
  (testing "test case 3407"
    (is (= (stemming "teetotalers") "teetotal"))))

(deftest test-3408
  (testing "test case 3408"
    (is (= (stemming "premiered") "premier"))))

(deftest test-3409
  (testing "test case 3409"
    (is (= (stemming "frilliness") "frilli"))))

(deftest test-3410
  (testing "test case 3410"
    (is (= (stemming "abrogators") "abrog"))))

(deftest test-3411
  (testing "test case 3411"
    (is (= (stemming "bawdies") "bawdi"))))

(deftest test-3412
  (testing "test case 3412"
    (is (= (stemming "canasta") "canasta"))))

(deftest test-3413
  (testing "test case 3413"
    (is (= (stemming "spoilsmen") "spoilsmen"))))

(deftest test-3414
  (testing "test case 3414"
    (is (= (stemming "clematises") "clematis"))))

(deftest test-3415
  (testing "test case 3415"
    (is (= (stemming "disturbances") "disturb"))))

(deftest test-3416
  (testing "test case 3416"
    (is (= (stemming "passings") "pass"))))

(deftest test-3417
  (testing "test case 3417"
    (is (= (stemming "leptons") "lepton"))))

(deftest test-3418
  (testing "test case 3418"
    (is (= (stemming "megabits") "megabit"))))

(deftest test-3419
  (testing "test case 3419"
    (is (= (stemming "airscrew") "airscrew"))))

(deftest test-3420
  (testing "test case 3420"
    (is (= (stemming "relishing") "relish"))))

(deftest test-3421
  (testing "test case 3421"
    (is (= (stemming "savannah") "savannah"))))

(deftest test-3422
  (testing "test case 3422"
    (is (= (stemming "crepuscular") "crepuscular"))))

(deftest test-3423
  (testing "test case 3423"
    (is (= (stemming "infinitesimal") "infinitesim"))))

(deftest test-3424
  (testing "test case 3424"
    (is (= (stemming "wholesomely") "wholesom"))))

(deftest test-3425
  (testing "test case 3425"
    (is (= (stemming "chowdering") "chowder"))))

(deftest test-3426
  (testing "test case 3426"
    (is (= (stemming "bawlers") "bawler"))))

(deftest test-3427
  (testing "test case 3427"
    (is (= (stemming "misreports") "misreport"))))

(deftest test-3428
  (testing "test case 3428"
    (is (= (stemming "checkerboards") "checkerboard"))))

(deftest test-3429
  (testing "test case 3429"
    (is (= (stemming "cakier") "cakier"))))

(deftest test-3430
  (testing "test case 3430"
    (is (= (stemming "canzones") "canzon"))))

(deftest test-3431
  (testing "test case 3431"
    (is (= (stemming "hoosier") "hoosier"))))

(deftest test-3432
  (testing "test case 3432"
    (is (= (stemming "scriptures") "scriptur"))))

(deftest test-3433
  (testing "test case 3433"
    (is (= (stemming "fuller") "fuller"))))

(deftest test-3434
  (testing "test case 3434"
    (is (= (stemming "discoverable") "discover"))))

(deftest test-3435
  (testing "test case 3435"
    (is (= (stemming "spoilages") "spoilag"))))

(deftest test-3436
  (testing "test case 3436"
    (is (= (stemming "camped") "camp"))))

(deftest test-3437
  (testing "test case 3437"
    (is (= (stemming "upswelled") "upswel"))))

(deftest test-3438
  (testing "test case 3438"
    (is (= (stemming "pleasantness") "pleasant"))))

(deftest test-3439
  (testing "test case 3439"
    (is (= (stemming "intervals") "interv"))))

(deftest test-3440
  (testing "test case 3440"
    (is (= (stemming "violative") "viol"))))

(deftest test-3441
  (testing "test case 3441"
    (is (= (stemming "bravoed") "bravo"))))

(deftest test-3442
  (testing "test case 3442"
    (is (= (stemming "stonewalling") "stonewal"))))

(deftest test-3443
  (testing "test case 3443"
    (is (= (stemming "whinny") "whinni"))))

(deftest test-3444
  (testing "test case 3444"
    (is (= (stemming "flouter") "flouter"))))

(deftest test-3445
  (testing "test case 3445"
    (is (= (stemming "mandrake") "mandrak"))))

(deftest test-3446
  (testing "test case 3446"
    (is (= (stemming "gabbro") "gabbro"))))

(deftest test-3447
  (testing "test case 3447"
    (is (= (stemming "caveated") "caveat"))))

(deftest test-3448
  (testing "test case 3448"
    (is (= (stemming "contemporaneous") "contemporan"))))

(deftest test-3449
  (testing "test case 3449"
    (is (= (stemming "artifice") "artific"))))

(deftest test-3450
  (testing "test case 3450"
    (is (= (stemming "eductions") "educt"))))

(deftest test-3451
  (testing "test case 3451"
    (is (= (stemming "ensurers") "ensur"))))

(deftest test-3452
  (testing "test case 3452"
    (is (= (stemming "fillings") "fill"))))

(deftest test-3453
  (testing "test case 3453"
    (is (= (stemming "sublimities") "sublim"))))

(deftest test-3454
  (testing "test case 3454"
    (is (= (stemming "analyzes") "analyz"))))

(deftest test-3455
  (testing "test case 3455"
    (is (= (stemming "usherettes") "usherett"))))

(deftest test-3456
  (testing "test case 3456"
    (is (= (stemming "upturn") "upturn"))))

(deftest test-3457
  (testing "test case 3457"
    (is (= (stemming "stilling") "still"))))

(deftest test-3458
  (testing "test case 3458"
    (is (= (stemming "disentailment") "disentail"))))

(deftest test-3459
  (testing "test case 3459"
    (is (= (stemming "post") "post"))))

(deftest test-3460
  (testing "test case 3460"
    (is (= (stemming "backfields") "backfield"))))

(deftest test-3461
  (testing "test case 3461"
    (is (= (stemming "ethylenes") "ethylen"))))

(deftest test-3462
  (testing "test case 3462"
    (is (= (stemming "absolution") "absolut"))))

(deftest test-3463
  (testing "test case 3463"
    (is (= (stemming "machining") "machin"))))

(deftest test-3464
  (testing "test case 3464"
    (is (= (stemming "sones") "sone"))))

(deftest test-3465
  (testing "test case 3465"
    (is (= (stemming "rationing") "ration"))))

(deftest test-3466
  (testing "test case 3466"
    (is (= (stemming "nonredeemable") "nonredeem"))))

(deftest test-3467
  (testing "test case 3467"
    (is (= (stemming "transmigrators") "transmigr"))))

(deftest test-3468
  (testing "test case 3468"
    (is (= (stemming "oblige") "oblig"))))

(deftest test-3469
  (testing "test case 3469"
    (is (= (stemming "unseeing") "unse"))))

(deftest test-3470
  (testing "test case 3470"
    (is (= (stemming "tollway") "tollwai"))))

(deftest test-3471
  (testing "test case 3471"
    (is (= (stemming "wenny") "wenni"))))

(deftest test-3472
  (testing "test case 3472"
    (is (= (stemming "porks") "pork"))))

(deftest test-3473
  (testing "test case 3473"
    (is (= (stemming "marshall") "marshal"))))

(deftest test-3474
  (testing "test case 3474"
    (is (= (stemming "serbian") "serbian"))))

(deftest test-3475
  (testing "test case 3475"
    (is (= (stemming "laciest") "laciest"))))

(deftest test-3476
  (testing "test case 3476"
    (is (= (stemming "fecklessly") "fecklessli"))))

(deftest test-3477
  (testing "test case 3477"
    (is (= (stemming "upbeat") "upbeat"))))

(deftest test-3478
  (testing "test case 3478"
    (is (= (stemming "hovel") "hovel"))))

(deftest test-3479
  (testing "test case 3479"
    (is (= (stemming "seaminess") "seami"))))

(deftest test-3480
  (testing "test case 3480"
    (is (= (stemming "immigrate") "immigr"))))

(deftest test-3481
  (testing "test case 3481"
    (is (= (stemming "ridings") "ride"))))

(deftest test-3482
  (testing "test case 3482"
    (is (= (stemming "animalities") "anim"))))

(deftest test-3483
  (testing "test case 3483"
    (is (= (stemming "targeted") "target"))))

(deftest test-3484
  (testing "test case 3484"
    (is (= (stemming "verb") "verb"))))

(deftest test-3485
  (testing "test case 3485"
    (is (= (stemming "divests") "divest"))))

(deftest test-3486
  (testing "test case 3486"
    (is (= (stemming "lathing") "lath"))))

(deftest test-3487
  (testing "test case 3487"
    (is (= (stemming "procrastinating") "procrastin"))))

(deftest test-3488
  (testing "test case 3488"
    (is (= (stemming "hocus") "hocu"))))

(deftest test-3489
  (testing "test case 3489"
    (is (= (stemming "specters") "specter"))))

(deftest test-3490
  (testing "test case 3490"
    (is (= (stemming "eggs") "egg"))))

(deftest test-3491
  (testing "test case 3491"
    (is (= (stemming "speciosities") "specios"))))

(deftest test-3492
  (testing "test case 3492"
    (is (= (stemming "foresheets") "foresheet"))))

(deftest test-3493
  (testing "test case 3493"
    (is (= (stemming "retool") "retool"))))

(deftest test-3494
  (testing "test case 3494"
    (is (= (stemming "cozy") "cozi"))))

(deftest test-3495
  (testing "test case 3495"
    (is (= (stemming "uplifter") "uplift"))))

(deftest test-3496
  (testing "test case 3496"
    (is (= (stemming "grayling") "grayl"))))

(deftest test-3497
  (testing "test case 3497"
    (is (= (stemming "uptilts") "uptilt"))))

(deftest test-3498
  (testing "test case 3498"
    (is (= (stemming "beguiling") "beguil"))))

(deftest test-3499
  (testing "test case 3499"
    (is (= (stemming "glamorizations") "glamor"))))

(deftest test-3500
  (testing "test case 3500"
    (is (= (stemming "transact") "transact"))))

(deftest test-3501
  (testing "test case 3501"
    (is (= (stemming "fletching") "fletch"))))

(deftest test-3502
  (testing "test case 3502"
    (is (= (stemming "globs") "glob"))))

(deftest test-3503
  (testing "test case 3503"
    (is (= (stemming "designees") "designe"))))

(deftest test-3504
  (testing "test case 3504"
    (is (= (stemming "updates") "updat"))))

(deftest test-3505
  (testing "test case 3505"
    (is (= (stemming "maledictions") "maledict"))))

(deftest test-3506
  (testing "test case 3506"
    (is (= (stemming "seediest") "seediest"))))

(deftest test-3507
  (testing "test case 3507"
    (is (= (stemming "viviparous") "vivipar"))))

(deftest test-3508
  (testing "test case 3508"
    (is (= (stemming "guideposts") "guidepost"))))

(deftest test-3509
  (testing "test case 3509"
    (is (= (stemming "linoleums") "linoleum"))))

(deftest test-3510
  (testing "test case 3510"
    (is (= (stemming "villainesses") "villai"))))

(deftest test-3511
  (testing "test case 3511"
    (is (= (stemming "crate") "crate"))))

(deftest test-3512
  (testing "test case 3512"
    (is (= (stemming "datives") "dativ"))))

(deftest test-3513
  (testing "test case 3513"
    (is (= (stemming "anderson") "anderson"))))

(deftest test-3514
  (testing "test case 3514"
    (is (= (stemming "tramline") "tramlin"))))

(deftest test-3515
  (testing "test case 3515"
    (is (= (stemming "reamed") "ream"))))

(deftest test-3516
  (testing "test case 3516"
    (is (= (stemming "author") "author"))))

(deftest test-3517
  (testing "test case 3517"
    (is (= (stemming "anatomies") "anatomi"))))

(deftest test-3518
  (testing "test case 3518"
    (is (= (stemming "path") "path"))))

(deftest test-3519
  (testing "test case 3519"
    (is (= (stemming "albedos") "albedo"))))

(deftest test-3520
  (testing "test case 3520"
    (is (= (stemming "donjons") "donjon"))))

(deftest test-3521
  (testing "test case 3521"
    (is (= (stemming "civilness") "civil"))))

(deftest test-3522
  (testing "test case 3522"
    (is (= (stemming "beckoned") "beckon"))))

(deftest test-3523
  (testing "test case 3523"
    (is (= (stemming "sharesman") "sharesman"))))

(deftest test-3524
  (testing "test case 3524"
    (is (= (stemming "gustatorially") "gustatori"))))

(deftest test-3525
  (testing "test case 3525"
    (is (= (stemming "lid") "lid"))))

(deftest test-3526
  (testing "test case 3526"
    (is (= (stemming "peoples") "peopl"))))

(deftest test-3527
  (testing "test case 3527"
    (is (= (stemming "swing") "swing"))))

(deftest test-3528
  (testing "test case 3528"
    (is (= (stemming "belay") "belai"))))

(deftest test-3529
  (testing "test case 3529"
    (is (= (stemming "weirdness") "weird"))))

(deftest test-3530
  (testing "test case 3530"
    (is (= (stemming "limberest") "limberest"))))

(deftest test-3531
  (testing "test case 3531"
    (is (= (stemming "calender") "calend"))))

(deftest test-3532
  (testing "test case 3532"
    (is (= (stemming "bikinied") "bikini"))))

(deftest test-3533
  (testing "test case 3533"
    (is (= (stemming "pocketbook") "pocketbook"))))

(deftest test-3534
  (testing "test case 3534"
    (is (= (stemming "cozens") "cozen"))))

(deftest test-3535
  (testing "test case 3535"
    (is (= (stemming "subagent") "subag"))))

(deftest test-3536
  (testing "test case 3536"
    (is (= (stemming "sluggards") "sluggard"))))

(deftest test-3537
  (testing "test case 3537"
    (is (= (stemming "refolds") "refold"))))

(deftest test-3538
  (testing "test case 3538"
    (is (= (stemming "ravages") "ravag"))))

(deftest test-3539
  (testing "test case 3539"
    (is (= (stemming "sortie") "sorti"))))

(deftest test-3540
  (testing "test case 3540"
    (is (= (stemming "ginned") "gin"))))

(deftest test-3541
  (testing "test case 3541"
    (is (= (stemming "tresses") "tress"))))

(deftest test-3542
  (testing "test case 3542"
    (is (= (stemming "condescends") "condescend"))))

(deftest test-3543
  (testing "test case 3543"
    (is (= (stemming "conventual") "conventu"))))

(deftest test-3544
  (testing "test case 3544"
    (is (= (stemming "albatross") "albatross"))))

(deftest test-3545
  (testing "test case 3545"
    (is (= (stemming "scythed") "scyth"))))

(deftest test-3546
  (testing "test case 3546"
    (is (= (stemming "exacerbate") "exacerb"))))

(deftest test-3547
  (testing "test case 3547"
    (is (= (stemming "poetize") "poetiz"))))

(deftest test-3548
  (testing "test case 3548"
    (is (= (stemming "gimpier") "gimpier"))))

(deftest test-3549
  (testing "test case 3549"
    (is (= (stemming "marbled") "marbl"))))

(deftest test-3550
  (testing "test case 3550"
    (is (= (stemming "subtleness") "subtl"))))

(deftest test-3551
  (testing "test case 3551"
    (is (= (stemming "etymologist") "etymologist"))))

(deftest test-3552
  (testing "test case 3552"
    (is (= (stemming "hockey") "hockei"))))

(deftest test-3553
  (testing "test case 3553"
    (is (= (stemming "satrapies") "satrapi"))))

(deftest test-3554
  (testing "test case 3554"
    (is (= (stemming "filtrate") "filtrat"))))

(deftest test-3555
  (testing "test case 3555"
    (is (= (stemming "devas") "deva"))))

(deftest test-3556
  (testing "test case 3556"
    (is (= (stemming "brainily") "brainili"))))

(deftest test-3557
  (testing "test case 3557"
    (is (= (stemming "antioxidant") "antioxid"))))

(deftest test-3558
  (testing "test case 3558"
    (is (= (stemming "goodby") "goodbi"))))

(deftest test-3559
  (testing "test case 3559"
    (is (= (stemming "ascertains") "ascertain"))))

(deftest test-3560
  (testing "test case 3560"
    (is (= (stemming "former") "former"))))

(deftest test-3561
  (testing "test case 3561"
    (is (= (stemming "neglecting") "neglect"))))

(deftest test-3562
  (testing "test case 3562"
    (is (= (stemming "tribunes") "tribun"))))

(deftest test-3563
  (testing "test case 3563"
    (is (= (stemming "engrossing") "engross"))))

(deftest test-3564
  (testing "test case 3564"
    (is (= (stemming "herbalists") "herbalist"))))

(deftest test-3565
  (testing "test case 3565"
    (is (= (stemming "moldiest") "moldiest"))))

(deftest test-3566
  (testing "test case 3566"
    (is (= (stemming "throughways") "throughwai"))))

(deftest test-3567
  (testing "test case 3567"
    (is (= (stemming "botulins") "botulin"))))

(deftest test-3568
  (testing "test case 3568"
    (is (= (stemming "noctambulation") "noctambul"))))

(deftest test-3569
  (testing "test case 3569"
    (is (= (stemming "drug") "drug"))))

(deftest test-3570
  (testing "test case 3570"
    (is (= (stemming "sudsless") "sudsless"))))

(deftest test-3571
  (testing "test case 3571"
    (is (= (stemming "clodhopping") "clodhop"))))

(deftest test-3572
  (testing "test case 3572"
    (is (= (stemming "quibbling") "quibbl"))))

(deftest test-3573
  (testing "test case 3573"
    (is (= (stemming "stuffed") "stuf"))))

(deftest test-3574
  (testing "test case 3574"
    (is (= (stemming "otologic") "otolog"))))

(deftest test-3575
  (testing "test case 3575"
    (is (= (stemming "consonants") "conson"))))

(deftest test-3576
  (testing "test case 3576"
    (is (= (stemming "leaf") "leaf"))))

(deftest test-3577
  (testing "test case 3577"
    (is (= (stemming "farrow") "farrow"))))

(deftest test-3578
  (testing "test case 3578"
    (is (= (stemming "vagabonded") "vagabond"))))

(deftest test-3579
  (testing "test case 3579"
    (is (= (stemming "floggings") "flog"))))

(deftest test-3580
  (testing "test case 3580"
    (is (= (stemming "democracies") "democraci"))))

(deftest test-3581
  (testing "test case 3581"
    (is (= (stemming "egalitarians") "egalitarian"))))

(deftest test-3582
  (testing "test case 3582"
    (is (= (stemming "condones") "condon"))))

(deftest test-3583
  (testing "test case 3583"
    (is (= (stemming "treating") "treat"))))

(deftest test-3584
  (testing "test case 3584"
    (is (= (stemming "mf") "mf"))))

(deftest test-3585
  (testing "test case 3585"
    (is (= (stemming "boxes") "box"))))

(deftest test-3586
  (testing "test case 3586"
    (is (= (stemming "favor") "favor"))))

(deftest test-3587
  (testing "test case 3587"
    (is (= (stemming "tiber") "tiber"))))

(deftest test-3588
  (testing "test case 3588"
    (is (= (stemming "redwoods") "redwood"))))

(deftest test-3589
  (testing "test case 3589"
    (is (= (stemming "tzaritzas") "tzaritza"))))

(deftest test-3590
  (testing "test case 3590"
    (is (= (stemming "newness") "new"))))

(deftest test-3591
  (testing "test case 3591"
    (is (= (stemming "shortstop") "shortstop"))))

(deftest test-3592
  (testing "test case 3592"
    (is (= (stemming "cuboidal") "cuboid"))))

(deftest test-3593
  (testing "test case 3593"
    (is (= (stemming "congealable") "congeal"))))

(deftest test-3594
  (testing "test case 3594"
    (is (= (stemming "sagamores") "sagamor"))))

(deftest test-3595
  (testing "test case 3595"
    (is (= (stemming "slimier") "slimier"))))

(deftest test-3596
  (testing "test case 3596"
    (is (= (stemming "exospheres") "exospher"))))

(deftest test-3597
  (testing "test case 3597"
    (is (= (stemming "voiced") "voic"))))

(deftest test-3598
  (testing "test case 3598"
    (is (= (stemming "attach") "attach"))))

(deftest test-3599
  (testing "test case 3599"
    (is (= (stemming "juke") "juke"))))

(deftest test-3600
  (testing "test case 3600"
    (is (= (stemming "nucleolar") "nucleolar"))))

(deftest test-3601
  (testing "test case 3601"
    (is (= (stemming "confuses") "confus"))))

(deftest test-3602
  (testing "test case 3602"
    (is (= (stemming "remeasurements") "remeasur"))))

(deftest test-3603
  (testing "test case 3603"
    (is (= (stemming "measurage") "measurag"))))

(deftest test-3604
  (testing "test case 3604"
    (is (= (stemming "panaches") "panach"))))

(deftest test-3605
  (testing "test case 3605"
    (is (= (stemming "liquefying") "liquefi"))))

(deftest test-3606
  (testing "test case 3606"
    (is (= (stemming "anticlimax") "anticlimax"))))

(deftest test-3607
  (testing "test case 3607"
    (is (= (stemming "sombrero") "sombrero"))))

(deftest test-3608
  (testing "test case 3608"
    (is (= (stemming "flirts") "flirt"))))

(deftest test-3609
  (testing "test case 3609"
    (is (= (stemming "adducted") "adduct"))))

(deftest test-3610
  (testing "test case 3610"
    (is (= (stemming "quorums") "quorum"))))

(deftest test-3611
  (testing "test case 3611"
    (is (= (stemming "reclothes") "recloth"))))

(deftest test-3612
  (testing "test case 3612"
    (is (= (stemming "expanders") "expand"))))

(deftest test-3613
  (testing "test case 3613"
    (is (= (stemming "annulments") "annul"))))

(deftest test-3614
  (testing "test case 3614"
    (is (= (stemming "lain") "lain"))))

(deftest test-3615
  (testing "test case 3615"
    (is (= (stemming "masoned") "mason"))))

(deftest test-3616
  (testing "test case 3616"
    (is (= (stemming "toxicants") "toxic"))))

(deftest test-3617
  (testing "test case 3617"
    (is (= (stemming "jouster") "jouster"))))

(deftest test-3618
  (testing "test case 3618"
    (is (= (stemming "hunches") "hunch"))))

(deftest test-3619
  (testing "test case 3619"
    (is (= (stemming "melton") "melton"))))

(deftest test-3620
  (testing "test case 3620"
    (is (= (stemming "oxter") "oxter"))))

(deftest test-3621
  (testing "test case 3621"
    (is (= (stemming "nonhomogeneous") "nonhomogen"))))

(deftest test-3622
  (testing "test case 3622"
    (is (= (stemming "punny") "punni"))))

(deftest test-3623
  (testing "test case 3623"
    (is (= (stemming "gaucherie") "gaucheri"))))

(deftest test-3624
  (testing "test case 3624"
    (is (= (stemming "detoxicated") "detox"))))

(deftest test-3625
  (testing "test case 3625"
    (is (= (stemming "mythologically") "mytholog"))))

(deftest test-3626
  (testing "test case 3626"
    (is (= (stemming "unconcernedly") "unconcernedli"))))

(deftest test-3627
  (testing "test case 3627"
    (is (= (stemming "drivelers") "drivel"))))

(deftest test-3628
  (testing "test case 3628"
    (is (= (stemming "flagless") "flagless"))))

(deftest test-3629
  (testing "test case 3629"
    (is (= (stemming "usurpers") "usurp"))))

(deftest test-3630
  (testing "test case 3630"
    (is (= (stemming "grain") "grain"))))

(deftest test-3631
  (testing "test case 3631"
    (is (= (stemming "regathered") "regath"))))

(deftest test-3632
  (testing "test case 3632"
    (is (= (stemming "slackest") "slackest"))))

(deftest test-3633
  (testing "test case 3633"
    (is (= (stemming "dabblings") "dabbl"))))

(deftest test-3634
  (testing "test case 3634"
    (is (= (stemming "kinfolks") "kinfolk"))))

(deftest test-3635
  (testing "test case 3635"
    (is (= (stemming "ferries") "ferri"))))

(deftest test-3636
  (testing "test case 3636"
    (is (= (stemming "axil") "axil"))))

(deftest test-3637
  (testing "test case 3637"
    (is (= (stemming "pantry") "pantri"))))

(deftest test-3638
  (testing "test case 3638"
    (is (= (stemming "elects") "elect"))))

(deftest test-3639
  (testing "test case 3639"
    (is (= (stemming "transliteration") "transliter"))))

(deftest test-3640
  (testing "test case 3640"
    (is (= (stemming "falsifier") "falsifi"))))

(deftest test-3641
  (testing "test case 3641"
    (is (= (stemming "torpedolike") "torpedolik"))))

(deftest test-3642
  (testing "test case 3642"
    (is (= (stemming "remarques") "remarqu"))))

(deftest test-3643
  (testing "test case 3643"
    (is (= (stemming "peculated") "pecul"))))

(deftest test-3644
  (testing "test case 3644"
    (is (= (stemming "peens") "peen"))))

(deftest test-3645
  (testing "test case 3645"
    (is (= (stemming "downloaded") "download"))))

(deftest test-3646
  (testing "test case 3646"
    (is (= (stemming "petunias") "petunia"))))

(deftest test-3647
  (testing "test case 3647"
    (is (= (stemming "somnolences") "somnol"))))

(deftest test-3648
  (testing "test case 3648"
    (is (= (stemming "exultingly") "exultingli"))))

(deftest test-3649
  (testing "test case 3649"
    (is (= (stemming "clarifiable") "clarifi"))))

(deftest test-3650
  (testing "test case 3650"
    (is (= (stemming "retakers") "retak"))))

(deftest test-3651
  (testing "test case 3651"
    (is (= (stemming "undisputed") "undisput"))))

(deftest test-3652
  (testing "test case 3652"
    (is (= (stemming "bind") "bind"))))

(deftest test-3653
  (testing "test case 3653"
    (is (= (stemming "repined") "repin"))))

(deftest test-3654
  (testing "test case 3654"
    (is (= (stemming "topotypes") "topotyp"))))

(deftest test-3655
  (testing "test case 3655"
    (is (= (stemming "supernal") "supern"))))

(deftest test-3656
  (testing "test case 3656"
    (is (= (stemming "carpetbags") "carpetbag"))))

(deftest test-3657
  (testing "test case 3657"
    (is (= (stemming "cogitations") "cogit"))))

(deftest test-3658
  (testing "test case 3658"
    (is (= (stemming "toucans") "toucan"))))

(deftest test-3659
  (testing "test case 3659"
    (is (= (stemming "travellable") "travel"))))

(deftest test-3660
  (testing "test case 3660"
    (is (= (stemming "diligence") "dilig"))))

(deftest test-3661
  (testing "test case 3661"
    (is (= (stemming "frizzlers") "frizzler"))))

(deftest test-3662
  (testing "test case 3662"
    (is (= (stemming "menarche") "menarch"))))

(deftest test-3663
  (testing "test case 3663"
    (is (= (stemming "profit") "profit"))))

(deftest test-3664
  (testing "test case 3664"
    (is (= (stemming "wiggle") "wiggl"))))

(deftest test-3665
  (testing "test case 3665"
    (is (= (stemming "ruinable") "ruinabl"))))

(deftest test-3666
  (testing "test case 3666"
    (is (= (stemming "uroscopic") "uroscop"))))

(deftest test-3667
  (testing "test case 3667"
    (is (= (stemming "respectable") "respect"))))

(deftest test-3668
  (testing "test case 3668"
    (is (= (stemming "proceeded") "proceed"))))

(deftest test-3669
  (testing "test case 3669"
    (is (= (stemming "endearingly") "endearingli"))))

(deftest test-3670
  (testing "test case 3670"
    (is (= (stemming "alleviates") "allevi"))))

(deftest test-3671
  (testing "test case 3671"
    (is (= (stemming "lecterns") "lectern"))))

(deftest test-3672
  (testing "test case 3672"
    (is (= (stemming "ineligibility") "inelig"))))

(deftest test-3673
  (testing "test case 3673"
    (is (= (stemming "conformationally") "conformation"))))

(deftest test-3674
  (testing "test case 3674"
    (is (= (stemming "trough") "trough"))))

(deftest test-3675
  (testing "test case 3675"
    (is (= (stemming "featheredge") "featheredg"))))

(deftest test-3676
  (testing "test case 3676"
    (is (= (stemming "splendor") "splendor"))))

(deftest test-3677
  (testing "test case 3677"
    (is (= (stemming "bibasic") "bibas"))))

(deftest test-3678
  (testing "test case 3678"
    (is (= (stemming "footbath") "footbath"))))

(deftest test-3679
  (testing "test case 3679"
    (is (= (stemming "tangerine") "tangerin"))))

(deftest test-3680
  (testing "test case 3680"
    (is (= (stemming "brainwashing") "brainwash"))))

(deftest test-3681
  (testing "test case 3681"
    (is (= (stemming "reelected") "reelect"))))

(deftest test-3682
  (testing "test case 3682"
    (is (= (stemming "defrayable") "defray"))))

(deftest test-3683
  (testing "test case 3683"
    (is (= (stemming "homaging") "homag"))))

(deftest test-3684
  (testing "test case 3684"
    (is (= (stemming "recharters") "rechart"))))

(deftest test-3685
  (testing "test case 3685"
    (is (= (stemming "abominating") "abomin"))))

(deftest test-3686
  (testing "test case 3686"
    (is (= (stemming "togae") "toga"))))

(deftest test-3687
  (testing "test case 3687"
    (is (= (stemming "lacquerer") "lacquer"))))

(deftest test-3688
  (testing "test case 3688"
    (is (= (stemming "beseeming") "beseem"))))

(deftest test-3689
  (testing "test case 3689"
    (is (= (stemming "overacted") "overact"))))

(deftest test-3690
  (testing "test case 3690"
    (is (= (stemming "descrier") "descrier"))))

(deftest test-3691
  (testing "test case 3691"
    (is (= (stemming "tannery") "tanneri"))))

(deftest test-3692
  (testing "test case 3692"
    (is (= (stemming "bulleted") "bullet"))))

(deftest test-3693
  (testing "test case 3693"
    (is (= (stemming "abdominal") "abdomin"))))

(deftest test-3694
  (testing "test case 3694"
    (is (= (stemming "minoring") "minor"))))

(deftest test-3695
  (testing "test case 3695"
    (is (= (stemming "fixable") "fixabl"))))

(deftest test-3696
  (testing "test case 3696"
    (is (= (stemming "fellies") "felli"))))

(deftest test-3697
  (testing "test case 3697"
    (is (= (stemming "raptors") "raptor"))))

(deftest test-3698
  (testing "test case 3698"
    (is (= (stemming "ghats") "ghat"))))

(deftest test-3699
  (testing "test case 3699"
    (is (= (stemming "gnomes") "gnome"))))

(deftest test-3700
  (testing "test case 3700"
    (is (= (stemming "ped") "ped"))))

(deftest test-3701
  (testing "test case 3701"
    (is (= (stemming "riddles") "riddl"))))

(deftest test-3702
  (testing "test case 3702"
    (is (= (stemming "bottlesful") "bottles"))))

(deftest test-3703
  (testing "test case 3703"
    (is (= (stemming "conjunctivitis") "conjunct"))))

(deftest test-3704
  (testing "test case 3704"
    (is (= (stemming "escalate") "escal"))))

(deftest test-3705
  (testing "test case 3705"
    (is (= (stemming "renaissance") "renaiss"))))

(deftest test-3706
  (testing "test case 3706"
    (is (= (stemming "pocketed") "pocket"))))

(deftest test-3707
  (testing "test case 3707"
    (is (= (stemming "influenza") "influenza"))))

(deftest test-3708
  (testing "test case 3708"
    (is (= (stemming "disagreed") "disagre"))))

(deftest test-3709
  (testing "test case 3709"
    (is (= (stemming "contiguities") "contigu"))))

(deftest test-3710
  (testing "test case 3710"
    (is (= (stemming "laities") "laiti"))))

(deftest test-3711
  (testing "test case 3711"
    (is (= (stemming "fluidize") "fluidiz"))))

(deftest test-3712
  (testing "test case 3712"
    (is (= (stemming "philanthropic") "philanthrop"))))

(deftest test-3713
  (testing "test case 3713"
    (is (= (stemming "pecan") "pecan"))))

(deftest test-3714
  (testing "test case 3714"
    (is (= (stemming "impassibly") "impass"))))

(deftest test-3715
  (testing "test case 3715"
    (is (= (stemming "outgrows") "outgrow"))))

(deftest test-3716
  (testing "test case 3716"
    (is (= (stemming "pillage") "pillag"))))

(deftest test-3717
  (testing "test case 3717"
    (is (= (stemming "inciters") "incit"))))

(deftest test-3718
  (testing "test case 3718"
    (is (= (stemming "ebullience") "ebulli"))))

(deftest test-3719
  (testing "test case 3719"
    (is (= (stemming "topsoils") "topsoil"))))

(deftest test-3720
  (testing "test case 3720"
    (is (= (stemming "budgeters") "budget"))))

(deftest test-3721
  (testing "test case 3721"
    (is (= (stemming "foofaraw") "foofaraw"))))

(deftest test-3722
  (testing "test case 3722"
    (is (= (stemming "endeavour") "endeavour"))))

(deftest test-3723
  (testing "test case 3723"
    (is (= (stemming "nautical") "nautic"))))

(deftest test-3724
  (testing "test case 3724"
    (is (= (stemming "unscrambling") "unscrambl"))))

(deftest test-3725
  (testing "test case 3725"
    (is (= (stemming "kindnesses") "kind"))))

(deftest test-3726
  (testing "test case 3726"
    (is (= (stemming "snobberies") "snobberi"))))

(deftest test-3727
  (testing "test case 3727"
    (is (= (stemming "erectile") "erectil"))))

(deftest test-3728
  (testing "test case 3728"
    (is (= (stemming "disgorging") "disgorg"))))

(deftest test-3729
  (testing "test case 3729"
    (is (= (stemming "truisms") "truism"))))

(deftest test-3730
  (testing "test case 3730"
    (is (= (stemming "undependable") "undepend"))))

(deftest test-3731
  (testing "test case 3731"
    (is (= (stemming "harvest") "harvest"))))

(deftest test-3732
  (testing "test case 3732"
    (is (= (stemming "incompetent") "incompet"))))

(deftest test-3733
  (testing "test case 3733"
    (is (= (stemming "compositely") "composit"))))

(deftest test-3734
  (testing "test case 3734"
    (is (= (stemming "turndowns") "turndown"))))

(deftest test-3735
  (testing "test case 3735"
    (is (= (stemming "codification") "codif"))))

(deftest test-3736
  (testing "test case 3736"
    (is (= (stemming "sunups") "sunup"))))

(deftest test-3737
  (testing "test case 3737"
    (is (= (stemming "hospitableness") "hospit"))))

(deftest test-3738
  (testing "test case 3738"
    (is (= (stemming "drawers") "drawer"))))

(deftest test-3739
  (testing "test case 3739"
    (is (= (stemming "oxidization") "oxid"))))

(deftest test-3740
  (testing "test case 3740"
    (is (= (stemming "somatically") "somat"))))

(deftest test-3741
  (testing "test case 3741"
    (is (= (stemming "countersunk") "countersunk"))))

(deftest test-3742
  (testing "test case 3742"
    (is (= (stemming "monetizing") "monet"))))

(deftest test-3743
  (testing "test case 3743"
    (is (= (stemming "coastward") "coastward"))))

(deftest test-3744
  (testing "test case 3744"
    (is (= (stemming "nextly") "nextli"))))

(deftest test-3745
  (testing "test case 3745"
    (is (= (stemming "ultima") "ultima"))))

(deftest test-3746
  (testing "test case 3746"
    (is (= (stemming "fetidness") "fetid"))))

(deftest test-3747
  (testing "test case 3747"
    (is (= (stemming "petcock") "petcock"))))

(deftest test-3748
  (testing "test case 3748"
    (is (= (stemming "snooker") "snooker"))))

(deftest test-3749
  (testing "test case 3749"
    (is (= (stemming "caesuras") "caesura"))))

(deftest test-3750
  (testing "test case 3750"
    (is (= (stemming "batons") "baton"))))

(deftest test-3751
  (testing "test case 3751"
    (is (= (stemming "birdcages") "birdcag"))))

(deftest test-3752
  (testing "test case 3752"
    (is (= (stemming "religionist") "religionist"))))

(deftest test-3753
  (testing "test case 3753"
    (is (= (stemming "autisms") "autism"))))

(deftest test-3754
  (testing "test case 3754"
    (is (= (stemming "astigmatic") "astigmat"))))

(deftest test-3755
  (testing "test case 3755"
    (is (= (stemming "tranquilizer") "tranquil"))))

(deftest test-3756
  (testing "test case 3756"
    (is (= (stemming "recrown") "recrown"))))

(deftest test-3757
  (testing "test case 3757"
    (is (= (stemming "reincarnations") "reincarn"))))

(deftest test-3758
  (testing "test case 3758"
    (is (= (stemming "underselling") "undersel"))))

(deftest test-3759
  (testing "test case 3759"
    (is (= (stemming "peters") "peter"))))

(deftest test-3760
  (testing "test case 3760"
    (is (= (stemming "magmas") "magma"))))

(deftest test-3761
  (testing "test case 3761"
    (is (= (stemming "heliotherapy") "heliotherapi"))))

(deftest test-3762
  (testing "test case 3762"
    (is (= (stemming "metacarpals") "metacarp"))))

(deftest test-3763
  (testing "test case 3763"
    (is (= (stemming "damson") "damson"))))

(deftest test-3764
  (testing "test case 3764"
    (is (= (stemming "bulbous") "bulbou"))))

(deftest test-3765
  (testing "test case 3765"
    (is (= (stemming "kleptomaniacs") "kleptomaniac"))))

(deftest test-3766
  (testing "test case 3766"
    (is (= (stemming "deprogram") "deprogram"))))

(deftest test-3767
  (testing "test case 3767"
    (is (= (stemming "territorializing") "territori"))))

(deftest test-3768
  (testing "test case 3768"
    (is (= (stemming "merlon") "merlon"))))

(deftest test-3769
  (testing "test case 3769"
    (is (= (stemming "thorns") "thorn"))))

(deftest test-3770
  (testing "test case 3770"
    (is (= (stemming "grandee") "grande"))))

(deftest test-3771
  (testing "test case 3771"
    (is (= (stemming "stagnate") "stagnat"))))

(deftest test-3772
  (testing "test case 3772"
    (is (= (stemming "sadder") "sadder"))))

(deftest test-3773
  (testing "test case 3773"
    (is (= (stemming "scathed") "scath"))))

(deftest test-3774
  (testing "test case 3774"
    (is (= (stemming "twangled") "twangl"))))

(deftest test-3775
  (testing "test case 3775"
    (is (= (stemming "asphyxiates") "asphyxi"))))

(deftest test-3776
  (testing "test case 3776"
    (is (= (stemming "alizarine") "alizarin"))))

(deftest test-3777
  (testing "test case 3777"
    (is (= (stemming "axed") "ax"))))

(deftest test-3778
  (testing "test case 3778"
    (is (= (stemming "saltiness") "salti"))))

(deftest test-3779
  (testing "test case 3779"
    (is (= (stemming "means") "mean"))))

(deftest test-3780
  (testing "test case 3780"
    (is (= (stemming "wrings") "wring"))))

(deftest test-3781
  (testing "test case 3781"
    (is (= (stemming "procreated") "procreat"))))

(deftest test-3782
  (testing "test case 3782"
    (is (= (stemming "unemphatic") "unemphat"))))

(deftest test-3783
  (testing "test case 3783"
    (is (= (stemming "suborned") "suborn"))))

(deftest test-3784
  (testing "test case 3784"
    (is (= (stemming "slobbery") "slobberi"))))

(deftest test-3785
  (testing "test case 3785"
    (is (= (stemming "pinkie") "pinki"))))

(deftest test-3786
  (testing "test case 3786"
    (is (= (stemming "unsurely") "unsur"))))

(deftest test-3787
  (testing "test case 3787"
    (is (= (stemming "shock") "shock"))))

(deftest test-3788
  (testing "test case 3788"
    (is (= (stemming "deicers") "deicer"))))

(deftest test-3789
  (testing "test case 3789"
    (is (= (stemming "josher") "josher"))))

(deftest test-3790
  (testing "test case 3790"
    (is (= (stemming "oversize") "overs"))))

(deftest test-3791
  (testing "test case 3791"
    (is (= (stemming "acanthi") "acanthi"))))

(deftest test-3792
  (testing "test case 3792"
    (is (= (stemming "forefinger") "forefing"))))

(deftest test-3793
  (testing "test case 3793"
    (is (= (stemming "entropies") "entropi"))))

(deftest test-3794
  (testing "test case 3794"
    (is (= (stemming "specification") "specif"))))

(deftest test-3795
  (testing "test case 3795"
    (is (= (stemming "semioblivious") "semioblivi"))))

(deftest test-3796
  (testing "test case 3796"
    (is (= (stemming "northers") "norther"))))

(deftest test-3797
  (testing "test case 3797"
    (is (= (stemming "draftsmen") "draftsmen"))))

(deftest test-3798
  (testing "test case 3798"
    (is (= (stemming "flavorings") "flavor"))))

(deftest test-3799
  (testing "test case 3799"
    (is (= (stemming "blatancies") "blatanc"))))

(deftest test-3800
  (testing "test case 3800"
    (is (= (stemming "provability") "provabl"))))

(deftest test-3801
  (testing "test case 3801"
    (is (= (stemming "invigoration") "invigor"))))

(deftest test-3802
  (testing "test case 3802"
    (is (= (stemming "compressors") "compressor"))))

(deftest test-3803
  (testing "test case 3803"
    (is (= (stemming "dispersions") "dispers"))))

(deftest test-3804
  (testing "test case 3804"
    (is (= (stemming "gauntlet") "gauntlet"))))

(deftest test-3805
  (testing "test case 3805"
    (is (= (stemming "retrenching") "retrench"))))

(deftest test-3806
  (testing "test case 3806"
    (is (= (stemming "kolinskies") "kolinski"))))

(deftest test-3807
  (testing "test case 3807"
    (is (= (stemming "nihilists") "nihilist"))))

(deftest test-3808
  (testing "test case 3808"
    (is (= (stemming "stanley") "stanlei"))))

(deftest test-3809
  (testing "test case 3809"
    (is (= (stemming "wiggling") "wiggl"))))

(deftest test-3810
  (testing "test case 3810"
    (is (= (stemming "schism") "schism"))))

(deftest test-3811
  (testing "test case 3811"
    (is (= (stemming "wellhole") "wellhol"))))

(deftest test-3812
  (testing "test case 3812"
    (is (= (stemming "racisms") "racism"))))

(deftest test-3813
  (testing "test case 3813"
    (is (= (stemming "micrograph") "micrograph"))))

(deftest test-3814
  (testing "test case 3814"
    (is (= (stemming "blabbered") "blabber"))))

(deftest test-3815
  (testing "test case 3815"
    (is (= (stemming "excuser") "excus"))))

(deftest test-3816
  (testing "test case 3816"
    (is (= (stemming "phenobarbital") "phenobarbit"))))

(deftest test-3817
  (testing "test case 3817"
    (is (= (stemming "par") "par"))))

(deftest test-3818
  (testing "test case 3818"
    (is (= (stemming "stairs") "stair"))))

(deftest test-3819
  (testing "test case 3819"
    (is (= (stemming "irreverently") "irrever"))))

(deftest test-3820
  (testing "test case 3820"
    (is (= (stemming "ferrous") "ferrou"))))

(deftest test-3821
  (testing "test case 3821"
    (is (= (stemming "reboiling") "reboil"))))

(deftest test-3822
  (testing "test case 3822"
    (is (= (stemming "surnamer") "surnam"))))

(deftest test-3823
  (testing "test case 3823"
    (is (= (stemming "shat") "shat"))))

(deftest test-3824
  (testing "test case 3824"
    (is (= (stemming "backslappers") "backslapp"))))

(deftest test-3825
  (testing "test case 3825"
    (is (= (stemming "jargon") "jargon"))))

(deftest test-3826
  (testing "test case 3826"
    (is (= (stemming "hacienda") "hacienda"))))

(deftest test-3827
  (testing "test case 3827"
    (is (= (stemming "disgracefully") "disgracefulli"))))

(deftest test-3828
  (testing "test case 3828"
    (is (= (stemming "moralisms") "moral"))))

(deftest test-3829
  (testing "test case 3829"
    (is (= (stemming "unequaled") "unequ"))))

(deftest test-3830
  (testing "test case 3830"
    (is (= (stemming "framer") "framer"))))

(deftest test-3831
  (testing "test case 3831"
    (is (= (stemming "postponement") "postpon"))))

(deftest test-3832
  (testing "test case 3832"
    (is (= (stemming "reorders") "reorder"))))

(deftest test-3833
  (testing "test case 3833"
    (is (= (stemming "amenities") "amen"))))

(deftest test-3834
  (testing "test case 3834"
    (is (= (stemming "dinkiest") "dinkiest"))))

(deftest test-3835
  (testing "test case 3835"
    (is (= (stemming "tweedier") "tweedier"))))

(deftest test-3836
  (testing "test case 3836"
    (is (= (stemming "quenchless") "quenchless"))))

(deftest test-3837
  (testing "test case 3837"
    (is (= (stemming "rigged") "rig"))))

(deftest test-3838
  (testing "test case 3838"
    (is (= (stemming "caulk") "caulk"))))

(deftest test-3839
  (testing "test case 3839"
    (is (= (stemming "succumbers") "succumb"))))

(deftest test-3840
  (testing "test case 3840"
    (is (= (stemming "gritting") "grit"))))

(deftest test-3841
  (testing "test case 3841"
    (is (= (stemming "oncograph") "oncograph"))))

(deftest test-3842
  (testing "test case 3842"
    (is (= (stemming "outsell") "outsel"))))

(deftest test-3843
  (testing "test case 3843"
    (is (= (stemming "slams") "slam"))))

(deftest test-3844
  (testing "test case 3844"
    (is (= (stemming "fleabags") "fleabag"))))

(deftest test-3845
  (testing "test case 3845"
    (is (= (stemming "jugula") "jugula"))))

(deftest test-3846
  (testing "test case 3846"
    (is (= (stemming "courtiers") "courtier"))))

(deftest test-3847
  (testing "test case 3847"
    (is (= (stemming "recusing") "recus"))))

(deftest test-3848
  (testing "test case 3848"
    (is (= (stemming "sensitively") "sensit"))))

(deftest test-3849
  (testing "test case 3849"
    (is (= (stemming "passaging") "passag"))))

(deftest test-3850
  (testing "test case 3850"
    (is (= (stemming "gruff") "gruff"))))

(deftest test-3851
  (testing "test case 3851"
    (is (= (stemming "deuce") "deuc"))))

(deftest test-3852
  (testing "test case 3852"
    (is (= (stemming "declaims") "declaim"))))

(deftest test-3853
  (testing "test case 3853"
    (is (= (stemming "arointed") "aroint"))))

(deftest test-3854
  (testing "test case 3854"
    (is (= (stemming "intermenstrual") "intermenstru"))))

(deftest test-3855
  (testing "test case 3855"
    (is (= (stemming "collimation") "collim"))))

(deftest test-3856
  (testing "test case 3856"
    (is (= (stemming "sofars") "sofar"))))

(deftest test-3857
  (testing "test case 3857"
    (is (= (stemming "robustness") "robust"))))

(deftest test-3858
  (testing "test case 3858"
    (is (= (stemming "corroborated") "corrobor"))))

(deftest test-3859
  (testing "test case 3859"
    (is (= (stemming "groggier") "groggier"))))

(deftest test-3860
  (testing "test case 3860"
    (is (= (stemming "kinesiological") "kinesiolog"))))

(deftest test-3861
  (testing "test case 3861"
    (is (= (stemming "redress") "redress"))))

(deftest test-3862
  (testing "test case 3862"
    (is (= (stemming "riffler") "riffler"))))

(deftest test-3863
  (testing "test case 3863"
    (is (= (stemming "auguries") "auguri"))))

(deftest test-3864
  (testing "test case 3864"
    (is (= (stemming "apothems") "apothem"))))

(deftest test-3865
  (testing "test case 3865"
    (is (= (stemming "pamphleteer") "pamphlet"))))

(deftest test-3866
  (testing "test case 3866"
    (is (= (stemming "hiccups") "hiccup"))))

(deftest test-3867
  (testing "test case 3867"
    (is (= (stemming "anoints") "anoint"))))

(deftest test-3868
  (testing "test case 3868"
    (is (= (stemming "sibilated") "sibil"))))

(deftest test-3869
  (testing "test case 3869"
    (is (= (stemming "eczemas") "eczema"))))

(deftest test-3870
  (testing "test case 3870"
    (is (= (stemming "toilettes") "toilett"))))

(deftest test-3871
  (testing "test case 3871"
    (is (= (stemming "massages") "massag"))))

(deftest test-3872
  (testing "test case 3872"
    (is (= (stemming "unincorporated") "unincorpor"))))

(deftest test-3873
  (testing "test case 3873"
    (is (= (stemming "getaways") "getawai"))))

(deftest test-3874
  (testing "test case 3874"
    (is (= (stemming "corkage") "corkag"))))

(deftest test-3875
  (testing "test case 3875"
    (is (= (stemming "finisher") "finish"))))

(deftest test-3876
  (testing "test case 3876"
    (is (= (stemming "chortled") "chortl"))))

(deftest test-3877
  (testing "test case 3877"
    (is (= (stemming "coriander") "coriand"))))

(deftest test-3878
  (testing "test case 3878"
    (is (= (stemming "nunnish") "nunnish"))))

(deftest test-3879
  (testing "test case 3879"
    (is (= (stemming "anticlerical") "anticler"))))

(deftest test-3880
  (testing "test case 3880"
    (is (= (stemming "averse") "avers"))))

(deftest test-3881
  (testing "test case 3881"
    (is (= (stemming "hexarchies") "hexarchi"))))

(deftest test-3882
  (testing "test case 3882"
    (is (= (stemming "pullers") "puller"))))

(deftest test-3883
  (testing "test case 3883"
    (is (= (stemming "intuiting") "intuit"))))

(deftest test-3884
  (testing "test case 3884"
    (is (= (stemming "attempters") "attempt"))))

(deftest test-3885
  (testing "test case 3885"
    (is (= (stemming "congest") "congest"))))

(deftest test-3886
  (testing "test case 3886"
    (is (= (stemming "paned") "pane"))))

(deftest test-3887
  (testing "test case 3887"
    (is (= (stemming "draws") "draw"))))

(deftest test-3888
  (testing "test case 3888"
    (is (= (stemming "chintzes") "chintz"))))

(deftest test-3889
  (testing "test case 3889"
    (is (= (stemming "balking") "balk"))))

(deftest test-3890
  (testing "test case 3890"
    (is (= (stemming "knowing") "know"))))

(deftest test-3891
  (testing "test case 3891"
    (is (= (stemming "welcher") "welcher"))))

(deftest test-3892
  (testing "test case 3892"
    (is (= (stemming "pubescence") "pubesc"))))

(deftest test-3893
  (testing "test case 3893"
    (is (= (stemming "fragment") "fragment"))))

(deftest test-3894
  (testing "test case 3894"
    (is (= (stemming "laughing") "laugh"))))

(deftest test-3895
  (testing "test case 3895"
    (is (= (stemming "preceptor") "preceptor"))))

(deftest test-3896
  (testing "test case 3896"
    (is (= (stemming "refashioned") "refashion"))))

(deftest test-3897
  (testing "test case 3897"
    (is (= (stemming "cosmogonist") "cosmogonist"))))

(deftest test-3898
  (testing "test case 3898"
    (is (= (stemming "knavery") "knaveri"))))

(deftest test-3899
  (testing "test case 3899"
    (is (= (stemming "reimburse") "reimburs"))))

(deftest test-3900
  (testing "test case 3900"
    (is (= (stemming "greatcoated") "greatcoat"))))

(deftest test-3901
  (testing "test case 3901"
    (is (= (stemming "amrita") "amrita"))))

(deftest test-3902
  (testing "test case 3902"
    (is (= (stemming "druidess") "druidess"))))

(deftest test-3903
  (testing "test case 3903"
    (is (= (stemming "saprophytic") "saprophyt"))))

(deftest test-3904
  (testing "test case 3904"
    (is (= (stemming "voyage") "voyag"))))

(deftest test-3905
  (testing "test case 3905"
    (is (= (stemming "furor") "furor"))))

(deftest test-3906
  (testing "test case 3906"
    (is (= (stemming "imbody") "imbodi"))))

(deftest test-3907
  (testing "test case 3907"
    (is (= (stemming "pinko") "pinko"))))

(deftest test-3908
  (testing "test case 3908"
    (is (= (stemming "prettier") "prettier"))))

(deftest test-3909
  (testing "test case 3909"
    (is (= (stemming "fogless") "fogless"))))

(deftest test-3910
  (testing "test case 3910"
    (is (= (stemming "oleander") "oleand"))))

(deftest test-3911
  (testing "test case 3911"
    (is (= (stemming "stuffing") "stuf"))))

(deftest test-3912
  (testing "test case 3912"
    (is (= (stemming "cord") "cord"))))

(deftest test-3913
  (testing "test case 3913"
    (is (= (stemming "hygrometer") "hygromet"))))

(deftest test-3914
  (testing "test case 3914"
    (is (= (stemming "updaters") "updat"))))

(deftest test-3915
  (testing "test case 3915"
    (is (= (stemming "sunflowers") "sunflow"))))

(deftest test-3916
  (testing "test case 3916"
    (is (= (stemming "catches") "catch"))))

(deftest test-3917
  (testing "test case 3917"
    (is (= (stemming "beginnings") "begin"))))

(deftest test-3918
  (testing "test case 3918"
    (is (= (stemming "coplot") "coplot"))))

(deftest test-3919
  (testing "test case 3919"
    (is (= (stemming "broguish") "broguish"))))

(deftest test-3920
  (testing "test case 3920"
    (is (= (stemming "degum") "degum"))))

(deftest test-3921
  (testing "test case 3921"
    (is (= (stemming "lickers") "licker"))))

(deftest test-3922
  (testing "test case 3922"
    (is (= (stemming "electrocuting") "electrocut"))))

(deftest test-3923
  (testing "test case 3923"
    (is (= (stemming "necessaries") "necessari"))))

(deftest test-3924
  (testing "test case 3924"
    (is (= (stemming "furnaced") "furnac"))))

(deftest test-3925
  (testing "test case 3925"
    (is (= (stemming "soothes") "sooth"))))

(deftest test-3926
  (testing "test case 3926"
    (is (= (stemming "coliform") "coliform"))))

(deftest test-3927
  (testing "test case 3927"
    (is (= (stemming "ethical") "ethic"))))

(deftest test-3928
  (testing "test case 3928"
    (is (= (stemming "parrying") "parri"))))

(deftest test-3929
  (testing "test case 3929"
    (is (= (stemming "alliterated") "alliter"))))

(deftest test-3930
  (testing "test case 3930"
    (is (= (stemming "insanest") "insanest"))))

(deftest test-3931
  (testing "test case 3931"
    (is (= (stemming "aerolites") "aerolit"))))

(deftest test-3932
  (testing "test case 3932"
    (is (= (stemming "sacrilegiousness") "sacrilegi"))))

(deftest test-3933
  (testing "test case 3933"
    (is (= (stemming "her") "her"))))

(deftest test-3934
  (testing "test case 3934"
    (is (= (stemming "jingliest") "jingliest"))))

(deftest test-3935
  (testing "test case 3935"
    (is (= (stemming "heartfelt") "heartfelt"))))

(deftest test-3936
  (testing "test case 3936"
    (is (= (stemming "truffled") "truffl"))))

(deftest test-3937
  (testing "test case 3937"
    (is (= (stemming "famous") "famou"))))

(deftest test-3938
  (testing "test case 3938"
    (is (= (stemming "vestibules") "vestibul"))))

(deftest test-3939
  (testing "test case 3939"
    (is (= (stemming "arguses") "argus"))))

(deftest test-3940
  (testing "test case 3940"
    (is (= (stemming "nonpunishable") "nonpunish"))))

(deftest test-3941
  (testing "test case 3941"
    (is (= (stemming "yogurts") "yogurt"))))

(deftest test-3942
  (testing "test case 3942"
    (is (= (stemming "forecourt") "forecourt"))))

(deftest test-3943
  (testing "test case 3943"
    (is (= (stemming "commoner") "common"))))

(deftest test-3944
  (testing "test case 3944"
    (is (= (stemming "disadvantageously") "disadvantag"))))

(deftest test-3945
  (testing "test case 3945"
    (is (= (stemming "ponce") "ponc"))))

(deftest test-3946
  (testing "test case 3946"
    (is (= (stemming "peduncles") "peduncl"))))

(deftest test-3947
  (testing "test case 3947"
    (is (= (stemming "alteratively") "alter"))))

(deftest test-3948
  (testing "test case 3948"
    (is (= (stemming "decelerated") "deceler"))))

(deftest test-3949
  (testing "test case 3949"
    (is (= (stemming "sanctified") "sanctifi"))))

(deftest test-3950
  (testing "test case 3950"
    (is (= (stemming "bibbed") "bib"))))

(deftest test-3951
  (testing "test case 3951"
    (is (= (stemming "shiftily") "shiftili"))))

(deftest test-3952
  (testing "test case 3952"
    (is (= (stemming "stranglers") "strangler"))))

(deftest test-3953
  (testing "test case 3953"
    (is (= (stemming "archipelagos") "archipelago"))))

(deftest test-3954
  (testing "test case 3954"
    (is (= (stemming "pervertedness") "perverted"))))

(deftest test-3955
  (testing "test case 3955"
    (is (= (stemming "lifter") "lifter"))))

(deftest test-3956
  (testing "test case 3956"
    (is (= (stemming "mideast") "mideast"))))

(deftest test-3957
  (testing "test case 3957"
    (is (= (stemming "fieldpieces") "fieldpiec"))))

(deftest test-3958
  (testing "test case 3958"
    (is (= (stemming "reavow") "reavow"))))

(deftest test-3959
  (testing "test case 3959"
    (is (= (stemming "holiday") "holidai"))))

(deftest test-3960
  (testing "test case 3960"
    (is (= (stemming "breviate") "breviat"))))

(deftest test-3961
  (testing "test case 3961"
    (is (= (stemming "basting") "bast"))))

(deftest test-3962
  (testing "test case 3962"
    (is (= (stemming "foiling") "foil"))))

(deftest test-3963
  (testing "test case 3963"
    (is (= (stemming "downshift") "downshift"))))

(deftest test-3964
  (testing "test case 3964"
    (is (= (stemming "liniest") "liniest"))))

(deftest test-3965
  (testing "test case 3965"
    (is (= (stemming "cancelable") "cancel"))))

(deftest test-3966
  (testing "test case 3966"
    (is (= (stemming "bibs") "bib"))))

(deftest test-3967
  (testing "test case 3967"
    (is (= (stemming "documentation") "document"))))

(deftest test-3968
  (testing "test case 3968"
    (is (= (stemming "continuation") "continu"))))

(deftest test-3969
  (testing "test case 3969"
    (is (= (stemming "sterlings") "sterl"))))

(deftest test-3970
  (testing "test case 3970"
    (is (= (stemming "rowing") "row"))))

(deftest test-3971
  (testing "test case 3971"
    (is (= (stemming "bullrush") "bullrush"))))

(deftest test-3972
  (testing "test case 3972"
    (is (= (stemming "amphitheaters") "amphitheat"))))

(deftest test-3973
  (testing "test case 3973"
    (is (= (stemming "desensitizer") "desensit"))))

(deftest test-3974
  (testing "test case 3974"
    (is (= (stemming "cumbrously") "cumbrous"))))

(deftest test-3975
  (testing "test case 3975"
    (is (= (stemming "pepsines") "pepsin"))))

(deftest test-3976
  (testing "test case 3976"
    (is (= (stemming "cactuses") "cactus"))))

(deftest test-3977
  (testing "test case 3977"
    (is (= (stemming "audiotape") "audiotap"))))

(deftest test-3978
  (testing "test case 3978"
    (is (= (stemming "obituaries") "obituari"))))

(deftest test-3979
  (testing "test case 3979"
    (is (= (stemming "unslaked") "unslak"))))

(deftest test-3980
  (testing "test case 3980"
    (is (= (stemming "incumbered") "incumb"))))

(deftest test-3981
  (testing "test case 3981"
    (is (= (stemming "languish") "languish"))))

(deftest test-3982
  (testing "test case 3982"
    (is (= (stemming "ox") "ox"))))

(deftest test-3983
  (testing "test case 3983"
    (is (= (stemming "dadas") "dada"))))

(deftest test-3984
  (testing "test case 3984"
    (is (= (stemming "boardwalk") "boardwalk"))))

(deftest test-3985
  (testing "test case 3985"
    (is (= (stemming "bodyworks") "bodywork"))))

(deftest test-3986
  (testing "test case 3986"
    (is (= (stemming "armpit") "armpit"))))

(deftest test-3987
  (testing "test case 3987"
    (is (= (stemming "opposes") "oppos"))))

(deftest test-3988
  (testing "test case 3988"
    (is (= (stemming "bishopric") "bishopr"))))

(deftest test-3989
  (testing "test case 3989"
    (is (= (stemming "squib") "squib"))))

(deftest test-3990
  (testing "test case 3990"
    (is (= (stemming "unambidextrousness") "unambidextr"))))

(deftest test-3991
  (testing "test case 3991"
    (is (= (stemming "utilizing") "util"))))

(deftest test-3992
  (testing "test case 3992"
    (is (= (stemming "squigglier") "squigglier"))))

(deftest test-3993
  (testing "test case 3993"
    (is (= (stemming "discontinuity") "discontinu"))))

(deftest test-3994
  (testing "test case 3994"
    (is (= (stemming "murkiness") "murki"))))

(deftest test-3995
  (testing "test case 3995"
    (is (= (stemming "delirious") "deliri"))))

(deftest test-3996
  (testing "test case 3996"
    (is (= (stemming "stypsis") "stypsi"))))

(deftest test-3997
  (testing "test case 3997"
    (is (= (stemming "dose") "dose"))))

(deftest test-3998
  (testing "test case 3998"
    (is (= (stemming "fretfulness") "fret"))))

(deftest test-3999
  (testing "test case 3999"
    (is (= (stemming "flimsy") "flimsi"))))

(deftest test-4000
  (testing "test case 4000"
    (is (= (stemming "vocoders") "vocod"))))

(deftest test-4001
  (testing "test case 4001"
    (is (= (stemming "all") "all"))))

(deftest test-4002
  (testing "test case 4002"
    (is (= (stemming "testify") "testifi"))))

(deftest test-4003
  (testing "test case 4003"
    (is (= (stemming "giftedly") "giftedli"))))

(deftest test-4004
  (testing "test case 4004"
    (is (= (stemming "motherland") "motherland"))))

(deftest test-4005
  (testing "test case 4005"
    (is (= (stemming "nonphysically") "nonphys"))))

(deftest test-4006
  (testing "test case 4006"
    (is (= (stemming "pleura") "pleura"))))

(deftest test-4007
  (testing "test case 4007"
    (is (= (stemming "paranoiacs") "paranoiac"))))

(deftest test-4008
  (testing "test case 4008"
    (is (= (stemming "finochio") "finochio"))))

(deftest test-4009
  (testing "test case 4009"
    (is (= (stemming "beelzebub") "beelzebub"))))

(deftest test-4010
  (testing "test case 4010"
    (is (= (stemming "adorner") "adorn"))))

(deftest test-4011
  (testing "test case 4011"
    (is (= (stemming "relief") "relief"))))

(deftest test-4012
  (testing "test case 4012"
    (is (= (stemming "matched") "match"))))

(deftest test-4013
  (testing "test case 4013"
    (is (= (stemming "inveteracy") "inveteraci"))))

(deftest test-4014
  (testing "test case 4014"
    (is (= (stemming "spender") "spender"))))

(deftest test-4015
  (testing "test case 4015"
    (is (= (stemming "frappes") "frapp"))))

(deftest test-4016
  (testing "test case 4016"
    (is (= (stemming "port") "port"))))

(deftest test-4017
  (testing "test case 4017"
    (is (= (stemming "scuffled") "scuffl"))))

(deftest test-4018
  (testing "test case 4018"
    (is (= (stemming "bannister") "bannist"))))

(deftest test-4019
  (testing "test case 4019"
    (is (= (stemming "saltbox") "saltbox"))))

(deftest test-4020
  (testing "test case 4020"
    (is (= (stemming "amicably") "amic"))))

(deftest test-4021
  (testing "test case 4021"
    (is (= (stemming "threnodies") "threnodi"))))

(deftest test-4022
  (testing "test case 4022"
    (is (= (stemming "degrades") "degrad"))))

(deftest test-4023
  (testing "test case 4023"
    (is (= (stemming "loppy") "loppi"))))

(deftest test-4024
  (testing "test case 4024"
    (is (= (stemming "gloomy") "gloomi"))))

(deftest test-4025
  (testing "test case 4025"
    (is (= (stemming "kamikazes") "kamikaz"))))

(deftest test-4026
  (testing "test case 4026"
    (is (= (stemming "bullneck") "bullneck"))))

(deftest test-4027
  (testing "test case 4027"
    (is (= (stemming "isseis") "issei"))))

(deftest test-4028
  (testing "test case 4028"
    (is (= (stemming "cameroon") "cameroon"))))

(deftest test-4029
  (testing "test case 4029"
    (is (= (stemming "jams") "jam"))))

(deftest test-4030
  (testing "test case 4030"
    (is (= (stemming "tuning") "tune"))))

(deftest test-4031
  (testing "test case 4031"
    (is (= (stemming "distracting") "distract"))))

(deftest test-4032
  (testing "test case 4032"
    (is (= (stemming "applauds") "applaud"))))

(deftest test-4033
  (testing "test case 4033"
    (is (= (stemming "unutilized") "unutil"))))

(deftest test-4034
  (testing "test case 4034"
    (is (= (stemming "tailskids") "tailskid"))))

(deftest test-4035
  (testing "test case 4035"
    (is (= (stemming "indeed") "inde"))))

(deftest test-4036
  (testing "test case 4036"
    (is (= (stemming "lynched") "lynch"))))

(deftest test-4037
  (testing "test case 4037"
    (is (= (stemming "idahoan") "idahoan"))))

(deftest test-4038
  (testing "test case 4038"
    (is (= (stemming "forceless") "forceless"))))

(deftest test-4039
  (testing "test case 4039"
    (is (= (stemming "misinstructed") "misinstruct"))))

(deftest test-4040
  (testing "test case 4040"
    (is (= (stemming "slangiest") "slangiest"))))

(deftest test-4041
  (testing "test case 4041"
    (is (= (stemming "preempted") "preempt"))))

(deftest test-4042
  (testing "test case 4042"
    (is (= (stemming "palpably") "palpabl"))))

(deftest test-4043
  (testing "test case 4043"
    (is (= (stemming "islets") "islet"))))

(deftest test-4044
  (testing "test case 4044"
    (is (= (stemming "velocities") "veloc"))))

(deftest test-4045
  (testing "test case 4045"
    (is (= (stemming "editor") "editor"))))

(deftest test-4046
  (testing "test case 4046"
    (is (= (stemming "cringe") "cring"))))

(deftest test-4047
  (testing "test case 4047"
    (is (= (stemming "mono") "mono"))))

(deftest test-4048
  (testing "test case 4048"
    (is (= (stemming "tunney") "tunnei"))))

(deftest test-4049
  (testing "test case 4049"
    (is (= (stemming "scandalizes") "scandal"))))

(deftest test-4050
  (testing "test case 4050"
    (is (= (stemming "digamy") "digami"))))

(deftest test-4051
  (testing "test case 4051"
    (is (= (stemming "colitis") "coliti"))))

(deftest test-4052
  (testing "test case 4052"
    (is (= (stemming "adsorbates") "adsorb"))))

(deftest test-4053
  (testing "test case 4053"
    (is (= (stemming "weighters") "weighter"))))

(deftest test-4054
  (testing "test case 4054"
    (is (= (stemming "machs") "mach"))))

(deftest test-4055
  (testing "test case 4055"
    (is (= (stemming "random") "random"))))

(deftest test-4056
  (testing "test case 4056"
    (is (= (stemming "correspondences") "correspond"))))

(deftest test-4057
  (testing "test case 4057"
    (is (= (stemming "shopmen") "shopmen"))))

(deftest test-4058
  (testing "test case 4058"
    (is (= (stemming "urea") "urea"))))

(deftest test-4059
  (testing "test case 4059"
    (is (= (stemming "misbills") "misbil"))))

(deftest test-4060
  (testing "test case 4060"
    (is (= (stemming "wawls") "wawl"))))

(deftest test-4061
  (testing "test case 4061"
    (is (= (stemming "polemically") "polem"))))

(deftest test-4062
  (testing "test case 4062"
    (is (= (stemming "imparts") "impart"))))

(deftest test-4063
  (testing "test case 4063"
    (is (= (stemming "sap") "sap"))))

(deftest test-4064
  (testing "test case 4064"
    (is (= (stemming "flaking") "flake"))))

(deftest test-4065
  (testing "test case 4065"
    (is (= (stemming "rootlets") "rootlet"))))

(deftest test-4066
  (testing "test case 4066"
    (is (= (stemming "dinosaurs") "dinosaur"))))

(deftest test-4067
  (testing "test case 4067"
    (is (= (stemming "fractiously") "fractious"))))

(deftest test-4068
  (testing "test case 4068"
    (is (= (stemming "gloving") "glove"))))

(deftest test-4069
  (testing "test case 4069"
    (is (= (stemming "gingerly") "gingerli"))))

(deftest test-4070
  (testing "test case 4070"
    (is (= (stemming "demimondaines") "demimondain"))))

(deftest test-4071
  (testing "test case 4071"
    (is (= (stemming "schticks") "schtick"))))

(deftest test-4072
  (testing "test case 4072"
    (is (= (stemming "gustative") "gust"))))

(deftest test-4073
  (testing "test case 4073"
    (is (= (stemming "citadels") "citadel"))))

(deftest test-4074
  (testing "test case 4074"
    (is (= (stemming "serfages") "serfag"))))

(deftest test-4075
  (testing "test case 4075"
    (is (= (stemming "skein") "skein"))))

(deftest test-4076
  (testing "test case 4076"
    (is (= (stemming "prepossessions") "prepossess"))))

(deftest test-4077
  (testing "test case 4077"
    (is (= (stemming "hoorayed") "hoorai"))))

(deftest test-4078
  (testing "test case 4078"
    (is (= (stemming "snaffles") "snaffl"))))

(deftest test-4079
  (testing "test case 4079"
    (is (= (stemming "bastard") "bastard"))))

(deftest test-4080
  (testing "test case 4080"
    (is (= (stemming "instigators") "instig"))))

(deftest test-4081
  (testing "test case 4081"
    (is (= (stemming "enfin") "enfin"))))

(deftest test-4082
  (testing "test case 4082"
    (is (= (stemming "unshelling") "unshel"))))

(deftest test-4083
  (testing "test case 4083"
    (is (= (stemming "vaquero") "vaquero"))))

(deftest test-4084
  (testing "test case 4084"
    (is (= (stemming "hammed") "ham"))))

(deftest test-4085
  (testing "test case 4085"
    (is (= (stemming "ceremonially") "ceremoni"))))

(deftest test-4086
  (testing "test case 4086"
    (is (= (stemming "calmative") "calm"))))

(deftest test-4087
  (testing "test case 4087"
    (is (= (stemming "vigorous") "vigor"))))

(deftest test-4088
  (testing "test case 4088"
    (is (= (stemming "refract") "refract"))))

(deftest test-4089
  (testing "test case 4089"
    (is (= (stemming "mutinously") "mutin"))))

(deftest test-4090
  (testing "test case 4090"
    (is (= (stemming "galileo") "galileo"))))

(deftest test-4091
  (testing "test case 4091"
    (is (= (stemming "syntactical") "syntact"))))

(deftest test-4092
  (testing "test case 4092"
    (is (= (stemming "polled") "poll"))))

(deftest test-4093
  (testing "test case 4093"
    (is (= (stemming "handcraft") "handcraft"))))

(deftest test-4094
  (testing "test case 4094"
    (is (= (stemming "proprietorships") "proprietorship"))))

(deftest test-4095
  (testing "test case 4095"
    (is (= (stemming "salts") "salt"))))

(deftest test-4096
  (testing "test case 4096"
    (is (= (stemming "aspects") "aspect"))))

(deftest test-4097
  (testing "test case 4097"
    (is (= (stemming "embarrassments") "embarrass"))))

(deftest test-4098
  (testing "test case 4098"
    (is (= (stemming "use") "us"))))

(deftest test-4099
  (testing "test case 4099"
    (is (= (stemming "obfuscatory") "obfuscatori"))))

(deftest test-4100
  (testing "test case 4100"
    (is (= (stemming "expeller") "expel"))))

(deftest test-4101
  (testing "test case 4101"
    (is (= (stemming "malediction") "maledict"))))

(deftest test-4102
  (testing "test case 4102"
    (is (= (stemming "scroungers") "scrounger"))))

(deftest test-4103
  (testing "test case 4103"
    (is (= (stemming "rotations") "rotat"))))

(deftest test-4104
  (testing "test case 4104"
    (is (= (stemming "semblances") "semblanc"))))

(deftest test-4105
  (testing "test case 4105"
    (is (= (stemming "deedless") "deedless"))))

(deftest test-4106
  (testing "test case 4106"
    (is (= (stemming "togethers") "togeth"))))

(deftest test-4107
  (testing "test case 4107"
    (is (= (stemming "happened") "happen"))))

(deftest test-4108
  (testing "test case 4108"
    (is (= (stemming "snoopier") "snoopier"))))

(deftest test-4109
  (testing "test case 4109"
    (is (= (stemming "reengaged") "reengag"))))

(deftest test-4110
  (testing "test case 4110"
    (is (= (stemming "unmounted") "unmount"))))

(deftest test-4111
  (testing "test case 4111"
    (is (= (stemming "centipede") "centiped"))))

(deftest test-4112
  (testing "test case 4112"
    (is (= (stemming "ophthalmometry") "ophthalmometri"))))

(deftest test-4113
  (testing "test case 4113"
    (is (= (stemming "postfix") "postfix"))))

(deftest test-4114
  (testing "test case 4114"
    (is (= (stemming "reclad") "reclad"))))

(deftest test-4115
  (testing "test case 4115"
    (is (= (stemming "greatheartedness") "greathearted"))))

(deftest test-4116
  (testing "test case 4116"
    (is (= (stemming "kinematical") "kinemat"))))

(deftest test-4117
  (testing "test case 4117"
    (is (= (stemming "unpitying") "unpiti"))))

(deftest test-4118
  (testing "test case 4118"
    (is (= (stemming "lamentable") "lament"))))

(deftest test-4119
  (testing "test case 4119"
    (is (= (stemming "healths") "health"))))

(deftest test-4120
  (testing "test case 4120"
    (is (= (stemming "tolerable") "toler"))))

(deftest test-4121
  (testing "test case 4121"
    (is (= (stemming "densitometer") "densitomet"))))

(deftest test-4122
  (testing "test case 4122"
    (is (= (stemming "mealie") "meali"))))

(deftest test-4123
  (testing "test case 4123"
    (is (= (stemming "trackway") "trackwai"))))

(deftest test-4124
  (testing "test case 4124"
    (is (= (stemming "salacious") "salaci"))))

(deftest test-4125
  (testing "test case 4125"
    (is (= (stemming "stoic") "stoic"))))

(deftest test-4126
  (testing "test case 4126"
    (is (= (stemming "culture") "cultur"))))

(deftest test-4127
  (testing "test case 4127"
    (is (= (stemming "entraining") "entrain"))))

(deftest test-4128
  (testing "test case 4128"
    (is (= (stemming "herringbones") "herringbon"))))

(deftest test-4129
  (testing "test case 4129"
    (is (= (stemming "overheated") "overh"))))

(deftest test-4130
  (testing "test case 4130"
    (is (= (stemming "apologues") "apologu"))))

(deftest test-4131
  (testing "test case 4131"
    (is (= (stemming "thymy") "thymi"))))

(deftest test-4132
  (testing "test case 4132"
    (is (= (stemming "frisk") "frisk"))))

(deftest test-4133
  (testing "test case 4133"
    (is (= (stemming "perishables") "perish"))))

(deftest test-4134
  (testing "test case 4134"
    (is (= (stemming "insincerity") "insincer"))))

(deftest test-4135
  (testing "test case 4135"
    (is (= (stemming "hustlers") "hustler"))))

(deftest test-4136
  (testing "test case 4136"
    (is (= (stemming "hitlerism") "hitler"))))

(deftest test-4137
  (testing "test case 4137"
    (is (= (stemming "cabal") "cabal"))))

(deftest test-4138
  (testing "test case 4138"
    (is (= (stemming "demonstrating") "demonstr"))))

(deftest test-4139
  (testing "test case 4139"
    (is (= (stemming "vindications") "vindic"))))

(deftest test-4140
  (testing "test case 4140"
    (is (= (stemming "secularize") "secular"))))

(deftest test-4141
  (testing "test case 4141"
    (is (= (stemming "fixatives") "fix"))))

(deftest test-4142
  (testing "test case 4142"
    (is (= (stemming "electropositive") "electroposit"))))

(deftest test-4143
  (testing "test case 4143"
    (is (= (stemming "arterioles") "arteriol"))))

(deftest test-4144
  (testing "test case 4144"
    (is (= (stemming "skins") "skin"))))

(deftest test-4145
  (testing "test case 4145"
    (is (= (stemming "guam") "guam"))))

(deftest test-4146
  (testing "test case 4146"
    (is (= (stemming "intercourse") "intercours"))))

(deftest test-4147
  (testing "test case 4147"
    (is (= (stemming "dishonest") "dishonest"))))

(deftest test-4148
  (testing "test case 4148"
    (is (= (stemming "climbs") "climb"))))

(deftest test-4149
  (testing "test case 4149"
    (is (= (stemming "thicks") "thick"))))

(deftest test-4150
  (testing "test case 4150"
    (is (= (stemming "admonition") "admonit"))))

(deftest test-4151
  (testing "test case 4151"
    (is (= (stemming "anonyms") "anonym"))))

(deftest test-4152
  (testing "test case 4152"
    (is (= (stemming "polygamous") "polygam"))))

(deftest test-4153
  (testing "test case 4153"
    (is (= (stemming "brownier") "brownier"))))

(deftest test-4154
  (testing "test case 4154"
    (is (= (stemming "unrolls") "unrol"))))

(deftest test-4155
  (testing "test case 4155"
    (is (= (stemming "prosodies") "prosodi"))))

(deftest test-4156
  (testing "test case 4156"
    (is (= (stemming "pyritic") "pyrit"))))

(deftest test-4157
  (testing "test case 4157"
    (is (= (stemming "walks") "walk"))))

(deftest test-4158
  (testing "test case 4158"
    (is (= (stemming "scarier") "scarier"))))

(deftest test-4159
  (testing "test case 4159"
    (is (= (stemming "academes") "academ"))))

(deftest test-4160
  (testing "test case 4160"
    (is (= (stemming "boohooing") "boohoo"))))

(deftest test-4161
  (testing "test case 4161"
    (is (= (stemming "situ") "situ"))))

(deftest test-4162
  (testing "test case 4162"
    (is (= (stemming "viricides") "viricid"))))

(deftest test-4163
  (testing "test case 4163"
    (is (= (stemming "differed") "differ"))))

(deftest test-4164
  (testing "test case 4164"
    (is (= (stemming "augury") "auguri"))))

(deftest test-4165
  (testing "test case 4165"
    (is (= (stemming "wedder") "wedder"))))

(deftest test-4166
  (testing "test case 4166"
    (is (= (stemming "cliches") "clich"))))

(deftest test-4167
  (testing "test case 4167"
    (is (= (stemming "microphotographed") "microphotograph"))))

(deftest test-4168
  (testing "test case 4168"
    (is (= (stemming "milton") "milton"))))

(deftest test-4169
  (testing "test case 4169"
    (is (= (stemming "repays") "repai"))))

(deftest test-4170
  (testing "test case 4170"
    (is (= (stemming "proportionate") "proportion"))))

(deftest test-4171
  (testing "test case 4171"
    (is (= (stemming "unrestored") "unrestor"))))

(deftest test-4172
  (testing "test case 4172"
    (is (= (stemming "empresses") "empress"))))

(deftest test-4173
  (testing "test case 4173"
    (is (= (stemming "lignitic") "lignit"))))

(deftest test-4174
  (testing "test case 4174"
    (is (= (stemming "yokeless") "yokeless"))))

(deftest test-4175
  (testing "test case 4175"
    (is (= (stemming "teamakers") "teamak"))))

(deftest test-4176
  (testing "test case 4176"
    (is (= (stemming "nonproportionally") "nonproportion"))))

(deftest test-4177
  (testing "test case 4177"
    (is (= (stemming "resound") "resound"))))

(deftest test-4178
  (testing "test case 4178"
    (is (= (stemming "residence") "resid"))))

(deftest test-4179
  (testing "test case 4179"
    (is (= (stemming "nonmembers") "nonmemb"))))

(deftest test-4180
  (testing "test case 4180"
    (is (= (stemming "staysails") "staysail"))))

(deftest test-4181
  (testing "test case 4181"
    (is (= (stemming "mollified") "mollifi"))))

(deftest test-4182
  (testing "test case 4182"
    (is (= (stemming "meerschaum") "meerschaum"))))

(deftest test-4183
  (testing "test case 4183"
    (is (= (stemming "texturing") "textur"))))

(deftest test-4184
  (testing "test case 4184"
    (is (= (stemming "nineteenth") "nineteenth"))))

(deftest test-4185
  (testing "test case 4185"
    (is (= (stemming "diphtherial") "diphtheri"))))

(deftest test-4186
  (testing "test case 4186"
    (is (= (stemming "kreutzer") "kreutzer"))))

(deftest test-4187
  (testing "test case 4187"
    (is (= (stemming "megadyne") "megadyn"))))

(deftest test-4188
  (testing "test case 4188"
    (is (= (stemming "encapsules") "encapsul"))))

(deftest test-4189
  (testing "test case 4189"
    (is (= (stemming "unhyphenated") "unhyphen"))))

(deftest test-4190
  (testing "test case 4190"
    (is (= (stemming "respiratory") "respiratori"))))

(deftest test-4191
  (testing "test case 4191"
    (is (= (stemming "hutzpah") "hutzpah"))))

(deftest test-4192
  (testing "test case 4192"
    (is (= (stemming "concerts") "concert"))))

(deftest test-4193
  (testing "test case 4193"
    (is (= (stemming "entailing") "entail"))))

(deftest test-4194
  (testing "test case 4194"
    (is (= (stemming "accurateness") "accur"))))

(deftest test-4195
  (testing "test case 4195"
    (is (= (stemming "brutalizes") "brutal"))))

(deftest test-4196
  (testing "test case 4196"
    (is (= (stemming "glady") "gladi"))))

(deftest test-4197
  (testing "test case 4197"
    (is (= (stemming "tunisia") "tunisia"))))

(deftest test-4198
  (testing "test case 4198"
    (is (= (stemming "fairs") "fair"))))

(deftest test-4199
  (testing "test case 4199"
    (is (= (stemming "deva") "deva"))))

(deftest test-4200
  (testing "test case 4200"
    (is (= (stemming "gatecrashers") "gatecrash"))))

(deftest test-4201
  (testing "test case 4201"
    (is (= (stemming "vertiginously") "vertigin"))))

(deftest test-4202
  (testing "test case 4202"
    (is (= (stemming "hearable") "hearabl"))))

(deftest test-4203
  (testing "test case 4203"
    (is (= (stemming "jeffersonians") "jeffersonian"))))

(deftest test-4204
  (testing "test case 4204"
    (is (= (stemming "biffing") "bif"))))

(deftest test-4205
  (testing "test case 4205"
    (is (= (stemming "corrective") "correct"))))

(deftest test-4206
  (testing "test case 4206"
    (is (= (stemming "reinflames") "reinflam"))))

(deftest test-4207
  (testing "test case 4207"
    (is (= (stemming "spewer") "spewer"))))

(deftest test-4208
  (testing "test case 4208"
    (is (= (stemming "dazzled") "dazzl"))))

(deftest test-4209
  (testing "test case 4209"
    (is (= (stemming "serviceably") "servic"))))

(deftest test-4210
  (testing "test case 4210"
    (is (= (stemming "whirred") "whir"))))

(deftest test-4211
  (testing "test case 4211"
    (is (= (stemming "regluing") "reglu"))))

(deftest test-4212
  (testing "test case 4212"
    (is (= (stemming "ducat") "ducat"))))

(deftest test-4213
  (testing "test case 4213"
    (is (= (stemming "metalaw") "metalaw"))))

(deftest test-4214
  (testing "test case 4214"
    (is (= (stemming "neatness") "neat"))))

(deftest test-4215
  (testing "test case 4215"
    (is (= (stemming "performs") "perform"))))

(deftest test-4216
  (testing "test case 4216"
    (is (= (stemming "anschluss") "anschluss"))))

(deftest test-4217
  (testing "test case 4217"
    (is (= (stemming "plier") "plier"))))

(deftest test-4218
  (testing "test case 4218"
    (is (= (stemming "knitwear") "knitwear"))))

(deftest test-4219
  (testing "test case 4219"
    (is (= (stemming "ureic") "ureic"))))

(deftest test-4220
  (testing "test case 4220"
    (is (= (stemming "marginal") "margin"))))

(deftest test-4221
  (testing "test case 4221"
    (is (= (stemming "submembers") "submemb"))))

(deftest test-4222
  (testing "test case 4222"
    (is (= (stemming "princess") "princess"))))

(deftest test-4223
  (testing "test case 4223"
    (is (= (stemming "vengefully") "vengefulli"))))

(deftest test-4224
  (testing "test case 4224"
    (is (= (stemming "cooperator") "cooper"))))

(deftest test-4225
  (testing "test case 4225"
    (is (= (stemming "safaried") "safari"))))

(deftest test-4226
  (testing "test case 4226"
    (is (= (stemming "amphibiousness") "amphibi"))))

(deftest test-4227
  (testing "test case 4227"
    (is (= (stemming "ornithologist") "ornithologist"))))

(deftest test-4228
  (testing "test case 4228"
    (is (= (stemming "casavas") "casava"))))

(deftest test-4229
  (testing "test case 4229"
    (is (= (stemming "tans") "tan"))))

(deftest test-4230
  (testing "test case 4230"
    (is (= (stemming "inscribing") "inscrib"))))

(deftest test-4231
  (testing "test case 4231"
    (is (= (stemming "hearkened") "hearken"))))

(deftest test-4232
  (testing "test case 4232"
    (is (= (stemming "us") "us"))))

(deftest test-4233
  (testing "test case 4233"
    (is (= (stemming "grasslands") "grassland"))))

(deftest test-4234
  (testing "test case 4234"
    (is (= (stemming "disgracers") "disgrac"))))

(deftest test-4235
  (testing "test case 4235"
    (is (= (stemming "kingship") "kingship"))))

(deftest test-4236
  (testing "test case 4236"
    (is (= (stemming "dropworts") "dropwort"))))

(deftest test-4237
  (testing "test case 4237"
    (is (= (stemming "misedits") "misedit"))))

(deftest test-4238
  (testing "test case 4238"
    (is (= (stemming "nakeder") "naked"))))

(deftest test-4239
  (testing "test case 4239"
    (is (= (stemming "murmurer") "murmur"))))

(deftest test-4240
  (testing "test case 4240"
    (is (= (stemming "overfill") "overfil"))))

(deftest test-4241
  (testing "test case 4241"
    (is (= (stemming "gustily") "gustili"))))

(deftest test-4242
  (testing "test case 4242"
    (is (= (stemming "colas") "cola"))))

(deftest test-4243
  (testing "test case 4243"
    (is (= (stemming "fatback") "fatback"))))

(deftest test-4244
  (testing "test case 4244"
    (is (= (stemming "singular") "singular"))))

(deftest test-4245
  (testing "test case 4245"
    (is (= (stemming "priers") "prier"))))

(deftest test-4246
  (testing "test case 4246"
    (is (= (stemming "toothache") "toothach"))))

(deftest test-4247
  (testing "test case 4247"
    (is (= (stemming "molesting") "molest"))))

(deftest test-4248
  (testing "test case 4248"
    (is (= (stemming "hillocky") "hillocki"))))

(deftest test-4249
  (testing "test case 4249"
    (is (= (stemming "teaboard") "teaboard"))))

(deftest test-4250
  (testing "test case 4250"
    (is (= (stemming "selvage") "selvag"))))

(deftest test-4251
  (testing "test case 4251"
    (is (= (stemming "bidding") "bid"))))

(deftest test-4252
  (testing "test case 4252"
    (is (= (stemming "rays") "rai"))))

(deftest test-4253
  (testing "test case 4253"
    (is (= (stemming "wooding") "wood"))))

(deftest test-4254
  (testing "test case 4254"
    (is (= (stemming "scabbed") "scab"))))

(deftest test-4255
  (testing "test case 4255"
    (is (= (stemming "americanize") "american"))))

(deftest test-4256
  (testing "test case 4256"
    (is (= (stemming "filmgoers") "filmgoer"))))

(deftest test-4257
  (testing "test case 4257"
    (is (= (stemming "neotenies") "neoteni"))))

(deftest test-4258
  (testing "test case 4258"
    (is (= (stemming "preshrunk") "preshrunk"))))

(deftest test-4259
  (testing "test case 4259"
    (is (= (stemming "ecole") "ecol"))))

(deftest test-4260
  (testing "test case 4260"
    (is (= (stemming "cornetists") "cornetist"))))

(deftest test-4261
  (testing "test case 4261"
    (is (= (stemming "pussy") "pussi"))))

(deftest test-4262
  (testing "test case 4262"
    (is (= (stemming "exacerbations") "exacerb"))))

(deftest test-4263
  (testing "test case 4263"
    (is (= (stemming "recombing") "recomb"))))

(deftest test-4264
  (testing "test case 4264"
    (is (= (stemming "interloping") "interlop"))))

(deftest test-4265
  (testing "test case 4265"
    (is (= (stemming "nickered") "nicker"))))

(deftest test-4266
  (testing "test case 4266"
    (is (= (stemming "superlatives") "superl"))))

(deftest test-4267
  (testing "test case 4267"
    (is (= (stemming "scalawag") "scalawag"))))

(deftest test-4268
  (testing "test case 4268"
    (is (= (stemming "boggler") "boggler"))))

(deftest test-4269
  (testing "test case 4269"
    (is (= (stemming "livre") "livr"))))

(deftest test-4270
  (testing "test case 4270"
    (is (= (stemming "electrode") "electrod"))))

(deftest test-4271
  (testing "test case 4271"
    (is (= (stemming "adjudging") "adjudg"))))

(deftest test-4272
  (testing "test case 4272"
    (is (= (stemming "alarmisms") "alarm"))))

(deftest test-4273
  (testing "test case 4273"
    (is (= (stemming "diplomate") "diplom"))))

(deftest test-4274
  (testing "test case 4274"
    (is (= (stemming "definiteness") "definit"))))

(deftest test-4275
  (testing "test case 4275"
    (is (= (stemming "admirably") "admir"))))

(deftest test-4276
  (testing "test case 4276"
    (is (= (stemming "barefoot") "barefoot"))))

(deftest test-4277
  (testing "test case 4277"
    (is (= (stemming "predilections") "predilect"))))

(deftest test-4278
  (testing "test case 4278"
    (is (= (stemming "applauder") "applaud"))))

(deftest test-4279
  (testing "test case 4279"
    (is (= (stemming "remarry") "remarri"))))

(deftest test-4280
  (testing "test case 4280"
    (is (= (stemming "spigot") "spigot"))))

(deftest test-4281
  (testing "test case 4281"
    (is (= (stemming "karakuls") "karakul"))))

(deftest test-4282
  (testing "test case 4282"
    (is (= (stemming "subteen") "subteen"))))

(deftest test-4283
  (testing "test case 4283"
    (is (= (stemming "livetrap") "livetrap"))))

(deftest test-4284
  (testing "test case 4284"
    (is (= (stemming "caster") "caster"))))

(deftest test-4285
  (testing "test case 4285"
    (is (= (stemming "gawker") "gawker"))))

(deftest test-4286
  (testing "test case 4286"
    (is (= (stemming "obstructiveness") "obstruct"))))

(deftest test-4287
  (testing "test case 4287"
    (is (= (stemming "brinish") "brinish"))))

(deftest test-4288
  (testing "test case 4288"
    (is (= (stemming "laggardness") "laggard"))))

(deftest test-4289
  (testing "test case 4289"
    (is (= (stemming "marchers") "marcher"))))

(deftest test-4290
  (testing "test case 4290"
    (is (= (stemming "reopen") "reopen"))))

(deftest test-4291
  (testing "test case 4291"
    (is (= (stemming "noisemakers") "noisemak"))))

(deftest test-4292
  (testing "test case 4292"
    (is (= (stemming "freestone") "freeston"))))

(deftest test-4293
  (testing "test case 4293"
    (is (= (stemming "institutors") "institutor"))))

(deftest test-4294
  (testing "test case 4294"
    (is (= (stemming "acidulation") "acidul"))))

(deftest test-4295
  (testing "test case 4295"
    (is (= (stemming "ancestresses") "ancestress"))))

(deftest test-4296
  (testing "test case 4296"
    (is (= (stemming "really") "realli"))))

(deftest test-4297
  (testing "test case 4297"
    (is (= (stemming "spending") "spend"))))

(deftest test-4298
  (testing "test case 4298"
    (is (= (stemming "ultimately") "ultim"))))

(deftest test-4299
  (testing "test case 4299"
    (is (= (stemming "capsize") "capsiz"))))

(deftest test-4300
  (testing "test case 4300"
    (is (= (stemming "glistens") "glisten"))))

(deftest test-4301
  (testing "test case 4301"
    (is (= (stemming "molasses") "molass"))))

(deftest test-4302
  (testing "test case 4302"
    (is (= (stemming "bunn") "bunn"))))

(deftest test-4303
  (testing "test case 4303"
    (is (= (stemming "lignifies") "lignifi"))))

(deftest test-4304
  (testing "test case 4304"
    (is (= (stemming "wizardries") "wizardri"))))

(deftest test-4305
  (testing "test case 4305"
    (is (= (stemming "imperceptive") "impercept"))))

(deftest test-4306
  (testing "test case 4306"
    (is (= (stemming "spaceflights") "spaceflight"))))

(deftest test-4307
  (testing "test case 4307"
    (is (= (stemming "canzona") "canzona"))))

(deftest test-4308
  (testing "test case 4308"
    (is (= (stemming "conduits") "conduit"))))

(deftest test-4309
  (testing "test case 4309"
    (is (= (stemming "hamperers") "hamper"))))

(deftest test-4310
  (testing "test case 4310"
    (is (= (stemming "dichotomous") "dichotom"))))

(deftest test-4311
  (testing "test case 4311"
    (is (= (stemming "sixth") "sixth"))))

(deftest test-4312
  (testing "test case 4312"
    (is (= (stemming "chaucerian") "chaucerian"))))

(deftest test-4313
  (testing "test case 4313"
    (is (= (stemming "evictees") "evicte"))))

(deftest test-4314
  (testing "test case 4314"
    (is (= (stemming "volplanes") "volplan"))))

(deftest test-4315
  (testing "test case 4315"
    (is (= (stemming "caracol") "caracol"))))

(deftest test-4316
  (testing "test case 4316"
    (is (= (stemming "martini") "martini"))))

(deftest test-4317
  (testing "test case 4317"
    (is (= (stemming "bulges") "bulg"))))

(deftest test-4318
  (testing "test case 4318"
    (is (= (stemming "disagreeing") "disagre"))))

(deftest test-4319
  (testing "test case 4319"
    (is (= (stemming "hypersensitized") "hypersensit"))))

(deftest test-4320
  (testing "test case 4320"
    (is (= (stemming "decencies") "decenc"))))

(deftest test-4321
  (testing "test case 4321"
    (is (= (stemming "wen") "wen"))))

(deftest test-4322
  (testing "test case 4322"
    (is (= (stemming "pailful") "pail"))))

(deftest test-4323
  (testing "test case 4323"
    (is (= (stemming "hulloed") "hullo"))))

(deftest test-4324
  (testing "test case 4324"
    (is (= (stemming "tracheotomize") "tracheotom"))))

(deftest test-4325
  (testing "test case 4325"
    (is (= (stemming "hotspur") "hotspur"))))

(deftest test-4326
  (testing "test case 4326"
    (is (= (stemming "shiverer") "shiver"))))

(deftest test-4327
  (testing "test case 4327"
    (is (= (stemming "lacerative") "lacer"))))

(deftest test-4328
  (testing "test case 4328"
    (is (= (stemming "adverts") "advert"))))

(deftest test-4329
  (testing "test case 4329"
    (is (= (stemming "appealingly") "appealingli"))))

(deftest test-4330
  (testing "test case 4330"
    (is (= (stemming "paroled") "parol"))))

(deftest test-4331
  (testing "test case 4331"
    (is (= (stemming "bravure") "bravur"))))

(deftest test-4332
  (testing "test case 4332"
    (is (= (stemming "druidesses") "druidess"))))

(deftest test-4333
  (testing "test case 4333"
    (is (= (stemming "footer") "footer"))))

(deftest test-4334
  (testing "test case 4334"
    (is (= (stemming "personas") "persona"))))

(deftest test-4335
  (testing "test case 4335"
    (is (= (stemming "aspersion") "aspers"))))

(deftest test-4336
  (testing "test case 4336"
    (is (= (stemming "infectiously") "infecti"))))

(deftest test-4337
  (testing "test case 4337"
    (is (= (stemming "infusers") "infus"))))

(deftest test-4338
  (testing "test case 4338"
    (is (= (stemming "guilds") "guild"))))

(deftest test-4339
  (testing "test case 4339"
    (is (= (stemming "prototypical") "prototyp"))))

(deftest test-4340
  (testing "test case 4340"
    (is (= (stemming "bloodcurdlingly") "bloodcurdlingli"))))

(deftest test-4341
  (testing "test case 4341"
    (is (= (stemming "censuses") "census"))))

(deftest test-4342
  (testing "test case 4342"
    (is (= (stemming "birth") "birth"))))

(deftest test-4343
  (testing "test case 4343"
    (is (= (stemming "vulgo") "vulgo"))))

(deftest test-4344
  (testing "test case 4344"
    (is (= (stemming "pumices") "pumic"))))

(deftest test-4345
  (testing "test case 4345"
    (is (= (stemming "scut") "scut"))))

(deftest test-4346
  (testing "test case 4346"
    (is (= (stemming "nemeses") "nemes"))))

(deftest test-4347
  (testing "test case 4347"
    (is (= (stemming "arachnid") "arachnid"))))

(deftest test-4348
  (testing "test case 4348"
    (is (= (stemming "disqualification") "disqualif"))))

(deftest test-4349
  (testing "test case 4349"
    (is (= (stemming "barbel") "barbel"))))

(deftest test-4350
  (testing "test case 4350"
    (is (= (stemming "shamans") "shaman"))))

(deftest test-4351
  (testing "test case 4351"
    (is (= (stemming "boloney") "bolonei"))))

(deftest test-4352
  (testing "test case 4352"
    (is (= (stemming "manchuria") "manchuria"))))

(deftest test-4353
  (testing "test case 4353"
    (is (= (stemming "photosensitizer") "photosensit"))))

(deftest test-4354
  (testing "test case 4354"
    (is (= (stemming "revert") "revert"))))

(deftest test-4355
  (testing "test case 4355"
    (is (= (stemming "craggier") "craggier"))))

(deftest test-4356
  (testing "test case 4356"
    (is (= (stemming "boucle") "boucl"))))

(deftest test-4357
  (testing "test case 4357"
    (is (= (stemming "imaginably") "imagin"))))

(deftest test-4358
  (testing "test case 4358"
    (is (= (stemming "dim") "dim"))))

(deftest test-4359
  (testing "test case 4359"
    (is (= (stemming "ruddily") "ruddili"))))

(deftest test-4360
  (testing "test case 4360"
    (is (= (stemming "vignetting") "vignet"))))

(deftest test-4361
  (testing "test case 4361"
    (is (= (stemming "encephalitis") "enceph"))))

(deftest test-4362
  (testing "test case 4362"
    (is (= (stemming "unstopping") "unstop"))))

(deftest test-4363
  (testing "test case 4363"
    (is (= (stemming "specialer") "special"))))

(deftest test-4364
  (testing "test case 4364"
    (is (= (stemming "quadrillionths") "quadrillionth"))))

(deftest test-4365
  (testing "test case 4365"
    (is (= (stemming "dustbins") "dustbin"))))

(deftest test-4366
  (testing "test case 4366"
    (is (= (stemming "forcers") "forcer"))))

(deftest test-4367
  (testing "test case 4367"
    (is (= (stemming "newsboys") "newsboi"))))

(deftest test-4368
  (testing "test case 4368"
    (is (= (stemming "ramifications") "ramif"))))

(deftest test-4369
  (testing "test case 4369"
    (is (= (stemming "notwithstanding") "notwithstand"))))

(deftest test-4370
  (testing "test case 4370"
    (is (= (stemming "sodomites") "sodomit"))))

(deftest test-4371
  (testing "test case 4371"
    (is (= (stemming "indwelling") "indwel"))))

(deftest test-4372
  (testing "test case 4372"
    (is (= (stemming "cockeyes") "cockey"))))

(deftest test-4373
  (testing "test case 4373"
    (is (= (stemming "somnolence") "somnol"))))

(deftest test-4374
  (testing "test case 4374"
    (is (= (stemming "cordialness") "cordial"))))

(deftest test-4375
  (testing "test case 4375"
    (is (= (stemming "orlon") "orlon"))))

(deftest test-4376
  (testing "test case 4376"
    (is (= (stemming "users") "user"))))

(deftest test-4377
  (testing "test case 4377"
    (is (= (stemming "saids") "said"))))

(deftest test-4378
  (testing "test case 4378"
    (is (= (stemming "scorecard") "scorecard"))))

(deftest test-4379
  (testing "test case 4379"
    (is (= (stemming "racks") "rack"))))

(deftest test-4380
  (testing "test case 4380"
    (is (= (stemming "negligent") "neglig"))))

(deftest test-4381
  (testing "test case 4381"
    (is (= (stemming "brushiest") "brushiest"))))

(deftest test-4382
  (testing "test case 4382"
    (is (= (stemming "chinkiest") "chinkiest"))))

(deftest test-4383
  (testing "test case 4383"
    (is (= (stemming "ragamuffins") "ragamuffin"))))

(deftest test-4384
  (testing "test case 4384"
    (is (= (stemming "undescribable") "undescrib"))))

(deftest test-4385
  (testing "test case 4385"
    (is (= (stemming "vixenly") "vixenli"))))

(deftest test-4386
  (testing "test case 4386"
    (is (= (stemming "cogitators") "cogit"))))

(deftest test-4387
  (testing "test case 4387"
    (is (= (stemming "unalphabetized") "unalphabet"))))

(deftest test-4388
  (testing "test case 4388"
    (is (= (stemming "lacunary") "lacunari"))))

(deftest test-4389
  (testing "test case 4389"
    (is (= (stemming "finitely") "finit"))))

(deftest test-4390
  (testing "test case 4390"
    (is (= (stemming "gauges") "gaug"))))

(deftest test-4391
  (testing "test case 4391"
    (is (= (stemming "impure") "impur"))))

(deftest test-4392
  (testing "test case 4392"
    (is (= (stemming "equivalency") "equival"))))

(deftest test-4393
  (testing "test case 4393"
    (is (= (stemming "peristyle") "peristyl"))))

(deftest test-4394
  (testing "test case 4394"
    (is (= (stemming "infinitesimals") "infinitesim"))))

(deftest test-4395
  (testing "test case 4395"
    (is (= (stemming "barwares") "barwar"))))

(deftest test-4396
  (testing "test case 4396"
    (is (= (stemming "satirically") "satir"))))

(deftest test-4397
  (testing "test case 4397"
    (is (= (stemming "hindrance") "hindranc"))))

(deftest test-4398
  (testing "test case 4398"
    (is (= (stemming "prizewinning") "prizewin"))))

(deftest test-4399
  (testing "test case 4399"
    (is (= (stemming "encourage") "encourag"))))

(deftest test-4400
  (testing "test case 4400"
    (is (= (stemming "calorimetric") "calorimetr"))))

(deftest test-4401
  (testing "test case 4401"
    (is (= (stemming "cosset") "cosset"))))

(deftest test-4402
  (testing "test case 4402"
    (is (= (stemming "vidkids") "vidkid"))))

(deftest test-4403
  (testing "test case 4403"
    (is (= (stemming "awfullest") "awfullest"))))

(deftest test-4404
  (testing "test case 4404"
    (is (= (stemming "renegotiation") "renegoti"))))

(deftest test-4405
  (testing "test case 4405"
    (is (= (stemming "riblets") "riblet"))))

(deftest test-4406
  (testing "test case 4406"
    (is (= (stemming "bifurcate") "bifurc"))))

(deftest test-4407
  (testing "test case 4407"
    (is (= (stemming "uncritical") "uncrit"))))

(deftest test-4408
  (testing "test case 4408"
    (is (= (stemming "resole") "resol"))))

(deftest test-4409
  (testing "test case 4409"
    (is (= (stemming "contusions") "contus"))))

(deftest test-4410
  (testing "test case 4410"
    (is (= (stemming "radiation") "radiat"))))

(deftest test-4411
  (testing "test case 4411"
    (is (= (stemming "tigereye") "tigerey"))))

(deftest test-4412
  (testing "test case 4412"
    (is (= (stemming "unreflecting") "unreflect"))))

(deftest test-4413
  (testing "test case 4413"
    (is (= (stemming "coup") "coup"))))

(deftest test-4414
  (testing "test case 4414"
    (is (= (stemming "diffractions") "diffract"))))

(deftest test-4415
  (testing "test case 4415"
    (is (= (stemming "reliquidates") "reliquid"))))

(deftest test-4416
  (testing "test case 4416"
    (is (= (stemming "pendants") "pendant"))))

(deftest test-4417
  (testing "test case 4417"
    (is (= (stemming "honorableness") "honor"))))

(deftest test-4418
  (testing "test case 4418"
    (is (= (stemming "strap") "strap"))))

(deftest test-4419
  (testing "test case 4419"
    (is (= (stemming "gumshoe") "gumsho"))))

(deftest test-4420
  (testing "test case 4420"
    (is (= (stemming "conker") "conker"))))

(deftest test-4421
  (testing "test case 4421"
    (is (= (stemming "ambidextrousness") "ambidextr"))))

(deftest test-4422
  (testing "test case 4422"
    (is (= (stemming "bryony") "bryoni"))))

(deftest test-4423
  (testing "test case 4423"
    (is (= (stemming "yawped") "yawp"))))

(deftest test-4424
  (testing "test case 4424"
    (is (= (stemming "semitist") "semitist"))))

(deftest test-4425
  (testing "test case 4425"
    (is (= (stemming "stylebooks") "stylebook"))))

(deftest test-4426
  (testing "test case 4426"
    (is (= (stemming "entertained") "entertain"))))

(deftest test-4427
  (testing "test case 4427"
    (is (= (stemming "umiak") "umiak"))))

(deftest test-4428
  (testing "test case 4428"
    (is (= (stemming "pharmacologist") "pharmacologist"))))

(deftest test-4429
  (testing "test case 4429"
    (is (= (stemming "guidebooks") "guidebook"))))

(deftest test-4430
  (testing "test case 4430"
    (is (= (stemming "noticeable") "notic"))))

(deftest test-4431
  (testing "test case 4431"
    (is (= (stemming "lenitive") "lenit"))))

(deftest test-4432
  (testing "test case 4432"
    (is (= (stemming "predomination") "predomin"))))

(deftest test-4433
  (testing "test case 4433"
    (is (= (stemming "uncomfortableness") "uncomfort"))))

(deftest test-4434
  (testing "test case 4434"
    (is (= (stemming "hatchet") "hatchet"))))

(deftest test-4435
  (testing "test case 4435"
    (is (= (stemming "hedgehops") "hedgehop"))))

(deftest test-4436
  (testing "test case 4436"
    (is (= (stemming "icons") "icon"))))

(deftest test-4437
  (testing "test case 4437"
    (is (= (stemming "defeminized") "defemin"))))

(deftest test-4438
  (testing "test case 4438"
    (is (= (stemming "mendings") "mend"))))

(deftest test-4439
  (testing "test case 4439"
    (is (= (stemming "decrying") "decri"))))

(deftest test-4440
  (testing "test case 4440"
    (is (= (stemming "sarcophagus") "sarcophagu"))))

(deftest test-4441
  (testing "test case 4441"
    (is (= (stemming "resolutes") "resolut"))))

(deftest test-4442
  (testing "test case 4442"
    (is (= (stemming "miracles") "miracl"))))

(deftest test-4443
  (testing "test case 4443"
    (is (= (stemming "comfits") "comfit"))))

(deftest test-4444
  (testing "test case 4444"
    (is (= (stemming "unchurched") "unchurch"))))

(deftest test-4445
  (testing "test case 4445"
    (is (= (stemming "besmirchers") "besmirch"))))

(deftest test-4446
  (testing "test case 4446"
    (is (= (stemming "altarpieces") "altarpiec"))))

(deftest test-4447
  (testing "test case 4447"
    (is (= (stemming "crestal") "crestal"))))

(deftest test-4448
  (testing "test case 4448"
    (is (= (stemming "baboos") "baboo"))))

(deftest test-4449
  (testing "test case 4449"
    (is (= (stemming "checkmates") "checkmat"))))

(deftest test-4450
  (testing "test case 4450"
    (is (= (stemming "trembliest") "trembliest"))))

(deftest test-4451
  (testing "test case 4451"
    (is (= (stemming "immortally") "immort"))))

(deftest test-4452
  (testing "test case 4452"
    (is (= (stemming "interlocutress") "interlocutress"))))

(deftest test-4453
  (testing "test case 4453"
    (is (= (stemming "wheelies") "wheeli"))))

(deftest test-4454
  (testing "test case 4454"
    (is (= (stemming "showpiece") "showpiec"))))

(deftest test-4455
  (testing "test case 4455"
    (is (= (stemming "hodad") "hodad"))))

(deftest test-4456
  (testing "test case 4456"
    (is (= (stemming "asymmetry") "asymmetri"))))

(deftest test-4457
  (testing "test case 4457"
    (is (= (stemming "downfallen") "downfallen"))))

(deftest test-4458
  (testing "test case 4458"
    (is (= (stemming "physicals") "physic"))))

(deftest test-4459
  (testing "test case 4459"
    (is (= (stemming "seawards") "seaward"))))

(deftest test-4460
  (testing "test case 4460"
    (is (= (stemming "manipulability") "manipul"))))

(deftest test-4461
  (testing "test case 4461"
    (is (= (stemming "dryrot") "dryrot"))))

(deftest test-4462
  (testing "test case 4462"
    (is (= (stemming "implausibleness") "implaus"))))

(deftest test-4463
  (testing "test case 4463"
    (is (= (stemming "expropriated") "expropri"))))

(deftest test-4464
  (testing "test case 4464"
    (is (= (stemming "disenchantment") "disenchant"))))

(deftest test-4465
  (testing "test case 4465"
    (is (= (stemming "evening") "even"))))

(deftest test-4466
  (testing "test case 4466"
    (is (= (stemming "sering") "sere"))))

(deftest test-4467
  (testing "test case 4467"
    (is (= (stemming "spraying") "sprai"))))

(deftest test-4468
  (testing "test case 4468"
    (is (= (stemming "spinaches") "spinach"))))

(deftest test-4469
  (testing "test case 4469"
    (is (= (stemming "epidemics") "epidem"))))

(deftest test-4470
  (testing "test case 4470"
    (is (= (stemming "campus") "campu"))))

(deftest test-4471
  (testing "test case 4471"
    (is (= (stemming "snails") "snail"))))

(deftest test-4472
  (testing "test case 4472"
    (is (= (stemming "cringing") "cring"))))

(deftest test-4473
  (testing "test case 4473"
    (is (= (stemming "chilliest") "chilliest"))))

(deftest test-4474
  (testing "test case 4474"
    (is (= (stemming "aromatic") "aromat"))))

(deftest test-4475
  (testing "test case 4475"
    (is (= (stemming "jubilantly") "jubilantli"))))

(deftest test-4476
  (testing "test case 4476"
    (is (= (stemming "interrogating") "interrog"))))

(deftest test-4477
  (testing "test case 4477"
    (is (= (stemming "equivocalities") "equivoc"))))

(deftest test-4478
  (testing "test case 4478"
    (is (= (stemming "rehems") "rehem"))))

(deftest test-4479
  (testing "test case 4479"
    (is (= (stemming "livelihood") "livelihood"))))

(deftest test-4480
  (testing "test case 4480"
    (is (= (stemming "imprecating") "imprec"))))

(deftest test-4481
  (testing "test case 4481"
    (is (= (stemming "conventionalized") "convention"))))

(deftest test-4482
  (testing "test case 4482"
    (is (= (stemming "marrowing") "marrow"))))

(deftest test-4483
  (testing "test case 4483"
    (is (= (stemming "conciliations") "concili"))))

(deftest test-4484
  (testing "test case 4484"
    (is (= (stemming "sacrificial") "sacrifici"))))

(deftest test-4485
  (testing "test case 4485"
    (is (= (stemming "nays") "nai"))))

(deftest test-4486
  (testing "test case 4486"
    (is (= (stemming "cortices") "cortic"))))

(deftest test-4487
  (testing "test case 4487"
    (is (= (stemming "gyves") "gyve"))))

(deftest test-4488
  (testing "test case 4488"
    (is (= (stemming "photographers") "photograph"))))

(deftest test-4489
  (testing "test case 4489"
    (is (= (stemming "detections") "detect"))))

(deftest test-4490
  (testing "test case 4490"
    (is (= (stemming "kanjis") "kanji"))))

(deftest test-4491
  (testing "test case 4491"
    (is (= (stemming "dingily") "dingili"))))

(deftest test-4492
  (testing "test case 4492"
    (is (= (stemming "ovulation") "ovul"))))

(deftest test-4493
  (testing "test case 4493"
    (is (= (stemming "assurors") "assuror"))))

(deftest test-4494
  (testing "test case 4494"
    (is (= (stemming "lathy") "lathi"))))

(deftest test-4495
  (testing "test case 4495"
    (is (= (stemming "boosting") "boost"))))

(deftest test-4496
  (testing "test case 4496"
    (is (= (stemming "pellagrous") "pellagr"))))

(deftest test-4497
  (testing "test case 4497"
    (is (= (stemming "practicality") "practic"))))

(deftest test-4498
  (testing "test case 4498"
    (is (= (stemming "sunbathers") "sunbath"))))

(deftest test-4499
  (testing "test case 4499"
    (is (= (stemming "commences") "commenc"))))

(deftest test-4500
  (testing "test case 4500"
    (is (= (stemming "lasagne") "lasagn"))))

(deftest test-4501
  (testing "test case 4501"
    (is (= (stemming "refilters") "refilt"))))

(deftest test-4502
  (testing "test case 4502"
    (is (= (stemming "incapacitating") "incapacit"))))

(deftest test-4503
  (testing "test case 4503"
    (is (= (stemming "neurone") "neuron"))))

(deftest test-4504
  (testing "test case 4504"
    (is (= (stemming "lambskin") "lambskin"))))

(deftest test-4505
  (testing "test case 4505"
    (is (= (stemming "calibrate") "calibr"))))

(deftest test-4506
  (testing "test case 4506"
    (is (= (stemming "gamed") "game"))))

(deftest test-4507
  (testing "test case 4507"
    (is (= (stemming "gustiest") "gustiest"))))

(deftest test-4508
  (testing "test case 4508"
    (is (= (stemming "hatchway") "hatchwai"))))

(deftest test-4509
  (testing "test case 4509"
    (is (= (stemming "statuses") "status"))))

(deftest test-4510
  (testing "test case 4510"
    (is (= (stemming "baking") "bake"))))

(deftest test-4511
  (testing "test case 4511"
    (is (= (stemming "gyrocompass") "gyrocompass"))))

(deftest test-4512
  (testing "test case 4512"
    (is (= (stemming "sections") "section"))))

(deftest test-4513
  (testing "test case 4513"
    (is (= (stemming "rebaptism") "rebapt"))))

(deftest test-4514
  (testing "test case 4514"
    (is (= (stemming "ladanums") "ladanum"))))

(deftest test-4515
  (testing "test case 4515"
    (is (= (stemming "gremmy") "gremmi"))))

(deftest test-4516
  (testing "test case 4516"
    (is (= (stemming "pharynges") "pharyng"))))

(deftest test-4517
  (testing "test case 4517"
    (is (= (stemming "undrinkable") "undrink"))))

(deftest test-4518
  (testing "test case 4518"
    (is (= (stemming "skirting") "skirt"))))

(deftest test-4519
  (testing "test case 4519"
    (is (= (stemming "congregations") "congreg"))))

(deftest test-4520
  (testing "test case 4520"
    (is (= (stemming "rhapsodizing") "rhapsod"))))

(deftest test-4521
  (testing "test case 4521"
    (is (= (stemming "showcases") "showcas"))))

(deftest test-4522
  (testing "test case 4522"
    (is (= (stemming "pirogues") "pirogu"))))

(deftest test-4523
  (testing "test case 4523"
    (is (= (stemming "genetics") "genet"))))

(deftest test-4524
  (testing "test case 4524"
    (is (= (stemming "zionists") "zionist"))))

(deftest test-4525
  (testing "test case 4525"
    (is (= (stemming "misinformants") "misinform"))))

(deftest test-4526
  (testing "test case 4526"
    (is (= (stemming "cavitied") "caviti"))))

(deftest test-4527
  (testing "test case 4527"
    (is (= (stemming "jigger") "jigger"))))

(deftest test-4528
  (testing "test case 4528"
    (is (= (stemming "lucked") "luck"))))

(deftest test-4529
  (testing "test case 4529"
    (is (= (stemming "reexperiences") "reexperi"))))

(deftest test-4530
  (testing "test case 4530"
    (is (= (stemming "discretely") "discret"))))

(deftest test-4531
  (testing "test case 4531"
    (is (= (stemming "unrenewed") "unrenew"))))

(deftest test-4532
  (testing "test case 4532"
    (is (= (stemming "marlinespikes") "marlinespik"))))

(deftest test-4533
  (testing "test case 4533"
    (is (= (stemming "pianic") "pianic"))))

(deftest test-4534
  (testing "test case 4534"
    (is (= (stemming "tzardom") "tzardom"))))

(deftest test-4535
  (testing "test case 4535"
    (is (= (stemming "preexposing") "preexpos"))))

(deftest test-4536
  (testing "test case 4536"
    (is (= (stemming "communities") "commun"))))

(deftest test-4537
  (testing "test case 4537"
    (is (= (stemming "petulancy") "petul"))))

(deftest test-4538
  (testing "test case 4538"
    (is (= (stemming "mayflower") "mayflow"))))

(deftest test-4539
  (testing "test case 4539"
    (is (= (stemming "rancour") "rancour"))))

(deftest test-4540
  (testing "test case 4540"
    (is (= (stemming "gyroscopically") "gyroscop"))))

(deftest test-4541
  (testing "test case 4541"
    (is (= (stemming "lineal") "lineal"))))

(deftest test-4542
  (testing "test case 4542"
    (is (= (stemming "spew") "spew"))))

(deftest test-4543
  (testing "test case 4543"
    (is (= (stemming "uncomforted") "uncomfort"))))

(deftest test-4544
  (testing "test case 4544"
    (is (= (stemming "chiselling") "chisel"))))

(deftest test-4545
  (testing "test case 4545"
    (is (= (stemming "intermingling") "intermingl"))))

(deftest test-4546
  (testing "test case 4546"
    (is (= (stemming "watermarked") "watermark"))))

(deftest test-4547
  (testing "test case 4547"
    (is (= (stemming "demands") "demand"))))

(deftest test-4548
  (testing "test case 4548"
    (is (= (stemming "latens") "laten"))))

(deftest test-4549
  (testing "test case 4549"
    (is (= (stemming "picquet") "picquet"))))

(deftest test-4550
  (testing "test case 4550"
    (is (= (stemming "wareroom") "wareroom"))))

(deftest test-4551
  (testing "test case 4551"
    (is (= (stemming "tope") "tope"))))

(deftest test-4552
  (testing "test case 4552"
    (is (= (stemming "decrypting") "decrypt"))))

(deftest test-4553
  (testing "test case 4553"
    (is (= (stemming "wrack") "wrack"))))

(deftest test-4554
  (testing "test case 4554"
    (is (= (stemming "anesthesiologies") "anesthesiolog"))))

(deftest test-4555
  (testing "test case 4555"
    (is (= (stemming "racketed") "racket"))))

(deftest test-4556
  (testing "test case 4556"
    (is (= (stemming "scrimpiest") "scrimpiest"))))

(deftest test-4557
  (testing "test case 4557"
    (is (= (stemming "backboard") "backboard"))))

(deftest test-4558
  (testing "test case 4558"
    (is (= (stemming "trollop") "trollop"))))

(deftest test-4559
  (testing "test case 4559"
    (is (= (stemming "unitized") "unit"))))

(deftest test-4560
  (testing "test case 4560"
    (is (= (stemming "manufacturers") "manufactur"))))

(deftest test-4561
  (testing "test case 4561"
    (is (= (stemming "wetnesses") "wet"))))

(deftest test-4562
  (testing "test case 4562"
    (is (= (stemming "peartly") "peartli"))))

(deftest test-4563
  (testing "test case 4563"
    (is (= (stemming "dosed") "dose"))))

(deftest test-4564
  (testing "test case 4564"
    (is (= (stemming "photoengravers") "photoengrav"))))

(deftest test-4565
  (testing "test case 4565"
    (is (= (stemming "accidies") "accidi"))))

(deftest test-4566
  (testing "test case 4566"
    (is (= (stemming "barfs") "barf"))))

(deftest test-4567
  (testing "test case 4567"
    (is (= (stemming "folksiest") "folksiest"))))

(deftest test-4568
  (testing "test case 4568"
    (is (= (stemming "hegira") "hegira"))))

(deftest test-4569
  (testing "test case 4569"
    (is (= (stemming "stationeries") "stationeri"))))

(deftest test-4570
  (testing "test case 4570"
    (is (= (stemming "gallnuts") "gallnut"))))

(deftest test-4571
  (testing "test case 4571"
    (is (= (stemming "obdurated") "obdur"))))

(deftest test-4572
  (testing "test case 4572"
    (is (= (stemming "executor") "executor"))))

(deftest test-4573
  (testing "test case 4573"
    (is (= (stemming "flourishes") "flourish"))))

(deftest test-4574
  (testing "test case 4574"
    (is (= (stemming "difficult") "difficult"))))

(deftest test-4575
  (testing "test case 4575"
    (is (= (stemming "orchids") "orchid"))))

(deftest test-4576
  (testing "test case 4576"
    (is (= (stemming "holdouts") "holdout"))))

(deftest test-4577
  (testing "test case 4577"
    (is (= (stemming "photostats") "photostat"))))

(deftest test-4578
  (testing "test case 4578"
    (is (= (stemming "adjoined") "adjoin"))))

(deftest test-4579
  (testing "test case 4579"
    (is (= (stemming "flutters") "flutter"))))

(deftest test-4580
  (testing "test case 4580"
    (is (= (stemming "nonsignificant") "nonsignific"))))

(deftest test-4581
  (testing "test case 4581"
    (is (= (stemming "intrigues") "intrigu"))))

(deftest test-4582
  (testing "test case 4582"
    (is (= (stemming "phoned") "phone"))))

(deftest test-4583
  (testing "test case 4583"
    (is (= (stemming "staffs") "staff"))))

(deftest test-4584
  (testing "test case 4584"
    (is (= (stemming "bamboozled") "bamboozl"))))

(deftest test-4585
  (testing "test case 4585"
    (is (= (stemming "styler") "styler"))))

(deftest test-4586
  (testing "test case 4586"
    (is (= (stemming "pageants") "pageant"))))

(deftest test-4587
  (testing "test case 4587"
    (is (= (stemming "examples") "exampl"))))

(deftest test-4588
  (testing "test case 4588"
    (is (= (stemming "profitable") "profit"))))

(deftest test-4589
  (testing "test case 4589"
    (is (= (stemming "unfunny") "unfunni"))))

(deftest test-4590
  (testing "test case 4590"
    (is (= (stemming "interpretational") "interpret"))))

(deftest test-4591
  (testing "test case 4591"
    (is (= (stemming "stretchable") "stretchabl"))))

(deftest test-4592
  (testing "test case 4592"
    (is (= (stemming "tallied") "talli"))))

(deftest test-4593
  (testing "test case 4593"
    (is (= (stemming "flanders") "flander"))))

(deftest test-4594
  (testing "test case 4594"
    (is (= (stemming "panatellas") "panatella"))))

(deftest test-4595
  (testing "test case 4595"
    (is (= (stemming "ducks") "duck"))))

(deftest test-4596
  (testing "test case 4596"
    (is (= (stemming "forgettable") "forgett"))))

(deftest test-4597
  (testing "test case 4597"
    (is (= (stemming "rushings") "rush"))))

(deftest test-4598
  (testing "test case 4598"
    (is (= (stemming "armband") "armband"))))

(deftest test-4599
  (testing "test case 4599"
    (is (= (stemming "lamellae") "lamella"))))

(deftest test-4600
  (testing "test case 4600"
    (is (= (stemming "treacherously") "treacher"))))

(deftest test-4601
  (testing "test case 4601"
    (is (= (stemming "dipterous") "dipter"))))

(deftest test-4602
  (testing "test case 4602"
    (is (= (stemming "peon") "peon"))))

(deftest test-4603
  (testing "test case 4603"
    (is (= (stemming "coups") "coup"))))

(deftest test-4604
  (testing "test case 4604"
    (is (= (stemming "smartie") "smarti"))))

(deftest test-4605
  (testing "test case 4605"
    (is (= (stemming "dummkopf") "dummkopf"))))

(deftest test-4606
  (testing "test case 4606"
    (is (= (stemming "squiring") "squir"))))

(deftest test-4607
  (testing "test case 4607"
    (is (= (stemming "underprices") "underpric"))))

(deftest test-4608
  (testing "test case 4608"
    (is (= (stemming "slapdashes") "slapdash"))))

(deftest test-4609
  (testing "test case 4609"
    (is (= (stemming "upholder") "uphold"))))

(deftest test-4610
  (testing "test case 4610"
    (is (= (stemming "telegraphing") "telegraph"))))

(deftest test-4611
  (testing "test case 4611"
    (is (= (stemming "preordains") "preordain"))))

(deftest test-4612
  (testing "test case 4612"
    (is (= (stemming "encoding") "encod"))))

(deftest test-4613
  (testing "test case 4613"
    (is (= (stemming "defrayer") "defray"))))

(deftest test-4614
  (testing "test case 4614"
    (is (= (stemming "meagerness") "meager"))))

(deftest test-4615
  (testing "test case 4615"
    (is (= (stemming "bights") "bight"))))

(deftest test-4616
  (testing "test case 4616"
    (is (= (stemming "cloy") "cloi"))))

(deftest test-4617
  (testing "test case 4617"
    (is (= (stemming "frighting") "fright"))))

(deftest test-4618
  (testing "test case 4618"
    (is (= (stemming "fader") "fader"))))

(deftest test-4619
  (testing "test case 4619"
    (is (= (stemming "atheneums") "atheneum"))))

(deftest test-4620
  (testing "test case 4620"
    (is (= (stemming "frivoler") "frivol"))))

(deftest test-4621
  (testing "test case 4621"
    (is (= (stemming "corded") "cord"))))

(deftest test-4622
  (testing "test case 4622"
    (is (= (stemming "plurally") "plural"))))

(deftest test-4623
  (testing "test case 4623"
    (is (= (stemming "capsule") "capsul"))))

(deftest test-4624
  (testing "test case 4624"
    (is (= (stemming "kremlins") "kremlin"))))

(deftest test-4625
  (testing "test case 4625"
    (is (= (stemming "evangelical") "evangel"))))

(deftest test-4626
  (testing "test case 4626"
    (is (= (stemming "unfixing") "unfix"))))

(deftest test-4627
  (testing "test case 4627"
    (is (= (stemming "overmans") "overman"))))

(deftest test-4628
  (testing "test case 4628"
    (is (= (stemming "rovers") "rover"))))

(deftest test-4629
  (testing "test case 4629"
    (is (= (stemming "esters") "ester"))))

(deftest test-4630
  (testing "test case 4630"
    (is (= (stemming "purport") "purport"))))

(deftest test-4631
  (testing "test case 4631"
    (is (= (stemming "captures") "captur"))))

(deftest test-4632
  (testing "test case 4632"
    (is (= (stemming "minuend") "minuend"))))

(deftest test-4633
  (testing "test case 4633"
    (is (= (stemming "asylum") "asylum"))))

(deftest test-4634
  (testing "test case 4634"
    (is (= (stemming "encouragingly") "encouragingli"))))

(deftest test-4635
  (testing "test case 4635"
    (is (= (stemming "glooms") "gloom"))))

(deftest test-4636
  (testing "test case 4636"
    (is (= (stemming "jab") "jab"))))

(deftest test-4637
  (testing "test case 4637"
    (is (= (stemming "gantleting") "gantlet"))))

(deftest test-4638
  (testing "test case 4638"
    (is (= (stemming "chew") "chew"))))

(deftest test-4639
  (testing "test case 4639"
    (is (= (stemming "profitability") "profit"))))

(deftest test-4640
  (testing "test case 4640"
    (is (= (stemming "refulgently") "refulg"))))

(deftest test-4641
  (testing "test case 4641"
    (is (= (stemming "involuted") "involut"))))

(deftest test-4642
  (testing "test case 4642"
    (is (= (stemming "ululated") "ulul"))))

(deftest test-4643
  (testing "test case 4643"
    (is (= (stemming "defoliations") "defoli"))))

(deftest test-4644
  (testing "test case 4644"
    (is (= (stemming "variegate") "varieg"))))

(deftest test-4645
  (testing "test case 4645"
    (is (= (stemming "eristic") "erist"))))

(deftest test-4646
  (testing "test case 4646"
    (is (= (stemming "intoned") "inton"))))

(deftest test-4647
  (testing "test case 4647"
    (is (= (stemming "dishier") "dishier"))))

(deftest test-4648
  (testing "test case 4648"
    (is (= (stemming "closings") "close"))))

(deftest test-4649
  (testing "test case 4649"
    (is (= (stemming "opiums") "opium"))))

(deftest test-4650
  (testing "test case 4650"
    (is (= (stemming "flattered") "flatter"))))

(deftest test-4651
  (testing "test case 4651"
    (is (= (stemming "ladrons") "ladron"))))

(deftest test-4652
  (testing "test case 4652"
    (is (= (stemming "bobbies") "bobbi"))))

(deftest test-4653
  (testing "test case 4653"
    (is (= (stemming "hotshot") "hotshot"))))

(deftest test-4654
  (testing "test case 4654"
    (is (= (stemming "decal") "decal"))))

(deftest test-4655
  (testing "test case 4655"
    (is (= (stemming "crossbars") "crossbar"))))

(deftest test-4656
  (testing "test case 4656"
    (is (= (stemming "moore") "moor"))))

(deftest test-4657
  (testing "test case 4657"
    (is (= (stemming "extraction") "extract"))))

(deftest test-4658
  (testing "test case 4658"
    (is (= (stemming "vizors") "vizor"))))

(deftest test-4659
  (testing "test case 4659"
    (is (= (stemming "adulteries") "adulteri"))))

(deftest test-4660
  (testing "test case 4660"
    (is (= (stemming "levelling") "level"))))

(deftest test-4661
  (testing "test case 4661"
    (is (= (stemming "bezique") "beziqu"))))

(deftest test-4662
  (testing "test case 4662"
    (is (= (stemming "typification") "typif"))))

(deftest test-4663
  (testing "test case 4663"
    (is (= (stemming "shallows") "shallow"))))

(deftest test-4664
  (testing "test case 4664"
    (is (= (stemming "pamper") "pamper"))))

(deftest test-4665
  (testing "test case 4665"
    (is (= (stemming "candidnesses") "candid"))))

(deftest test-4666
  (testing "test case 4666"
    (is (= (stemming "unenrolled") "unenrol"))))

(deftest test-4667
  (testing "test case 4667"
    (is (= (stemming "mitigatory") "mitigatori"))))

(deftest test-4668
  (testing "test case 4668"
    (is (= (stemming "questioners") "question"))))

(deftest test-4669
  (testing "test case 4669"
    (is (= (stemming "cheerless") "cheerless"))))

(deftest test-4670
  (testing "test case 4670"
    (is (= (stemming "purulences") "purul"))))

(deftest test-4671
  (testing "test case 4671"
    (is (= (stemming "chancier") "chancier"))))

(deftest test-4672
  (testing "test case 4672"
    (is (= (stemming "individualizes") "individu"))))

(deftest test-4673
  (testing "test case 4673"
    (is (= (stemming "rabbis") "rabbi"))))

(deftest test-4674
  (testing "test case 4674"
    (is (= (stemming "timidness") "timid"))))

(deftest test-4675
  (testing "test case 4675"
    (is (= (stemming "epidemiological") "epidemiolog"))))

(deftest test-4676
  (testing "test case 4676"
    (is (= (stemming "amnestied") "amnesti"))))

(deftest test-4677
  (testing "test case 4677"
    (is (= (stemming "polysyllabic") "polysyllab"))))

(deftest test-4678
  (testing "test case 4678"
    (is (= (stemming "inpatient") "inpati"))))

(deftest test-4679
  (testing "test case 4679"
    (is (= (stemming "inalterableness") "inalter"))))

(deftest test-4680
  (testing "test case 4680"
    (is (= (stemming "immorally") "immor"))))

(deftest test-4681
  (testing "test case 4681"
    (is (= (stemming "ropeways") "ropewai"))))

(deftest test-4682
  (testing "test case 4682"
    (is (= (stemming "halberds") "halberd"))))

(deftest test-4683
  (testing "test case 4683"
    (is (= (stemming "trijet") "trijet"))))

(deftest test-4684
  (testing "test case 4684"
    (is (= (stemming "lavisher") "lavish"))))

(deftest test-4685
  (testing "test case 4685"
    (is (= (stemming "cone") "cone"))))

(deftest test-4686
  (testing "test case 4686"
    (is (= (stemming "posh") "posh"))))

(deftest test-4687
  (testing "test case 4687"
    (is (= (stemming "boughten") "boughten"))))

(deftest test-4688
  (testing "test case 4688"
    (is (= (stemming "shown") "shown"))))

(deftest test-4689
  (testing "test case 4689"
    (is (= (stemming "demijohn") "demijohn"))))

(deftest test-4690
  (testing "test case 4690"
    (is (= (stemming "gams") "gam"))))

(deftest test-4691
  (testing "test case 4691"
    (is (= (stemming "abandoning") "abandon"))))

(deftest test-4692
  (testing "test case 4692"
    (is (= (stemming "migrational") "migrat"))))

(deftest test-4693
  (testing "test case 4693"
    (is (= (stemming "decreers") "decreer"))))

(deftest test-4694
  (testing "test case 4694"
    (is (= (stemming "president") "presid"))))

(deftest test-4695
  (testing "test case 4695"
    (is (= (stemming "cardiogram") "cardiogram"))))

(deftest test-4696
  (testing "test case 4696"
    (is (= (stemming "storyline") "storylin"))))

(deftest test-4697
  (testing "test case 4697"
    (is (= (stemming "consignataries") "consignatari"))))

(deftest test-4698
  (testing "test case 4698"
    (is (= (stemming "consolations") "consol"))))

(deftest test-4699
  (testing "test case 4699"
    (is (= (stemming "overpowered") "overpow"))))

(deftest test-4700
  (testing "test case 4700"
    (is (= (stemming "seine") "sein"))))

(deftest test-4701
  (testing "test case 4701"
    (is (= (stemming "dissuasions") "dissuas"))))

(deftest test-4702
  (testing "test case 4702"
    (is (= (stemming "headstalls") "headstal"))))

(deftest test-4703
  (testing "test case 4703"
    (is (= (stemming "antipoles") "antipol"))))

(deftest test-4704
  (testing "test case 4704"
    (is (= (stemming "millimeters") "millimet"))))

(deftest test-4705
  (testing "test case 4705"
    (is (= (stemming "buys") "bui"))))

(deftest test-4706
  (testing "test case 4706"
    (is (= (stemming "zen") "zen"))))

(deftest test-4707
  (testing "test case 4707"
    (is (= (stemming "imprinting") "imprint"))))

(deftest test-4708
  (testing "test case 4708"
    (is (= (stemming "xerosis") "xerosi"))))

(deftest test-4709
  (testing "test case 4709"
    (is (= (stemming "william") "william"))))

(deftest test-4710
  (testing "test case 4710"
    (is (= (stemming "fancifulness") "fanci"))))

(deftest test-4711
  (testing "test case 4711"
    (is (= (stemming "fluoridated") "fluorid"))))

(deftest test-4712
  (testing "test case 4712"
    (is (= (stemming "rocketers") "rocket"))))

(deftest test-4713
  (testing "test case 4713"
    (is (= (stemming "solidness") "solid"))))

(deftest test-4714
  (testing "test case 4714"
    (is (= (stemming "polyandry") "polyandri"))))

(deftest test-4715
  (testing "test case 4715"
    (is (= (stemming "fainthearted") "faintheart"))))

(deftest test-4716
  (testing "test case 4716"
    (is (= (stemming "triangle") "triangl"))))

(deftest test-4717
  (testing "test case 4717"
    (is (= (stemming "pneumococcal") "pneumococc"))))

(deftest test-4718
  (testing "test case 4718"
    (is (= (stemming "disabuse") "disabus"))))

(deftest test-4719
  (testing "test case 4719"
    (is (= (stemming "slickest") "slickest"))))

(deftest test-4720
  (testing "test case 4720"
    (is (= (stemming "home") "home"))))

(deftest test-4721
  (testing "test case 4721"
    (is (= (stemming "wildcard") "wildcard"))))

(deftest test-4722
  (testing "test case 4722"
    (is (= (stemming "orchid") "orchid"))))

(deftest test-4723
  (testing "test case 4723"
    (is (= (stemming "hesitancies") "hesit"))))

(deftest test-4724
  (testing "test case 4724"
    (is (= (stemming "repositioning") "reposit"))))

(deftest test-4725
  (testing "test case 4725"
    (is (= (stemming "herdmen") "herdmen"))))

(deftest test-4726
  (testing "test case 4726"
    (is (= (stemming "folly") "folli"))))

(deftest test-4727
  (testing "test case 4727"
    (is (= (stemming "experimentation") "experiment"))))

(deftest test-4728
  (testing "test case 4728"
    (is (= (stemming "crocus") "crocu"))))

(deftest test-4729
  (testing "test case 4729"
    (is (= (stemming "afresh") "afresh"))))

(deftest test-4730
  (testing "test case 4730"
    (is (= (stemming "undiscoverable") "undiscover"))))

(deftest test-4731
  (testing "test case 4731"
    (is (= (stemming "hummers") "hummer"))))

(deftest test-4732
  (testing "test case 4732"
    (is (= (stemming "antedates") "anted"))))

(deftest test-4733
  (testing "test case 4733"
    (is (= (stemming "porous") "porou"))))

(deftest test-4734
  (testing "test case 4734"
    (is (= (stemming "boons") "boon"))))

(deftest test-4735
  (testing "test case 4735"
    (is (= (stemming "linkages") "linkag"))))

(deftest test-4736
  (testing "test case 4736"
    (is (= (stemming "perforator") "perfor"))))

(deftest test-4737
  (testing "test case 4737"
    (is (= (stemming "spreadable") "spreadabl"))))

(deftest test-4738
  (testing "test case 4738"
    (is (= (stemming "noesis") "noesi"))))

(deftest test-4739
  (testing "test case 4739"
    (is (= (stemming "bypath") "bypath"))))

(deftest test-4740
  (testing "test case 4740"
    (is (= (stemming "adumbrate") "adumbr"))))

(deftest test-4741
  (testing "test case 4741"
    (is (= (stemming "institutor") "institutor"))))

(deftest test-4742
  (testing "test case 4742"
    (is (= (stemming "cerebellar") "cerebellar"))))

(deftest test-4743
  (testing "test case 4743"
    (is (= (stemming "autocade") "autocad"))))

(deftest test-4744
  (testing "test case 4744"
    (is (= (stemming "scapegoat") "scapegoat"))))

(deftest test-4745
  (testing "test case 4745"
    (is (= (stemming "klatsches") "klatsch"))))

(deftest test-4746
  (testing "test case 4746"
    (is (= (stemming "nonmoral") "nonmor"))))

(deftest test-4747
  (testing "test case 4747"
    (is (= (stemming "obscurantists") "obscurantist"))))

(deftest test-4748
  (testing "test case 4748"
    (is (= (stemming "semidesert") "semidesert"))))

(deftest test-4749
  (testing "test case 4749"
    (is (= (stemming "panacean") "panacean"))))

(deftest test-4750
  (testing "test case 4750"
    (is (= (stemming "wafters") "wafter"))))

(deftest test-4751
  (testing "test case 4751"
    (is (= (stemming "caved") "cave"))))

(deftest test-4752
  (testing "test case 4752"
    (is (= (stemming "embargoes") "embargo"))))

(deftest test-4753
  (testing "test case 4753"
    (is (= (stemming "freebies") "freebi"))))

(deftest test-4754
  (testing "test case 4754"
    (is (= (stemming "sequestrate") "sequestr"))))

(deftest test-4755
  (testing "test case 4755"
    (is (= (stemming "vanman") "vanman"))))

(deftest test-4756
  (testing "test case 4756"
    (is (= (stemming "causalities") "causal"))))

(deftest test-4757
  (testing "test case 4757"
    (is (= (stemming "mirks") "mirk"))))

(deftest test-4758
  (testing "test case 4758"
    (is (= (stemming "pauperized") "pauper"))))

(deftest test-4759
  (testing "test case 4759"
    (is (= (stemming "kentuckians") "kentuckian"))))

(deftest test-4760
  (testing "test case 4760"
    (is (= (stemming "visitor") "visitor"))))

(deftest test-4761
  (testing "test case 4761"
    (is (= (stemming "especial") "especi"))))

(deftest test-4762
  (testing "test case 4762"
    (is (= (stemming "whelping") "whelp"))))

(deftest test-4763
  (testing "test case 4763"
    (is (= (stemming "antiphon") "antiphon"))))

(deftest test-4764
  (testing "test case 4764"
    (is (= (stemming "deteriorates") "deterior"))))

(deftest test-4765
  (testing "test case 4765"
    (is (= (stemming "softens") "soften"))))

(deftest test-4766
  (testing "test case 4766"
    (is (= (stemming "unextinguished") "unextinguish"))))

(deftest test-4767
  (testing "test case 4767"
    (is (= (stemming "frugal") "frugal"))))

(deftest test-4768
  (testing "test case 4768"
    (is (= (stemming "dynamist") "dynamist"))))

(deftest test-4769
  (testing "test case 4769"
    (is (= (stemming "counterfeited") "counterfeit"))))

(deftest test-4770
  (testing "test case 4770"
    (is (= (stemming "bighorns") "bighorn"))))

(deftest test-4771
  (testing "test case 4771"
    (is (= (stemming "underline") "underlin"))))

(deftest test-4772
  (testing "test case 4772"
    (is (= (stemming "underemphasized") "underemphas"))))

(deftest test-4773
  (testing "test case 4773"
    (is (= (stemming "clefts") "cleft"))))

(deftest test-4774
  (testing "test case 4774"
    (is (= (stemming "apollo") "apollo"))))

(deftest test-4775
  (testing "test case 4775"
    (is (= (stemming "forms") "form"))))

(deftest test-4776
  (testing "test case 4776"
    (is (= (stemming "diestocks") "diestock"))))

(deftest test-4777
  (testing "test case 4777"
    (is (= (stemming "detachment") "detach"))))

(deftest test-4778
  (testing "test case 4778"
    (is (= (stemming "viscosimeter") "viscosimet"))))

(deftest test-4779
  (testing "test case 4779"
    (is (= (stemming "niblicks") "niblick"))))

(deftest test-4780
  (testing "test case 4780"
    (is (= (stemming "purchased") "purchas"))))

(deftest test-4781
  (testing "test case 4781"
    (is (= (stemming "decker") "decker"))))

(deftest test-4782
  (testing "test case 4782"
    (is (= (stemming "ribless") "ribless"))))

(deftest test-4783
  (testing "test case 4783"
    (is (= (stemming "neologic") "neolog"))))

(deftest test-4784
  (testing "test case 4784"
    (is (= (stemming "uncleanness") "unclean"))))

(deftest test-4785
  (testing "test case 4785"
    (is (= (stemming "dextrose") "dextros"))))

(deftest test-4786
  (testing "test case 4786"
    (is (= (stemming "lawnmower") "lawnmow"))))

(deftest test-4787
  (testing "test case 4787"
    (is (= (stemming "chaotic") "chaotic"))))

(deftest test-4788
  (testing "test case 4788"
    (is (= (stemming "typing") "type"))))

(deftest test-4789
  (testing "test case 4789"
    (is (= (stemming "primordially") "primordi"))))

(deftest test-4790
  (testing "test case 4790"
    (is (= (stemming "feckless") "feckless"))))

(deftest test-4791
  (testing "test case 4791"
    (is (= (stemming "cheyenne") "cheyenn"))))

(deftest test-4792
  (testing "test case 4792"
    (is (= (stemming "abnormally") "abnorm"))))

(deftest test-4793
  (testing "test case 4793"
    (is (= (stemming "repelling") "repel"))))

(deftest test-4794
  (testing "test case 4794"
    (is (= (stemming "atoners") "aton"))))

(deftest test-4795
  (testing "test case 4795"
    (is (= (stemming "spoored") "spoor"))))

(deftest test-4796
  (testing "test case 4796"
    (is (= (stemming "practising") "practis"))))

(deftest test-4797
  (testing "test case 4797"
    (is (= (stemming "ragging") "rag"))))

(deftest test-4798
  (testing "test case 4798"
    (is (= (stemming "rooftrees") "rooftre"))))

(deftest test-4799
  (testing "test case 4799"
    (is (= (stemming "rewarming") "rewarm"))))

(deftest test-4800
  (testing "test case 4800"
    (is (= (stemming "deerflys") "deerfli"))))

(deftest test-4801
  (testing "test case 4801"
    (is (= (stemming "nicer") "nicer"))))

(deftest test-4802
  (testing "test case 4802"
    (is (= (stemming "doughboy") "doughboi"))))

(deftest test-4803
  (testing "test case 4803"
    (is (= (stemming "choruses") "chorus"))))

(deftest test-4804
  (testing "test case 4804"
    (is (= (stemming "categorizers") "categor"))))

(deftest test-4805
  (testing "test case 4805"
    (is (= (stemming "underacted") "underact"))))

(deftest test-4806
  (testing "test case 4806"
    (is (= (stemming "equines") "equin"))))

(deftest test-4807
  (testing "test case 4807"
    (is (= (stemming "westered") "wester"))))

(deftest test-4808
  (testing "test case 4808"
    (is (= (stemming "pulsers") "pulser"))))

(deftest test-4809
  (testing "test case 4809"
    (is (= (stemming "darkie") "darki"))))

(deftest test-4810
  (testing "test case 4810"
    (is (= (stemming "chromatographically") "chromatograph"))))

(deftest test-4811
  (testing "test case 4811"
    (is (= (stemming "kotos") "koto"))))

(deftest test-4812
  (testing "test case 4812"
    (is (= (stemming "pinnacles") "pinnacl"))))

(deftest test-4813
  (testing "test case 4813"
    (is (= (stemming "positioning") "posit"))))

(deftest test-4814
  (testing "test case 4814"
    (is (= (stemming "obeahisms") "obeah"))))

(deftest test-4815
  (testing "test case 4815"
    (is (= (stemming "mindlessness") "mindless"))))

(deftest test-4816
  (testing "test case 4816"
    (is (= (stemming "viperous") "viper"))))

(deftest test-4817
  (testing "test case 4817"
    (is (= (stemming "presbyterian") "presbyterian"))))

(deftest test-4818
  (testing "test case 4818"
    (is (= (stemming "sapping") "sap"))))

(deftest test-4819
  (testing "test case 4819"
    (is (= (stemming "materialistic") "materialist"))))

(deftest test-4820
  (testing "test case 4820"
    (is (= (stemming "harshens") "harshen"))))

(deftest test-4821
  (testing "test case 4821"
    (is (= (stemming "cotton") "cotton"))))

(deftest test-4822
  (testing "test case 4822"
    (is (= (stemming "overlays") "overlai"))))

(deftest test-4823
  (testing "test case 4823"
    (is (= (stemming "seiners") "seiner"))))

(deftest test-4824
  (testing "test case 4824"
    (is (= (stemming "syllabub") "syllabub"))))

(deftest test-4825
  (testing "test case 4825"
    (is (= (stemming "bulletproof") "bulletproof"))))

(deftest test-4826
  (testing "test case 4826"
    (is (= (stemming "obeahs") "obeah"))))

(deftest test-4827
  (testing "test case 4827"
    (is (= (stemming "secondary") "secondari"))))

(deftest test-4828
  (testing "test case 4828"
    (is (= (stemming "sexagenarian") "sexagenarian"))))

(deftest test-4829
  (testing "test case 4829"
    (is (= (stemming "steppingstone") "steppingston"))))

(deftest test-4830
  (testing "test case 4830"
    (is (= (stemming "wye") "wye"))))

(deftest test-4831
  (testing "test case 4831"
    (is (= (stemming "seaports") "seaport"))))

(deftest test-4832
  (testing "test case 4832"
    (is (= (stemming "syracuse") "syracus"))))

(deftest test-4833
  (testing "test case 4833"
    (is (= (stemming "lithesome") "lithesom"))))

(deftest test-4834
  (testing "test case 4834"
    (is (= (stemming "mythos") "mytho"))))

(deftest test-4835
  (testing "test case 4835"
    (is (= (stemming "whiffletrees") "whiffletre"))))

(deftest test-4836
  (testing "test case 4836"
    (is (= (stemming "hydrofoil") "hydrofoil"))))

(deftest test-4837
  (testing "test case 4837"
    (is (= (stemming "emulsified") "emulsifi"))))

(deftest test-4838
  (testing "test case 4838"
    (is (= (stemming "capitations") "capit"))))

(deftest test-4839
  (testing "test case 4839"
    (is (= (stemming "urgent") "urgent"))))

(deftest test-4840
  (testing "test case 4840"
    (is (= (stemming "wearier") "wearier"))))

(deftest test-4841
  (testing "test case 4841"
    (is (= (stemming "donee") "done"))))

(deftest test-4842
  (testing "test case 4842"
    (is (= (stemming "tushing") "tush"))))

(deftest test-4843
  (testing "test case 4843"
    (is (= (stemming "assemblages") "assemblag"))))

(deftest test-4844
  (testing "test case 4844"
    (is (= (stemming "fujis") "fuji"))))

(deftest test-4845
  (testing "test case 4845"
    (is (= (stemming "grey") "grei"))))

(deftest test-4846
  (testing "test case 4846"
    (is (= (stemming "reestablishing") "reestablish"))))

(deftest test-4847
  (testing "test case 4847"
    (is (= (stemming "ruminatingly") "ruminatingli"))))

(deftest test-4848
  (testing "test case 4848"
    (is (= (stemming "jointure") "jointur"))))

(deftest test-4849
  (testing "test case 4849"
    (is (= (stemming "unrefined") "unrefin"))))

(deftest test-4850
  (testing "test case 4850"
    (is (= (stemming "amicability") "amic"))))

(deftest test-4851
  (testing "test case 4851"
    (is (= (stemming "nonclinical") "nonclin"))))

(deftest test-4852
  (testing "test case 4852"
    (is (= (stemming "overanalyzes") "overanalyz"))))

(deftest test-4853
  (testing "test case 4853"
    (is (= (stemming "houser") "houser"))))

(deftest test-4854
  (testing "test case 4854"
    (is (= (stemming "finical") "finic"))))

(deftest test-4855
  (testing "test case 4855"
    (is (= (stemming "celibate") "celib"))))

(deftest test-4856
  (testing "test case 4856"
    (is (= (stemming "pipetting") "pipet"))))

(deftest test-4857
  (testing "test case 4857"
    (is (= (stemming "antiquing") "antiqu"))))

(deftest test-4858
  (testing "test case 4858"
    (is (= (stemming "shavings") "shave"))))

(deftest test-4859
  (testing "test case 4859"
    (is (= (stemming "tempi") "tempi"))))

(deftest test-4860
  (testing "test case 4860"
    (is (= (stemming "widowed") "widow"))))

(deftest test-4861
  (testing "test case 4861"
    (is (= (stemming "yowing") "yow"))))

(deftest test-4862
  (testing "test case 4862"
    (is (= (stemming "nausea") "nausea"))))

(deftest test-4863
  (testing "test case 4863"
    (is (= (stemming "vanquisher") "vanquish"))))

(deftest test-4864
  (testing "test case 4864"
    (is (= (stemming "ickiest") "ickiest"))))

(deftest test-4865
  (testing "test case 4865"
    (is (= (stemming "ferlies") "ferli"))))

(deftest test-4866
  (testing "test case 4866"
    (is (= (stemming "functionally") "function"))))

(deftest test-4867
  (testing "test case 4867"
    (is (= (stemming "overinsures") "overinsur"))))

(deftest test-4868
  (testing "test case 4868"
    (is (= (stemming "loams") "loam"))))

(deftest test-4869
  (testing "test case 4869"
    (is (= (stemming "nippers") "nipper"))))

(deftest test-4870
  (testing "test case 4870"
    (is (= (stemming "flumped") "flump"))))

(deftest test-4871
  (testing "test case 4871"
    (is (= (stemming "suppliant") "suppliant"))))

(deftest test-4872
  (testing "test case 4872"
    (is (= (stemming "lathwork") "lathwork"))))

(deftest test-4873
  (testing "test case 4873"
    (is (= (stemming "swage") "swage"))))

(deftest test-4874
  (testing "test case 4874"
    (is (= (stemming "alines") "alin"))))

(deftest test-4875
  (testing "test case 4875"
    (is (= (stemming "equalizing") "equal"))))

(deftest test-4876
  (testing "test case 4876"
    (is (= (stemming "signor") "signor"))))

(deftest test-4877
  (testing "test case 4877"
    (is (= (stemming "kaisers") "kaiser"))))

(deftest test-4878
  (testing "test case 4878"
    (is (= (stemming "fresnel") "fresnel"))))

(deftest test-4879
  (testing "test case 4879"
    (is (= (stemming "condense") "condens"))))

(deftest test-4880
  (testing "test case 4880"
    (is (= (stemming "hyssop") "hyssop"))))

(deftest test-4881
  (testing "test case 4881"
    (is (= (stemming "scarificator") "scarif"))))

(deftest test-4882
  (testing "test case 4882"
    (is (= (stemming "motorists") "motorist"))))

(deftest test-4883
  (testing "test case 4883"
    (is (= (stemming "overdramatizes") "overdramat"))))

(deftest test-4884
  (testing "test case 4884"
    (is (= (stemming "wive") "wive"))))

(deftest test-4885
  (testing "test case 4885"
    (is (= (stemming "bodies") "bodi"))))

(deftest test-4886
  (testing "test case 4886"
    (is (= (stemming "pommeling") "pommel"))))

(deftest test-4887
  (testing "test case 4887"
    (is (= (stemming "haughtiest") "haughtiest"))))

(deftest test-4888
  (testing "test case 4888"
    (is (= (stemming "snobbisms") "snobbism"))))

(deftest test-4889
  (testing "test case 4889"
    (is (= (stemming "parlours") "parlour"))))

(deftest test-4890
  (testing "test case 4890"
    (is (= (stemming "looped") "loop"))))

(deftest test-4891
  (testing "test case 4891"
    (is (= (stemming "jangly") "jangli"))))

(deftest test-4892
  (testing "test case 4892"
    (is (= (stemming "cardiologists") "cardiologist"))))

(deftest test-4893
  (testing "test case 4893"
    (is (= (stemming "knucklier") "knucklier"))))

(deftest test-4894
  (testing "test case 4894"
    (is (= (stemming "whitefish") "whitefish"))))

(deftest test-4895
  (testing "test case 4895"
    (is (= (stemming "needing") "need"))))

(deftest test-4896
  (testing "test case 4896"
    (is (= (stemming "pluralized") "plural"))))

(deftest test-4897
  (testing "test case 4897"
    (is (= (stemming "muzzlers") "muzzler"))))

(deftest test-4898
  (testing "test case 4898"
    (is (= (stemming "armistice") "armistic"))))

(deftest test-4899
  (testing "test case 4899"
    (is (= (stemming "jackson") "jackson"))))

(deftest test-4900
  (testing "test case 4900"
    (is (= (stemming "legumes") "legum"))))

(deftest test-4901
  (testing "test case 4901"
    (is (= (stemming "necessities") "necess"))))

(deftest test-4902
  (testing "test case 4902"
    (is (= (stemming "refilter") "refilt"))))

(deftest test-4903
  (testing "test case 4903"
    (is (= (stemming "injectant") "inject"))))

(deftest test-4904
  (testing "test case 4904"
    (is (= (stemming "malthusianism") "malthusian"))))

(deftest test-4905
  (testing "test case 4905"
    (is (= (stemming "shard") "shard"))))

(deftest test-4906
  (testing "test case 4906"
    (is (= (stemming "razzed") "razz"))))

(deftest test-4907
  (testing "test case 4907"
    (is (= (stemming "bylaw") "bylaw"))))

(deftest test-4908
  (testing "test case 4908"
    (is (= (stemming "panamanians") "panamanian"))))

(deftest test-4909
  (testing "test case 4909"
    (is (= (stemming "distressing") "distress"))))

(deftest test-4910
  (testing "test case 4910"
    (is (= (stemming "danker") "danker"))))

(deftest test-4911
  (testing "test case 4911"
    (is (= (stemming "mousier") "mousier"))))

(deftest test-4912
  (testing "test case 4912"
    (is (= (stemming "ageing") "ag"))))

(deftest test-4913
  (testing "test case 4913"
    (is (= (stemming "effervescence") "effervesc"))))

(deftest test-4914
  (testing "test case 4914"
    (is (= (stemming "lashings") "lash"))))

(deftest test-4915
  (testing "test case 4915"
    (is (= (stemming "equivalencies") "equival"))))

(deftest test-4916
  (testing "test case 4916"
    (is (= (stemming "smartens") "smarten"))))

(deftest test-4917
  (testing "test case 4917"
    (is (= (stemming "joined") "join"))))

(deftest test-4918
  (testing "test case 4918"
    (is (= (stemming "stigmatize") "stigmat"))))

(deftest test-4919
  (testing "test case 4919"
    (is (= (stemming "flaming") "flame"))))

(deftest test-4920
  (testing "test case 4920"
    (is (= (stemming "attendance") "attend"))))

(deftest test-4921
  (testing "test case 4921"
    (is (= (stemming "processing") "process"))))

(deftest test-4922
  (testing "test case 4922"
    (is (= (stemming "carcinogeneses") "carcinogenes"))))

(deftest test-4923
  (testing "test case 4923"
    (is (= (stemming "preaccustomed") "preaccustom"))))

(deftest test-4924
  (testing "test case 4924"
    (is (= (stemming "tucked") "tuck"))))

(deftest test-4925
  (testing "test case 4925"
    (is (= (stemming "intrusts") "intrust"))))

(deftest test-4926
  (testing "test case 4926"
    (is (= (stemming "deductibility") "deduct"))))

(deftest test-4927
  (testing "test case 4927"
    (is (= (stemming "verging") "verg"))))

(deftest test-4928
  (testing "test case 4928"
    (is (= (stemming "survivers") "surviv"))))

(deftest test-4929
  (testing "test case 4929"
    (is (= (stemming "appreciable") "appreci"))))

(deftest test-4930
  (testing "test case 4930"
    (is (= (stemming "simplification") "simplif"))))

(deftest test-4931
  (testing "test case 4931"
    (is (= (stemming "disheartened") "dishearten"))))

(deftest test-4932
  (testing "test case 4932"
    (is (= (stemming "scrollwork") "scrollwork"))))

(deftest test-4933
  (testing "test case 4933"
    (is (= (stemming "slyness") "slyness"))))

(deftest test-4934
  (testing "test case 4934"
    (is (= (stemming "race") "race"))))

(deftest test-4935
  (testing "test case 4935"
    (is (= (stemming "peacemaker") "peacemak"))))

(deftest test-4936
  (testing "test case 4936"
    (is (= (stemming "hipnesses") "hip"))))

(deftest test-4937
  (testing "test case 4937"
    (is (= (stemming "infiltrating") "infiltr"))))

(deftest test-4938
  (testing "test case 4938"
    (is (= (stemming "extemporary") "extemporari"))))

(deftest test-4939
  (testing "test case 4939"
    (is (= (stemming "yabbers") "yabber"))))

(deftest test-4940
  (testing "test case 4940"
    (is (= (stemming "catalysts") "catalyst"))))

(deftest test-4941
  (testing "test case 4941"
    (is (= (stemming "lyricize") "lyric"))))

(deftest test-4942
  (testing "test case 4942"
    (is (= (stemming "chintzy") "chintzi"))))

(deftest test-4943
  (testing "test case 4943"
    (is (= (stemming "heaped") "heap"))))

(deftest test-4944
  (testing "test case 4944"
    (is (= (stemming "crisp") "crisp"))))

(deftest test-4945
  (testing "test case 4945"
    (is (= (stemming "elaboration") "elabor"))))

(deftest test-4946
  (testing "test case 4946"
    (is (= (stemming "espalier") "espali"))))

(deftest test-4947
  (testing "test case 4947"
    (is (= (stemming "sprinkling") "sprinkl"))))

(deftest test-4948
  (testing "test case 4948"
    (is (= (stemming "unbends") "unbend"))))

(deftest test-4949
  (testing "test case 4949"
    (is (= (stemming "reappearance") "reappear"))))

(deftest test-4950
  (testing "test case 4950"
    (is (= (stemming "partner") "partner"))))

(deftest test-4951
  (testing "test case 4951"
    (is (= (stemming "smite") "smite"))))

(deftest test-4952
  (testing "test case 4952"
    (is (= (stemming "agaves") "agav"))))

(deftest test-4953
  (testing "test case 4953"
    (is (= (stemming "ossea") "ossea"))))

(deftest test-4954
  (testing "test case 4954"
    (is (= (stemming "outdone") "outdon"))))

(deftest test-4955
  (testing "test case 4955"
    (is (= (stemming "pakistanis") "pakistani"))))

(deftest test-4956
  (testing "test case 4956"
    (is (= (stemming "encystments") "encyst"))))

(deftest test-4957
  (testing "test case 4957"
    (is (= (stemming "schmoes") "schmoe"))))

(deftest test-4958
  (testing "test case 4958"
    (is (= (stemming "smirching") "smirch"))))

(deftest test-4959
  (testing "test case 4959"
    (is (= (stemming "gratae") "grata"))))

(deftest test-4960
  (testing "test case 4960"
    (is (= (stemming "suable") "suabl"))))

(deftest test-4961
  (testing "test case 4961"
    (is (= (stemming "dutchmen") "dutchmen"))))

(deftest test-4962
  (testing "test case 4962"
    (is (= (stemming "presentability") "present"))))

(deftest test-4963
  (testing "test case 4963"
    (is (= (stemming "busts") "bust"))))

(deftest test-4964
  (testing "test case 4964"
    (is (= (stemming "schmoozes") "schmooz"))))

(deftest test-4965
  (testing "test case 4965"
    (is (= (stemming "cogently") "cogent"))))

(deftest test-4966
  (testing "test case 4966"
    (is (= (stemming "wk") "wk"))))

(deftest test-4967
  (testing "test case 4967"
    (is (= (stemming "weanling") "weanl"))))

(deftest test-4968
  (testing "test case 4968"
    (is (= (stemming "daubing") "daub"))))

(deftest test-4969
  (testing "test case 4969"
    (is (= (stemming "diplomacy") "diplomaci"))))

(deftest test-4970
  (testing "test case 4970"
    (is (= (stemming "earliest") "earliest"))))

(deftest test-4971
  (testing "test case 4971"
    (is (= (stemming "leafs") "leaf"))))

(deftest test-4972
  (testing "test case 4972"
    (is (= (stemming "buns") "bun"))))

(deftest test-4973
  (testing "test case 4973"
    (is (= (stemming "commemorations") "commemor"))))

(deftest test-4974
  (testing "test case 4974"
    (is (= (stemming "structured") "structur"))))

(deftest test-4975
  (testing "test case 4975"
    (is (= (stemming "educate") "educ"))))

(deftest test-4976
  (testing "test case 4976"
    (is (= (stemming "slabbery") "slabberi"))))

(deftest test-4977
  (testing "test case 4977"
    (is (= (stemming "semiprivate") "semipriv"))))

(deftest test-4978
  (testing "test case 4978"
    (is (= (stemming "thwacker") "thwacker"))))

(deftest test-4979
  (testing "test case 4979"
    (is (= (stemming "cosmologist") "cosmologist"))))

(deftest test-4980
  (testing "test case 4980"
    (is (= (stemming "arrhythmias") "arrhythmia"))))

(deftest test-4981
  (testing "test case 4981"
    (is (= (stemming "solves") "solv"))))

(deftest test-4982
  (testing "test case 4982"
    (is (= (stemming "pastor") "pastor"))))

(deftest test-4983
  (testing "test case 4983"
    (is (= (stemming "toads") "toad"))))

(deftest test-4984
  (testing "test case 4984"
    (is (= (stemming "assassin") "assassin"))))

(deftest test-4985
  (testing "test case 4985"
    (is (= (stemming "caldrons") "caldron"))))

(deftest test-4986
  (testing "test case 4986"
    (is (= (stemming "wheedling") "wheedl"))))

(deftest test-4987
  (testing "test case 4987"
    (is (= (stemming "terribleness") "terribl"))))

(deftest test-4988
  (testing "test case 4988"
    (is (= (stemming "antifreezes") "antifreez"))))

(deftest test-4989
  (testing "test case 4989"
    (is (= (stemming "medicative") "medic"))))

(deftest test-4990
  (testing "test case 4990"
    (is (= (stemming "mantid") "mantid"))))

(deftest test-4991
  (testing "test case 4991"
    (is (= (stemming "motorizing") "motor"))))

(deftest test-4992
  (testing "test case 4992"
    (is (= (stemming "reinvolvement") "reinvolv"))))

(deftest test-4993
  (testing "test case 4993"
    (is (= (stemming "enthusiastically") "enthusiast"))))

(deftest test-4994
  (testing "test case 4994"
    (is (= (stemming "binderies") "binderi"))))

(deftest test-4995
  (testing "test case 4995"
    (is (= (stemming "portables") "portabl"))))

(deftest test-4996
  (testing "test case 4996"
    (is (= (stemming "unexcusable") "unexcus"))))

(deftest test-4997
  (testing "test case 4997"
    (is (= (stemming "bariatrician") "bariatrician"))))

(deftest test-4998
  (testing "test case 4998"
    (is (= (stemming "pillowing") "pillow"))))

(deftest test-4999
  (testing "test case 4999"
    (is (= (stemming "infecting") "infect"))))

(deftest test-5000
  (testing "test case 5000"
    (is (= (stemming "unadjustable") "unadjust"))))

(deftest test-5001
  (testing "test case 5001"
    (is (= (stemming "clerkdom") "clerkdom"))))

(deftest test-5002
  (testing "test case 5002"
    (is (= (stemming "jollying") "jolli"))))

(deftest test-5003
  (testing "test case 5003"
    (is (= (stemming "thiosulfate") "thiosulf"))))

(deftest test-5004
  (testing "test case 5004"
    (is (= (stemming "pegged") "peg"))))

(deftest test-5005
  (testing "test case 5005"
    (is (= (stemming "snubby") "snubbi"))))

(deftest test-5006
  (testing "test case 5006"
    (is (= (stemming "redout") "redout"))))

(deftest test-5007
  (testing "test case 5007"
    (is (= (stemming "carbarns") "carbarn"))))

(deftest test-5008
  (testing "test case 5008"
    (is (= (stemming "beslime") "beslim"))))

(deftest test-5009
  (testing "test case 5009"
    (is (= (stemming "opinions") "opinion"))))

(deftest test-5010
  (testing "test case 5010"
    (is (= (stemming "stinkard") "stinkard"))))

(deftest test-5011
  (testing "test case 5011"
    (is (= (stemming "reinform") "reinform"))))

(deftest test-5012
  (testing "test case 5012"
    (is (= (stemming "strolling") "stroll"))))

(deftest test-5013
  (testing "test case 5013"
    (is (= (stemming "whittlers") "whittler"))))

(deftest test-5014
  (testing "test case 5014"
    (is (= (stemming "dines") "dine"))))

(deftest test-5015
  (testing "test case 5015"
    (is (= (stemming "wiriest") "wiriest"))))

(deftest test-5016
  (testing "test case 5016"
    (is (= (stemming "soupiest") "soupiest"))))

(deftest test-5017
  (testing "test case 5017"
    (is (= (stemming "histed") "hist"))))

(deftest test-5018
  (testing "test case 5018"
    (is (= (stemming "vermouth") "vermouth"))))

(deftest test-5019
  (testing "test case 5019"
    (is (= (stemming "basks") "bask"))))

(deftest test-5020
  (testing "test case 5020"
    (is (= (stemming "subjoin") "subjoin"))))

(deftest test-5021
  (testing "test case 5021"
    (is (= (stemming "bone") "bone"))))

(deftest test-5022
  (testing "test case 5022"
    (is (= (stemming "simpers") "simper"))))

(deftest test-5023
  (testing "test case 5023"
    (is (= (stemming "sheepmen") "sheepmen"))))

(deftest test-5024
  (testing "test case 5024"
    (is (= (stemming "loaners") "loaner"))))

(deftest test-5025
  (testing "test case 5025"
    (is (= (stemming "electricians") "electrician"))))

(deftest test-5026
  (testing "test case 5026"
    (is (= (stemming "radiosensitive") "radiosensit"))))

(deftest test-5027
  (testing "test case 5027"
    (is (= (stemming "buckbean") "buckbean"))))

(deftest test-5028
  (testing "test case 5028"
    (is (= (stemming "indigenous") "indigen"))))

(deftest test-5029
  (testing "test case 5029"
    (is (= (stemming "rehydrating") "rehydr"))))

(deftest test-5030
  (testing "test case 5030"
    (is (= (stemming "harrumphed") "harrumph"))))

(deftest test-5031
  (testing "test case 5031"
    (is (= (stemming "castellan") "castellan"))))

(deftest test-5032
  (testing "test case 5032"
    (is (= (stemming "detente") "detent"))))

(deftest test-5033
  (testing "test case 5033"
    (is (= (stemming "waddles") "waddl"))))

(deftest test-5034
  (testing "test case 5034"
    (is (= (stemming "roll") "roll"))))

(deftest test-5035
  (testing "test case 5035"
    (is (= (stemming "knotting") "knot"))))

(deftest test-5036
  (testing "test case 5036"
    (is (= (stemming "septics") "septic"))))

(deftest test-5037
  (testing "test case 5037"
    (is (= (stemming "enjoyed") "enjoi"))))

(deftest test-5038
  (testing "test case 5038"
    (is (= (stemming "hindgut") "hindgut"))))

(deftest test-5039
  (testing "test case 5039"
    (is (= (stemming "divestitive") "divestit"))))

(deftest test-5040
  (testing "test case 5040"
    (is (= (stemming "neurologists") "neurologist"))))

(deftest test-5041
  (testing "test case 5041"
    (is (= (stemming "rosaries") "rosari"))))

(deftest test-5042
  (testing "test case 5042"
    (is (= (stemming "untactful") "untact"))))

(deftest test-5043
  (testing "test case 5043"
    (is (= (stemming "saintliest") "saintliest"))))

(deftest test-5044
  (testing "test case 5044"
    (is (= (stemming "disembowel") "disembowel"))))

(deftest test-5045
  (testing "test case 5045"
    (is (= (stemming "pat") "pat"))))

(deftest test-5046
  (testing "test case 5046"
    (is (= (stemming "expungers") "expung"))))

(deftest test-5047
  (testing "test case 5047"
    (is (= (stemming "sunstones") "sunston"))))

(deftest test-5048
  (testing "test case 5048"
    (is (= (stemming "marketed") "market"))))

(deftest test-5049
  (testing "test case 5049"
    (is (= (stemming "inartistic") "inartist"))))

(deftest test-5050
  (testing "test case 5050"
    (is (= (stemming "masted") "mast"))))

(deftest test-5051
  (testing "test case 5051"
    (is (= (stemming "embodied") "embodi"))))

(deftest test-5052
  (testing "test case 5052"
    (is (= (stemming "grief") "grief"))))

(deftest test-5053
  (testing "test case 5053"
    (is (= (stemming "milestone") "mileston"))))

(deftest test-5054
  (testing "test case 5054"
    (is (= (stemming "hurly") "hurli"))))

(deftest test-5055
  (testing "test case 5055"
    (is (= (stemming "tenacities") "tenac"))))

(deftest test-5056
  (testing "test case 5056"
    (is (= (stemming "defter") "defter"))))

(deftest test-5057
  (testing "test case 5057"
    (is (= (stemming "potbellies") "potbelli"))))

(deftest test-5058
  (testing "test case 5058"
    (is (= (stemming "hawked") "hawk"))))

(deftest test-5059
  (testing "test case 5059"
    (is (= (stemming "ghanaians") "ghanaian"))))

(deftest test-5060
  (testing "test case 5060"
    (is (= (stemming "gelling") "gell"))))

(deftest test-5061
  (testing "test case 5061"
    (is (= (stemming "passable") "passabl"))))

(deftest test-5062
  (testing "test case 5062"
    (is (= (stemming "nonverbal") "nonverb"))))

(deftest test-5063
  (testing "test case 5063"
    (is (= (stemming "tormenter") "torment"))))

(deftest test-5064
  (testing "test case 5064"
    (is (= (stemming "matey") "matei"))))

(deftest test-5065
  (testing "test case 5065"
    (is (= (stemming "tapes") "tape"))))

(deftest test-5066
  (testing "test case 5066"
    (is (= (stemming "recleaned") "reclean"))))

(deftest test-5067
  (testing "test case 5067"
    (is (= (stemming "dogcatcher") "dogcatch"))))

(deftest test-5068
  (testing "test case 5068"
    (is (= (stemming "depositor") "depositor"))))

(deftest test-5069
  (testing "test case 5069"
    (is (= (stemming "subtler") "subtler"))))

(deftest test-5070
  (testing "test case 5070"
    (is (= (stemming "toolhead") "toolhead"))))

(deftest test-5071
  (testing "test case 5071"
    (is (= (stemming "greek") "greek"))))

(deftest test-5072
  (testing "test case 5072"
    (is (= (stemming "wranglers") "wrangler"))))

(deftest test-5073
  (testing "test case 5073"
    (is (= (stemming "rinsings") "rins"))))

(deftest test-5074
  (testing "test case 5074"
    (is (= (stemming "currier") "currier"))))

(deftest test-5075
  (testing "test case 5075"
    (is (= (stemming "motes") "mote"))))

(deftest test-5076
  (testing "test case 5076"
    (is (= (stemming "affirmation") "affirm"))))

(deftest test-5077
  (testing "test case 5077"
    (is (= (stemming "dissipator") "dissip"))))

(deftest test-5078
  (testing "test case 5078"
    (is (= (stemming "employment") "employ"))))

(deftest test-5079
  (testing "test case 5079"
    (is (= (stemming "injectors") "injector"))))

(deftest test-5080
  (testing "test case 5080"
    (is (= (stemming "pastimes") "pastim"))))

(deftest test-5081
  (testing "test case 5081"
    (is (= (stemming "hackberry") "hackberri"))))

(deftest test-5082
  (testing "test case 5082"
    (is (= (stemming "hejira") "hejira"))))

(deftest test-5083
  (testing "test case 5083"
    (is (= (stemming "unbeknown") "unbeknown"))))

(deftest test-5084
  (testing "test case 5084"
    (is (= (stemming "surtaxes") "surtax"))))

(deftest test-5085
  (testing "test case 5085"
    (is (= (stemming "midday") "middai"))))

(deftest test-5086
  (testing "test case 5086"
    (is (= (stemming "conundrums") "conundrum"))))

(deftest test-5087
  (testing "test case 5087"
    (is (= (stemming "cheaps") "cheap"))))

(deftest test-5088
  (testing "test case 5088"
    (is (= (stemming "grins") "grin"))))

(deftest test-5089
  (testing "test case 5089"
    (is (= (stemming "compacted") "compact"))))

(deftest test-5090
  (testing "test case 5090"
    (is (= (stemming "viewfinders") "viewfind"))))

(deftest test-5091
  (testing "test case 5091"
    (is (= (stemming "finites") "finit"))))

(deftest test-5092
  (testing "test case 5092"
    (is (= (stemming "empathies") "empathi"))))

(deftest test-5093
  (testing "test case 5093"
    (is (= (stemming "cliquish") "cliquish"))))

(deftest test-5094
  (testing "test case 5094"
    (is (= (stemming "plumber") "plumber"))))

(deftest test-5095
  (testing "test case 5095"
    (is (= (stemming "autodials") "autodi"))))

(deftest test-5096
  (testing "test case 5096"
    (is (= (stemming "scepter") "scepter"))))

(deftest test-5097
  (testing "test case 5097"
    (is (= (stemming "pealing") "peal"))))

(deftest test-5098
  (testing "test case 5098"
    (is (= (stemming "prudences") "prudenc"))))

(deftest test-5099
  (testing "test case 5099"
    (is (= (stemming "inadmissibly") "inadmiss"))))

(deftest test-5100
  (testing "test case 5100"
    (is (= (stemming "sylph") "sylph"))))

(deftest test-5101
  (testing "test case 5101"
    (is (= (stemming "permeable") "permeabl"))))

(deftest test-5102
  (testing "test case 5102"
    (is (= (stemming "boer") "boer"))))

(deftest test-5103
  (testing "test case 5103"
    (is (= (stemming "paydays") "paydai"))))

(deftest test-5104
  (testing "test case 5104"
    (is (= (stemming "avengingly") "avengingli"))))

(deftest test-5105
  (testing "test case 5105"
    (is (= (stemming "farinaceous") "farinac"))))

(deftest test-5106
  (testing "test case 5106"
    (is (= (stemming "joying") "joi"))))

(deftest test-5107
  (testing "test case 5107"
    (is (= (stemming "lashes") "lash"))))

(deftest test-5108
  (testing "test case 5108"
    (is (= (stemming "buffet") "buffet"))))

(deftest test-5109
  (testing "test case 5109"
    (is (= (stemming "macroeconomic") "macroeconom"))))

(deftest test-5110
  (testing "test case 5110"
    (is (= (stemming "ionizers") "ioniz"))))

(deftest test-5111
  (testing "test case 5111"
    (is (= (stemming "cunnilinctus") "cunnilinctu"))))

(deftest test-5112
  (testing "test case 5112"
    (is (= (stemming "cesium") "cesium"))))

(deftest test-5113
  (testing "test case 5113"
    (is (= (stemming "attributive") "attribut"))))

(deftest test-5114
  (testing "test case 5114"
    (is (= (stemming "cranium") "cranium"))))

(deftest test-5115
  (testing "test case 5115"
    (is (= (stemming "commerced") "commerc"))))

(deftest test-5116
  (testing "test case 5116"
    (is (= (stemming "incarceration") "incarcer"))))

(deftest test-5117
  (testing "test case 5117"
    (is (= (stemming "yelpers") "yelper"))))

(deftest test-5118
  (testing "test case 5118"
    (is (= (stemming "rode") "rode"))))

(deftest test-5119
  (testing "test case 5119"
    (is (= (stemming "theurgy") "theurgi"))))

(deftest test-5120
  (testing "test case 5120"
    (is (= (stemming "polishers") "polish"))))

(deftest test-5121
  (testing "test case 5121"
    (is (= (stemming "thermoregulatory") "thermoregulatori"))))

(deftest test-5122
  (testing "test case 5122"
    (is (= (stemming "strangely") "strang"))))

(deftest test-5123
  (testing "test case 5123"
    (is (= (stemming "twinight") "twinight"))))

(deftest test-5124
  (testing "test case 5124"
    (is (= (stemming "engorged") "engorg"))))

(deftest test-5125
  (testing "test case 5125"
    (is (= (stemming "lacunar") "lacunar"))))

(deftest test-5126
  (testing "test case 5126"
    (is (= (stemming "chancelleries") "chancelleri"))))

(deftest test-5127
  (testing "test case 5127"
    (is (= (stemming "hauteur") "hauteur"))))

(deftest test-5128
  (testing "test case 5128"
    (is (= (stemming "uncommonness") "uncommon"))))

(deftest test-5129
  (testing "test case 5129"
    (is (= (stemming "gagging") "gag"))))

(deftest test-5130
  (testing "test case 5130"
    (is (= (stemming "cathexis") "cathexi"))))

(deftest test-5131
  (testing "test case 5131"
    (is (= (stemming "disinfections") "disinfect"))))

(deftest test-5132
  (testing "test case 5132"
    (is (= (stemming "delouses") "delous"))))

(deftest test-5133
  (testing "test case 5133"
    (is (= (stemming "migrations") "migrat"))))

(deftest test-5134
  (testing "test case 5134"
    (is (= (stemming "laborsaving") "laborsav"))))

(deftest test-5135
  (testing "test case 5135"
    (is (= (stemming "enhance") "enhanc"))))

(deftest test-5136
  (testing "test case 5136"
    (is (= (stemming "circulated") "circul"))))

(deftest test-5137
  (testing "test case 5137"
    (is (= (stemming "innuendos") "innuendo"))))

(deftest test-5138
  (testing "test case 5138"
    (is (= (stemming "bidets") "bidet"))))

(deftest test-5139
  (testing "test case 5139"
    (is (= (stemming "latexes") "latex"))))

(deftest test-5140
  (testing "test case 5140"
    (is (= (stemming "oater") "oater"))))

(deftest test-5141
  (testing "test case 5141"
    (is (= (stemming "unmemorized") "unmemor"))))

(deftest test-5142
  (testing "test case 5142"
    (is (= (stemming "buttressed") "buttress"))))

(deftest test-5143
  (testing "test case 5143"
    (is (= (stemming "moodier") "moodier"))))

(deftest test-5144
  (testing "test case 5144"
    (is (= (stemming "flirtations") "flirtat"))))

(deftest test-5145
  (testing "test case 5145"
    (is (= (stemming "groveled") "grovel"))))

(deftest test-5146
  (testing "test case 5146"
    (is (= (stemming "pacemakers") "pacemak"))))

(deftest test-5147
  (testing "test case 5147"
    (is (= (stemming "diem") "diem"))))

(deftest test-5148
  (testing "test case 5148"
    (is (= (stemming "overemphatic") "overemphat"))))

(deftest test-5149
  (testing "test case 5149"
    (is (= (stemming "contusion") "contus"))))

(deftest test-5150
  (testing "test case 5150"
    (is (= (stemming "hogwash") "hogwash"))))

(deftest test-5151
  (testing "test case 5151"
    (is (= (stemming "confutations") "confut"))))

(deftest test-5152
  (testing "test case 5152"
    (is (= (stemming "excoriation") "excori"))))

(deftest test-5153
  (testing "test case 5153"
    (is (= (stemming "cannibalistic") "cannibalist"))))

(deftest test-5154
  (testing "test case 5154"
    (is (= (stemming "unerased") "uneras"))))

(deftest test-5155
  (testing "test case 5155"
    (is (= (stemming "deaccession") "deaccess"))))

(deftest test-5156
  (testing "test case 5156"
    (is (= (stemming "hydrophobia") "hydrophobia"))))

(deftest test-5157
  (testing "test case 5157"
    (is (= (stemming "coatis") "coati"))))

(deftest test-5158
  (testing "test case 5158"
    (is (= (stemming "gulfs") "gulf"))))

(deftest test-5159
  (testing "test case 5159"
    (is (= (stemming "valances") "valanc"))))

(deftest test-5160
  (testing "test case 5160"
    (is (= (stemming "misrepresenter") "misrepresent"))))

(deftest test-5161
  (testing "test case 5161"
    (is (= (stemming "cased") "case"))))

(deftest test-5162
  (testing "test case 5162"
    (is (= (stemming "ugli") "ugli"))))

(deftest test-5163
  (testing "test case 5163"
    (is (= (stemming "extensors") "extensor"))))

(deftest test-5164
  (testing "test case 5164"
    (is (= (stemming "inadmissibility") "inadmiss"))))

(deftest test-5165
  (testing "test case 5165"
    (is (= (stemming "played") "plai"))))

(deftest test-5166
  (testing "test case 5166"
    (is (= (stemming "tercel") "tercel"))))

(deftest test-5167
  (testing "test case 5167"
    (is (= (stemming "complexes") "complex"))))

(deftest test-5168
  (testing "test case 5168"
    (is (= (stemming "airlines") "airlin"))))

(deftest test-5169
  (testing "test case 5169"
    (is (= (stemming "accouters") "accout"))))

(deftest test-5170
  (testing "test case 5170"
    (is (= (stemming "caimans") "caiman"))))

(deftest test-5171
  (testing "test case 5171"
    (is (= (stemming "rewrought") "rewrought"))))

(deftest test-5172
  (testing "test case 5172"
    (is (= (stemming "pastural") "pastur"))))

(deftest test-5173
  (testing "test case 5173"
    (is (= (stemming "moneychanger") "moneychang"))))

(deftest test-5174
  (testing "test case 5174"
    (is (= (stemming "formed") "form"))))

(deftest test-5175
  (testing "test case 5175"
    (is (= (stemming "domains") "domain"))))

(deftest test-5176
  (testing "test case 5176"
    (is (= (stemming "curtaining") "curtain"))))

(deftest test-5177
  (testing "test case 5177"
    (is (= (stemming "roads") "road"))))

(deftest test-5178
  (testing "test case 5178"
    (is (= (stemming "ran") "ran"))))

(deftest test-5179
  (testing "test case 5179"
    (is (= (stemming "cheekiest") "cheekiest"))))

(deftest test-5180
  (testing "test case 5180"
    (is (= (stemming "pol") "pol"))))

(deftest test-5181
  (testing "test case 5181"
    (is (= (stemming "days") "dai"))))

(deftest test-5182
  (testing "test case 5182"
    (is (= (stemming "corroders") "corrod"))))

(deftest test-5183
  (testing "test case 5183"
    (is (= (stemming "biocide") "biocid"))))

(deftest test-5184
  (testing "test case 5184"
    (is (= (stemming "cessation") "cessat"))))

(deftest test-5185
  (testing "test case 5185"
    (is (= (stemming "plasters") "plaster"))))

(deftest test-5186
  (testing "test case 5186"
    (is (= (stemming "potent") "potent"))))

(deftest test-5187
  (testing "test case 5187"
    (is (= (stemming "recommend") "recommend"))))

(deftest test-5188
  (testing "test case 5188"
    (is (= (stemming "rapidness") "rapid"))))

(deftest test-5189
  (testing "test case 5189"
    (is (= (stemming "realigning") "realign"))))

(deftest test-5190
  (testing "test case 5190"
    (is (= (stemming "sulfured") "sulfur"))))

(deftest test-5191
  (testing "test case 5191"
    (is (= (stemming "alleviating") "allevi"))))

(deftest test-5192
  (testing "test case 5192"
    (is (= (stemming "ranchos") "rancho"))))

(deftest test-5193
  (testing "test case 5193"
    (is (= (stemming "growler") "growler"))))

(deftest test-5194
  (testing "test case 5194"
    (is (= (stemming "soldering") "solder"))))

(deftest test-5195
  (testing "test case 5195"
    (is (= (stemming "ethos") "etho"))))

(deftest test-5196
  (testing "test case 5196"
    (is (= (stemming "evitable") "evit"))))

(deftest test-5197
  (testing "test case 5197"
    (is (= (stemming "monstrous") "monstrou"))))

(deftest test-5198
  (testing "test case 5198"
    (is (= (stemming "reconciliations") "reconcili"))))

(deftest test-5199
  (testing "test case 5199"
    (is (= (stemming "burners") "burner"))))

(deftest test-5200
  (testing "test case 5200"
    (is (= (stemming "vaccinator") "vaccin"))))

(deftest test-5201
  (testing "test case 5201"
    (is (= (stemming "sitarist") "sitarist"))))

(deftest test-5202
  (testing "test case 5202"
    (is (= (stemming "leader") "leader"))))

(deftest test-5203
  (testing "test case 5203"
    (is (= (stemming "tickets") "ticket"))))

(deftest test-5204
  (testing "test case 5204"
    (is (= (stemming "fragmentariness") "fragmentari"))))

(deftest test-5205
  (testing "test case 5205"
    (is (= (stemming "biddings") "bid"))))

(deftest test-5206
  (testing "test case 5206"
    (is (= (stemming "ostmarks") "ostmark"))))

(deftest test-5207
  (testing "test case 5207"
    (is (= (stemming "smit") "smit"))))

(deftest test-5208
  (testing "test case 5208"
    (is (= (stemming "accident") "accid"))))

(deftest test-5209
  (testing "test case 5209"
    (is (= (stemming "clairvoyantly") "clairvoyantli"))))

(deftest test-5210
  (testing "test case 5210"
    (is (= (stemming "melbourne") "melbourn"))))

(deftest test-5211
  (testing "test case 5211"
    (is (= (stemming "parsimoniously") "parsimoni"))))

(deftest test-5212
  (testing "test case 5212"
    (is (= (stemming "grapes") "grape"))))

(deftest test-5213
  (testing "test case 5213"
    (is (= (stemming "chromes") "chrome"))))

(deftest test-5214
  (testing "test case 5214"
    (is (= (stemming "brigantines") "brigantin"))))

(deftest test-5215
  (testing "test case 5215"
    (is (= (stemming "headlights") "headlight"))))

(deftest test-5216
  (testing "test case 5216"
    (is (= (stemming "officiated") "offici"))))

(deftest test-5217
  (testing "test case 5217"
    (is (= (stemming "undecorated") "undecor"))))

(deftest test-5218
  (testing "test case 5218"
    (is (= (stemming "frustration") "frustrat"))))

(deftest test-5219
  (testing "test case 5219"
    (is (= (stemming "holographic") "holograph"))))

(deftest test-5220
  (testing "test case 5220"
    (is (= (stemming "pastorales") "pastoral"))))

(deftest test-5221
  (testing "test case 5221"
    (is (= (stemming "maid") "maid"))))

(deftest test-5222
  (testing "test case 5222"
    (is (= (stemming "misc") "misc"))))

(deftest test-5223
  (testing "test case 5223"
    (is (= (stemming "unblocking") "unblock"))))

(deftest test-5224
  (testing "test case 5224"
    (is (= (stemming "ammonify") "ammonifi"))))

(deftest test-5225
  (testing "test case 5225"
    (is (= (stemming "remounting") "remount"))))

(deftest test-5226
  (testing "test case 5226"
    (is (= (stemming "maidish") "maidish"))))

(deftest test-5227
  (testing "test case 5227"
    (is (= (stemming "deaconed") "deacon"))))

(deftest test-5228
  (testing "test case 5228"
    (is (= (stemming "clangour") "clangour"))))

(deftest test-5229
  (testing "test case 5229"
    (is (= (stemming "termers") "termer"))))

(deftest test-5230
  (testing "test case 5230"
    (is (= (stemming "dollied") "dolli"))))

(deftest test-5231
  (testing "test case 5231"
    (is (= (stemming "aloofness") "aloof"))))

(deftest test-5232
  (testing "test case 5232"
    (is (= (stemming "cheerleader") "cheerlead"))))

(deftest test-5233
  (testing "test case 5233"
    (is (= (stemming "gobs") "gob"))))

(deftest test-5234
  (testing "test case 5234"
    (is (= (stemming "anticipator") "anticip"))))

(deftest test-5235
  (testing "test case 5235"
    (is (= (stemming "gavotting") "gavot"))))

(deftest test-5236
  (testing "test case 5236"
    (is (= (stemming "worrywarts") "worrywart"))))

(deftest test-5237
  (testing "test case 5237"
    (is (= (stemming "windlass") "windlass"))))

(deftest test-5238
  (testing "test case 5238"
    (is (= (stemming "wafered") "wafer"))))

(deftest test-5239
  (testing "test case 5239"
    (is (= (stemming "proviso") "proviso"))))

(deftest test-5240
  (testing "test case 5240"
    (is (= (stemming "daturas") "datura"))))

(deftest test-5241
  (testing "test case 5241"
    (is (= (stemming "incubates") "incub"))))

(deftest test-5242
  (testing "test case 5242"
    (is (= (stemming "urger") "urger"))))

(deftest test-5243
  (testing "test case 5243"
    (is (= (stemming "weals") "weal"))))

(deftest test-5244
  (testing "test case 5244"
    (is (= (stemming "untied") "unti"))))

(deftest test-5245
  (testing "test case 5245"
    (is (= (stemming "hermaphrodite") "hermaphrodit"))))

(deftest test-5246
  (testing "test case 5246"
    (is (= (stemming "berated") "berat"))))

(deftest test-5247
  (testing "test case 5247"
    (is (= (stemming "dole") "dole"))))

(deftest test-5248
  (testing "test case 5248"
    (is (= (stemming "usuries") "usuri"))))

(deftest test-5249
  (testing "test case 5249"
    (is (= (stemming "personifier") "personifi"))))

(deftest test-5250
  (testing "test case 5250"
    (is (= (stemming "pirog") "pirog"))))

(deftest test-5251
  (testing "test case 5251"
    (is (= (stemming "remounts") "remount"))))

(deftest test-5252
  (testing "test case 5252"
    (is (= (stemming "pot") "pot"))))

(deftest test-5253
  (testing "test case 5253"
    (is (= (stemming "sagacity") "sagac"))))

(deftest test-5254
  (testing "test case 5254"
    (is (= (stemming "centric") "centric"))))

(deftest test-5255
  (testing "test case 5255"
    (is (= (stemming "agglutinated") "agglutin"))))

(deftest test-5256
  (testing "test case 5256"
    (is (= (stemming "nonviolence") "nonviol"))))

(deftest test-5257
  (testing "test case 5257"
    (is (= (stemming "forevers") "forev"))))

(deftest test-5258
  (testing "test case 5258"
    (is (= (stemming "metricized") "metric"))))

(deftest test-5259
  (testing "test case 5259"
    (is (= (stemming "nationalizations") "nation"))))

(deftest test-5260
  (testing "test case 5260"
    (is (= (stemming "unaccounted") "unaccount"))))

(deftest test-5261
  (testing "test case 5261"
    (is (= (stemming "adaptive") "adapt"))))

(deftest test-5262
  (testing "test case 5262"
    (is (= (stemming "swamped") "swamp"))))

(deftest test-5263
  (testing "test case 5263"
    (is (= (stemming "bottlers") "bottler"))))

(deftest test-5264
  (testing "test case 5264"
    (is (= (stemming "rivederci") "rivederci"))))

(deftest test-5265
  (testing "test case 5265"
    (is (= (stemming "spherical") "spheric"))))

(deftest test-5266
  (testing "test case 5266"
    (is (= (stemming "vibrants") "vibrant"))))

(deftest test-5267
  (testing "test case 5267"
    (is (= (stemming "vastity") "vastiti"))))

(deftest test-5268
  (testing "test case 5268"
    (is (= (stemming "muttons") "mutton"))))

(deftest test-5269
  (testing "test case 5269"
    (is (= (stemming "ovoids") "ovoid"))))

(deftest test-5270
  (testing "test case 5270"
    (is (= (stemming "subcurators") "subcur"))))

(deftest test-5271
  (testing "test case 5271"
    (is (= (stemming "lion") "lion"))))

(deftest test-5272
  (testing "test case 5272"
    (is (= (stemming "treacly") "treacli"))))

(deftest test-5273
  (testing "test case 5273"
    (is (= (stemming "rewrapped") "rewrap"))))

(deftest test-5274
  (testing "test case 5274"
    (is (= (stemming "moxies") "moxi"))))

(deftest test-5275
  (testing "test case 5275"
    (is (= (stemming "barmaid") "barmaid"))))

(deftest test-5276
  (testing "test case 5276"
    (is (= (stemming "overthrower") "overthrow"))))

(deftest test-5277
  (testing "test case 5277"
    (is (= (stemming "limes") "lime"))))

(deftest test-5278
  (testing "test case 5278"
    (is (= (stemming "decares") "decar"))))

(deftest test-5279
  (testing "test case 5279"
    (is (= (stemming "pseudointellectuals") "pseudointellectu"))))

(deftest test-5280
  (testing "test case 5280"
    (is (= (stemming "quiverers") "quiver"))))

(deftest test-5281
  (testing "test case 5281"
    (is (= (stemming "hayseeds") "hayse"))))

(deftest test-5282
  (testing "test case 5282"
    (is (= (stemming "traduced") "traduc"))))

(deftest test-5283
  (testing "test case 5283"
    (is (= (stemming "sculpted") "sculpt"))))

(deftest test-5284
  (testing "test case 5284"
    (is (= (stemming "pushpins") "pushpin"))))

(deftest test-5285
  (testing "test case 5285"
    (is (= (stemming "congener") "congen"))))

(deftest test-5286
  (testing "test case 5286"
    (is (= (stemming "kiln") "kiln"))))

(deftest test-5287
  (testing "test case 5287"
    (is (= (stemming "commingling") "commingl"))))

(deftest test-5288
  (testing "test case 5288"
    (is (= (stemming "lucubrate") "lucubr"))))

(deftest test-5289
  (testing "test case 5289"
    (is (= (stemming "chinatown") "chinatown"))))

(deftest test-5290
  (testing "test case 5290"
    (is (= (stemming "corrupted") "corrupt"))))

(deftest test-5291
  (testing "test case 5291"
    (is (= (stemming "cookware") "cookwar"))))

(deftest test-5292
  (testing "test case 5292"
    (is (= (stemming "sups") "sup"))))

(deftest test-5293
  (testing "test case 5293"
    (is (= (stemming "devices") "devic"))))

(deftest test-5294
  (testing "test case 5294"
    (is (= (stemming "attiring") "attir"))))

(deftest test-5295
  (testing "test case 5295"
    (is (= (stemming "reconnect") "reconnect"))))

(deftest test-5296
  (testing "test case 5296"
    (is (= (stemming "cakewalked") "cakewalk"))))

(deftest test-5297
  (testing "test case 5297"
    (is (= (stemming "potboiling") "potboil"))))

(deftest test-5298
  (testing "test case 5298"
    (is (= (stemming "snuffling") "snuffl"))))

(deftest test-5299
  (testing "test case 5299"
    (is (= (stemming "fulgent") "fulgent"))))

(deftest test-5300
  (testing "test case 5300"
    (is (= (stemming "franchisees") "franchise"))))

(deftest test-5301
  (testing "test case 5301"
    (is (= (stemming "expansionism") "expansion"))))

(deftest test-5302
  (testing "test case 5302"
    (is (= (stemming "interbreeds") "interbre"))))

(deftest test-5303
  (testing "test case 5303"
    (is (= (stemming "substantively") "substant"))))

(deftest test-5304
  (testing "test case 5304"
    (is (= (stemming "qualifies") "qualifi"))))

(deftest test-5305
  (testing "test case 5305"
    (is (= (stemming "griping") "gripe"))))

(deftest test-5306
  (testing "test case 5306"
    (is (= (stemming "formlessness") "formless"))))

(deftest test-5307
  (testing "test case 5307"
    (is (= (stemming "tracers") "tracer"))))

(deftest test-5308
  (testing "test case 5308"
    (is (= (stemming "snowfall") "snowfal"))))

(deftest test-5309
  (testing "test case 5309"
    (is (= (stemming "gutsiest") "gutsiest"))))

(deftest test-5310
  (testing "test case 5310"
    (is (= (stemming "poppets") "poppet"))))

(deftest test-5311
  (testing "test case 5311"
    (is (= (stemming "affix") "affix"))))

(deftest test-5312
  (testing "test case 5312"
    (is (= (stemming "heathier") "heathier"))))

(deftest test-5313
  (testing "test case 5313"
    (is (= (stemming "parson") "parson"))))

(deftest test-5314
  (testing "test case 5314"
    (is (= (stemming "coercers") "coercer"))))

(deftest test-5315
  (testing "test case 5315"
    (is (= (stemming "reweighs") "reweigh"))))

(deftest test-5316
  (testing "test case 5316"
    (is (= (stemming "bolivias") "bolivia"))))

(deftest test-5317
  (testing "test case 5317"
    (is (= (stemming "incitement") "incit"))))

(deftest test-5318
  (testing "test case 5318"
    (is (= (stemming "deathy") "deathi"))))

(deftest test-5319
  (testing "test case 5319"
    (is (= (stemming "uncrossing") "uncross"))))

(deftest test-5320
  (testing "test case 5320"
    (is (= (stemming "dehumidification") "dehumidif"))))

(deftest test-5321
  (testing "test case 5321"
    (is (= (stemming "rodder") "rodder"))))

(deftest test-5322
  (testing "test case 5322"
    (is (= (stemming "dunghills") "dunghil"))))

(deftest test-5323
  (testing "test case 5323"
    (is (= (stemming "ostomy") "ostomi"))))

(deftest test-5324
  (testing "test case 5324"
    (is (= (stemming "disintegration") "disintegr"))))

(deftest test-5325
  (testing "test case 5325"
    (is (= (stemming "ardor") "ardor"))))

(deftest test-5326
  (testing "test case 5326"
    (is (= (stemming "jingoistic") "jingoist"))))

(deftest test-5327
  (testing "test case 5327"
    (is (= (stemming "skinny") "skinni"))))

(deftest test-5328
  (testing "test case 5328"
    (is (= (stemming "enhanced") "enhanc"))))

(deftest test-5329
  (testing "test case 5329"
    (is (= (stemming "ditties") "ditti"))))

(deftest test-5330
  (testing "test case 5330"
    (is (= (stemming "misbehavers") "misbehav"))))

(deftest test-5331
  (testing "test case 5331"
    (is (= (stemming "fuzz") "fuzz"))))

(deftest test-5332
  (testing "test case 5332"
    (is (= (stemming "interrelation") "interrel"))))

(deftest test-5333
  (testing "test case 5333"
    (is (= (stemming "teashop") "teashop"))))

(deftest test-5334
  (testing "test case 5334"
    (is (= (stemming "scanner") "scanner"))))

(deftest test-5335
  (testing "test case 5335"
    (is (= (stemming "anthropoid") "anthropoid"))))

(deftest test-5336
  (testing "test case 5336"
    (is (= (stemming "homosexually") "homosexu"))))

(deftest test-5337
  (testing "test case 5337"
    (is (= (stemming "discombobulate") "discombobul"))))

(deftest test-5338
  (testing "test case 5338"
    (is (= (stemming "pleadings") "plead"))))

(deftest test-5339
  (testing "test case 5339"
    (is (= (stemming "clairvoyance") "clairvoy"))))

(deftest test-5340
  (testing "test case 5340"
    (is (= (stemming "gladiate") "gladiat"))))

(deftest test-5341
  (testing "test case 5341"
    (is (= (stemming "potsherds") "potsherd"))))

(deftest test-5342
  (testing "test case 5342"
    (is (= (stemming "nestled") "nestl"))))

(deftest test-5343
  (testing "test case 5343"
    (is (= (stemming "vapouring") "vapour"))))

(deftest test-5344
  (testing "test case 5344"
    (is (= (stemming "confidentialness") "confidenti"))))

(deftest test-5345
  (testing "test case 5345"
    (is (= (stemming "erecting") "erect"))))

(deftest test-5346
  (testing "test case 5346"
    (is (= (stemming "migration") "migrat"))))

(deftest test-5347
  (testing "test case 5347"
    (is (= (stemming "brace") "brace"))))

(deftest test-5348
  (testing "test case 5348"
    (is (= (stemming "cinematographic") "cinematograph"))))

(deftest test-5349
  (testing "test case 5349"
    (is (= (stemming "hooding") "hood"))))

(deftest test-5350
  (testing "test case 5350"
    (is (= (stemming "messier") "messier"))))

(deftest test-5351
  (testing "test case 5351"
    (is (= (stemming "forks") "fork"))))

(deftest test-5352
  (testing "test case 5352"
    (is (= (stemming "psalteries") "psalteri"))))

(deftest test-5353
  (testing "test case 5353"
    (is (= (stemming "acetified") "acetifi"))))

(deftest test-5354
  (testing "test case 5354"
    (is (= (stemming "enravish") "enravish"))))

(deftest test-5355
  (testing "test case 5355"
    (is (= (stemming "wavery") "waveri"))))

(deftest test-5356
  (testing "test case 5356"
    (is (= (stemming "psychosyntheses") "psychosynthes"))))

(deftest test-5357
  (testing "test case 5357"
    (is (= (stemming "submit") "submit"))))

(deftest test-5358
  (testing "test case 5358"
    (is (= (stemming "ducal") "ducal"))))

(deftest test-5359
  (testing "test case 5359"
    (is (= (stemming "collimating") "collim"))))

(deftest test-5360
  (testing "test case 5360"
    (is (= (stemming "armrest") "armrest"))))

(deftest test-5361
  (testing "test case 5361"
    (is (= (stemming "tikes") "tike"))))

(deftest test-5362
  (testing "test case 5362"
    (is (= (stemming "friendliness") "friendli"))))

(deftest test-5363
  (testing "test case 5363"
    (is (= (stemming "curves") "curv"))))

(deftest test-5364
  (testing "test case 5364"
    (is (= (stemming "dekares") "dekar"))))

(deftest test-5365
  (testing "test case 5365"
    (is (= (stemming "dowery") "doweri"))))

(deftest test-5366
  (testing "test case 5366"
    (is (= (stemming "disencumber") "disencumb"))))

(deftest test-5367
  (testing "test case 5367"
    (is (= (stemming "tailspin") "tailspin"))))

(deftest test-5368
  (testing "test case 5368"
    (is (= (stemming "caciques") "caciqu"))))

(deftest test-5369
  (testing "test case 5369"
    (is (= (stemming "parboiled") "parboil"))))

(deftest test-5370
  (testing "test case 5370"
    (is (= (stemming "dave") "dave"))))

(deftest test-5371
  (testing "test case 5371"
    (is (= (stemming "stagecoach") "stagecoach"))))

(deftest test-5372
  (testing "test case 5372"
    (is (= (stemming "mahoganies") "mahogani"))))

(deftest test-5373
  (testing "test case 5373"
    (is (= (stemming "fat") "fat"))))

(deftest test-5374
  (testing "test case 5374"
    (is (= (stemming "refitting") "refit"))))

(deftest test-5375
  (testing "test case 5375"
    (is (= (stemming "focussed") "focuss"))))

(deftest test-5376
  (testing "test case 5376"
    (is (= (stemming "replications") "replic"))))

(deftest test-5377
  (testing "test case 5377"
    (is (= (stemming "relapser") "relaps"))))

(deftest test-5378
  (testing "test case 5378"
    (is (= (stemming "contorted") "contort"))))

(deftest test-5379
  (testing "test case 5379"
    (is (= (stemming "seashores") "seashor"))))

(deftest test-5380
  (testing "test case 5380"
    (is (= (stemming "sallow") "sallow"))))

(deftest test-5381
  (testing "test case 5381"
    (is (= (stemming "brotherhood") "brotherhood"))))

(deftest test-5382
  (testing "test case 5382"
    (is (= (stemming "loathers") "loather"))))

(deftest test-5383
  (testing "test case 5383"
    (is (= (stemming "photo") "photo"))))

(deftest test-5384
  (testing "test case 5384"
    (is (= (stemming "standardization") "standard"))))

(deftest test-5385
  (testing "test case 5385"
    (is (= (stemming "palsying") "palsi"))))

(deftest test-5386
  (testing "test case 5386"
    (is (= (stemming "precisian") "precisian"))))

(deftest test-5387
  (testing "test case 5387"
    (is (= (stemming "generics") "gener"))))

(deftest test-5388
  (testing "test case 5388"
    (is (= (stemming "lamedhs") "lamedh"))))

(deftest test-5389
  (testing "test case 5389"
    (is (= (stemming "procurals") "procur"))))

(deftest test-5390
  (testing "test case 5390"
    (is (= (stemming "primer") "primer"))))

(deftest test-5391
  (testing "test case 5391"
    (is (= (stemming "professionalists") "professionalist"))))

(deftest test-5392
  (testing "test case 5392"
    (is (= (stemming "spriest") "spriest"))))

(deftest test-5393
  (testing "test case 5393"
    (is (= (stemming "bunging") "bung"))))

(deftest test-5394
  (testing "test case 5394"
    (is (= (stemming "acerose") "aceros"))))

(deftest test-5395
  (testing "test case 5395"
    (is (= (stemming "cheapest") "cheapest"))))

(deftest test-5396
  (testing "test case 5396"
    (is (= (stemming "coverlets") "coverlet"))))

(deftest test-5397
  (testing "test case 5397"
    (is (= (stemming "clitoral") "clitor"))))

(deftest test-5398
  (testing "test case 5398"
    (is (= (stemming "equivoke") "equivok"))))

(deftest test-5399
  (testing "test case 5399"
    (is (= (stemming "coldly") "coldli"))))

(deftest test-5400
  (testing "test case 5400"
    (is (= (stemming "thronging") "throng"))))

(deftest test-5401
  (testing "test case 5401"
    (is (= (stemming "messenger") "messeng"))))

(deftest test-5402
  (testing "test case 5402"
    (is (= (stemming "handsome") "handsom"))))

(deftest test-5403
  (testing "test case 5403"
    (is (= (stemming "untouched") "untouch"))))

(deftest test-5404
  (testing "test case 5404"
    (is (= (stemming "understudies") "understudi"))))

(deftest test-5405
  (testing "test case 5405"
    (is (= (stemming "smuggling") "smuggl"))))

(deftest test-5406
  (testing "test case 5406"
    (is (= (stemming "dismiss") "dismiss"))))

(deftest test-5407
  (testing "test case 5407"
    (is (= (stemming "flatfooted") "flatfoot"))))

(deftest test-5408
  (testing "test case 5408"
    (is (= (stemming "sectioned") "section"))))

(deftest test-5409
  (testing "test case 5409"
    (is (= (stemming "rediscover") "rediscov"))))

(deftest test-5410
  (testing "test case 5410"
    (is (= (stemming "gamma") "gamma"))))

(deftest test-5411
  (testing "test case 5411"
    (is (= (stemming "radicalized") "radic"))))

(deftest test-5412
  (testing "test case 5412"
    (is (= (stemming "nuisances") "nuisanc"))))

(deftest test-5413
  (testing "test case 5413"
    (is (= (stemming "synfuels") "synfuel"))))

(deftest test-5414
  (testing "test case 5414"
    (is (= (stemming "bolsterer") "bolster"))))

(deftest test-5415
  (testing "test case 5415"
    (is (= (stemming "toastmistress") "toastmistress"))))

(deftest test-5416
  (testing "test case 5416"
    (is (= (stemming "farrowing") "farrow"))))

(deftest test-5417
  (testing "test case 5417"
    (is (= (stemming "hairweavers") "hairweav"))))

(deftest test-5418
  (testing "test case 5418"
    (is (= (stemming "anglophiles") "anglophil"))))

(deftest test-5419
  (testing "test case 5419"
    (is (= (stemming "semanticists") "semanticist"))))

(deftest test-5420
  (testing "test case 5420"
    (is (= (stemming "misbiassed") "misbiass"))))

(deftest test-5421
  (testing "test case 5421"
    (is (= (stemming "resettles") "resettl"))))

(deftest test-5422
  (testing "test case 5422"
    (is (= (stemming "motorcades") "motorcad"))))

(deftest test-5423
  (testing "test case 5423"
    (is (= (stemming "seraglio") "seraglio"))))

(deftest test-5424
  (testing "test case 5424"
    (is (= (stemming "primariness") "primari"))))

(deftest test-5425
  (testing "test case 5425"
    (is (= (stemming "somnambulists") "somnambulist"))))

(deftest test-5426
  (testing "test case 5426"
    (is (= (stemming "altho") "altho"))))

(deftest test-5427
  (testing "test case 5427"
    (is (= (stemming "goby") "gobi"))))

(deftest test-5428
  (testing "test case 5428"
    (is (= (stemming "quarters") "quarter"))))

(deftest test-5429
  (testing "test case 5429"
    (is (= (stemming "demagogy") "demagogi"))))

(deftest test-5430
  (testing "test case 5430"
    (is (= (stemming "outhouse") "outhous"))))

(deftest test-5431
  (testing "test case 5431"
    (is (= (stemming "whereunto") "whereunto"))))

(deftest test-5432
  (testing "test case 5432"
    (is (= (stemming "perturbed") "perturb"))))

(deftest test-5433
  (testing "test case 5433"
    (is (= (stemming "alley") "allei"))))

(deftest test-5434
  (testing "test case 5434"
    (is (= (stemming "erstwhile") "erstwhil"))))

(deftest test-5435
  (testing "test case 5435"
    (is (= (stemming "hypnoid") "hypnoid"))))

(deftest test-5436
  (testing "test case 5436"
    (is (= (stemming "cantos") "canto"))))

(deftest test-5437
  (testing "test case 5437"
    (is (= (stemming "relighted") "relight"))))

(deftest test-5438
  (testing "test case 5438"
    (is (= (stemming "marauds") "maraud"))))

(deftest test-5439
  (testing "test case 5439"
    (is (= (stemming "feathering") "feather"))))

(deftest test-5440
  (testing "test case 5440"
    (is (= (stemming "hominem") "hominem"))))

(deftest test-5441
  (testing "test case 5441"
    (is (= (stemming "pertinencies") "pertin"))))

(deftest test-5442
  (testing "test case 5442"
    (is (= (stemming "evader") "evad"))))

(deftest test-5443
  (testing "test case 5443"
    (is (= (stemming "chillums") "chillum"))))

(deftest test-5444
  (testing "test case 5444"
    (is (= (stemming "gravestones") "graveston"))))

(deftest test-5445
  (testing "test case 5445"
    (is (= (stemming "metaling") "metal"))))

(deftest test-5446
  (testing "test case 5446"
    (is (= (stemming "scaffolding") "scaffold"))))

(deftest test-5447
  (testing "test case 5447"
    (is (= (stemming "lichees") "liche"))))

(deftest test-5448
  (testing "test case 5448"
    (is (= (stemming "forklifts") "forklift"))))

(deftest test-5449
  (testing "test case 5449"
    (is (= (stemming "insufficient") "insuffici"))))

(deftest test-5450
  (testing "test case 5450"
    (is (= (stemming "unaccountable") "unaccount"))))

(deftest test-5451
  (testing "test case 5451"
    (is (= (stemming "accessions") "access"))))

(deftest test-5452
  (testing "test case 5452"
    (is (= (stemming "harpooner") "harpoon"))))

(deftest test-5453
  (testing "test case 5453"
    (is (= (stemming "inclusion") "inclus"))))

(deftest test-5454
  (testing "test case 5454"
    (is (= (stemming "plasticize") "plastic"))))

(deftest test-5455
  (testing "test case 5455"
    (is (= (stemming "bide") "bide"))))

(deftest test-5456
  (testing "test case 5456"
    (is (= (stemming "hardener") "harden"))))

(deftest test-5457
  (testing "test case 5457"
    (is (= (stemming "prosecuted") "prosecut"))))

(deftest test-5458
  (testing "test case 5458"
    (is (= (stemming "remends") "remend"))))

(deftest test-5459
  (testing "test case 5459"
    (is (= (stemming "notification") "notif"))))

(deftest test-5460
  (testing "test case 5460"
    (is (= (stemming "sculptures") "sculptur"))))

(deftest test-5461
  (testing "test case 5461"
    (is (= (stemming "shirting") "shirt"))))

(deftest test-5462
  (testing "test case 5462"
    (is (= (stemming "door") "door"))))

(deftest test-5463
  (testing "test case 5463"
    (is (= (stemming "submerges") "submerg"))))

(deftest test-5464
  (testing "test case 5464"
    (is (= (stemming "drumlins") "drumlin"))))

(deftest test-5465
  (testing "test case 5465"
    (is (= (stemming "toadflaxes") "toadflax"))))

(deftest test-5466
  (testing "test case 5466"
    (is (= (stemming "demimondain") "demimondain"))))

(deftest test-5467
  (testing "test case 5467"
    (is (= (stemming "geodesists") "geodesist"))))

(deftest test-5468
  (testing "test case 5468"
    (is (= (stemming "adaptors") "adaptor"))))

(deftest test-5469
  (testing "test case 5469"
    (is (= (stemming "orthopedics") "orthoped"))))

(deftest test-5470
  (testing "test case 5470"
    (is (= (stemming "rouletted") "roulet"))))

(deftest test-5471
  (testing "test case 5471"
    (is (= (stemming "atheistical") "atheist"))))

(deftest test-5472
  (testing "test case 5472"
    (is (= (stemming "abhors") "abhor"))))

(deftest test-5473
  (testing "test case 5473"
    (is (= (stemming "decider") "decid"))))

(deftest test-5474
  (testing "test case 5474"
    (is (= (stemming "boffins") "boffin"))))

(deftest test-5475
  (testing "test case 5475"
    (is (= (stemming "redissolves") "redissolv"))))

(deftest test-5476
  (testing "test case 5476"
    (is (= (stemming "bandboxes") "bandbox"))))

(deftest test-5477
  (testing "test case 5477"
    (is (= (stemming "cumquats") "cumquat"))))

(deftest test-5478
  (testing "test case 5478"
    (is (= (stemming "bazars") "bazar"))))

(deftest test-5479
  (testing "test case 5479"
    (is (= (stemming "tusche") "tusch"))))

(deftest test-5480
  (testing "test case 5480"
    (is (= (stemming "meowed") "meow"))))

(deftest test-5481
  (testing "test case 5481"
    (is (= (stemming "restaurants") "restaur"))))

(deftest test-5482
  (testing "test case 5482"
    (is (= (stemming "feticides") "feticid"))))

(deftest test-5483
  (testing "test case 5483"
    (is (= (stemming "ledge") "ledg"))))

(deftest test-5484
  (testing "test case 5484"
    (is (= (stemming "cosmopolitanism") "cosmopolitan"))))

(deftest test-5485
  (testing "test case 5485"
    (is (= (stemming "rarify") "rarifi"))))

(deftest test-5486
  (testing "test case 5486"
    (is (= (stemming "mux") "mux"))))

(deftest test-5487
  (testing "test case 5487"
    (is (= (stemming "lobefin") "lobefin"))))

(deftest test-5488
  (testing "test case 5488"
    (is (= (stemming "bureaux") "bureaux"))))

(deftest test-5489
  (testing "test case 5489"
    (is (= (stemming "mantlepieces") "mantlepiec"))))

(deftest test-5490
  (testing "test case 5490"
    (is (= (stemming "barristerial") "barristeri"))))

(deftest test-5491
  (testing "test case 5491"
    (is (= (stemming "conglomerating") "conglomer"))))

(deftest test-5492
  (testing "test case 5492"
    (is (= (stemming "crucifixes") "crucifix"))))

(deftest test-5493
  (testing "test case 5493"
    (is (= (stemming "eroses") "eros"))))

(deftest test-5494
  (testing "test case 5494"
    (is (= (stemming "rotundas") "rotunda"))))

(deftest test-5495
  (testing "test case 5495"
    (is (= (stemming "wetback") "wetback"))))

(deftest test-5496
  (testing "test case 5496"
    (is (= (stemming "awaked") "awak"))))

(deftest test-5497
  (testing "test case 5497"
    (is (= (stemming "distensibility") "distens"))))

(deftest test-5498
  (testing "test case 5498"
    (is (= (stemming "foreshortens") "foreshorten"))))

(deftest test-5499
  (testing "test case 5499"
    (is (= (stemming "communicably") "communic"))))

(deftest test-5500
  (testing "test case 5500"
    (is (= (stemming "eponymic") "eponym"))))

(deftest test-5501
  (testing "test case 5501"
    (is (= (stemming "midbrain") "midbrain"))))

(deftest test-5502
  (testing "test case 5502"
    (is (= (stemming "garnets") "garnet"))))

(deftest test-5503
  (testing "test case 5503"
    (is (= (stemming "betatrons") "betatron"))))

(deftest test-5504
  (testing "test case 5504"
    (is (= (stemming "placidity") "placid"))))

(deftest test-5505
  (testing "test case 5505"
    (is (= (stemming "overspecializing") "overspeci"))))

(deftest test-5506
  (testing "test case 5506"
    (is (= (stemming "derelict") "derelict"))))

(deftest test-5507
  (testing "test case 5507"
    (is (= (stemming "bowyer") "bowyer"))))

(deftest test-5508
  (testing "test case 5508"
    (is (= (stemming "dozen") "dozen"))))

(deftest test-5509
  (testing "test case 5509"
    (is (= (stemming "eucharists") "eucharist"))))

(deftest test-5510
  (testing "test case 5510"
    (is (= (stemming "hellions") "hellion"))))

(deftest test-5511
  (testing "test case 5511"
    (is (= (stemming "pilsener") "pilsen"))))

(deftest test-5512
  (testing "test case 5512"
    (is (= (stemming "utterly") "utterli"))))

(deftest test-5513
  (testing "test case 5513"
    (is (= (stemming "flakiest") "flakiest"))))

(deftest test-5514
  (testing "test case 5514"
    (is (= (stemming "quorum") "quorum"))))

(deftest test-5515
  (testing "test case 5515"
    (is (= (stemming "classifying") "classifi"))))

(deftest test-5516
  (testing "test case 5516"
    (is (= (stemming "holdfast") "holdfast"))))

(deftest test-5517
  (testing "test case 5517"
    (is (= (stemming "outfoxing") "outfox"))))

(deftest test-5518
  (testing "test case 5518"
    (is (= (stemming "disquieting") "disquiet"))))

(deftest test-5519
  (testing "test case 5519"
    (is (= (stemming "curlicue") "curlicu"))))

(deftest test-5520
  (testing "test case 5520"
    (is (= (stemming "califs") "calif"))))

(deftest test-5521
  (testing "test case 5521"
    (is (= (stemming "musers") "muser"))))

(deftest test-5522
  (testing "test case 5522"
    (is (= (stemming "annoy") "annoi"))))

(deftest test-5523
  (testing "test case 5523"
    (is (= (stemming "causeries") "causeri"))))

(deftest test-5524
  (testing "test case 5524"
    (is (= (stemming "royalist") "royalist"))))

(deftest test-5525
  (testing "test case 5525"
    (is (= (stemming "primness") "prim"))))

(deftest test-5526
  (testing "test case 5526"
    (is (= (stemming "pentarch") "pentarch"))))

(deftest test-5527
  (testing "test case 5527"
    (is (= (stemming "manured") "manur"))))

(deftest test-5528
  (testing "test case 5528"
    (is (= (stemming "damnation") "damnat"))))

(deftest test-5529
  (testing "test case 5529"
    (is (= (stemming "sacerdotally") "sacerdot"))))

(deftest test-5530
  (testing "test case 5530"
    (is (= (stemming "derbies") "derbi"))))

(deftest test-5531
  (testing "test case 5531"
    (is (= (stemming "reedits") "reedit"))))

(deftest test-5532
  (testing "test case 5532"
    (is (= (stemming "feinted") "feint"))))

(deftest test-5533
  (testing "test case 5533"
    (is (= (stemming "darwinian") "darwinian"))))

(deftest test-5534
  (testing "test case 5534"
    (is (= (stemming "dermic") "dermic"))))

(deftest test-5535
  (testing "test case 5535"
    (is (= (stemming "powdery") "powderi"))))

(deftest test-5536
  (testing "test case 5536"
    (is (= (stemming "mode") "mode"))))

(deftest test-5537
  (testing "test case 5537"
    (is (= (stemming "flimflam") "flimflam"))))

(deftest test-5538
  (testing "test case 5538"
    (is (= (stemming "refed") "refe"))))

(deftest test-5539
  (testing "test case 5539"
    (is (= (stemming "seined") "sein"))))

(deftest test-5540
  (testing "test case 5540"
    (is (= (stemming "solid") "solid"))))

(deftest test-5541
  (testing "test case 5541"
    (is (= (stemming "balancing") "balanc"))))

(deftest test-5542
  (testing "test case 5542"
    (is (= (stemming "workshop") "workshop"))))

(deftest test-5543
  (testing "test case 5543"
    (is (= (stemming "spotters") "spotter"))))

(deftest test-5544
  (testing "test case 5544"
    (is (= (stemming "subversions") "subvers"))))

(deftest test-5545
  (testing "test case 5545"
    (is (= (stemming "roentgenograms") "roentgenogram"))))

(deftest test-5546
  (testing "test case 5546"
    (is (= (stemming "tieing") "tie"))))

(deftest test-5547
  (testing "test case 5547"
    (is (= (stemming "attesting") "attest"))))

(deftest test-5548
  (testing "test case 5548"
    (is (= (stemming "barrenly") "barrenli"))))

(deftest test-5549
  (testing "test case 5549"
    (is (= (stemming "funnelling") "funnel"))))

(deftest test-5550
  (testing "test case 5550"
    (is (= (stemming "capricious") "caprici"))))

(deftest test-5551
  (testing "test case 5551"
    (is (= (stemming "sobering") "sober"))))

(deftest test-5552
  (testing "test case 5552"
    (is (= (stemming "trayful") "tray"))))

(deftest test-5553
  (testing "test case 5553"
    (is (= (stemming "prickiest") "prickiest"))))

(deftest test-5554
  (testing "test case 5554"
    (is (= (stemming "novelistic") "novelist"))))

(deftest test-5555
  (testing "test case 5555"
    (is (= (stemming "wholesomeness") "wholesom"))))

(deftest test-5556
  (testing "test case 5556"
    (is (= (stemming "marbler") "marbler"))))

(deftest test-5557
  (testing "test case 5557"
    (is (= (stemming "rases") "rase"))))

(deftest test-5558
  (testing "test case 5558"
    (is (= (stemming "imitativeness") "imit"))))

(deftest test-5559
  (testing "test case 5559"
    (is (= (stemming "glistering") "glister"))))

(deftest test-5560
  (testing "test case 5560"
    (is (= (stemming "preassemble") "preassembl"))))

(deftest test-5561
  (testing "test case 5561"
    (is (= (stemming "serfage") "serfag"))))

(deftest test-5562
  (testing "test case 5562"
    (is (= (stemming "interrupt") "interrupt"))))

(deftest test-5563
  (testing "test case 5563"
    (is (= (stemming "munitions") "munit"))))

(deftest test-5564
  (testing "test case 5564"
    (is (= (stemming "depressively") "depress"))))

(deftest test-5565
  (testing "test case 5565"
    (is (= (stemming "executions") "execut"))))

(deftest test-5566
  (testing "test case 5566"
    (is (= (stemming "scruples") "scrupl"))))

(deftest test-5567
  (testing "test case 5567"
    (is (= (stemming "boskages") "boskag"))))

(deftest test-5568
  (testing "test case 5568"
    (is (= (stemming "pollarding") "pollard"))))

(deftest test-5569
  (testing "test case 5569"
    (is (= (stemming "roes") "roe"))))

(deftest test-5570
  (testing "test case 5570"
    (is (= (stemming "colossuses") "colossus"))))

(deftest test-5571
  (testing "test case 5571"
    (is (= (stemming "lustered") "luster"))))

(deftest test-5572
  (testing "test case 5572"
    (is (= (stemming "bluey") "bluei"))))

(deftest test-5573
  (testing "test case 5573"
    (is (= (stemming "hoodoo") "hoodoo"))))

(deftest test-5574
  (testing "test case 5574"
    (is (= (stemming "piecings") "piec"))))

(deftest test-5575
  (testing "test case 5575"
    (is (= (stemming "ween") "ween"))))

(deftest test-5576
  (testing "test case 5576"
    (is (= (stemming "acculturate") "accultur"))))

(deftest test-5577
  (testing "test case 5577"
    (is (= (stemming "tiny") "tini"))))

(deftest test-5578
  (testing "test case 5578"
    (is (= (stemming "swear") "swear"))))

(deftest test-5579
  (testing "test case 5579"
    (is (= (stemming "cassino") "cassino"))))

(deftest test-5580
  (testing "test case 5580"
    (is (= (stemming "shutoffs") "shutoff"))))

(deftest test-5581
  (testing "test case 5581"
    (is (= (stemming "cheyennes") "cheyenn"))))

(deftest test-5582
  (testing "test case 5582"
    (is (= (stemming "washcloths") "washcloth"))))

(deftest test-5583
  (testing "test case 5583"
    (is (= (stemming "deduces") "deduc"))))

(deftest test-5584
  (testing "test case 5584"
    (is (= (stemming "enervation") "enerv"))))

(deftest test-5585
  (testing "test case 5585"
    (is (= (stemming "critic") "critic"))))

(deftest test-5586
  (testing "test case 5586"
    (is (= (stemming "lanai") "lanai"))))

(deftest test-5587
  (testing "test case 5587"
    (is (= (stemming "sneeringly") "sneeringli"))))

(deftest test-5588
  (testing "test case 5588"
    (is (= (stemming "manufactories") "manufactori"))))

(deftest test-5589
  (testing "test case 5589"
    (is (= (stemming "jotters") "jotter"))))

(deftest test-5590
  (testing "test case 5590"
    (is (= (stemming "fleets") "fleet"))))

(deftest test-5591
  (testing "test case 5591"
    (is (= (stemming "other") "other"))))

(deftest test-5592
  (testing "test case 5592"
    (is (= (stemming "wigmakers") "wigmak"))))

(deftest test-5593
  (testing "test case 5593"
    (is (= (stemming "proclamations") "proclam"))))

(deftest test-5594
  (testing "test case 5594"
    (is (= (stemming "unbeliefs") "unbelief"))))

(deftest test-5595
  (testing "test case 5595"
    (is (= (stemming "impressments") "impress"))))

(deftest test-5596
  (testing "test case 5596"
    (is (= (stemming "alarmism") "alarm"))))

(deftest test-5597
  (testing "test case 5597"
    (is (= (stemming "puffier") "puffier"))))

(deftest test-5598
  (testing "test case 5598"
    (is (= (stemming "menfolk") "menfolk"))))

(deftest test-5599
  (testing "test case 5599"
    (is (= (stemming "arioso") "arioso"))))

(deftest test-5600
  (testing "test case 5600"
    (is (= (stemming "intervened") "interven"))))

(deftest test-5601
  (testing "test case 5601"
    (is (= (stemming "hektares") "hektar"))))

(deftest test-5602
  (testing "test case 5602"
    (is (= (stemming "wickyup") "wickyup"))))

(deftest test-5603
  (testing "test case 5603"
    (is (= (stemming "sepulchers") "sepulch"))))

(deftest test-5604
  (testing "test case 5604"
    (is (= (stemming "pylorous") "pylor"))))

(deftest test-5605
  (testing "test case 5605"
    (is (= (stemming "spokane") "spokan"))))

(deftest test-5606
  (testing "test case 5606"
    (is (= (stemming "soldiery") "soldieri"))))

(deftest test-5607
  (testing "test case 5607"
    (is (= (stemming "cirrostratus") "cirrostratu"))))

(deftest test-5608
  (testing "test case 5608"
    (is (= (stemming "straitens") "straiten"))))

(deftest test-5609
  (testing "test case 5609"
    (is (= (stemming "isomerizing") "isomer"))))

(deftest test-5610
  (testing "test case 5610"
    (is (= (stemming "jaloppy") "jaloppi"))))

(deftest test-5611
  (testing "test case 5611"
    (is (= (stemming "mea") "mea"))))

(deftest test-5612
  (testing "test case 5612"
    (is (= (stemming "overcook") "overcook"))))

(deftest test-5613
  (testing "test case 5613"
    (is (= (stemming "electroshocks") "electroshock"))))

(deftest test-5614
  (testing "test case 5614"
    (is (= (stemming "seaward") "seaward"))))

(deftest test-5615
  (testing "test case 5615"
    (is (= (stemming "moonshot") "moonshot"))))

(deftest test-5616
  (testing "test case 5616"
    (is (= (stemming "uncontaminated") "uncontamin"))))

(deftest test-5617
  (testing "test case 5617"
    (is (= (stemming "prejudge") "prejudg"))))

(deftest test-5618
  (testing "test case 5618"
    (is (= (stemming "contentions") "content"))))

(deftest test-5619
  (testing "test case 5619"
    (is (= (stemming "liberalized") "liber"))))

(deftest test-5620
  (testing "test case 5620"
    (is (= (stemming "daisied") "daisi"))))

(deftest test-5621
  (testing "test case 5621"
    (is (= (stemming "recaller") "recal"))))

(deftest test-5622
  (testing "test case 5622"
    (is (= (stemming "threesomes") "threesom"))))

(deftest test-5623
  (testing "test case 5623"
    (is (= (stemming "secondarily") "secondarili"))))

(deftest test-5624
  (testing "test case 5624"
    (is (= (stemming "similar") "similar"))))

(deftest test-5625
  (testing "test case 5625"
    (is (= (stemming "revoking") "revok"))))

(deftest test-5626
  (testing "test case 5626"
    (is (= (stemming "haberdasher") "haberdash"))))

(deftest test-5627
  (testing "test case 5627"
    (is (= (stemming "cameras") "camera"))))

(deftest test-5628
  (testing "test case 5628"
    (is (= (stemming "scoffs") "scoff"))))

(deftest test-5629
  (testing "test case 5629"
    (is (= (stemming "chive") "chive"))))

(deftest test-5630
  (testing "test case 5630"
    (is (= (stemming "urethanes") "urethan"))))

(deftest test-5631
  (testing "test case 5631"
    (is (= (stemming "squirreled") "squirrel"))))

(deftest test-5632
  (testing "test case 5632"
    (is (= (stemming "negatives") "neg"))))

(deftest test-5633
  (testing "test case 5633"
    (is (= (stemming "tic") "tic"))))

(deftest test-5634
  (testing "test case 5634"
    (is (= (stemming "fathers") "father"))))

(deftest test-5635
  (testing "test case 5635"
    (is (= (stemming "minimizes") "minim"))))

(deftest test-5636
  (testing "test case 5636"
    (is (= (stemming "sludgy") "sludgi"))))

(deftest test-5637
  (testing "test case 5637"
    (is (= (stemming "dakotas") "dakota"))))

(deftest test-5638
  (testing "test case 5638"
    (is (= (stemming "cottonmouth") "cottonmouth"))))

(deftest test-5639
  (testing "test case 5639"
    (is (= (stemming "egressing") "egress"))))

(deftest test-5640
  (testing "test case 5640"
    (is (= (stemming "forsaker") "forsak"))))

(deftest test-5641
  (testing "test case 5641"
    (is (= (stemming "brassicas") "brassica"))))

(deftest test-5642
  (testing "test case 5642"
    (is (= (stemming "reemployment") "reemploy"))))

(deftest test-5643
  (testing "test case 5643"
    (is (= (stemming "queller") "queller"))))

(deftest test-5644
  (testing "test case 5644"
    (is (= (stemming "reapportions") "reapport"))))

(deftest test-5645
  (testing "test case 5645"
    (is (= (stemming "juice") "juic"))))

(deftest test-5646
  (testing "test case 5646"
    (is (= (stemming "carroming") "carrom"))))

(deftest test-5647
  (testing "test case 5647"
    (is (= (stemming "spader") "spader"))))

(deftest test-5648
  (testing "test case 5648"
    (is (= (stemming "rogued") "rogu"))))

(deftest test-5649
  (testing "test case 5649"
    (is (= (stemming "sudsy") "sudsi"))))

(deftest test-5650
  (testing "test case 5650"
    (is (= (stemming "recognition") "recognit"))))

(deftest test-5651
  (testing "test case 5651"
    (is (= (stemming "chiropractic") "chiropract"))))

(deftest test-5652
  (testing "test case 5652"
    (is (= (stemming "cadillac") "cadillac"))))

(deftest test-5653
  (testing "test case 5653"
    (is (= (stemming "punned") "pun"))))

(deftest test-5654
  (testing "test case 5654"
    (is (= (stemming "simplicity") "simplic"))))

(deftest test-5655
  (testing "test case 5655"
    (is (= (stemming "bothersome") "bothersom"))))

(deftest test-5656
  (testing "test case 5656"
    (is (= (stemming "liquidated") "liquid"))))

(deftest test-5657
  (testing "test case 5657"
    (is (= (stemming "princelings") "princel"))))

(deftest test-5658
  (testing "test case 5658"
    (is (= (stemming "constitution") "constitut"))))

(deftest test-5659
  (testing "test case 5659"
    (is (= (stemming "impostors") "impostor"))))

(deftest test-5660
  (testing "test case 5660"
    (is (= (stemming "dankest") "dankest"))))

(deftest test-5661
  (testing "test case 5661"
    (is (= (stemming "wadeable") "wadeabl"))))

(deftest test-5662
  (testing "test case 5662"
    (is (= (stemming "zeppelin") "zeppelin"))))

(deftest test-5663
  (testing "test case 5663"
    (is (= (stemming "ilia") "ilia"))))

(deftest test-5664
  (testing "test case 5664"
    (is (= (stemming "plumpers") "plumper"))))

(deftest test-5665
  (testing "test case 5665"
    (is (= (stemming "undergirds") "undergird"))))

(deftest test-5666
  (testing "test case 5666"
    (is (= (stemming "anecdotists") "anecdotist"))))

(deftest test-5667
  (testing "test case 5667"
    (is (= (stemming "hairiest") "hairiest"))))

(deftest test-5668
  (testing "test case 5668"
    (is (= (stemming "chaconne") "chaconn"))))

(deftest test-5669
  (testing "test case 5669"
    (is (= (stemming "crossbreeds") "crossbre"))))

(deftest test-5670
  (testing "test case 5670"
    (is (= (stemming "outflowing") "outflow"))))

(deftest test-5671
  (testing "test case 5671"
    (is (= (stemming "turbeths") "turbeth"))))

(deftest test-5672
  (testing "test case 5672"
    (is (= (stemming "adumbrative") "adumbr"))))

(deftest test-5673
  (testing "test case 5673"
    (is (= (stemming "sniffled") "sniffl"))))

(deftest test-5674
  (testing "test case 5674"
    (is (= (stemming "analysand") "analysand"))))

(deftest test-5675
  (testing "test case 5675"
    (is (= (stemming "recantations") "recant"))))

(deftest test-5676
  (testing "test case 5676"
    (is (= (stemming "apologizing") "apolog"))))

(deftest test-5677
  (testing "test case 5677"
    (is (= (stemming "blitzkrieging") "blitzkrieg"))))

(deftest test-5678
  (testing "test case 5678"
    (is (= (stemming "fanzines") "fanzin"))))

(deftest test-5679
  (testing "test case 5679"
    (is (= (stemming "gales") "gale"))))

(deftest test-5680
  (testing "test case 5680"
    (is (= (stemming "embargoing") "embargo"))))

(deftest test-5681
  (testing "test case 5681"
    (is (= (stemming "copybooks") "copybook"))))

(deftest test-5682
  (testing "test case 5682"
    (is (= (stemming "midlegs") "midleg"))))

(deftest test-5683
  (testing "test case 5683"
    (is (= (stemming "popery") "poperi"))))

(deftest test-5684
  (testing "test case 5684"
    (is (= (stemming "romper") "romper"))))

(deftest test-5685
  (testing "test case 5685"
    (is (= (stemming "dissenters") "dissent"))))

(deftest test-5686
  (testing "test case 5686"
    (is (= (stemming "daylit") "daylit"))))

(deftest test-5687
  (testing "test case 5687"
    (is (= (stemming "banding") "band"))))

(deftest test-5688
  (testing "test case 5688"
    (is (= (stemming "falconets") "falconet"))))

(deftest test-5689
  (testing "test case 5689"
    (is (= (stemming "degreased") "degreas"))))

(deftest test-5690
  (testing "test case 5690"
    (is (= (stemming "wronging") "wrong"))))

(deftest test-5691
  (testing "test case 5691"
    (is (= (stemming "tyrannizer") "tyrann"))))

(deftest test-5692
  (testing "test case 5692"
    (is (= (stemming "accoutring") "accoutr"))))

(deftest test-5693
  (testing "test case 5693"
    (is (= (stemming "gibbously") "gibbous"))))

(deftest test-5694
  (testing "test case 5694"
    (is (= (stemming "vagary") "vagari"))))

(deftest test-5695
  (testing "test case 5695"
    (is (= (stemming "escars") "escar"))))

(deftest test-5696
  (testing "test case 5696"
    (is (= (stemming "entrusts") "entrust"))))

(deftest test-5697
  (testing "test case 5697"
    (is (= (stemming "manias") "mania"))))

(deftest test-5698
  (testing "test case 5698"
    (is (= (stemming "believes") "believ"))))

(deftest test-5699
  (testing "test case 5699"
    (is (= (stemming "sewn") "sewn"))))

(deftest test-5700
  (testing "test case 5700"
    (is (= (stemming "inseminated") "insemin"))))

(deftest test-5701
  (testing "test case 5701"
    (is (= (stemming "cigarets") "cigaret"))))

(deftest test-5702
  (testing "test case 5702"
    (is (= (stemming "multiplying") "multipli"))))

(deftest test-5703
  (testing "test case 5703"
    (is (= (stemming "rya") "rya"))))

(deftest test-5704
  (testing "test case 5704"
    (is (= (stemming "engrained") "engrain"))))

(deftest test-5705
  (testing "test case 5705"
    (is (= (stemming "counselable") "counsel"))))

(deftest test-5706
  (testing "test case 5706"
    (is (= (stemming "statelessness") "stateless"))))

(deftest test-5707
  (testing "test case 5707"
    (is (= (stemming "stumbled") "stumbl"))))

(deftest test-5708
  (testing "test case 5708"
    (is (= (stemming "dunnage") "dunnag"))))

(deftest test-5709
  (testing "test case 5709"
    (is (= (stemming "pruners") "pruner"))))

(deftest test-5710
  (testing "test case 5710"
    (is (= (stemming "olympics") "olymp"))))

(deftest test-5711
  (testing "test case 5711"
    (is (= (stemming "ringworm") "ringworm"))))

(deftest test-5712
  (testing "test case 5712"
    (is (= (stemming "travois") "travoi"))))

(deftest test-5713
  (testing "test case 5713"
    (is (= (stemming "returnees") "returne"))))

(deftest test-5714
  (testing "test case 5714"
    (is (= (stemming "quizzicalness") "quizzic"))))

(deftest test-5715
  (testing "test case 5715"
    (is (= (stemming "shorties") "shorti"))))

(deftest test-5716
  (testing "test case 5716"
    (is (= (stemming "nepotistically") "nepotist"))))

(deftest test-5717
  (testing "test case 5717"
    (is (= (stemming "powers") "power"))))

(deftest test-5718
  (testing "test case 5718"
    (is (= (stemming "exonerator") "exoner"))))

(deftest test-5719
  (testing "test case 5719"
    (is (= (stemming "cageling") "cagel"))))

(deftest test-5720
  (testing "test case 5720"
    (is (= (stemming "dishevelling") "dishevel"))))

(deftest test-5721
  (testing "test case 5721"
    (is (= (stemming "redoubling") "redoubl"))))

(deftest test-5722
  (testing "test case 5722"
    (is (= (stemming "eardrums") "eardrum"))))

(deftest test-5723
  (testing "test case 5723"
    (is (= (stemming "tootsies") "tootsi"))))

(deftest test-5724
  (testing "test case 5724"
    (is (= (stemming "biorythmic") "biorythm"))))

(deftest test-5725
  (testing "test case 5725"
    (is (= (stemming "exurbs") "exurb"))))

(deftest test-5726
  (testing "test case 5726"
    (is (= (stemming "clerkship") "clerkship"))))

(deftest test-5727
  (testing "test case 5727"
    (is (= (stemming "stole") "stole"))))

(deftest test-5728
  (testing "test case 5728"
    (is (= (stemming "polydactyly") "polydactyli"))))

(deftest test-5729
  (testing "test case 5729"
    (is (= (stemming "bedraggles") "bedraggl"))))

(deftest test-5730
  (testing "test case 5730"
    (is (= (stemming "munches") "munch"))))

(deftest test-5731
  (testing "test case 5731"
    (is (= (stemming "zymoplastic") "zymoplast"))))

(deftest test-5732
  (testing "test case 5732"
    (is (= (stemming "sat") "sat"))))

(deftest test-5733
  (testing "test case 5733"
    (is (= (stemming "axioms") "axiom"))))

(deftest test-5734
  (testing "test case 5734"
    (is (= (stemming "bagged") "bag"))))

(deftest test-5735
  (testing "test case 5735"
    (is (= (stemming "senilely") "senil"))))

(deftest test-5736
  (testing "test case 5736"
    (is (= (stemming "spreadsheets") "spreadsheet"))))

(deftest test-5737
  (testing "test case 5737"
    (is (= (stemming "illegalization") "illeg"))))

(deftest test-5738
  (testing "test case 5738"
    (is (= (stemming "screamed") "scream"))))

(deftest test-5739
  (testing "test case 5739"
    (is (= (stemming "overly") "overli"))))

(deftest test-5740
  (testing "test case 5740"
    (is (= (stemming "woodnote") "woodnot"))))

(deftest test-5741
  (testing "test case 5741"
    (is (= (stemming "bluely") "blueli"))))

(deftest test-5742
  (testing "test case 5742"
    (is (= (stemming "immigrated") "immigr"))))

(deftest test-5743
  (testing "test case 5743"
    (is (= (stemming "cockers") "cocker"))))

(deftest test-5744
  (testing "test case 5744"
    (is (= (stemming "wisping") "wisp"))))

(deftest test-5745
  (testing "test case 5745"
    (is (= (stemming "hardbought") "hardbought"))))

(deftest test-5746
  (testing "test case 5746"
    (is (= (stemming "protectionism") "protection"))))

(deftest test-5747
  (testing "test case 5747"
    (is (= (stemming "teether") "teether"))))

(deftest test-5748
  (testing "test case 5748"
    (is (= (stemming "bogyman") "bogyman"))))

(deftest test-5749
  (testing "test case 5749"
    (is (= (stemming "iterations") "iter"))))

(deftest test-5750
  (testing "test case 5750"
    (is (= (stemming "pretension") "pretens"))))

(deftest test-5751
  (testing "test case 5751"
    (is (= (stemming "noisome") "noisom"))))

(deftest test-5752
  (testing "test case 5752"
    (is (= (stemming "eurasian") "eurasian"))))

(deftest test-5753
  (testing "test case 5753"
    (is (= (stemming "bigwig") "bigwig"))))

(deftest test-5754
  (testing "test case 5754"
    (is (= (stemming "melanophore") "melanophor"))))

(deftest test-5755
  (testing "test case 5755"
    (is (= (stemming "poniarded") "poniard"))))

(deftest test-5756
  (testing "test case 5756"
    (is (= (stemming "futurism") "futur"))))

(deftest test-5757
  (testing "test case 5757"
    (is (= (stemming "defier") "defier"))))

(deftest test-5758
  (testing "test case 5758"
    (is (= (stemming "trammel") "trammel"))))

(deftest test-5759
  (testing "test case 5759"
    (is (= (stemming "juggles") "juggl"))))

(deftest test-5760
  (testing "test case 5760"
    (is (= (stemming "reno") "reno"))))

(deftest test-5761
  (testing "test case 5761"
    (is (= (stemming "confronted") "confront"))))

(deftest test-5762
  (testing "test case 5762"
    (is (= (stemming "bailie") "baili"))))

(deftest test-5763
  (testing "test case 5763"
    (is (= (stemming "condores") "condor"))))

(deftest test-5764
  (testing "test case 5764"
    (is (= (stemming "jailers") "jailer"))))

(deftest test-5765
  (testing "test case 5765"
    (is (= (stemming "oxygenous") "oxygen"))))

(deftest test-5766
  (testing "test case 5766"
    (is (= (stemming "zebras") "zebra"))))

(deftest test-5767
  (testing "test case 5767"
    (is (= (stemming "cored") "core"))))

(deftest test-5768
  (testing "test case 5768"
    (is (= (stemming "ragwort") "ragwort"))))

(deftest test-5769
  (testing "test case 5769"
    (is (= (stemming "ascriptions") "ascript"))))

(deftest test-5770
  (testing "test case 5770"
    (is (= (stemming "cannabis") "cannabi"))))

(deftest test-5771
  (testing "test case 5771"
    (is (= (stemming "gruntles") "gruntl"))))

(deftest test-5772
  (testing "test case 5772"
    (is (= (stemming "mattock") "mattock"))))

(deftest test-5773
  (testing "test case 5773"
    (is (= (stemming "aviaries") "aviari"))))

(deftest test-5774
  (testing "test case 5774"
    (is (= (stemming "intuitively") "intuit"))))

(deftest test-5775
  (testing "test case 5775"
    (is (= (stemming "clanswoman") "clanswoman"))))

(deftest test-5776
  (testing "test case 5776"
    (is (= (stemming "shanking") "shank"))))

(deftest test-5777
  (testing "test case 5777"
    (is (= (stemming "equinities") "equin"))))

(deftest test-5778
  (testing "test case 5778"
    (is (= (stemming "clangorously") "clangor"))))

(deftest test-5779
  (testing "test case 5779"
    (is (= (stemming "topological") "topolog"))))

(deftest test-5780
  (testing "test case 5780"
    (is (= (stemming "unattempted") "unattempt"))))

(deftest test-5781
  (testing "test case 5781"
    (is (= (stemming "stepdown") "stepdown"))))

(deftest test-5782
  (testing "test case 5782"
    (is (= (stemming "create") "creat"))))

(deftest test-5783
  (testing "test case 5783"
    (is (= (stemming "chromized") "chromiz"))))

(deftest test-5784
  (testing "test case 5784"
    (is (= (stemming "outworkers") "outwork"))))

(deftest test-5785
  (testing "test case 5785"
    (is (= (stemming "jubilates") "jubil"))))

(deftest test-5786
  (testing "test case 5786"
    (is (= (stemming "seasonally") "season"))))

(deftest test-5787
  (testing "test case 5787"
    (is (= (stemming "sauternes") "sautern"))))

(deftest test-5788
  (testing "test case 5788"
    (is (= (stemming "tolerably") "toler"))))

(deftest test-5789
  (testing "test case 5789"
    (is (= (stemming "sunback") "sunback"))))

(deftest test-5790
  (testing "test case 5790"
    (is (= (stemming "peccadillos") "peccadillo"))))

(deftest test-5791
  (testing "test case 5791"
    (is (= (stemming "healthy") "healthi"))))

(deftest test-5792
  (testing "test case 5792"
    (is (= (stemming "damnably") "damnabl"))))

(deftest test-5793
  (testing "test case 5793"
    (is (= (stemming "underminer") "undermin"))))

(deftest test-5794
  (testing "test case 5794"
    (is (= (stemming "briquets") "briquet"))))

(deftest test-5795
  (testing "test case 5795"
    (is (= (stemming "decorousness") "decor"))))

(deftest test-5796
  (testing "test case 5796"
    (is (= (stemming "unnoticed") "unnot"))))

(deftest test-5797
  (testing "test case 5797"
    (is (= (stemming "smirkingly") "smirkingli"))))

(deftest test-5798
  (testing "test case 5798"
    (is (= (stemming "predestinate") "predestin"))))

(deftest test-5799
  (testing "test case 5799"
    (is (= (stemming "roadbeds") "roadb"))))

(deftest test-5800
  (testing "test case 5800"
    (is (= (stemming "nobeliums") "nobelium"))))

(deftest test-5801
  (testing "test case 5801"
    (is (= (stemming "semis") "semi"))))

(deftest test-5802
  (testing "test case 5802"
    (is (= (stemming "hookedness") "hooked"))))

(deftest test-5803
  (testing "test case 5803"
    (is (= (stemming "hider") "hider"))))

(deftest test-5804
  (testing "test case 5804"
    (is (= (stemming "cochairmen") "cochairmen"))))

(deftest test-5805
  (testing "test case 5805"
    (is (= (stemming "ossify") "ossifi"))))

(deftest test-5806
  (testing "test case 5806"
    (is (= (stemming "rhombi") "rhombi"))))

(deftest test-5807
  (testing "test case 5807"
    (is (= (stemming "pharyngectomies") "pharyngectomi"))))

(deftest test-5808
  (testing "test case 5808"
    (is (= (stemming "ramparts") "rampart"))))

(deftest test-5809
  (testing "test case 5809"
    (is (= (stemming "exposing") "expos"))))

(deftest test-5810
  (testing "test case 5810"
    (is (= (stemming "wingover") "wingov"))))

(deftest test-5811
  (testing "test case 5811"
    (is (= (stemming "knowings") "know"))))

(deftest test-5812
  (testing "test case 5812"
    (is (= (stemming "grumbles") "grumbl"))))

(deftest test-5813
  (testing "test case 5813"
    (is (= (stemming "goggly") "goggli"))))

(deftest test-5814
  (testing "test case 5814"
    (is (= (stemming "putrescent") "putresc"))))

(deftest test-5815
  (testing "test case 5815"
    (is (= (stemming "revery") "reveri"))))

(deftest test-5816
  (testing "test case 5816"
    (is (= (stemming "isomerize") "isomer"))))

(deftest test-5817
  (testing "test case 5817"
    (is (= (stemming "misinterprets") "misinterpret"))))

(deftest test-5818
  (testing "test case 5818"
    (is (= (stemming "juries") "juri"))))

(deftest test-5819
  (testing "test case 5819"
    (is (= (stemming "bounced") "bounc"))))

(deftest test-5820
  (testing "test case 5820"
    (is (= (stemming "limp") "limp"))))

(deftest test-5821
  (testing "test case 5821"
    (is (= (stemming "masterminding") "mastermind"))))

(deftest test-5822
  (testing "test case 5822"
    (is (= (stemming "burglar") "burglar"))))

(deftest test-5823
  (testing "test case 5823"
    (is (= (stemming "complexity") "complex"))))

(deftest test-5824
  (testing "test case 5824"
    (is (= (stemming "standard") "standard"))))

(deftest test-5825
  (testing "test case 5825"
    (is (= (stemming "desalinizes") "desalin"))))

(deftest test-5826
  (testing "test case 5826"
    (is (= (stemming "appreciably") "appreci"))))

(deftest test-5827
  (testing "test case 5827"
    (is (= (stemming "across") "across"))))

(deftest test-5828
  (testing "test case 5828"
    (is (= (stemming "hydrospheres") "hydrospher"))))

(deftest test-5829
  (testing "test case 5829"
    (is (= (stemming "stringiest") "stringiest"))))

(deftest test-5830
  (testing "test case 5830"
    (is (= (stemming "geographies") "geographi"))))

(deftest test-5831
  (testing "test case 5831"
    (is (= (stemming "dwarfisms") "dwarfism"))))

(deftest test-5832
  (testing "test case 5832"
    (is (= (stemming "sidesteppers") "sidestepp"))))

(deftest test-5833
  (testing "test case 5833"
    (is (= (stemming "spittoon") "spittoon"))))

(deftest test-5834
  (testing "test case 5834"
    (is (= (stemming "awaiters") "await"))))

(deftest test-5835
  (testing "test case 5835"
    (is (= (stemming "majolica") "majolica"))))

(deftest test-5836
  (testing "test case 5836"
    (is (= (stemming "germaniums") "germanium"))))

(deftest test-5837
  (testing "test case 5837"
    (is (= (stemming "evacuations") "evacu"))))

(deftest test-5838
  (testing "test case 5838"
    (is (= (stemming "rebel") "rebel"))))

(deftest test-5839
  (testing "test case 5839"
    (is (= (stemming "reverted") "revert"))))

(deftest test-5840
  (testing "test case 5840"
    (is (= (stemming "vigour") "vigour"))))

(deftest test-5841
  (testing "test case 5841"
    (is (= (stemming "barriers") "barrier"))))

(deftest test-5842
  (testing "test case 5842"
    (is (= (stemming "curriery") "currieri"))))

(deftest test-5843
  (testing "test case 5843"
    (is (= (stemming "kazoo") "kazoo"))))

(deftest test-5844
  (testing "test case 5844"
    (is (= (stemming "resistent") "resist"))))

(deftest test-5845
  (testing "test case 5845"
    (is (= (stemming "segue") "segu"))))

(deftest test-5846
  (testing "test case 5846"
    (is (= (stemming "risibility") "risibl"))))

(deftest test-5847
  (testing "test case 5847"
    (is (= (stemming "inhibits") "inhibit"))))

(deftest test-5848
  (testing "test case 5848"
    (is (= (stemming "novena") "novena"))))

(deftest test-5849
  (testing "test case 5849"
    (is (= (stemming "mutualist") "mutualist"))))

(deftest test-5850
  (testing "test case 5850"
    (is (= (stemming "hotbed") "hotb"))))

(deftest test-5851
  (testing "test case 5851"
    (is (= (stemming "fecund") "fecund"))))

(deftest test-5852
  (testing "test case 5852"
    (is (= (stemming "demythologized") "demytholog"))))

(deftest test-5853
  (testing "test case 5853"
    (is (= (stemming "myths") "myth"))))

(deftest test-5854
  (testing "test case 5854"
    (is (= (stemming "volplaned") "volplan"))))

(deftest test-5855
  (testing "test case 5855"
    (is (= (stemming "juvenilities") "juvenil"))))

(deftest test-5856
  (testing "test case 5856"
    (is (= (stemming "cowpea") "cowpea"))))

(deftest test-5857
  (testing "test case 5857"
    (is (= (stemming "woolliness") "woolli"))))

(deftest test-5858
  (testing "test case 5858"
    (is (= (stemming "wildling") "wildl"))))

(deftest test-5859
  (testing "test case 5859"
    (is (= (stemming "expellees") "expelle"))))

(deftest test-5860
  (testing "test case 5860"
    (is (= (stemming "wrongheadedness") "wrongheaded"))))

(deftest test-5861
  (testing "test case 5861"
    (is (= (stemming "shedded") "shed"))))

(deftest test-5862
  (testing "test case 5862"
    (is (= (stemming "wiglike") "wiglik"))))

(deftest test-5863
  (testing "test case 5863"
    (is (= (stemming "tumbler") "tumbler"))))

(deftest test-5864
  (testing "test case 5864"
    (is (= (stemming "coeditors") "coeditor"))))

(deftest test-5865
  (testing "test case 5865"
    (is (= (stemming "explored") "explor"))))

(deftest test-5866
  (testing "test case 5866"
    (is (= (stemming "rupiah") "rupiah"))))

(deftest test-5867
  (testing "test case 5867"
    (is (= (stemming "buckras") "buckra"))))

(deftest test-5868
  (testing "test case 5868"
    (is (= (stemming "mayan") "mayan"))))

(deftest test-5869
  (testing "test case 5869"
    (is (= (stemming "concocts") "concoct"))))

(deftest test-5870
  (testing "test case 5870"
    (is (= (stemming "brackish") "brackish"))))

(deftest test-5871
  (testing "test case 5871"
    (is (= (stemming "ordinary") "ordinari"))))

(deftest test-5872
  (testing "test case 5872"
    (is (= (stemming "consults") "consult"))))

(deftest test-5873
  (testing "test case 5873"
    (is (= (stemming "parleying") "parlei"))))

(deftest test-5874
  (testing "test case 5874"
    (is (= (stemming "shews") "shew"))))

(deftest test-5875
  (testing "test case 5875"
    (is (= (stemming "epidermoidal") "epidermoid"))))

(deftest test-5876
  (testing "test case 5876"
    (is (= (stemming "hearthside") "hearthsid"))))

(deftest test-5877
  (testing "test case 5877"
    (is (= (stemming "weighs") "weigh"))))

(deftest test-5878
  (testing "test case 5878"
    (is (= (stemming "moiling") "moil"))))

(deftest test-5879
  (testing "test case 5879"
    (is (= (stemming "squirish") "squirish"))))

(deftest test-5880
  (testing "test case 5880"
    (is (= (stemming "soberest") "soberest"))))

(deftest test-5881
  (testing "test case 5881"
    (is (= (stemming "sonatinas") "sonatina"))))

(deftest test-5882
  (testing "test case 5882"
    (is (= (stemming "redemptional") "redempt"))))

(deftest test-5883
  (testing "test case 5883"
    (is (= (stemming "godparents") "godpar"))))

(deftest test-5884
  (testing "test case 5884"
    (is (= (stemming "validating") "valid"))))

(deftest test-5885
  (testing "test case 5885"
    (is (= (stemming "toadyisms") "toadyism"))))

(deftest test-5886
  (testing "test case 5886"
    (is (= (stemming "repulsing") "repuls"))))

(deftest test-5887
  (testing "test case 5887"
    (is (= (stemming "incognito") "incognito"))))

(deftest test-5888
  (testing "test case 5888"
    (is (= (stemming "flimsiest") "flimsiest"))))

(deftest test-5889
  (testing "test case 5889"
    (is (= (stemming "pricky") "pricki"))))

(deftest test-5890
  (testing "test case 5890"
    (is (= (stemming "chicanos") "chicano"))))

(deftest test-5891
  (testing "test case 5891"
    (is (= (stemming "cavalcade") "cavalcad"))))

(deftest test-5892
  (testing "test case 5892"
    (is (= (stemming "wellborn") "wellborn"))))

(deftest test-5893
  (testing "test case 5893"
    (is (= (stemming "thyme") "thyme"))))

(deftest test-5894
  (testing "test case 5894"
    (is (= (stemming "fantasist") "fantasist"))))

(deftest test-5895
  (testing "test case 5895"
    (is (= (stemming "lintier") "lintier"))))

(deftest test-5896
  (testing "test case 5896"
    (is (= (stemming "hippy") "hippi"))))

(deftest test-5897
  (testing "test case 5897"
    (is (= (stemming "cherished") "cherish"))))

(deftest test-5898
  (testing "test case 5898"
    (is (= (stemming "seaquake") "seaquak"))))

(deftest test-5899
  (testing "test case 5899"
    (is (= (stemming "groggily") "groggili"))))

(deftest test-5900
  (testing "test case 5900"
    (is (= (stemming "trumpeters") "trumpet"))))

(deftest test-5901
  (testing "test case 5901"
    (is (= (stemming "circumambulate") "circumambul"))))

(deftest test-5902
  (testing "test case 5902"
    (is (= (stemming "selectly") "selectli"))))

(deftest test-5903
  (testing "test case 5903"
    (is (= (stemming "frugally") "frugal"))))

(deftest test-5904
  (testing "test case 5904"
    (is (= (stemming "arnold") "arnold"))))

(deftest test-5905
  (testing "test case 5905"
    (is (= (stemming "millennia") "millennia"))))

(deftest test-5906
  (testing "test case 5906"
    (is (= (stemming "covalently") "coval"))))

(deftest test-5907
  (testing "test case 5907"
    (is (= (stemming "surceased") "surceas"))))

(deftest test-5908
  (testing "test case 5908"
    (is (= (stemming "theatrically") "theatric"))))

(deftest test-5909
  (testing "test case 5909"
    (is (= (stemming "furtive") "furtiv"))))

(deftest test-5910
  (testing "test case 5910"
    (is (= (stemming "nomisms") "nomism"))))

(deftest test-5911
  (testing "test case 5911"
    (is (= (stemming "leady") "leadi"))))

(deftest test-5912
  (testing "test case 5912"
    (is (= (stemming "midstream") "midstream"))))

(deftest test-5913
  (testing "test case 5913"
    (is (= (stemming "derisively") "deris"))))

(deftest test-5914
  (testing "test case 5914"
    (is (= (stemming "blowups") "blowup"))))

(deftest test-5915
  (testing "test case 5915"
    (is (= (stemming "circumsolar") "circumsolar"))))

(deftest test-5916
  (testing "test case 5916"
    (is (= (stemming "overleapt") "overleapt"))))

(deftest test-5917
  (testing "test case 5917"
    (is (= (stemming "scholarliness") "scholarli"))))

(deftest test-5918
  (testing "test case 5918"
    (is (= (stemming "dusking") "dusk"))))

(deftest test-5919
  (testing "test case 5919"
    (is (= (stemming "workrooms") "workroom"))))

(deftest test-5920
  (testing "test case 5920"
    (is (= (stemming "cameoing") "cameo"))))

(deftest test-5921
  (testing "test case 5921"
    (is (= (stemming "jabs") "jab"))))

(deftest test-5922
  (testing "test case 5922"
    (is (= (stemming "nutritiousness") "nutriti"))))

(deftest test-5923
  (testing "test case 5923"
    (is (= (stemming "births") "birth"))))

(deftest test-5924
  (testing "test case 5924"
    (is (= (stemming "disclamation") "disclam"))))

(deftest test-5925
  (testing "test case 5925"
    (is (= (stemming "suspensions") "suspens"))))

(deftest test-5926
  (testing "test case 5926"
    (is (= (stemming "applicatively") "applic"))))

(deftest test-5927
  (testing "test case 5927"
    (is (= (stemming "verticillate") "verticil"))))

(deftest test-5928
  (testing "test case 5928"
    (is (= (stemming "retiree") "retire"))))

(deftest test-5929
  (testing "test case 5929"
    (is (= (stemming "adieus") "adieu"))))

(deftest test-5930
  (testing "test case 5930"
    (is (= (stemming "deads") "dead"))))

(deftest test-5931
  (testing "test case 5931"
    (is (= (stemming "plagiarized") "plagiar"))))

(deftest test-5932
  (testing "test case 5932"
    (is (= (stemming "morseling") "morsel"))))

(deftest test-5933
  (testing "test case 5933"
    (is (= (stemming "oculists") "oculist"))))

(deftest test-5934
  (testing "test case 5934"
    (is (= (stemming "safely") "safe"))))

(deftest test-5935
  (testing "test case 5935"
    (is (= (stemming "coypu") "coypu"))))

(deftest test-5936
  (testing "test case 5936"
    (is (= (stemming "westmost") "westmost"))))

(deftest test-5937
  (testing "test case 5937"
    (is (= (stemming "hydrogenated") "hydrogen"))))

(deftest test-5938
  (testing "test case 5938"
    (is (= (stemming "rondeau") "rondeau"))))

(deftest test-5939
  (testing "test case 5939"
    (is (= (stemming "archbishops") "archbishop"))))

(deftest test-5940
  (testing "test case 5940"
    (is (= (stemming "woozily") "woozili"))))

(deftest test-5941
  (testing "test case 5941"
    (is (= (stemming "climatotherapies") "climatotherapi"))))

(deftest test-5942
  (testing "test case 5942"
    (is (= (stemming "wifedom") "wifedom"))))

(deftest test-5943
  (testing "test case 5943"
    (is (= (stemming "whimsicality") "whimsic"))))

(deftest test-5944
  (testing "test case 5944"
    (is (= (stemming "sciences") "scienc"))))

(deftest test-5945
  (testing "test case 5945"
    (is (= (stemming "rechecked") "recheck"))))

(deftest test-5946
  (testing "test case 5946"
    (is (= (stemming "civilly") "civilli"))))

(deftest test-5947
  (testing "test case 5947"
    (is (= (stemming "hopped") "hop"))))

(deftest test-5948
  (testing "test case 5948"
    (is (= (stemming "weekday") "weekdai"))))

(deftest test-5949
  (testing "test case 5949"
    (is (= (stemming "cutoffs") "cutoff"))))

(deftest test-5950
  (testing "test case 5950"
    (is (= (stemming "trenchermen") "trenchermen"))))

(deftest test-5951
  (testing "test case 5951"
    (is (= (stemming "willers") "willer"))))

(deftest test-5952
  (testing "test case 5952"
    (is (= (stemming "photometer") "photomet"))))

(deftest test-5953
  (testing "test case 5953"
    (is (= (stemming "wides") "wide"))))

(deftest test-5954
  (testing "test case 5954"
    (is (= (stemming "viewpoints") "viewpoint"))))

(deftest test-5955
  (testing "test case 5955"
    (is (= (stemming "carpentry") "carpentri"))))

(deftest test-5956
  (testing "test case 5956"
    (is (= (stemming "restrainedly") "restrainedli"))))

(deftest test-5957
  (testing "test case 5957"
    (is (= (stemming "elaborates") "elabor"))))

(deftest test-5958
  (testing "test case 5958"
    (is (= (stemming "sand") "sand"))))

(deftest test-5959
  (testing "test case 5959"
    (is (= (stemming "gynecology") "gynecolog"))))

(deftest test-5960
  (testing "test case 5960"
    (is (= (stemming "activisms") "activ"))))

(deftest test-5961
  (testing "test case 5961"
    (is (= (stemming "ambiguousness") "ambigu"))))

(deftest test-5962
  (testing "test case 5962"
    (is (= (stemming "sparks") "spark"))))

(deftest test-5963
  (testing "test case 5963"
    (is (= (stemming "fumigators") "fumig"))))

(deftest test-5964
  (testing "test case 5964"
    (is (= (stemming "japanizes") "japan"))))

(deftest test-5965
  (testing "test case 5965"
    (is (= (stemming "deceivable") "deceiv"))))

(deftest test-5966
  (testing "test case 5966"
    (is (= (stemming "divisively") "divis"))))

(deftest test-5967
  (testing "test case 5967"
    (is (= (stemming "petrifies") "petrifi"))))

(deftest test-5968
  (testing "test case 5968"
    (is (= (stemming "functioning") "function"))))

(deftest test-5969
  (testing "test case 5969"
    (is (= (stemming "salsa") "salsa"))))

(deftest test-5970
  (testing "test case 5970"
    (is (= (stemming "recombined") "recombin"))))

(deftest test-5971
  (testing "test case 5971"
    (is (= (stemming "refracted") "refract"))))

(deftest test-5972
  (testing "test case 5972"
    (is (= (stemming "eruditely") "erudit"))))

(deftest test-5973
  (testing "test case 5973"
    (is (= (stemming "heterodoxy") "heterodoxi"))))

(deftest test-5974
  (testing "test case 5974"
    (is (= (stemming "reconstructible") "reconstruct"))))

(deftest test-5975
  (testing "test case 5975"
    (is (= (stemming "transfixes") "transfix"))))

(deftest test-5976
  (testing "test case 5976"
    (is (= (stemming "foursome") "foursom"))))

(deftest test-5977
  (testing "test case 5977"
    (is (= (stemming "sensibility") "sensibl"))))

(deftest test-5978
  (testing "test case 5978"
    (is (= (stemming "subcategories") "subcategori"))))

(deftest test-5979
  (testing "test case 5979"
    (is (= (stemming "scramble") "scrambl"))))

(deftest test-5980
  (testing "test case 5980"
    (is (= (stemming "publisher") "publish"))))

(deftest test-5981
  (testing "test case 5981"
    (is (= (stemming "nonreactive") "nonreact"))))

(deftest test-5982
  (testing "test case 5982"
    (is (= (stemming "neoclassic") "neoclass"))))

(deftest test-5983
  (testing "test case 5983"
    (is (= (stemming "carolina") "carolina"))))

(deftest test-5984
  (testing "test case 5984"
    (is (= (stemming "fates") "fate"))))

(deftest test-5985
  (testing "test case 5985"
    (is (= (stemming "dutiful") "duti"))))

(deftest test-5986
  (testing "test case 5986"
    (is (= (stemming "matinees") "matine"))))

(deftest test-5987
  (testing "test case 5987"
    (is (= (stemming "brightener") "brighten"))))

(deftest test-5988
  (testing "test case 5988"
    (is (= (stemming "flaws") "flaw"))))

(deftest test-5989
  (testing "test case 5989"
    (is (= (stemming "pimpling") "pimpl"))))

(deftest test-5990
  (testing "test case 5990"
    (is (= (stemming "sixte") "sixt"))))

(deftest test-5991
  (testing "test case 5991"
    (is (= (stemming "introduce") "introduc"))))

(deftest test-5992
  (testing "test case 5992"
    (is (= (stemming "vitalisms") "vital"))))

(deftest test-5993
  (testing "test case 5993"
    (is (= (stemming "fagot") "fagot"))))

(deftest test-5994
  (testing "test case 5994"
    (is (= (stemming "generator") "gener"))))

(deftest test-5995
  (testing "test case 5995"
    (is (= (stemming "minneapolis") "minneapoli"))))

(deftest test-5996
  (testing "test case 5996"
    (is (= (stemming "nonconformity") "nonconform"))))

(deftest test-5997
  (testing "test case 5997"
    (is (= (stemming "detects") "detect"))))

(deftest test-5998
  (testing "test case 5998"
    (is (= (stemming "obliterator") "obliter"))))

(deftest test-5999
  (testing "test case 5999"
    (is (= (stemming "raggedness") "ragged"))))

(deftest test-6000
  (testing "test case 6000"
    (is (= (stemming "oomphs") "oomph"))))

(deftest test-6001
  (testing "test case 6001"
    (is (= (stemming "empurpling") "empurpl"))))

(deftest test-6002
  (testing "test case 6002"
    (is (= (stemming "toxicologists") "toxicologist"))))

(deftest test-6003
  (testing "test case 6003"
    (is (= (stemming "spitball") "spitbal"))))

(deftest test-6004
  (testing "test case 6004"
    (is (= (stemming "tidies") "tidi"))))

(deftest test-6005
  (testing "test case 6005"
    (is (= (stemming "stabled") "stabl"))))

(deftest test-6006
  (testing "test case 6006"
    (is (= (stemming "drive") "drive"))))

(deftest test-6007
  (testing "test case 6007"
    (is (= (stemming "xebecs") "xebec"))))

(deftest test-6008
  (testing "test case 6008"
    (is (= (stemming "coiled") "coil"))))

(deftest test-6009
  (testing "test case 6009"
    (is (= (stemming "dichromatic") "dichromat"))))

(deftest test-6010
  (testing "test case 6010"
    (is (= (stemming "hellfire") "hellfir"))))

(deftest test-6011
  (testing "test case 6011"
    (is (= (stemming "lipping") "lip"))))

(deftest test-6012
  (testing "test case 6012"
    (is (= (stemming "sublimating") "sublim"))))

(deftest test-6013
  (testing "test case 6013"
    (is (= (stemming "hierarchal") "hierarch"))))

(deftest test-6014
  (testing "test case 6014"
    (is (= (stemming "mispronounce") "mispronounc"))))

(deftest test-6015
  (testing "test case 6015"
    (is (= (stemming "disinfestation") "disinfest"))))

(deftest test-6016
  (testing "test case 6016"
    (is (= (stemming "matte") "matt"))))

(deftest test-6017
  (testing "test case 6017"
    (is (= (stemming "courthouses") "courthous"))))

(deftest test-6018
  (testing "test case 6018"
    (is (= (stemming "abhor") "abhor"))))

(deftest test-6019
  (testing "test case 6019"
    (is (= (stemming "masticating") "mastic"))))

(deftest test-6020
  (testing "test case 6020"
    (is (= (stemming "restaffed") "restaf"))))

(deftest test-6021
  (testing "test case 6021"
    (is (= (stemming "coveter") "covet"))))

(deftest test-6022
  (testing "test case 6022"
    (is (= (stemming "deposit") "deposit"))))

(deftest test-6023
  (testing "test case 6023"
    (is (= (stemming "teashops") "teashop"))))

(deftest test-6024
  (testing "test case 6024"
    (is (= (stemming "ruinousness") "ruinous"))))

(deftest test-6025
  (testing "test case 6025"
    (is (= (stemming "conservator") "conserv"))))

(deftest test-6026
  (testing "test case 6026"
    (is (= (stemming "microbic") "microb"))))

(deftest test-6027
  (testing "test case 6027"
    (is (= (stemming "relapsers") "relaps"))))

(deftest test-6028
  (testing "test case 6028"
    (is (= (stemming "belligerent") "belliger"))))

(deftest test-6029
  (testing "test case 6029"
    (is (= (stemming "adventures") "adventur"))))

(deftest test-6030
  (testing "test case 6030"
    (is (= (stemming "windsor") "windsor"))))

(deftest test-6031
  (testing "test case 6031"
    (is (= (stemming "trenchantly") "trenchantli"))))

(deftest test-6032
  (testing "test case 6032"
    (is (= (stemming "indefeasibly") "indefeas"))))

(deftest test-6033
  (testing "test case 6033"
    (is (= (stemming "hyperbolas") "hyperbola"))))

(deftest test-6034
  (testing "test case 6034"
    (is (= (stemming "jumped") "jump"))))

(deftest test-6035
  (testing "test case 6035"
    (is (= (stemming "coven") "coven"))))

(deftest test-6036
  (testing "test case 6036"
    (is (= (stemming "hydrocarbons") "hydrocarbon"))))

(deftest test-6037
  (testing "test case 6037"
    (is (= (stemming "esteem") "esteem"))))

(deftest test-6038
  (testing "test case 6038"
    (is (= (stemming "intricate") "intric"))))

(deftest test-6039
  (testing "test case 6039"
    (is (= (stemming "radioscopical") "radioscop"))))

(deftest test-6040
  (testing "test case 6040"
    (is (= (stemming "xiv") "xiv"))))

(deftest test-6041
  (testing "test case 6041"
    (is (= (stemming "unmuzzle") "unmuzzl"))))

(deftest test-6042
  (testing "test case 6042"
    (is (= (stemming "forcing") "forc"))))

(deftest test-6043
  (testing "test case 6043"
    (is (= (stemming "vinier") "vinier"))))

(deftest test-6044
  (testing "test case 6044"
    (is (= (stemming "bootery") "booteri"))))

(deftest test-6045
  (testing "test case 6045"
    (is (= (stemming "relent") "relent"))))

(deftest test-6046
  (testing "test case 6046"
    (is (= (stemming "subleased") "subleas"))))

(deftest test-6047
  (testing "test case 6047"
    (is (= (stemming "simps") "simp"))))

(deftest test-6048
  (testing "test case 6048"
    (is (= (stemming "joey") "joei"))))

(deftest test-6049
  (testing "test case 6049"
    (is (= (stemming "frosts") "frost"))))

(deftest test-6050
  (testing "test case 6050"
    (is (= (stemming "masticated") "mastic"))))

(deftest test-6051
  (testing "test case 6051"
    (is (= (stemming "entrancing") "entranc"))))

(deftest test-6052
  (testing "test case 6052"
    (is (= (stemming "sirloins") "sirloin"))))

(deftest test-6053
  (testing "test case 6053"
    (is (= (stemming "soapless") "soapless"))))

(deftest test-6054
  (testing "test case 6054"
    (is (= (stemming "converting") "convert"))))

(deftest test-6055
  (testing "test case 6055"
    (is (= (stemming "oocyte") "oocyt"))))

(deftest test-6056
  (testing "test case 6056"
    (is (= (stemming "lived") "live"))))

(deftest test-6057
  (testing "test case 6057"
    (is (= (stemming "slayers") "slayer"))))

(deftest test-6058
  (testing "test case 6058"
    (is (= (stemming "polyandrist") "polyandrist"))))

(deftest test-6059
  (testing "test case 6059"
    (is (= (stemming "centrifugalize") "centrifug"))))

(deftest test-6060
  (testing "test case 6060"
    (is (= (stemming "polite") "polit"))))

(deftest test-6061
  (testing "test case 6061"
    (is (= (stemming "drained") "drain"))))

(deftest test-6062
  (testing "test case 6062"
    (is (= (stemming "multiplicities") "multipl"))))

(deftest test-6063
  (testing "test case 6063"
    (is (= (stemming "multimillionaire") "multimillionair"))))

(deftest test-6064
  (testing "test case 6064"
    (is (= (stemming "hiking") "hike"))))

(deftest test-6065
  (testing "test case 6065"
    (is (= (stemming "preappoints") "preappoint"))))

(deftest test-6066
  (testing "test case 6066"
    (is (= (stemming "dishy") "dishi"))))

(deftest test-6067
  (testing "test case 6067"
    (is (= (stemming "echoic") "echoic"))))

(deftest test-6068
  (testing "test case 6068"
    (is (= (stemming "attainer") "attain"))))

(deftest test-6069
  (testing "test case 6069"
    (is (= (stemming "legateships") "legateship"))))

(deftest test-6070
  (testing "test case 6070"
    (is (= (stemming "connection") "connect"))))

(deftest test-6071
  (testing "test case 6071"
    (is (= (stemming "surrealist") "surrealist"))))

(deftest test-6072
  (testing "test case 6072"
    (is (= (stemming "acted") "act"))))

(deftest test-6073
  (testing "test case 6073"
    (is (= (stemming "abridges") "abridg"))))

(deftest test-6074
  (testing "test case 6074"
    (is (= (stemming "complain") "complain"))))

(deftest test-6075
  (testing "test case 6075"
    (is (= (stemming "cherenkov") "cherenkov"))))

(deftest test-6076
  (testing "test case 6076"
    (is (= (stemming "shiest") "shiest"))))

(deftest test-6077
  (testing "test case 6077"
    (is (= (stemming "ixia") "ixia"))))

(deftest test-6078
  (testing "test case 6078"
    (is (= (stemming "yuccas") "yucca"))))

(deftest test-6079
  (testing "test case 6079"
    (is (= (stemming "stowing") "stow"))))

(deftest test-6080
  (testing "test case 6080"
    (is (= (stemming "encircled") "encircl"))))

(deftest test-6081
  (testing "test case 6081"
    (is (= (stemming "garoting") "garot"))))

(deftest test-6082
  (testing "test case 6082"
    (is (= (stemming "revalue") "revalu"))))

(deftest test-6083
  (testing "test case 6083"
    (is (= (stemming "leviathans") "leviathan"))))

(deftest test-6084
  (testing "test case 6084"
    (is (= (stemming "privileged") "privileg"))))

(deftest test-6085
  (testing "test case 6085"
    (is (= (stemming "seemliest") "seemliest"))))

(deftest test-6086
  (testing "test case 6086"
    (is (= (stemming "drivable") "drivabl"))))

(deftest test-6087
  (testing "test case 6087"
    (is (= (stemming "todays") "todai"))))

(deftest test-6088
  (testing "test case 6088"
    (is (= (stemming "nursed") "nurs"))))

(deftest test-6089
  (testing "test case 6089"
    (is (= (stemming "overintellectual") "overintellectu"))))

(deftest test-6090
  (testing "test case 6090"
    (is (= (stemming "hungerless") "hungerless"))))

(deftest test-6091
  (testing "test case 6091"
    (is (= (stemming "denominate") "denomin"))))

(deftest test-6092
  (testing "test case 6092"
    (is (= (stemming "evaders") "evad"))))

(deftest test-6093
  (testing "test case 6093"
    (is (= (stemming "workboxes") "workbox"))))

(deftest test-6094
  (testing "test case 6094"
    (is (= (stemming "sharecropper") "sharecropp"))))

(deftest test-6095
  (testing "test case 6095"
    (is (= (stemming "trolleying") "trollei"))))

(deftest test-6096
  (testing "test case 6096"
    (is (= (stemming "motionlessness") "motionless"))))

(deftest test-6097
  (testing "test case 6097"
    (is (= (stemming "rotational") "rotat"))))

(deftest test-6098
  (testing "test case 6098"
    (is (= (stemming "freudianism") "freudian"))))

(deftest test-6099
  (testing "test case 6099"
    (is (= (stemming "pearlite") "pearlit"))))

(deftest test-6100
  (testing "test case 6100"
    (is (= (stemming "intrudingly") "intrudingli"))))

(deftest test-6101
  (testing "test case 6101"
    (is (= (stemming "darnedest") "darnedest"))))

(deftest test-6102
  (testing "test case 6102"
    (is (= (stemming "slipsoles") "slipsol"))))

(deftest test-6103
  (testing "test case 6103"
    (is (= (stemming "pinner") "pinner"))))

(deftest test-6104
  (testing "test case 6104"
    (is (= (stemming "shunpike") "shunpik"))))

(deftest test-6105
  (testing "test case 6105"
    (is (= (stemming "complexional") "complexion"))))

(deftest test-6106
  (testing "test case 6106"
    (is (= (stemming "elongations") "elong"))))

(deftest test-6107
  (testing "test case 6107"
    (is (= (stemming "distortion") "distort"))))

(deftest test-6108
  (testing "test case 6108"
    (is (= (stemming "carer") "carer"))))

(deftest test-6109
  (testing "test case 6109"
    (is (= (stemming "jerboas") "jerboa"))))

(deftest test-6110
  (testing "test case 6110"
    (is (= (stemming "demographics") "demograph"))))

(deftest test-6111
  (testing "test case 6111"
    (is (= (stemming "righty") "righti"))))

(deftest test-6112
  (testing "test case 6112"
    (is (= (stemming "blameful") "blame"))))

(deftest test-6113
  (testing "test case 6113"
    (is (= (stemming "biologist") "biologist"))))

(deftest test-6114
  (testing "test case 6114"
    (is (= (stemming "skunked") "skunk"))))

(deftest test-6115
  (testing "test case 6115"
    (is (= (stemming "paraplegic") "parapleg"))))

(deftest test-6116
  (testing "test case 6116"
    (is (= (stemming "ruralize") "rural"))))

(deftest test-6117
  (testing "test case 6117"
    (is (= (stemming "catholic") "cathol"))))

(deftest test-6118
  (testing "test case 6118"
    (is (= (stemming "doling") "dole"))))

(deftest test-6119
  (testing "test case 6119"
    (is (= (stemming "antilogarithm") "antilogarithm"))))

(deftest test-6120
  (testing "test case 6120"
    (is (= (stemming "offsets") "offset"))))

(deftest test-6121
  (testing "test case 6121"
    (is (= (stemming "cubbyhole") "cubbyhol"))))

(deftest test-6122
  (testing "test case 6122"
    (is (= (stemming "expositions") "exposit"))))

(deftest test-6123
  (testing "test case 6123"
    (is (= (stemming "agers") "ager"))))

(deftest test-6124
  (testing "test case 6124"
    (is (= (stemming "ahem") "ahem"))))

(deftest test-6125
  (testing "test case 6125"
    (is (= (stemming "mannerliness") "mannerli"))))

(deftest test-6126
  (testing "test case 6126"
    (is (= (stemming "subsurface") "subsurfac"))))

(deftest test-6127
  (testing "test case 6127"
    (is (= (stemming "sectarianism") "sectarian"))))

(deftest test-6128
  (testing "test case 6128"
    (is (= (stemming "outvotes") "outvot"))))

(deftest test-6129
  (testing "test case 6129"
    (is (= (stemming "elliptic") "ellipt"))))

(deftest test-6130
  (testing "test case 6130"
    (is (= (stemming "quiets") "quiet"))))

(deftest test-6131
  (testing "test case 6131"
    (is (= (stemming "guilders") "guilder"))))

(deftest test-6132
  (testing "test case 6132"
    (is (= (stemming "sharpie") "sharpi"))))

(deftest test-6133
  (testing "test case 6133"
    (is (= (stemming "lamps") "lamp"))))

(deftest test-6134
  (testing "test case 6134"
    (is (= (stemming "dorsa") "dorsa"))))

(deftest test-6135
  (testing "test case 6135"
    (is (= (stemming "congruences") "congruenc"))))

(deftest test-6136
  (testing "test case 6136"
    (is (= (stemming "headgear") "headgear"))))

(deftest test-6137
  (testing "test case 6137"
    (is (= (stemming "unpitied") "unpiti"))))

(deftest test-6138
  (testing "test case 6138"
    (is (= (stemming "malevolently") "malevol"))))

(deftest test-6139
  (testing "test case 6139"
    (is (= (stemming "distrustful") "distrust"))))

(deftest test-6140
  (testing "test case 6140"
    (is (= (stemming "honorarily") "honorarili"))))

(deftest test-6141
  (testing "test case 6141"
    (is (= (stemming "trivets") "trivet"))))

(deftest test-6142
  (testing "test case 6142"
    (is (= (stemming "shampooers") "shampooer"))))

(deftest test-6143
  (testing "test case 6143"
    (is (= (stemming "portrait") "portrait"))))

(deftest test-6144
  (testing "test case 6144"
    (is (= (stemming "bray") "brai"))))

(deftest test-6145
  (testing "test case 6145"
    (is (= (stemming "ghostwriting") "ghostwrit"))))

(deftest test-6146
  (testing "test case 6146"
    (is (= (stemming "prechills") "prechil"))))

(deftest test-6147
  (testing "test case 6147"
    (is (= (stemming "duenna") "duenna"))))

(deftest test-6148
  (testing "test case 6148"
    (is (= (stemming "walt") "walt"))))

(deftest test-6149
  (testing "test case 6149"
    (is (= (stemming "recreating") "recreat"))))

(deftest test-6150
  (testing "test case 6150"
    (is (= (stemming "floodways") "floodwai"))))

(deftest test-6151
  (testing "test case 6151"
    (is (= (stemming "flasks") "flask"))))

(deftest test-6152
  (testing "test case 6152"
    (is (= (stemming "transmutes") "transmut"))))

(deftest test-6153
  (testing "test case 6153"
    (is (= (stemming "fastened") "fasten"))))

(deftest test-6154
  (testing "test case 6154"
    (is (= (stemming "prunable") "prunabl"))))

(deftest test-6155
  (testing "test case 6155"
    (is (= (stemming "shoeblack") "shoeblack"))))

(deftest test-6156
  (testing "test case 6156"
    (is (= (stemming "patient") "patient"))))

(deftest test-6157
  (testing "test case 6157"
    (is (= (stemming "docility") "docil"))))

(deftest test-6158
  (testing "test case 6158"
    (is (= (stemming "blueblack") "blueblack"))))

(deftest test-6159
  (testing "test case 6159"
    (is (= (stemming "flattening") "flatten"))))

(deftest test-6160
  (testing "test case 6160"
    (is (= (stemming "reverbs") "reverb"))))

(deftest test-6161
  (testing "test case 6161"
    (is (= (stemming "scotched") "scotch"))))

(deftest test-6162
  (testing "test case 6162"
    (is (= (stemming "boneyard") "boneyard"))))

(deftest test-6163
  (testing "test case 6163"
    (is (= (stemming "sharp") "sharp"))))

(deftest test-6164
  (testing "test case 6164"
    (is (= (stemming "indicia") "indicia"))))

(deftest test-6165
  (testing "test case 6165"
    (is (= (stemming "overcompensations") "overcompens"))))

(deftest test-6166
  (testing "test case 6166"
    (is (= (stemming "begrimed") "begrim"))))

(deftest test-6167
  (testing "test case 6167"
    (is (= (stemming "aggrandizement") "aggrandiz"))))

(deftest test-6168
  (testing "test case 6168"
    (is (= (stemming "deejays") "deejai"))))

(deftest test-6169
  (testing "test case 6169"
    (is (= (stemming "enslavement") "enslav"))))

(deftest test-6170
  (testing "test case 6170"
    (is (= (stemming "inextinguishably") "inextinguish"))))

(deftest test-6171
  (testing "test case 6171"
    (is (= (stemming "easiness") "easi"))))

(deftest test-6172
  (testing "test case 6172"
    (is (= (stemming "indulged") "indulg"))))

(deftest test-6173
  (testing "test case 6173"
    (is (= (stemming "bowel") "bowel"))))

(deftest test-6174
  (testing "test case 6174"
    (is (= (stemming "rasping") "rasp"))))

(deftest test-6175
  (testing "test case 6175"
    (is (= (stemming "unled") "unl"))))

(deftest test-6176
  (testing "test case 6176"
    (is (= (stemming "violin") "violin"))))

(deftest test-6177
  (testing "test case 6177"
    (is (= (stemming "enliven") "enliven"))))

(deftest test-6178
  (testing "test case 6178"
    (is (= (stemming "opec") "opec"))))

(deftest test-6179
  (testing "test case 6179"
    (is (= (stemming "toweriest") "toweriest"))))

(deftest test-6180
  (testing "test case 6180"
    (is (= (stemming "parlor") "parlor"))))

(deftest test-6181
  (testing "test case 6181"
    (is (= (stemming "hobbyist") "hobbyist"))))

(deftest test-6182
  (testing "test case 6182"
    (is (= (stemming "learned") "learn"))))

(deftest test-6183
  (testing "test case 6183"
    (is (= (stemming "sicks") "sick"))))

(deftest test-6184
  (testing "test case 6184"
    (is (= (stemming "coelenterate") "coelenter"))))

(deftest test-6185
  (testing "test case 6185"
    (is (= (stemming "solicitor") "solicitor"))))

(deftest test-6186
  (testing "test case 6186"
    (is (= (stemming "girdler") "girdler"))))

(deftest test-6187
  (testing "test case 6187"
    (is (= (stemming "weld") "weld"))))

(deftest test-6188
  (testing "test case 6188"
    (is (= (stemming "someways") "somewai"))))

(deftest test-6189
  (testing "test case 6189"
    (is (= (stemming "give") "give"))))

(deftest test-6190
  (testing "test case 6190"
    (is (= (stemming "mustards") "mustard"))))

(deftest test-6191
  (testing "test case 6191"
    (is (= (stemming "ember") "ember"))))

(deftest test-6192
  (testing "test case 6192"
    (is (= (stemming "unworkable") "unwork"))))

(deftest test-6193
  (testing "test case 6193"
    (is (= (stemming "introversions") "introvers"))))

(deftest test-6194
  (testing "test case 6194"
    (is (= (stemming "turnabouts") "turnabout"))))

(deftest test-6195
  (testing "test case 6195"
    (is (= (stemming "bulked") "bulk"))))

(deftest test-6196
  (testing "test case 6196"
    (is (= (stemming "cohesion") "cohes"))))

(deftest test-6197
  (testing "test case 6197"
    (is (= (stemming "purses") "purs"))))

(deftest test-6198
  (testing "test case 6198"
    (is (= (stemming "fibroids") "fibroid"))))

(deftest test-6199
  (testing "test case 6199"
    (is (= (stemming "underspend") "underspend"))))

(deftest test-6200
  (testing "test case 6200"
    (is (= (stemming "bookbinding") "bookbind"))))

(deftest test-6201
  (testing "test case 6201"
    (is (= (stemming "dealer") "dealer"))))

(deftest test-6202
  (testing "test case 6202"
    (is (= (stemming "chronically") "chronic"))))

(deftest test-6203
  (testing "test case 6203"
    (is (= (stemming "rollicked") "rollick"))))

(deftest test-6204
  (testing "test case 6204"
    (is (= (stemming "voles") "vole"))))

(deftest test-6205
  (testing "test case 6205"
    (is (= (stemming "limit") "limit"))))

(deftest test-6206
  (testing "test case 6206"
    (is (= (stemming "reordain") "reordain"))))

(deftest test-6207
  (testing "test case 6207"
    (is (= (stemming "glaciers") "glacier"))))

(deftest test-6208
  (testing "test case 6208"
    (is (= (stemming "zoophyte") "zoophyt"))))

(deftest test-6209
  (testing "test case 6209"
    (is (= (stemming "romantics") "romant"))))

(deftest test-6210
  (testing "test case 6210"
    (is (= (stemming "comedies") "comedi"))))

(deftest test-6211
  (testing "test case 6211"
    (is (= (stemming "accords") "accord"))))

(deftest test-6212
  (testing "test case 6212"
    (is (= (stemming "cougars") "cougar"))))

(deftest test-6213
  (testing "test case 6213"
    (is (= (stemming "mainmasts") "mainmast"))))

(deftest test-6214
  (testing "test case 6214"
    (is (= (stemming "coordination") "coordin"))))

(deftest test-6215
  (testing "test case 6215"
    (is (= (stemming "ringtail") "ringtail"))))

(deftest test-6216
  (testing "test case 6216"
    (is (= (stemming "prechilling") "prechil"))))

(deftest test-6217
  (testing "test case 6217"
    (is (= (stemming "quintessential") "quintessenti"))))

(deftest test-6218
  (testing "test case 6218"
    (is (= (stemming "hulks") "hulk"))))

(deftest test-6219
  (testing "test case 6219"
    (is (= (stemming "drills") "drill"))))

(deftest test-6220
  (testing "test case 6220"
    (is (= (stemming "clippings") "clip"))))

(deftest test-6221
  (testing "test case 6221"
    (is (= (stemming "tinfoils") "tinfoil"))))

(deftest test-6222
  (testing "test case 6222"
    (is (= (stemming "aeriform") "aeriform"))))

(deftest test-6223
  (testing "test case 6223"
    (is (= (stemming "westernize") "western"))))

(deftest test-6224
  (testing "test case 6224"
    (is (= (stemming "peins") "pein"))))

(deftest test-6225
  (testing "test case 6225"
    (is (= (stemming "petered") "peter"))))

(deftest test-6226
  (testing "test case 6226"
    (is (= (stemming "showed") "show"))))

(deftest test-6227
  (testing "test case 6227"
    (is (= (stemming "railroads") "railroad"))))

(deftest test-6228
  (testing "test case 6228"
    (is (= (stemming "overturing") "overtur"))))

(deftest test-6229
  (testing "test case 6229"
    (is (= (stemming "stricture") "strictur"))))

(deftest test-6230
  (testing "test case 6230"
    (is (= (stemming "busboys") "busboi"))))

(deftest test-6231
  (testing "test case 6231"
    (is (= (stemming "unwit") "unwit"))))

(deftest test-6232
  (testing "test case 6232"
    (is (= (stemming "funfair") "funfair"))))

(deftest test-6233
  (testing "test case 6233"
    (is (= (stemming "squiggles") "squiggl"))))

(deftest test-6234
  (testing "test case 6234"
    (is (= (stemming "finniest") "finniest"))))

(deftest test-6235
  (testing "test case 6235"
    (is (= (stemming "chloroplast") "chloroplast"))))

(deftest test-6236
  (testing "test case 6236"
    (is (= (stemming "cues") "cue"))))

(deftest test-6237
  (testing "test case 6237"
    (is (= (stemming "scrawling") "scrawl"))))

(deftest test-6238
  (testing "test case 6238"
    (is (= (stemming "floridan") "floridan"))))

(deftest test-6239
  (testing "test case 6239"
    (is (= (stemming "surrender") "surrend"))))

(deftest test-6240
  (testing "test case 6240"
    (is (= (stemming "retaliating") "retali"))))

(deftest test-6241
  (testing "test case 6241"
    (is (= (stemming "jaggery") "jaggeri"))))

(deftest test-6242
  (testing "test case 6242"
    (is (= (stemming "pulsatory") "pulsatori"))))

(deftest test-6243
  (testing "test case 6243"
    (is (= (stemming "filmstrip") "filmstrip"))))

(deftest test-6244
  (testing "test case 6244"
    (is (= (stemming "undiscovered") "undiscov"))))

(deftest test-6245
  (testing "test case 6245"
    (is (= (stemming "mint") "mint"))))

(deftest test-6246
  (testing "test case 6246"
    (is (= (stemming "revilers") "revil"))))

(deftest test-6247
  (testing "test case 6247"
    (is (= (stemming "limestones") "limeston"))))

(deftest test-6248
  (testing "test case 6248"
    (is (= (stemming "falchion") "falchion"))))

(deftest test-6249
  (testing "test case 6249"
    (is (= (stemming "cowl") "cowl"))))

(deftest test-6250
  (testing "test case 6250"
    (is (= (stemming "extermination") "extermin"))))

(deftest test-6251
  (testing "test case 6251"
    (is (= (stemming "thrusts") "thrust"))))

(deftest test-6252
  (testing "test case 6252"
    (is (= (stemming "newsprint") "newsprint"))))

(deftest test-6253
  (testing "test case 6253"
    (is (= (stemming "heinousness") "heinous"))))

(deftest test-6254
  (testing "test case 6254"
    (is (= (stemming "intersessions") "intersess"))))

(deftest test-6255
  (testing "test case 6255"
    (is (= (stemming "airspaces") "airspac"))))

(deftest test-6256
  (testing "test case 6256"
    (is (= (stemming "sufferance") "suffer"))))

(deftest test-6257
  (testing "test case 6257"
    (is (= (stemming "adagios") "adagio"))))

(deftest test-6258
  (testing "test case 6258"
    (is (= (stemming "odoriferous") "odorifer"))))

(deftest test-6259
  (testing "test case 6259"
    (is (= (stemming "assert") "assert"))))

(deftest test-6260
  (testing "test case 6260"
    (is (= (stemming "bodyweight") "bodyweight"))))

(deftest test-6261
  (testing "test case 6261"
    (is (= (stemming "pitches") "pitch"))))

(deftest test-6262
  (testing "test case 6262"
    (is (= (stemming "overincline") "overinclin"))))

(deftest test-6263
  (testing "test case 6263"
    (is (= (stemming "skimmings") "skim"))))

(deftest test-6264
  (testing "test case 6264"
    (is (= (stemming "encrypting") "encrypt"))))

(deftest test-6265
  (testing "test case 6265"
    (is (= (stemming "crystal") "crystal"))))

(deftest test-6266
  (testing "test case 6266"
    (is (= (stemming "plebiscites") "plebiscit"))))

(deftest test-6267
  (testing "test case 6267"
    (is (= (stemming "canalboat") "canalboat"))))

(deftest test-6268
  (testing "test case 6268"
    (is (= (stemming "taxidermists") "taxidermist"))))

(deftest test-6269
  (testing "test case 6269"
    (is (= (stemming "persevere") "persever"))))

(deftest test-6270
  (testing "test case 6270"
    (is (= (stemming "deadlock") "deadlock"))))

(deftest test-6271
  (testing "test case 6271"
    (is (= (stemming "bestows") "bestow"))))

(deftest test-6272
  (testing "test case 6272"
    (is (= (stemming "wearisomely") "wearisom"))))

(deftest test-6273
  (testing "test case 6273"
    (is (= (stemming "graffito") "graffito"))))

(deftest test-6274
  (testing "test case 6274"
    (is (= (stemming "palming") "palm"))))

(deftest test-6275
  (testing "test case 6275"
    (is (= (stemming "soigne") "soign"))))

(deftest test-6276
  (testing "test case 6276"
    (is (= (stemming "undiscouraged") "undiscourag"))))

(deftest test-6277
  (testing "test case 6277"
    (is (= (stemming "erectors") "erector"))))

(deftest test-6278
  (testing "test case 6278"
    (is (= (stemming "polysorbate") "polysorb"))))

(deftest test-6279
  (testing "test case 6279"
    (is (= (stemming "openworks") "openwork"))))

(deftest test-6280
  (testing "test case 6280"
    (is (= (stemming "mammae") "mamma"))))

(deftest test-6281
  (testing "test case 6281"
    (is (= (stemming "urethra") "urethra"))))

(deftest test-6282
  (testing "test case 6282"
    (is (= (stemming "feted") "fete"))))

(deftest test-6283
  (testing "test case 6283"
    (is (= (stemming "sextupling") "sextupl"))))

(deftest test-6284
  (testing "test case 6284"
    (is (= (stemming "reflects") "reflect"))))

(deftest test-6285
  (testing "test case 6285"
    (is (= (stemming "parterres") "parterr"))))

(deftest test-6286
  (testing "test case 6286"
    (is (= (stemming "busyness") "busy"))))

(deftest test-6287
  (testing "test case 6287"
    (is (= (stemming "ictus") "ictu"))))

(deftest test-6288
  (testing "test case 6288"
    (is (= (stemming "jaggeder") "jagged"))))

(deftest test-6289
  (testing "test case 6289"
    (is (= (stemming "hilariousness") "hilari"))))

(deftest test-6290
  (testing "test case 6290"
    (is (= (stemming "breeziness") "breezi"))))

(deftest test-6291
  (testing "test case 6291"
    (is (= (stemming "spidery") "spideri"))))

(deftest test-6292
  (testing "test case 6292"
    (is (= (stemming "gothic") "gothic"))))

(deftest test-6293
  (testing "test case 6293"
    (is (= (stemming "misbeliefs") "misbelief"))))

(deftest test-6294
  (testing "test case 6294"
    (is (= (stemming "deducted") "deduct"))))

(deftest test-6295
  (testing "test case 6295"
    (is (= (stemming "crackpots") "crackpot"))))

(deftest test-6296
  (testing "test case 6296"
    (is (= (stemming "emus") "emu"))))

(deftest test-6297
  (testing "test case 6297"
    (is (= (stemming "diabetes") "diabet"))))

(deftest test-6298
  (testing "test case 6298"
    (is (= (stemming "commixt") "commixt"))))

(deftest test-6299
  (testing "test case 6299"
    (is (= (stemming "viper") "viper"))))

(deftest test-6300
  (testing "test case 6300"
    (is (= (stemming "fazes") "faze"))))

(deftest test-6301
  (testing "test case 6301"
    (is (= (stemming "defrayed") "defrai"))))

(deftest test-6302
  (testing "test case 6302"
    (is (= (stemming "illicitly") "illicitli"))))

(deftest test-6303
  (testing "test case 6303"
    (is (= (stemming "eventual") "eventu"))))

(deftest test-6304
  (testing "test case 6304"
    (is (= (stemming "stickily") "stickili"))))

(deftest test-6305
  (testing "test case 6305"
    (is (= (stemming "sunshiny") "sunshini"))))

(deftest test-6306
  (testing "test case 6306"
    (is (= (stemming "refigure") "refigur"))))

(deftest test-6307
  (testing "test case 6307"
    (is (= (stemming "partnership") "partnership"))))

(deftest test-6308
  (testing "test case 6308"
    (is (= (stemming "facilely") "facil"))))

(deftest test-6309
  (testing "test case 6309"
    (is (= (stemming "pajama") "pajama"))))

(deftest test-6310
  (testing "test case 6310"
    (is (= (stemming "solidifying") "solidifi"))))

(deftest test-6311
  (testing "test case 6311"
    (is (= (stemming "plumelet") "plumelet"))))

(deftest test-6312
  (testing "test case 6312"
    (is (= (stemming "pyrethrum") "pyrethrum"))))

(deftest test-6313
  (testing "test case 6313"
    (is (= (stemming "legginged") "legging"))))

(deftest test-6314
  (testing "test case 6314"
    (is (= (stemming "configure") "configur"))))

(deftest test-6315
  (testing "test case 6315"
    (is (= (stemming "irreconcilably") "irreconcil"))))

(deftest test-6316
  (testing "test case 6316"
    (is (= (stemming "encodes") "encod"))))

(deftest test-6317
  (testing "test case 6317"
    (is (= (stemming "missies") "missi"))))

(deftest test-6318
  (testing "test case 6318"
    (is (= (stemming "endocrinologists") "endocrinologist"))))

(deftest test-6319
  (testing "test case 6319"
    (is (= (stemming "gigue") "gigu"))))

(deftest test-6320
  (testing "test case 6320"
    (is (= (stemming "nim") "nim"))))

(deftest test-6321
  (testing "test case 6321"
    (is (= (stemming "polygraphically") "polygraph"))))

(deftest test-6322
  (testing "test case 6322"
    (is (= (stemming "ancien") "ancien"))))

(deftest test-6323
  (testing "test case 6323"
    (is (= (stemming "rives") "rive"))))

(deftest test-6324
  (testing "test case 6324"
    (is (= (stemming "interjects") "interject"))))

(deftest test-6325
  (testing "test case 6325"
    (is (= (stemming "bandeaux") "bandeaux"))))

(deftest test-6326
  (testing "test case 6326"
    (is (= (stemming "pally") "palli"))))

(deftest test-6327
  (testing "test case 6327"
    (is (= (stemming "scandalization") "scandal"))))

(deftest test-6328
  (testing "test case 6328"
    (is (= (stemming "posthumous") "posthum"))))

(deftest test-6329
  (testing "test case 6329"
    (is (= (stemming "offload") "offload"))))

(deftest test-6330
  (testing "test case 6330"
    (is (= (stemming "daimon") "daimon"))))

(deftest test-6331
  (testing "test case 6331"
    (is (= (stemming "flush") "flush"))))

(deftest test-6332
  (testing "test case 6332"
    (is (= (stemming "penciler") "pencil"))))

(deftest test-6333
  (testing "test case 6333"
    (is (= (stemming "garbles") "garbl"))))

(deftest test-6334
  (testing "test case 6334"
    (is (= (stemming "admittedly") "admittedli"))))

(deftest test-6335
  (testing "test case 6335"
    (is (= (stemming "babbitting") "babbit"))))

(deftest test-6336
  (testing "test case 6336"
    (is (= (stemming "bumkins") "bumkin"))))

(deftest test-6337
  (testing "test case 6337"
    (is (= (stemming "boccie") "bocci"))))

(deftest test-6338
  (testing "test case 6338"
    (is (= (stemming "plectra") "plectra"))))

(deftest test-6339
  (testing "test case 6339"
    (is (= (stemming "correlated") "correl"))))

(deftest test-6340
  (testing "test case 6340"
    (is (= (stemming "vociferous") "vocifer"))))

(deftest test-6341
  (testing "test case 6341"
    (is (= (stemming "exploited") "exploit"))))

(deftest test-6342
  (testing "test case 6342"
    (is (= (stemming "adage") "adag"))))

(deftest test-6343
  (testing "test case 6343"
    (is (= (stemming "soloed") "solo"))))

(deftest test-6344
  (testing "test case 6344"
    (is (= (stemming "purees") "pure"))))

(deftest test-6345
  (testing "test case 6345"
    (is (= (stemming "fillers") "filler"))))

(deftest test-6346
  (testing "test case 6346"
    (is (= (stemming "coupe") "coup"))))

(deftest test-6347
  (testing "test case 6347"
    (is (= (stemming "nudge") "nudg"))))

(deftest test-6348
  (testing "test case 6348"
    (is (= (stemming "lindies") "lindi"))))

(deftest test-6349
  (testing "test case 6349"
    (is (= (stemming "convulsing") "convuls"))))

(deftest test-6350
  (testing "test case 6350"
    (is (= (stemming "cobras") "cobra"))))

(deftest test-6351
  (testing "test case 6351"
    (is (= (stemming "assumptions") "assumpt"))))

(deftest test-6352
  (testing "test case 6352"
    (is (= (stemming "kyats") "kyat"))))

(deftest test-6353
  (testing "test case 6353"
    (is (= (stemming "contorts") "contort"))))

(deftest test-6354
  (testing "test case 6354"
    (is (= (stemming "campaniles") "campanil"))))

(deftest test-6355
  (testing "test case 6355"
    (is (= (stemming "cooingly") "cooingli"))))

(deftest test-6356
  (testing "test case 6356"
    (is (= (stemming "greens") "green"))))

(deftest test-6357
  (testing "test case 6357"
    (is (= (stemming "anaemias") "anaemia"))))

(deftest test-6358
  (testing "test case 6358"
    (is (= (stemming "namelessly") "namelessli"))))

(deftest test-6359
  (testing "test case 6359"
    (is (= (stemming "auspice") "auspic"))))

(deftest test-6360
  (testing "test case 6360"
    (is (= (stemming "orogeny") "orogeni"))))

(deftest test-6361
  (testing "test case 6361"
    (is (= (stemming "clapt") "clapt"))))

(deftest test-6362
  (testing "test case 6362"
    (is (= (stemming "luggers") "lugger"))))

(deftest test-6363
  (testing "test case 6363"
    (is (= (stemming "cowcatchers") "cowcatch"))))

(deftest test-6364
  (testing "test case 6364"
    (is (= (stemming "proctoring") "proctor"))))

(deftest test-6365
  (testing "test case 6365"
    (is (= (stemming "encompassing") "encompass"))))

(deftest test-6366
  (testing "test case 6366"
    (is (= (stemming "dell") "dell"))))

(deftest test-6367
  (testing "test case 6367"
    (is (= (stemming "slither") "slither"))))

(deftest test-6368
  (testing "test case 6368"
    (is (= (stemming "fishwives") "fishwiv"))))

(deftest test-6369
  (testing "test case 6369"
    (is (= (stemming "tampered") "tamper"))))

(deftest test-6370
  (testing "test case 6370"
    (is (= (stemming "decontrolled") "decontrol"))))

(deftest test-6371
  (testing "test case 6371"
    (is (= (stemming "consummating") "consumm"))))

(deftest test-6372
  (testing "test case 6372"
    (is (= (stemming "permanently") "perman"))))

(deftest test-6373
  (testing "test case 6373"
    (is (= (stemming "elegantly") "elegantli"))))

(deftest test-6374
  (testing "test case 6374"
    (is (= (stemming "millirems") "millirem"))))

(deftest test-6375
  (testing "test case 6375"
    (is (= (stemming "ingredient") "ingredi"))))

(deftest test-6376
  (testing "test case 6376"
    (is (= (stemming "juicily") "juicili"))))

(deftest test-6377
  (testing "test case 6377"
    (is (= (stemming "keywords") "keyword"))))

(deftest test-6378
  (testing "test case 6378"
    (is (= (stemming "unwrapping") "unwrap"))))

(deftest test-6379
  (testing "test case 6379"
    (is (= (stemming "olios") "olio"))))

(deftest test-6380
  (testing "test case 6380"
    (is (= (stemming "unrip") "unrip"))))

(deftest test-6381
  (testing "test case 6381"
    (is (= (stemming "nobbles") "nobbl"))))

(deftest test-6382
  (testing "test case 6382"
    (is (= (stemming "freighter") "freighter"))))

(deftest test-6383
  (testing "test case 6383"
    (is (= (stemming "sickout") "sickout"))))

(deftest test-6384
  (testing "test case 6384"
    (is (= (stemming "darndests") "darndest"))))

(deftest test-6385
  (testing "test case 6385"
    (is (= (stemming "libertarians") "libertarian"))))

(deftest test-6386
  (testing "test case 6386"
    (is (= (stemming "fluffed") "fluf"))))

(deftest test-6387
  (testing "test case 6387"
    (is (= (stemming "foxskins") "foxskin"))))

(deftest test-6388
  (testing "test case 6388"
    (is (= (stemming "federates") "feder"))))

(deftest test-6389
  (testing "test case 6389"
    (is (= (stemming "shadier") "shadier"))))

(deftest test-6390
  (testing "test case 6390"
    (is (= (stemming "swain") "swain"))))

(deftest test-6391
  (testing "test case 6391"
    (is (= (stemming "dulses") "duls"))))

(deftest test-6392
  (testing "test case 6392"
    (is (= (stemming "metre") "metr"))))

(deftest test-6393
  (testing "test case 6393"
    (is (= (stemming "recondensed") "recondens"))))

(deftest test-6394
  (testing "test case 6394"
    (is (= (stemming "confucius") "confuciu"))))

(deftest test-6395
  (testing "test case 6395"
    (is (= (stemming "acnes") "acn"))))

(deftest test-6396
  (testing "test case 6396"
    (is (= (stemming "sheols") "sheol"))))

(deftest test-6397
  (testing "test case 6397"
    (is (= (stemming "paratroop") "paratroop"))))

(deftest test-6398
  (testing "test case 6398"
    (is (= (stemming "apse") "aps"))))

(deftest test-6399
  (testing "test case 6399"
    (is (= (stemming "toppings") "top"))))

(deftest test-6400
  (testing "test case 6400"
    (is (= (stemming "reefy") "reefi"))))

(deftest test-6401
  (testing "test case 6401"
    (is (= (stemming "tersely") "ters"))))

(deftest test-6402
  (testing "test case 6402"
    (is (= (stemming "perverts") "pervert"))))

(deftest test-6403
  (testing "test case 6403"
    (is (= (stemming "unperformed") "unperform"))))

(deftest test-6404
  (testing "test case 6404"
    (is (= (stemming "bumbling") "bumbl"))))

(deftest test-6405
  (testing "test case 6405"
    (is (= (stemming "interties") "interti"))))

(deftest test-6406
  (testing "test case 6406"
    (is (= (stemming "effecters") "effect"))))

(deftest test-6407
  (testing "test case 6407"
    (is (= (stemming "mordents") "mordent"))))

(deftest test-6408
  (testing "test case 6408"
    (is (= (stemming "hurtled") "hurtl"))))

(deftest test-6409
  (testing "test case 6409"
    (is (= (stemming "powwow") "powwow"))))

(deftest test-6410
  (testing "test case 6410"
    (is (= (stemming "incentives") "incent"))))

(deftest test-6411
  (testing "test case 6411"
    (is (= (stemming "chowed") "chow"))))

(deftest test-6412
  (testing "test case 6412"
    (is (= (stemming "misogynic") "misogyn"))))

(deftest test-6413
  (testing "test case 6413"
    (is (= (stemming "spurreys") "spurrei"))))

(deftest test-6414
  (testing "test case 6414"
    (is (= (stemming "chivvying") "chivvi"))))

(deftest test-6415
  (testing "test case 6415"
    (is (= (stemming "brassies") "brassi"))))

(deftest test-6416
  (testing "test case 6416"
    (is (= (stemming "trochoids") "trochoid"))))

(deftest test-6417
  (testing "test case 6417"
    (is (= (stemming "functionaries") "functionari"))))

(deftest test-6418
  (testing "test case 6418"
    (is (= (stemming "leukaemic") "leukaem"))))

(deftest test-6419
  (testing "test case 6419"
    (is (= (stemming "beseech") "beseech"))))

(deftest test-6420
  (testing "test case 6420"
    (is (= (stemming "putsches") "putsch"))))

(deftest test-6421
  (testing "test case 6421"
    (is (= (stemming "prorater") "prorat"))))

(deftest test-6422
  (testing "test case 6422"
    (is (= (stemming "nonauthoritatively") "nonauthorit"))))

(deftest test-6423
  (testing "test case 6423"
    (is (= (stemming "thunderclouds") "thundercloud"))))

(deftest test-6424
  (testing "test case 6424"
    (is (= (stemming "emendation") "emend"))))

(deftest test-6425
  (testing "test case 6425"
    (is (= (stemming "quaker") "quaker"))))

(deftest test-6426
  (testing "test case 6426"
    (is (= (stemming "cuttlebone") "cuttlebon"))))

(deftest test-6427
  (testing "test case 6427"
    (is (= (stemming "footrest") "footrest"))))

(deftest test-6428
  (testing "test case 6428"
    (is (= (stemming "asphaltic") "asphalt"))))

(deftest test-6429
  (testing "test case 6429"
    (is (= (stemming "fiscally") "fiscal"))))

(deftest test-6430
  (testing "test case 6430"
    (is (= (stemming "quartan") "quartan"))))

(deftest test-6431
  (testing "test case 6431"
    (is (= (stemming "inlanders") "inland"))))

(deftest test-6432
  (testing "test case 6432"
    (is (= (stemming "waged") "wage"))))

(deftest test-6433
  (testing "test case 6433"
    (is (= (stemming "hoosgow") "hoosgow"))))

(deftest test-6434
  (testing "test case 6434"
    (is (= (stemming "paprika") "paprika"))))

(deftest test-6435
  (testing "test case 6435"
    (is (= (stemming "walleyed") "wallei"))))

(deftest test-6436
  (testing "test case 6436"
    (is (= (stemming "nine") "nine"))))

(deftest test-6437
  (testing "test case 6437"
    (is (= (stemming "sponsorships") "sponsorship"))))

(deftest test-6438
  (testing "test case 6438"
    (is (= (stemming "arrant") "arrant"))))

(deftest test-6439
  (testing "test case 6439"
    (is (= (stemming "distribute") "distribut"))))

(deftest test-6440
  (testing "test case 6440"
    (is (= (stemming "ideogenetic") "ideogenet"))))

(deftest test-6441
  (testing "test case 6441"
    (is (= (stemming "pulls") "pull"))))

(deftest test-6442
  (testing "test case 6442"
    (is (= (stemming "alcoholically") "alcohol"))))

(deftest test-6443
  (testing "test case 6443"
    (is (= (stemming "choreograph") "choreograph"))))

(deftest test-6444
  (testing "test case 6444"
    (is (= (stemming "granddads") "granddad"))))

(deftest test-6445
  (testing "test case 6445"
    (is (= (stemming "tetanuses") "tetanus"))))

(deftest test-6446
  (testing "test case 6446"
    (is (= (stemming "cycads") "cycad"))))

(deftest test-6447
  (testing "test case 6447"
    (is (= (stemming "filibustered") "filibust"))))

(deftest test-6448
  (testing "test case 6448"
    (is (= (stemming "spectates") "spectat"))))

(deftest test-6449
  (testing "test case 6449"
    (is (= (stemming "overassertive") "overassert"))))

(deftest test-6450
  (testing "test case 6450"
    (is (= (stemming "osaka") "osaka"))))

(deftest test-6451
  (testing "test case 6451"
    (is (= (stemming "wheezing") "wheez"))))

(deftest test-6452
  (testing "test case 6452"
    (is (= (stemming "trillers") "triller"))))

(deftest test-6453
  (testing "test case 6453"
    (is (= (stemming "baklava") "baklava"))))

(deftest test-6454
  (testing "test case 6454"
    (is (= (stemming "foretokened") "foretoken"))))

(deftest test-6455
  (testing "test case 6455"
    (is (= (stemming "minder") "minder"))))

(deftest test-6456
  (testing "test case 6456"
    (is (= (stemming "sleuths") "sleuth"))))

(deftest test-6457
  (testing "test case 6457"
    (is (= (stemming "evensong") "evensong"))))

(deftest test-6458
  (testing "test case 6458"
    (is (= (stemming "bedmates") "bedmat"))))

(deftest test-6459
  (testing "test case 6459"
    (is (= (stemming "bemuse") "bemus"))))

(deftest test-6460
  (testing "test case 6460"
    (is (= (stemming "names") "name"))))

(deftest test-6461
  (testing "test case 6461"
    (is (= (stemming "endowing") "endow"))))

(deftest test-6462
  (testing "test case 6462"
    (is (= (stemming "choiring") "choir"))))

(deftest test-6463
  (testing "test case 6463"
    (is (= (stemming "drosses") "dross"))))

(deftest test-6464
  (testing "test case 6464"
    (is (= (stemming "rendered") "render"))))

(deftest test-6465
  (testing "test case 6465"
    (is (= (stemming "dyes") "dye"))))

(deftest test-6466
  (testing "test case 6466"
    (is (= (stemming "codable") "codabl"))))

(deftest test-6467
  (testing "test case 6467"
    (is (= (stemming "whangers") "whanger"))))

(deftest test-6468
  (testing "test case 6468"
    (is (= (stemming "humidity") "humid"))))

(deftest test-6469
  (testing "test case 6469"
    (is (= (stemming "accentuating") "accentu"))))

(deftest test-6470
  (testing "test case 6470"
    (is (= (stemming "mormons") "mormon"))))

(deftest test-6471
  (testing "test case 6471"
    (is (= (stemming "cartesian") "cartesian"))))

(deftest test-6472
  (testing "test case 6472"
    (is (= (stemming "inhalations") "inhal"))))

(deftest test-6473
  (testing "test case 6473"
    (is (= (stemming "quadruplet") "quadruplet"))))

(deftest test-6474
  (testing "test case 6474"
    (is (= (stemming "seedman") "seedman"))))

(deftest test-6475
  (testing "test case 6475"
    (is (= (stemming "rondures") "rondur"))))

(deftest test-6476
  (testing "test case 6476"
    (is (= (stemming "shadowier") "shadowi"))))

(deftest test-6477
  (testing "test case 6477"
    (is (= (stemming "leaderless") "leaderless"))))

(deftest test-6478
  (testing "test case 6478"
    (is (= (stemming "beckoner") "beckon"))))

(deftest test-6479
  (testing "test case 6479"
    (is (= (stemming "artier") "artier"))))

(deftest test-6480
  (testing "test case 6480"
    (is (= (stemming "forgeries") "forgeri"))))

(deftest test-6481
  (testing "test case 6481"
    (is (= (stemming "thrombosis") "thrombosi"))))

(deftest test-6482
  (testing "test case 6482"
    (is (= (stemming "crimpers") "crimper"))))

(deftest test-6483
  (testing "test case 6483"
    (is (= (stemming "gusted") "gust"))))

(deftest test-6484
  (testing "test case 6484"
    (is (= (stemming "ramshorn") "ramshorn"))))

(deftest test-6485
  (testing "test case 6485"
    (is (= (stemming "skating") "skate"))))

(deftest test-6486
  (testing "test case 6486"
    (is (= (stemming "elizabeth") "elizabeth"))))

(deftest test-6487
  (testing "test case 6487"
    (is (= (stemming "untenanted") "unten"))))

(deftest test-6488
  (testing "test case 6488"
    (is (= (stemming "satrapy") "satrapi"))))

(deftest test-6489
  (testing "test case 6489"
    (is (= (stemming "drylot") "drylot"))))

(deftest test-6490
  (testing "test case 6490"
    (is (= (stemming "reinstatement") "reinstat"))))

(deftest test-6491
  (testing "test case 6491"
    (is (= (stemming "anthologizing") "antholog"))))

(deftest test-6492
  (testing "test case 6492"
    (is (= (stemming "dyslexics") "dyslex"))))

(deftest test-6493
  (testing "test case 6493"
    (is (= (stemming "frizziness") "frizzi"))))

(deftest test-6494
  (testing "test case 6494"
    (is (= (stemming "unapproved") "unapprov"))))

(deftest test-6495
  (testing "test case 6495"
    (is (= (stemming "noosers") "nooser"))))

(deftest test-6496
  (testing "test case 6496"
    (is (= (stemming "fallers") "faller"))))

(deftest test-6497
  (testing "test case 6497"
    (is (= (stemming "chamfered") "chamfer"))))

(deftest test-6498
  (testing "test case 6498"
    (is (= (stemming "conflagrations") "conflagr"))))

(deftest test-6499
  (testing "test case 6499"
    (is (= (stemming "biochemistries") "biochemistri"))))

(deftest test-6500
  (testing "test case 6500"
    (is (= (stemming "construable") "construabl"))))

(deftest test-6501
  (testing "test case 6501"
    (is (= (stemming "drummed") "drum"))))

(deftest test-6502
  (testing "test case 6502"
    (is (= (stemming "evolutions") "evolut"))))

(deftest test-6503
  (testing "test case 6503"
    (is (= (stemming "terminologists") "terminologist"))))

(deftest test-6504
  (testing "test case 6504"
    (is (= (stemming "snowier") "snowier"))))

(deftest test-6505
  (testing "test case 6505"
    (is (= (stemming "reemployed") "reemploi"))))

(deftest test-6506
  (testing "test case 6506"
    (is (= (stemming "rectorial") "rectori"))))

(deftest test-6507
  (testing "test case 6507"
    (is (= (stemming "cloches") "cloch"))))

(deftest test-6508
  (testing "test case 6508"
    (is (= (stemming "abecedarian") "abecedarian"))))

(deftest test-6509
  (testing "test case 6509"
    (is (= (stemming "gloamings") "gloam"))))

(deftest test-6510
  (testing "test case 6510"
    (is (= (stemming "fancifully") "fancifulli"))))

(deftest test-6511
  (testing "test case 6511"
    (is (= (stemming "famish") "famish"))))

(deftest test-6512
  (testing "test case 6512"
    (is (= (stemming "curettes") "curett"))))

(deftest test-6513
  (testing "test case 6513"
    (is (= (stemming "erotogenesis") "erotogenesi"))))

(deftest test-6514
  (testing "test case 6514"
    (is (= (stemming "monologists") "monologist"))))

(deftest test-6515
  (testing "test case 6515"
    (is (= (stemming "crystalline") "crystallin"))))

(deftest test-6516
  (testing "test case 6516"
    (is (= (stemming "redresser") "redress"))))

(deftest test-6517
  (testing "test case 6517"
    (is (= (stemming "caviling") "cavil"))))

(deftest test-6518
  (testing "test case 6518"
    (is (= (stemming "maziness") "mazi"))))

(deftest test-6519
  (testing "test case 6519"
    (is (= (stemming "ampoule") "ampoul"))))

(deftest test-6520
  (testing "test case 6520"
    (is (= (stemming "squabs") "squab"))))

(deftest test-6521
  (testing "test case 6521"
    (is (= (stemming "unapplied") "unappli"))))

(deftest test-6522
  (testing "test case 6522"
    (is (= (stemming "redox") "redox"))))

(deftest test-6523
  (testing "test case 6523"
    (is (= (stemming "manipulatory") "manipulatori"))))

(deftest test-6524
  (testing "test case 6524"
    (is (= (stemming "casework") "casework"))))

(deftest test-6525
  (testing "test case 6525"
    (is (= (stemming "procathedral") "procathedr"))))

(deftest test-6526
  (testing "test case 6526"
    (is (= (stemming "predation") "predat"))))

(deftest test-6527
  (testing "test case 6527"
    (is (= (stemming "adamant") "adam"))))

(deftest test-6528
  (testing "test case 6528"
    (is (= (stemming "emblems") "emblem"))))

(deftest test-6529
  (testing "test case 6529"
    (is (= (stemming "psychiatry") "psychiatri"))))

(deftest test-6530
  (testing "test case 6530"
    (is (= (stemming "fascicled") "fascicl"))))

(deftest test-6531
  (testing "test case 6531"
    (is (= (stemming "quaternary") "quaternari"))))

(deftest test-6532
  (testing "test case 6532"
    (is (= (stemming "constriction") "constrict"))))

(deftest test-6533
  (testing "test case 6533"
    (is (= (stemming "whack") "whack"))))

(deftest test-6534
  (testing "test case 6534"
    (is (= (stemming "gutted") "gut"))))

(deftest test-6535
  (testing "test case 6535"
    (is (= (stemming "weiners") "weiner"))))

(deftest test-6536
  (testing "test case 6536"
    (is (= (stemming "catalyzes") "catalyz"))))

(deftest test-6537
  (testing "test case 6537"
    (is (= (stemming "eliciting") "elicit"))))

(deftest test-6538
  (testing "test case 6538"
    (is (= (stemming "bundle") "bundl"))))

(deftest test-6539
  (testing "test case 6539"
    (is (= (stemming "laboratorial") "laboratori"))))

(deftest test-6540
  (testing "test case 6540"
    (is (= (stemming "screenwriter") "screenwrit"))))

(deftest test-6541
  (testing "test case 6541"
    (is (= (stemming "slob") "slob"))))

(deftest test-6542
  (testing "test case 6542"
    (is (= (stemming "raisings") "rais"))))

(deftest test-6543
  (testing "test case 6543"
    (is (= (stemming "urbanism") "urban"))))

(deftest test-6544
  (testing "test case 6544"
    (is (= (stemming "necessitous") "necessit"))))

(deftest test-6545
  (testing "test case 6545"
    (is (= (stemming "overpopulated") "overpopul"))))

(deftest test-6546
  (testing "test case 6546"
    (is (= (stemming "fagged") "fag"))))

(deftest test-6547
  (testing "test case 6547"
    (is (= (stemming "restarted") "restart"))))

(deftest test-6548
  (testing "test case 6548"
    (is (= (stemming "aerifying") "aerifi"))))

(deftest test-6549
  (testing "test case 6549"
    (is (= (stemming "limousine") "limousin"))))

(deftest test-6550
  (testing "test case 6550"
    (is (= (stemming "kneepan") "kneepan"))))

(deftest test-6551
  (testing "test case 6551"
    (is (= (stemming "menagerie") "menageri"))))

(deftest test-6552
  (testing "test case 6552"
    (is (= (stemming "quoter") "quoter"))))

(deftest test-6553
  (testing "test case 6553"
    (is (= (stemming "distributor") "distributor"))))

(deftest test-6554
  (testing "test case 6554"
    (is (= (stemming "circumventions") "circumvent"))))

(deftest test-6555
  (testing "test case 6555"
    (is (= (stemming "lieutenant") "lieuten"))))

(deftest test-6556
  (testing "test case 6556"
    (is (= (stemming "siphons") "siphon"))))

(deftest test-6557
  (testing "test case 6557"
    (is (= (stemming "aneroids") "aneroid"))))

(deftest test-6558
  (testing "test case 6558"
    (is (= (stemming "arboretums") "arboretum"))))

(deftest test-6559
  (testing "test case 6559"
    (is (= (stemming "swindled") "swindl"))))

(deftest test-6560
  (testing "test case 6560"
    (is (= (stemming "subcommittees") "subcommitte"))))

(deftest test-6561
  (testing "test case 6561"
    (is (= (stemming "fables") "fabl"))))

(deftest test-6562
  (testing "test case 6562"
    (is (= (stemming "lawless") "lawless"))))

(deftest test-6563
  (testing "test case 6563"
    (is (= (stemming "felonies") "feloni"))))

(deftest test-6564
  (testing "test case 6564"
    (is (= (stemming "lehayim") "lehayim"))))

(deftest test-6565
  (testing "test case 6565"
    (is (= (stemming "heatstroke") "heatstrok"))))

(deftest test-6566
  (testing "test case 6566"
    (is (= (stemming "validate") "valid"))))

(deftest test-6567
  (testing "test case 6567"
    (is (= (stemming "pygmyism") "pygmyism"))))

(deftest test-6568
  (testing "test case 6568"
    (is (= (stemming "enjoying") "enjoi"))))

(deftest test-6569
  (testing "test case 6569"
    (is (= (stemming "sufficed") "suffic"))))

(deftest test-6570
  (testing "test case 6570"
    (is (= (stemming "capacitance") "capacit"))))

(deftest test-6571
  (testing "test case 6571"
    (is (= (stemming "intermediacy") "intermediaci"))))

(deftest test-6572
  (testing "test case 6572"
    (is (= (stemming "bubbled") "bubbl"))))

(deftest test-6573
  (testing "test case 6573"
    (is (= (stemming "disembody") "disembodi"))))

(deftest test-6574
  (testing "test case 6574"
    (is (= (stemming "outstare") "outstar"))))

(deftest test-6575
  (testing "test case 6575"
    (is (= (stemming "intromit") "intromit"))))

(deftest test-6576
  (testing "test case 6576"
    (is (= (stemming "leachers") "leacher"))))

(deftest test-6577
  (testing "test case 6577"
    (is (= (stemming "southeasters") "southeast"))))

(deftest test-6578
  (testing "test case 6578"
    (is (= (stemming "psalmody") "psalmodi"))))

(deftest test-6579
  (testing "test case 6579"
    (is (= (stemming "partial") "partial"))))

(deftest test-6580
  (testing "test case 6580"
    (is (= (stemming "symptomatologically") "symptomatolog"))))

(deftest test-6581
  (testing "test case 6581"
    (is (= (stemming "benthic") "benthic"))))

(deftest test-6582
  (testing "test case 6582"
    (is (= (stemming "gadded") "gad"))))

(deftest test-6583
  (testing "test case 6583"
    (is (= (stemming "hexameter") "hexamet"))))

(deftest test-6584
  (testing "test case 6584"
    (is (= (stemming "inventories") "inventori"))))

(deftest test-6585
  (testing "test case 6585"
    (is (= (stemming "reemphases") "reemphas"))))

(deftest test-6586
  (testing "test case 6586"
    (is (= (stemming "razz") "razz"))))

(deftest test-6587
  (testing "test case 6587"
    (is (= (stemming "yowler") "yowler"))))

(deftest test-6588
  (testing "test case 6588"
    (is (= (stemming "diaper") "diaper"))))

(deftest test-6589
  (testing "test case 6589"
    (is (= (stemming "scrimping") "scrimp"))))

(deftest test-6590
  (testing "test case 6590"
    (is (= (stemming "fleabane") "fleaban"))))

(deftest test-6591
  (testing "test case 6591"
    (is (= (stemming "untanned") "untan"))))

(deftest test-6592
  (testing "test case 6592"
    (is (= (stemming "fifthly") "fifthli"))))

(deftest test-6593
  (testing "test case 6593"
    (is (= (stemming "unadulterated") "unadulter"))))

(deftest test-6594
  (testing "test case 6594"
    (is (= (stemming "restuffs") "restuff"))))

(deftest test-6595
  (testing "test case 6595"
    (is (= (stemming "penalizing") "penal"))))

(deftest test-6596
  (testing "test case 6596"
    (is (= (stemming "hype") "hype"))))

(deftest test-6597
  (testing "test case 6597"
    (is (= (stemming "fluids") "fluid"))))

(deftest test-6598
  (testing "test case 6598"
    (is (= (stemming "earthly") "earthli"))))

(deftest test-6599
  (testing "test case 6599"
    (is (= (stemming "beginners") "beginn"))))

(deftest test-6600
  (testing "test case 6600"
    (is (= (stemming "emanates") "eman"))))

(deftest test-6601
  (testing "test case 6601"
    (is (= (stemming "scriber") "scriber"))))

(deftest test-6602
  (testing "test case 6602"
    (is (= (stemming "postcard") "postcard"))))

(deftest test-6603
  (testing "test case 6603"
    (is (= (stemming "paints") "paint"))))

(deftest test-6604
  (testing "test case 6604"
    (is (= (stemming "incongruous") "incongru"))))

(deftest test-6605
  (testing "test case 6605"
    (is (= (stemming "unprincipled") "unprincipl"))))

(deftest test-6606
  (testing "test case 6606"
    (is (= (stemming "precognition") "precognit"))))

(deftest test-6607
  (testing "test case 6607"
    (is (= (stemming "extracurricular") "extracurricular"))))

(deftest test-6608
  (testing "test case 6608"
    (is (= (stemming "blurb") "blurb"))))

(deftest test-6609
  (testing "test case 6609"
    (is (= (stemming "augmented") "augment"))))

(deftest test-6610
  (testing "test case 6610"
    (is (= (stemming "demobilizations") "demobil"))))

(deftest test-6611
  (testing "test case 6611"
    (is (= (stemming "exotism") "exot"))))

(deftest test-6612
  (testing "test case 6612"
    (is (= (stemming "discontenting") "discont"))))

(deftest test-6613
  (testing "test case 6613"
    (is (= (stemming "ranched") "ranch"))))

(deftest test-6614
  (testing "test case 6614"
    (is (= (stemming "trivet") "trivet"))))

(deftest test-6615
  (testing "test case 6615"
    (is (= (stemming "plywood") "plywood"))))

(deftest test-6616
  (testing "test case 6616"
    (is (= (stemming "unlatch") "unlatch"))))

(deftest test-6617
  (testing "test case 6617"
    (is (= (stemming "mistreated") "mistreat"))))

(deftest test-6618
  (testing "test case 6618"
    (is (= (stemming "birchers") "bircher"))))

(deftest test-6619
  (testing "test case 6619"
    (is (= (stemming "suspect") "suspect"))))

(deftest test-6620
  (testing "test case 6620"
    (is (= (stemming "grimaces") "grimac"))))

(deftest test-6621
  (testing "test case 6621"
    (is (= (stemming "solidity") "solid"))))

(deftest test-6622
  (testing "test case 6622"
    (is (= (stemming "unleashes") "unleash"))))

(deftest test-6623
  (testing "test case 6623"
    (is (= (stemming "licensee") "license"))))

(deftest test-6624
  (testing "test case 6624"
    (is (= (stemming "trombones") "trombon"))))

(deftest test-6625
  (testing "test case 6625"
    (is (= (stemming "dealership") "dealership"))))

(deftest test-6626
  (testing "test case 6626"
    (is (= (stemming "amylase") "amylas"))))

(deftest test-6627
  (testing "test case 6627"
    (is (= (stemming "orientals") "orient"))))

(deftest test-6628
  (testing "test case 6628"
    (is (= (stemming "coequal") "coequal"))))

(deftest test-6629
  (testing "test case 6629"
    (is (= (stemming "remandment") "remand"))))

(deftest test-6630
  (testing "test case 6630"
    (is (= (stemming "blazer") "blazer"))))

(deftest test-6631
  (testing "test case 6631"
    (is (= (stemming "candelabra") "candelabra"))))

(deftest test-6632
  (testing "test case 6632"
    (is (= (stemming "dredging") "dredg"))))

(deftest test-6633
  (testing "test case 6633"
    (is (= (stemming "prevocational") "prevoc"))))

(deftest test-6634
  (testing "test case 6634"
    (is (= (stemming "klaxons") "klaxon"))))

(deftest test-6635
  (testing "test case 6635"
    (is (= (stemming "scampered") "scamper"))))

(deftest test-6636
  (testing "test case 6636"
    (is (= (stemming "fakery") "fakeri"))))

(deftest test-6637
  (testing "test case 6637"
    (is (= (stemming "joyed") "joi"))))

(deftest test-6638
  (testing "test case 6638"
    (is (= (stemming "hotkey") "hotkei"))))

(deftest test-6639
  (testing "test case 6639"
    (is (= (stemming "fantasie") "fantasi"))))

(deftest test-6640
  (testing "test case 6640"
    (is (= (stemming "cadenzas") "cadenza"))))

(deftest test-6641
  (testing "test case 6641"
    (is (= (stemming "centralism") "central"))))

(deftest test-6642
  (testing "test case 6642"
    (is (= (stemming "carpel") "carpel"))))

(deftest test-6643
  (testing "test case 6643"
    (is (= (stemming "childing") "child"))))

(deftest test-6644
  (testing "test case 6644"
    (is (= (stemming "alliteratively") "allit"))))

(deftest test-6645
  (testing "test case 6645"
    (is (= (stemming "jose") "jose"))))

(deftest test-6646
  (testing "test case 6646"
    (is (= (stemming "bluesy") "bluesi"))))

(deftest test-6647
  (testing "test case 6647"
    (is (= (stemming "biggies") "biggi"))))

(deftest test-6648
  (testing "test case 6648"
    (is (= (stemming "canonist") "canonist"))))

(deftest test-6649
  (testing "test case 6649"
    (is (= (stemming "sounders") "sounder"))))

(deftest test-6650
  (testing "test case 6650"
    (is (= (stemming "sausages") "sausag"))))

(deftest test-6651
  (testing "test case 6651"
    (is (= (stemming "cans") "can"))))

(deftest test-6652
  (testing "test case 6652"
    (is (= (stemming "trashier") "trashier"))))

(deftest test-6653
  (testing "test case 6653"
    (is (= (stemming "toadstool") "toadstool"))))

(deftest test-6654
  (testing "test case 6654"
    (is (= (stemming "severs") "sever"))))

(deftest test-6655
  (testing "test case 6655"
    (is (= (stemming "unsolvable") "unsolv"))))

(deftest test-6656
  (testing "test case 6656"
    (is (= (stemming "diffusely") "diffus"))))

(deftest test-6657
  (testing "test case 6657"
    (is (= (stemming "planes") "plane"))))

(deftest test-6658
  (testing "test case 6658"
    (is (= (stemming "forbears") "forbear"))))

(deftest test-6659
  (testing "test case 6659"
    (is (= (stemming "decimal") "decim"))))

(deftest test-6660
  (testing "test case 6660"
    (is (= (stemming "yarrows") "yarrow"))))

(deftest test-6661
  (testing "test case 6661"
    (is (= (stemming "bloomers") "bloomer"))))

(deftest test-6662
  (testing "test case 6662"
    (is (= (stemming "meliorating") "melior"))))

(deftest test-6663
  (testing "test case 6663"
    (is (= (stemming "primitively") "primit"))))

(deftest test-6664
  (testing "test case 6664"
    (is (= (stemming "coauthors") "coauthor"))))

(deftest test-6665
  (testing "test case 6665"
    (is (= (stemming "enlistee") "enliste"))))

(deftest test-6666
  (testing "test case 6666"
    (is (= (stemming "stucco") "stucco"))))

(deftest test-6667
  (testing "test case 6667"
    (is (= (stemming "dawned") "dawn"))))

(deftest test-6668
  (testing "test case 6668"
    (is (= (stemming "carminatives") "carmin"))))

(deftest test-6669
  (testing "test case 6669"
    (is (= (stemming "tropes") "trope"))))

(deftest test-6670
  (testing "test case 6670"
    (is (= (stemming "multidimensional") "multidimension"))))

(deftest test-6671
  (testing "test case 6671"
    (is (= (stemming "pollster") "pollster"))))

(deftest test-6672
  (testing "test case 6672"
    (is (= (stemming "lesson") "lesson"))))

(deftest test-6673
  (testing "test case 6673"
    (is (= (stemming "sonorant") "sonor"))))

(deftest test-6674
  (testing "test case 6674"
    (is (= (stemming "revetting") "revet"))))

(deftest test-6675
  (testing "test case 6675"
    (is (= (stemming "chromosomal") "chromosom"))))

(deftest test-6676
  (testing "test case 6676"
    (is (= (stemming "shackling") "shackl"))))

(deftest test-6677
  (testing "test case 6677"
    (is (= (stemming "chillest") "chillest"))))

(deftest test-6678
  (testing "test case 6678"
    (is (= (stemming "barged") "barg"))))

(deftest test-6679
  (testing "test case 6679"
    (is (= (stemming "shipper") "shipper"))))

(deftest test-6680
  (testing "test case 6680"
    (is (= (stemming "appraise") "apprais"))))

(deftest test-6681
  (testing "test case 6681"
    (is (= (stemming "rebelling") "rebel"))))

(deftest test-6682
  (testing "test case 6682"
    (is (= (stemming "kolas") "kola"))))

(deftest test-6683
  (testing "test case 6683"
    (is (= (stemming "vented") "vent"))))

(deftest test-6684
  (testing "test case 6684"
    (is (= (stemming "disorientation") "disorient"))))

(deftest test-6685
  (testing "test case 6685"
    (is (= (stemming "manlier") "manlier"))))

(deftest test-6686
  (testing "test case 6686"
    (is (= (stemming "hights") "hight"))))

(deftest test-6687
  (testing "test case 6687"
    (is (= (stemming "fallowed") "fallow"))))

(deftest test-6688
  (testing "test case 6688"
    (is (= (stemming "flowerer") "flower"))))

(deftest test-6689
  (testing "test case 6689"
    (is (= (stemming "oysterwoman") "oysterwoman"))))

(deftest test-6690
  (testing "test case 6690"
    (is (= (stemming "subordinating") "subordin"))))

(deftest test-6691
  (testing "test case 6691"
    (is (= (stemming "reasoned") "reason"))))

(deftest test-6692
  (testing "test case 6692"
    (is (= (stemming "uncoupling") "uncoupl"))))

(deftest test-6693
  (testing "test case 6693"
    (is (= (stemming "bonder") "bonder"))))

(deftest test-6694
  (testing "test case 6694"
    (is (= (stemming "indignant") "indign"))))

(deftest test-6695
  (testing "test case 6695"
    (is (= (stemming "hankerings") "hanker"))))

(deftest test-6696
  (testing "test case 6696"
    (is (= (stemming "earthmoving") "earthmov"))))

(deftest test-6697
  (testing "test case 6697"
    (is (= (stemming "copyright") "copyright"))))

(deftest test-6698
  (testing "test case 6698"
    (is (= (stemming "integrally") "integr"))))

(deftest test-6699
  (testing "test case 6699"
    (is (= (stemming "maternity") "matern"))))

(deftest test-6700
  (testing "test case 6700"
    (is (= (stemming "hyperpituitary") "hyperpituitari"))))

(deftest test-6701
  (testing "test case 6701"
    (is (= (stemming "izzard") "izzard"))))

(deftest test-6702
  (testing "test case 6702"
    (is (= (stemming "acknowledgedly") "acknowledgedli"))))

(deftest test-6703
  (testing "test case 6703"
    (is (= (stemming "amerism") "amer"))))

(deftest test-6704
  (testing "test case 6704"
    (is (= (stemming "belligerents") "belliger"))))

(deftest test-6705
  (testing "test case 6705"
    (is (= (stemming "anguished") "anguish"))))

(deftest test-6706
  (testing "test case 6706"
    (is (= (stemming "bobbers") "bobber"))))

(deftest test-6707
  (testing "test case 6707"
    (is (= (stemming "snoot") "snoot"))))

(deftest test-6708
  (testing "test case 6708"
    (is (= (stemming "scurfier") "scurfier"))))

(deftest test-6709
  (testing "test case 6709"
    (is (= (stemming "wordless") "wordless"))))

(deftest test-6710
  (testing "test case 6710"
    (is (= (stemming "oasts") "oast"))))

(deftest test-6711
  (testing "test case 6711"
    (is (= (stemming "abandons") "abandon"))))

(deftest test-6712
  (testing "test case 6712"
    (is (= (stemming "darkish") "darkish"))))

(deftest test-6713
  (testing "test case 6713"
    (is (= (stemming "actuating") "actuat"))))

(deftest test-6714
  (testing "test case 6714"
    (is (= (stemming "rebelliously") "rebelli"))))

(deftest test-6715
  (testing "test case 6715"
    (is (= (stemming "verbid") "verbid"))))

(deftest test-6716
  (testing "test case 6716"
    (is (= (stemming "elvishly") "elvishli"))))

(deftest test-6717
  (testing "test case 6717"
    (is (= (stemming "chummily") "chummili"))))

(deftest test-6718
  (testing "test case 6718"
    (is (= (stemming "glorify") "glorifi"))))

(deftest test-6719
  (testing "test case 6719"
    (is (= (stemming "psychiatrically") "psychiatr"))))

(deftest test-6720
  (testing "test case 6720"
    (is (= (stemming "cobbled") "cobbl"))))

(deftest test-6721
  (testing "test case 6721"
    (is (= (stemming "retelling") "retel"))))

(deftest test-6722
  (testing "test case 6722"
    (is (= (stemming "befell") "befel"))))

(deftest test-6723
  (testing "test case 6723"
    (is (= (stemming "assaultive") "assault"))))

(deftest test-6724
  (testing "test case 6724"
    (is (= (stemming "sate") "sate"))))

(deftest test-6725
  (testing "test case 6725"
    (is (= (stemming "legerdemain") "legerdemain"))))

(deftest test-6726
  (testing "test case 6726"
    (is (= (stemming "reexperience") "reexperi"))))

(deftest test-6727
  (testing "test case 6727"
    (is (= (stemming "shortness") "short"))))

(deftest test-6728
  (testing "test case 6728"
    (is (= (stemming "zoning") "zone"))))

(deftest test-6729
  (testing "test case 6729"
    (is (= (stemming "irreligious") "irreligi"))))

(deftest test-6730
  (testing "test case 6730"
    (is (= (stemming "saline") "salin"))))

(deftest test-6731
  (testing "test case 6731"
    (is (= (stemming "twinnings") "twin"))))

(deftest test-6732
  (testing "test case 6732"
    (is (= (stemming "nonforfeitures") "nonforfeitur"))))

(deftest test-6733
  (testing "test case 6733"
    (is (= (stemming "suppurations") "suppur"))))

(deftest test-6734
  (testing "test case 6734"
    (is (= (stemming "corning") "corn"))))

(deftest test-6735
  (testing "test case 6735"
    (is (= (stemming "accompanies") "accompani"))))

(deftest test-6736
  (testing "test case 6736"
    (is (= (stemming "expected") "expect"))))

(deftest test-6737
  (testing "test case 6737"
    (is (= (stemming "hispanics") "hispan"))))

(deftest test-6738
  (testing "test case 6738"
    (is (= (stemming "sociopathy") "sociopathi"))))

(deftest test-6739
  (testing "test case 6739"
    (is (= (stemming "stoa") "stoa"))))

(deftest test-6740
  (testing "test case 6740"
    (is (= (stemming "designing") "design"))))

(deftest test-6741
  (testing "test case 6741"
    (is (= (stemming "nasally") "nasal"))))

(deftest test-6742
  (testing "test case 6742"
    (is (= (stemming "telly") "telli"))))

(deftest test-6743
  (testing "test case 6743"
    (is (= (stemming "overstatement") "overstat"))))

(deftest test-6744
  (testing "test case 6744"
    (is (= (stemming "truncated") "truncat"))))

(deftest test-6745
  (testing "test case 6745"
    (is (= (stemming "ecological") "ecolog"))))

(deftest test-6746
  (testing "test case 6746"
    (is (= (stemming "torches") "torch"))))

(deftest test-6747
  (testing "test case 6747"
    (is (= (stemming "aliner") "alin"))))

(deftest test-6748
  (testing "test case 6748"
    (is (= (stemming "recapturing") "recaptur"))))

(deftest test-6749
  (testing "test case 6749"
    (is (= (stemming "swifter") "swifter"))))

(deftest test-6750
  (testing "test case 6750"
    (is (= (stemming "gunfighter") "gunfight"))))

(deftest test-6751
  (testing "test case 6751"
    (is (= (stemming "monish") "monish"))))

(deftest test-6752
  (testing "test case 6752"
    (is (= (stemming "harmonics") "harmon"))))

(deftest test-6753
  (testing "test case 6753"
    (is (= (stemming "immaterialness") "immateri"))))

(deftest test-6754
  (testing "test case 6754"
    (is (= (stemming "beamless") "beamless"))))

(deftest test-6755
  (testing "test case 6755"
    (is (= (stemming "unstoppable") "unstopp"))))

(deftest test-6756
  (testing "test case 6756"
    (is (= (stemming "soapstone") "soapston"))))

(deftest test-6757
  (testing "test case 6757"
    (is (= (stemming "gainfulness") "gain"))))

(deftest test-6758
  (testing "test case 6758"
    (is (= (stemming "bookkeeper") "bookkeep"))))

(deftest test-6759
  (testing "test case 6759"
    (is (= (stemming "affluent") "affluent"))))

(deftest test-6760
  (testing "test case 6760"
    (is (= (stemming "cooper") "cooper"))))

(deftest test-6761
  (testing "test case 6761"
    (is (= (stemming "bushing") "bush"))))

(deftest test-6762
  (testing "test case 6762"
    (is (= (stemming "escapees") "escape"))))

(deftest test-6763
  (testing "test case 6763"
    (is (= (stemming "oxidized") "oxid"))))

(deftest test-6764
  (testing "test case 6764"
    (is (= (stemming "warships") "warship"))))

(deftest test-6765
  (testing "test case 6765"
    (is (= (stemming "closemouthed") "closemouth"))))

(deftest test-6766
  (testing "test case 6766"
    (is (= (stemming "perfectability") "perfect"))))

(deftest test-6767
  (testing "test case 6767"
    (is (= (stemming "cybernetically") "cybernet"))))

(deftest test-6768
  (testing "test case 6768"
    (is (= (stemming "wearers") "wearer"))))

(deftest test-6769
  (testing "test case 6769"
    (is (= (stemming "relationship") "relationship"))))

(deftest test-6770
  (testing "test case 6770"
    (is (= (stemming "microclimates") "microclim"))))

(deftest test-6771
  (testing "test case 6771"
    (is (= (stemming "uproar") "uproar"))))

(deftest test-6772
  (testing "test case 6772"
    (is (= (stemming "caymans") "cayman"))))

(deftest test-6773
  (testing "test case 6773"
    (is (= (stemming "bobbins") "bobbin"))))

(deftest test-6774
  (testing "test case 6774"
    (is (= (stemming "geared") "gear"))))

(deftest test-6775
  (testing "test case 6775"
    (is (= (stemming "unpunished") "unpunish"))))

(deftest test-6776
  (testing "test case 6776"
    (is (= (stemming "fashionable") "fashion"))))

(deftest test-6777
  (testing "test case 6777"
    (is (= (stemming "churchless") "churchless"))))

(deftest test-6778
  (testing "test case 6778"
    (is (= (stemming "unuttered") "unutt"))))

(deftest test-6779
  (testing "test case 6779"
    (is (= (stemming "morassy") "morassi"))))

(deftest test-6780
  (testing "test case 6780"
    (is (= (stemming "lunacy") "lunaci"))))

(deftest test-6781
  (testing "test case 6781"
    (is (= (stemming "mathematical") "mathemat"))))

(deftest test-6782
  (testing "test case 6782"
    (is (= (stemming "duplexing") "duplex"))))

(deftest test-6783
  (testing "test case 6783"
    (is (= (stemming "splenic") "splenic"))))

(deftest test-6784
  (testing "test case 6784"
    (is (= (stemming "diplomatist") "diplomatist"))))

(deftest test-6785
  (testing "test case 6785"
    (is (= (stemming "parallels") "parallel"))))

(deftest test-6786
  (testing "test case 6786"
    (is (= (stemming "grubbiness") "grubbi"))))

(deftest test-6787
  (testing "test case 6787"
    (is (= (stemming "defog") "defog"))))

(deftest test-6788
  (testing "test case 6788"
    (is (= (stemming "infringes") "infring"))))

(deftest test-6789
  (testing "test case 6789"
    (is (= (stemming "despitefully") "despitefulli"))))

(deftest test-6790
  (testing "test case 6790"
    (is (= (stemming "ambushed") "ambush"))))

(deftest test-6791
  (testing "test case 6791"
    (is (= (stemming "catling") "catl"))))

(deftest test-6792
  (testing "test case 6792"
    (is (= (stemming "repack") "repack"))))

(deftest test-6793
  (testing "test case 6793"
    (is (= (stemming "titration") "titrat"))))

(deftest test-6794
  (testing "test case 6794"
    (is (= (stemming "chuckler") "chuckler"))))

(deftest test-6795
  (testing "test case 6795"
    (is (= (stemming "pigeon") "pigeon"))))

(deftest test-6796
  (testing "test case 6796"
    (is (= (stemming "noncom") "noncom"))))

(deftest test-6797
  (testing "test case 6797"
    (is (= (stemming "geckos") "gecko"))))

(deftest test-6798
  (testing "test case 6798"
    (is (= (stemming "yanking") "yank"))))

(deftest test-6799
  (testing "test case 6799"
    (is (= (stemming "properer") "proper"))))

(deftest test-6800
  (testing "test case 6800"
    (is (= (stemming "calipering") "calip"))))

(deftest test-6801
  (testing "test case 6801"
    (is (= (stemming "withier") "withier"))))

(deftest test-6802
  (testing "test case 6802"
    (is (= (stemming "deactivating") "deactiv"))))

(deftest test-6803
  (testing "test case 6803"
    (is (= (stemming "holdup") "holdup"))))

(deftest test-6804
  (testing "test case 6804"
    (is (= (stemming "assayers") "assay"))))

(deftest test-6805
  (testing "test case 6805"
    (is (= (stemming "mousing") "mous"))))

(deftest test-6806
  (testing "test case 6806"
    (is (= (stemming "plussages") "plussag"))))

(deftest test-6807
  (testing "test case 6807"
    (is (= (stemming "turbidness") "turbid"))))

(deftest test-6808
  (testing "test case 6808"
    (is (= (stemming "ridder") "ridder"))))

(deftest test-6809
  (testing "test case 6809"
    (is (= (stemming "battle") "battl"))))

(deftest test-6810
  (testing "test case 6810"
    (is (= (stemming "exigent") "exig"))))

(deftest test-6811
  (testing "test case 6811"
    (is (= (stemming "noninstitutional") "noninstitut"))))

(deftest test-6812
  (testing "test case 6812"
    (is (= (stemming "barbarizes") "barbar"))))

(deftest test-6813
  (testing "test case 6813"
    (is (= (stemming "chaffers") "chaffer"))))

(deftest test-6814
  (testing "test case 6814"
    (is (= (stemming "netsukes") "netsuk"))))

(deftest test-6815
  (testing "test case 6815"
    (is (= (stemming "absences") "absenc"))))

(deftest test-6816
  (testing "test case 6816"
    (is (= (stemming "luncheons") "luncheon"))))

(deftest test-6817
  (testing "test case 6817"
    (is (= (stemming "denouncement") "denounc"))))

(deftest test-6818
  (testing "test case 6818"
    (is (= (stemming "alcoves") "alcov"))))

(deftest test-6819
  (testing "test case 6819"
    (is (= (stemming "auxin") "auxin"))))

(deftest test-6820
  (testing "test case 6820"
    (is (= (stemming "sibs") "sib"))))

(deftest test-6821
  (testing "test case 6821"
    (is (= (stemming "shooter") "shooter"))))

(deftest test-6822
  (testing "test case 6822"
    (is (= (stemming "subfloors") "subfloor"))))

(deftest test-6823
  (testing "test case 6823"
    (is (= (stemming "reassuming") "reassum"))))

(deftest test-6824
  (testing "test case 6824"
    (is (= (stemming "quadruplicates") "quadrupl"))))

(deftest test-6825
  (testing "test case 6825"
    (is (= (stemming "earthworm") "earthworm"))))

(deftest test-6826
  (testing "test case 6826"
    (is (= (stemming "sashayed") "sashai"))))

(deftest test-6827
  (testing "test case 6827"
    (is (= (stemming "gamiest") "gamiest"))))

(deftest test-6828
  (testing "test case 6828"
    (is (= (stemming "osmosed") "osmos"))))

(deftest test-6829
  (testing "test case 6829"
    (is (= (stemming "minicar") "minicar"))))

(deftest test-6830
  (testing "test case 6830"
    (is (= (stemming "indianians") "indianian"))))

(deftest test-6831
  (testing "test case 6831"
    (is (= (stemming "crispness") "crisp"))))

(deftest test-6832
  (testing "test case 6832"
    (is (= (stemming "designer") "design"))))

(deftest test-6833
  (testing "test case 6833"
    (is (= (stemming "doorplate") "doorplat"))))

(deftest test-6834
  (testing "test case 6834"
    (is (= (stemming "encomium") "encomium"))))

(deftest test-6835
  (testing "test case 6835"
    (is (= (stemming "recompenses") "recompens"))))

(deftest test-6836
  (testing "test case 6836"
    (is (= (stemming "traceably") "traceabl"))))

(deftest test-6837
  (testing "test case 6837"
    (is (= (stemming "swastika") "swastika"))))

(deftest test-6838
  (testing "test case 6838"
    (is (= (stemming "pelvis") "pelvi"))))

(deftest test-6839
  (testing "test case 6839"
    (is (= (stemming "lemon") "lemon"))))

(deftest test-6840
  (testing "test case 6840"
    (is (= (stemming "fanaticism") "fanatic"))))

(deftest test-6841
  (testing "test case 6841"
    (is (= (stemming "gem") "gem"))))

(deftest test-6842
  (testing "test case 6842"
    (is (= (stemming "artily") "artili"))))

(deftest test-6843
  (testing "test case 6843"
    (is (= (stemming "robes") "robe"))))

(deftest test-6844
  (testing "test case 6844"
    (is (= (stemming "misnumbers") "misnumb"))))

(deftest test-6845
  (testing "test case 6845"
    (is (= (stemming "seventeen") "seventeen"))))

(deftest test-6846
  (testing "test case 6846"
    (is (= (stemming "climates") "climat"))))

(deftest test-6847
  (testing "test case 6847"
    (is (= (stemming "alcaldes") "alcald"))))

(deftest test-6848
  (testing "test case 6848"
    (is (= (stemming "dryer") "dryer"))))

(deftest test-6849
  (testing "test case 6849"
    (is (= (stemming "geophysics") "geophys"))))

(deftest test-6850
  (testing "test case 6850"
    (is (= (stemming "atwain") "atwain"))))

(deftest test-6851
  (testing "test case 6851"
    (is (= (stemming "multitudinous") "multitudin"))))

(deftest test-6852
  (testing "test case 6852"
    (is (= (stemming "goldest") "goldest"))))

(deftest test-6853
  (testing "test case 6853"
    (is (= (stemming "allegorical") "allegor"))))

(deftest test-6854
  (testing "test case 6854"
    (is (= (stemming "quem") "quem"))))

(deftest test-6855
  (testing "test case 6855"
    (is (= (stemming "airmobile") "airmobil"))))

(deftest test-6856
  (testing "test case 6856"
    (is (= (stemming "reproved") "reprov"))))

(deftest test-6857
  (testing "test case 6857"
    (is (= (stemming "leucoma") "leucoma"))))

(deftest test-6858
  (testing "test case 6858"
    (is (= (stemming "loungers") "lounger"))))

(deftest test-6859
  (testing "test case 6859"
    (is (= (stemming "blintz") "blintz"))))

(deftest test-6860
  (testing "test case 6860"
    (is (= (stemming "skewing") "skew"))))

(deftest test-6861
  (testing "test case 6861"
    (is (= (stemming "dowel") "dowel"))))

(deftest test-6862
  (testing "test case 6862"
    (is (= (stemming "quinins") "quinin"))))

(deftest test-6863
  (testing "test case 6863"
    (is (= (stemming "interrelationship") "interrelationship"))))

(deftest test-6864
  (testing "test case 6864"
    (is (= (stemming "waspier") "waspier"))))

(deftest test-6865
  (testing "test case 6865"
    (is (= (stemming "gills") "gill"))))

(deftest test-6866
  (testing "test case 6866"
    (is (= (stemming "shoveler") "shovel"))))

(deftest test-6867
  (testing "test case 6867"
    (is (= (stemming "crossroads") "crossroad"))))

(deftest test-6868
  (testing "test case 6868"
    (is (= (stemming "thurifer") "thurif"))))

(deftest test-6869
  (testing "test case 6869"
    (is (= (stemming "clay") "clai"))))

(deftest test-6870
  (testing "test case 6870"
    (is (= (stemming "misapprehension") "misapprehens"))))

(deftest test-6871
  (testing "test case 6871"
    (is (= (stemming "masochism") "masoch"))))

(deftest test-6872
  (testing "test case 6872"
    (is (= (stemming "immobility") "immobl"))))

(deftest test-6873
  (testing "test case 6873"
    (is (= (stemming "ablative") "abl"))))

(deftest test-6874
  (testing "test case 6874"
    (is (= (stemming "fixer") "fixer"))))

(deftest test-6875
  (testing "test case 6875"
    (is (= (stemming "overindulges") "overindulg"))))

(deftest test-6876
  (testing "test case 6876"
    (is (= (stemming "murders") "murder"))))

(deftest test-6877
  (testing "test case 6877"
    (is (= (stemming "cowhands") "cowhand"))))

(deftest test-6878
  (testing "test case 6878"
    (is (= (stemming "inceptors") "inceptor"))))

(deftest test-6879
  (testing "test case 6879"
    (is (= (stemming "rumrunner") "rumrunn"))))

(deftest test-6880
  (testing "test case 6880"
    (is (= (stemming "appealable") "appeal"))))

(deftest test-6881
  (testing "test case 6881"
    (is (= (stemming "blamable") "blamabl"))))

(deftest test-6882
  (testing "test case 6882"
    (is (= (stemming "modernism") "modern"))))

(deftest test-6883
  (testing "test case 6883"
    (is (= (stemming "pica") "pica"))))

(deftest test-6884
  (testing "test case 6884"
    (is (= (stemming "snored") "snore"))))

(deftest test-6885
  (testing "test case 6885"
    (is (= (stemming "metaphase") "metaphas"))))

(deftest test-6886
  (testing "test case 6886"
    (is (= (stemming "squaws") "squaw"))))

(deftest test-6887
  (testing "test case 6887"
    (is (= (stemming "anadems") "anadem"))))

(deftest test-6888
  (testing "test case 6888"
    (is (= (stemming "metastases") "metastas"))))

(deftest test-6889
  (testing "test case 6889"
    (is (= (stemming "dayroom") "dayroom"))))

(deftest test-6890
  (testing "test case 6890"
    (is (= (stemming "hypnoidal") "hypnoid"))))

(deftest test-6891
  (testing "test case 6891"
    (is (= (stemming "microseconds") "microsecond"))))

(deftest test-6892
  (testing "test case 6892"
    (is (= (stemming "flatcar") "flatcar"))))

(deftest test-6893
  (testing "test case 6893"
    (is (= (stemming "downlinked") "downlink"))))

(deftest test-6894
  (testing "test case 6894"
    (is (= (stemming "pilate") "pilat"))))

(deftest test-6895
  (testing "test case 6895"
    (is (= (stemming "tolls") "toll"))))

(deftest test-6896
  (testing "test case 6896"
    (is (= (stemming "motorize") "motor"))))

(deftest test-6897
  (testing "test case 6897"
    (is (= (stemming "menarches") "menarch"))))

(deftest test-6898
  (testing "test case 6898"
    (is (= (stemming "tossing") "toss"))))

(deftest test-6899
  (testing "test case 6899"
    (is (= (stemming "potentate") "potent"))))

(deftest test-6900
  (testing "test case 6900"
    (is (= (stemming "multistage") "multistag"))))

(deftest test-6901
  (testing "test case 6901"
    (is (= (stemming "pallbearers") "pallbear"))))

(deftest test-6902
  (testing "test case 6902"
    (is (= (stemming "iciest") "iciest"))))

(deftest test-6903
  (testing "test case 6903"
    (is (= (stemming "francas") "franca"))))

(deftest test-6904
  (testing "test case 6904"
    (is (= (stemming "wads") "wad"))))

(deftest test-6905
  (testing "test case 6905"
    (is (= (stemming "reoccupy") "reoccupi"))))

(deftest test-6906
  (testing "test case 6906"
    (is (= (stemming "narwals") "narwal"))))

(deftest test-6907
  (testing "test case 6907"
    (is (= (stemming "mannerless") "mannerless"))))

(deftest test-6908
  (testing "test case 6908"
    (is (= (stemming "reeky") "reeki"))))

(deftest test-6909
  (testing "test case 6909"
    (is (= (stemming "foreshortened") "foreshorten"))))

(deftest test-6910
  (testing "test case 6910"
    (is (= (stemming "gawkies") "gawki"))))

(deftest test-6911
  (testing "test case 6911"
    (is (= (stemming "malingerer") "malinger"))))

(deftest test-6912
  (testing "test case 6912"
    (is (= (stemming "numerously") "numer"))))

(deftest test-6913
  (testing "test case 6913"
    (is (= (stemming "entrenching") "entrench"))))

(deftest test-6914
  (testing "test case 6914"
    (is (= (stemming "coquettishly") "coquettishli"))))

(deftest test-6915
  (testing "test case 6915"
    (is (= (stemming "contemplatively") "contempl"))))

(deftest test-6916
  (testing "test case 6916"
    (is (= (stemming "praises") "prais"))))

(deftest test-6917
  (testing "test case 6917"
    (is (= (stemming "engagers") "engag"))))

(deftest test-6918
  (testing "test case 6918"
    (is (= (stemming "oxalises") "oxalis"))))

(deftest test-6919
  (testing "test case 6919"
    (is (= (stemming "sunlight") "sunlight"))))

(deftest test-6920
  (testing "test case 6920"
    (is (= (stemming "resoled") "resol"))))

(deftest test-6921
  (testing "test case 6921"
    (is (= (stemming "compulsory") "compulsori"))))

(deftest test-6922
  (testing "test case 6922"
    (is (= (stemming "alii") "alii"))))

(deftest test-6923
  (testing "test case 6923"
    (is (= (stemming "ruinates") "ruinat"))))

(deftest test-6924
  (testing "test case 6924"
    (is (= (stemming "gladly") "gladli"))))

(deftest test-6925
  (testing "test case 6925"
    (is (= (stemming "scald") "scald"))))

(deftest test-6926
  (testing "test case 6926"
    (is (= (stemming "emeries") "emeri"))))

(deftest test-6927
  (testing "test case 6927"
    (is (= (stemming "riposting") "ripost"))))

(deftest test-6928
  (testing "test case 6928"
    (is (= (stemming "critturs") "crittur"))))

(deftest test-6929
  (testing "test case 6929"
    (is (= (stemming "welsh") "welsh"))))

(deftest test-6930
  (testing "test case 6930"
    (is (= (stemming "complainant") "complain"))))

(deftest test-6931
  (testing "test case 6931"
    (is (= (stemming "advances") "advanc"))))

(deftest test-6932
  (testing "test case 6932"
    (is (= (stemming "waved") "wave"))))

(deftest test-6933
  (testing "test case 6933"
    (is (= (stemming "sweepings") "sweep"))))

(deftest test-6934
  (testing "test case 6934"
    (is (= (stemming "literati") "literati"))))

(deftest test-6935
  (testing "test case 6935"
    (is (= (stemming "suffusing") "suffus"))))

(deftest test-6936
  (testing "test case 6936"
    (is (= (stemming "alkalizes") "alkal"))))

(deftest test-6937
  (testing "test case 6937"
    (is (= (stemming "delis") "deli"))))

(deftest test-6938
  (testing "test case 6938"
    (is (= (stemming "designates") "design"))))

(deftest test-6939
  (testing "test case 6939"
    (is (= (stemming "as") "as"))))

(deftest test-6940
  (testing "test case 6940"
    (is (= (stemming "impetuous") "impetu"))))

(deftest test-6941
  (testing "test case 6941"
    (is (= (stemming "bravadoes") "bravado"))))

(deftest test-6942
  (testing "test case 6942"
    (is (= (stemming "clinkering") "clinker"))))

(deftest test-6943
  (testing "test case 6943"
    (is (= (stemming "fountain") "fountain"))))

(deftest test-6944
  (testing "test case 6944"
    (is (= (stemming "philtered") "philter"))))

(deftest test-6945
  (testing "test case 6945"
    (is (= (stemming "pseudopodium") "pseudopodium"))))

(deftest test-6946
  (testing "test case 6946"
    (is (= (stemming "schooner") "schooner"))))

(deftest test-6947
  (testing "test case 6947"
    (is (= (stemming "adductor") "adductor"))))

(deftest test-6948
  (testing "test case 6948"
    (is (= (stemming "illuminates") "illumin"))))

(deftest test-6949
  (testing "test case 6949"
    (is (= (stemming "xanthates") "xanthat"))))

(deftest test-6950
  (testing "test case 6950"
    (is (= (stemming "gaudiest") "gaudiest"))))

(deftest test-6951
  (testing "test case 6951"
    (is (= (stemming "nonparliamentary") "nonparliamentari"))))

(deftest test-6952
  (testing "test case 6952"
    (is (= (stemming "revolt") "revolt"))))

(deftest test-6953
  (testing "test case 6953"
    (is (= (stemming "ravined") "ravin"))))

(deftest test-6954
  (testing "test case 6954"
    (is (= (stemming "alterative") "alter"))))

(deftest test-6955
  (testing "test case 6955"
    (is (= (stemming "veined") "vein"))))

(deftest test-6956
  (testing "test case 6956"
    (is (= (stemming "thereunder") "thereund"))))

(deftest test-6957
  (testing "test case 6957"
    (is (= (stemming "dowser") "dowser"))))

(deftest test-6958
  (testing "test case 6958"
    (is (= (stemming "temperateness") "temper"))))

(deftest test-6959
  (testing "test case 6959"
    (is (= (stemming "dx") "dx"))))

(deftest test-6960
  (testing "test case 6960"
    (is (= (stemming "gabfest") "gabfest"))))

(deftest test-6961
  (testing "test case 6961"
    (is (= (stemming "spyglass") "spyglass"))))

(deftest test-6962
  (testing "test case 6962"
    (is (= (stemming "paramours") "paramour"))))

(deftest test-6963
  (testing "test case 6963"
    (is (= (stemming "pedagogies") "pedagogi"))))

(deftest test-6964
  (testing "test case 6964"
    (is (= (stemming "interregnal") "interregn"))))

(deftest test-6965
  (testing "test case 6965"
    (is (= (stemming "pelleting") "pellet"))))

(deftest test-6966
  (testing "test case 6966"
    (is (= (stemming "venally") "venal"))))

(deftest test-6967
  (testing "test case 6967"
    (is (= (stemming "gonococcic") "gonococc"))))

(deftest test-6968
  (testing "test case 6968"
    (is (= (stemming "crosshatch") "crosshatch"))))

(deftest test-6969
  (testing "test case 6969"
    (is (= (stemming "mumped") "mump"))))

(deftest test-6970
  (testing "test case 6970"
    (is (= (stemming "offices") "offic"))))

(deftest test-6971
  (testing "test case 6971"
    (is (= (stemming "puritanical") "puritan"))))

(deftest test-6972
  (testing "test case 6972"
    (is (= (stemming "scourers") "scourer"))))

(deftest test-6973
  (testing "test case 6973"
    (is (= (stemming "thickens") "thicken"))))

(deftest test-6974
  (testing "test case 6974"
    (is (= (stemming "missourian") "missourian"))))

(deftest test-6975
  (testing "test case 6975"
    (is (= (stemming "prelates") "prelat"))))

(deftest test-6976
  (testing "test case 6976"
    (is (= (stemming "superfluously") "superflu"))))

(deftest test-6977
  (testing "test case 6977"
    (is (= (stemming "recommissions") "recommiss"))))

(deftest test-6978
  (testing "test case 6978"
    (is (= (stemming "pastorship") "pastorship"))))

(deftest test-6979
  (testing "test case 6979"
    (is (= (stemming "atomist") "atomist"))))

(deftest test-6980
  (testing "test case 6980"
    (is (= (stemming "apologizers") "apolog"))))

(deftest test-6981
  (testing "test case 6981"
    (is (= (stemming "fats") "fat"))))

(deftest test-6982
  (testing "test case 6982"
    (is (= (stemming "transgression") "transgress"))))

(deftest test-6983
  (testing "test case 6983"
    (is (= (stemming "trotter") "trotter"))))

(deftest test-6984
  (testing "test case 6984"
    (is (= (stemming "obsessor") "obsessor"))))

(deftest test-6985
  (testing "test case 6985"
    (is (= (stemming "eloquence") "eloqu"))))

(deftest test-6986
  (testing "test case 6986"
    (is (= (stemming "intellectualist") "intellectualist"))))

(deftest test-6987
  (testing "test case 6987"
    (is (= (stemming "overland") "overland"))))

(deftest test-6988
  (testing "test case 6988"
    (is (= (stemming "banco") "banco"))))

(deftest test-6989
  (testing "test case 6989"
    (is (= (stemming "phonomania") "phonomania"))))

(deftest test-6990
  (testing "test case 6990"
    (is (= (stemming "sojourn") "sojourn"))))

(deftest test-6991
  (testing "test case 6991"
    (is (= (stemming "commonable") "common"))))

(deftest test-6992
  (testing "test case 6992"
    (is (= (stemming "familiarization") "familiar"))))

(deftest test-6993
  (testing "test case 6993"
    (is (= (stemming "lithium") "lithium"))))

(deftest test-6994
  (testing "test case 6994"
    (is (= (stemming "logwood") "logwood"))))

(deftest test-6995
  (testing "test case 6995"
    (is (= (stemming "automobilist") "automobilist"))))

(deftest test-6996
  (testing "test case 6996"
    (is (= (stemming "blinds") "blind"))))

(deftest test-6997
  (testing "test case 6997"
    (is (= (stemming "preconditions") "precondit"))))

(deftest test-6998
  (testing "test case 6998"
    (is (= (stemming "savoriest") "savoriest"))))

(deftest test-6999
  (testing "test case 6999"
    (is (= (stemming "deter") "deter"))))

(deftest test-7000
  (testing "test case 7000"
    (is (= (stemming "amidic") "amid"))))

(deftest test-7001
  (testing "test case 7001"
    (is (= (stemming "rescuing") "rescu"))))

(deftest test-7002
  (testing "test case 7002"
    (is (= (stemming "athena") "athena"))))

(deftest test-7003
  (testing "test case 7003"
    (is (= (stemming "voluptuaries") "voluptuari"))))

(deftest test-7004
  (testing "test case 7004"
    (is (= (stemming "decals") "decal"))))

(deftest test-7005
  (testing "test case 7005"
    (is (= (stemming "outriggers") "outrigg"))))

(deftest test-7006
  (testing "test case 7006"
    (is (= (stemming "barbershops") "barbershop"))))

(deftest test-7007
  (testing "test case 7007"
    (is (= (stemming "snorer") "snorer"))))

(deftest test-7008
  (testing "test case 7008"
    (is (= (stemming "commix") "commix"))))

(deftest test-7009
  (testing "test case 7009"
    (is (= (stemming "sheepman") "sheepman"))))

(deftest test-7010
  (testing "test case 7010"
    (is (= (stemming "redcaps") "redcap"))))

(deftest test-7011
  (testing "test case 7011"
    (is (= (stemming "zinnias") "zinnia"))))

(deftest test-7012
  (testing "test case 7012"
    (is (= (stemming "seconded") "second"))))

(deftest test-7013
  (testing "test case 7013"
    (is (= (stemming "broodiest") "broodiest"))))

(deftest test-7014
  (testing "test case 7014"
    (is (= (stemming "eviction") "evict"))))

(deftest test-7015
  (testing "test case 7015"
    (is (= (stemming "meddles") "meddl"))))

(deftest test-7016
  (testing "test case 7016"
    (is (= (stemming "wattled") "wattl"))))

(deftest test-7017
  (testing "test case 7017"
    (is (= (stemming "misplays") "misplai"))))

(deftest test-7018
  (testing "test case 7018"
    (is (= (stemming "sanguines") "sanguin"))))

(deftest test-7019
  (testing "test case 7019"
    (is (= (stemming "hellene") "hellen"))))

(deftest test-7020
  (testing "test case 7020"
    (is (= (stemming "miniaturize") "miniatur"))))

(deftest test-7021
  (testing "test case 7021"
    (is (= (stemming "titanism") "titan"))))

(deftest test-7022
  (testing "test case 7022"
    (is (= (stemming "octopodes") "octopod"))))

(deftest test-7023
  (testing "test case 7023"
    (is (= (stemming "enwinding") "enwind"))))

(deftest test-7024
  (testing "test case 7024"
    (is (= (stemming "derm") "derm"))))

(deftest test-7025
  (testing "test case 7025"
    (is (= (stemming "drapes") "drape"))))

(deftest test-7026
  (testing "test case 7026"
    (is (= (stemming "irrigating") "irrig"))))

(deftest test-7027
  (testing "test case 7027"
    (is (= (stemming "interacted") "interact"))))

(deftest test-7028
  (testing "test case 7028"
    (is (= (stemming "japed") "jape"))))

(deftest test-7029
  (testing "test case 7029"
    (is (= (stemming "fens") "fen"))))

(deftest test-7030
  (testing "test case 7030"
    (is (= (stemming "shine") "shine"))))

(deftest test-7031
  (testing "test case 7031"
    (is (= (stemming "rearousing") "rearous"))))

(deftest test-7032
  (testing "test case 7032"
    (is (= (stemming "oubliettes") "oubliett"))))

(deftest test-7033
  (testing "test case 7033"
    (is (= (stemming "crossness") "cross"))))

(deftest test-7034
  (testing "test case 7034"
    (is (= (stemming "biotical") "biotic"))))

(deftest test-7035
  (testing "test case 7035"
    (is (= (stemming "besought") "besought"))))

(deftest test-7036
  (testing "test case 7036"
    (is (= (stemming "shopkeepers") "shopkeep"))))

(deftest test-7037
  (testing "test case 7037"
    (is (= (stemming "deaden") "deaden"))))

(deftest test-7038
  (testing "test case 7038"
    (is (= (stemming "sincerely") "sincer"))))

(deftest test-7039
  (testing "test case 7039"
    (is (= (stemming "nitres") "nitr"))))

(deftest test-7040
  (testing "test case 7040"
    (is (= (stemming "flings") "fling"))))

(deftest test-7041
  (testing "test case 7041"
    (is (= (stemming "couchings") "couch"))))

(deftest test-7042
  (testing "test case 7042"
    (is (= (stemming "mothproof") "mothproof"))))

(deftest test-7043
  (testing "test case 7043"
    (is (= (stemming "hemodialysis") "hemodialysi"))))

(deftest test-7044
  (testing "test case 7044"
    (is (= (stemming "inkling") "inkl"))))

(deftest test-7045
  (testing "test case 7045"
    (is (= (stemming "subsider") "subsid"))))

(deftest test-7046
  (testing "test case 7046"
    (is (= (stemming "suppresses") "suppress"))))

(deftest test-7047
  (testing "test case 7047"
    (is (= (stemming "woodpile") "woodpil"))))

(deftest test-7048
  (testing "test case 7048"
    (is (= (stemming "agonized") "agon"))))

(deftest test-7049
  (testing "test case 7049"
    (is (= (stemming "quarrying") "quarri"))))

(deftest test-7050
  (testing "test case 7050"
    (is (= (stemming "congratulation") "congratul"))))

(deftest test-7051
  (testing "test case 7051"
    (is (= (stemming "manege") "maneg"))))

(deftest test-7052
  (testing "test case 7052"
    (is (= (stemming "raucously") "raucous"))))

(deftest test-7053
  (testing "test case 7053"
    (is (= (stemming "sleepwalker") "sleepwalk"))))

(deftest test-7054
  (testing "test case 7054"
    (is (= (stemming "rehem") "rehem"))))

(deftest test-7055
  (testing "test case 7055"
    (is (= (stemming "rani") "rani"))))

(deftest test-7056
  (testing "test case 7056"
    (is (= (stemming "prorogued") "prorogu"))))

(deftest test-7057
  (testing "test case 7057"
    (is (= (stemming "analysis") "analysi"))))

(deftest test-7058
  (testing "test case 7058"
    (is (= (stemming "fiscals") "fiscal"))))

(deftest test-7059
  (testing "test case 7059"
    (is (= (stemming "guildhall") "guildhal"))))

(deftest test-7060
  (testing "test case 7060"
    (is (= (stemming "maltreat") "maltreat"))))

(deftest test-7061
  (testing "test case 7061"
    (is (= (stemming "humorlessness") "humorless"))))

(deftest test-7062
  (testing "test case 7062"
    (is (= (stemming "manipulatable") "manipulat"))))

(deftest test-7063
  (testing "test case 7063"
    (is (= (stemming "trainmaster") "trainmast"))))

(deftest test-7064
  (testing "test case 7064"
    (is (= (stemming "sheepfolds") "sheepfold"))))

(deftest test-7065
  (testing "test case 7065"
    (is (= (stemming "wheezers") "wheezer"))))

(deftest test-7066
  (testing "test case 7066"
    (is (= (stemming "untarnished") "untarnish"))))

(deftest test-7067
  (testing "test case 7067"
    (is (= (stemming "tablas") "tabla"))))

(deftest test-7068
  (testing "test case 7068"
    (is (= (stemming "flooring") "floor"))))

(deftest test-7069
  (testing "test case 7069"
    (is (= (stemming "regressed") "regress"))))

(deftest test-7070
  (testing "test case 7070"
    (is (= (stemming "loom") "loom"))))

(deftest test-7071
  (testing "test case 7071"
    (is (= (stemming "plunkers") "plunker"))))

(deftest test-7072
  (testing "test case 7072"
    (is (= (stemming "surchargers") "surcharg"))))

(deftest test-7073
  (testing "test case 7073"
    (is (= (stemming "pups") "pup"))))

(deftest test-7074
  (testing "test case 7074"
    (is (= (stemming "mimetic") "mimet"))))

(deftest test-7075
  (testing "test case 7075"
    (is (= (stemming "bestrew") "bestrew"))))

(deftest test-7076
  (testing "test case 7076"
    (is (= (stemming "stealthy") "stealthi"))))

(deftest test-7077
  (testing "test case 7077"
    (is (= (stemming "bootlicked") "bootlick"))))

(deftest test-7078
  (testing "test case 7078"
    (is (= (stemming "armour") "armour"))))

(deftest test-7079
  (testing "test case 7079"
    (is (= (stemming "neglectfulness") "neglect"))))

(deftest test-7080
  (testing "test case 7080"
    (is (= (stemming "biocycles") "biocycl"))))

(deftest test-7081
  (testing "test case 7081"
    (is (= (stemming "ingratiates") "ingrati"))))

(deftest test-7082
  (testing "test case 7082"
    (is (= (stemming "advantages") "advantag"))))

(deftest test-7083
  (testing "test case 7083"
    (is (= (stemming "drunkenly") "drunkenli"))))

(deftest test-7084
  (testing "test case 7084"
    (is (= (stemming "unmasker") "unmask"))))

(deftest test-7085
  (testing "test case 7085"
    (is (= (stemming "scouting") "scout"))))

(deftest test-7086
  (testing "test case 7086"
    (is (= (stemming "floodlight") "floodlight"))))

(deftest test-7087
  (testing "test case 7087"
    (is (= (stemming "aqueously") "aqueous"))))

(deftest test-7088
  (testing "test case 7088"
    (is (= (stemming "defiles") "defil"))))

(deftest test-7089
  (testing "test case 7089"
    (is (= (stemming "arrestees") "arreste"))))

(deftest test-7090
  (testing "test case 7090"
    (is (= (stemming "stretto") "stretto"))))

(deftest test-7091
  (testing "test case 7091"
    (is (= (stemming "caneware") "canewar"))))

(deftest test-7092
  (testing "test case 7092"
    (is (= (stemming "artiness") "arti"))))

(deftest test-7093
  (testing "test case 7093"
    (is (= (stemming "calibrations") "calibr"))))

(deftest test-7094
  (testing "test case 7094"
    (is (= (stemming "rectify") "rectifi"))))

(deftest test-7095
  (testing "test case 7095"
    (is (= (stemming "extract") "extract"))))

(deftest test-7096
  (testing "test case 7096"
    (is (= (stemming "desecrate") "desecr"))))

(deftest test-7097
  (testing "test case 7097"
    (is (= (stemming "leatheriness") "leatheri"))))

(deftest test-7098
  (testing "test case 7098"
    (is (= (stemming "backbit") "backbit"))))

(deftest test-7099
  (testing "test case 7099"
    (is (= (stemming "melodizing") "melod"))))

(deftest test-7100
  (testing "test case 7100"
    (is (= (stemming "tansy") "tansi"))))

(deftest test-7101
  (testing "test case 7101"
    (is (= (stemming "dreamt") "dreamt"))))

(deftest test-7102
  (testing "test case 7102"
    (is (= (stemming "sleets") "sleet"))))

(deftest test-7103
  (testing "test case 7103"
    (is (= (stemming "mien") "mien"))))

(deftest test-7104
  (testing "test case 7104"
    (is (= (stemming "microinstruction") "microinstruct"))))

(deftest test-7105
  (testing "test case 7105"
    (is (= (stemming "petersburg") "petersburg"))))

(deftest test-7106
  (testing "test case 7106"
    (is (= (stemming "collectives") "collect"))))

(deftest test-7107
  (testing "test case 7107"
    (is (= (stemming "forequarters") "forequart"))))

(deftest test-7108
  (testing "test case 7108"
    (is (= (stemming "indian") "indian"))))

(deftest test-7109
  (testing "test case 7109"
    (is (= (stemming "microorganisms") "microorgan"))))

(deftest test-7110
  (testing "test case 7110"
    (is (= (stemming "avascular") "avascular"))))

(deftest test-7111
  (testing "test case 7111"
    (is (= (stemming "wear") "wear"))))

(deftest test-7112
  (testing "test case 7112"
    (is (= (stemming "depriver") "depriv"))))

(deftest test-7113
  (testing "test case 7113"
    (is (= (stemming "vizard") "vizard"))))

(deftest test-7114
  (testing "test case 7114"
    (is (= (stemming "woodcock") "woodcock"))))

(deftest test-7115
  (testing "test case 7115"
    (is (= (stemming "foliated") "foliat"))))

(deftest test-7116
  (testing "test case 7116"
    (is (= (stemming "kenos") "keno"))))

(deftest test-7117
  (testing "test case 7117"
    (is (= (stemming "blowiness") "blowi"))))

(deftest test-7118
  (testing "test case 7118"
    (is (= (stemming "gunpoints") "gunpoint"))))

(deftest test-7119
  (testing "test case 7119"
    (is (= (stemming "spinets") "spinet"))))

(deftest test-7120
  (testing "test case 7120"
    (is (= (stemming "map") "map"))))

(deftest test-7121
  (testing "test case 7121"
    (is (= (stemming "sighting") "sight"))))

(deftest test-7122
  (testing "test case 7122"
    (is (= (stemming "wilds") "wild"))))

(deftest test-7123
  (testing "test case 7123"
    (is (= (stemming "jailors") "jailor"))))

(deftest test-7124
  (testing "test case 7124"
    (is (= (stemming "egger") "egger"))))

(deftest test-7125
  (testing "test case 7125"
    (is (= (stemming "clamoring") "clamor"))))

(deftest test-7126
  (testing "test case 7126"
    (is (= (stemming "alienists") "alienist"))))

(deftest test-7127
  (testing "test case 7127"
    (is (= (stemming "gaslight") "gaslight"))))

(deftest test-7128
  (testing "test case 7128"
    (is (= (stemming "nondeliveries") "nondeliveri"))))

(deftest test-7129
  (testing "test case 7129"
    (is (= (stemming "seventeenths") "seventeenth"))))

(deftest test-7130
  (testing "test case 7130"
    (is (= (stemming "monomers") "monom"))))

(deftest test-7131
  (testing "test case 7131"
    (is (= (stemming "metabases") "metabas"))))

(deftest test-7132
  (testing "test case 7132"
    (is (= (stemming "categorizing") "categor"))))

(deftest test-7133
  (testing "test case 7133"
    (is (= (stemming "ombre") "ombr"))))

(deftest test-7134
  (testing "test case 7134"
    (is (= (stemming "tintinnabulation") "tintinnabul"))))

(deftest test-7135
  (testing "test case 7135"
    (is (= (stemming "lunges") "lung"))))

(deftest test-7136
  (testing "test case 7136"
    (is (= (stemming "miseducate") "miseduc"))))

(deftest test-7137
  (testing "test case 7137"
    (is (= (stemming "fourfold") "fourfold"))))

(deftest test-7138
  (testing "test case 7138"
    (is (= (stemming "reliefs") "relief"))))

(deftest test-7139
  (testing "test case 7139"
    (is (= (stemming "righter") "righter"))))

(deftest test-7140
  (testing "test case 7140"
    (is (= (stemming "fumigant") "fumig"))))

(deftest test-7141
  (testing "test case 7141"
    (is (= (stemming "smirk") "smirk"))))

(deftest test-7142
  (testing "test case 7142"
    (is (= (stemming "cuteys") "cutei"))))

(deftest test-7143
  (testing "test case 7143"
    (is (= (stemming "liberators") "liber"))))

(deftest test-7144
  (testing "test case 7144"
    (is (= (stemming "peruse") "perus"))))

(deftest test-7145
  (testing "test case 7145"
    (is (= (stemming "shrimped") "shrimp"))))

(deftest test-7146
  (testing "test case 7146"
    (is (= (stemming "spier") "spier"))))

(deftest test-7147
  (testing "test case 7147"
    (is (= (stemming "smiter") "smiter"))))

(deftest test-7148
  (testing "test case 7148"
    (is (= (stemming "vainly") "vainli"))))

(deftest test-7149
  (testing "test case 7149"
    (is (= (stemming "admonishing") "admonish"))))

(deftest test-7150
  (testing "test case 7150"
    (is (= (stemming "adversatively") "advers"))))

(deftest test-7151
  (testing "test case 7151"
    (is (= (stemming "shiftless") "shiftless"))))

(deftest test-7152
  (testing "test case 7152"
    (is (= (stemming "empanel") "empanel"))))

(deftest test-7153
  (testing "test case 7153"
    (is (= (stemming "illuminators") "illumin"))))

(deftest test-7154
  (testing "test case 7154"
    (is (= (stemming "spitter") "spitter"))))

(deftest test-7155
  (testing "test case 7155"
    (is (= (stemming "grainier") "grainier"))))

(deftest test-7156
  (testing "test case 7156"
    (is (= (stemming "recalled") "recal"))))

(deftest test-7157
  (testing "test case 7157"
    (is (= (stemming "revisor") "revisor"))))

(deftest test-7158
  (testing "test case 7158"
    (is (= (stemming "protuberance") "protuber"))))

(deftest test-7159
  (testing "test case 7159"
    (is (= (stemming "impairer") "impair"))))

(deftest test-7160
  (testing "test case 7160"
    (is (= (stemming "rostral") "rostral"))))

(deftest test-7161
  (testing "test case 7161"
    (is (= (stemming "intellectualization") "intellectu"))))

(deftest test-7162
  (testing "test case 7162"
    (is (= (stemming "treacles") "treacl"))))

(deftest test-7163
  (testing "test case 7163"
    (is (= (stemming "transposing") "transpos"))))

(deftest test-7164
  (testing "test case 7164"
    (is (= (stemming "overdecorated") "overdecor"))))

(deftest test-7165
  (testing "test case 7165"
    (is (= (stemming "profanations") "profan"))))

(deftest test-7166
  (testing "test case 7166"
    (is (= (stemming "innocuous") "innocu"))))

(deftest test-7167
  (testing "test case 7167"
    (is (= (stemming "flankers") "flanker"))))

(deftest test-7168
  (testing "test case 7168"
    (is (= (stemming "calli") "calli"))))

(deftest test-7169
  (testing "test case 7169"
    (is (= (stemming "meseemed") "meseem"))))

(deftest test-7170
  (testing "test case 7170"
    (is (= (stemming "winnable") "winnabl"))))

(deftest test-7171
  (testing "test case 7171"
    (is (= (stemming "studbook") "studbook"))))

(deftest test-7172
  (testing "test case 7172"
    (is (= (stemming "silhouetting") "silhouet"))))

(deftest test-7173
  (testing "test case 7173"
    (is (= (stemming "pestled") "pestl"))))

(deftest test-7174
  (testing "test case 7174"
    (is (= (stemming "husked") "husk"))))

(deftest test-7175
  (testing "test case 7175"
    (is (= (stemming "charily") "charili"))))

(deftest test-7176
  (testing "test case 7176"
    (is (= (stemming "benzoate") "benzoat"))))

(deftest test-7177
  (testing "test case 7177"
    (is (= (stemming "tellies") "telli"))))

(deftest test-7178
  (testing "test case 7178"
    (is (= (stemming "monochrome") "monochrom"))))

(deftest test-7179
  (testing "test case 7179"
    (is (= (stemming "sermonic") "sermon"))))

(deftest test-7180
  (testing "test case 7180"
    (is (= (stemming "transcendentalists") "transcendentalist"))))

(deftest test-7181
  (testing "test case 7181"
    (is (= (stemming "assessors") "assessor"))))

(deftest test-7182
  (testing "test case 7182"
    (is (= (stemming "bios") "bio"))))

(deftest test-7183
  (testing "test case 7183"
    (is (= (stemming "shipway") "shipwai"))))

(deftest test-7184
  (testing "test case 7184"
    (is (= (stemming "trifurcating") "trifurc"))))

(deftest test-7185
  (testing "test case 7185"
    (is (= (stemming "charging") "charg"))))

(deftest test-7186
  (testing "test case 7186"
    (is (= (stemming "calumet") "calumet"))))

(deftest test-7187
  (testing "test case 7187"
    (is (= (stemming "foolhardiness") "foolhardi"))))

(deftest test-7188
  (testing "test case 7188"
    (is (= (stemming "coronets") "coronet"))))

(deftest test-7189
  (testing "test case 7189"
    (is (= (stemming "browned") "brown"))))

(deftest test-7190
  (testing "test case 7190"
    (is (= (stemming "topsiders") "topsid"))))

(deftest test-7191
  (testing "test case 7191"
    (is (= (stemming "divergence") "diverg"))))

(deftest test-7192
  (testing "test case 7192"
    (is (= (stemming "reunify") "reunifi"))))

(deftest test-7193
  (testing "test case 7193"
    (is (= (stemming "scot") "scot"))))

(deftest test-7194
  (testing "test case 7194"
    (is (= (stemming "jamestown") "jamestown"))))

(deftest test-7195
  (testing "test case 7195"
    (is (= (stemming "braggarts") "braggart"))))

(deftest test-7196
  (testing "test case 7196"
    (is (= (stemming "badland") "badland"))))

(deftest test-7197
  (testing "test case 7197"
    (is (= (stemming "compacter") "compact"))))

(deftest test-7198
  (testing "test case 7198"
    (is (= (stemming "swarthiest") "swarthiest"))))

(deftest test-7199
  (testing "test case 7199"
    (is (= (stemming "trifid") "trifid"))))

(deftest test-7200
  (testing "test case 7200"
    (is (= (stemming "contriver") "contriv"))))

(deftest test-7201
  (testing "test case 7201"
    (is (= (stemming "gain") "gain"))))

(deftest test-7202
  (testing "test case 7202"
    (is (= (stemming "shockers") "shocker"))))

(deftest test-7203
  (testing "test case 7203"
    (is (= (stemming "underwriters") "underwrit"))))

(deftest test-7204
  (testing "test case 7204"
    (is (= (stemming "reascending") "reascend"))))

(deftest test-7205
  (testing "test case 7205"
    (is (= (stemming "ocotillos") "ocotillo"))))

(deftest test-7206
  (testing "test case 7206"
    (is (= (stemming "adjudicator") "adjud"))))

(deftest test-7207
  (testing "test case 7207"
    (is (= (stemming "autoregulatory") "autoregulatori"))))

(deftest test-7208
  (testing "test case 7208"
    (is (= (stemming "seafarers") "seafar"))))

(deftest test-7209
  (testing "test case 7209"
    (is (= (stemming "gladioli") "gladioli"))))

(deftest test-7210
  (testing "test case 7210"
    (is (= (stemming "crappier") "crappier"))))

(deftest test-7211
  (testing "test case 7211"
    (is (= (stemming "enhances") "enhanc"))))

(deftest test-7212
  (testing "test case 7212"
    (is (= (stemming "indefinite") "indefinit"))))

(deftest test-7213
  (testing "test case 7213"
    (is (= (stemming "excrescence") "excresc"))))

(deftest test-7214
  (testing "test case 7214"
    (is (= (stemming "transgressor") "transgressor"))))

(deftest test-7215
  (testing "test case 7215"
    (is (= (stemming "hears") "hear"))))

(deftest test-7216
  (testing "test case 7216"
    (is (= (stemming "strappers") "strapper"))))

(deftest test-7217
  (testing "test case 7217"
    (is (= (stemming "freeholders") "freehold"))))

(deftest test-7218
  (testing "test case 7218"
    (is (= (stemming "prophylactic") "prophylact"))))

(deftest test-7219
  (testing "test case 7219"
    (is (= (stemming "dulls") "dull"))))

(deftest test-7220
  (testing "test case 7220"
    (is (= (stemming "prinked") "prink"))))

(deftest test-7221
  (testing "test case 7221"
    (is (= (stemming "dizzy") "dizzi"))))

(deftest test-7222
  (testing "test case 7222"
    (is (= (stemming "outbalance") "outbal"))))

(deftest test-7223
  (testing "test case 7223"
    (is (= (stemming "athirst") "athirst"))))

(deftest test-7224
  (testing "test case 7224"
    (is (= (stemming "gelatins") "gelatin"))))

(deftest test-7225
  (testing "test case 7225"
    (is (= (stemming "spacesuit") "spacesuit"))))

(deftest test-7226
  (testing "test case 7226"
    (is (= (stemming "contradistinctions") "contradistinct"))))

(deftest test-7227
  (testing "test case 7227"
    (is (= (stemming "kayakers") "kayak"))))

(deftest test-7228
  (testing "test case 7228"
    (is (= (stemming "apprises") "appris"))))

(deftest test-7229
  (testing "test case 7229"
    (is (= (stemming "escaping") "escap"))))

(deftest test-7230
  (testing "test case 7230"
    (is (= (stemming "wood") "wood"))))

(deftest test-7231
  (testing "test case 7231"
    (is (= (stemming "equivocalness") "equivoc"))))

(deftest test-7232
  (testing "test case 7232"
    (is (= (stemming "squish") "squish"))))

(deftest test-7233
  (testing "test case 7233"
    (is (= (stemming "gnaw") "gnaw"))))

(deftest test-7234
  (testing "test case 7234"
    (is (= (stemming "peculating") "pecul"))))

(deftest test-7235
  (testing "test case 7235"
    (is (= (stemming "ignis") "igni"))))

(deftest test-7236
  (testing "test case 7236"
    (is (= (stemming "funnyman") "funnyman"))))

(deftest test-7237
  (testing "test case 7237"
    (is (= (stemming "befoulier") "befouli"))))

(deftest test-7238
  (testing "test case 7238"
    (is (= (stemming "multiinfection") "multiinfect"))))

(deftest test-7239
  (testing "test case 7239"
    (is (= (stemming "rejoice") "rejoic"))))

(deftest test-7240
  (testing "test case 7240"
    (is (= (stemming "th") "th"))))

(deftest test-7241
  (testing "test case 7241"
    (is (= (stemming "englishwomen") "englishwomen"))))

(deftest test-7242
  (testing "test case 7242"
    (is (= (stemming "subclan") "subclan"))))

(deftest test-7243
  (testing "test case 7243"
    (is (= (stemming "division") "divis"))))

(deftest test-7244
  (testing "test case 7244"
    (is (= (stemming "slaughters") "slaughter"))))

(deftest test-7245
  (testing "test case 7245"
    (is (= (stemming "entreat") "entreat"))))

(deftest test-7246
  (testing "test case 7246"
    (is (= (stemming "dejections") "deject"))))

(deftest test-7247
  (testing "test case 7247"
    (is (= (stemming "interrace") "interrac"))))

(deftest test-7248
  (testing "test case 7248"
    (is (= (stemming "successions") "success"))))

(deftest test-7249
  (testing "test case 7249"
    (is (= (stemming "townish") "townish"))))

(deftest test-7250
  (testing "test case 7250"
    (is (= (stemming "dint") "dint"))))

(deftest test-7251
  (testing "test case 7251"
    (is (= (stemming "stanching") "stanch"))))

(deftest test-7252
  (testing "test case 7252"
    (is (= (stemming "attributed") "attribut"))))

(deftest test-7253
  (testing "test case 7253"
    (is (= (stemming "dominoes") "domino"))))

(deftest test-7254
  (testing "test case 7254"
    (is (= (stemming "untraversed") "untravers"))))

(deftest test-7255
  (testing "test case 7255"
    (is (= (stemming "princeling") "princel"))))

(deftest test-7256
  (testing "test case 7256"
    (is (= (stemming "turbot") "turbot"))))

(deftest test-7257
  (testing "test case 7257"
    (is (= (stemming "calc") "calc"))))

(deftest test-7258
  (testing "test case 7258"
    (is (= (stemming "tritone") "triton"))))

(deftest test-7259
  (testing "test case 7259"
    (is (= (stemming "proclaims") "proclaim"))))

(deftest test-7260
  (testing "test case 7260"
    (is (= (stemming "destain") "destain"))))

(deftest test-7261
  (testing "test case 7261"
    (is (= (stemming "americium") "americium"))))

(deftest test-7262
  (testing "test case 7262"
    (is (= (stemming "stereoing") "stereo"))))

(deftest test-7263
  (testing "test case 7263"
    (is (= (stemming "fulfill") "fulfil"))))

(deftest test-7264
  (testing "test case 7264"
    (is (= (stemming "despoiled") "despoil"))))

(deftest test-7265
  (testing "test case 7265"
    (is (= (stemming "truistic") "truistic"))))

(deftest test-7266
  (testing "test case 7266"
    (is (= (stemming "cessing") "cess"))))

(deftest test-7267
  (testing "test case 7267"
    (is (= (stemming "yells") "yell"))))

(deftest test-7268
  (testing "test case 7268"
    (is (= (stemming "bicolors") "bicolor"))))

(deftest test-7269
  (testing "test case 7269"
    (is (= (stemming "nihilities") "nihil"))))

(deftest test-7270
  (testing "test case 7270"
    (is (= (stemming "heist") "heist"))))

(deftest test-7271
  (testing "test case 7271"
    (is (= (stemming "dissectors") "dissector"))))

(deftest test-7272
  (testing "test case 7272"
    (is (= (stemming "misapprehending") "misapprehend"))))

(deftest test-7273
  (testing "test case 7273"
    (is (= (stemming "joinery") "joineri"))))

(deftest test-7274
  (testing "test case 7274"
    (is (= (stemming "survivors") "survivor"))))

(deftest test-7275
  (testing "test case 7275"
    (is (= (stemming "reconfirmations") "reconfirm"))))

(deftest test-7276
  (testing "test case 7276"
    (is (= (stemming "locked") "lock"))))

(deftest test-7277
  (testing "test case 7277"
    (is (= (stemming "unhanding") "unhand"))))

(deftest test-7278
  (testing "test case 7278"
    (is (= (stemming "totable") "totabl"))))

(deftest test-7279
  (testing "test case 7279"
    (is (= (stemming "cretaceous") "cretac"))))

(deftest test-7280
  (testing "test case 7280"
    (is (= (stemming "parturitions") "parturit"))))

(deftest test-7281
  (testing "test case 7281"
    (is (= (stemming "disjuncts") "disjunct"))))

(deftest test-7282
  (testing "test case 7282"
    (is (= (stemming "cowslips") "cowslip"))))

(deftest test-7283
  (testing "test case 7283"
    (is (= (stemming "fourthly") "fourthli"))))

(deftest test-7284
  (testing "test case 7284"
    (is (= (stemming "grinner") "grinner"))))

(deftest test-7285
  (testing "test case 7285"
    (is (= (stemming "exhaled") "exhal"))))

(deftest test-7286
  (testing "test case 7286"
    (is (= (stemming "syndical") "syndic"))))

(deftest test-7287
  (testing "test case 7287"
    (is (= (stemming "adding") "ad"))))

(deftest test-7288
  (testing "test case 7288"
    (is (= (stemming "contriving") "contriv"))))

(deftest test-7289
  (testing "test case 7289"
    (is (= (stemming "rechart") "rechart"))))

(deftest test-7290
  (testing "test case 7290"
    (is (= (stemming "arousers") "arous"))))

(deftest test-7291
  (testing "test case 7291"
    (is (= (stemming "boxfuls") "box"))))

(deftest test-7292
  (testing "test case 7292"
    (is (= (stemming "cadger") "cadger"))))

(deftest test-7293
  (testing "test case 7293"
    (is (= (stemming "forewing") "forew"))))

(deftest test-7294
  (testing "test case 7294"
    (is (= (stemming "unshapely") "unshap"))))

(deftest test-7295
  (testing "test case 7295"
    (is (= (stemming "brownstones") "brownston"))))

(deftest test-7296
  (testing "test case 7296"
    (is (= (stemming "pleasant") "pleasant"))))

(deftest test-7297
  (testing "test case 7297"
    (is (= (stemming "hatful") "hat"))))

(deftest test-7298
  (testing "test case 7298"
    (is (= (stemming "worktable") "worktabl"))))

(deftest test-7299
  (testing "test case 7299"
    (is (= (stemming "miscarries") "miscarri"))))

(deftest test-7300
  (testing "test case 7300"
    (is (= (stemming "mudding") "mud"))))

(deftest test-7301
  (testing "test case 7301"
    (is (= (stemming "crooning") "croon"))))

(deftest test-7302
  (testing "test case 7302"
    (is (= (stemming "monocle") "monocl"))))

(deftest test-7303
  (testing "test case 7303"
    (is (= (stemming "maggoty") "maggoti"))))

(deftest test-7304
  (testing "test case 7304"
    (is (= (stemming "neckwears") "neckwear"))))

(deftest test-7305
  (testing "test case 7305"
    (is (= (stemming "repent") "repent"))))

(deftest test-7306
  (testing "test case 7306"
    (is (= (stemming "hysterectomy") "hysterectomi"))))

(deftest test-7307
  (testing "test case 7307"
    (is (= (stemming "decries") "decri"))))

(deftest test-7308
  (testing "test case 7308"
    (is (= (stemming "cinders") "cinder"))))

(deftest test-7309
  (testing "test case 7309"
    (is (= (stemming "ejectment") "eject"))))

(deftest test-7310
  (testing "test case 7310"
    (is (= (stemming "chored") "chore"))))

(deftest test-7311
  (testing "test case 7311"
    (is (= (stemming "butterfat") "butterfat"))))

(deftest test-7312
  (testing "test case 7312"
    (is (= (stemming "debarkation") "debark"))))

(deftest test-7313
  (testing "test case 7313"
    (is (= (stemming "anesthesiologists") "anesthesiologist"))))

(deftest test-7314
  (testing "test case 7314"
    (is (= (stemming "embay") "embai"))))

(deftest test-7315
  (testing "test case 7315"
    (is (= (stemming "unrevenged") "unreveng"))))

(deftest test-7316
  (testing "test case 7316"
    (is (= (stemming "chargers") "charger"))))

(deftest test-7317
  (testing "test case 7317"
    (is (= (stemming "lolloping") "lollop"))))

(deftest test-7318
  (testing "test case 7318"
    (is (= (stemming "optic") "optic"))))

(deftest test-7319
  (testing "test case 7319"
    (is (= (stemming "phonemes") "phonem"))))

(deftest test-7320
  (testing "test case 7320"
    (is (= (stemming "gag") "gag"))))

(deftest test-7321
  (testing "test case 7321"
    (is (= (stemming "sends") "send"))))

(deftest test-7322
  (testing "test case 7322"
    (is (= (stemming "directives") "direct"))))

(deftest test-7323
  (testing "test case 7323"
    (is (= (stemming "octagons") "octagon"))))

(deftest test-7324
  (testing "test case 7324"
    (is (= (stemming "recolonization") "recolon"))))

(deftest test-7325
  (testing "test case 7325"
    (is (= (stemming "crackling") "crackl"))))

(deftest test-7326
  (testing "test case 7326"
    (is (= (stemming "among") "among"))))

(deftest test-7327
  (testing "test case 7327"
    (is (= (stemming "motivate") "motiv"))))

(deftest test-7328
  (testing "test case 7328"
    (is (= (stemming "redecorates") "redecor"))))

(deftest test-7329
  (testing "test case 7329"
    (is (= (stemming "whiffers") "whiffer"))))

(deftest test-7330
  (testing "test case 7330"
    (is (= (stemming "segmentation") "segment"))))

(deftest test-7331
  (testing "test case 7331"
    (is (= (stemming "stollen") "stollen"))))

(deftest test-7332
  (testing "test case 7332"
    (is (= (stemming "folkways") "folkwai"))))

(deftest test-7333
  (testing "test case 7333"
    (is (= (stemming "dysfunctions") "dysfunct"))))

(deftest test-7334
  (testing "test case 7334"
    (is (= (stemming "whole") "whole"))))

(deftest test-7335
  (testing "test case 7335"
    (is (= (stemming "grimace") "grimac"))))

(deftest test-7336
  (testing "test case 7336"
    (is (= (stemming "angleworm") "angleworm"))))

(deftest test-7337
  (testing "test case 7337"
    (is (= (stemming "revolter") "revolt"))))

(deftest test-7338
  (testing "test case 7338"
    (is (= (stemming "depravedness") "depraved"))))

(deftest test-7339
  (testing "test case 7339"
    (is (= (stemming "reifier") "reifier"))))

(deftest test-7340
  (testing "test case 7340"
    (is (= (stemming "monophobia") "monophobia"))))

(deftest test-7341
  (testing "test case 7341"
    (is (= (stemming "ironwood") "ironwood"))))

(deftest test-7342
  (testing "test case 7342"
    (is (= (stemming "ashcans") "ashcan"))))

(deftest test-7343
  (testing "test case 7343"
    (is (= (stemming "europium") "europium"))))

(deftest test-7344
  (testing "test case 7344"
    (is (= (stemming "swervers") "swerver"))))

(deftest test-7345
  (testing "test case 7345"
    (is (= (stemming "jabber") "jabber"))))

(deftest test-7346
  (testing "test case 7346"
    (is (= (stemming "manna") "manna"))))

(deftest test-7347
  (testing "test case 7347"
    (is (= (stemming "dilating") "dilat"))))

(deftest test-7348
  (testing "test case 7348"
    (is (= (stemming "grizzler") "grizzler"))))

(deftest test-7349
  (testing "test case 7349"
    (is (= (stemming "dusty") "dusti"))))

(deftest test-7350
  (testing "test case 7350"
    (is (= (stemming "defrock") "defrock"))))

(deftest test-7351
  (testing "test case 7351"
    (is (= (stemming "vocalism") "vocal"))))

(deftest test-7352
  (testing "test case 7352"
    (is (= (stemming "merited") "merit"))))

(deftest test-7353
  (testing "test case 7353"
    (is (= (stemming "pessimistic") "pessimist"))))

(deftest test-7354
  (testing "test case 7354"
    (is (= (stemming "brioche") "brioch"))))

(deftest test-7355
  (testing "test case 7355"
    (is (= (stemming "temperance") "temper"))))

(deftest test-7356
  (testing "test case 7356"
    (is (= (stemming "politburo") "politburo"))))

(deftest test-7357
  (testing "test case 7357"
    (is (= (stemming "baited") "bait"))))

(deftest test-7358
  (testing "test case 7358"
    (is (= (stemming "murines") "murin"))))

(deftest test-7359
  (testing "test case 7359"
    (is (= (stemming "spinneys") "spinnei"))))

(deftest test-7360
  (testing "test case 7360"
    (is (= (stemming "unexpressive") "unexpress"))))

(deftest test-7361
  (testing "test case 7361"
    (is (= (stemming "contacted") "contact"))))

(deftest test-7362
  (testing "test case 7362"
    (is (= (stemming "fabulists") "fabulist"))))

(deftest test-7363
  (testing "test case 7363"
    (is (= (stemming "dogdom") "dogdom"))))

(deftest test-7364
  (testing "test case 7364"
    (is (= (stemming "inaners") "inan"))))

(deftest test-7365
  (testing "test case 7365"
    (is (= (stemming "champions") "champion"))))

(deftest test-7366
  (testing "test case 7366"
    (is (= (stemming "featherbedding") "featherbed"))))

(deftest test-7367
  (testing "test case 7367"
    (is (= (stemming "pooped") "poop"))))

(deftest test-7368
  (testing "test case 7368"
    (is (= (stemming "stopover") "stopov"))))

(deftest test-7369
  (testing "test case 7369"
    (is (= (stemming "annihilator") "annihil"))))

(deftest test-7370
  (testing "test case 7370"
    (is (= (stemming "involute") "involut"))))

(deftest test-7371
  (testing "test case 7371"
    (is (= (stemming "peacock") "peacock"))))

(deftest test-7372
  (testing "test case 7372"
    (is (= (stemming "dowries") "dowri"))))

(deftest test-7373
  (testing "test case 7373"
    (is (= (stemming "designed") "design"))))

(deftest test-7374
  (testing "test case 7374"
    (is (= (stemming "dirtiest") "dirtiest"))))

(deftest test-7375
  (testing "test case 7375"
    (is (= (stemming "radiosensitivities") "radiosensit"))))

(deftest test-7376
  (testing "test case 7376"
    (is (= (stemming "photics") "photic"))))

(deftest test-7377
  (testing "test case 7377"
    (is (= (stemming "epoxy") "epoxi"))))

(deftest test-7378
  (testing "test case 7378"
    (is (= (stemming "indemonstrable") "indemonstr"))))

(deftest test-7379
  (testing "test case 7379"
    (is (= (stemming "galateas") "galatea"))))

(deftest test-7380
  (testing "test case 7380"
    (is (= (stemming "reenlistment") "reenlist"))))

(deftest test-7381
  (testing "test case 7381"
    (is (= (stemming "totemic") "totem"))))

(deftest test-7382
  (testing "test case 7382"
    (is (= (stemming "hollo") "hollo"))))

(deftest test-7383
  (testing "test case 7383"
    (is (= (stemming "grammars") "grammar"))))

(deftest test-7384
  (testing "test case 7384"
    (is (= (stemming "reascents") "reascent"))))

(deftest test-7385
  (testing "test case 7385"
    (is (= (stemming "sniffle") "sniffl"))))

(deftest test-7386
  (testing "test case 7386"
    (is (= (stemming "conceiver") "conceiv"))))

(deftest test-7387
  (testing "test case 7387"
    (is (= (stemming "stark") "stark"))))

(deftest test-7388
  (testing "test case 7388"
    (is (= (stemming "pearter") "pearter"))))

(deftest test-7389
  (testing "test case 7389"
    (is (= (stemming "feces") "fece"))))

(deftest test-7390
  (testing "test case 7390"
    (is (= (stemming "preadolescence") "preadolesc"))))

(deftest test-7391
  (testing "test case 7391"
    (is (= (stemming "playas") "playa"))))

(deftest test-7392
  (testing "test case 7392"
    (is (= (stemming "apical") "apic"))))

(deftest test-7393
  (testing "test case 7393"
    (is (= (stemming "blenny") "blenni"))))

(deftest test-7394
  (testing "test case 7394"
    (is (= (stemming "americana") "americana"))))

(deftest test-7395
  (testing "test case 7395"
    (is (= (stemming "blockades") "blockad"))))

(deftest test-7396
  (testing "test case 7396"
    (is (= (stemming "prometheus") "prometheu"))))

(deftest test-7397
  (testing "test case 7397"
    (is (= (stemming "resupplies") "resuppli"))))

(deftest test-7398
  (testing "test case 7398"
    (is (= (stemming "cupidity") "cupid"))))

(deftest test-7399
  (testing "test case 7399"
    (is (= (stemming "vignettist") "vignettist"))))

(deftest test-7400
  (testing "test case 7400"
    (is (= (stemming "yeomanry") "yeomanri"))))

(deftest test-7401
  (testing "test case 7401"
    (is (= (stemming "manatee") "manate"))))

(deftest test-7402
  (testing "test case 7402"
    (is (= (stemming "wreathing") "wreath"))))

(deftest test-7403
  (testing "test case 7403"
    (is (= (stemming "trichrome") "trichrom"))))

(deftest test-7404
  (testing "test case 7404"
    (is (= (stemming "shearers") "shearer"))))

(deftest test-7405
  (testing "test case 7405"
    (is (= (stemming "luggage") "luggag"))))

(deftest test-7406
  (testing "test case 7406"
    (is (= (stemming "gabbling") "gabbl"))))

(deftest test-7407
  (testing "test case 7407"
    (is (= (stemming "outspelled") "outspel"))))

(deftest test-7408
  (testing "test case 7408"
    (is (= (stemming "vertigos") "vertigo"))))

(deftest test-7409
  (testing "test case 7409"
    (is (= (stemming "dubiously") "dubious"))))

(deftest test-7410
  (testing "test case 7410"
    (is (= (stemming "disagree") "disagre"))))

(deftest test-7411
  (testing "test case 7411"
    (is (= (stemming "souping") "soup"))))

(deftest test-7412
  (testing "test case 7412"
    (is (= (stemming "opinionated") "opinion"))))

(deftest test-7413
  (testing "test case 7413"
    (is (= (stemming "rigorism") "rigor"))))

(deftest test-7414
  (testing "test case 7414"
    (is (= (stemming "interjectory") "interjectori"))))

(deftest test-7415
  (testing "test case 7415"
    (is (= (stemming "impostor") "impostor"))))

(deftest test-7416
  (testing "test case 7416"
    (is (= (stemming "firsts") "first"))))

(deftest test-7417
  (testing "test case 7417"
    (is (= (stemming "musty") "musti"))))

(deftest test-7418
  (testing "test case 7418"
    (is (= (stemming "shakiest") "shakiest"))))

(deftest test-7419
  (testing "test case 7419"
    (is (= (stemming "inculpating") "inculp"))))

(deftest test-7420
  (testing "test case 7420"
    (is (= (stemming "nationalities") "nation"))))

(deftest test-7421
  (testing "test case 7421"
    (is (= (stemming "malformed") "malform"))))

(deftest test-7422
  (testing "test case 7422"
    (is (= (stemming "thrives") "thrive"))))

(deftest test-7423
  (testing "test case 7423"
    (is (= (stemming "sidelights") "sidelight"))))

(deftest test-7424
  (testing "test case 7424"
    (is (= (stemming "gestation") "gestat"))))

(deftest test-7425
  (testing "test case 7425"
    (is (= (stemming "charlatanic") "charlatan"))))

(deftest test-7426
  (testing "test case 7426"
    (is (= (stemming "potentiator") "potenti"))))

(deftest test-7427
  (testing "test case 7427"
    (is (= (stemming "slap") "slap"))))

(deftest test-7428
  (testing "test case 7428"
    (is (= (stemming "trawler") "trawler"))))

(deftest test-7429
  (testing "test case 7429"
    (is (= (stemming "determinateness") "determin"))))

(deftest test-7430
  (testing "test case 7430"
    (is (= (stemming "reservist") "reservist"))))

(deftest test-7431
  (testing "test case 7431"
    (is (= (stemming "taperer") "taper"))))

(deftest test-7432
  (testing "test case 7432"
    (is (= (stemming "symptomatic") "symptomat"))))

(deftest test-7433
  (testing "test case 7433"
    (is (= (stemming "combing") "comb"))))

(deftest test-7434
  (testing "test case 7434"
    (is (= (stemming "ardours") "ardour"))))

(deftest test-7435
  (testing "test case 7435"
    (is (= (stemming "swishes") "swish"))))

(deftest test-7436
  (testing "test case 7436"
    (is (= (stemming "flamboyancy") "flamboy"))))

(deftest test-7437
  (testing "test case 7437"
    (is (= (stemming "moaning") "moan"))))

(deftest test-7438
  (testing "test case 7438"
    (is (= (stemming "recitation") "recit"))))

(deftest test-7439
  (testing "test case 7439"
    (is (= (stemming "unproductiveness") "unproduct"))))

(deftest test-7440
  (testing "test case 7440"
    (is (= (stemming "usefully") "usefulli"))))

(deftest test-7441
  (testing "test case 7441"
    (is (= (stemming "glamorizing") "glamor"))))

(deftest test-7442
  (testing "test case 7442"
    (is (= (stemming "leone") "leon"))))

(deftest test-7443
  (testing "test case 7443"
    (is (= (stemming "niggler") "niggler"))))

(deftest test-7444
  (testing "test case 7444"
    (is (= (stemming "sympathized") "sympath"))))

(deftest test-7445
  (testing "test case 7445"
    (is (= (stemming "symbolically") "symbol"))))

(deftest test-7446
  (testing "test case 7446"
    (is (= (stemming "sopranos") "soprano"))))

(deftest test-7447
  (testing "test case 7447"
    (is (= (stemming "decongestant") "decongest"))))

(deftest test-7448
  (testing "test case 7448"
    (is (= (stemming "clitoridectomy") "clitoridectomi"))))

(deftest test-7449
  (testing "test case 7449"
    (is (= (stemming "inhumane") "inhuman"))))

(deftest test-7450
  (testing "test case 7450"
    (is (= (stemming "debutantes") "debutant"))))

(deftest test-7451
  (testing "test case 7451"
    (is (= (stemming "blockiest") "blockiest"))))

(deftest test-7452
  (testing "test case 7452"
    (is (= (stemming "decrescendos") "decrescendo"))))

(deftest test-7453
  (testing "test case 7453"
    (is (= (stemming "conjunctival") "conjunctiv"))))

(deftest test-7454
  (testing "test case 7454"
    (is (= (stemming "expedients") "expedi"))))

(deftest test-7455
  (testing "test case 7455"
    (is (= (stemming "unloading") "unload"))))

(deftest test-7456
  (testing "test case 7456"
    (is (= (stemming "kindlings") "kindl"))))

(deftest test-7457
  (testing "test case 7457"
    (is (= (stemming "dragomen") "dragomen"))))

(deftest test-7458
  (testing "test case 7458"
    (is (= (stemming "vertically") "vertic"))))

(deftest test-7459
  (testing "test case 7459"
    (is (= (stemming "repricing") "repric"))))

(deftest test-7460
  (testing "test case 7460"
    (is (= (stemming "chapfallen") "chapfallen"))))

(deftest test-7461
  (testing "test case 7461"
    (is (= (stemming "documental") "document"))))

(deftest test-7462
  (testing "test case 7462"
    (is (= (stemming "omelettes") "omelett"))))

(deftest test-7463
  (testing "test case 7463"
    (is (= (stemming "expert") "expert"))))

(deftest test-7464
  (testing "test case 7464"
    (is (= (stemming "consulted") "consult"))))

(deftest test-7465
  (testing "test case 7465"
    (is (= (stemming "subjugate") "subjug"))))

(deftest test-7466
  (testing "test case 7466"
    (is (= (stemming "abscessing") "abscess"))))

(deftest test-7467
  (testing "test case 7467"
    (is (= (stemming "instinctive") "instinct"))))

(deftest test-7468
  (testing "test case 7468"
    (is (= (stemming "introversion") "introvers"))))

(deftest test-7469
  (testing "test case 7469"
    (is (= (stemming "sympathizers") "sympath"))))

(deftest test-7470
  (testing "test case 7470"
    (is (= (stemming "camper") "camper"))))

(deftest test-7471
  (testing "test case 7471"
    (is (= (stemming "utopias") "utopia"))))

(deftest test-7472
  (testing "test case 7472"
    (is (= (stemming "holies") "holi"))))

(deftest test-7473
  (testing "test case 7473"
    (is (= (stemming "beadroll") "beadrol"))))

(deftest test-7474
  (testing "test case 7474"
    (is (= (stemming "christian") "christian"))))

(deftest test-7475
  (testing "test case 7475"
    (is (= (stemming "dependents") "depend"))))

(deftest test-7476
  (testing "test case 7476"
    (is (= (stemming "distastes") "distast"))))

(deftest test-7477
  (testing "test case 7477"
    (is (= (stemming "lienteries") "lienteri"))))

(deftest test-7478
  (testing "test case 7478"
    (is (= (stemming "syncoms") "syncom"))))

(deftest test-7479
  (testing "test case 7479"
    (is (= (stemming "disreputably") "disreput"))))

(deftest test-7480
  (testing "test case 7480"
    (is (= (stemming "meterages") "meterag"))))

(deftest test-7481
  (testing "test case 7481"
    (is (= (stemming "drums") "drum"))))

(deftest test-7482
  (testing "test case 7482"
    (is (= (stemming "nighttimes") "nighttim"))))

(deftest test-7483
  (testing "test case 7483"
    (is (= (stemming "deplane") "deplan"))))

(deftest test-7484
  (testing "test case 7484"
    (is (= (stemming "paneled") "panel"))))

(deftest test-7485
  (testing "test case 7485"
    (is (= (stemming "infrequency") "infrequ"))))

(deftest test-7486
  (testing "test case 7486"
    (is (= (stemming "fossils") "fossil"))))

(deftest test-7487
  (testing "test case 7487"
    (is (= (stemming "focalized") "focal"))))

(deftest test-7488
  (testing "test case 7488"
    (is (= (stemming "rewording") "reword"))))

(deftest test-7489
  (testing "test case 7489"
    (is (= (stemming "standee") "stande"))))

(deftest test-7490
  (testing "test case 7490"
    (is (= (stemming "were") "were"))))

(deftest test-7491
  (testing "test case 7491"
    (is (= (stemming "recrudescent") "recrudesc"))))

(deftest test-7492
  (testing "test case 7492"
    (is (= (stemming "sob") "sob"))))

(deftest test-7493
  (testing "test case 7493"
    (is (= (stemming "complex") "complex"))))

(deftest test-7494
  (testing "test case 7494"
    (is (= (stemming "wader") "wader"))))

(deftest test-7495
  (testing "test case 7495"
    (is (= (stemming "manginess") "mangi"))))

(deftest test-7496
  (testing "test case 7496"
    (is (= (stemming "sweated") "sweat"))))

(deftest test-7497
  (testing "test case 7497"
    (is (= (stemming "spaniards") "spaniard"))))

(deftest test-7498
  (testing "test case 7498"
    (is (= (stemming "taw") "taw"))))

(deftest test-7499
  (testing "test case 7499"
    (is (= (stemming "navels") "navel"))))

(deftest test-7500
  (testing "test case 7500"
    (is (= (stemming "impertinence") "impertin"))))

(deftest test-7501
  (testing "test case 7501"
    (is (= (stemming "trackman") "trackman"))))

(deftest test-7502
  (testing "test case 7502"
    (is (= (stemming "cheek") "cheek"))))

(deftest test-7503
  (testing "test case 7503"
    (is (= (stemming "marvelled") "marvel"))))

(deftest test-7504
  (testing "test case 7504"
    (is (= (stemming "stipulators") "stipul"))))

(deftest test-7505
  (testing "test case 7505"
    (is (= (stemming "stoops") "stoop"))))

(deftest test-7506
  (testing "test case 7506"
    (is (= (stemming "intake") "intak"))))

(deftest test-7507
  (testing "test case 7507"
    (is (= (stemming "luxuriousness") "luxuri"))))

(deftest test-7508
  (testing "test case 7508"
    (is (= (stemming "pouching") "pouch"))))

(deftest test-7509
  (testing "test case 7509"
    (is (= (stemming "reforged") "reforg"))))

(deftest test-7510
  (testing "test case 7510"
    (is (= (stemming "gunslingers") "gunsling"))))

(deftest test-7511
  (testing "test case 7511"
    (is (= (stemming "expectant") "expect"))))

(deftest test-7512
  (testing "test case 7512"
    (is (= (stemming "mellower") "mellow"))))

(deftest test-7513
  (testing "test case 7513"
    (is (= (stemming "antimilitaristic") "antimilitarist"))))

(deftest test-7514
  (testing "test case 7514"
    (is (= (stemming "restated") "restat"))))

(deftest test-7515
  (testing "test case 7515"
    (is (= (stemming "upchucked") "upchuck"))))

(deftest test-7516
  (testing "test case 7516"
    (is (= (stemming "decollated") "decol"))))

(deftest test-7517
  (testing "test case 7517"
    (is (= (stemming "cuneiform") "cuneiform"))))

(deftest test-7518
  (testing "test case 7518"
    (is (= (stemming "sonnies") "sonni"))))

(deftest test-7519
  (testing "test case 7519"
    (is (= (stemming "harassments") "harass"))))

(deftest test-7520
  (testing "test case 7520"
    (is (= (stemming "cocainized") "cocain"))))

(deftest test-7521
  (testing "test case 7521"
    (is (= (stemming "folic") "folic"))))

(deftest test-7522
  (testing "test case 7522"
    (is (= (stemming "mistiest") "mistiest"))))

(deftest test-7523
  (testing "test case 7523"
    (is (= (stemming "surrogate") "surrog"))))

(deftest test-7524
  (testing "test case 7524"
    (is (= (stemming "canapes") "canap"))))

(deftest test-7525
  (testing "test case 7525"
    (is (= (stemming "define") "defin"))))

(deftest test-7526
  (testing "test case 7526"
    (is (= (stemming "preadapting") "preadapt"))))

(deftest test-7527
  (testing "test case 7527"
    (is (= (stemming "communiques") "communiqu"))))

(deftest test-7528
  (testing "test case 7528"
    (is (= (stemming "amnesic") "amnes"))))

(deftest test-7529
  (testing "test case 7529"
    (is (= (stemming "sailings") "sail"))))

(deftest test-7530
  (testing "test case 7530"
    (is (= (stemming "foreknowledge") "foreknowledg"))))

(deftest test-7531
  (testing "test case 7531"
    (is (= (stemming "cackler") "cackler"))))

(deftest test-7532
  (testing "test case 7532"
    (is (= (stemming "worses") "wors"))))

(deftest test-7533
  (testing "test case 7533"
    (is (= (stemming "opiners") "opin"))))

(deftest test-7534
  (testing "test case 7534"
    (is (= (stemming "curdle") "curdl"))))

(deftest test-7535
  (testing "test case 7535"
    (is (= (stemming "dentifrices") "dentifric"))))

(deftest test-7536
  (testing "test case 7536"
    (is (= (stemming "extortionist") "extortionist"))))

(deftest test-7537
  (testing "test case 7537"
    (is (= (stemming "skylarks") "skylark"))))

(deftest test-7538
  (testing "test case 7538"
    (is (= (stemming "actors") "actor"))))

(deftest test-7539
  (testing "test case 7539"
    (is (= (stemming "audiences") "audienc"))))

(deftest test-7540
  (testing "test case 7540"
    (is (= (stemming "hopsacks") "hopsack"))))

(deftest test-7541
  (testing "test case 7541"
    (is (= (stemming "disbeliever") "disbeliev"))))

(deftest test-7542
  (testing "test case 7542"
    (is (= (stemming "tilling") "till"))))

(deftest test-7543
  (testing "test case 7543"
    (is (= (stemming "reconversions") "reconvers"))))

(deftest test-7544
  (testing "test case 7544"
    (is (= (stemming "ovens") "oven"))))

(deftest test-7545
  (testing "test case 7545"
    (is (= (stemming "vituperating") "vituper"))))

(deftest test-7546
  (testing "test case 7546"
    (is (= (stemming "future") "futur"))))

(deftest test-7547
  (testing "test case 7547"
    (is (= (stemming "fopped") "fop"))))

(deftest test-7548
  (testing "test case 7548"
    (is (= (stemming "scalesmen") "scalesmen"))))

(deftest test-7549
  (testing "test case 7549"
    (is (= (stemming "peripheral") "peripher"))))

(deftest test-7550
  (testing "test case 7550"
    (is (= (stemming "crocheted") "crochet"))))

(deftest test-7551
  (testing "test case 7551"
    (is (= (stemming "sentimentalism") "sentiment"))))

(deftest test-7552
  (testing "test case 7552"
    (is (= (stemming "luges") "luge"))))

(deftest test-7553
  (testing "test case 7553"
    (is (= (stemming "hairworks") "hairwork"))))

(deftest test-7554
  (testing "test case 7554"
    (is (= (stemming "betide") "betid"))))

(deftest test-7555
  (testing "test case 7555"
    (is (= (stemming "wacky") "wacki"))))

(deftest test-7556
  (testing "test case 7556"
    (is (= (stemming "fingerling") "fingerl"))))

(deftest test-7557
  (testing "test case 7557"
    (is (= (stemming "disentanglements") "disentangl"))))

(deftest test-7558
  (testing "test case 7558"
    (is (= (stemming "orifices") "orific"))))

(deftest test-7559
  (testing "test case 7559"
    (is (= (stemming "sawyers") "sawyer"))))

(deftest test-7560
  (testing "test case 7560"
    (is (= (stemming "citer") "citer"))))

(deftest test-7561
  (testing "test case 7561"
    (is (= (stemming "antisepticized") "antiseptic"))))

(deftest test-7562
  (testing "test case 7562"
    (is (= (stemming "electrochemically") "electrochem"))))

(deftest test-7563
  (testing "test case 7563"
    (is (= (stemming "introspection") "introspect"))))

(deftest test-7564
  (testing "test case 7564"
    (is (= (stemming "unphotographic") "unphotograph"))))

(deftest test-7565
  (testing "test case 7565"
    (is (= (stemming "gemmily") "gemmili"))))

(deftest test-7566
  (testing "test case 7566"
    (is (= (stemming "titre") "titr"))))

(deftest test-7567
  (testing "test case 7567"
    (is (= (stemming "viniest") "viniest"))))

(deftest test-7568
  (testing "test case 7568"
    (is (= (stemming "rotates") "rotat"))))

(deftest test-7569
  (testing "test case 7569"
    (is (= (stemming "pirates") "pirat"))))

(deftest test-7570
  (testing "test case 7570"
    (is (= (stemming "volleyballs") "volleybal"))))

(deftest test-7571
  (testing "test case 7571"
    (is (= (stemming "unsubstantiated") "unsubstanti"))))

(deftest test-7572
  (testing "test case 7572"
    (is (= (stemming "coalified") "coalifi"))))

(deftest test-7573
  (testing "test case 7573"
    (is (= (stemming "antihero") "antihero"))))

(deftest test-7574
  (testing "test case 7574"
    (is (= (stemming "entoiling") "entoil"))))

(deftest test-7575
  (testing "test case 7575"
    (is (= (stemming "aldermen") "aldermen"))))

(deftest test-7576
  (testing "test case 7576"
    (is (= (stemming "foresightedness") "foresighted"))))

(deftest test-7577
  (testing "test case 7577"
    (is (= (stemming "bemire") "bemir"))))

(deftest test-7578
  (testing "test case 7578"
    (is (= (stemming "factoring") "factor"))))

(deftest test-7579
  (testing "test case 7579"
    (is (= (stemming "suttee") "sutte"))))

(deftest test-7580
  (testing "test case 7580"
    (is (= (stemming "selects") "select"))))

(deftest test-7581
  (testing "test case 7581"
    (is (= (stemming "glossolalia") "glossolalia"))))

(deftest test-7582
  (testing "test case 7582"
    (is (= (stemming "haviour") "haviour"))))

(deftest test-7583
  (testing "test case 7583"
    (is (= (stemming "unendingly") "unendingli"))))

(deftest test-7584
  (testing "test case 7584"
    (is (= (stemming "hectoliters") "hectolit"))))

(deftest test-7585
  (testing "test case 7585"
    (is (= (stemming "dedicate") "dedic"))))

(deftest test-7586
  (testing "test case 7586"
    (is (= (stemming "rivaled") "rival"))))

(deftest test-7587
  (testing "test case 7587"
    (is (= (stemming "hideouts") "hideout"))))

(deftest test-7588
  (testing "test case 7588"
    (is (= (stemming "verbalizes") "verbal"))))

(deftest test-7589
  (testing "test case 7589"
    (is (= (stemming "gravelled") "gravel"))))

(deftest test-7590
  (testing "test case 7590"
    (is (= (stemming "chlorites") "chlorit"))))

(deftest test-7591
  (testing "test case 7591"
    (is (= (stemming "kookier") "kookier"))))

(deftest test-7592
  (testing "test case 7592"
    (is (= (stemming "corkiest") "corkiest"))))

(deftest test-7593
  (testing "test case 7593"
    (is (= (stemming "distr") "distr"))))

(deftest test-7594
  (testing "test case 7594"
    (is (= (stemming "trespasser") "trespass"))))

(deftest test-7595
  (testing "test case 7595"
    (is (= (stemming "therapeutical") "therapeut"))))

(deftest test-7596
  (testing "test case 7596"
    (is (= (stemming "shroud") "shroud"))))

(deftest test-7597
  (testing "test case 7597"
    (is (= (stemming "emigrant") "emigr"))))

(deftest test-7598
  (testing "test case 7598"
    (is (= (stemming "cryptograph") "cryptograph"))))

(deftest test-7599
  (testing "test case 7599"
    (is (= (stemming "reminisces") "reminisc"))))

(deftest test-7600
  (testing "test case 7600"
    (is (= (stemming "scratcher") "scratcher"))))

(deftest test-7601
  (testing "test case 7601"
    (is (= (stemming "bobsledded") "bobsled"))))

(deftest test-7602
  (testing "test case 7602"
    (is (= (stemming "waltzing") "waltz"))))

(deftest test-7603
  (testing "test case 7603"
    (is (= (stemming "nebs") "neb"))))

(deftest test-7604
  (testing "test case 7604"
    (is (= (stemming "tommies") "tommi"))))

(deftest test-7605
  (testing "test case 7605"
    (is (= (stemming "stoked") "stoke"))))

(deftest test-7606
  (testing "test case 7606"
    (is (= (stemming "automatic") "automat"))))

(deftest test-7607
  (testing "test case 7607"
    (is (= (stemming "pratique") "pratiqu"))))

(deftest test-7608
  (testing "test case 7608"
    (is (= (stemming "chancellery") "chancelleri"))))

(deftest test-7609
  (testing "test case 7609"
    (is (= (stemming "tantrum") "tantrum"))))

(deftest test-7610
  (testing "test case 7610"
    (is (= (stemming "gramps") "gramp"))))

(deftest test-7611
  (testing "test case 7611"
    (is (= (stemming "forfeitures") "forfeitur"))))

(deftest test-7612
  (testing "test case 7612"
    (is (= (stemming "steeper") "steeper"))))

(deftest test-7613
  (testing "test case 7613"
    (is (= (stemming "valedictory") "valedictori"))))

(deftest test-7614
  (testing "test case 7614"
    (is (= (stemming "anthropologically") "anthropolog"))))

(deftest test-7615
  (testing "test case 7615"
    (is (= (stemming "reeving") "reev"))))

(deftest test-7616
  (testing "test case 7616"
    (is (= (stemming "comment") "comment"))))

(deftest test-7617
  (testing "test case 7617"
    (is (= (stemming "revile") "revil"))))

(deftest test-7618
  (testing "test case 7618"
    (is (= (stemming "narcotics") "narcot"))))

(deftest test-7619
  (testing "test case 7619"
    (is (= (stemming "pulser") "pulser"))))

(deftest test-7620
  (testing "test case 7620"
    (is (= (stemming "perdy") "perdi"))))

(deftest test-7621
  (testing "test case 7621"
    (is (= (stemming "docilely") "docil"))))

(deftest test-7622
  (testing "test case 7622"
    (is (= (stemming "djinn") "djinn"))))

(deftest test-7623
  (testing "test case 7623"
    (is (= (stemming "outfittings") "outfit"))))

(deftest test-7624
  (testing "test case 7624"
    (is (= (stemming "stomachache") "stomachach"))))

(deftest test-7625
  (testing "test case 7625"
    (is (= (stemming "gearcase") "gearcas"))))

(deftest test-7626
  (testing "test case 7626"
    (is (= (stemming "deoxygenate") "deoxygen"))))

(deftest test-7627
  (testing "test case 7627"
    (is (= (stemming "portland") "portland"))))

(deftest test-7628
  (testing "test case 7628"
    (is (= (stemming "pronounced") "pronounc"))))

(deftest test-7629
  (testing "test case 7629"
    (is (= (stemming "calligraphy") "calligraphi"))))

(deftest test-7630
  (testing "test case 7630"
    (is (= (stemming "offences") "offenc"))))

(deftest test-7631
  (testing "test case 7631"
    (is (= (stemming "smokiness") "smoki"))))

(deftest test-7632
  (testing "test case 7632"
    (is (= (stemming "unbiasedly") "unbiasedli"))))

(deftest test-7633
  (testing "test case 7633"
    (is (= (stemming "elegists") "elegist"))))

(deftest test-7634
  (testing "test case 7634"
    (is (= (stemming "panning") "pan"))))

(deftest test-7635
  (testing "test case 7635"
    (is (= (stemming "contractor") "contractor"))))

(deftest test-7636
  (testing "test case 7636"
    (is (= (stemming "dislocate") "disloc"))))

(deftest test-7637
  (testing "test case 7637"
    (is (= (stemming "rockless") "rockless"))))

(deftest test-7638
  (testing "test case 7638"
    (is (= (stemming "regulable") "regul"))))

(deftest test-7639
  (testing "test case 7639"
    (is (= (stemming "barcelona") "barcelona"))))

(deftest test-7640
  (testing "test case 7640"
    (is (= (stemming "stethoscopically") "stethoscop"))))

(deftest test-7641
  (testing "test case 7641"
    (is (= (stemming "recessionals") "recession"))))

(deftest test-7642
  (testing "test case 7642"
    (is (= (stemming "imbrications") "imbric"))))

(deftest test-7643
  (testing "test case 7643"
    (is (= (stemming "excitons") "exciton"))))

(deftest test-7644
  (testing "test case 7644"
    (is (= (stemming "adzes") "adz"))))

(deftest test-7645
  (testing "test case 7645"
    (is (= (stemming "burnoose") "burnoos"))))

(deftest test-7646
  (testing "test case 7646"
    (is (= (stemming "significantly") "significantli"))))

(deftest test-7647
  (testing "test case 7647"
    (is (= (stemming "moronism") "moron"))))

(deftest test-7648
  (testing "test case 7648"
    (is (= (stemming "opaline") "opalin"))))

(deftest test-7649
  (testing "test case 7649"
    (is (= (stemming "trinitarian") "trinitarian"))))

(deftest test-7650
  (testing "test case 7650"
    (is (= (stemming "crosshatches") "crosshatch"))))

(deftest test-7651
  (testing "test case 7651"
    (is (= (stemming "watery") "wateri"))))

(deftest test-7652
  (testing "test case 7652"
    (is (= (stemming "lutheranism") "lutheran"))))

(deftest test-7653
  (testing "test case 7653"
    (is (= (stemming "unexposed") "unexpos"))))

(deftest test-7654
  (testing "test case 7654"
    (is (= (stemming "jellyfishes") "jellyfish"))))

(deftest test-7655
  (testing "test case 7655"
    (is (= (stemming "brow") "brow"))))

(deftest test-7656
  (testing "test case 7656"
    (is (= (stemming "sudor") "sudor"))))

(deftest test-7657
  (testing "test case 7657"
    (is (= (stemming "bibbers") "bibber"))))

(deftest test-7658
  (testing "test case 7658"
    (is (= (stemming "jellied") "jelli"))))

(deftest test-7659
  (testing "test case 7659"
    (is (= (stemming "soapers") "soaper"))))

(deftest test-7660
  (testing "test case 7660"
    (is (= (stemming "pimping") "pimp"))))

(deftest test-7661
  (testing "test case 7661"
    (is (= (stemming "stinginess") "stingi"))))

(deftest test-7662
  (testing "test case 7662"
    (is (= (stemming "whines") "whine"))))

(deftest test-7663
  (testing "test case 7663"
    (is (= (stemming "droit") "droit"))))

(deftest test-7664
  (testing "test case 7664"
    (is (= (stemming "kisses") "kiss"))))

(deftest test-7665
  (testing "test case 7665"
    (is (= (stemming "ultrasuede") "ultrasued"))))

(deftest test-7666
  (testing "test case 7666"
    (is (= (stemming "britannic") "britann"))))

(deftest test-7667
  (testing "test case 7667"
    (is (= (stemming "drolling") "droll"))))

(deftest test-7668
  (testing "test case 7668"
    (is (= (stemming "goad") "goad"))))

(deftest test-7669
  (testing "test case 7669"
    (is (= (stemming "baobab") "baobab"))))

(deftest test-7670
  (testing "test case 7670"
    (is (= (stemming "nonlocals") "nonloc"))))

(deftest test-7671
  (testing "test case 7671"
    (is (= (stemming "hagridden") "hagridden"))))

(deftest test-7672
  (testing "test case 7672"
    (is (= (stemming "livery") "liveri"))))

(deftest test-7673
  (testing "test case 7673"
    (is (= (stemming "cursors") "cursor"))))

(deftest test-7674
  (testing "test case 7674"
    (is (= (stemming "softs") "soft"))))

(deftest test-7675
  (testing "test case 7675"
    (is (= (stemming "milage") "milag"))))

(deftest test-7676
  (testing "test case 7676"
    (is (= (stemming "bathrooms") "bathroom"))))

(deftest test-7677
  (testing "test case 7677"
    (is (= (stemming "autograph") "autograph"))))

(deftest test-7678
  (testing "test case 7678"
    (is (= (stemming "unhitches") "unhitch"))))

(deftest test-7679
  (testing "test case 7679"
    (is (= (stemming "pedant") "pedant"))))

(deftest test-7680
  (testing "test case 7680"
    (is (= (stemming "isotonically") "isoton"))))

(deftest test-7681
  (testing "test case 7681"
    (is (= (stemming "keg") "keg"))))

(deftest test-7682
  (testing "test case 7682"
    (is (= (stemming "insalubrious") "insalubri"))))

(deftest test-7683
  (testing "test case 7683"
    (is (= (stemming "floppier") "floppier"))))

(deftest test-7684
  (testing "test case 7684"
    (is (= (stemming "seaweed") "seawe"))))

(deftest test-7685
  (testing "test case 7685"
    (is (= (stemming "puffers") "puffer"))))

(deftest test-7686
  (testing "test case 7686"
    (is (= (stemming "misadvised") "misadvis"))))

(deftest test-7687
  (testing "test case 7687"
    (is (= (stemming "bituminous") "bitumin"))))

(deftest test-7688
  (testing "test case 7688"
    (is (= (stemming "masturbator") "masturb"))))

(deftest test-7689
  (testing "test case 7689"
    (is (= (stemming "geotropically") "geotrop"))))

(deftest test-7690
  (testing "test case 7690"
    (is (= (stemming "doubtfulness") "doubt"))))

(deftest test-7691
  (testing "test case 7691"
    (is (= (stemming "rite") "rite"))))

(deftest test-7692
  (testing "test case 7692"
    (is (= (stemming "catted") "cat"))))

(deftest test-7693
  (testing "test case 7693"
    (is (= (stemming "unutterable") "unutter"))))

(deftest test-7694
  (testing "test case 7694"
    (is (= (stemming "randomized") "random"))))

(deftest test-7695
  (testing "test case 7695"
    (is (= (stemming "scaffolded") "scaffold"))))

(deftest test-7696
  (testing "test case 7696"
    (is (= (stemming "prointervention") "prointervent"))))

(deftest test-7697
  (testing "test case 7697"
    (is (= (stemming "crimper") "crimper"))))

(deftest test-7698
  (testing "test case 7698"
    (is (= (stemming "benzoic") "benzoic"))))

(deftest test-7699
  (testing "test case 7699"
    (is (= (stemming "topology") "topolog"))))

(deftest test-7700
  (testing "test case 7700"
    (is (= (stemming "decorticate") "decort"))))

(deftest test-7701
  (testing "test case 7701"
    (is (= (stemming "fiberglass") "fiberglass"))))

(deftest test-7702
  (testing "test case 7702"
    (is (= (stemming "operated") "oper"))))

(deftest test-7703
  (testing "test case 7703"
    (is (= (stemming "books") "book"))))

(deftest test-7704
  (testing "test case 7704"
    (is (= (stemming "fast") "fast"))))

(deftest test-7705
  (testing "test case 7705"
    (is (= (stemming "malfunctions") "malfunct"))))

(deftest test-7706
  (testing "test case 7706"
    (is (= (stemming "chimbley") "chimblei"))))

(deftest test-7707
  (testing "test case 7707"
    (is (= (stemming "antipodean") "antipodean"))))

(deftest test-7708
  (testing "test case 7708"
    (is (= (stemming "casked") "cask"))))

(deftest test-7709
  (testing "test case 7709"
    (is (= (stemming "trave") "trave"))))

(deftest test-7710
  (testing "test case 7710"
    (is (= (stemming "dirndl") "dirndl"))))

(deftest test-7711
  (testing "test case 7711"
    (is (= (stemming "shatter") "shatter"))))

(deftest test-7712
  (testing "test case 7712"
    (is (= (stemming "wire") "wire"))))

(deftest test-7713
  (testing "test case 7713"
    (is (= (stemming "apace") "apac"))))

(deftest test-7714
  (testing "test case 7714"
    (is (= (stemming "anaesthetized") "anaesthet"))))

(deftest test-7715
  (testing "test case 7715"
    (is (= (stemming "kirsches") "kirsch"))))

(deftest test-7716
  (testing "test case 7716"
    (is (= (stemming "chandleries") "chandleri"))))

(deftest test-7717
  (testing "test case 7717"
    (is (= (stemming "deputed") "deput"))))

(deftest test-7718
  (testing "test case 7718"
    (is (= (stemming "syria") "syria"))))

(deftest test-7719
  (testing "test case 7719"
    (is (= (stemming "rishi") "rishi"))))

(deftest test-7720
  (testing "test case 7720"
    (is (= (stemming "solvencies") "solvenc"))))

(deftest test-7721
  (testing "test case 7721"
    (is (= (stemming "mfd") "mfd"))))

(deftest test-7722
  (testing "test case 7722"
    (is (= (stemming "hydrography") "hydrographi"))))

(deftest test-7723
  (testing "test case 7723"
    (is (= (stemming "emasculator") "emascul"))))

(deftest test-7724
  (testing "test case 7724"
    (is (= (stemming "biffy") "biffi"))))

(deftest test-7725
  (testing "test case 7725"
    (is (= (stemming "tors") "tor"))))

(deftest test-7726
  (testing "test case 7726"
    (is (= (stemming "towed") "tow"))))

(deftest test-7727
  (testing "test case 7727"
    (is (= (stemming "elevated") "elev"))))

(deftest test-7728
  (testing "test case 7728"
    (is (= (stemming "disincline") "disinclin"))))

(deftest test-7729
  (testing "test case 7729"
    (is (= (stemming "pedicuring") "pedicur"))))

(deftest test-7730
  (testing "test case 7730"
    (is (= (stemming "beautifies") "beautifi"))))

(deftest test-7731
  (testing "test case 7731"
    (is (= (stemming "postholes") "posthol"))))

(deftest test-7732
  (testing "test case 7732"
    (is (= (stemming "bards") "bard"))))

(deftest test-7733
  (testing "test case 7733"
    (is (= (stemming "hyperactivities") "hyperact"))))

(deftest test-7734
  (testing "test case 7734"
    (is (= (stemming "renig") "renig"))))

(deftest test-7735
  (testing "test case 7735"
    (is (= (stemming "wobbling") "wobbl"))))

(deftest test-7736
  (testing "test case 7736"
    (is (= (stemming "couplets") "couplet"))))

(deftest test-7737
  (testing "test case 7737"
    (is (= (stemming "creditable") "credit"))))

(deftest test-7738
  (testing "test case 7738"
    (is (= (stemming "frostings") "frost"))))

(deftest test-7739
  (testing "test case 7739"
    (is (= (stemming "hooklets") "hooklet"))))

(deftest test-7740
  (testing "test case 7740"
    (is (= (stemming "degrees") "degre"))))

(deftest test-7741
  (testing "test case 7741"
    (is (= (stemming "slakes") "slake"))))

(deftest test-7742
  (testing "test case 7742"
    (is (= (stemming "jestings") "jest"))))

(deftest test-7743
  (testing "test case 7743"
    (is (= (stemming "moiled") "moil"))))

(deftest test-7744
  (testing "test case 7744"
    (is (= (stemming "fixedness") "fixed"))))

(deftest test-7745
  (testing "test case 7745"
    (is (= (stemming "prearranging") "prearrang"))))

(deftest test-7746
  (testing "test case 7746"
    (is (= (stemming "mustangs") "mustang"))))

(deftest test-7747
  (testing "test case 7747"
    (is (= (stemming "portability") "portabl"))))

(deftest test-7748
  (testing "test case 7748"
    (is (= (stemming "blowoff") "blowoff"))))

(deftest test-7749
  (testing "test case 7749"
    (is (= (stemming "obscuration") "obscur"))))

(deftest test-7750
  (testing "test case 7750"
    (is (= (stemming "shrills") "shrill"))))

(deftest test-7751
  (testing "test case 7751"
    (is (= (stemming "succumbing") "succumb"))))

(deftest test-7752
  (testing "test case 7752"
    (is (= (stemming "behaving") "behav"))))

(deftest test-7753
  (testing "test case 7753"
    (is (= (stemming "masterminds") "mastermind"))))

(deftest test-7754
  (testing "test case 7754"
    (is (= (stemming "psychopathia") "psychopathia"))))

(deftest test-7755
  (testing "test case 7755"
    (is (= (stemming "axons") "axon"))))

(deftest test-7756
  (testing "test case 7756"
    (is (= (stemming "entropy") "entropi"))))

(deftest test-7757
  (testing "test case 7757"
    (is (= (stemming "madhouses") "madhous"))))

(deftest test-7758
  (testing "test case 7758"
    (is (= (stemming "songful") "song"))))

(deftest test-7759
  (testing "test case 7759"
    (is (= (stemming "priested") "priest"))))

(deftest test-7760
  (testing "test case 7760"
    (is (= (stemming "arbitrational") "arbitr"))))

(deftest test-7761
  (testing "test case 7761"
    (is (= (stemming "spaciously") "spacious"))))

(deftest test-7762
  (testing "test case 7762"
    (is (= (stemming "harried") "harri"))))

(deftest test-7763
  (testing "test case 7763"
    (is (= (stemming "croupily") "croupili"))))

(deftest test-7764
  (testing "test case 7764"
    (is (= (stemming "salinizes") "salin"))))

(deftest test-7765
  (testing "test case 7765"
    (is (= (stemming "ensconcing") "ensconc"))))

(deftest test-7766
  (testing "test case 7766"
    (is (= (stemming "whoreson") "whoreson"))))

(deftest test-7767
  (testing "test case 7767"
    (is (= (stemming "glamorizer") "glamor"))))

(deftest test-7768
  (testing "test case 7768"
    (is (= (stemming "heartbeats") "heartbeat"))))

(deftest test-7769
  (testing "test case 7769"
    (is (= (stemming "jabot") "jabot"))))

(deftest test-7770
  (testing "test case 7770"
    (is (= (stemming "nineteens") "nineteen"))))

(deftest test-7771
  (testing "test case 7771"
    (is (= (stemming "butteries") "butteri"))))

(deftest test-7772
  (testing "test case 7772"
    (is (= (stemming "newsdealer") "newsdeal"))))

(deftest test-7773
  (testing "test case 7773"
    (is (= (stemming "geothermic") "geotherm"))))

(deftest test-7774
  (testing "test case 7774"
    (is (= (stemming "metricize") "metric"))))

(deftest test-7775
  (testing "test case 7775"
    (is (= (stemming "grate") "grate"))))

(deftest test-7776
  (testing "test case 7776"
    (is (= (stemming "migraines") "migrain"))))

(deftest test-7777
  (testing "test case 7777"
    (is (= (stemming "leninism") "lenin"))))

(deftest test-7778
  (testing "test case 7778"
    (is (= (stemming "slumbered") "slumber"))))

(deftest test-7779
  (testing "test case 7779"
    (is (= (stemming "monocellular") "monocellular"))))

(deftest test-7780
  (testing "test case 7780"
    (is (= (stemming "sanctuaries") "sanctuari"))))

(deftest test-7781
  (testing "test case 7781"
    (is (= (stemming "surmise") "surmis"))))

(deftest test-7782
  (testing "test case 7782"
    (is (= (stemming "enemy") "enemi"))))

(deftest test-7783
  (testing "test case 7783"
    (is (= (stemming "unwariness") "unwari"))))

(deftest test-7784
  (testing "test case 7784"
    (is (= (stemming "uninvolved") "uninvolv"))))

(deftest test-7785
  (testing "test case 7785"
    (is (= (stemming "heartens") "hearten"))))

(deftest test-7786
  (testing "test case 7786"
    (is (= (stemming "corruptive") "corrupt"))))

(deftest test-7787
  (testing "test case 7787"
    (is (= (stemming "fugitives") "fugit"))))

(deftest test-7788
  (testing "test case 7788"
    (is (= (stemming "capos") "capo"))))

(deftest test-7789
  (testing "test case 7789"
    (is (= (stemming "infernally") "infern"))))

(deftest test-7790
  (testing "test case 7790"
    (is (= (stemming "airstream") "airstream"))))

(deftest test-7791
  (testing "test case 7791"
    (is (= (stemming "message") "messag"))))

(deftest test-7792
  (testing "test case 7792"
    (is (= (stemming "efficacy") "efficaci"))))

(deftest test-7793
  (testing "test case 7793"
    (is (= (stemming "crosscutting") "crosscut"))))

(deftest test-7794
  (testing "test case 7794"
    (is (= (stemming "significate") "signif"))))

(deftest test-7795
  (testing "test case 7795"
    (is (= (stemming "emeer") "emeer"))))

(deftest test-7796
  (testing "test case 7796"
    (is (= (stemming "ambulant") "ambul"))))

(deftest test-7797
  (testing "test case 7797"
    (is (= (stemming "bream") "bream"))))

(deftest test-7798
  (testing "test case 7798"
    (is (= (stemming "absolutest") "absolutest"))))

(deftest test-7799
  (testing "test case 7799"
    (is (= (stemming "elevation") "elev"))))

(deftest test-7800
  (testing "test case 7800"
    (is (= (stemming "blandish") "blandish"))))

(deftest test-7801
  (testing "test case 7801"
    (is (= (stemming "outpace") "outpac"))))

(deftest test-7802
  (testing "test case 7802"
    (is (= (stemming "refunds") "refund"))))

(deftest test-7803
  (testing "test case 7803"
    (is (= (stemming "anorexia") "anorexia"))))

(deftest test-7804
  (testing "test case 7804"
    (is (= (stemming "napless") "napless"))))

(deftest test-7805
  (testing "test case 7805"
    (is (= (stemming "civically") "civic"))))

(deftest test-7806
  (testing "test case 7806"
    (is (= (stemming "precentors") "precentor"))))

(deftest test-7807
  (testing "test case 7807"
    (is (= (stemming "telecommunication") "telecommun"))))

(deftest test-7808
  (testing "test case 7808"
    (is (= (stemming "bound") "bound"))))

(deftest test-7809
  (testing "test case 7809"
    (is (= (stemming "sixpences") "sixpenc"))))

(deftest test-7810
  (testing "test case 7810"
    (is (= (stemming "reverberant") "reverber"))))

(deftest test-7811
  (testing "test case 7811"
    (is (= (stemming "staidest") "staidest"))))

(deftest test-7812
  (testing "test case 7812"
    (is (= (stemming "manpower") "manpow"))))

(deftest test-7813
  (testing "test case 7813"
    (is (= (stemming "rabbet") "rabbet"))))

(deftest test-7814
  (testing "test case 7814"
    (is (= (stemming "areas") "area"))))

(deftest test-7815
  (testing "test case 7815"
    (is (= (stemming "civilizing") "civil"))))

(deftest test-7816
  (testing "test case 7816"
    (is (= (stemming "braincase") "braincas"))))

(deftest test-7817
  (testing "test case 7817"
    (is (= (stemming "tunnelled") "tunnel"))))

(deftest test-7818
  (testing "test case 7818"
    (is (= (stemming "thou") "thou"))))

(deftest test-7819
  (testing "test case 7819"
    (is (= (stemming "dactyl") "dactyl"))))

(deftest test-7820
  (testing "test case 7820"
    (is (= (stemming "camouflagers") "camouflag"))))

(deftest test-7821
  (testing "test case 7821"
    (is (= (stemming "poodle") "poodl"))))

(deftest test-7822
  (testing "test case 7822"
    (is (= (stemming "simplistically") "simplist"))))

(deftest test-7823
  (testing "test case 7823"
    (is (= (stemming "sociologically") "sociolog"))))

(deftest test-7824
  (testing "test case 7824"
    (is (= (stemming "emmy") "emmi"))))

(deftest test-7825
  (testing "test case 7825"
    (is (= (stemming "puler") "puler"))))

(deftest test-7826
  (testing "test case 7826"
    (is (= (stemming "unimaginative") "unimagin"))))

(deftest test-7827
  (testing "test case 7827"
    (is (= (stemming "destroyable") "destroy"))))

(deftest test-7828
  (testing "test case 7828"
    (is (= (stemming "seditiousness") "sediti"))))

(deftest test-7829
  (testing "test case 7829"
    (is (= (stemming "hashing") "hash"))))

(deftest test-7830
  (testing "test case 7830"
    (is (= (stemming "mispronounces") "mispronounc"))))

(deftest test-7831
  (testing "test case 7831"
    (is (= (stemming "harris") "harri"))))

(deftest test-7832
  (testing "test case 7832"
    (is (= (stemming "expropriate") "expropri"))))

(deftest test-7833
  (testing "test case 7833"
    (is (= (stemming "songwriter") "songwrit"))))

(deftest test-7834
  (testing "test case 7834"
    (is (= (stemming "jean") "jean"))))

(deftest test-7835
  (testing "test case 7835"
    (is (= (stemming "cutaways") "cutawai"))))

(deftest test-7836
  (testing "test case 7836"
    (is (= (stemming "tonging") "tong"))))

(deftest test-7837
  (testing "test case 7837"
    (is (= (stemming "asking") "ask"))))

(deftest test-7838
  (testing "test case 7838"
    (is (= (stemming "hexed") "hex"))))

(deftest test-7839
  (testing "test case 7839"
    (is (= (stemming "canalling") "canal"))))

(deftest test-7840
  (testing "test case 7840"
    (is (= (stemming "dwarfest") "dwarfest"))))

(deftest test-7841
  (testing "test case 7841"
    (is (= (stemming "nutcracker") "nutcrack"))))

(deftest test-7842
  (testing "test case 7842"
    (is (= (stemming "coaxes") "coax"))))

(deftest test-7843
  (testing "test case 7843"
    (is (= (stemming "cretins") "cretin"))))

(deftest test-7844
  (testing "test case 7844"
    (is (= (stemming "soddies") "soddi"))))

(deftest test-7845
  (testing "test case 7845"
    (is (= (stemming "literalism") "liter"))))

(deftest test-7846
  (testing "test case 7846"
    (is (= (stemming "inferiority") "inferior"))))

(deftest test-7847
  (testing "test case 7847"
    (is (= (stemming "swinging") "swing"))))

(deftest test-7848
  (testing "test case 7848"
    (is (= (stemming "cajaputs") "cajaput"))))

(deftest test-7849
  (testing "test case 7849"
    (is (= (stemming "prosthodontics") "prosthodont"))))

(deftest test-7850
  (testing "test case 7850"
    (is (= (stemming "outhouses") "outhous"))))

(deftest test-7851
  (testing "test case 7851"
    (is (= (stemming "unlashing") "unlash"))))

(deftest test-7852
  (testing "test case 7852"
    (is (= (stemming "heller") "heller"))))

(deftest test-7853
  (testing "test case 7853"
    (is (= (stemming "cuss") "cuss"))))

(deftest test-7854
  (testing "test case 7854"
    (is (= (stemming "coalless") "coalless"))))

(deftest test-7855
  (testing "test case 7855"
    (is (= (stemming "secretary") "secretari"))))

(deftest test-7856
  (testing "test case 7856"
    (is (= (stemming "anagrams") "anagram"))))

(deftest test-7857
  (testing "test case 7857"
    (is (= (stemming "dull") "dull"))))

(deftest test-7858
  (testing "test case 7858"
    (is (= (stemming "slewing") "slew"))))

(deftest test-7859
  (testing "test case 7859"
    (is (= (stemming "uncleanliness") "uncleanli"))))

(deftest test-7860
  (testing "test case 7860"
    (is (= (stemming "obnoxiousness") "obnoxi"))))

(deftest test-7861
  (testing "test case 7861"
    (is (= (stemming "sovereignly") "sovereignli"))))

(deftest test-7862
  (testing "test case 7862"
    (is (= (stemming "bobbles") "bobbl"))))

(deftest test-7863
  (testing "test case 7863"
    (is (= (stemming "tadpole") "tadpol"))))

(deftest test-7864
  (testing "test case 7864"
    (is (= (stemming "schlocks") "schlock"))))

(deftest test-7865
  (testing "test case 7865"
    (is (= (stemming "unfermented") "unfer"))))

(deftest test-7866
  (testing "test case 7866"
    (is (= (stemming "decontaminated") "decontamin"))))

(deftest test-7867
  (testing "test case 7867"
    (is (= (stemming "separated") "separ"))))

(deftest test-7868
  (testing "test case 7868"
    (is (= (stemming "moseying") "mosei"))))

(deftest test-7869
  (testing "test case 7869"
    (is (= (stemming "patens") "paten"))))

(deftest test-7870
  (testing "test case 7870"
    (is (= (stemming "holistic") "holist"))))

(deftest test-7871
  (testing "test case 7871"
    (is (= (stemming "orgy") "orgi"))))

(deftest test-7872
  (testing "test case 7872"
    (is (= (stemming "shaded") "shade"))))

(deftest test-7873
  (testing "test case 7873"
    (is (= (stemming "reinstates") "reinstat"))))

(deftest test-7874
  (testing "test case 7874"
    (is (= (stemming "placarders") "placard"))))

(deftest test-7875
  (testing "test case 7875"
    (is (= (stemming "bullnose") "bullnos"))))

(deftest test-7876
  (testing "test case 7876"
    (is (= (stemming "scowl") "scowl"))))

(deftest test-7877
  (testing "test case 7877"
    (is (= (stemming "jitterbugs") "jitterbug"))))

(deftest test-7878
  (testing "test case 7878"
    (is (= (stemming "unadulterate") "unadulter"))))

(deftest test-7879
  (testing "test case 7879"
    (is (= (stemming "sagittarius") "sagittariu"))))

(deftest test-7880
  (testing "test case 7880"
    (is (= (stemming "spotting") "spot"))))

(deftest test-7881
  (testing "test case 7881"
    (is (= (stemming "findings") "find"))))

(deftest test-7882
  (testing "test case 7882"
    (is (= (stemming "coddling") "coddl"))))

(deftest test-7883
  (testing "test case 7883"
    (is (= (stemming "eurythmies") "eurythmi"))))

(deftest test-7884
  (testing "test case 7884"
    (is (= (stemming "drub") "drub"))))

(deftest test-7885
  (testing "test case 7885"
    (is (= (stemming "noels") "noel"))))

(deftest test-7886
  (testing "test case 7886"
    (is (= (stemming "deflating") "deflat"))))

(deftest test-7887
  (testing "test case 7887"
    (is (= (stemming "templars") "templar"))))

(deftest test-7888
  (testing "test case 7888"
    (is (= (stemming "id") "id"))))

(deftest test-7889
  (testing "test case 7889"
    (is (= (stemming "fanes") "fane"))))

(deftest test-7890
  (testing "test case 7890"
    (is (= (stemming "reinstating") "reinstat"))))

(deftest test-7891
  (testing "test case 7891"
    (is (= (stemming "communicability") "communic"))))

(deftest test-7892
  (testing "test case 7892"
    (is (= (stemming "jouncing") "jounc"))))

(deftest test-7893
  (testing "test case 7893"
    (is (= (stemming "robotized") "robot"))))

(deftest test-7894
  (testing "test case 7894"
    (is (= (stemming "neurophysiological") "neurophysiolog"))))

(deftest test-7895
  (testing "test case 7895"
    (is (= (stemming "cogences") "cogenc"))))

(deftest test-7896
  (testing "test case 7896"
    (is (= (stemming "gold") "gold"))))

(deftest test-7897
  (testing "test case 7897"
    (is (= (stemming "meditatio") "meditatio"))))

(deftest test-7898
  (testing "test case 7898"
    (is (= (stemming "palmettos") "palmetto"))))

(deftest test-7899
  (testing "test case 7899"
    (is (= (stemming "meniscal") "menisc"))))

(deftest test-7900
  (testing "test case 7900"
    (is (= (stemming "dagobas") "dagoba"))))

(deftest test-7901
  (testing "test case 7901"
    (is (= (stemming "homegrown") "homegrown"))))

(deftest test-7902
  (testing "test case 7902"
    (is (= (stemming "debauchee") "debauche"))))

(deftest test-7903
  (testing "test case 7903"
    (is (= (stemming "invariability") "invari"))))

(deftest test-7904
  (testing "test case 7904"
    (is (= (stemming "snaps") "snap"))))

(deftest test-7905
  (testing "test case 7905"
    (is (= (stemming "salubriously") "salubri"))))

(deftest test-7906
  (testing "test case 7906"
    (is (= (stemming "nonfatally") "nonfat"))))

(deftest test-7907
  (testing "test case 7907"
    (is (= (stemming "hasteners") "hasten"))))

(deftest test-7908
  (testing "test case 7908"
    (is (= (stemming "recompense") "recompens"))))

(deftest test-7909
  (testing "test case 7909"
    (is (= (stemming "dejected") "deject"))))

(deftest test-7910
  (testing "test case 7910"
    (is (= (stemming "sandalling") "sandal"))))

(deftest test-7911
  (testing "test case 7911"
    (is (= (stemming "stereograph") "stereograph"))))

(deftest test-7912
  (testing "test case 7912"
    (is (= (stemming "phrasal") "phrasal"))))

(deftest test-7913
  (testing "test case 7913"
    (is (= (stemming "overhauling") "overhaul"))))

(deftest test-7914
  (testing "test case 7914"
    (is (= (stemming "uruguay") "uruguai"))))

(deftest test-7915
  (testing "test case 7915"
    (is (= (stemming "squirmier") "squirmier"))))

(deftest test-7916
  (testing "test case 7916"
    (is (= (stemming "bizarres") "bizarr"))))

(deftest test-7917
  (testing "test case 7917"
    (is (= (stemming "seclude") "seclud"))))

(deftest test-7918
  (testing "test case 7918"
    (is (= (stemming "colitises") "colitis"))))

(deftest test-7919
  (testing "test case 7919"
    (is (= (stemming "interjectors") "interjector"))))

(deftest test-7920
  (testing "test case 7920"
    (is (= (stemming "gatefolds") "gatefold"))))

(deftest test-7921
  (testing "test case 7921"
    (is (= (stemming "jujuist") "jujuist"))))

(deftest test-7922
  (testing "test case 7922"
    (is (= (stemming "tubber") "tubber"))))

(deftest test-7923
  (testing "test case 7923"
    (is (= (stemming "sited") "site"))))

(deftest test-7924
  (testing "test case 7924"
    (is (= (stemming "hassles") "hassl"))))

(deftest test-7925
  (testing "test case 7925"
    (is (= (stemming "imputable") "imput"))))

(deftest test-7926
  (testing "test case 7926"
    (is (= (stemming "diversionist") "diversionist"))))

(deftest test-7927
  (testing "test case 7927"
    (is (= (stemming "emptying") "empti"))))

(deftest test-7928
  (testing "test case 7928"
    (is (= (stemming "unsnapping") "unsnap"))))

(deftest test-7929
  (testing "test case 7929"
    (is (= (stemming "phrenologies") "phrenolog"))))

(deftest test-7930
  (testing "test case 7930"
    (is (= (stemming "aerodrome") "aerodrom"))))

(deftest test-7931
  (testing "test case 7931"
    (is (= (stemming "revolts") "revolt"))))

(deftest test-7932
  (testing "test case 7932"
    (is (= (stemming "universalized") "univers"))))

(deftest test-7933
  (testing "test case 7933"
    (is (= (stemming "nitrocellulosic") "nitrocellulos"))))

(deftest test-7934
  (testing "test case 7934"
    (is (= (stemming "sparkily") "sparkili"))))

(deftest test-7935
  (testing "test case 7935"
    (is (= (stemming "felicitation") "felicit"))))

(deftest test-7936
  (testing "test case 7936"
    (is (= (stemming "datedness") "dated"))))

(deftest test-7937
  (testing "test case 7937"
    (is (= (stemming "spongers") "sponger"))))

(deftest test-7938
  (testing "test case 7938"
    (is (= (stemming "sri") "sri"))))

(deftest test-7939
  (testing "test case 7939"
    (is (= (stemming "shay") "shai"))))

(deftest test-7940
  (testing "test case 7940"
    (is (= (stemming "washcloth") "washcloth"))))

(deftest test-7941
  (testing "test case 7941"
    (is (= (stemming "lindens") "linden"))))

(deftest test-7942
  (testing "test case 7942"
    (is (= (stemming "creature") "creatur"))))

(deftest test-7943
  (testing "test case 7943"
    (is (= (stemming "soil") "soil"))))

(deftest test-7944
  (testing "test case 7944"
    (is (= (stemming "nepotist") "nepotist"))))

(deftest test-7945
  (testing "test case 7945"
    (is (= (stemming "jai") "jai"))))

(deftest test-7946
  (testing "test case 7946"
    (is (= (stemming "televiewer") "teleview"))))

(deftest test-7947
  (testing "test case 7947"
    (is (= (stemming "diploidy") "diploidi"))))

(deftest test-7948
  (testing "test case 7948"
    (is (= (stemming "bangtails") "bangtail"))))

(deftest test-7949
  (testing "test case 7949"
    (is (= (stemming "mammoth") "mammoth"))))

(deftest test-7950
  (testing "test case 7950"
    (is (= (stemming "evanishes") "evanish"))))

(deftest test-7951
  (testing "test case 7951"
    (is (= (stemming "perorations") "peror"))))

(deftest test-7952
  (testing "test case 7952"
    (is (= (stemming "outsold") "outsold"))))

(deftest test-7953
  (testing "test case 7953"
    (is (= (stemming "intermixing") "intermix"))))

(deftest test-7954
  (testing "test case 7954"
    (is (= (stemming "cantoned") "canton"))))

(deftest test-7955
  (testing "test case 7955"
    (is (= (stemming "burned") "burn"))))

(deftest test-7956
  (testing "test case 7956"
    (is (= (stemming "overjoying") "overjoi"))))

(deftest test-7957
  (testing "test case 7957"
    (is (= (stemming "eyeteeth") "eyeteeth"))))

(deftest test-7958
  (testing "test case 7958"
    (is (= (stemming "essayers") "essay"))))

(deftest test-7959
  (testing "test case 7959"
    (is (= (stemming "lucrative") "lucr"))))

(deftest test-7960
  (testing "test case 7960"
    (is (= (stemming "vigorously") "vigor"))))

(deftest test-7961
  (testing "test case 7961"
    (is (= (stemming "whirled") "whirl"))))

(deftest test-7962
  (testing "test case 7962"
    (is (= (stemming "omnibus") "omnibu"))))

(deftest test-7963
  (testing "test case 7963"
    (is (= (stemming "agnosticism") "agnostic"))))

(deftest test-7964
  (testing "test case 7964"
    (is (= (stemming "sextuplet") "sextuplet"))))

(deftest test-7965
  (testing "test case 7965"
    (is (= (stemming "reestablishment") "reestablish"))))

(deftest test-7966
  (testing "test case 7966"
    (is (= (stemming "slowworm") "slowworm"))))

(deftest test-7967
  (testing "test case 7967"
    (is (= (stemming "biorhythmicities") "biorhythm"))))

(deftest test-7968
  (testing "test case 7968"
    (is (= (stemming "babushka") "babushka"))))

(deftest test-7969
  (testing "test case 7969"
    (is (= (stemming "sinter") "sinter"))))

(deftest test-7970
  (testing "test case 7970"
    (is (= (stemming "arteriogram") "arteriogram"))))

(deftest test-7971
  (testing "test case 7971"
    (is (= (stemming "queasy") "queasi"))))

(deftest test-7972
  (testing "test case 7972"
    (is (= (stemming "ghoulishness") "ghoulish"))))

(deftest test-7973
  (testing "test case 7973"
    (is (= (stemming "herpetological") "herpetolog"))))

(deftest test-7974
  (testing "test case 7974"
    (is (= (stemming "gyrfalcons") "gyrfalcon"))))

(deftest test-7975
  (testing "test case 7975"
    (is (= (stemming "embezzled") "embezzl"))))

(deftest test-7976
  (testing "test case 7976"
    (is (= (stemming "hypnotizable") "hypnotiz"))))

(deftest test-7977
  (testing "test case 7977"
    (is (= (stemming "preeminently") "preemin"))))

(deftest test-7978
  (testing "test case 7978"
    (is (= (stemming "alertness") "alert"))))

(deftest test-7979
  (testing "test case 7979"
    (is (= (stemming "reradiates") "reradi"))))

(deftest test-7980
  (testing "test case 7980"
    (is (= (stemming "whereon") "whereon"))))

(deftest test-7981
  (testing "test case 7981"
    (is (= (stemming "drily") "drili"))))

(deftest test-7982
  (testing "test case 7982"
    (is (= (stemming "castigate") "castig"))))

(deftest test-7983
  (testing "test case 7983"
    (is (= (stemming "sireless") "sireless"))))

(deftest test-7984
  (testing "test case 7984"
    (is (= (stemming "cachepot") "cachepot"))))

(deftest test-7985
  (testing "test case 7985"
    (is (= (stemming "careener") "careen"))))

(deftest test-7986
  (testing "test case 7986"
    (is (= (stemming "ignoring") "ignor"))))

(deftest test-7987
  (testing "test case 7987"
    (is (= (stemming "varsity") "varsiti"))))

(deftest test-7988
  (testing "test case 7988"
    (is (= (stemming "sermonizing") "sermon"))))

(deftest test-7989
  (testing "test case 7989"
    (is (= (stemming "aphasiacs") "aphasiac"))))

(deftest test-7990
  (testing "test case 7990"
    (is (= (stemming "colludes") "collud"))))

(deftest test-7991
  (testing "test case 7991"
    (is (= (stemming "turnable") "turnabl"))))

(deftest test-7992
  (testing "test case 7992"
    (is (= (stemming "hydroelectric") "hydroelectr"))))

(deftest test-7993
  (testing "test case 7993"
    (is (= (stemming "tearing") "tear"))))

(deftest test-7994
  (testing "test case 7994"
    (is (= (stemming "advertizer") "advert"))))

(deftest test-7995
  (testing "test case 7995"
    (is (= (stemming "tubal") "tubal"))))

(deftest test-7996
  (testing "test case 7996"
    (is (= (stemming "neckless") "neckless"))))

(deftest test-7997
  (testing "test case 7997"
    (is (= (stemming "hallow") "hallow"))))

(deftest test-7998
  (testing "test case 7998"
    (is (= (stemming "materiel") "materiel"))))

(deftest test-7999
  (testing "test case 7999"
    (is (= (stemming "unconstitutional") "unconstitut"))))

(deftest test-8000
  (testing "test case 8000"
    (is (= (stemming "astigmatism") "astigmat"))))

(deftest test-8001
  (testing "test case 8001"
    (is (= (stemming "lyricizing") "lyric"))))

(deftest test-8002
  (testing "test case 8002"
    (is (= (stemming "chalet") "chalet"))))

(deftest test-8003
  (testing "test case 8003"
    (is (= (stemming "collaborationists") "collaborationist"))))

(deftest test-8004
  (testing "test case 8004"
    (is (= (stemming "alienisms") "alien"))))

(deftest test-8005
  (testing "test case 8005"
    (is (= (stemming "perspires") "perspir"))))

(deftest test-8006
  (testing "test case 8006"
    (is (= (stemming "skittish") "skittish"))))

(deftest test-8007
  (testing "test case 8007"
    (is (= (stemming "shuffler") "shuffler"))))

(deftest test-8008
  (testing "test case 8008"
    (is (= (stemming "complicate") "complic"))))

(deftest test-8009
  (testing "test case 8009"
    (is (= (stemming "walkaways") "walkawai"))))

(deftest test-8010
  (testing "test case 8010"
    (is (= (stemming "madeira") "madeira"))))

(deftest test-8011
  (testing "test case 8011"
    (is (= (stemming "rheumy") "rheumi"))))

(deftest test-8012
  (testing "test case 8012"
    (is (= (stemming "dispirit") "dispirit"))))

(deftest test-8013
  (testing "test case 8013"
    (is (= (stemming "soapworts") "soapwort"))))

(deftest test-8014
  (testing "test case 8014"
    (is (= (stemming "recomposition") "recomposit"))))

(deftest test-8015
  (testing "test case 8015"
    (is (= (stemming "harts") "hart"))))

(deftest test-8016
  (testing "test case 8016"
    (is (= (stemming "baric") "baric"))))

(deftest test-8017
  (testing "test case 8017"
    (is (= (stemming "septs") "sept"))))

(deftest test-8018
  (testing "test case 8018"
    (is (= (stemming "embraced") "embrac"))))

(deftest test-8019
  (testing "test case 8019"
    (is (= (stemming "chancer") "chancer"))))

(deftest test-8020
  (testing "test case 8020"
    (is (= (stemming "budgie") "budgi"))))

(deftest test-8021
  (testing "test case 8021"
    (is (= (stemming "selves") "selv"))))

(deftest test-8022
  (testing "test case 8022"
    (is (= (stemming "reconsiders") "reconsid"))))

(deftest test-8023
  (testing "test case 8023"
    (is (= (stemming "inveigler") "inveigl"))))

(deftest test-8024
  (testing "test case 8024"
    (is (= (stemming "quatrefoils") "quatrefoil"))))

(deftest test-8025
  (testing "test case 8025"
    (is (= (stemming "privations") "privat"))))

(deftest test-8026
  (testing "test case 8026"
    (is (= (stemming "graciosos") "gracioso"))))

(deftest test-8027
  (testing "test case 8027"
    (is (= (stemming "korsakoff") "korsakoff"))))

(deftest test-8028
  (testing "test case 8028"
    (is (= (stemming "molten") "molten"))))

(deftest test-8029
  (testing "test case 8029"
    (is (= (stemming "ravenously") "raven"))))

(deftest test-8030
  (testing "test case 8030"
    (is (= (stemming "color") "color"))))

(deftest test-8031
  (testing "test case 8031"
    (is (= (stemming "soy") "soi"))))

(deftest test-8032
  (testing "test case 8032"
    (is (= (stemming "haunted") "haunt"))))

(deftest test-8033
  (testing "test case 8033"
    (is (= (stemming "catechizing") "catech"))))

(deftest test-8034
  (testing "test case 8034"
    (is (= (stemming "ojibwa") "ojibwa"))))

(deftest test-8035
  (testing "test case 8035"
    (is (= (stemming "wades") "wade"))))

(deftest test-8036
  (testing "test case 8036"
    (is (= (stemming "wakens") "waken"))))

(deftest test-8037
  (testing "test case 8037"
    (is (= (stemming "scaling") "scale"))))

(deftest test-8038
  (testing "test case 8038"
    (is (= (stemming "ordainer") "ordain"))))

(deftest test-8039
  (testing "test case 8039"
    (is (= (stemming "pithier") "pithier"))))

(deftest test-8040
  (testing "test case 8040"
    (is (= (stemming "papoose") "papoos"))))

(deftest test-8041
  (testing "test case 8041"
    (is (= (stemming "rooms") "room"))))

(deftest test-8042
  (testing "test case 8042"
    (is (= (stemming "upstream") "upstream"))))

(deftest test-8043
  (testing "test case 8043"
    (is (= (stemming "trowel") "trowel"))))

(deftest test-8044
  (testing "test case 8044"
    (is (= (stemming "dissentients") "dissenti"))))

(deftest test-8045
  (testing "test case 8045"
    (is (= (stemming "ruddiest") "ruddiest"))))

(deftest test-8046
  (testing "test case 8046"
    (is (= (stemming "homemade") "homemad"))))

(deftest test-8047
  (testing "test case 8047"
    (is (= (stemming "unperturbably") "unperturb"))))

(deftest test-8048
  (testing "test case 8048"
    (is (= (stemming "conjugate") "conjug"))))

(deftest test-8049
  (testing "test case 8049"
    (is (= (stemming "hailer") "hailer"))))

(deftest test-8050
  (testing "test case 8050"
    (is (= (stemming "sahuaros") "sahuaro"))))

(deftest test-8051
  (testing "test case 8051"
    (is (= (stemming "upholstery") "upholsteri"))))

(deftest test-8052
  (testing "test case 8052"
    (is (= (stemming "androgynism") "androgyn"))))

(deftest test-8053
  (testing "test case 8053"
    (is (= (stemming "shirked") "shirk"))))

(deftest test-8054
  (testing "test case 8054"
    (is (= (stemming "unravelling") "unravel"))))

(deftest test-8055
  (testing "test case 8055"
    (is (= (stemming "undercharge") "undercharg"))))

(deftest test-8056
  (testing "test case 8056"
    (is (= (stemming "realist") "realist"))))

(deftest test-8057
  (testing "test case 8057"
    (is (= (stemming "distich") "distich"))))

(deftest test-8058
  (testing "test case 8058"
    (is (= (stemming "unsling") "unsl"))))

(deftest test-8059
  (testing "test case 8059"
    (is (= (stemming "lightly") "lightli"))))

(deftest test-8060
  (testing "test case 8060"
    (is (= (stemming "yahooisms") "yahooism"))))

(deftest test-8061
  (testing "test case 8061"
    (is (= (stemming "chowchows") "chowchow"))))

(deftest test-8062
  (testing "test case 8062"
    (is (= (stemming "manifesting") "manifest"))))

(deftest test-8063
  (testing "test case 8063"
    (is (= (stemming "reservations") "reserv"))))

(deftest test-8064
  (testing "test case 8064"
    (is (= (stemming "lullingly") "lullingli"))))

(deftest test-8065
  (testing "test case 8065"
    (is (= (stemming "invalidism") "invalid"))))

(deftest test-8066
  (testing "test case 8066"
    (is (= (stemming "entrusting") "entrust"))))

(deftest test-8067
  (testing "test case 8067"
    (is (= (stemming "overtaxed") "overtax"))))

(deftest test-8068
  (testing "test case 8068"
    (is (= (stemming "holer") "holer"))))

(deftest test-8069
  (testing "test case 8069"
    (is (= (stemming "bronc") "bronc"))))

(deftest test-8070
  (testing "test case 8070"
    (is (= (stemming "jupiter") "jupit"))))

(deftest test-8071
  (testing "test case 8071"
    (is (= (stemming "briefcases") "briefcas"))))

(deftest test-8072
  (testing "test case 8072"
    (is (= (stemming "lollipops") "lollipop"))))

(deftest test-8073
  (testing "test case 8073"
    (is (= (stemming "liverpool") "liverpool"))))

(deftest test-8074
  (testing "test case 8074"
    (is (= (stemming "heartbroken") "heartbroken"))))

(deftest test-8075
  (testing "test case 8075"
    (is (= (stemming "anus") "anu"))))

(deftest test-8076
  (testing "test case 8076"
    (is (= (stemming "morph") "morph"))))

(deftest test-8077
  (testing "test case 8077"
    (is (= (stemming "consultatory") "consultatori"))))

(deftest test-8078
  (testing "test case 8078"
    (is (= (stemming "anomy") "anomi"))))

(deftest test-8079
  (testing "test case 8079"
    (is (= (stemming "reannexed") "reannex"))))

(deftest test-8080
  (testing "test case 8080"
    (is (= (stemming "sixty") "sixti"))))

(deftest test-8081
  (testing "test case 8081"
    (is (= (stemming "hamburger") "hamburg"))))

(deftest test-8082
  (testing "test case 8082"
    (is (= (stemming "outchiding") "outchid"))))

(deftest test-8083
  (testing "test case 8083"
    (is (= (stemming "anises") "anis"))))

(deftest test-8084
  (testing "test case 8084"
    (is (= (stemming "inasmuch") "inasmuch"))))

(deftest test-8085
  (testing "test case 8085"
    (is (= (stemming "correctives") "correct"))))

(deftest test-8086
  (testing "test case 8086"
    (is (= (stemming "circumstances") "circumst"))))

(deftest test-8087
  (testing "test case 8087"
    (is (= (stemming "wheelbarrow") "wheelbarrow"))))

(deftest test-8088
  (testing "test case 8088"
    (is (= (stemming "frescoer") "frescoer"))))

(deftest test-8089
  (testing "test case 8089"
    (is (= (stemming "nominator") "nomin"))))

(deftest test-8090
  (testing "test case 8090"
    (is (= (stemming "chints") "chint"))))

(deftest test-8091
  (testing "test case 8091"
    (is (= (stemming "tired") "tire"))))

(deftest test-8092
  (testing "test case 8092"
    (is (= (stemming "projectors") "projector"))))

(deftest test-8093
  (testing "test case 8093"
    (is (= (stemming "ovals") "oval"))))

(deftest test-8094
  (testing "test case 8094"
    (is (= (stemming "emulsible") "emuls"))))

(deftest test-8095
  (testing "test case 8095"
    (is (= (stemming "nictation") "nictat"))))

(deftest test-8096
  (testing "test case 8096"
    (is (= (stemming "ambience") "ambienc"))))

(deftest test-8097
  (testing "test case 8097"
    (is (= (stemming "disinter") "disint"))))

(deftest test-8098
  (testing "test case 8098"
    (is (= (stemming "pollacks") "pollack"))))

(deftest test-8099
  (testing "test case 8099"
    (is (= (stemming "trespassers") "trespass"))))

(deftest test-8100
  (testing "test case 8100"
    (is (= (stemming "stormier") "stormier"))))

(deftest test-8101
  (testing "test case 8101"
    (is (= (stemming "tauruses") "taurus"))))

(deftest test-8102
  (testing "test case 8102"
    (is (= (stemming "geodesist") "geodesist"))))

(deftest test-8103
  (testing "test case 8103"
    (is (= (stemming "aborigines") "aborigin"))))

(deftest test-8104
  (testing "test case 8104"
    (is (= (stemming "juttingly") "juttingli"))))

(deftest test-8105
  (testing "test case 8105"
    (is (= (stemming "aggrandizer") "aggrand"))))

(deftest test-8106
  (testing "test case 8106"
    (is (= (stemming "antimagnetic") "antimagnet"))))

(deftest test-8107
  (testing "test case 8107"
    (is (= (stemming "horizon") "horizon"))))

(deftest test-8108
  (testing "test case 8108"
    (is (= (stemming "inexhaustibly") "inexhaust"))))

(deftest test-8109
  (testing "test case 8109"
    (is (= (stemming "supposition") "supposit"))))

(deftest test-8110
  (testing "test case 8110"
    (is (= (stemming "erosely") "eros"))))

(deftest test-8111
  (testing "test case 8111"
    (is (= (stemming "grandiloquent") "grandiloqu"))))

(deftest test-8112
  (testing "test case 8112"
    (is (= (stemming "vising") "vise"))))

(deftest test-8113
  (testing "test case 8113"
    (is (= (stemming "randiest") "randiest"))))

(deftest test-8114
  (testing "test case 8114"
    (is (= (stemming "wrist") "wrist"))))

(deftest test-8115
  (testing "test case 8115"
    (is (= (stemming "decagram") "decagram"))))

(deftest test-8116
  (testing "test case 8116"
    (is (= (stemming "straighted") "straight"))))

(deftest test-8117
  (testing "test case 8117"
    (is (= (stemming "miens") "mien"))))

(deftest test-8118
  (testing "test case 8118"
    (is (= (stemming "from") "from"))))

(deftest test-8119
  (testing "test case 8119"
    (is (= (stemming "dissolutions") "dissolut"))))

(deftest test-8120
  (testing "test case 8120"
    (is (= (stemming "centralizer") "central"))))

(deftest test-8121
  (testing "test case 8121"
    (is (= (stemming "unsanitary") "unsanitari"))))

(deftest test-8122
  (testing "test case 8122"
    (is (= (stemming "echoless") "echoless"))))

(deftest test-8123
  (testing "test case 8123"
    (is (= (stemming "outpouring") "outpour"))))

(deftest test-8124
  (testing "test case 8124"
    (is (= (stemming "pupilar") "pupilar"))))

(deftest test-8125
  (testing "test case 8125"
    (is (= (stemming "effectuation") "effectu"))))

(deftest test-8126
  (testing "test case 8126"
    (is (= (stemming "coitophobia") "coitophobia"))))

(deftest test-8127
  (testing "test case 8127"
    (is (= (stemming "organizes") "organ"))))

(deftest test-8128
  (testing "test case 8128"
    (is (= (stemming "loaf") "loaf"))))

(deftest test-8129
  (testing "test case 8129"
    (is (= (stemming "quadrangle") "quadrangl"))))

(deftest test-8130
  (testing "test case 8130"
    (is (= (stemming "mobilize") "mobil"))))

(deftest test-8131
  (testing "test case 8131"
    (is (= (stemming "repairable") "repair"))))

(deftest test-8132
  (testing "test case 8132"
    (is (= (stemming "rash") "rash"))))

(deftest test-8133
  (testing "test case 8133"
    (is (= (stemming "colorings") "color"))))

(deftest test-8134
  (testing "test case 8134"
    (is (= (stemming "mariners") "marin"))))

(deftest test-8135
  (testing "test case 8135"
    (is (= (stemming "paranoiac") "paranoiac"))))

(deftest test-8136
  (testing "test case 8136"
    (is (= (stemming "sputtering") "sputter"))))

(deftest test-8137
  (testing "test case 8137"
    (is (= (stemming "retitle") "retitl"))))

(deftest test-8138
  (testing "test case 8138"
    (is (= (stemming "tarried") "tarri"))))

(deftest test-8139
  (testing "test case 8139"
    (is (= (stemming "gate") "gate"))))

(deftest test-8140
  (testing "test case 8140"
    (is (= (stemming "aldermanry") "aldermanri"))))

(deftest test-8141
  (testing "test case 8141"
    (is (= (stemming "maundered") "maunder"))))

(deftest test-8142
  (testing "test case 8142"
    (is (= (stemming "hoyden") "hoyden"))))

(deftest test-8143
  (testing "test case 8143"
    (is (= (stemming "atrocity") "atroc"))))

(deftest test-8144
  (testing "test case 8144"
    (is (= (stemming "refulgence") "refulg"))))

(deftest test-8145
  (testing "test case 8145"
    (is (= (stemming "nonseasonal") "nonseason"))))

(deftest test-8146
  (testing "test case 8146"
    (is (= (stemming "confluences") "confluenc"))))

(deftest test-8147
  (testing "test case 8147"
    (is (= (stemming "except") "except"))))

(deftest test-8148
  (testing "test case 8148"
    (is (= (stemming "cocoanut") "cocoanut"))))

(deftest test-8149
  (testing "test case 8149"
    (is (= (stemming "grantee") "grante"))))

(deftest test-8150
  (testing "test case 8150"
    (is (= (stemming "lessees") "lesse"))))

(deftest test-8151
  (testing "test case 8151"
    (is (= (stemming "chiselled") "chisel"))))

(deftest test-8152
  (testing "test case 8152"
    (is (= (stemming "transplanting") "transplant"))))

(deftest test-8153
  (testing "test case 8153"
    (is (= (stemming "nonpredatory") "nonpredatori"))))

(deftest test-8154
  (testing "test case 8154"
    (is (= (stemming "whishted") "whisht"))))

(deftest test-8155
  (testing "test case 8155"
    (is (= (stemming "autographing") "autograph"))))

(deftest test-8156
  (testing "test case 8156"
    (is (= (stemming "adam") "adam"))))

(deftest test-8157
  (testing "test case 8157"
    (is (= (stemming "colorcasting") "colorcast"))))

(deftest test-8158
  (testing "test case 8158"
    (is (= (stemming "spearheads") "spearhead"))))

(deftest test-8159
  (testing "test case 8159"
    (is (= (stemming "stylishly") "stylishli"))))

(deftest test-8160
  (testing "test case 8160"
    (is (= (stemming "stoopingly") "stoopingli"))))

(deftest test-8161
  (testing "test case 8161"
    (is (= (stemming "unlatching") "unlatch"))))

(deftest test-8162
  (testing "test case 8162"
    (is (= (stemming "wishbones") "wishbon"))))

(deftest test-8163
  (testing "test case 8163"
    (is (= (stemming "cowbird") "cowbird"))))

(deftest test-8164
  (testing "test case 8164"
    (is (= (stemming "ionizable") "ioniz"))))

(deftest test-8165
  (testing "test case 8165"
    (is (= (stemming "irate") "irat"))))

(deftest test-8166
  (testing "test case 8166"
    (is (= (stemming "interesting") "interest"))))

(deftest test-8167
  (testing "test case 8167"
    (is (= (stemming "overgrowing") "overgrow"))))

(deftest test-8168
  (testing "test case 8168"
    (is (= (stemming "hurdle") "hurdl"))))

(deftest test-8169
  (testing "test case 8169"
    (is (= (stemming "parquet") "parquet"))))

(deftest test-8170
  (testing "test case 8170"
    (is (= (stemming "rummy") "rummi"))))

(deftest test-8171
  (testing "test case 8171"
    (is (= (stemming "crosstie") "crossti"))))

(deftest test-8172
  (testing "test case 8172"
    (is (= (stemming "stumblingly") "stumblingli"))))

(deftest test-8173
  (testing "test case 8173"
    (is (= (stemming "marque") "marqu"))))

(deftest test-8174
  (testing "test case 8174"
    (is (= (stemming "reawaking") "reawak"))))

(deftest test-8175
  (testing "test case 8175"
    (is (= (stemming "conjured") "conjur"))))

(deftest test-8176
  (testing "test case 8176"
    (is (= (stemming "aircraft") "aircraft"))))

(deftest test-8177
  (testing "test case 8177"
    (is (= (stemming "bosun") "bosun"))))

(deftest test-8178
  (testing "test case 8178"
    (is (= (stemming "disparagement") "disparag"))))

(deftest test-8179
  (testing "test case 8179"
    (is (= (stemming "inappreciable") "inappreci"))))

(deftest test-8180
  (testing "test case 8180"
    (is (= (stemming "orchestrating") "orchestr"))))

(deftest test-8181
  (testing "test case 8181"
    (is (= (stemming "doping") "dope"))))

(deftest test-8182
  (testing "test case 8182"
    (is (= (stemming "suppurate") "suppur"))))

(deftest test-8183
  (testing "test case 8183"
    (is (= (stemming "communicatively") "commun"))))

(deftest test-8184
  (testing "test case 8184"
    (is (= (stemming "inspirational") "inspir"))))

(deftest test-8185
  (testing "test case 8185"
    (is (= (stemming "schoolroom") "schoolroom"))))

(deftest test-8186
  (testing "test case 8186"
    (is (= (stemming "frances") "franc"))))

(deftest test-8187
  (testing "test case 8187"
    (is (= (stemming "unyoked") "unyok"))))

(deftest test-8188
  (testing "test case 8188"
    (is (= (stemming "daylights") "daylight"))))

(deftest test-8189
  (testing "test case 8189"
    (is (= (stemming "whiffer") "whiffer"))))

(deftest test-8190
  (testing "test case 8190"
    (is (= (stemming "evaporators") "evapor"))))

(deftest test-8191
  (testing "test case 8191"
    (is (= (stemming "solicitousness") "solicit"))))

(deftest test-8192
  (testing "test case 8192"
    (is (= (stemming "pettiness") "petti"))))

(deftest test-8193
  (testing "test case 8193"
    (is (= (stemming "cullied") "culli"))))

(deftest test-8194
  (testing "test case 8194"
    (is (= (stemming "perception") "percept"))))

(deftest test-8195
  (testing "test case 8195"
    (is (= (stemming "nebulosities") "nebulos"))))

(deftest test-8196
  (testing "test case 8196"
    (is (= (stemming "regiments") "regiment"))))

(deftest test-8197
  (testing "test case 8197"
    (is (= (stemming "ligatures") "ligatur"))))

(deftest test-8198
  (testing "test case 8198"
    (is (= (stemming "litten") "litten"))))

(deftest test-8199
  (testing "test case 8199"
    (is (= (stemming "dybbuks") "dybbuk"))))

(deftest test-8200
  (testing "test case 8200"
    (is (= (stemming "cornets") "cornet"))))

(deftest test-8201
  (testing "test case 8201"
    (is (= (stemming "hinter") "hinter"))))

(deftest test-8202
  (testing "test case 8202"
    (is (= (stemming "ordain") "ordain"))))

(deftest test-8203
  (testing "test case 8203"
    (is (= (stemming "ramies") "rami"))))

(deftest test-8204
  (testing "test case 8204"
    (is (= (stemming "controversy") "controversi"))))

(deftest test-8205
  (testing "test case 8205"
    (is (= (stemming "smellier") "smellier"))))

(deftest test-8206
  (testing "test case 8206"
    (is (= (stemming "oblate") "oblat"))))

(deftest test-8207
  (testing "test case 8207"
    (is (= (stemming "ooziness") "oozi"))))

(deftest test-8208
  (testing "test case 8208"
    (is (= (stemming "braveness") "brave"))))

(deftest test-8209
  (testing "test case 8209"
    (is (= (stemming "build") "build"))))

(deftest test-8210
  (testing "test case 8210"
    (is (= (stemming "soever") "soever"))))

(deftest test-8211
  (testing "test case 8211"
    (is (= (stemming "sexualizing") "sexual"))))

(deftest test-8212
  (testing "test case 8212"
    (is (= (stemming "ankh") "ankh"))))

(deftest test-8213
  (testing "test case 8213"
    (is (= (stemming "proofs") "proof"))))

(deftest test-8214
  (testing "test case 8214"
    (is (= (stemming "postponed") "postpon"))))

(deftest test-8215
  (testing "test case 8215"
    (is (= (stemming "emblazing") "emblaz"))))

(deftest test-8216
  (testing "test case 8216"
    (is (= (stemming "redolence") "redol"))))

(deftest test-8217
  (testing "test case 8217"
    (is (= (stemming "accidence") "accid"))))

(deftest test-8218
  (testing "test case 8218"
    (is (= (stemming "hopi") "hopi"))))

(deftest test-8219
  (testing "test case 8219"
    (is (= (stemming "polytheists") "polytheist"))))

(deftest test-8220
  (testing "test case 8220"
    (is (= (stemming "institutions") "institut"))))

(deftest test-8221
  (testing "test case 8221"
    (is (= (stemming "bathos") "batho"))))

(deftest test-8222
  (testing "test case 8222"
    (is (= (stemming "misaim") "misaim"))))

(deftest test-8223
  (testing "test case 8223"
    (is (= (stemming "citing") "cite"))))

(deftest test-8224
  (testing "test case 8224"
    (is (= (stemming "upcoiling") "upcoil"))))

(deftest test-8225
  (testing "test case 8225"
    (is (= (stemming "fitness") "fit"))))

(deftest test-8226
  (testing "test case 8226"
    (is (= (stemming "grumblers") "grumbler"))))

(deftest test-8227
  (testing "test case 8227"
    (is (= (stemming "narcotherapy") "narcotherapi"))))

(deftest test-8228
  (testing "test case 8228"
    (is (= (stemming "intercostal") "intercost"))))

(deftest test-8229
  (testing "test case 8229"
    (is (= (stemming "versos") "verso"))))

(deftest test-8230
  (testing "test case 8230"
    (is (= (stemming "pervading") "pervad"))))

(deftest test-8231
  (testing "test case 8231"
    (is (= (stemming "orbits") "orbit"))))

(deftest test-8232
  (testing "test case 8232"
    (is (= (stemming "noire") "noir"))))

(deftest test-8233
  (testing "test case 8233"
    (is (= (stemming "obligatory") "obligatori"))))

(deftest test-8234
  (testing "test case 8234"
    (is (= (stemming "retain") "retain"))))

(deftest test-8235
  (testing "test case 8235"
    (is (= (stemming "decorum") "decorum"))))

(deftest test-8236
  (testing "test case 8236"
    (is (= (stemming "conquian") "conquian"))))

(deftest test-8237
  (testing "test case 8237"
    (is (= (stemming "spiracle") "spiracl"))))

(deftest test-8238
  (testing "test case 8238"
    (is (= (stemming "intercommunicate") "intercommun"))))

(deftest test-8239
  (testing "test case 8239"
    (is (= (stemming "delectation") "delect"))))

(deftest test-8240
  (testing "test case 8240"
    (is (= (stemming "defilement") "defil"))))

(deftest test-8241
  (testing "test case 8241"
    (is (= (stemming "cogitos") "cogito"))))

(deftest test-8242
  (testing "test case 8242"
    (is (= (stemming "pontes") "pont"))))

(deftest test-8243
  (testing "test case 8243"
    (is (= (stemming "impunity") "impun"))))

(deftest test-8244
  (testing "test case 8244"
    (is (= (stemming "foundational") "foundat"))))

(deftest test-8245
  (testing "test case 8245"
    (is (= (stemming "patroon") "patroon"))))

(deftest test-8246
  (testing "test case 8246"
    (is (= (stemming "anadem") "anadem"))))

(deftest test-8247
  (testing "test case 8247"
    (is (= (stemming "unclasped") "unclasp"))))

(deftest test-8248
  (testing "test case 8248"
    (is (= (stemming "laudanums") "laudanum"))))

(deftest test-8249
  (testing "test case 8249"
    (is (= (stemming "doorjamb") "doorjamb"))))

(deftest test-8250
  (testing "test case 8250"
    (is (= (stemming "arapahos") "arapaho"))))

(deftest test-8251
  (testing "test case 8251"
    (is (= (stemming "prospering") "prosper"))))

(deftest test-8252
  (testing "test case 8252"
    (is (= (stemming "determining") "determin"))))

(deftest test-8253
  (testing "test case 8253"
    (is (= (stemming "instigatingly") "instigatingli"))))

(deftest test-8254
  (testing "test case 8254"
    (is (= (stemming "teasers") "teaser"))))

(deftest test-8255
  (testing "test case 8255"
    (is (= (stemming "spathal") "spathal"))))

(deftest test-8256
  (testing "test case 8256"
    (is (= (stemming "unswearing") "unswear"))))

(deftest test-8257
  (testing "test case 8257"
    (is (= (stemming "bite") "bite"))))

(deftest test-8258
  (testing "test case 8258"
    (is (= (stemming "irrupted") "irrupt"))))

(deftest test-8259
  (testing "test case 8259"
    (is (= (stemming "coffeecakes") "coffeecak"))))

(deftest test-8260
  (testing "test case 8260"
    (is (= (stemming "lupines") "lupin"))))

(deftest test-8261
  (testing "test case 8261"
    (is (= (stemming "monthlies") "monthli"))))

(deftest test-8262
  (testing "test case 8262"
    (is (= (stemming "clovers") "clover"))))

(deftest test-8263
  (testing "test case 8263"
    (is (= (stemming "hydrogenates") "hydrogen"))))

(deftest test-8264
  (testing "test case 8264"
    (is (= (stemming "bureaucratically") "bureaucrat"))))

(deftest test-8265
  (testing "test case 8265"
    (is (= (stemming "ninths") "ninth"))))

(deftest test-8266
  (testing "test case 8266"
    (is (= (stemming "offsprings") "offspr"))))

(deftest test-8267
  (testing "test case 8267"
    (is (= (stemming "screens") "screen"))))

(deftest test-8268
  (testing "test case 8268"
    (is (= (stemming "solderer") "solder"))))

(deftest test-8269
  (testing "test case 8269"
    (is (= (stemming "luxuries") "luxuri"))))

(deftest test-8270
  (testing "test case 8270"
    (is (= (stemming "jollifying") "jollifi"))))

(deftest test-8271
  (testing "test case 8271"
    (is (= (stemming "dearly") "dearli"))))

(deftest test-8272
  (testing "test case 8272"
    (is (= (stemming "xeroxed") "xerox"))))

(deftest test-8273
  (testing "test case 8273"
    (is (= (stemming "livelily") "livelili"))))

(deftest test-8274
  (testing "test case 8274"
    (is (= (stemming "entrepreneur") "entrepreneur"))))

(deftest test-8275
  (testing "test case 8275"
    (is (= (stemming "tighteners") "tighten"))))

(deftest test-8276
  (testing "test case 8276"
    (is (= (stemming "manuals") "manual"))))

(deftest test-8277
  (testing "test case 8277"
    (is (= (stemming "frontages") "frontag"))))

(deftest test-8278
  (testing "test case 8278"
    (is (= (stemming "velveted") "velvet"))))

(deftest test-8279
  (testing "test case 8279"
    (is (= (stemming "evade") "evad"))))

(deftest test-8280
  (testing "test case 8280"
    (is (= (stemming "evoked") "evok"))))

(deftest test-8281
  (testing "test case 8281"
    (is (= (stemming "palmy") "palmi"))))

(deftest test-8282
  (testing "test case 8282"
    (is (= (stemming "nests") "nest"))))

(deftest test-8283
  (testing "test case 8283"
    (is (= (stemming "relevance") "relev"))))

(deftest test-8284
  (testing "test case 8284"
    (is (= (stemming "matriculants") "matricul"))))

(deftest test-8285
  (testing "test case 8285"
    (is (= (stemming "cantilevers") "cantilev"))))

(deftest test-8286
  (testing "test case 8286"
    (is (= (stemming "retransmit") "retransmit"))))

(deftest test-8287
  (testing "test case 8287"
    (is (= (stemming "depend") "depend"))))

(deftest test-8288
  (testing "test case 8288"
    (is (= (stemming "regal") "regal"))))

(deftest test-8289
  (testing "test case 8289"
    (is (= (stemming "banjos") "banjo"))))

(deftest test-8290
  (testing "test case 8290"
    (is (= (stemming "catatonia") "catatonia"))))

(deftest test-8291
  (testing "test case 8291"
    (is (= (stemming "retroact") "retroact"))))

(deftest test-8292
  (testing "test case 8292"
    (is (= (stemming "sphering") "sphere"))))

(deftest test-8293
  (testing "test case 8293"
    (is (= (stemming "tremolos") "tremolo"))))

(deftest test-8294
  (testing "test case 8294"
    (is (= (stemming "deflection") "deflect"))))

(deftest test-8295
  (testing "test case 8295"
    (is (= (stemming "preestablish") "preestablish"))))

(deftest test-8296
  (testing "test case 8296"
    (is (= (stemming "replicating") "replic"))))

(deftest test-8297
  (testing "test case 8297"
    (is (= (stemming "outwit") "outwit"))))

(deftest test-8298
  (testing "test case 8298"
    (is (= (stemming "preschooler") "preschool"))))

(deftest test-8299
  (testing "test case 8299"
    (is (= (stemming "goosiest") "goosiest"))))

(deftest test-8300
  (testing "test case 8300"
    (is (= (stemming "sterility") "steril"))))

(deftest test-8301
  (testing "test case 8301"
    (is (= (stemming "nucleation") "nucleat"))))

(deftest test-8302
  (testing "test case 8302"
    (is (= (stemming "durning") "durn"))))

(deftest test-8303
  (testing "test case 8303"
    (is (= (stemming "shirr") "shirr"))))

(deftest test-8304
  (testing "test case 8304"
    (is (= (stemming "heartening") "hearten"))))

(deftest test-8305
  (testing "test case 8305"
    (is (= (stemming "rosins") "rosin"))))

(deftest test-8306
  (testing "test case 8306"
    (is (= (stemming "suitcases") "suitcas"))))

(deftest test-8307
  (testing "test case 8307"
    (is (= (stemming "tuskless") "tuskless"))))

(deftest test-8308
  (testing "test case 8308"
    (is (= (stemming "unsalaried") "unsalari"))))

(deftest test-8309
  (testing "test case 8309"
    (is (= (stemming "mossiest") "mossiest"))))

(deftest test-8310
  (testing "test case 8310"
    (is (= (stemming "overflowed") "overflow"))))

(deftest test-8311
  (testing "test case 8311"
    (is (= (stemming "prescribed") "prescrib"))))

(deftest test-8312
  (testing "test case 8312"
    (is (= (stemming "slummy") "slummi"))))

(deftest test-8313
  (testing "test case 8313"
    (is (= (stemming "hotblooded") "hotblood"))))

(deftest test-8314
  (testing "test case 8314"
    (is (= (stemming "caravaning") "caravan"))))

(deftest test-8315
  (testing "test case 8315"
    (is (= (stemming "allegro") "allegro"))))

(deftest test-8316
  (testing "test case 8316"
    (is (= (stemming "unsmilingly") "unsmilingli"))))

(deftest test-8317
  (testing "test case 8317"
    (is (= (stemming "montreal") "montreal"))))

(deftest test-8318
  (testing "test case 8318"
    (is (= (stemming "couplings") "coupl"))))

(deftest test-8319
  (testing "test case 8319"
    (is (= (stemming "unperjured") "unperjur"))))

(deftest test-8320
  (testing "test case 8320"
    (is (= (stemming "mollifying") "mollifi"))))

(deftest test-8321
  (testing "test case 8321"
    (is (= (stemming "redos") "redo"))))

(deftest test-8322
  (testing "test case 8322"
    (is (= (stemming "cybernetics") "cybernet"))))

(deftest test-8323
  (testing "test case 8323"
    (is (= (stemming "hungriest") "hungriest"))))

(deftest test-8324
  (testing "test case 8324"
    (is (= (stemming "silking") "silk"))))

(deftest test-8325
  (testing "test case 8325"
    (is (= (stemming "rolled") "roll"))))

(deftest test-8326
  (testing "test case 8326"
    (is (= (stemming "outsells") "outsel"))))

(deftest test-8327
  (testing "test case 8327"
    (is (= (stemming "areolae") "areola"))))

(deftest test-8328
  (testing "test case 8328"
    (is (= (stemming "pollee") "polle"))))

(deftest test-8329
  (testing "test case 8329"
    (is (= (stemming "clarke") "clark"))))

(deftest test-8330
  (testing "test case 8330"
    (is (= (stemming "sublessor") "sublessor"))))

(deftest test-8331
  (testing "test case 8331"
    (is (= (stemming "yachtman") "yachtman"))))

(deftest test-8332
  (testing "test case 8332"
    (is (= (stemming "erroneously") "erron"))))

(deftest test-8333
  (testing "test case 8333"
    (is (= (stemming "humorous") "humor"))))

(deftest test-8334
  (testing "test case 8334"
    (is (= (stemming "archbishoprics") "archbishopr"))))

(deftest test-8335
  (testing "test case 8335"
    (is (= (stemming "contagiously") "contagi"))))

(deftest test-8336
  (testing "test case 8336"
    (is (= (stemming "suede") "sued"))))

(deftest test-8337
  (testing "test case 8337"
    (is (= (stemming "imagoes") "imago"))))

(deftest test-8338
  (testing "test case 8338"
    (is (= (stemming "decreer") "decreer"))))

(deftest test-8339
  (testing "test case 8339"
    (is (= (stemming "unwisest") "unwisest"))))

(deftest test-8340
  (testing "test case 8340"
    (is (= (stemming "debarred") "debar"))))

(deftest test-8341
  (testing "test case 8341"
    (is (= (stemming "uprising") "upris"))))

(deftest test-8342
  (testing "test case 8342"
    (is (= (stemming "extrapolates") "extrapol"))))

(deftest test-8343
  (testing "test case 8343"
    (is (= (stemming "questions") "question"))))

(deftest test-8344
  (testing "test case 8344"
    (is (= (stemming "univalve") "univalv"))))

(deftest test-8345
  (testing "test case 8345"
    (is (= (stemming "dieting") "diet"))))

(deftest test-8346
  (testing "test case 8346"
    (is (= (stemming "resell") "resel"))))

(deftest test-8347
  (testing "test case 8347"
    (is (= (stemming "fluorocarbons") "fluorocarbon"))))

(deftest test-8348
  (testing "test case 8348"
    (is (= (stemming "steer") "steer"))))

(deftest test-8349
  (testing "test case 8349"
    (is (= (stemming "overthrown") "overthrown"))))

(deftest test-8350
  (testing "test case 8350"
    (is (= (stemming "harebrained") "harebrain"))))

(deftest test-8351
  (testing "test case 8351"
    (is (= (stemming "ephemera") "ephemera"))))

(deftest test-8352
  (testing "test case 8352"
    (is (= (stemming "stale") "stale"))))

(deftest test-8353
  (testing "test case 8353"
    (is (= (stemming "perihelia") "perihelia"))))

(deftest test-8354
  (testing "test case 8354"
    (is (= (stemming "jemmy") "jemmi"))))

(deftest test-8355
  (testing "test case 8355"
    (is (= (stemming "productions") "product"))))

(deftest test-8356
  (testing "test case 8356"
    (is (= (stemming "backsides") "backsid"))))

(deftest test-8357
  (testing "test case 8357"
    (is (= (stemming "mackintoshes") "mackintosh"))))

(deftest test-8358
  (testing "test case 8358"
    (is (= (stemming "repaginated") "repagin"))))

(deftest test-8359
  (testing "test case 8359"
    (is (= (stemming "magnesic") "magnes"))))

(deftest test-8360
  (testing "test case 8360"
    (is (= (stemming "reproves") "reprov"))))

(deftest test-8361
  (testing "test case 8361"
    (is (= (stemming "reapportionment") "reapportion"))))

(deftest test-8362
  (testing "test case 8362"
    (is (= (stemming "osmotic") "osmot"))))

(deftest test-8363
  (testing "test case 8363"
    (is (= (stemming "reviewers") "review"))))

(deftest test-8364
  (testing "test case 8364"
    (is (= (stemming "taskmaster") "taskmast"))))

(deftest test-8365
  (testing "test case 8365"
    (is (= (stemming "posses") "poss"))))

(deftest test-8366
  (testing "test case 8366"
    (is (= (stemming "expatriates") "expatri"))))

(deftest test-8367
  (testing "test case 8367"
    (is (= (stemming "gerunds") "gerund"))))

(deftest test-8368
  (testing "test case 8368"
    (is (= (stemming "colporteurs") "colporteur"))))

(deftest test-8369
  (testing "test case 8369"
    (is (= (stemming "remolades") "remolad"))))

(deftest test-8370
  (testing "test case 8370"
    (is (= (stemming "felicities") "felic"))))

(deftest test-8371
  (testing "test case 8371"
    (is (= (stemming "ecstatics") "ecstat"))))

(deftest test-8372
  (testing "test case 8372"
    (is (= (stemming "lag") "lag"))))

(deftest test-8373
  (testing "test case 8373"
    (is (= (stemming "hawaiian") "hawaiian"))))

(deftest test-8374
  (testing "test case 8374"
    (is (= (stemming "piratical") "pirat"))))

(deftest test-8375
  (testing "test case 8375"
    (is (= (stemming "defeminize") "defemin"))))

(deftest test-8376
  (testing "test case 8376"
    (is (= (stemming "girlfriend") "girlfriend"))))

(deftest test-8377
  (testing "test case 8377"
    (is (= (stemming "exobiological") "exobiolog"))))

(deftest test-8378
  (testing "test case 8378"
    (is (= (stemming "malice") "malic"))))

(deftest test-8379
  (testing "test case 8379"
    (is (= (stemming "paramedic") "paramed"))))

(deftest test-8380
  (testing "test case 8380"
    (is (= (stemming "inurns") "inurn"))))

(deftest test-8381
  (testing "test case 8381"
    (is (= (stemming "assail") "assail"))))

(deftest test-8382
  (testing "test case 8382"
    (is (= (stemming "ellipsoidal") "ellipsoid"))))

(deftest test-8383
  (testing "test case 8383"
    (is (= (stemming "unready") "unreadi"))))

(deftest test-8384
  (testing "test case 8384"
    (is (= (stemming "xerographic") "xerograph"))))

(deftest test-8385
  (testing "test case 8385"
    (is (= (stemming "realignment") "realign"))))

(deftest test-8386
  (testing "test case 8386"
    (is (= (stemming "puffily") "puffili"))))

(deftest test-8387
  (testing "test case 8387"
    (is (= (stemming "osteopathy") "osteopathi"))))

(deftest test-8388
  (testing "test case 8388"
    (is (= (stemming "subgroup") "subgroup"))))

(deftest test-8389
  (testing "test case 8389"
    (is (= (stemming "fantasizes") "fantas"))))

(deftest test-8390
  (testing "test case 8390"
    (is (= (stemming "postgraduates") "postgradu"))))

(deftest test-8391
  (testing "test case 8391"
    (is (= (stemming "sickens") "sicken"))))

(deftest test-8392
  (testing "test case 8392"
    (is (= (stemming "underclad") "underclad"))))

(deftest test-8393
  (testing "test case 8393"
    (is (= (stemming "moorings") "moor"))))

(deftest test-8394
  (testing "test case 8394"
    (is (= (stemming "vivisectionists") "vivisectionist"))))

(deftest test-8395
  (testing "test case 8395"
    (is (= (stemming "algin") "algin"))))

(deftest test-8396
  (testing "test case 8396"
    (is (= (stemming "unvarying") "unvari"))))

(deftest test-8397
  (testing "test case 8397"
    (is (= (stemming "mettled") "mettl"))))

(deftest test-8398
  (testing "test case 8398"
    (is (= (stemming "jejunums") "jejunum"))))

(deftest test-8399
  (testing "test case 8399"
    (is (= (stemming "stiffens") "stiffen"))))

(deftest test-8400
  (testing "test case 8400"
    (is (= (stemming "spectaculars") "spectacular"))))

(deftest test-8401
  (testing "test case 8401"
    (is (= (stemming "monograph") "monograph"))))

(deftest test-8402
  (testing "test case 8402"
    (is (= (stemming "scribbles") "scribbl"))))

(deftest test-8403
  (testing "test case 8403"
    (is (= (stemming "reincurred") "reincur"))))

(deftest test-8404
  (testing "test case 8404"
    (is (= (stemming "labyrinths") "labyrinth"))))

(deftest test-8405
  (testing "test case 8405"
    (is (= (stemming "pocketfuls") "pocket"))))

(deftest test-8406
  (testing "test case 8406"
    (is (= (stemming "autostrada") "autostrada"))))

(deftest test-8407
  (testing "test case 8407"
    (is (= (stemming "stuccos") "stucco"))))

(deftest test-8408
  (testing "test case 8408"
    (is (= (stemming "flashbulbs") "flashbulb"))))

(deftest test-8409
  (testing "test case 8409"
    (is (= (stemming "sunrises") "sunris"))))

(deftest test-8410
  (testing "test case 8410"
    (is (= (stemming "riles") "rile"))))

(deftest test-8411
  (testing "test case 8411"
    (is (= (stemming "knottily") "knottili"))))

(deftest test-8412
  (testing "test case 8412"
    (is (= (stemming "craver") "craver"))))

(deftest test-8413
  (testing "test case 8413"
    (is (= (stemming "agora") "agora"))))

(deftest test-8414
  (testing "test case 8414"
    (is (= (stemming "adsorb") "adsorb"))))

(deftest test-8415
  (testing "test case 8415"
    (is (= (stemming "tricorns") "tricorn"))))

(deftest test-8416
  (testing "test case 8416"
    (is (= (stemming "fiats") "fiat"))))

(deftest test-8417
  (testing "test case 8417"
    (is (= (stemming "bunsen") "bunsen"))))

(deftest test-8418
  (testing "test case 8418"
    (is (= (stemming "detests") "detest"))))

(deftest test-8419
  (testing "test case 8419"
    (is (= (stemming "hive") "hive"))))

(deftest test-8420
  (testing "test case 8420"
    (is (= (stemming "anna") "anna"))))

(deftest test-8421
  (testing "test case 8421"
    (is (= (stemming "confirmor") "confirmor"))))

(deftest test-8422
  (testing "test case 8422"
    (is (= (stemming "alliterative") "allit"))))

(deftest test-8423
  (testing "test case 8423"
    (is (= (stemming "semiconsciousness") "semiconsci"))))

(deftest test-8424
  (testing "test case 8424"
    (is (= (stemming "mulcting") "mulct"))))

(deftest test-8425
  (testing "test case 8425"
    (is (= (stemming "libra") "libra"))))

(deftest test-8426
  (testing "test case 8426"
    (is (= (stemming "windflowers") "windflow"))))

(deftest test-8427
  (testing "test case 8427"
    (is (= (stemming "warts") "wart"))))

(deftest test-8428
  (testing "test case 8428"
    (is (= (stemming "cooperativeness") "cooper"))))

(deftest test-8429
  (testing "test case 8429"
    (is (= (stemming "myocardia") "myocardia"))))

(deftest test-8430
  (testing "test case 8430"
    (is (= (stemming "intrans") "intran"))))

(deftest test-8431
  (testing "test case 8431"
    (is (= (stemming "sogged") "sog"))))

(deftest test-8432
  (testing "test case 8432"
    (is (= (stemming "notochord") "notochord"))))

(deftest test-8433
  (testing "test case 8433"
    (is (= (stemming "watercress") "watercress"))))

(deftest test-8434
  (testing "test case 8434"
    (is (= (stemming "auroral") "auror"))))

(deftest test-8435
  (testing "test case 8435"
    (is (= (stemming "exempted") "exempt"))))

(deftest test-8436
  (testing "test case 8436"
    (is (= (stemming "transitorily") "transitorili"))))

(deftest test-8437
  (testing "test case 8437"
    (is (= (stemming "melds") "meld"))))

(deftest test-8438
  (testing "test case 8438"
    (is (= (stemming "williams") "william"))))

(deftest test-8439
  (testing "test case 8439"
    (is (= (stemming "oppositely") "opposit"))))

(deftest test-8440
  (testing "test case 8440"
    (is (= (stemming "matcher") "matcher"))))

(deftest test-8441
  (testing "test case 8441"
    (is (= (stemming "almandines") "almandin"))))

(deftest test-8442
  (testing "test case 8442"
    (is (= (stemming "jowlier") "jowlier"))))

(deftest test-8443
  (testing "test case 8443"
    (is (= (stemming "reincorporated") "reincorpor"))))

(deftest test-8444
  (testing "test case 8444"
    (is (= (stemming "fusibleness") "fusibl"))))

(deftest test-8445
  (testing "test case 8445"
    (is (= (stemming "incubative") "incub"))))

(deftest test-8446
  (testing "test case 8446"
    (is (= (stemming "shackled") "shackl"))))

(deftest test-8447
  (testing "test case 8447"
    (is (= (stemming "nomination") "nomin"))))

(deftest test-8448
  (testing "test case 8448"
    (is (= (stemming "investigators") "investig"))))

(deftest test-8449
  (testing "test case 8449"
    (is (= (stemming "digraph") "digraph"))))

(deftest test-8450
  (testing "test case 8450"
    (is (= (stemming "crook") "crook"))))

(deftest test-8451
  (testing "test case 8451"
    (is (= (stemming "matinal") "matin"))))

(deftest test-8452
  (testing "test case 8452"
    (is (= (stemming "waxers") "waxer"))))

(deftest test-8453
  (testing "test case 8453"
    (is (= (stemming "pipe") "pipe"))))

(deftest test-8454
  (testing "test case 8454"
    (is (= (stemming "rigger") "rigger"))))

(deftest test-8455
  (testing "test case 8455"
    (is (= (stemming "elevations") "elev"))))

(deftest test-8456
  (testing "test case 8456"
    (is (= (stemming "samaritan") "samaritan"))))

(deftest test-8457
  (testing "test case 8457"
    (is (= (stemming "unrelentingly") "unrelentingli"))))

(deftest test-8458
  (testing "test case 8458"
    (is (= (stemming "recondensation") "recondens"))))

(deftest test-8459
  (testing "test case 8459"
    (is (= (stemming "invalid") "invalid"))))

(deftest test-8460
  (testing "test case 8460"
    (is (= (stemming "wherries") "wherri"))))

(deftest test-8461
  (testing "test case 8461"
    (is (= (stemming "physical") "physic"))))

(deftest test-8462
  (testing "test case 8462"
    (is (= (stemming "townsmen") "townsmen"))))

(deftest test-8463
  (testing "test case 8463"
    (is (= (stemming "responsibilities") "respons"))))

(deftest test-8464
  (testing "test case 8464"
    (is (= (stemming "sheik") "sheik"))))

(deftest test-8465
  (testing "test case 8465"
    (is (= (stemming "lacings") "lace"))))

(deftest test-8466
  (testing "test case 8466"
    (is (= (stemming "lense") "lens"))))

(deftest test-8467
  (testing "test case 8467"
    (is (= (stemming "tiffins") "tiffin"))))

(deftest test-8468
  (testing "test case 8468"
    (is (= (stemming "sequencies") "sequenc"))))

(deftest test-8469
  (testing "test case 8469"
    (is (= (stemming "raconteurs") "raconteur"))))

(deftest test-8470
  (testing "test case 8470"
    (is (= (stemming "ovulating") "ovul"))))

(deftest test-8471
  (testing "test case 8471"
    (is (= (stemming "dingus") "dingu"))))

(deftest test-8472
  (testing "test case 8472"
    (is (= (stemming "nonelection") "nonelect"))))

(deftest test-8473
  (testing "test case 8473"
    (is (= (stemming "sandhogs") "sandhog"))))

(deftest test-8474
  (testing "test case 8474"
    (is (= (stemming "duces") "duce"))))

(deftest test-8475
  (testing "test case 8475"
    (is (= (stemming "impingement") "imping"))))

(deftest test-8476
  (testing "test case 8476"
    (is (= (stemming "enabled") "enabl"))))

(deftest test-8477
  (testing "test case 8477"
    (is (= (stemming "guising") "guis"))))

(deftest test-8478
  (testing "test case 8478"
    (is (= (stemming "loves") "love"))))

(deftest test-8479
  (testing "test case 8479"
    (is (= (stemming "circlers") "circler"))))

(deftest test-8480
  (testing "test case 8480"
    (is (= (stemming "scuttler") "scuttler"))))

(deftest test-8481
  (testing "test case 8481"
    (is (= (stemming "valvar") "valvar"))))

(deftest test-8482
  (testing "test case 8482"
    (is (= (stemming "coact") "coact"))))

(deftest test-8483
  (testing "test case 8483"
    (is (= (stemming "witness") "wit"))))

(deftest test-8484
  (testing "test case 8484"
    (is (= (stemming "ruggeder") "rugged"))))

(deftest test-8485
  (testing "test case 8485"
    (is (= (stemming "bucks") "buck"))))

(deftest test-8486
  (testing "test case 8486"
    (is (= (stemming "acrider") "acrid"))))

(deftest test-8487
  (testing "test case 8487"
    (is (= (stemming "divinity") "divin"))))

(deftest test-8488
  (testing "test case 8488"
    (is (= (stemming "idahoans") "idahoan"))))

(deftest test-8489
  (testing "test case 8489"
    (is (= (stemming "groveling") "grovel"))))

(deftest test-8490
  (testing "test case 8490"
    (is (= (stemming "fortunate") "fortun"))))

(deftest test-8491
  (testing "test case 8491"
    (is (= (stemming "ventriloquism") "ventriloqu"))))

(deftest test-8492
  (testing "test case 8492"
    (is (= (stemming "magistery") "magisteri"))))

(deftest test-8493
  (testing "test case 8493"
    (is (= (stemming "pulchritudinous") "pulchritudin"))))

(deftest test-8494
  (testing "test case 8494"
    (is (= (stemming "tetanic") "tetan"))))

(deftest test-8495
  (testing "test case 8495"
    (is (= (stemming "neurophysiologic") "neurophysiolog"))))

(deftest test-8496
  (testing "test case 8496"
    (is (= (stemming "concerned") "concern"))))

(deftest test-8497
  (testing "test case 8497"
    (is (= (stemming "haranguer") "harangu"))))

(deftest test-8498
  (testing "test case 8498"
    (is (= (stemming "joltier") "joltier"))))

(deftest test-8499
  (testing "test case 8499"
    (is (= (stemming "roofing") "roof"))))

(deftest test-8500
  (testing "test case 8500"
    (is (= (stemming "carbolic") "carbol"))))

(deftest test-8501
  (testing "test case 8501"
    (is (= (stemming "banish") "banish"))))

(deftest test-8502
  (testing "test case 8502"
    (is (= (stemming "marinating") "marin"))))

(deftest test-8503
  (testing "test case 8503"
    (is (= (stemming "odometers") "odomet"))))

(deftest test-8504
  (testing "test case 8504"
    (is (= (stemming "turbidities") "turbid"))))

(deftest test-8505
  (testing "test case 8505"
    (is (= (stemming "starvers") "starver"))))

(deftest test-8506
  (testing "test case 8506"
    (is (= (stemming "yodels") "yodel"))))

(deftest test-8507
  (testing "test case 8507"
    (is (= (stemming "impregnated") "impregn"))))

(deftest test-8508
  (testing "test case 8508"
    (is (= (stemming "burgle") "burgl"))))

(deftest test-8509
  (testing "test case 8509"
    (is (= (stemming "floe") "floe"))))

(deftest test-8510
  (testing "test case 8510"
    (is (= (stemming "skitters") "skitter"))))

(deftest test-8511
  (testing "test case 8511"
    (is (= (stemming "horseshoers") "horsesho"))))

(deftest test-8512
  (testing "test case 8512"
    (is (= (stemming "pineapples") "pineappl"))))

(deftest test-8513
  (testing "test case 8513"
    (is (= (stemming "tunics") "tunic"))))

(deftest test-8514
  (testing "test case 8514"
    (is (= (stemming "willowy") "willowi"))))

(deftest test-8515
  (testing "test case 8515"
    (is (= (stemming "bombardment") "bombard"))))

(deftest test-8516
  (testing "test case 8516"
    (is (= (stemming "unaccountably") "unaccount"))))

(deftest test-8517
  (testing "test case 8517"
    (is (= (stemming "materially") "materi"))))

(deftest test-8518
  (testing "test case 8518"
    (is (= (stemming "calendula") "calendula"))))

(deftest test-8519
  (testing "test case 8519"
    (is (= (stemming "aureomycin") "aureomycin"))))

(deftest test-8520
  (testing "test case 8520"
    (is (= (stemming "eve") "ev"))))

(deftest test-8521
  (testing "test case 8521"
    (is (= (stemming "racialists") "racialist"))))

(deftest test-8522
  (testing "test case 8522"
    (is (= (stemming "jobber") "jobber"))))

(deftest test-8523
  (testing "test case 8523"
    (is (= (stemming "audads") "audad"))))

(deftest test-8524
  (testing "test case 8524"
    (is (= (stemming "spectrographs") "spectrograph"))))

(deftest test-8525
  (testing "test case 8525"
    (is (= (stemming "biffed") "bif"))))

(deftest test-8526
  (testing "test case 8526"
    (is (= (stemming "copyrighted") "copyright"))))

(deftest test-8527
  (testing "test case 8527"
    (is (= (stemming "endleaves") "endleav"))))

(deftest test-8528
  (testing "test case 8528"
    (is (= (stemming "pinheads") "pinhead"))))

(deftest test-8529
  (testing "test case 8529"
    (is (= (stemming "chiefer") "chiefer"))))

(deftest test-8530
  (testing "test case 8530"
    (is (= (stemming "observational") "observ"))))

(deftest test-8531
  (testing "test case 8531"
    (is (= (stemming "counterinsurgent") "counterinsurg"))))

(deftest test-8532
  (testing "test case 8532"
    (is (= (stemming "halve") "halv"))))

(deftest test-8533
  (testing "test case 8533"
    (is (= (stemming "masticatory") "masticatori"))))

(deftest test-8534
  (testing "test case 8534"
    (is (= (stemming "corrupter") "corrupt"))))

(deftest test-8535
  (testing "test case 8535"
    (is (= (stemming "incapable") "incap"))))

(deftest test-8536
  (testing "test case 8536"
    (is (= (stemming "illustrators") "illustr"))))

(deftest test-8537
  (testing "test case 8537"
    (is (= (stemming "shovelled") "shovel"))))

(deftest test-8538
  (testing "test case 8538"
    (is (= (stemming "expostulations") "expostul"))))

(deftest test-8539
  (testing "test case 8539"
    (is (= (stemming "jacinthe") "jacinth"))))

(deftest test-8540
  (testing "test case 8540"
    (is (= (stemming "thongs") "thong"))))

(deftest test-8541
  (testing "test case 8541"
    (is (= (stemming "centering") "center"))))

(deftest test-8542
  (testing "test case 8542"
    (is (= (stemming "burbles") "burbl"))))

(deftest test-8543
  (testing "test case 8543"
    (is (= (stemming "falsification") "falsif"))))

(deftest test-8544
  (testing "test case 8544"
    (is (= (stemming "transactor") "transactor"))))

(deftest test-8545
  (testing "test case 8545"
    (is (= (stemming "equipping") "equip"))))

(deftest test-8546
  (testing "test case 8546"
    (is (= (stemming "shawls") "shawl"))))

(deftest test-8547
  (testing "test case 8547"
    (is (= (stemming "fattened") "fatten"))))

(deftest test-8548
  (testing "test case 8548"
    (is (= (stemming "tabloids") "tabloid"))))

(deftest test-8549
  (testing "test case 8549"
    (is (= (stemming "imploded") "implod"))))

(deftest test-8550
  (testing "test case 8550"
    (is (= (stemming "landscaping") "landscap"))))

(deftest test-8551
  (testing "test case 8551"
    (is (= (stemming "hermit") "hermit"))))

(deftest test-8552
  (testing "test case 8552"
    (is (= (stemming "jawbreaker") "jawbreak"))))

(deftest test-8553
  (testing "test case 8553"
    (is (= (stemming "deadest") "deadest"))))

(deftest test-8554
  (testing "test case 8554"
    (is (= (stemming "dermopathy") "dermopathi"))))

(deftest test-8555
  (testing "test case 8555"
    (is (= (stemming "invocate") "invoc"))))

(deftest test-8556
  (testing "test case 8556"
    (is (= (stemming "godspeed") "godspe"))))

(deftest test-8557
  (testing "test case 8557"
    (is (= (stemming "benedicts") "benedict"))))

(deftest test-8558
  (testing "test case 8558"
    (is (= (stemming "persisted") "persist"))))

(deftest test-8559
  (testing "test case 8559"
    (is (= (stemming "readability") "readabl"))))

(deftest test-8560
  (testing "test case 8560"
    (is (= (stemming "ably") "abli"))))

(deftest test-8561
  (testing "test case 8561"
    (is (= (stemming "examinees") "examine"))))

(deftest test-8562
  (testing "test case 8562"
    (is (= (stemming "reprocesses") "reprocess"))))

(deftest test-8563
  (testing "test case 8563"
    (is (= (stemming "kyoto") "kyoto"))))

(deftest test-8564
  (testing "test case 8564"
    (is (= (stemming "poppy") "poppi"))))

(deftest test-8565
  (testing "test case 8565"
    (is (= (stemming "malfunctioning") "malfunct"))))

(deftest test-8566
  (testing "test case 8566"
    (is (= (stemming "purge") "purg"))))

(deftest test-8567
  (testing "test case 8567"
    (is (= (stemming "melanism") "melan"))))

(deftest test-8568
  (testing "test case 8568"
    (is (= (stemming "sternutate") "sternut"))))

(deftest test-8569
  (testing "test case 8569"
    (is (= (stemming "cougar") "cougar"))))

(deftest test-8570
  (testing "test case 8570"
    (is (= (stemming "forewarns") "forewarn"))))

(deftest test-8571
  (testing "test case 8571"
    (is (= (stemming "immovable") "immov"))))

(deftest test-8572
  (testing "test case 8572"
    (is (= (stemming "conjures") "conjur"))))

(deftest test-8573
  (testing "test case 8573"
    (is (= (stemming "gibe") "gibe"))))

(deftest test-8574
  (testing "test case 8574"
    (is (= (stemming "diskette") "diskett"))))

(deftest test-8575
  (testing "test case 8575"
    (is (= (stemming "alkyds") "alkyd"))))

(deftest test-8576
  (testing "test case 8576"
    (is (= (stemming "imaging") "imag"))))

(deftest test-8577
  (testing "test case 8577"
    (is (= (stemming "kludged") "kludg"))))

(deftest test-8578
  (testing "test case 8578"
    (is (= (stemming "enrol") "enrol"))))

(deftest test-8579
  (testing "test case 8579"
    (is (= (stemming "aurate") "aurat"))))

(deftest test-8580
  (testing "test case 8580"
    (is (= (stemming "craft") "craft"))))

(deftest test-8581
  (testing "test case 8581"
    (is (= (stemming "hypothyroids") "hypothyroid"))))

(deftest test-8582
  (testing "test case 8582"
    (is (= (stemming "vex") "vex"))))

(deftest test-8583
  (testing "test case 8583"
    (is (= (stemming "headword") "headword"))))

(deftest test-8584
  (testing "test case 8584"
    (is (= (stemming "pimento") "pimento"))))

(deftest test-8585
  (testing "test case 8585"
    (is (= (stemming "canners") "canner"))))

(deftest test-8586
  (testing "test case 8586"
    (is (= (stemming "vegetal") "veget"))))

(deftest test-8587
  (testing "test case 8587"
    (is (= (stemming "brainchildren") "brainchildren"))))

(deftest test-8588
  (testing "test case 8588"
    (is (= (stemming "hedges") "hedg"))))

(deftest test-8589
  (testing "test case 8589"
    (is (= (stemming "kachinas") "kachina"))))

(deftest test-8590
  (testing "test case 8590"
    (is (= (stemming "india") "india"))))

(deftest test-8591
  (testing "test case 8591"
    (is (= (stemming "comfortableness") "comfort"))))

(deftest test-8592
  (testing "test case 8592"
    (is (= (stemming "hydrotherapeutically") "hydrotherapeut"))))

(deftest test-8593
  (testing "test case 8593"
    (is (= (stemming "warthogs") "warthog"))))

(deftest test-8594
  (testing "test case 8594"
    (is (= (stemming "employs") "emploi"))))

(deftest test-8595
  (testing "test case 8595"
    (is (= (stemming "infallibility") "infal"))))

(deftest test-8596
  (testing "test case 8596"
    (is (= (stemming "backspacing") "backspac"))))

(deftest test-8597
  (testing "test case 8597"
    (is (= (stemming "filthiness") "filthi"))))

(deftest test-8598
  (testing "test case 8598"
    (is (= (stemming "prefaced") "prefac"))))

(deftest test-8599
  (testing "test case 8599"
    (is (= (stemming "waling") "wale"))))

(deftest test-8600
  (testing "test case 8600"
    (is (= (stemming "sharecroppers") "sharecropp"))))

(deftest test-8601
  (testing "test case 8601"
    (is (= (stemming "gestating") "gestat"))))

(deftest test-8602
  (testing "test case 8602"
    (is (= (stemming "agitates") "agit"))))

(deftest test-8603
  (testing "test case 8603"
    (is (= (stemming "rototills") "rototil"))))

(deftest test-8604
  (testing "test case 8604"
    (is (= (stemming "unitary") "unitari"))))

(deftest test-8605
  (testing "test case 8605"
    (is (= (stemming "loadstar") "loadstar"))))

(deftest test-8606
  (testing "test case 8606"
    (is (= (stemming "prepayments") "prepay"))))

(deftest test-8607
  (testing "test case 8607"
    (is (= (stemming "farced") "farc"))))

(deftest test-8608
  (testing "test case 8608"
    (is (= (stemming "cormorant") "cormor"))))

(deftest test-8609
  (testing "test case 8609"
    (is (= (stemming "acquittal") "acquitt"))))

(deftest test-8610
  (testing "test case 8610"
    (is (= (stemming "aunt") "aunt"))))

(deftest test-8611
  (testing "test case 8611"
    (is (= (stemming "bleated") "bleat"))))

(deftest test-8612
  (testing "test case 8612"
    (is (= (stemming "navigating") "navig"))))

(deftest test-8613
  (testing "test case 8613"
    (is (= (stemming "meadowy") "meadowi"))))

(deftest test-8614
  (testing "test case 8614"
    (is (= (stemming "heroinism") "heroin"))))

(deftest test-8615
  (testing "test case 8615"
    (is (= (stemming "psalmists") "psalmist"))))

(deftest test-8616
  (testing "test case 8616"
    (is (= (stemming "doters") "doter"))))

(deftest test-8617
  (testing "test case 8617"
    (is (= (stemming "leagued") "leagu"))))

(deftest test-8618
  (testing "test case 8618"
    (is (= (stemming "forefend") "forefend"))))

(deftest test-8619
  (testing "test case 8619"
    (is (= (stemming "overlies") "overli"))))

(deftest test-8620
  (testing "test case 8620"
    (is (= (stemming "jim") "jim"))))

(deftest test-8621
  (testing "test case 8621"
    (is (= (stemming "dormitory") "dormitori"))))

(deftest test-8622
  (testing "test case 8622"
    (is (= (stemming "mentionable") "mention"))))

(deftest test-8623
  (testing "test case 8623"
    (is (= (stemming "mesmerism") "mesmer"))))

(deftest test-8624
  (testing "test case 8624"
    (is (= (stemming "lodgeable") "lodgeabl"))))

(deftest test-8625
  (testing "test case 8625"
    (is (= (stemming "blond") "blond"))))

(deftest test-8626
  (testing "test case 8626"
    (is (= (stemming "wharves") "wharv"))))

(deftest test-8627
  (testing "test case 8627"
    (is (= (stemming "sowing") "sow"))))

(deftest test-8628
  (testing "test case 8628"
    (is (= (stemming "perish") "perish"))))

(deftest test-8629
  (testing "test case 8629"
    (is (= (stemming "persnickety") "persnicketi"))))

(deftest test-8630
  (testing "test case 8630"
    (is (= (stemming "cheesed") "chees"))))

(deftest test-8631
  (testing "test case 8631"
    (is (= (stemming "squeals") "squeal"))))

(deftest test-8632
  (testing "test case 8632"
    (is (= (stemming "unasked") "unask"))))

(deftest test-8633
  (testing "test case 8633"
    (is (= (stemming "tartaric") "tartar"))))

(deftest test-8634
  (testing "test case 8634"
    (is (= (stemming "smote") "smote"))))

(deftest test-8635
  (testing "test case 8635"
    (is (= (stemming "unmortgaged") "unmortgag"))))

(deftest test-8636
  (testing "test case 8636"
    (is (= (stemming "anise") "anis"))))

(deftest test-8637
  (testing "test case 8637"
    (is (= (stemming "epicene") "epicen"))))

(deftest test-8638
  (testing "test case 8638"
    (is (= (stemming "expanse") "expans"))))

(deftest test-8639
  (testing "test case 8639"
    (is (= (stemming "valiants") "valiant"))))

(deftest test-8640
  (testing "test case 8640"
    (is (= (stemming "predecessors") "predecessor"))))

(deftest test-8641
  (testing "test case 8641"
    (is (= (stemming "farcy") "farci"))))

(deftest test-8642
  (testing "test case 8642"
    (is (= (stemming "frowners") "frowner"))))

(deftest test-8643
  (testing "test case 8643"
    (is (= (stemming "bean") "bean"))))

(deftest test-8644
  (testing "test case 8644"
    (is (= (stemming "aneurisms") "aneur"))))

(deftest test-8645
  (testing "test case 8645"
    (is (= (stemming "factorize") "factor"))))

(deftest test-8646
  (testing "test case 8646"
    (is (= (stemming "constrainers") "constrain"))))

(deftest test-8647
  (testing "test case 8647"
    (is (= (stemming "filespec") "filespec"))))

(deftest test-8648
  (testing "test case 8648"
    (is (= (stemming "harboring") "harbor"))))

(deftest test-8649
  (testing "test case 8649"
    (is (= (stemming "crowbars") "crowbar"))))

(deftest test-8650
  (testing "test case 8650"
    (is (= (stemming "lasso") "lasso"))))

(deftest test-8651
  (testing "test case 8651"
    (is (= (stemming "gets") "get"))))

(deftest test-8652
  (testing "test case 8652"
    (is (= (stemming "misgoverning") "misgovern"))))

(deftest test-8653
  (testing "test case 8653"
    (is (= (stemming "deride") "derid"))))

(deftest test-8654
  (testing "test case 8654"
    (is (= (stemming "filch") "filch"))))

(deftest test-8655
  (testing "test case 8655"
    (is (= (stemming "nightwalker") "nightwalk"))))

(deftest test-8656
  (testing "test case 8656"
    (is (= (stemming "idolaters") "idolat"))))

(deftest test-8657
  (testing "test case 8657"
    (is (= (stemming "summons") "summon"))))

(deftest test-8658
  (testing "test case 8658"
    (is (= (stemming "drippers") "dripper"))))

(deftest test-8659
  (testing "test case 8659"
    (is (= (stemming "woodchucks") "woodchuck"))))

(deftest test-8660
  (testing "test case 8660"
    (is (= (stemming "thieves") "thiev"))))

(deftest test-8661
  (testing "test case 8661"
    (is (= (stemming "unfertilized") "unfertil"))))

(deftest test-8662
  (testing "test case 8662"
    (is (= (stemming "resummoning") "resummon"))))

(deftest test-8663
  (testing "test case 8663"
    (is (= (stemming "brook") "brook"))))

(deftest test-8664
  (testing "test case 8664"
    (is (= (stemming "bibliography") "bibliographi"))))

(deftest test-8665
  (testing "test case 8665"
    (is (= (stemming "bespeaking") "bespeak"))))

(deftest test-8666
  (testing "test case 8666"
    (is (= (stemming "abnegations") "abneg"))))

(deftest test-8667
  (testing "test case 8667"
    (is (= (stemming "obstructionist") "obstructionist"))))

(deftest test-8668
  (testing "test case 8668"
    (is (= (stemming "detoxifies") "detoxifi"))))

(deftest test-8669
  (testing "test case 8669"
    (is (= (stemming "uncordial") "uncordi"))))

(deftest test-8670
  (testing "test case 8670"
    (is (= (stemming "breakaway") "breakawai"))))

(deftest test-8671
  (testing "test case 8671"
    (is (= (stemming "colombians") "colombian"))))

(deftest test-8672
  (testing "test case 8672"
    (is (= (stemming "consistency") "consist"))))

(deftest test-8673
  (testing "test case 8673"
    (is (= (stemming "radiometries") "radiometri"))))

(deftest test-8674
  (testing "test case 8674"
    (is (= (stemming "unappeased") "unappeas"))))

(deftest test-8675
  (testing "test case 8675"
    (is (= (stemming "append") "append"))))

(deftest test-8676
  (testing "test case 8676"
    (is (= (stemming "stroboscope") "stroboscop"))))

(deftest test-8677
  (testing "test case 8677"
    (is (= (stemming "unresisting") "unresist"))))

(deftest test-8678
  (testing "test case 8678"
    (is (= (stemming "enlightenments") "enlighten"))))

(deftest test-8679
  (testing "test case 8679"
    (is (= (stemming "airborne") "airborn"))))

(deftest test-8680
  (testing "test case 8680"
    (is (= (stemming "eglantines") "eglantin"))))

(deftest test-8681
  (testing "test case 8681"
    (is (= (stemming "eldest") "eldest"))))

(deftest test-8682
  (testing "test case 8682"
    (is (= (stemming "tasseled") "tassel"))))

(deftest test-8683
  (testing "test case 8683"
    (is (= (stemming "tinworks") "tinwork"))))

(deftest test-8684
  (testing "test case 8684"
    (is (= (stemming "sweetish") "sweetish"))))

(deftest test-8685
  (testing "test case 8685"
    (is (= (stemming "yokes") "yoke"))))

(deftest test-8686
  (testing "test case 8686"
    (is (= (stemming "tautonym") "tautonym"))))

(deftest test-8687
  (testing "test case 8687"
    (is (= (stemming "libber") "libber"))))

(deftest test-8688
  (testing "test case 8688"
    (is (= (stemming "trinketing") "trinket"))))

(deftest test-8689
  (testing "test case 8689"
    (is (= (stemming "elemental") "element"))))

(deftest test-8690
  (testing "test case 8690"
    (is (= (stemming "unfitness") "unfit"))))

(deftest test-8691
  (testing "test case 8691"
    (is (= (stemming "cashable") "cashabl"))))

(deftest test-8692
  (testing "test case 8692"
    (is (= (stemming "regarding") "regard"))))

(deftest test-8693
  (testing "test case 8693"
    (is (= (stemming "waggoned") "waggon"))))

(deftest test-8694
  (testing "test case 8694"
    (is (= (stemming "mooned") "moon"))))

(deftest test-8695
  (testing "test case 8695"
    (is (= (stemming "retrievers") "retriev"))))

(deftest test-8696
  (testing "test case 8696"
    (is (= (stemming "neurosis") "neurosi"))))

(deftest test-8697
  (testing "test case 8697"
    (is (= (stemming "reannexing") "reannex"))))

(deftest test-8698
  (testing "test case 8698"
    (is (= (stemming "keepsake") "keepsak"))))

(deftest test-8699
  (testing "test case 8699"
    (is (= (stemming "intangibles") "intang"))))

(deftest test-8700
  (testing "test case 8700"
    (is (= (stemming "prior") "prior"))))

(deftest test-8701
  (testing "test case 8701"
    (is (= (stemming "unblushing") "unblush"))))

(deftest test-8702
  (testing "test case 8702"
    (is (= (stemming "bursas") "bursa"))))

(deftest test-8703
  (testing "test case 8703"
    (is (= (stemming "occlusion") "occlus"))))

(deftest test-8704
  (testing "test case 8704"
    (is (= (stemming "brandished") "brandish"))))

(deftest test-8705
  (testing "test case 8705"
    (is (= (stemming "guttering") "gutter"))))

(deftest test-8706
  (testing "test case 8706"
    (is (= (stemming "caudillo") "caudillo"))))

(deftest test-8707
  (testing "test case 8707"
    (is (= (stemming "realisers") "realis"))))

(deftest test-8708
  (testing "test case 8708"
    (is (= (stemming "nixed") "nix"))))

(deftest test-8709
  (testing "test case 8709"
    (is (= (stemming "shallowness") "shallow"))))

(deftest test-8710
  (testing "test case 8710"
    (is (= (stemming "hiatus") "hiatu"))))

(deftest test-8711
  (testing "test case 8711"
    (is (= (stemming "inurement") "inur"))))

(deftest test-8712
  (testing "test case 8712"
    (is (= (stemming "sweet") "sweet"))))

(deftest test-8713
  (testing "test case 8713"
    (is (= (stemming "cantatas") "cantata"))))

(deftest test-8714
  (testing "test case 8714"
    (is (= (stemming "ninetieths") "ninetieth"))))

(deftest test-8715
  (testing "test case 8715"
    (is (= (stemming "construers") "construer"))))

(deftest test-8716
  (testing "test case 8716"
    (is (= (stemming "cashew") "cashew"))))

(deftest test-8717
  (testing "test case 8717"
    (is (= (stemming "handcarts") "handcart"))))

(deftest test-8718
  (testing "test case 8718"
    (is (= (stemming "irk") "irk"))))

(deftest test-8719
  (testing "test case 8719"
    (is (= (stemming "reassessments") "reassess"))))

(deftest test-8720
  (testing "test case 8720"
    (is (= (stemming "musses") "muss"))))

(deftest test-8721
  (testing "test case 8721"
    (is (= (stemming "outriding") "outrid"))))

(deftest test-8722
  (testing "test case 8722"
    (is (= (stemming "callow") "callow"))))

(deftest test-8723
  (testing "test case 8723"
    (is (= (stemming "recompression") "recompress"))))

(deftest test-8724
  (testing "test case 8724"
    (is (= (stemming "marish") "marish"))))

(deftest test-8725
  (testing "test case 8725"
    (is (= (stemming "knights") "knight"))))

(deftest test-8726
  (testing "test case 8726"
    (is (= (stemming "botcher") "botcher"))))

(deftest test-8727
  (testing "test case 8727"
    (is (= (stemming "adrenalin") "adrenalin"))))

(deftest test-8728
  (testing "test case 8728"
    (is (= (stemming "commanding") "command"))))

(deftest test-8729
  (testing "test case 8729"
    (is (= (stemming "gallops") "gallop"))))

(deftest test-8730
  (testing "test case 8730"
    (is (= (stemming "covenanting") "coven"))))

(deftest test-8731
  (testing "test case 8731"
    (is (= (stemming "haciendas") "hacienda"))))

(deftest test-8732
  (testing "test case 8732"
    (is (= (stemming "enfant") "enfant"))))

(deftest test-8733
  (testing "test case 8733"
    (is (= (stemming "booties") "booti"))))

(deftest test-8734
  (testing "test case 8734"
    (is (= (stemming "pense") "pens"))))

(deftest test-8735
  (testing "test case 8735"
    (is (= (stemming "transmittance") "transmitt"))))

(deftest test-8736
  (testing "test case 8736"
    (is (= (stemming "overlaid") "overlaid"))))

(deftest test-8737
  (testing "test case 8737"
    (is (= (stemming "debuggers") "debugg"))))

(deftest test-8738
  (testing "test case 8738"
    (is (= (stemming "candor") "candor"))))

(deftest test-8739
  (testing "test case 8739"
    (is (= (stemming "maximum") "maximum"))))

(deftest test-8740
  (testing "test case 8740"
    (is (= (stemming "outriders") "outrid"))))

(deftest test-8741
  (testing "test case 8741"
    (is (= (stemming "nonsensically") "nonsens"))))

(deftest test-8742
  (testing "test case 8742"
    (is (= (stemming "sisal") "sisal"))))

(deftest test-8743
  (testing "test case 8743"
    (is (= (stemming "sternly") "sternli"))))

(deftest test-8744
  (testing "test case 8744"
    (is (= (stemming "contestation") "contest"))))

(deftest test-8745
  (testing "test case 8745"
    (is (= (stemming "dalles") "dall"))))

(deftest test-8746
  (testing "test case 8746"
    (is (= (stemming "garrote") "garrot"))))

(deftest test-8747
  (testing "test case 8747"
    (is (= (stemming "swindle") "swindl"))))

(deftest test-8748
  (testing "test case 8748"
    (is (= (stemming "glutted") "glut"))))

(deftest test-8749
  (testing "test case 8749"
    (is (= (stemming "dilatator") "dilat"))))

(deftest test-8750
  (testing "test case 8750"
    (is (= (stemming "convivially") "convivi"))))

(deftest test-8751
  (testing "test case 8751"
    (is (= (stemming "assign") "assign"))))

(deftest test-8752
  (testing "test case 8752"
    (is (= (stemming "emancipate") "emancip"))))

(deftest test-8753
  (testing "test case 8753"
    (is (= (stemming "nobbier") "nobbier"))))

(deftest test-8754
  (testing "test case 8754"
    (is (= (stemming "imbricate") "imbric"))))

(deftest test-8755
  (testing "test case 8755"
    (is (= (stemming "ranee") "rane"))))

(deftest test-8756
  (testing "test case 8756"
    (is (= (stemming "impulse") "impuls"))))

(deftest test-8757
  (testing "test case 8757"
    (is (= (stemming "yodling") "yodl"))))

(deftest test-8758
  (testing "test case 8758"
    (is (= (stemming "yttric") "yttric"))))

(deftest test-8759
  (testing "test case 8759"
    (is (= (stemming "photocomposing") "photocompos"))))

(deftest test-8760
  (testing "test case 8760"
    (is (= (stemming "equilibrated") "equilibr"))))

(deftest test-8761
  (testing "test case 8761"
    (is (= (stemming "demarcations") "demarc"))))

(deftest test-8762
  (testing "test case 8762"
    (is (= (stemming "cancans") "cancan"))))

(deftest test-8763
  (testing "test case 8763"
    (is (= (stemming "sterilizer") "steril"))))

(deftest test-8764
  (testing "test case 8764"
    (is (= (stemming "sportsman") "sportsman"))))

(deftest test-8765
  (testing "test case 8765"
    (is (= (stemming "birthplaces") "birthplac"))))

(deftest test-8766
  (testing "test case 8766"
    (is (= (stemming "importunes") "importun"))))

(deftest test-8767
  (testing "test case 8767"
    (is (= (stemming "mellowly") "mellowli"))))

(deftest test-8768
  (testing "test case 8768"
    (is (= (stemming "mennonite") "mennonit"))))

(deftest test-8769
  (testing "test case 8769"
    (is (= (stemming "demotist") "demotist"))))

(deftest test-8770
  (testing "test case 8770"
    (is (= (stemming "envier") "envier"))))

(deftest test-8771
  (testing "test case 8771"
    (is (= (stemming "secrets") "secret"))))

(deftest test-8772
  (testing "test case 8772"
    (is (= (stemming "credenza") "credenza"))))

(deftest test-8773
  (testing "test case 8773"
    (is (= (stemming "joking") "joke"))))

(deftest test-8774
  (testing "test case 8774"
    (is (= (stemming "stylizes") "styliz"))))

(deftest test-8775
  (testing "test case 8775"
    (is (= (stemming "herbicidally") "herbicid"))))

(deftest test-8776
  (testing "test case 8776"
    (is (= (stemming "spousal") "spousal"))))

(deftest test-8777
  (testing "test case 8777"
    (is (= (stemming "preceptors") "preceptor"))))

(deftest test-8778
  (testing "test case 8778"
    (is (= (stemming "cocoas") "cocoa"))))

(deftest test-8779
  (testing "test case 8779"
    (is (= (stemming "peatiest") "peatiest"))))

(deftest test-8780
  (testing "test case 8780"
    (is (= (stemming "hobbler") "hobbler"))))

(deftest test-8781
  (testing "test case 8781"
    (is (= (stemming "rhumbaed") "rhumba"))))

(deftest test-8782
  (testing "test case 8782"
    (is (= (stemming "absurds") "absurd"))))

(deftest test-8783
  (testing "test case 8783"
    (is (= (stemming "presbyope") "presbyop"))))

(deftest test-8784
  (testing "test case 8784"
    (is (= (stemming "osteopathic") "osteopath"))))

(deftest test-8785
  (testing "test case 8785"
    (is (= (stemming "momentoes") "momento"))))

(deftest test-8786
  (testing "test case 8786"
    (is (= (stemming "oblations") "oblat"))))

(deftest test-8787
  (testing "test case 8787"
    (is (= (stemming "isomers") "isom"))))

(deftest test-8788
  (testing "test case 8788"
    (is (= (stemming "pshawed") "pshaw"))))

(deftest test-8789
  (testing "test case 8789"
    (is (= (stemming "countermanding") "countermand"))))

(deftest test-8790
  (testing "test case 8790"
    (is (= (stemming "surfable") "surfabl"))))

(deftest test-8791
  (testing "test case 8791"
    (is (= (stemming "toped") "tope"))))

(deftest test-8792
  (testing "test case 8792"
    (is (= (stemming "docents") "docent"))))

(deftest test-8793
  (testing "test case 8793"
    (is (= (stemming "tantalic") "tantal"))))

(deftest test-8794
  (testing "test case 8794"
    (is (= (stemming "sulkiness") "sulki"))))

(deftest test-8795
  (testing "test case 8795"
    (is (= (stemming "inventors") "inventor"))))

(deftest test-8796
  (testing "test case 8796"
    (is (= (stemming "griminess") "grimi"))))

(deftest test-8797
  (testing "test case 8797"
    (is (= (stemming "cheesier") "cheesier"))))

(deftest test-8798
  (testing "test case 8798"
    (is (= (stemming "incompressable") "incompress"))))

(deftest test-8799
  (testing "test case 8799"
    (is (= (stemming "tortrix") "tortrix"))))

(deftest test-8800
  (testing "test case 8800"
    (is (= (stemming "endamaged") "endamag"))))

(deftest test-8801
  (testing "test case 8801"
    (is (= (stemming "frescoed") "fresco"))))

(deftest test-8802
  (testing "test case 8802"
    (is (= (stemming "scanted") "scant"))))

(deftest test-8803
  (testing "test case 8803"
    (is (= (stemming "elementals") "element"))))

(deftest test-8804
  (testing "test case 8804"
    (is (= (stemming "baggily") "baggili"))))

(deftest test-8805
  (testing "test case 8805"
    (is (= (stemming "cowboys") "cowboi"))))

(deftest test-8806
  (testing "test case 8806"
    (is (= (stemming "husbander") "husband"))))

(deftest test-8807
  (testing "test case 8807"
    (is (= (stemming "porphyries") "porphyri"))))

(deftest test-8808
  (testing "test case 8808"
    (is (= (stemming "rafflers") "raffler"))))

(deftest test-8809
  (testing "test case 8809"
    (is (= (stemming "abscissions") "absciss"))))

(deftest test-8810
  (testing "test case 8810"
    (is (= (stemming "spendthrifty") "spendthrifti"))))

(deftest test-8811
  (testing "test case 8811"
    (is (= (stemming "glides") "glide"))))

(deftest test-8812
  (testing "test case 8812"
    (is (= (stemming "beechier") "beechier"))))

(deftest test-8813
  (testing "test case 8813"
    (is (= (stemming "astonished") "astonish"))))

(deftest test-8814
  (testing "test case 8814"
    (is (= (stemming "brock") "brock"))))

(deftest test-8815
  (testing "test case 8815"
    (is (= (stemming "demarcating") "demarc"))))

(deftest test-8816
  (testing "test case 8816"
    (is (= (stemming "uniform") "uniform"))))

(deftest test-8817
  (testing "test case 8817"
    (is (= (stemming "balefully") "balefulli"))))

(deftest test-8818
  (testing "test case 8818"
    (is (= (stemming "carmakers") "carmak"))))

(deftest test-8819
  (testing "test case 8819"
    (is (= (stemming "flunkers") "flunker"))))

(deftest test-8820
  (testing "test case 8820"
    (is (= (stemming "tackless") "tackless"))))

(deftest test-8821
  (testing "test case 8821"
    (is (= (stemming "hewn") "hewn"))))

(deftest test-8822
  (testing "test case 8822"
    (is (= (stemming "armigers") "armig"))))

(deftest test-8823
  (testing "test case 8823"
    (is (= (stemming "jinrikisha") "jinrikisha"))))

(deftest test-8824
  (testing "test case 8824"
    (is (= (stemming "hoaxing") "hoax"))))

(deftest test-8825
  (testing "test case 8825"
    (is (= (stemming "ingloriously") "inglori"))))

(deftest test-8826
  (testing "test case 8826"
    (is (= (stemming "concocted") "concoct"))))

(deftest test-8827
  (testing "test case 8827"
    (is (= (stemming "kickstand") "kickstand"))))

(deftest test-8828
  (testing "test case 8828"
    (is (= (stemming "blunged") "blung"))))

(deftest test-8829
  (testing "test case 8829"
    (is (= (stemming "bald") "bald"))))

(deftest test-8830
  (testing "test case 8830"
    (is (= (stemming "millivolt") "millivolt"))))

(deftest test-8831
  (testing "test case 8831"
    (is (= (stemming "concessions") "concess"))))

(deftest test-8832
  (testing "test case 8832"
    (is (= (stemming "pawers") "pawer"))))

(deftest test-8833
  (testing "test case 8833"
    (is (= (stemming "gorgedly") "gorgedli"))))

(deftest test-8834
  (testing "test case 8834"
    (is (= (stemming "raisiny") "raisini"))))

(deftest test-8835
  (testing "test case 8835"
    (is (= (stemming "orth") "orth"))))

(deftest test-8836
  (testing "test case 8836"
    (is (= (stemming "garglers") "gargler"))))

(deftest test-8837
  (testing "test case 8837"
    (is (= (stemming "wound") "wound"))))

(deftest test-8838
  (testing "test case 8838"
    (is (= (stemming "tetany") "tetani"))))

(deftest test-8839
  (testing "test case 8839"
    (is (= (stemming "unabsorbent") "unabsorb"))))

(deftest test-8840
  (testing "test case 8840"
    (is (= (stemming "drown") "drown"))))

(deftest test-8841
  (testing "test case 8841"
    (is (= (stemming "recelebrated") "recelebr"))))

(deftest test-8842
  (testing "test case 8842"
    (is (= (stemming "reliable") "reliabl"))))

(deftest test-8843
  (testing "test case 8843"
    (is (= (stemming "hemorrhoidal") "hemorrhoid"))))

(deftest test-8844
  (testing "test case 8844"
    (is (= (stemming "skirters") "skirter"))))

(deftest test-8845
  (testing "test case 8845"
    (is (= (stemming "wormwoods") "wormwood"))))

(deftest test-8846
  (testing "test case 8846"
    (is (= (stemming "narrowing") "narrow"))))

(deftest test-8847
  (testing "test case 8847"
    (is (= (stemming "topful") "top"))))

(deftest test-8848
  (testing "test case 8848"
    (is (= (stemming "escoting") "escot"))))

(deftest test-8849
  (testing "test case 8849"
    (is (= (stemming "outcome") "outcom"))))

(deftest test-8850
  (testing "test case 8850"
    (is (= (stemming "multistory") "multistori"))))

(deftest test-8851
  (testing "test case 8851"
    (is (= (stemming "direfully") "direfulli"))))

(deftest test-8852
  (testing "test case 8852"
    (is (= (stemming "catabolize") "catabol"))))

(deftest test-8853
  (testing "test case 8853"
    (is (= (stemming "nosh") "nosh"))))

(deftest test-8854
  (testing "test case 8854"
    (is (= (stemming "queenliness") "queenli"))))

(deftest test-8855
  (testing "test case 8855"
    (is (= (stemming "rereading") "reread"))))

(deftest test-8856
  (testing "test case 8856"
    (is (= (stemming "canonists") "canonist"))))

(deftest test-8857
  (testing "test case 8857"
    (is (= (stemming "delaware") "delawar"))))

(deftest test-8858
  (testing "test case 8858"
    (is (= (stemming "booker") "booker"))))

(deftest test-8859
  (testing "test case 8859"
    (is (= (stemming "flagellators") "flagel"))))

(deftest test-8860
  (testing "test case 8860"
    (is (= (stemming "misinstructs") "misinstruct"))))

(deftest test-8861
  (testing "test case 8861"
    (is (= (stemming "persistently") "persist"))))

(deftest test-8862
  (testing "test case 8862"
    (is (= (stemming "preforming") "preform"))))

(deftest test-8863
  (testing "test case 8863"
    (is (= (stemming "towns") "town"))))

(deftest test-8864
  (testing "test case 8864"
    (is (= (stemming "protestor") "protestor"))))

(deftest test-8865
  (testing "test case 8865"
    (is (= (stemming "sueding") "sued"))))

(deftest test-8866
  (testing "test case 8866"
    (is (= (stemming "foresail") "foresail"))))

(deftest test-8867
  (testing "test case 8867"
    (is (= (stemming "farthingale") "farthingal"))))

(deftest test-8868
  (testing "test case 8868"
    (is (= (stemming "flippancies") "flippanc"))))

(deftest test-8869
  (testing "test case 8869"
    (is (= (stemming "danube") "danub"))))

(deftest test-8870
  (testing "test case 8870"
    (is (= (stemming "subdistinction") "subdistinct"))))

(deftest test-8871
  (testing "test case 8871"
    (is (= (stemming "hornbooks") "hornbook"))))

(deftest test-8872
  (testing "test case 8872"
    (is (= (stemming "microbiologic") "microbiolog"))))

(deftest test-8873
  (testing "test case 8873"
    (is (= (stemming "politick") "politick"))))

(deftest test-8874
  (testing "test case 8874"
    (is (= (stemming "superconductivity") "superconduct"))))

(deftest test-8875
  (testing "test case 8875"
    (is (= (stemming "neoliths") "neolith"))))

(deftest test-8876
  (testing "test case 8876"
    (is (= (stemming "carder") "carder"))))

(deftest test-8877
  (testing "test case 8877"
    (is (= (stemming "hibernate") "hibern"))))

(deftest test-8878
  (testing "test case 8878"
    (is (= (stemming "lanolins") "lanolin"))))

(deftest test-8879
  (testing "test case 8879"
    (is (= (stemming "totipotency") "totipot"))))

(deftest test-8880
  (testing "test case 8880"
    (is (= (stemming "untwist") "untwist"))))

(deftest test-8881
  (testing "test case 8881"
    (is (= (stemming "koodoos") "koodoo"))))

(deftest test-8882
  (testing "test case 8882"
    (is (= (stemming "juiciest") "juiciest"))))

(deftest test-8883
  (testing "test case 8883"
    (is (= (stemming "clotting") "clot"))))

(deftest test-8884
  (testing "test case 8884"
    (is (= (stemming "gargantuan") "gargantuan"))))

(deftest test-8885
  (testing "test case 8885"
    (is (= (stemming "merchantability") "merchant"))))

(deftest test-8886
  (testing "test case 8886"
    (is (= (stemming "gossipers") "gossip"))))

(deftest test-8887
  (testing "test case 8887"
    (is (= (stemming "sesquicentennially") "sesquicentenni"))))

(deftest test-8888
  (testing "test case 8888"
    (is (= (stemming "afreet") "afreet"))))

(deftest test-8889
  (testing "test case 8889"
    (is (= (stemming "goodies") "goodi"))))

(deftest test-8890
  (testing "test case 8890"
    (is (= (stemming "gadflies") "gadfli"))))

(deftest test-8891
  (testing "test case 8891"
    (is (= (stemming "fullbacks") "fullback"))))

(deftest test-8892
  (testing "test case 8892"
    (is (= (stemming "gasoline") "gasolin"))))

(deftest test-8893
  (testing "test case 8893"
    (is (= (stemming "certitude") "certitud"))))

(deftest test-8894
  (testing "test case 8894"
    (is (= (stemming "nonsenses") "nonsens"))))

(deftest test-8895
  (testing "test case 8895"
    (is (= (stemming "plasticized") "plastic"))))

(deftest test-8896
  (testing "test case 8896"
    (is (= (stemming "truncating") "truncat"))))

(deftest test-8897
  (testing "test case 8897"
    (is (= (stemming "understates") "underst"))))

(deftest test-8898
  (testing "test case 8898"
    (is (= (stemming "ducked") "duck"))))

(deftest test-8899
  (testing "test case 8899"
    (is (= (stemming "impolitic") "impolit"))))

(deftest test-8900
  (testing "test case 8900"
    (is (= (stemming "massive") "massiv"))))

(deftest test-8901
  (testing "test case 8901"
    (is (= (stemming "agelong") "agelong"))))

(deftest test-8902
  (testing "test case 8902"
    (is (= (stemming "agar") "agar"))))

(deftest test-8903
  (testing "test case 8903"
    (is (= (stemming "sugarier") "sugari"))))

(deftest test-8904
  (testing "test case 8904"
    (is (= (stemming "aphorizing") "aphor"))))

(deftest test-8905
  (testing "test case 8905"
    (is (= (stemming "clues") "clue"))))

(deftest test-8906
  (testing "test case 8906"
    (is (= (stemming "eleven") "eleven"))))

(deftest test-8907
  (testing "test case 8907"
    (is (= (stemming "preteen") "preteen"))))

(deftest test-8908
  (testing "test case 8908"
    (is (= (stemming "interlards") "interlard"))))

(deftest test-8909
  (testing "test case 8909"
    (is (= (stemming "mouldier") "mouldier"))))

(deftest test-8910
  (testing "test case 8910"
    (is (= (stemming "platooned") "platoon"))))

(deftest test-8911
  (testing "test case 8911"
    (is (= (stemming "conception") "concept"))))

(deftest test-8912
  (testing "test case 8912"
    (is (= (stemming "outliver") "outliv"))))

(deftest test-8913
  (testing "test case 8913"
    (is (= (stemming "reappraisement") "reapprais"))))

(deftest test-8914
  (testing "test case 8914"
    (is (= (stemming "synthetically") "synthet"))))

(deftest test-8915
  (testing "test case 8915"
    (is (= (stemming "alphanumeric") "alphanumer"))))

(deftest test-8916
  (testing "test case 8916"
    (is (= (stemming "clubfeet") "clubfeet"))))

(deftest test-8917
  (testing "test case 8917"
    (is (= (stemming "finger") "finger"))))

(deftest test-8918
  (testing "test case 8918"
    (is (= (stemming "lilt") "lilt"))))

(deftest test-8919
  (testing "test case 8919"
    (is (= (stemming "reechoing") "reecho"))))

(deftest test-8920
  (testing "test case 8920"
    (is (= (stemming "no") "no"))))

(deftest test-8921
  (testing "test case 8921"
    (is (= (stemming "premeditatedly") "premeditatedli"))))

(deftest test-8922
  (testing "test case 8922"
    (is (= (stemming "crap") "crap"))))

(deftest test-8923
  (testing "test case 8923"
    (is (= (stemming "senilities") "senil"))))

(deftest test-8924
  (testing "test case 8924"
    (is (= (stemming "mensches") "mensch"))))

(deftest test-8925
  (testing "test case 8925"
    (is (= (stemming "mound") "mound"))))

(deftest test-8926
  (testing "test case 8926"
    (is (= (stemming "fishbowl") "fishbowl"))))

(deftest test-8927
  (testing "test case 8927"
    (is (= (stemming "dreamier") "dreamier"))))

(deftest test-8928
  (testing "test case 8928"
    (is (= (stemming "undercuts") "undercut"))))

(deftest test-8929
  (testing "test case 8929"
    (is (= (stemming "saluter") "salut"))))

(deftest test-8930
  (testing "test case 8930"
    (is (= (stemming "reconsolidations") "reconsolid"))))

(deftest test-8931
  (testing "test case 8931"
    (is (= (stemming "remarking") "remark"))))

(deftest test-8932
  (testing "test case 8932"
    (is (= (stemming "cenotaph") "cenotaph"))))

(deftest test-8933
  (testing "test case 8933"
    (is (= (stemming "infix") "infix"))))

(deftest test-8934
  (testing "test case 8934"
    (is (= (stemming "simulators") "simul"))))

(deftest test-8935
  (testing "test case 8935"
    (is (= (stemming "putted") "put"))))

(deftest test-8936
  (testing "test case 8936"
    (is (= (stemming "bullpens") "bullpen"))))

(deftest test-8937
  (testing "test case 8937"
    (is (= (stemming "gypsied") "gypsi"))))

(deftest test-8938
  (testing "test case 8938"
    (is (= (stemming "supervisorship") "supervisorship"))))

(deftest test-8939
  (testing "test case 8939"
    (is (= (stemming "pigeonholing") "pigeonhol"))))

(deftest test-8940
  (testing "test case 8940"
    (is (= (stemming "bureaucratized") "bureaucrat"))))

(deftest test-8941
  (testing "test case 8941"
    (is (= (stemming "logistically") "logist"))))

(deftest test-8942
  (testing "test case 8942"
    (is (= (stemming "tumbles") "tumbl"))))

(deftest test-8943
  (testing "test case 8943"
    (is (= (stemming "leavings") "leav"))))

(deftest test-8944
  (testing "test case 8944"
    (is (= (stemming "fanatical") "fanat"))))

(deftest test-8945
  (testing "test case 8945"
    (is (= (stemming "sharecrops") "sharecrop"))))

(deftest test-8946
  (testing "test case 8946"
    (is (= (stemming "schoolbook") "schoolbook"))))

(deftest test-8947
  (testing "test case 8947"
    (is (= (stemming "prudent") "prudent"))))

(deftest test-8948
  (testing "test case 8948"
    (is (= (stemming "infirmable") "infirm"))))

(deftest test-8949
  (testing "test case 8949"
    (is (= (stemming "publicized") "public"))))

(deftest test-8950
  (testing "test case 8950"
    (is (= (stemming "engirdling") "engirdl"))))

(deftest test-8951
  (testing "test case 8951"
    (is (= (stemming "tails") "tail"))))

(deftest test-8952
  (testing "test case 8952"
    (is (= (stemming "redeploys") "redeploi"))))

(deftest test-8953
  (testing "test case 8953"
    (is (= (stemming "ipecac") "ipecac"))))

(deftest test-8954
  (testing "test case 8954"
    (is (= (stemming "scripted") "script"))))

(deftest test-8955
  (testing "test case 8955"
    (is (= (stemming "kumquats") "kumquat"))))

(deftest test-8956
  (testing "test case 8956"
    (is (= (stemming "quality") "qualiti"))))

(deftest test-8957
  (testing "test case 8957"
    (is (= (stemming "elapses") "elaps"))))

(deftest test-8958
  (testing "test case 8958"
    (is (= (stemming "narcissism") "narciss"))))

(deftest test-8959
  (testing "test case 8959"
    (is (= (stemming "compartmentally") "compartment"))))

(deftest test-8960
  (testing "test case 8960"
    (is (= (stemming "enmeshed") "enmesh"))))

(deftest test-8961
  (testing "test case 8961"
    (is (= (stemming "stargazing") "stargaz"))))

(deftest test-8962
  (testing "test case 8962"
    (is (= (stemming "embassadress") "embassadress"))))

(deftest test-8963
  (testing "test case 8963"
    (is (= (stemming "backwaters") "backwat"))))

(deftest test-8964
  (testing "test case 8964"
    (is (= (stemming "validly") "validli"))))

(deftest test-8965
  (testing "test case 8965"
    (is (= (stemming "hallah") "hallah"))))

(deftest test-8966
  (testing "test case 8966"
    (is (= (stemming "steadfastly") "steadfastli"))))

(deftest test-8967
  (testing "test case 8967"
    (is (= (stemming "dealing") "deal"))))

(deftest test-8968
  (testing "test case 8968"
    (is (= (stemming "swithers") "swither"))))

(deftest test-8969
  (testing "test case 8969"
    (is (= (stemming "recallable") "recal"))))

(deftest test-8970
  (testing "test case 8970"
    (is (= (stemming "silence") "silenc"))))

(deftest test-8971
  (testing "test case 8971"
    (is (= (stemming "aspires") "aspir"))))

(deftest test-8972
  (testing "test case 8972"
    (is (= (stemming "misfortunes") "misfortun"))))

(deftest test-8973
  (testing "test case 8973"
    (is (= (stemming "marketer") "market"))))

(deftest test-8974
  (testing "test case 8974"
    (is (= (stemming "nouveaux") "nouveaux"))))

(deftest test-8975
  (testing "test case 8975"
    (is (= (stemming "inviolability") "inviol"))))

(deftest test-8976
  (testing "test case 8976"
    (is (= (stemming "ragouts") "ragout"))))

(deftest test-8977
  (testing "test case 8977"
    (is (= (stemming "outsized") "outsiz"))))

(deftest test-8978
  (testing "test case 8978"
    (is (= (stemming "hooey") "hooei"))))

(deftest test-8979
  (testing "test case 8979"
    (is (= (stemming "conciliate") "concili"))))

(deftest test-8980
  (testing "test case 8980"
    (is (= (stemming "infolding") "infold"))))

(deftest test-8981
  (testing "test case 8981"
    (is (= (stemming "entanglements") "entangl"))))

(deftest test-8982
  (testing "test case 8982"
    (is (= (stemming "unwrinkles") "unwrinkl"))))

(deftest test-8983
  (testing "test case 8983"
    (is (= (stemming "accoutred") "accoutr"))))

(deftest test-8984
  (testing "test case 8984"
    (is (= (stemming "hairwork") "hairwork"))))

(deftest test-8985
  (testing "test case 8985"
    (is (= (stemming "banished") "banish"))))

(deftest test-8986
  (testing "test case 8986"
    (is (= (stemming "quotational") "quotat"))))

(deftest test-8987
  (testing "test case 8987"
    (is (= (stemming "kithara") "kithara"))))

(deftest test-8988
  (testing "test case 8988"
    (is (= (stemming "tokened") "token"))))

(deftest test-8989
  (testing "test case 8989"
    (is (= (stemming "milords") "milord"))))

(deftest test-8990
  (testing "test case 8990"
    (is (= (stemming "decompressed") "decompress"))))

(deftest test-8991
  (testing "test case 8991"
    (is (= (stemming "gnomists") "gnomist"))))

(deftest test-8992
  (testing "test case 8992"
    (is (= (stemming "lobed") "lobe"))))

(deftest test-8993
  (testing "test case 8993"
    (is (= (stemming "antebellum") "antebellum"))))

(deftest test-8994
  (testing "test case 8994"
    (is (= (stemming "earthiness") "earthi"))))

(deftest test-8995
  (testing "test case 8995"
    (is (= (stemming "ranchmen") "ranchmen"))))

(deftest test-8996
  (testing "test case 8996"
    (is (= (stemming "eidolon") "eidolon"))))

(deftest test-8997
  (testing "test case 8997"
    (is (= (stemming "magicians") "magician"))))

(deftest test-8998
  (testing "test case 8998"
    (is (= (stemming "effeteness") "effet"))))

(deftest test-8999
  (testing "test case 8999"
    (is (= (stemming "troll") "troll"))))

(deftest test-9000
  (testing "test case 9000"
    (is (= (stemming "systemizing") "system"))))

(deftest test-9001
  (testing "test case 9001"
    (is (= (stemming "retrocede") "retroced"))))

(deftest test-9002
  (testing "test case 9002"
    (is (= (stemming "paroxysms") "paroxysm"))))

(deftest test-9003
  (testing "test case 9003"
    (is (= (stemming "unholiness") "unholi"))))

(deftest test-9004
  (testing "test case 9004"
    (is (= (stemming "reutilization") "reutil"))))

(deftest test-9005
  (testing "test case 9005"
    (is (= (stemming "gangways") "gangwai"))))

(deftest test-9006
  (testing "test case 9006"
    (is (= (stemming "dubiousness") "dubious"))))

(deftest test-9007
  (testing "test case 9007"
    (is (= (stemming "numinous") "numin"))))

(deftest test-9008
  (testing "test case 9008"
    (is (= (stemming "clopping") "clop"))))

(deftest test-9009
  (testing "test case 9009"
    (is (= (stemming "profanes") "profan"))))

(deftest test-9010
  (testing "test case 9010"
    (is (= (stemming "puller") "puller"))))

(deftest test-9011
  (testing "test case 9011"
    (is (= (stemming "megabit") "megabit"))))

(deftest test-9012
  (testing "test case 9012"
    (is (= (stemming "desuetude") "desuetud"))))

(deftest test-9013
  (testing "test case 9013"
    (is (= (stemming "lady") "ladi"))))

(deftest test-9014
  (testing "test case 9014"
    (is (= (stemming "casinos") "casino"))))

(deftest test-9015
  (testing "test case 9015"
    (is (= (stemming "foolscaps") "foolscap"))))

(deftest test-9016
  (testing "test case 9016"
    (is (= (stemming "stipendless") "stipendless"))))

(deftest test-9017
  (testing "test case 9017"
    (is (= (stemming "salter") "salter"))))

(deftest test-9018
  (testing "test case 9018"
    (is (= (stemming "elucidations") "elucid"))))

(deftest test-9019
  (testing "test case 9019"
    (is (= (stemming "heeled") "heel"))))

(deftest test-9020
  (testing "test case 9020"
    (is (= (stemming "graphics") "graphic"))))

(deftest test-9021
  (testing "test case 9021"
    (is (= (stemming "injured") "injur"))))

(deftest test-9022
  (testing "test case 9022"
    (is (= (stemming "radiographically") "radiograph"))))

(deftest test-9023
  (testing "test case 9023"
    (is (= (stemming "valvular") "valvular"))))

(deftest test-9024
  (testing "test case 9024"
    (is (= (stemming "philter") "philter"))))

(deftest test-9025
  (testing "test case 9025"
    (is (= (stemming "bacteriocidal") "bacteriocid"))))

(deftest test-9026
  (testing "test case 9026"
    (is (= (stemming "brouhahas") "brouhaha"))))

(deftest test-9027
  (testing "test case 9027"
    (is (= (stemming "classification") "classif"))))

(deftest test-9028
  (testing "test case 9028"
    (is (= (stemming "scallopers") "scallop"))))

(deftest test-9029
  (testing "test case 9029"
    (is (= (stemming "ye") "ye"))))

(deftest test-9030
  (testing "test case 9030"
    (is (= (stemming "cees") "cee"))))

(deftest test-9031
  (testing "test case 9031"
    (is (= (stemming "recommending") "recommend"))))

(deftest test-9032
  (testing "test case 9032"
    (is (= (stemming "thorps") "thorp"))))

(deftest test-9033
  (testing "test case 9033"
    (is (= (stemming "eductors") "eductor"))))

(deftest test-9034
  (testing "test case 9034"
    (is (= (stemming "gasmen") "gasmen"))))

(deftest test-9035
  (testing "test case 9035"
    (is (= (stemming "satisfy") "satisfi"))))

(deftest test-9036
  (testing "test case 9036"
    (is (= (stemming "climactic") "climact"))))

(deftest test-9037
  (testing "test case 9037"
    (is (= (stemming "recondition") "recondit"))))

(deftest test-9038
  (testing "test case 9038"
    (is (= (stemming "downplay") "downplai"))))

(deftest test-9039
  (testing "test case 9039"
    (is (= (stemming "stooling") "stool"))))

(deftest test-9040
  (testing "test case 9040"
    (is (= (stemming "adagio") "adagio"))))

(deftest test-9041
  (testing "test case 9041"
    (is (= (stemming "generalizing") "gener"))))

(deftest test-9042
  (testing "test case 9042"
    (is (= (stemming "scrimshaws") "scrimshaw"))))

(deftest test-9043
  (testing "test case 9043"
    (is (= (stemming "carbineer") "carbin"))))

(deftest test-9044
  (testing "test case 9044"
    (is (= (stemming "gained") "gain"))))

(deftest test-9045
  (testing "test case 9045"
    (is (= (stemming "dwarfing") "dwarf"))))

(deftest test-9046
  (testing "test case 9046"
    (is (= (stemming "middlebrows") "middlebrow"))))

(deftest test-9047
  (testing "test case 9047"
    (is (= (stemming "whooshed") "whoosh"))))

(deftest test-9048
  (testing "test case 9048"
    (is (= (stemming "espy") "espi"))))

(deftest test-9049
  (testing "test case 9049"
    (is (= (stemming "irritated") "irrit"))))

(deftest test-9050
  (testing "test case 9050"
    (is (= (stemming "wirepuller") "wirepul"))))

(deftest test-9051
  (testing "test case 9051"
    (is (= (stemming "melodic") "melod"))))

(deftest test-9052
  (testing "test case 9052"
    (is (= (stemming "lightering") "lighter"))))

(deftest test-9053
  (testing "test case 9053"
    (is (= (stemming "placks") "plack"))))

(deftest test-9054
  (testing "test case 9054"
    (is (= (stemming "josephs") "joseph"))))

(deftest test-9055
  (testing "test case 9055"
    (is (= (stemming "djibouti") "djibouti"))))

(deftest test-9056
  (testing "test case 9056"
    (is (= (stemming "accusingly") "accusingli"))))

(deftest test-9057
  (testing "test case 9057"
    (is (= (stemming "overcharge") "overcharg"))))

(deftest test-9058
  (testing "test case 9058"
    (is (= (stemming "milles") "mill"))))

(deftest test-9059
  (testing "test case 9059"
    (is (= (stemming "tearfully") "tearfulli"))))

(deftest test-9060
  (testing "test case 9060"
    (is (= (stemming "originality") "origin"))))

(deftest test-9061
  (testing "test case 9061"
    (is (= (stemming "thermostable") "thermost"))))

(deftest test-9062
  (testing "test case 9062"
    (is (= (stemming "bronziest") "bronziest"))))

(deftest test-9063
  (testing "test case 9063"
    (is (= (stemming "acne") "acn"))))

(deftest test-9064
  (testing "test case 9064"
    (is (= (stemming "turgors") "turgor"))))

(deftest test-9065
  (testing "test case 9065"
    (is (= (stemming "boxfish") "boxfish"))))

(deftest test-9066
  (testing "test case 9066"
    (is (= (stemming "plugging") "plug"))))

(deftest test-9067
  (testing "test case 9067"
    (is (= (stemming "saharan") "saharan"))))

(deftest test-9068
  (testing "test case 9068"
    (is (= (stemming "strangest") "strangest"))))

(deftest test-9069
  (testing "test case 9069"
    (is (= (stemming "betrayals") "betray"))))

(deftest test-9070
  (testing "test case 9070"
    (is (= (stemming "illuminative") "illumin"))))

(deftest test-9071
  (testing "test case 9071"
    (is (= (stemming "microbe") "microb"))))

(deftest test-9072
  (testing "test case 9072"
    (is (= (stemming "tenability") "tenabl"))))

(deftest test-9073
  (testing "test case 9073"
    (is (= (stemming "familiarized") "familiar"))))

(deftest test-9074
  (testing "test case 9074"
    (is (= (stemming "unnerves") "unnerv"))))

(deftest test-9075
  (testing "test case 9075"
    (is (= (stemming "fling") "fling"))))

(deftest test-9076
  (testing "test case 9076"
    (is (= (stemming "cowbell") "cowbel"))))

(deftest test-9077
  (testing "test case 9077"
    (is (= (stemming "supering") "super"))))

(deftest test-9078
  (testing "test case 9078"
    (is (= (stemming "exhilarating") "exhilar"))))

(deftest test-9079
  (testing "test case 9079"
    (is (= (stemming "shrubberies") "shrubberi"))))

(deftest test-9080
  (testing "test case 9080"
    (is (= (stemming "glockenspiel") "glockenspiel"))))

(deftest test-9081
  (testing "test case 9081"
    (is (= (stemming "inkpot") "inkpot"))))

(deftest test-9082
  (testing "test case 9082"
    (is (= (stemming "unblock") "unblock"))))

(deftest test-9083
  (testing "test case 9083"
    (is (= (stemming "defoliated") "defoli"))))

(deftest test-9084
  (testing "test case 9084"
    (is (= (stemming "doge") "doge"))))

(deftest test-9085
  (testing "test case 9085"
    (is (= (stemming "kinemas") "kinema"))))

(deftest test-9086
  (testing "test case 9086"
    (is (= (stemming "progenies") "progeni"))))

(deftest test-9087
  (testing "test case 9087"
    (is (= (stemming "calculate") "calcul"))))

(deftest test-9088
  (testing "test case 9088"
    (is (= (stemming "squealer") "squealer"))))

(deftest test-9089
  (testing "test case 9089"
    (is (= (stemming "projection") "project"))))

(deftest test-9090
  (testing "test case 9090"
    (is (= (stemming "tilth") "tilth"))))

(deftest test-9091
  (testing "test case 9091"
    (is (= (stemming "publicly") "publicli"))))

(deftest test-9092
  (testing "test case 9092"
    (is (= (stemming "pizzerias") "pizzeria"))))

(deftest test-9093
  (testing "test case 9093"
    (is (= (stemming "excusing") "excus"))))

(deftest test-9094
  (testing "test case 9094"
    (is (= (stemming "briefcase") "briefcas"))))

(deftest test-9095
  (testing "test case 9095"
    (is (= (stemming "whittler") "whittler"))))

(deftest test-9096
  (testing "test case 9096"
    (is (= (stemming "signaller") "signal"))))

(deftest test-9097
  (testing "test case 9097"
    (is (= (stemming "nocturns") "nocturn"))))

(deftest test-9098
  (testing "test case 9098"
    (is (= (stemming "dyadic") "dyadic"))))

(deftest test-9099
  (testing "test case 9099"
    (is (= (stemming "frustratingly") "frustratingli"))))

(deftest test-9100
  (testing "test case 9100"
    (is (= (stemming "embroglios") "embroglio"))))

(deftest test-9101
  (testing "test case 9101"
    (is (= (stemming "ziggurat") "ziggurat"))))

(deftest test-9102
  (testing "test case 9102"
    (is (= (stemming "bopping") "bop"))))

(deftest test-9103
  (testing "test case 9103"
    (is (= (stemming "electrophoresed") "electrophores"))))

(deftest test-9104
  (testing "test case 9104"
    (is (= (stemming "lightings") "light"))))

(deftest test-9105
  (testing "test case 9105"
    (is (= (stemming "referendums") "referendum"))))

(deftest test-9106
  (testing "test case 9106"
    (is (= (stemming "bison") "bison"))))

(deftest test-9107
  (testing "test case 9107"
    (is (= (stemming "grueled") "gruel"))))

(deftest test-9108
  (testing "test case 9108"
    (is (= (stemming "fascinations") "fascin"))))

(deftest test-9109
  (testing "test case 9109"
    (is (= (stemming "demagnification") "demagnif"))))

(deftest test-9110
  (testing "test case 9110"
    (is (= (stemming "recapitalize") "recapit"))))

(deftest test-9111
  (testing "test case 9111"
    (is (= (stemming "calmness") "calm"))))

(deftest test-9112
  (testing "test case 9112"
    (is (= (stemming "refortify") "refortifi"))))

(deftest test-9113
  (testing "test case 9113"
    (is (= (stemming "antecedently") "anteced"))))

(deftest test-9114
  (testing "test case 9114"
    (is (= (stemming "gregariousness") "gregari"))))

(deftest test-9115
  (testing "test case 9115"
    (is (= (stemming "misdirection") "misdirect"))))

(deftest test-9116
  (testing "test case 9116"
    (is (= (stemming "tantalizers") "tantal"))))

(deftest test-9117
  (testing "test case 9117"
    (is (= (stemming "envisage") "envisag"))))

(deftest test-9118
  (testing "test case 9118"
    (is (= (stemming "licht") "licht"))))

(deftest test-9119
  (testing "test case 9119"
    (is (= (stemming "taproom") "taproom"))))

(deftest test-9120
  (testing "test case 9120"
    (is (= (stemming "wedlocks") "wedlock"))))

(deftest test-9121
  (testing "test case 9121"
    (is (= (stemming "strawhat") "strawhat"))))

(deftest test-9122
  (testing "test case 9122"
    (is (= (stemming "horse") "hors"))))

(deftest test-9123
  (testing "test case 9123"
    (is (= (stemming "anachronistical") "anachronist"))))

(deftest test-9124
  (testing "test case 9124"
    (is (= (stemming "minnie") "minni"))))

(deftest test-9125
  (testing "test case 9125"
    (is (= (stemming "vive") "vive"))))

(deftest test-9126
  (testing "test case 9126"
    (is (= (stemming "pluck") "pluck"))))

(deftest test-9127
  (testing "test case 9127"
    (is (= (stemming "whirlpool") "whirlpool"))))

(deftest test-9128
  (testing "test case 9128"
    (is (= (stemming "parasitologic") "parasitolog"))))

(deftest test-9129
  (testing "test case 9129"
    (is (= (stemming "greyest") "greyest"))))

(deftest test-9130
  (testing "test case 9130"
    (is (= (stemming "sweeper") "sweeper"))))

(deftest test-9131
  (testing "test case 9131"
    (is (= (stemming "birders") "birder"))))

(deftest test-9132
  (testing "test case 9132"
    (is (= (stemming "trenchancy") "trenchanc"))))

(deftest test-9133
  (testing "test case 9133"
    (is (= (stemming "photospheric") "photospher"))))

(deftest test-9134
  (testing "test case 9134"
    (is (= (stemming "ostentatious") "ostentati"))))

(deftest test-9135
  (testing "test case 9135"
    (is (= (stemming "poleaxes") "poleax"))))

(deftest test-9136
  (testing "test case 9136"
    (is (= (stemming "summered") "summer"))))

(deftest test-9137
  (testing "test case 9137"
    (is (= (stemming "celadons") "celadon"))))

(deftest test-9138
  (testing "test case 9138"
    (is (= (stemming "infantile") "infantil"))))

(deftest test-9139
  (testing "test case 9139"
    (is (= (stemming "invigorated") "invigor"))))

(deftest test-9140
  (testing "test case 9140"
    (is (= (stemming "shampooer") "shampooer"))))

(deftest test-9141
  (testing "test case 9141"
    (is (= (stemming "billhooks") "billhook"))))

(deftest test-9142
  (testing "test case 9142"
    (is (= (stemming "clincher") "clincher"))))

(deftest test-9143
  (testing "test case 9143"
    (is (= (stemming "detriment") "detriment"))))

(deftest test-9144
  (testing "test case 9144"
    (is (= (stemming "gratins") "gratin"))))

(deftest test-9145
  (testing "test case 9145"
    (is (= (stemming "stunt") "stunt"))))

(deftest test-9146
  (testing "test case 9146"
    (is (= (stemming "fattening") "fatten"))))

(deftest test-9147
  (testing "test case 9147"
    (is (= (stemming "truckling") "truckl"))))

(deftest test-9148
  (testing "test case 9148"
    (is (= (stemming "dustily") "dustili"))))

(deftest test-9149
  (testing "test case 9149"
    (is (= (stemming "wisting") "wist"))))

(deftest test-9150
  (testing "test case 9150"
    (is (= (stemming "thence") "thenc"))))

(deftest test-9151
  (testing "test case 9151"
    (is (= (stemming "counselee") "counsele"))))

(deftest test-9152
  (testing "test case 9152"
    (is (= (stemming "seekers") "seeker"))))

(deftest test-9153
  (testing "test case 9153"
    (is (= (stemming "felicitating") "felicit"))))

(deftest test-9154
  (testing "test case 9154"
    (is (= (stemming "webfoot") "webfoot"))))

(deftest test-9155
  (testing "test case 9155"
    (is (= (stemming "clericalists") "clericalist"))))

(deftest test-9156
  (testing "test case 9156"
    (is (= (stemming "cutting") "cut"))))

(deftest test-9157
  (testing "test case 9157"
    (is (= (stemming "purported") "purport"))))

(deftest test-9158
  (testing "test case 9158"
    (is (= (stemming "selenite") "selenit"))))

(deftest test-9159
  (testing "test case 9159"
    (is (= (stemming "laburnum") "laburnum"))))

(deftest test-9160
  (testing "test case 9160"
    (is (= (stemming "tartrated") "tartrat"))))

(deftest test-9161
  (testing "test case 9161"
    (is (= (stemming "unvaried") "unvari"))))

(deftest test-9162
  (testing "test case 9162"
    (is (= (stemming "matriculation") "matricul"))))

(deftest test-9163
  (testing "test case 9163"
    (is (= (stemming "lumbagos") "lumbago"))))

(deftest test-9164
  (testing "test case 9164"
    (is (= (stemming "butler") "butler"))))

(deftest test-9165
  (testing "test case 9165"
    (is (= (stemming "unsmiling") "unsmil"))))

(deftest test-9166
  (testing "test case 9166"
    (is (= (stemming "betrothals") "betroth"))))

(deftest test-9167
  (testing "test case 9167"
    (is (= (stemming "jiujitsu") "jiujitsu"))))

(deftest test-9168
  (testing "test case 9168"
    (is (= (stemming "dawns") "dawn"))))

(deftest test-9169
  (testing "test case 9169"
    (is (= (stemming "ailerons") "aileron"))))

(deftest test-9170
  (testing "test case 9170"
    (is (= (stemming "growlers") "growler"))))

(deftest test-9171
  (testing "test case 9171"
    (is (= (stemming "flint") "flint"))))

(deftest test-9172
  (testing "test case 9172"
    (is (= (stemming "glandularly") "glandularli"))))

(deftest test-9173
  (testing "test case 9173"
    (is (= (stemming "tsarina") "tsarina"))))

(deftest test-9174
  (testing "test case 9174"
    (is (= (stemming "stagier") "stagier"))))

(deftest test-9175
  (testing "test case 9175"
    (is (= (stemming "oratorian") "oratorian"))))

(deftest test-9176
  (testing "test case 9176"
    (is (= (stemming "joggles") "joggl"))))

(deftest test-9177
  (testing "test case 9177"
    (is (= (stemming "caseins") "casein"))))

(deftest test-9178
  (testing "test case 9178"
    (is (= (stemming "promiscuously") "promiscu"))))

(deftest test-9179
  (testing "test case 9179"
    (is (= (stemming "absconding") "abscond"))))

(deftest test-9180
  (testing "test case 9180"
    (is (= (stemming "pollened") "pollen"))))

(deftest test-9181
  (testing "test case 9181"
    (is (= (stemming "jigsaws") "jigsaw"))))

(deftest test-9182
  (testing "test case 9182"
    (is (= (stemming "preboils") "preboil"))))

(deftest test-9183
  (testing "test case 9183"
    (is (= (stemming "warlocks") "warlock"))))

(deftest test-9184
  (testing "test case 9184"
    (is (= (stemming "handymen") "handymen"))))

(deftest test-9185
  (testing "test case 9185"
    (is (= (stemming "flingers") "flinger"))))

(deftest test-9186
  (testing "test case 9186"
    (is (= (stemming "fumigated") "fumig"))))

(deftest test-9187
  (testing "test case 9187"
    (is (= (stemming "lenses") "lens"))))

(deftest test-9188
  (testing "test case 9188"
    (is (= (stemming "script") "script"))))

(deftest test-9189
  (testing "test case 9189"
    (is (= (stemming "fervour") "fervour"))))

(deftest test-9190
  (testing "test case 9190"
    (is (= (stemming "unsecluded") "unseclud"))))

(deftest test-9191
  (testing "test case 9191"
    (is (= (stemming "taxonomies") "taxonomi"))))

(deftest test-9192
  (testing "test case 9192"
    (is (= (stemming "lidded") "lid"))))

(deftest test-9193
  (testing "test case 9193"
    (is (= (stemming "decrials") "decrial"))))

(deftest test-9194
  (testing "test case 9194"
    (is (= (stemming "feminacy") "feminaci"))))

(deftest test-9195
  (testing "test case 9195"
    (is (= (stemming "rankest") "rankest"))))

(deftest test-9196
  (testing "test case 9196"
    (is (= (stemming "amercement") "amerc"))))

(deftest test-9197
  (testing "test case 9197"
    (is (= (stemming "tiderips") "tiderip"))))

(deftest test-9198
  (testing "test case 9198"
    (is (= (stemming "xanthine") "xanthin"))))

(deftest test-9199
  (testing "test case 9199"
    (is (= (stemming "cunning") "cun"))))

(deftest test-9200
  (testing "test case 9200"
    (is (= (stemming "dissidents") "dissid"))))

(deftest test-9201
  (testing "test case 9201"
    (is (= (stemming "gravitated") "gravit"))))

(deftest test-9202
  (testing "test case 9202"
    (is (= (stemming "poppycock") "poppycock"))))

(deftest test-9203
  (testing "test case 9203"
    (is (= (stemming "glasgow") "glasgow"))))

(deftest test-9204
  (testing "test case 9204"
    (is (= (stemming "medicate") "medic"))))

(deftest test-9205
  (testing "test case 9205"
    (is (= (stemming "sizeable") "sizeabl"))))

(deftest test-9206
  (testing "test case 9206"
    (is (= (stemming "weirdie") "weirdi"))))

(deftest test-9207
  (testing "test case 9207"
    (is (= (stemming "outwitted") "outwit"))))

(deftest test-9208
  (testing "test case 9208"
    (is (= (stemming "unpasteurized") "unpasteur"))))

(deftest test-9209
  (testing "test case 9209"
    (is (= (stemming "bello") "bello"))))

(deftest test-9210
  (testing "test case 9210"
    (is (= (stemming "simplistic") "simplist"))))

(deftest test-9211
  (testing "test case 9211"
    (is (= (stemming "integration") "integr"))))

(deftest test-9212
  (testing "test case 9212"
    (is (= (stemming "politician") "politician"))))

(deftest test-9213
  (testing "test case 9213"
    (is (= (stemming "headlined") "headlin"))))

(deftest test-9214
  (testing "test case 9214"
    (is (= (stemming "ransomable") "ransom"))))

(deftest test-9215
  (testing "test case 9215"
    (is (= (stemming "pettedly") "pettedli"))))

(deftest test-9216
  (testing "test case 9216"
    (is (= (stemming "bumbled") "bumbl"))))

(deftest test-9217
  (testing "test case 9217"
    (is (= (stemming "defoam") "defoam"))))

(deftest test-9218
  (testing "test case 9218"
    (is (= (stemming "insecticide") "insecticid"))))

(deftest test-9219
  (testing "test case 9219"
    (is (= (stemming "warbler") "warbler"))))

(deftest test-9220
  (testing "test case 9220"
    (is (= (stemming "caparisons") "caparison"))))

(deftest test-9221
  (testing "test case 9221"
    (is (= (stemming "bigamy") "bigami"))))

(deftest test-9222
  (testing "test case 9222"
    (is (= (stemming "mainstay") "mainstai"))))

(deftest test-9223
  (testing "test case 9223"
    (is (= (stemming "junkiest") "junkiest"))))

(deftest test-9224
  (testing "test case 9224"
    (is (= (stemming "champers") "champer"))))

(deftest test-9225
  (testing "test case 9225"
    (is (= (stemming "etherish") "etherish"))))

(deftest test-9226
  (testing "test case 9226"
    (is (= (stemming "minicars") "minicar"))))

(deftest test-9227
  (testing "test case 9227"
    (is (= (stemming "ripest") "ripest"))))

(deftest test-9228
  (testing "test case 9228"
    (is (= (stemming "nonexplosive") "nonexplos"))))

(deftest test-9229
  (testing "test case 9229"
    (is (= (stemming "putts") "putt"))))

(deftest test-9230
  (testing "test case 9230"
    (is (= (stemming "foggers") "fogger"))))

(deftest test-9231
  (testing "test case 9231"
    (is (= (stemming "overgeneralizing") "overgener"))))

(deftest test-9232
  (testing "test case 9232"
    (is (= (stemming "pharmaceutical") "pharmaceut"))))

(deftest test-9233
  (testing "test case 9233"
    (is (= (stemming "recappable") "recapp"))))

(deftest test-9234
  (testing "test case 9234"
    (is (= (stemming "nitrification") "nitrif"))))

(deftest test-9235
  (testing "test case 9235"
    (is (= (stemming "bruit") "bruit"))))

(deftest test-9236
  (testing "test case 9236"
    (is (= (stemming "leasers") "leaser"))))

(deftest test-9237
  (testing "test case 9237"
    (is (= (stemming "straggled") "straggl"))))

(deftest test-9238
  (testing "test case 9238"
    (is (= (stemming "kinescopes") "kinescop"))))

(deftest test-9239
  (testing "test case 9239"
    (is (= (stemming "halloaing") "halloa"))))

(deftest test-9240
  (testing "test case 9240"
    (is (= (stemming "culminated") "culmin"))))

(deftest test-9241
  (testing "test case 9241"
    (is (= (stemming "thrummy") "thrummi"))))

(deftest test-9242
  (testing "test case 9242"
    (is (= (stemming "rollback") "rollback"))))

(deftest test-9243
  (testing "test case 9243"
    (is (= (stemming "humorlessly") "humorlessli"))))

(deftest test-9244
  (testing "test case 9244"
    (is (= (stemming "velour") "velour"))))

(deftest test-9245
  (testing "test case 9245"
    (is (= (stemming "tethering") "tether"))))

(deftest test-9246
  (testing "test case 9246"
    (is (= (stemming "revalued") "revalu"))))

(deftest test-9247
  (testing "test case 9247"
    (is (= (stemming "ramblers") "rambler"))))

(deftest test-9248
  (testing "test case 9248"
    (is (= (stemming "sire") "sire"))))

(deftest test-9249
  (testing "test case 9249"
    (is (= (stemming "misogynistic") "misogynist"))))

(deftest test-9250
  (testing "test case 9250"
    (is (= (stemming "fiddler") "fiddler"))))

(deftest test-9251
  (testing "test case 9251"
    (is (= (stemming "frowsty") "frowsti"))))

(deftest test-9252
  (testing "test case 9252"
    (is (= (stemming "ecology") "ecolog"))))

(deftest test-9253
  (testing "test case 9253"
    (is (= (stemming "harmonium") "harmonium"))))

(deftest test-9254
  (testing "test case 9254"
    (is (= (stemming "wards") "ward"))))

(deftest test-9255
  (testing "test case 9255"
    (is (= (stemming "diallist") "diallist"))))

(deftest test-9256
  (testing "test case 9256"
    (is (= (stemming "stocker") "stocker"))))

(deftest test-9257
  (testing "test case 9257"
    (is (= (stemming "tactually") "tactual"))))

(deftest test-9258
  (testing "test case 9258"
    (is (= (stemming "fortify") "fortifi"))))

(deftest test-9259
  (testing "test case 9259"
    (is (= (stemming "turned") "turn"))))

(deftest test-9260
  (testing "test case 9260"
    (is (= (stemming "doorpost") "doorpost"))))

(deftest test-9261
  (testing "test case 9261"
    (is (= (stemming "hardworking") "hardwork"))))

(deftest test-9262
  (testing "test case 9262"
    (is (= (stemming "dwindled") "dwindl"))))

(deftest test-9263
  (testing "test case 9263"
    (is (= (stemming "interdenominational") "interdenomin"))))

(deftest test-9264
  (testing "test case 9264"
    (is (= (stemming "tempted") "tempt"))))

(deftest test-9265
  (testing "test case 9265"
    (is (= (stemming "versemen") "versemen"))))

(deftest test-9266
  (testing "test case 9266"
    (is (= (stemming "canaan") "canaan"))))

(deftest test-9267
  (testing "test case 9267"
    (is (= (stemming "quoit") "quoit"))))

(deftest test-9268
  (testing "test case 9268"
    (is (= (stemming "aeons") "aeon"))))

(deftest test-9269
  (testing "test case 9269"
    (is (= (stemming "nonuple") "nonupl"))))

(deftest test-9270
  (testing "test case 9270"
    (is (= (stemming "territorialized") "territori"))))

(deftest test-9271
  (testing "test case 9271"
    (is (= (stemming "fevered") "fever"))))

(deftest test-9272
  (testing "test case 9272"
    (is (= (stemming "regions") "region"))))

(deftest test-9273
  (testing "test case 9273"
    (is (= (stemming "overtopped") "overtop"))))

(deftest test-9274
  (testing "test case 9274"
    (is (= (stemming "whorls") "whorl"))))

(deftest test-9275
  (testing "test case 9275"
    (is (= (stemming "cuckolding") "cuckold"))))

(deftest test-9276
  (testing "test case 9276"
    (is (= (stemming "qintars") "qintar"))))

(deftest test-9277
  (testing "test case 9277"
    (is (= (stemming "porphyritic") "porphyrit"))))

(deftest test-9278
  (testing "test case 9278"
    (is (= (stemming "affirmativeness") "affirm"))))

(deftest test-9279
  (testing "test case 9279"
    (is (= (stemming "manslaughter") "manslaught"))))

(deftest test-9280
  (testing "test case 9280"
    (is (= (stemming "maples") "mapl"))))

(deftest test-9281
  (testing "test case 9281"
    (is (= (stemming "hypoxic") "hypox"))))

(deftest test-9282
  (testing "test case 9282"
    (is (= (stemming "willinger") "willing"))))

(deftest test-9283
  (testing "test case 9283"
    (is (= (stemming "memorializes") "memori"))))

(deftest test-9284
  (testing "test case 9284"
    (is (= (stemming "deprivations") "depriv"))))

(deftest test-9285
  (testing "test case 9285"
    (is (= (stemming "motordrome") "motordrom"))))

(deftest test-9286
  (testing "test case 9286"
    (is (= (stemming "swordman") "swordman"))))

(deftest test-9287
  (testing "test case 9287"
    (is (= (stemming "gelatine") "gelatin"))))

(deftest test-9288
  (testing "test case 9288"
    (is (= (stemming "conferrer") "conferr"))))

(deftest test-9289
  (testing "test case 9289"
    (is (= (stemming "larrups") "larrup"))))

(deftest test-9290
  (testing "test case 9290"
    (is (= (stemming "screwer") "screwer"))))

(deftest test-9291
  (testing "test case 9291"
    (is (= (stemming "republic") "republ"))))

(deftest test-9292
  (testing "test case 9292"
    (is (= (stemming "boniface") "bonifac"))))

(deftest test-9293
  (testing "test case 9293"
    (is (= (stemming "parroty") "parroti"))))

(deftest test-9294
  (testing "test case 9294"
    (is (= (stemming "mulches") "mulch"))))

(deftest test-9295
  (testing "test case 9295"
    (is (= (stemming "crux") "crux"))))

(deftest test-9296
  (testing "test case 9296"
    (is (= (stemming "spikelets") "spikelet"))))

(deftest test-9297
  (testing "test case 9297"
    (is (= (stemming "cannabises") "cannabis"))))

(deftest test-9298
  (testing "test case 9298"
    (is (= (stemming "mineralogical") "mineralog"))))

(deftest test-9299
  (testing "test case 9299"
    (is (= (stemming "durums") "durum"))))

(deftest test-9300
  (testing "test case 9300"
    (is (= (stemming "squiggle") "squiggl"))))

(deftest test-9301
  (testing "test case 9301"
    (is (= (stemming "shuteyes") "shutey"))))

(deftest test-9302
  (testing "test case 9302"
    (is (= (stemming "sorption") "sorption"))))

(deftest test-9303
  (testing "test case 9303"
    (is (= (stemming "velvets") "velvet"))))

(deftest test-9304
  (testing "test case 9304"
    (is (= (stemming "sibylic") "sibyl"))))

(deftest test-9305
  (testing "test case 9305"
    (is (= (stemming "shoptalks") "shoptalk"))))

(deftest test-9306
  (testing "test case 9306"
    (is (= (stemming "phonogramically") "phonogram"))))

(deftest test-9307
  (testing "test case 9307"
    (is (= (stemming "indexing") "index"))))

(deftest test-9308
  (testing "test case 9308"
    (is (= (stemming "marshalcies") "marshalci"))))

(deftest test-9309
  (testing "test case 9309"
    (is (= (stemming "reloader") "reload"))))

(deftest test-9310
  (testing "test case 9310"
    (is (= (stemming "socialism") "social"))))

(deftest test-9311
  (testing "test case 9311"
    (is (= (stemming "membranaceous") "membranac"))))

(deftest test-9312
  (testing "test case 9312"
    (is (= (stemming "prevaricate") "prevar"))))

(deftest test-9313
  (testing "test case 9313"
    (is (= (stemming "respectability") "respect"))))

(deftest test-9314
  (testing "test case 9314"
    (is (= (stemming "telepathic") "telepath"))))

(deftest test-9315
  (testing "test case 9315"
    (is (= (stemming "flails") "flail"))))

(deftest test-9316
  (testing "test case 9316"
    (is (= (stemming "begonias") "begonia"))))

(deftest test-9317
  (testing "test case 9317"
    (is (= (stemming "cyclically") "cyclic"))))

(deftest test-9318
  (testing "test case 9318"
    (is (= (stemming "compelled") "compel"))))

(deftest test-9319
  (testing "test case 9319"
    (is (= (stemming "miseducation") "miseduc"))))

(deftest test-9320
  (testing "test case 9320"
    (is (= (stemming "chapbooks") "chapbook"))))

(deftest test-9321
  (testing "test case 9321"
    (is (= (stemming "sambaed") "samba"))))

(deftest test-9322
  (testing "test case 9322"
    (is (= (stemming "infiltrator") "infiltr"))))

(deftest test-9323
  (testing "test case 9323"
    (is (= (stemming "sensationalists") "sensationalist"))))

(deftest test-9324
  (testing "test case 9324"
    (is (= (stemming "unearthed") "unearth"))))

(deftest test-9325
  (testing "test case 9325"
    (is (= (stemming "cirques") "cirqu"))))

(deftest test-9326
  (testing "test case 9326"
    (is (= (stemming "armful") "arm"))))

(deftest test-9327
  (testing "test case 9327"
    (is (= (stemming "diarrhoeic") "diarrhoeic"))))

(deftest test-9328
  (testing "test case 9328"
    (is (= (stemming "beacon") "beacon"))))

(deftest test-9329
  (testing "test case 9329"
    (is (= (stemming "atonable") "aton"))))

(deftest test-9330
  (testing "test case 9330"
    (is (= (stemming "scurvies") "scurvi"))))

(deftest test-9331
  (testing "test case 9331"
    (is (= (stemming "airmails") "airmail"))))

(deftest test-9332
  (testing "test case 9332"
    (is (= (stemming "superimposition") "superimposit"))))

(deftest test-9333
  (testing "test case 9333"
    (is (= (stemming "misadjusted") "misadjust"))))

(deftest test-9334
  (testing "test case 9334"
    (is (= (stemming "mood") "mood"))))

(deftest test-9335
  (testing "test case 9335"
    (is (= (stemming "strongrooms") "strongroom"))))

(deftest test-9336
  (testing "test case 9336"
    (is (= (stemming "humanizing") "human"))))

(deftest test-9337
  (testing "test case 9337"
    (is (= (stemming "nun") "nun"))))

(deftest test-9338
  (testing "test case 9338"
    (is (= (stemming "cloaca") "cloaca"))))

(deftest test-9339
  (testing "test case 9339"
    (is (= (stemming "sorrowfully") "sorrowfulli"))))

(deftest test-9340
  (testing "test case 9340"
    (is (= (stemming "stalk") "stalk"))))

(deftest test-9341
  (testing "test case 9341"
    (is (= (stemming "pleated") "pleat"))))

(deftest test-9342
  (testing "test case 9342"
    (is (= (stemming "guzzling") "guzzl"))))

(deftest test-9343
  (testing "test case 9343"
    (is (= (stemming "bonelet") "bonelet"))))

(deftest test-9344
  (testing "test case 9344"
    (is (= (stemming "boastingly") "boastingli"))))

(deftest test-9345
  (testing "test case 9345"
    (is (= (stemming "litigable") "litig"))))

(deftest test-9346
  (testing "test case 9346"
    (is (= (stemming "bushwhacked") "bushwhack"))))

(deftest test-9347
  (testing "test case 9347"
    (is (= (stemming "disincorporated") "disincorpor"))))

(deftest test-9348
  (testing "test case 9348"
    (is (= (stemming "sterilizers") "steril"))))

(deftest test-9349
  (testing "test case 9349"
    (is (= (stemming "murmurous") "murmur"))))

(deftest test-9350
  (testing "test case 9350"
    (is (= (stemming "lambasted") "lambast"))))

(deftest test-9351
  (testing "test case 9351"
    (is (= (stemming "repetitiousness") "repetiti"))))

(deftest test-9352
  (testing "test case 9352"
    (is (= (stemming "gigolos") "gigolo"))))

(deftest test-9353
  (testing "test case 9353"
    (is (= (stemming "rotten") "rotten"))))

(deftest test-9354
  (testing "test case 9354"
    (is (= (stemming "biddable") "biddabl"))))

(deftest test-9355
  (testing "test case 9355"
    (is (= (stemming "athlete") "athlet"))))

(deftest test-9356
  (testing "test case 9356"
    (is (= (stemming "shaggier") "shaggier"))))

(deftest test-9357
  (testing "test case 9357"
    (is (= (stemming "study's") "study'"))))

(deftest test-9358
  (testing "test case 9358"
    (is (= (stemming "wearable") "wearabl"))))

(deftest test-9359
  (testing "test case 9359"
    (is (= (stemming "enfilade") "enfilad"))))

(deftest test-9360
  (testing "test case 9360"
    (is (= (stemming "capture") "captur"))))

(deftest test-9361
  (testing "test case 9361"
    (is (= (stemming "pleasantries") "pleasantri"))))

(deftest test-9362
  (testing "test case 9362"
    (is (= (stemming "hookah") "hookah"))))

(deftest test-9363
  (testing "test case 9363"
    (is (= (stemming "envisaged") "envisag"))))

(deftest test-9364
  (testing "test case 9364"
    (is (= (stemming "perjuring") "perjur"))))

(deftest test-9365
  (testing "test case 9365"
    (is (= (stemming "delusionist") "delusionist"))))

(deftest test-9366
  (testing "test case 9366"
    (is (= (stemming "telephonically") "telephon"))))

(deftest test-9367
  (testing "test case 9367"
    (is (= (stemming "bastings") "bast"))))

(deftest test-9368
  (testing "test case 9368"
    (is (= (stemming "thermoplastics") "thermoplast"))))

(deftest test-9369
  (testing "test case 9369"
    (is (= (stemming "bimanual") "bimanu"))))

(deftest test-9370
  (testing "test case 9370"
    (is (= (stemming "consortia") "consortia"))))

(deftest test-9371
  (testing "test case 9371"
    (is (= (stemming "suspensory") "suspensori"))))

(deftest test-9372
  (testing "test case 9372"
    (is (= (stemming "preponderates") "preponder"))))

(deftest test-9373
  (testing "test case 9373"
    (is (= (stemming "motorbikes") "motorbik"))))

(deftest test-9374
  (testing "test case 9374"
    (is (= (stemming "peroxiding") "peroxid"))))

(deftest test-9375
  (testing "test case 9375"
    (is (= (stemming "electees") "electe"))))

(deftest test-9376
  (testing "test case 9376"
    (is (= (stemming "excitement") "excit"))))

(deftest test-9377
  (testing "test case 9377"
    (is (= (stemming "pullman") "pullman"))))

(deftest test-9378
  (testing "test case 9378"
    (is (= (stemming "axman") "axman"))))

(deftest test-9379
  (testing "test case 9379"
    (is (= (stemming "overlorded") "overlord"))))

(deftest test-9380
  (testing "test case 9380"
    (is (= (stemming "begrudging") "begrudg"))))

(deftest test-9381
  (testing "test case 9381"
    (is (= (stemming "shellac") "shellac"))))

(deftest test-9382
  (testing "test case 9382"
    (is (= (stemming "chintzier") "chintzier"))))

(deftest test-9383
  (testing "test case 9383"
    (is (= (stemming "habitue") "habitu"))))

(deftest test-9384
  (testing "test case 9384"
    (is (= (stemming "multipeds") "multip"))))

(deftest test-9385
  (testing "test case 9385"
    (is (= (stemming "guider") "guider"))))

(deftest test-9386
  (testing "test case 9386"
    (is (= (stemming "gastrostomy") "gastrostomi"))))

(deftest test-9387
  (testing "test case 9387"
    (is (= (stemming "moveable") "moveabl"))))

(deftest test-9388
  (testing "test case 9388"
    (is (= (stemming "lancinate") "lancin"))))

(deftest test-9389
  (testing "test case 9389"
    (is (= (stemming "doctoral") "doctor"))))

(deftest test-9390
  (testing "test case 9390"
    (is (= (stemming "neared") "near"))))

(deftest test-9391
  (testing "test case 9391"
    (is (= (stemming "fence") "fenc"))))

(deftest test-9392
  (testing "test case 9392"
    (is (= (stemming "doorjambs") "doorjamb"))))

(deftest test-9393
  (testing "test case 9393"
    (is (= (stemming "pended") "pend"))))

(deftest test-9394
  (testing "test case 9394"
    (is (= (stemming "feeblemindedly") "feeblemindedli"))))

(deftest test-9395
  (testing "test case 9395"
    (is (= (stemming "seance") "seanc"))))

(deftest test-9396
  (testing "test case 9396"
    (is (= (stemming "prissily") "prissili"))))

(deftest test-9397
  (testing "test case 9397"
    (is (= (stemming "allotropies") "allotropi"))))

(deftest test-9398
  (testing "test case 9398"
    (is (= (stemming "toggled") "toggl"))))

(deftest test-9399
  (testing "test case 9399"
    (is (= (stemming "reconcentrating") "reconcentr"))))

(deftest test-9400
  (testing "test case 9400"
    (is (= (stemming "midget") "midget"))))

(deftest test-9401
  (testing "test case 9401"
    (is (= (stemming "whitewashed") "whitewash"))))

(deftest test-9402
  (testing "test case 9402"
    (is (= (stemming "atypically") "atyp"))))

(deftest test-9403
  (testing "test case 9403"
    (is (= (stemming "grizzlers") "grizzler"))))

(deftest test-9404
  (testing "test case 9404"
    (is (= (stemming "skivvies") "skivvi"))))

(deftest test-9405
  (testing "test case 9405"
    (is (= (stemming "gladsome") "gladsom"))))

(deftest test-9406
  (testing "test case 9406"
    (is (= (stemming "miaows") "miaow"))))

(deftest test-9407
  (testing "test case 9407"
    (is (= (stemming "myopically") "myopic"))))

(deftest test-9408
  (testing "test case 9408"
    (is (= (stemming "groining") "groin"))))

(deftest test-9409
  (testing "test case 9409"
    (is (= (stemming "cloudier") "cloudier"))))

(deftest test-9410
  (testing "test case 9410"
    (is (= (stemming "helpfulness") "help"))))

(deftest test-9411
  (testing "test case 9411"
    (is (= (stemming "sexology") "sexolog"))))

(deftest test-9412
  (testing "test case 9412"
    (is (= (stemming "tympan") "tympan"))))

(deftest test-9413
  (testing "test case 9413"
    (is (= (stemming "shortage") "shortag"))))

(deftest test-9414
  (testing "test case 9414"
    (is (= (stemming "superiorly") "superiorli"))))

(deftest test-9415
  (testing "test case 9415"
    (is (= (stemming "lusting") "lust"))))

(deftest test-9416
  (testing "test case 9416"
    (is (= (stemming "multifariousness") "multifari"))))

(deftest test-9417
  (testing "test case 9417"
    (is (= (stemming "tyranny") "tyranni"))))

(deftest test-9418
  (testing "test case 9418"
    (is (= (stemming "dilute") "dilut"))))

(deftest test-9419
  (testing "test case 9419"
    (is (= (stemming "slippery") "slipperi"))))

(deftest test-9420
  (testing "test case 9420"
    (is (= (stemming "buddles") "buddl"))))

(deftest test-9421
  (testing "test case 9421"
    (is (= (stemming "algonquins") "algonquin"))))

(deftest test-9422
  (testing "test case 9422"
    (is (= (stemming "unattractive") "unattract"))))

(deftest test-9423
  (testing "test case 9423"
    (is (= (stemming "carolyn") "carolyn"))))

(deftest test-9424
  (testing "test case 9424"
    (is (= (stemming "nationals") "nation"))))

(deftest test-9425
  (testing "test case 9425"
    (is (= (stemming "simpatico") "simpatico"))))

(deftest test-9426
  (testing "test case 9426"
    (is (= (stemming "streetlight") "streetlight"))))

(deftest test-9427
  (testing "test case 9427"
    (is (= (stemming "bloomer") "bloomer"))))

(deftest test-9428
  (testing "test case 9428"
    (is (= (stemming "hello") "hello"))))

(deftest test-9429
  (testing "test case 9429"
    (is (= (stemming "vitaminized") "vitamin"))))

(deftest test-9430
  (testing "test case 9430"
    (is (= (stemming "unassorted") "unassort"))))

(deftest test-9431
  (testing "test case 9431"
    (is (= (stemming "cuddliest") "cuddliest"))))

(deftest test-9432
  (testing "test case 9432"
    (is (= (stemming "cannabinol") "cannabinol"))))

(deftest test-9433
  (testing "test case 9433"
    (is (= (stemming "keyboard") "keyboard"))))

(deftest test-9434
  (testing "test case 9434"
    (is (= (stemming "lifers") "lifer"))))

(deftest test-9435
  (testing "test case 9435"
    (is (= (stemming "multipliers") "multipli"))))

(deftest test-9436
  (testing "test case 9436"
    (is (= (stemming "wots") "wot"))))

(deftest test-9437
  (testing "test case 9437"
    (is (= (stemming "flees") "flee"))))

(deftest test-9438
  (testing "test case 9438"
    (is (= (stemming "kinkiness") "kinki"))))

(deftest test-9439
  (testing "test case 9439"
    (is (= (stemming "conus") "conu"))))

(deftest test-9440
  (testing "test case 9440"
    (is (= (stemming "jargoned") "jargon"))))

(deftest test-9441
  (testing "test case 9441"
    (is (= (stemming "declassing") "declass"))))

(deftest test-9442
  (testing "test case 9442"
    (is (= (stemming "huskies") "huski"))))

(deftest test-9443
  (testing "test case 9443"
    (is (= (stemming "angas") "anga"))))

(deftest test-9444
  (testing "test case 9444"
    (is (= (stemming "pseudoclassical") "pseudoclass"))))

(deftest test-9445
  (testing "test case 9445"
    (is (= (stemming "penetrating") "penetr"))))

(deftest test-9446
  (testing "test case 9446"
    (is (= (stemming "anchoress") "anchoress"))))

(deftest test-9447
  (testing "test case 9447"
    (is (= (stemming "tanneries") "tanneri"))))

(deftest test-9448
  (testing "test case 9448"
    (is (= (stemming "beheaded") "behead"))))

(deftest test-9449
  (testing "test case 9449"
    (is (= (stemming "swiping") "swipe"))))

(deftest test-9450
  (testing "test case 9450"
    (is (= (stemming "iconoclast") "iconoclast"))))

(deftest test-9451
  (testing "test case 9451"
    (is (= (stemming "carousels") "carousel"))))

(deftest test-9452
  (testing "test case 9452"
    (is (= (stemming "unsuccessfulness") "unsuccess"))))

(deftest test-9453
  (testing "test case 9453"
    (is (= (stemming "detonators") "deton"))))

(deftest test-9454
  (testing "test case 9454"
    (is (= (stemming "june") "june"))))

(deftest test-9455
  (testing "test case 9455"
    (is (= (stemming "calcific") "calcif"))))

(deftest test-9456
  (testing "test case 9456"
    (is (= (stemming "polychromatic") "polychromat"))))

(deftest test-9457
  (testing "test case 9457"
    (is (= (stemming "laky") "laki"))))

(deftest test-9458
  (testing "test case 9458"
    (is (= (stemming "megalith") "megalith"))))

(deftest test-9459
  (testing "test case 9459"
    (is (= (stemming "expressive") "express"))))

(deftest test-9460
  (testing "test case 9460"
    (is (= (stemming "typhons") "typhon"))))

(deftest test-9461
  (testing "test case 9461"
    (is (= (stemming "accuser") "accus"))))

(deftest test-9462
  (testing "test case 9462"
    (is (= (stemming "dyeings") "dye"))))

(deftest test-9463
  (testing "test case 9463"
    (is (= (stemming "preach") "preach"))))

(deftest test-9464
  (testing "test case 9464"
    (is (= (stemming "rebate") "rebat"))))

(deftest test-9465
  (testing "test case 9465"
    (is (= (stemming "literals") "liter"))))

(deftest test-9466
  (testing "test case 9466"
    (is (= (stemming "flatteries") "flatteri"))))

(deftest test-9467
  (testing "test case 9467"
    (is (= (stemming "coveys") "covei"))))

(deftest test-9468
  (testing "test case 9468"
    (is (= (stemming "remembrances") "remembr"))))

(deftest test-9469
  (testing "test case 9469"
    (is (= (stemming "minestrone") "minestron"))))

(deftest test-9470
  (testing "test case 9470"
    (is (= (stemming "proselyted") "proselyt"))))

(deftest test-9471
  (testing "test case 9471"
    (is (= (stemming "leashes") "leash"))))

(deftest test-9472
  (testing "test case 9472"
    (is (= (stemming "disorientating") "disorient"))))

(deftest test-9473
  (testing "test case 9473"
    (is (= (stemming "heretic") "heret"))))

(deftest test-9474
  (testing "test case 9474"
    (is (= (stemming "landocracies") "landocraci"))))

(deftest test-9475
  (testing "test case 9475"
    (is (= (stemming "workfolk") "workfolk"))))

(deftest test-9476
  (testing "test case 9476"
    (is (= (stemming "skywrites") "skywrit"))))

(deftest test-9477
  (testing "test case 9477"
    (is (= (stemming "offhand") "offhand"))))

(deftest test-9478
  (testing "test case 9478"
    (is (= (stemming "sofar") "sofar"))))

(deftest test-9479
  (testing "test case 9479"
    (is (= (stemming "overpessimistic") "overpessimist"))))

(deftest test-9480
  (testing "test case 9480"
    (is (= (stemming "languid") "languid"))))

(deftest test-9481
  (testing "test case 9481"
    (is (= (stemming "falsity") "falsiti"))))

(deftest test-9482
  (testing "test case 9482"
    (is (= (stemming "freethinker") "freethink"))))

(deftest test-9483
  (testing "test case 9483"
    (is (= (stemming "platinum") "platinum"))))

(deftest test-9484
  (testing "test case 9484"
    (is (= (stemming "adulate") "adul"))))

(deftest test-9485
  (testing "test case 9485"
    (is (= (stemming "frizzed") "frizz"))))

(deftest test-9486
  (testing "test case 9486"
    (is (= (stemming "wried") "wri"))))

(deftest test-9487
  (testing "test case 9487"
    (is (= (stemming "fluency") "fluenci"))))

(deftest test-9488
  (testing "test case 9488"
    (is (= (stemming "straiten") "straiten"))))

(deftest test-9489
  (testing "test case 9489"
    (is (= (stemming "babu") "babu"))))

(deftest test-9490
  (testing "test case 9490"
    (is (= (stemming "stalks") "stalk"))))

(deftest test-9491
  (testing "test case 9491"
    (is (= (stemming "precisians") "precisian"))))

(deftest test-9492
  (testing "test case 9492"
    (is (= (stemming "adorably") "ador"))))

(deftest test-9493
  (testing "test case 9493"
    (is (= (stemming "dailies") "daili"))))

(deftest test-9494
  (testing "test case 9494"
    (is (= (stemming "authoritarianism") "authoritarian"))))

(deftest test-9495
  (testing "test case 9495"
    (is (= (stemming "progress") "progress"))))

(deftest test-9496
  (testing "test case 9496"
    (is (= (stemming "pallier") "pallier"))))

(deftest test-9497
  (testing "test case 9497"
    (is (= (stemming "basest") "basest"))))

(deftest test-9498
  (testing "test case 9498"
    (is (= (stemming "dawdlers") "dawdler"))))

(deftest test-9499
  (testing "test case 9499"
    (is (= (stemming "diaphanous") "diaphan"))))

(deftest test-9500
  (testing "test case 9500"
    (is (= (stemming "surrendered") "surrend"))))

(deftest test-9501
  (testing "test case 9501"
    (is (= (stemming "stabilizes") "stabil"))))

(deftest test-9502
  (testing "test case 9502"
    (is (= (stemming "rucksacks") "rucksack"))))

(deftest test-9503
  (testing "test case 9503"
    (is (= (stemming "pius") "piu"))))

(deftest test-9504
  (testing "test case 9504"
    (is (= (stemming "vacate") "vacat"))))

(deftest test-9505
  (testing "test case 9505"
    (is (= (stemming "ingathered") "ingath"))))

(deftest test-9506
  (testing "test case 9506"
    (is (= (stemming "sociopathies") "sociopathi"))))

(deftest test-9507
  (testing "test case 9507"
    (is (= (stemming "gluteal") "gluteal"))))

(deftest test-9508
  (testing "test case 9508"
    (is (= (stemming "squintiest") "squintiest"))))

(deftest test-9509
  (testing "test case 9509"
    (is (= (stemming "courtesan") "courtesan"))))

(deftest test-9510
  (testing "test case 9510"
    (is (= (stemming "condoning") "condon"))))

(deftest test-9511
  (testing "test case 9511"
    (is (= (stemming "enshrinement") "enshrin"))))

(deftest test-9512
  (testing "test case 9512"
    (is (= (stemming "turntables") "turntabl"))))

(deftest test-9513
  (testing "test case 9513"
    (is (= (stemming "combat") "combat"))))

(deftest test-9514
  (testing "test case 9514"
    (is (= (stemming "solacer") "solac"))))

(deftest test-9515
  (testing "test case 9515"
    (is (= (stemming "gracing") "grace"))))

(deftest test-9516
  (testing "test case 9516"
    (is (= (stemming "outmarch") "outmarch"))))

(deftest test-9517
  (testing "test case 9517"
    (is (= (stemming "menstruate") "menstruat"))))

(deftest test-9518
  (testing "test case 9518"
    (is (= (stemming "septum") "septum"))))

(deftest test-9519
  (testing "test case 9519"
    (is (= (stemming "housewares") "housewar"))))

(deftest test-9520
  (testing "test case 9520"
    (is (= (stemming "avocational") "avoc"))))

(deftest test-9521
  (testing "test case 9521"
    (is (= (stemming "inkless") "inkless"))))

(deftest test-9522
  (testing "test case 9522"
    (is (= (stemming "recognized") "recogn"))))

(deftest test-9523
  (testing "test case 9523"
    (is (= (stemming "resections") "resect"))))

(deftest test-9524
  (testing "test case 9524"
    (is (= (stemming "irreducible") "irreduc"))))

(deftest test-9525
  (testing "test case 9525"
    (is (= (stemming "specifics") "specif"))))

(deftest test-9526
  (testing "test case 9526"
    (is (= (stemming "tableaus") "tableau"))))

(deftest test-9527
  (testing "test case 9527"
    (is (= (stemming "aglow") "aglow"))))

(deftest test-9528
  (testing "test case 9528"
    (is (= (stemming "melanins") "melanin"))))

(deftest test-9529
  (testing "test case 9529"
    (is (= (stemming "try") "try"))))

(deftest test-9530
  (testing "test case 9530"
    (is (= (stemming "wreck") "wreck"))))

(deftest test-9531
  (testing "test case 9531"
    (is (= (stemming "crochets") "crochet"))))

(deftest test-9532
  (testing "test case 9532"
    (is (= (stemming "odiously") "odious"))))

(deftest test-9533
  (testing "test case 9533"
    (is (= (stemming "cottoning") "cotton"))))

(deftest test-9534
  (testing "test case 9534"
    (is (= (stemming "massas") "massa"))))

(deftest test-9535
  (testing "test case 9535"
    (is (= (stemming "jehus") "jehu"))))

(deftest test-9536
  (testing "test case 9536"
    (is (= (stemming "vagrancies") "vagranc"))))

(deftest test-9537
  (testing "test case 9537"
    (is (= (stemming "buttering") "butter"))))

(deftest test-9538
  (testing "test case 9538"
    (is (= (stemming "conjoining") "conjoin"))))

(deftest test-9539
  (testing "test case 9539"
    (is (= (stemming "compactest") "compactest"))))

(deftest test-9540
  (testing "test case 9540"
    (is (= (stemming "diagnoseable") "diagnos"))))

(deftest test-9541
  (testing "test case 9541"
    (is (= (stemming "incorruptibly") "incorrupt"))))

(deftest test-9542
  (testing "test case 9542"
    (is (= (stemming "mittens") "mitten"))))

(deftest test-9543
  (testing "test case 9543"
    (is (= (stemming "gatekeepers") "gatekeep"))))

(deftest test-9544
  (testing "test case 9544"
    (is (= (stemming "reliably") "reliabl"))))

(deftest test-9545
  (testing "test case 9545"
    (is (= (stemming "regulates") "regul"))))

(deftest test-9546
  (testing "test case 9546"
    (is (= (stemming "faced") "face"))))

(deftest test-9547
  (testing "test case 9547"
    (is (= (stemming "squarely") "squar"))))

(deftest test-9548
  (testing "test case 9548"
    (is (= (stemming "glancingly") "glancingli"))))

(deftest test-9549
  (testing "test case 9549"
    (is (= (stemming "muscling") "muscl"))))

(deftest test-9550
  (testing "test case 9550"
    (is (= (stemming "destructibility") "destruct"))))

(deftest test-9551
  (testing "test case 9551"
    (is (= (stemming "about") "about"))))

(deftest test-9552
  (testing "test case 9552"
    (is (= (stemming "surtaxing") "surtax"))))

(deftest test-9553
  (testing "test case 9553"
    (is (= (stemming "sanitizing") "sanit"))))

(deftest test-9554
  (testing "test case 9554"
    (is (= (stemming "stevedored") "stevedor"))))

(deftest test-9555
  (testing "test case 9555"
    (is (= (stemming "spiritual") "spiritu"))))

(deftest test-9556
  (testing "test case 9556"
    (is (= (stemming "circuital") "circuit"))))

(deftest test-9557
  (testing "test case 9557"
    (is (= (stemming "swail") "swail"))))

(deftest test-9558
  (testing "test case 9558"
    (is (= (stemming "wane") "wane"))))

(deftest test-9559
  (testing "test case 9559"
    (is (= (stemming "pastinas") "pastina"))))

(deftest test-9560
  (testing "test case 9560"
    (is (= (stemming "protegees") "protege"))))

(deftest test-9561
  (testing "test case 9561"
    (is (= (stemming "sledding") "sled"))))

(deftest test-9562
  (testing "test case 9562"
    (is (= (stemming "amort") "amort"))))

(deftest test-9563
  (testing "test case 9563"
    (is (= (stemming "perdu") "perdu"))))

(deftest test-9564
  (testing "test case 9564"
    (is (= (stemming "housebreaker") "housebreak"))))

(deftest test-9565
  (testing "test case 9565"
    (is (= (stemming "smacks") "smack"))))

(deftest test-9566
  (testing "test case 9566"
    (is (= (stemming "congests") "congest"))))

(deftest test-9567
  (testing "test case 9567"
    (is (= (stemming "pentadactylism") "pentadactyl"))))

(deftest test-9568
  (testing "test case 9568"
    (is (= (stemming "spill") "spill"))))

(deftest test-9569
  (testing "test case 9569"
    (is (= (stemming "disagreeably") "disagre"))))

(deftest test-9570
  (testing "test case 9570"
    (is (= (stemming "eluviating") "eluvi"))))

(deftest test-9571
  (testing "test case 9571"
    (is (= (stemming "refashions") "refashion"))))

(deftest test-9572
  (testing "test case 9572"
    (is (= (stemming "clapping") "clap"))))

(deftest test-9573
  (testing "test case 9573"
    (is (= (stemming "necrotize") "necrot"))))

(deftest test-9574
  (testing "test case 9574"
    (is (= (stemming "peals") "peal"))))

(deftest test-9575
  (testing "test case 9575"
    (is (= (stemming "gynarchy") "gynarchi"))))

(deftest test-9576
  (testing "test case 9576"
    (is (= (stemming "policies") "polici"))))

(deftest test-9577
  (testing "test case 9577"
    (is (= (stemming "hereditary") "hereditari"))))

(deftest test-9578
  (testing "test case 9578"
    (is (= (stemming "cruelty") "cruelti"))))

(deftest test-9579
  (testing "test case 9579"
    (is (= (stemming "collocates") "colloc"))))

(deftest test-9580
  (testing "test case 9580"
    (is (= (stemming "parallelling") "parallel"))))

(deftest test-9581
  (testing "test case 9581"
    (is (= (stemming "engirded") "engird"))))

(deftest test-9582
  (testing "test case 9582"
    (is (= (stemming "residencies") "resid"))))

(deftest test-9583
  (testing "test case 9583"
    (is (= (stemming "abyssal") "abyss"))))

(deftest test-9584
  (testing "test case 9584"
    (is (= (stemming "bilingual") "bilingu"))))

(deftest test-9585
  (testing "test case 9585"
    (is (= (stemming "repulsed") "repuls"))))

(deftest test-9586
  (testing "test case 9586"
    (is (= (stemming "contests") "contest"))))

(deftest test-9587
  (testing "test case 9587"
    (is (= (stemming "failed") "fail"))))

(deftest test-9588
  (testing "test case 9588"
    (is (= (stemming "maven") "maven"))))

(deftest test-9589
  (testing "test case 9589"
    (is (= (stemming "inserting") "insert"))))

(deftest test-9590
  (testing "test case 9590"
    (is (= (stemming "kinesthetic") "kinesthet"))))

(deftest test-9591
  (testing "test case 9591"
    (is (= (stemming "felted") "felt"))))

(deftest test-9592
  (testing "test case 9592"
    (is (= (stemming "furrowy") "furrowi"))))

(deftest test-9593
  (testing "test case 9593"
    (is (= (stemming "unrhythmic") "unrhythm"))))

(deftest test-9594
  (testing "test case 9594"
    (is (= (stemming "straightened") "straighten"))))

(deftest test-9595
  (testing "test case 9595"
    (is (= (stemming "emulsifies") "emulsifi"))))

(deftest test-9596
  (testing "test case 9596"
    (is (= (stemming "tribunals") "tribun"))))

(deftest test-9597
  (testing "test case 9597"
    (is (= (stemming "predisposition") "predisposit"))))

(deftest test-9598
  (testing "test case 9598"
    (is (= (stemming "sheikhs") "sheikh"))))

(deftest test-9599
  (testing "test case 9599"
    (is (= (stemming "drave") "drave"))))

(deftest test-9600
  (testing "test case 9600"
    (is (= (stemming "witted") "wit"))))

(deftest test-9601
  (testing "test case 9601"
    (is (= (stemming "porkers") "porker"))))

(deftest test-9602
  (testing "test case 9602"
    (is (= (stemming "cathartically") "cathart"))))

(deftest test-9603
  (testing "test case 9603"
    (is (= (stemming "gawkish") "gawkish"))))

(deftest test-9604
  (testing "test case 9604"
    (is (= (stemming "rusticating") "rustic"))))

(deftest test-9605
  (testing "test case 9605"
    (is (= (stemming "unassumingly") "unassumingli"))))

(deftest test-9606
  (testing "test case 9606"
    (is (= (stemming "stalactites") "stalactit"))))

(deftest test-9607
  (testing "test case 9607"
    (is (= (stemming "knapping") "knap"))))

(deftest test-9608
  (testing "test case 9608"
    (is (= (stemming "multicellular") "multicellular"))))

(deftest test-9609
  (testing "test case 9609"
    (is (= (stemming "beautifier") "beautifi"))))

(deftest test-9610
  (testing "test case 9610"
    (is (= (stemming "boatings") "boat"))))

(deftest test-9611
  (testing "test case 9611"
    (is (= (stemming "carrageenan") "carrageenan"))))

(deftest test-9612
  (testing "test case 9612"
    (is (= (stemming "loup") "loup"))))

(deftest test-9613
  (testing "test case 9613"
    (is (= (stemming "squadrons") "squadron"))))

(deftest test-9614
  (testing "test case 9614"
    (is (= (stemming "sudorific") "sudorif"))))

(deftest test-9615
  (testing "test case 9615"
    (is (= (stemming "tantalum") "tantalum"))))

(deftest test-9616
  (testing "test case 9616"
    (is (= (stemming "garnished") "garnish"))))

(deftest test-9617
  (testing "test case 9617"
    (is (= (stemming "receptor") "receptor"))))

(deftest test-9618
  (testing "test case 9618"
    (is (= (stemming "jardinieres") "jardinier"))))

(deftest test-9619
  (testing "test case 9619"
    (is (= (stemming "indiscriminantly") "indiscriminantli"))))

(deftest test-9620
  (testing "test case 9620"
    (is (= (stemming "doorway") "doorwai"))))

(deftest test-9621
  (testing "test case 9621"
    (is (= (stemming "cabinetmaking") "cabinetmak"))))

(deftest test-9622
  (testing "test case 9622"
    (is (= (stemming "alienator") "alien"))))

(deftest test-9623
  (testing "test case 9623"
    (is (= (stemming "kinkier") "kinkier"))))

(deftest test-9624
  (testing "test case 9624"
    (is (= (stemming "enface") "enfac"))))

(deftest test-9625
  (testing "test case 9625"
    (is (= (stemming "matchers") "matcher"))))

(deftest test-9626
  (testing "test case 9626"
    (is (= (stemming "clairvoyants") "clairvoy"))))

(deftest test-9627
  (testing "test case 9627"
    (is (= (stemming "facial") "facial"))))

(deftest test-9628
  (testing "test case 9628"
    (is (= (stemming "retransmitting") "retransmit"))))

(deftest test-9629
  (testing "test case 9629"
    (is (= (stemming "brunets") "brunet"))))

(deftest test-9630
  (testing "test case 9630"
    (is (= (stemming "hominids") "hominid"))))

(deftest test-9631
  (testing "test case 9631"
    (is (= (stemming "gremmies") "gremmi"))))

(deftest test-9632
  (testing "test case 9632"
    (is (= (stemming "rattlesnake") "rattlesnak"))))

(deftest test-9633
  (testing "test case 9633"
    (is (= (stemming "surfers") "surfer"))))

(deftest test-9634
  (testing "test case 9634"
    (is (= (stemming "conspicuously") "conspicu"))))

(deftest test-9635
  (testing "test case 9635"
    (is (= (stemming "insanity") "insan"))))

(deftest test-9636
  (testing "test case 9636"
    (is (= (stemming "latchstrings") "latchstr"))))

(deftest test-9637
  (testing "test case 9637"
    (is (= (stemming "flittering") "flitter"))))

(deftest test-9638
  (testing "test case 9638"
    (is (= (stemming "jouncy") "jounci"))))

(deftest test-9639
  (testing "test case 9639"
    (is (= (stemming "soggy") "soggi"))))

(deftest test-9640
  (testing "test case 9640"
    (is (= (stemming "posthypnotically") "posthypnot"))))

(deftest test-9641
  (testing "test case 9641"
    (is (= (stemming "padrone") "padron"))))

(deftest test-9642
  (testing "test case 9642"
    (is (= (stemming "asymmetrical") "asymmetr"))))

(deftest test-9643
  (testing "test case 9643"
    (is (= (stemming "canty") "canti"))))

(deftest test-9644
  (testing "test case 9644"
    (is (= (stemming "oliver") "oliv"))))

(deftest test-9645
  (testing "test case 9645"
    (is (= (stemming "repelled") "repel"))))

(deftest test-9646
  (testing "test case 9646"
    (is (= (stemming "rum") "rum"))))

(deftest test-9647
  (testing "test case 9647"
    (is (= (stemming "tameable") "tameabl"))))

(deftest test-9648
  (testing "test case 9648"
    (is (= (stemming "heightens") "heighten"))))

(deftest test-9649
  (testing "test case 9649"
    (is (= (stemming "peacocking") "peacock"))))

(deftest test-9650
  (testing "test case 9650"
    (is (= (stemming "clannish") "clannish"))))

(deftest test-9651
  (testing "test case 9651"
    (is (= (stemming "streetcar") "streetcar"))))

(deftest test-9652
  (testing "test case 9652"
    (is (= (stemming "frug") "frug"))))

(deftest test-9653
  (testing "test case 9653"
    (is (= (stemming "testis") "testi"))))

(deftest test-9654
  (testing "test case 9654"
    (is (= (stemming "atrociously") "atroci"))))

(deftest test-9655
  (testing "test case 9655"
    (is (= (stemming "revel") "revel"))))

(deftest test-9656
  (testing "test case 9656"
    (is (= (stemming "fuzes") "fuze"))))

(deftest test-9657
  (testing "test case 9657"
    (is (= (stemming "piazzas") "piazza"))))

(deftest test-9658
  (testing "test case 9658"
    (is (= (stemming "hafniums") "hafnium"))))

(deftest test-9659
  (testing "test case 9659"
    (is (= (stemming "intrenches") "intrench"))))

(deftest test-9660
  (testing "test case 9660"
    (is (= (stemming "convalescents") "convalesc"))))

(deftest test-9661
  (testing "test case 9661"
    (is (= (stemming "joylessness") "joyless"))))

(deftest test-9662
  (testing "test case 9662"
    (is (= (stemming "nautilus") "nautilu"))))

(deftest test-9663
  (testing "test case 9663"
    (is (= (stemming "cooperated") "cooper"))))

(deftest test-9664
  (testing "test case 9664"
    (is (= (stemming "creasier") "creasier"))))

(deftest test-9665
  (testing "test case 9665"
    (is (= (stemming "howlet") "howlet"))))

(deftest test-9666
  (testing "test case 9666"
    (is (= (stemming "overfurnishes") "overfurnish"))))

(deftest test-9667
  (testing "test case 9667"
    (is (= (stemming "ouzo") "ouzo"))))

(deftest test-9668
  (testing "test case 9668"
    (is (= (stemming "ugsome") "ugsom"))))

(deftest test-9669
  (testing "test case 9669"
    (is (= (stemming "hubcap") "hubcap"))))

(deftest test-9670
  (testing "test case 9670"
    (is (= (stemming "trademark") "trademark"))))

(deftest test-9671
  (testing "test case 9671"
    (is (= (stemming "asphyxiating") "asphyxi"))))

(deftest test-9672
  (testing "test case 9672"
    (is (= (stemming "rove") "rove"))))

(deftest test-9673
  (testing "test case 9673"
    (is (= (stemming "administration") "administr"))))

(deftest test-9674
  (testing "test case 9674"
    (is (= (stemming "chatterbox") "chatterbox"))))

(deftest test-9675
  (testing "test case 9675"
    (is (= (stemming "chrome") "chrome"))))

(deftest test-9676
  (testing "test case 9676"
    (is (= (stemming "speculums") "speculum"))))

(deftest test-9677
  (testing "test case 9677"
    (is (= (stemming "fruiter") "fruiter"))))

(deftest test-9678
  (testing "test case 9678"
    (is (= (stemming "abstracters") "abstract"))))

(deftest test-9679
  (testing "test case 9679"
    (is (= (stemming "overdevelopment") "overdevelop"))))

(deftest test-9680
  (testing "test case 9680"
    (is (= (stemming "underclerks") "underclerk"))))

(deftest test-9681
  (testing "test case 9681"
    (is (= (stemming "bacteria") "bacteria"))))

(deftest test-9682
  (testing "test case 9682"
    (is (= (stemming "antipoverty") "antipoverti"))))

(deftest test-9683
  (testing "test case 9683"
    (is (= (stemming "embouchure") "embouchur"))))

(deftest test-9684
  (testing "test case 9684"
    (is (= (stemming "legalize") "legal"))))

(deftest test-9685
  (testing "test case 9685"
    (is (= (stemming "mazily") "mazili"))))

(deftest test-9686
  (testing "test case 9686"
    (is (= (stemming "circuities") "circuiti"))))

(deftest test-9687
  (testing "test case 9687"
    (is (= (stemming "praise") "prais"))))

(deftest test-9688
  (testing "test case 9688"
    (is (= (stemming "neuters") "neuter"))))

(deftest test-9689
  (testing "test case 9689"
    (is (= (stemming "resurgences") "resurg"))))

(deftest test-9690
  (testing "test case 9690"
    (is (= (stemming "university") "univers"))))

(deftest test-9691
  (testing "test case 9691"
    (is (= (stemming "lairds") "laird"))))

(deftest test-9692
  (testing "test case 9692"
    (is (= (stemming "squares") "squar"))))

(deftest test-9693
  (testing "test case 9693"
    (is (= (stemming "inequality") "inequ"))))

(deftest test-9694
  (testing "test case 9694"
    (is (= (stemming "groped") "grope"))))

(deftest test-9695
  (testing "test case 9695"
    (is (= (stemming "dissociative") "dissoci"))))

(deftest test-9696
  (testing "test case 9696"
    (is (= (stemming "uniformness") "uniform"))))

(deftest test-9697
  (testing "test case 9697"
    (is (= (stemming "depots") "depot"))))

(deftest test-9698
  (testing "test case 9698"
    (is (= (stemming "pollees") "polle"))))

(deftest test-9699
  (testing "test case 9699"
    (is (= (stemming "outmode") "outmod"))))

(deftest test-9700
  (testing "test case 9700"
    (is (= (stemming "boatman") "boatman"))))

(deftest test-9701
  (testing "test case 9701"
    (is (= (stemming "neuropsychology") "neuropsycholog"))))

(deftest test-9702
  (testing "test case 9702"
    (is (= (stemming "kudo") "kudo"))))

(deftest test-9703
  (testing "test case 9703"
    (is (= (stemming "wreaked") "wreak"))))

(deftest test-9704
  (testing "test case 9704"
    (is (= (stemming "scolders") "scolder"))))

(deftest test-9705
  (testing "test case 9705"
    (is (= (stemming "realignments") "realign"))))

(deftest test-9706
  (testing "test case 9706"
    (is (= (stemming "tommyrots") "tommyrot"))))

(deftest test-9707
  (testing "test case 9707"
    (is (= (stemming "relating") "relat"))))

(deftest test-9708
  (testing "test case 9708"
    (is (= (stemming "regeneration") "regener"))))

(deftest test-9709
  (testing "test case 9709"
    (is (= (stemming "carbohydrates") "carbohydr"))))

(deftest test-9710
  (testing "test case 9710"
    (is (= (stemming "blushing") "blush"))))

(deftest test-9711
  (testing "test case 9711"
    (is (= (stemming "djins") "djin"))))

(deftest test-9712
  (testing "test case 9712"
    (is (= (stemming "spoliators") "spoliat"))))

(deftest test-9713
  (testing "test case 9713"
    (is (= (stemming "chieftainships") "chieftainship"))))

(deftest test-9714
  (testing "test case 9714"
    (is (= (stemming "mollifiers") "mollifi"))))

(deftest test-9715
  (testing "test case 9715"
    (is (= (stemming "sidle") "sidl"))))

(deftest test-9716
  (testing "test case 9716"
    (is (= (stemming "butters") "butter"))))

(deftest test-9717
  (testing "test case 9717"
    (is (= (stemming "predicable") "predic"))))

(deftest test-9718
  (testing "test case 9718"
    (is (= (stemming "emotion") "emot"))))

(deftest test-9719
  (testing "test case 9719"
    (is (= (stemming "misconceiving") "misconceiv"))))

(deftest test-9720
  (testing "test case 9720"
    (is (= (stemming "timework") "timework"))))

(deftest test-9721
  (testing "test case 9721"
    (is (= (stemming "equivalents") "equival"))))

(deftest test-9722
  (testing "test case 9722"
    (is (= (stemming "bassness") "bass"))))

(deftest test-9723
  (testing "test case 9723"
    (is (= (stemming "evidences") "evid"))))

(deftest test-9724
  (testing "test case 9724"
    (is (= (stemming "tsking") "tsking"))))

(deftest test-9725
  (testing "test case 9725"
    (is (= (stemming "convexes") "convex"))))

(deftest test-9726
  (testing "test case 9726"
    (is (= (stemming "perpetuators") "perpetu"))))

(deftest test-9727
  (testing "test case 9727"
    (is (= (stemming "example") "exampl"))))

(deftest test-9728
  (testing "test case 9728"
    (is (= (stemming "uteri") "uteri"))))

(deftest test-9729
  (testing "test case 9729"
    (is (= (stemming "disdains") "disdain"))))

(deftest test-9730
  (testing "test case 9730"
    (is (= (stemming "paces") "pace"))))

(deftest test-9731
  (testing "test case 9731"
    (is (= (stemming "preconceived") "preconceiv"))))

(deftest test-9732
  (testing "test case 9732"
    (is (= (stemming "disconsolately") "disconsol"))))

(deftest test-9733
  (testing "test case 9733"
    (is (= (stemming "outpoured") "outpour"))))

(deftest test-9734
  (testing "test case 9734"
    (is (= (stemming "buffier") "buffier"))))

(deftest test-9735
  (testing "test case 9735"
    (is (= (stemming "lifeguards") "lifeguard"))))

(deftest test-9736
  (testing "test case 9736"
    (is (= (stemming "cineraria") "cineraria"))))

(deftest test-9737
  (testing "test case 9737"
    (is (= (stemming "groucho") "groucho"))))

(deftest test-9738
  (testing "test case 9738"
    (is (= (stemming "heraldic") "herald"))))

(deftest test-9739
  (testing "test case 9739"
    (is (= (stemming "notebooks") "notebook"))))

(deftest test-9740
  (testing "test case 9740"
    (is (= (stemming "conclusion") "conclus"))))

(deftest test-9741
  (testing "test case 9741"
    (is (= (stemming "conducers") "conduc"))))

(deftest test-9742
  (testing "test case 9742"
    (is (= (stemming "cataleptically") "catalept"))))

(deftest test-9743
  (testing "test case 9743"
    (is (= (stemming "heeltap") "heeltap"))))

(deftest test-9744
  (testing "test case 9744"
    (is (= (stemming "seriality") "serial"))))

(deftest test-9745
  (testing "test case 9745"
    (is (= (stemming "rhenium") "rhenium"))))

(deftest test-9746
  (testing "test case 9746"
    (is (= (stemming "castings") "cast"))))

(deftest test-9747
  (testing "test case 9747"
    (is (= (stemming "penumbrae") "penumbra"))))

(deftest test-9748
  (testing "test case 9748"
    (is (= (stemming "idiomatically") "idiomat"))))

(deftest test-9749
  (testing "test case 9749"
    (is (= (stemming "dictates") "dictat"))))

(deftest test-9750
  (testing "test case 9750"
    (is (= (stemming "possessed") "possess"))))

(deftest test-9751
  (testing "test case 9751"
    (is (= (stemming "approachers") "approach"))))

(deftest test-9752
  (testing "test case 9752"
    (is (= (stemming "elasticizing") "elastic"))))

(deftest test-9753
  (testing "test case 9753"
    (is (= (stemming "cookable") "cookabl"))))

(deftest test-9754
  (testing "test case 9754"
    (is (= (stemming "wireworks") "wirework"))))

(deftest test-9755
  (testing "test case 9755"
    (is (= (stemming "indented") "indent"))))

(deftest test-9756
  (testing "test case 9756"
    (is (= (stemming "pixes") "pix"))))

(deftest test-9757
  (testing "test case 9757"
    (is (= (stemming "flyaways") "flyawai"))))

(deftest test-9758
  (testing "test case 9758"
    (is (= (stemming "nightjars") "nightjar"))))

(deftest test-9759
  (testing "test case 9759"
    (is (= (stemming "finance") "financ"))))

(deftest test-9760
  (testing "test case 9760"
    (is (= (stemming "unsuspectingly") "unsuspectingli"))))

(deftest test-9761
  (testing "test case 9761"
    (is (= (stemming "snazzy") "snazzi"))))

(deftest test-9762
  (testing "test case 9762"
    (is (= (stemming "focusses") "focuss"))))

(deftest test-9763
  (testing "test case 9763"
    (is (= (stemming "leadoff") "leadoff"))))

(deftest test-9764
  (testing "test case 9764"
    (is (= (stemming "fiery") "fieri"))))

(deftest test-9765
  (testing "test case 9765"
    (is (= (stemming "subparagraph") "subparagraph"))))

(deftest test-9766
  (testing "test case 9766"
    (is (= (stemming "usurpative") "usurp"))))

(deftest test-9767
  (testing "test case 9767"
    (is (= (stemming "superscribe") "superscrib"))))

(deftest test-9768
  (testing "test case 9768"
    (is (= (stemming "lubricator") "lubric"))))

(deftest test-9769
  (testing "test case 9769"
    (is (= (stemming "beard") "beard"))))

(deftest test-9770
  (testing "test case 9770"
    (is (= (stemming "opaque") "opaqu"))))

(deftest test-9771
  (testing "test case 9771"
    (is (= (stemming "simulation") "simul"))))

(deftest test-9772
  (testing "test case 9772"
    (is (= (stemming "demythologize") "demytholog"))))

(deftest test-9773
  (testing "test case 9773"
    (is (= (stemming "glorifies") "glorifi"))))

(deftest test-9774
  (testing "test case 9774"
    (is (= (stemming "telegraphers") "telegraph"))))

(deftest test-9775
  (testing "test case 9775"
    (is (= (stemming "depersonalized") "deperson"))))

(deftest test-9776
  (testing "test case 9776"
    (is (= (stemming "posed") "pose"))))

(deftest test-9777
  (testing "test case 9777"
    (is (= (stemming "mot") "mot"))))

(deftest test-9778
  (testing "test case 9778"
    (is (= (stemming "speakings") "speak"))))

(deftest test-9779
  (testing "test case 9779"
    (is (= (stemming "feebly") "feebli"))))

(deftest test-9780
  (testing "test case 9780"
    (is (= (stemming "coffeehouse") "coffeehous"))))

(deftest test-9781
  (testing "test case 9781"
    (is (= (stemming "climaxing") "climax"))))

(deftest test-9782
  (testing "test case 9782"
    (is (= (stemming "convalesces") "convalesc"))))

(deftest test-9783
  (testing "test case 9783"
    (is (= (stemming "rebops") "rebop"))))

(deftest test-9784
  (testing "test case 9784"
    (is (= (stemming "balustrade") "balustrad"))))

(deftest test-9785
  (testing "test case 9785"
    (is (= (stemming "pipelined") "pipelin"))))

(deftest test-9786
  (testing "test case 9786"
    (is (= (stemming "throttler") "throttler"))))

(deftest test-9787
  (testing "test case 9787"
    (is (= (stemming "mended") "mend"))))

(deftest test-9788
  (testing "test case 9788"
    (is (= (stemming "undy") "undi"))))

(deftest test-9789
  (testing "test case 9789"
    (is (= (stemming "motley") "motlei"))))

(deftest test-9790
  (testing "test case 9790"
    (is (= (stemming "malemutes") "malemut"))))

(deftest test-9791
  (testing "test case 9791"
    (is (= (stemming "doughnuts") "doughnut"))))

(deftest test-9792
  (testing "test case 9792"
    (is (= (stemming "unfeminine") "unfeminin"))))

(deftest test-9793
  (testing "test case 9793"
    (is (= (stemming "conversions") "convers"))))

(deftest test-9794
  (testing "test case 9794"
    (is (= (stemming "aerogram") "aerogram"))))

(deftest test-9795
  (testing "test case 9795"
    (is (= (stemming "confabulating") "confabul"))))

(deftest test-9796
  (testing "test case 9796"
    (is (= (stemming "steamrollering") "steamrol"))))

(deftest test-9797
  (testing "test case 9797"
    (is (= (stemming "impregnability") "impregn"))))

(deftest test-9798
  (testing "test case 9798"
    (is (= (stemming "clots") "clot"))))

(deftest test-9799
  (testing "test case 9799"
    (is (= (stemming "bilberry") "bilberri"))))

(deftest test-9800
  (testing "test case 9800"
    (is (= (stemming "articulationes") "articulation"))))

(deftest test-9801
  (testing "test case 9801"
    (is (= (stemming "nobles") "nobl"))))

(deftest test-9802
  (testing "test case 9802"
    (is (= (stemming "magyar") "magyar"))))

(deftest test-9803
  (testing "test case 9803"
    (is (= (stemming "chivalrousness") "chivalr"))))

(deftest test-9804
  (testing "test case 9804"
    (is (= (stemming "dismember") "dismemb"))))

(deftest test-9805
  (testing "test case 9805"
    (is (= (stemming "famed") "fame"))))

(deftest test-9806
  (testing "test case 9806"
    (is (= (stemming "adorn") "adorn"))))

(deftest test-9807
  (testing "test case 9807"
    (is (= (stemming "islands") "island"))))

(deftest test-9808
  (testing "test case 9808"
    (is (= (stemming "superbly") "superbl"))))

(deftest test-9809
  (testing "test case 9809"
    (is (= (stemming "virilizing") "viril"))))

(deftest test-9810
  (testing "test case 9810"
    (is (= (stemming "propagational") "propag"))))

(deftest test-9811
  (testing "test case 9811"
    (is (= (stemming "stranglings") "strangl"))))

(deftest test-9812
  (testing "test case 9812"
    (is (= (stemming "adulterant") "adulter"))))

(deftest test-9813
  (testing "test case 9813"
    (is (= (stemming "promptness") "prompt"))))

(deftest test-9814
  (testing "test case 9814"
    (is (= (stemming "giddied") "giddi"))))

(deftest test-9815
  (testing "test case 9815"
    (is (= (stemming "justiciable") "justici"))))

(deftest test-9816
  (testing "test case 9816"
    (is (= (stemming "paretic") "paret"))))

(deftest test-9817
  (testing "test case 9817"
    (is (= (stemming "gluteus") "gluteu"))))

(deftest test-9818
  (testing "test case 9818"
    (is (= (stemming "implacentalia") "implacentalia"))))

(deftest test-9819
  (testing "test case 9819"
    (is (= (stemming "relicensing") "relicens"))))

(deftest test-9820
  (testing "test case 9820"
    (is (= (stemming "protrusile") "protrusil"))))

(deftest test-9821
  (testing "test case 9821"
    (is (= (stemming "burgles") "burgl"))))

(deftest test-9822
  (testing "test case 9822"
    (is (= (stemming "jungle") "jungl"))))

(deftest test-9823
  (testing "test case 9823"
    (is (= (stemming "decamp") "decamp"))))

(deftest test-9824
  (testing "test case 9824"
    (is (= (stemming "unrighteous") "unright"))))

(deftest test-9825
  (testing "test case 9825"
    (is (= (stemming "wabbles") "wabbl"))))

(deftest test-9826
  (testing "test case 9826"
    (is (= (stemming "butch") "butch"))))

(deftest test-9827
  (testing "test case 9827"
    (is (= (stemming "chatter") "chatter"))))

(deftest test-9828
  (testing "test case 9828"
    (is (= (stemming "lumpfish") "lumpfish"))))

(deftest test-9829
  (testing "test case 9829"
    (is (= (stemming "cringes") "cring"))))

(deftest test-9830
  (testing "test case 9830"
    (is (= (stemming "nanny") "nanni"))))

(deftest test-9831
  (testing "test case 9831"
    (is (= (stemming "elect") "elect"))))

(deftest test-9832
  (testing "test case 9832"
    (is (= (stemming "preoccupies") "preoccupi"))))

(deftest test-9833
  (testing "test case 9833"
    (is (= (stemming "cresset") "cresset"))))

(deftest test-9834
  (testing "test case 9834"
    (is (= (stemming "euphoria") "euphoria"))))

(deftest test-9835
  (testing "test case 9835"
    (is (= (stemming "harebells") "harebel"))))

(deftest test-9836
  (testing "test case 9836"
    (is (= (stemming "woolie") "wooli"))))

(deftest test-9837
  (testing "test case 9837"
    (is (= (stemming "shipped") "ship"))))

(deftest test-9838
  (testing "test case 9838"
    (is (= (stemming "journeyer") "journey"))))

(deftest test-9839
  (testing "test case 9839"
    (is (= (stemming "insinuators") "insinu"))))

(deftest test-9840
  (testing "test case 9840"
    (is (= (stemming "ulva") "ulva"))))

(deftest test-9841
  (testing "test case 9841"
    (is (= (stemming "theremin") "theremin"))))

(deftest test-9842
  (testing "test case 9842"
    (is (= (stemming "dashy") "dashi"))))

(deftest test-9843
  (testing "test case 9843"
    (is (= (stemming "pores") "pore"))))

(deftest test-9844
  (testing "test case 9844"
    (is (= (stemming "reciprocity") "reciproc"))))

(deftest test-9845
  (testing "test case 9845"
    (is (= (stemming "cyclops") "cyclop"))))

(deftest test-9846
  (testing "test case 9846"
    (is (= (stemming "rummies") "rummi"))))

(deftest test-9847
  (testing "test case 9847"
    (is (= (stemming "wasted") "wast"))))

(deftest test-9848
  (testing "test case 9848"
    (is (= (stemming "bushwhackers") "bushwhack"))))

(deftest test-9849
  (testing "test case 9849"
    (is (= (stemming "monism") "monism"))))

(deftest test-9850
  (testing "test case 9850"
    (is (= (stemming "direly") "dire"))))

(deftest test-9851
  (testing "test case 9851"
    (is (= (stemming "adventitiously") "adventiti"))))

(deftest test-9852
  (testing "test case 9852"
    (is (= (stemming "chronicle") "chronicl"))))

(deftest test-9853
  (testing "test case 9853"
    (is (= (stemming "amulets") "amulet"))))

(deftest test-9854
  (testing "test case 9854"
    (is (= (stemming "decolonizing") "decolon"))))

(deftest test-9855
  (testing "test case 9855"
    (is (= (stemming "hoecake") "hoecak"))))

(deftest test-9856
  (testing "test case 9856"
    (is (= (stemming "tongue") "tongu"))))

(deftest test-9857
  (testing "test case 9857"
    (is (= (stemming "humidfies") "humidfi"))))

(deftest test-9858
  (testing "test case 9858"
    (is (= (stemming "solders") "solder"))))

(deftest test-9859
  (testing "test case 9859"
    (is (= (stemming "questionableness") "question"))))

(deftest test-9860
  (testing "test case 9860"
    (is (= (stemming "yapping") "yap"))))

(deftest test-9861
  (testing "test case 9861"
    (is (= (stemming "coverer") "cover"))))

(deftest test-9862
  (testing "test case 9862"
    (is (= (stemming "catchall") "catchal"))))

(deftest test-9863
  (testing "test case 9863"
    (is (= (stemming "yukked") "yuk"))))

(deftest test-9864
  (testing "test case 9864"
    (is (= (stemming "holiest") "holiest"))))

(deftest test-9865
  (testing "test case 9865"
    (is (= (stemming "collarbone") "collarbon"))))

(deftest test-9866
  (testing "test case 9866"
    (is (= (stemming "funerary") "funerari"))))

(deftest test-9867
  (testing "test case 9867"
    (is (= (stemming "apers") "aper"))))

(deftest test-9868
  (testing "test case 9868"
    (is (= (stemming "experiential") "experienti"))))

(deftest test-9869
  (testing "test case 9869"
    (is (= (stemming "compensate") "compens"))))

(deftest test-9870
  (testing "test case 9870"
    (is (= (stemming "jets") "jet"))))

(deftest test-9871
  (testing "test case 9871"
    (is (= (stemming "medical") "medic"))))

(deftest test-9872
  (testing "test case 9872"
    (is (= (stemming "undersexed") "undersex"))))

(deftest test-9873
  (testing "test case 9873"
    (is (= (stemming "consensus") "consensu"))))

(deftest test-9874
  (testing "test case 9874"
    (is (= (stemming "arider") "arid"))))

(deftest test-9875
  (testing "test case 9875"
    (is (= (stemming "cooption") "cooption"))))

(deftest test-9876
  (testing "test case 9876"
    (is (= (stemming "fettered") "fetter"))))

(deftest test-9877
  (testing "test case 9877"
    (is (= (stemming "stiffen") "stiffen"))))

(deftest test-9878
  (testing "test case 9878"
    (is (= (stemming "songwriters") "songwrit"))))

(deftest test-9879
  (testing "test case 9879"
    (is (= (stemming "gavelling") "gavel"))))

(deftest test-9880
  (testing "test case 9880"
    (is (= (stemming "prodded") "prod"))))

(deftest test-9881
  (testing "test case 9881"
    (is (= (stemming "aim") "aim"))))

(deftest test-9882
  (testing "test case 9882"
    (is (= (stemming "faltered") "falter"))))

(deftest test-9883
  (testing "test case 9883"
    (is (= (stemming "unclothes") "uncloth"))))

(deftest test-9884
  (testing "test case 9884"
    (is (= (stemming "civilizable") "civiliz"))))

(deftest test-9885
  (testing "test case 9885"
    (is (= (stemming "tranquilizes") "tranquil"))))

(deftest test-9886
  (testing "test case 9886"
    (is (= (stemming "jitters") "jitter"))))

(deftest test-9887
  (testing "test case 9887"
    (is (= (stemming "flannelet") "flannelet"))))

(deftest test-9888
  (testing "test case 9888"
    (is (= (stemming "unrelated") "unrel"))))

(deftest test-9889
  (testing "test case 9889"
    (is (= (stemming "wrath") "wrath"))))

(deftest test-9890
  (testing "test case 9890"
    (is (= (stemming "thorniest") "thorniest"))))

(deftest test-9891
  (testing "test case 9891"
    (is (= (stemming "froufrou") "froufrou"))))

(deftest test-9892
  (testing "test case 9892"
    (is (= (stemming "subverts") "subvert"))))

(deftest test-9893
  (testing "test case 9893"
    (is (= (stemming "bowman") "bowman"))))

(deftest test-9894
  (testing "test case 9894"
    (is (= (stemming "fille") "fill"))))

(deftest test-9895
  (testing "test case 9895"
    (is (= (stemming "italians") "italian"))))

(deftest test-9896
  (testing "test case 9896"
    (is (= (stemming "rogues") "rogu"))))

(deftest test-9897
  (testing "test case 9897"
    (is (= (stemming "ingestible") "ingest"))))

(deftest test-9898
  (testing "test case 9898"
    (is (= (stemming "digitization") "digit"))))

(deftest test-9899
  (testing "test case 9899"
    (is (= (stemming "sandalwoods") "sandalwood"))))

(deftest test-9900
  (testing "test case 9900"
    (is (= (stemming "scaled") "scale"))))

(deftest test-9901
  (testing "test case 9901"
    (is (= (stemming "vastness") "vast"))))

(deftest test-9902
  (testing "test case 9902"
    (is (= (stemming "crusades") "crusad"))))

(deftest test-9903
  (testing "test case 9903"
    (is (= (stemming "repressively") "repress"))))

(deftest test-9904
  (testing "test case 9904"
    (is (= (stemming "katakanas") "katakana"))))

(deftest test-9905
  (testing "test case 9905"
    (is (= (stemming "copulate") "copul"))))

(deftest test-9906
  (testing "test case 9906"
    (is (= (stemming "scavenged") "scaveng"))))

(deftest test-9907
  (testing "test case 9907"
    (is (= (stemming "intercept") "intercept"))))

(deftest test-9908
  (testing "test case 9908"
    (is (= (stemming "evangelic") "evangel"))))

(deftest test-9909
  (testing "test case 9909"
    (is (= (stemming "purgations") "purgat"))))

(deftest test-9910
  (testing "test case 9910"
    (is (= (stemming "blackened") "blacken"))))

(deftest test-9911
  (testing "test case 9911"
    (is (= (stemming "inventers") "invent"))))

(deftest test-9912
  (testing "test case 9912"
    (is (= (stemming "leakers") "leaker"))))

(deftest test-9913
  (testing "test case 9913"
    (is (= (stemming "lachrymation") "lachrym"))))

(deftest test-9914
  (testing "test case 9914"
    (is (= (stemming "meetly") "meetli"))))

(deftest test-9915
  (testing "test case 9915"
    (is (= (stemming "virgo") "virgo"))))

(deftest test-9916
  (testing "test case 9916"
    (is (= (stemming "wholesale") "wholesal"))))

(deftest test-9917
  (testing "test case 9917"
    (is (= (stemming "debased") "debas"))))

(deftest test-9918
  (testing "test case 9918"
    (is (= (stemming "progressively") "progress"))))

(deftest test-9919
  (testing "test case 9919"
    (is (= (stemming "piecing") "piec"))))

(deftest test-9920
  (testing "test case 9920"
    (is (= (stemming "banshie") "banshi"))))

(deftest test-9921
  (testing "test case 9921"
    (is (= (stemming "geodic") "geodic"))))

(deftest test-9922
  (testing "test case 9922"
    (is (= (stemming "valvelets") "valvelet"))))

(deftest test-9923
  (testing "test case 9923"
    (is (= (stemming "fuseless") "fuseless"))))

(deftest test-9924
  (testing "test case 9924"
    (is (= (stemming "matchmaking") "matchmak"))))

(deftest test-9925
  (testing "test case 9925"
    (is (= (stemming "acrimonies") "acrimoni"))))

(deftest test-9926
  (testing "test case 9926"
    (is (= (stemming "snowstorms") "snowstorm"))))

(deftest test-9927
  (testing "test case 9927"
    (is (= (stemming "gluten") "gluten"))))

(deftest test-9928
  (testing "test case 9928"
    (is (= (stemming "moleskin") "moleskin"))))

(deftest test-9929
  (testing "test case 9929"
    (is (= (stemming "diesels") "diesel"))))

(deftest test-9930
  (testing "test case 9930"
    (is (= (stemming "quarrel") "quarrel"))))

(deftest test-9931
  (testing "test case 9931"
    (is (= (stemming "promulged") "promulg"))))

(deftest test-9932
  (testing "test case 9932"
    (is (= (stemming "stained") "stain"))))

(deftest test-9933
  (testing "test case 9933"
    (is (= (stemming "ratlines") "ratlin"))))

(deftest test-9934
  (testing "test case 9934"
    (is (= (stemming "disenfranchised") "disenfranchis"))))

(deftest test-9935
  (testing "test case 9935"
    (is (= (stemming "boded") "bode"))))

(deftest test-9936
  (testing "test case 9936"
    (is (= (stemming "larcenable") "larcen"))))

(deftest test-9937
  (testing "test case 9937"
    (is (= (stemming "sundowns") "sundown"))))

(deftest test-9938
  (testing "test case 9938"
    (is (= (stemming "funnily") "funnili"))))

(deftest test-9939
  (testing "test case 9939"
    (is (= (stemming "larruper") "larrup"))))

(deftest test-9940
  (testing "test case 9940"
    (is (= (stemming "publicizing") "public"))))

(deftest test-9941
  (testing "test case 9941"
    (is (= (stemming "unduly") "unduli"))))

(deftest test-9942
  (testing "test case 9942"
    (is (= (stemming "cousin") "cousin"))))

(deftest test-9943
  (testing "test case 9943"
    (is (= (stemming "ambidextrous") "ambidextr"))))

(deftest test-9944
  (testing "test case 9944"
    (is (= (stemming "unbinding") "unbind"))))

(deftest test-9945
  (testing "test case 9945"
    (is (= (stemming "buenas") "buena"))))

(deftest test-9946
  (testing "test case 9946"
    (is (= (stemming "acquirable") "acquir"))))

(deftest test-9947
  (testing "test case 9947"
    (is (= (stemming "software") "softwar"))))

(deftest test-9948
  (testing "test case 9948"
    (is (= (stemming "unhappiest") "unhappiest"))))

(deftest test-9949
  (testing "test case 9949"
    (is (= (stemming "ballades") "ballad"))))

(deftest test-9950
  (testing "test case 9950"
    (is (= (stemming "flamencos") "flamenco"))))

(deftest test-9951
  (testing "test case 9951"
    (is (= (stemming "spindling") "spindl"))))

(deftest test-9952
  (testing "test case 9952"
    (is (= (stemming "psychoanalytically") "psychoanalyt"))))

(deftest test-9953
  (testing "test case 9953"
    (is (= (stemming "surger") "surger"))))

(deftest test-9954
  (testing "test case 9954"
    (is (= (stemming "catawba") "catawba"))))

(deftest test-9955
  (testing "test case 9955"
    (is (= (stemming "created") "creat"))))

(deftest test-9956
  (testing "test case 9956"
    (is (= (stemming "influxes") "influx"))))

(deftest test-9957
  (testing "test case 9957"
    (is (= (stemming "unlabored") "unlabor"))))

(deftest test-9958
  (testing "test case 9958"
    (is (= (stemming "acetaminophen") "acetaminophen"))))

(deftest test-9959
  (testing "test case 9959"
    (is (= (stemming "housepaint") "housepaint"))))

(deftest test-9960
  (testing "test case 9960"
    (is (= (stemming "lankily") "lankili"))))

(deftest test-9961
  (testing "test case 9961"
    (is (= (stemming "unstacking") "unstack"))))

(deftest test-9962
  (testing "test case 9962"
    (is (= (stemming "chewed") "chew"))))

(deftest test-9963
  (testing "test case 9963"
    (is (= (stemming "sanguinarily") "sanguinarili"))))

(deftest test-9964
  (testing "test case 9964"
    (is (= (stemming "microphysics") "microphys"))))

(deftest test-9965
  (testing "test case 9965"
    (is (= (stemming "autodialer") "autodial"))))

(deftest test-9966
  (testing "test case 9966"
    (is (= (stemming "reassembles") "reassembl"))))

(deftest test-9967
  (testing "test case 9967"
    (is (= (stemming "excessively") "excess"))))

(deftest test-9968
  (testing "test case 9968"
    (is (= (stemming "wotted") "wot"))))

(deftest test-9969
  (testing "test case 9969"
    (is (= (stemming "contemplating") "contempl"))))

(deftest test-9970
  (testing "test case 9970"
    (is (= (stemming "virtually") "virtual"))))

(deftest test-9971
  (testing "test case 9971"
    (is (= (stemming "restoration") "restor"))))

(deftest test-9972
  (testing "test case 9972"
    (is (= (stemming "cracknels") "cracknel"))))

(deftest test-9973
  (testing "test case 9973"
    (is (= (stemming "sublimeness") "sublim"))))

(deftest test-9974
  (testing "test case 9974"
    (is (= (stemming "slattern") "slattern"))))

(deftest test-9975
  (testing "test case 9975"
    (is (= (stemming "fro") "fro"))))

(deftest test-9976
  (testing "test case 9976"
    (is (= (stemming "lousily") "lousili"))))

(deftest test-9977
  (testing "test case 9977"
    (is (= (stemming "downbeats") "downbeat"))))

(deftest test-9978
  (testing "test case 9978"
    (is (= (stemming "classicism") "classic"))))

(deftest test-9979
  (testing "test case 9979"
    (is (= (stemming "punner") "punner"))))

(deftest test-9980
  (testing "test case 9980"
    (is (= (stemming "washer") "washer"))))

(deftest test-9981
  (testing "test case 9981"
    (is (= (stemming "indefensibly") "indefens"))))

(deftest test-9982
  (testing "test case 9982"
    (is (= (stemming "relayed") "relai"))))

(deftest test-9983
  (testing "test case 9983"
    (is (= (stemming "nanowatt") "nanowatt"))))

(deftest test-9984
  (testing "test case 9984"
    (is (= (stemming "justiciary") "justiciari"))))

(deftest test-9985
  (testing "test case 9985"
    (is (= (stemming "demigods") "demigod"))))

(deftest test-9986
  (testing "test case 9986"
    (is (= (stemming "determinably") "determin"))))

(deftest test-9987
  (testing "test case 9987"
    (is (= (stemming "predesignated") "predesign"))))

(deftest test-9988
  (testing "test case 9988"
    (is (= (stemming "maillot") "maillot"))))

(deftest test-9989
  (testing "test case 9989"
    (is (= (stemming "wooly") "wooli"))))

(deftest test-9990
  (testing "test case 9990"
    (is (= (stemming "superscribing") "superscrib"))))

(deftest test-9991
  (testing "test case 9991"
    (is (= (stemming "storybook") "storybook"))))

(deftest test-9992
  (testing "test case 9992"
    (is (= (stemming "headship") "headship"))))

(deftest test-9993
  (testing "test case 9993"
    (is (= (stemming "antiquely") "antiqu"))))

(deftest test-9994
  (testing "test case 9994"
    (is (= (stemming "bohunk") "bohunk"))))

(deftest test-9995
  (testing "test case 9995"
    (is (= (stemming "tippable") "tippabl"))))

(deftest test-9996
  (testing "test case 9996"
    (is (= (stemming "mensing") "mens"))))

(deftest test-9997
  (testing "test case 9997"
    (is (= (stemming "narcos") "narco"))))

(deftest test-9998
  (testing "test case 9998"
    (is (= (stemming "empowered") "empow"))))

(deftest test-9999
  (testing "test case 9999"
    (is (= (stemming "slithering") "slither"))))

(deftest test-10000
  (testing "test case 10000"
    (is (= (stemming "biotite") "biotit"))))

