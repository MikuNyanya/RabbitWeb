var bgmList = [{id: "28234322", title: "未だ知られぬ物語 ～ Anticipated Dream", singer: "凋叶棕"},
    {id: "850696", title: "意にそぐわぬリターニー", singer: "凋叶棕"},
    {id: "476863", title: "U.N.オーエンは彼女なのか？", singer: "孟世/Cross Current"},
    {id: "34002748", title: "幽霊楽団 ～ Phantom Ensemble", singer: "交響アクティブNEETs"},
    {id: "22765943", title: "向こう側の月", singer: "上海アリス幻樂団"},
    {id: "412785225", title: "狂気の瞳 ~ Invisible Full Moon", singer: "交響アクティブNEETs"},
    {id: "406716116", title: "Ten Thousand Stars", singer: "初音ミク/CircusP"},
    {id: "31514136", title: "流星", singer: "初音ミク/流星p"},
    {id: "33916349", title: "踊ル猫曰ク", singer: "まらしぃ"},
    {id: "29023571", title: "ODDS&ENDS", singer: "初音ミク/ryo"}
]


function audioBgmInit() {
    var audioBgm = document.getElementById("audio_bgm");
    audioBgm.volume = 0.3;
    randomBgm(audioBgm);
    //播放结束自动下一首
    audioBgm.addEventListener("ended", function () {
        randomBgm(audioBgm);
        audioBgm.play();
    }, false)
}

function randomBgm(audioBgm) {
    var max = bgmList.length;
    var i = parseInt(Math.random() * (max), 10);
    audioBgm.src = "http://music.163.com/song/media/outer/url?id=" + bgmList[i].id + ".mp3";
    //网易云歌曲页面：https://music.163.com/#/song?id=
}