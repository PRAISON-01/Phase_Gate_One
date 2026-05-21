const { getTwoSum } = require('./TwoSumTest');

test(" test That Method Returns The Two Number That Returns the Number That Makes Up The Sum ", ()=> {
        let array = {7, 6, 12, 4, -1};
        let sum = 6;
        let actual = TwoSumTest.getTwoSum(array, sum);
        let expected = {7, -1};
       expect(actual).toEqual(expected);

})




















