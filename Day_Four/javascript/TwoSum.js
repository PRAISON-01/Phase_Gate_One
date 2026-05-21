function getTwoSum(array, sum){

    list = [];
    
    for(let count = 1; count < array.length; count++){
        for(let number = 0; number<array.length; number++){
            if(number + array[count] == sum )
                list.push(number);
                break;
        }
    }

    for(let count = 1; count < array.length; count++){
        for(let number = 0; number<array.length; number++){
            if(number + array[count] == sum )
                list.push(array[count]);
                break;
        }
    }

    return list;

}

module.exports = { getTwoSum }
