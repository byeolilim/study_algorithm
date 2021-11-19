function solution(price, money, count) {
    var answer = -1;
    var i = 1;
    var temp = 0;
    var sum = 0;
    
    for(i = 1; i <= count; i++) {
        temp = price * i;
        sum = sum + temp;
    }
    
    answer = sum > money ? sum - money : 0;
    return answer;
}