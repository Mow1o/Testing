

const eka = [1, 2, 3];
const ages = [3, 10, 2, 18, 20, 1, 6 ];

const result = ages.filter(nimi)


// function checkAdult(age) {
//     console.log (age >= 18);

// }


function nimi(asd) {

    return asd > 18;
  }

  function myFunction() {
    document.getElementById("demo").innerHTML = ages.find(nimi);
  }