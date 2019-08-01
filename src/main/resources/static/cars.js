alert();
// fetch('http://localhost:8080/cars/')
// .then(res => res.json())
// .then(json => console.log(json));

var app = new function () {
    var cars = [];
    this.gets = function getall() {
        // alert();
        fetch('http://localhost:8080/cars/')
            .then(res => res.json())
            .then(json => {
                // console.log(json);
                cars.push(json);
            });
    console.log(cars);
        };
}