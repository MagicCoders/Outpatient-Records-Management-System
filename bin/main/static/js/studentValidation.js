'use strict';

function checkregNo(regNo) {
    return /^[A-Z]{1,2}[0-9]{2}\/[0-9]{5}\/[0-2][0-9]/i.test(regNo);
}

function checkName(name) {
    return /\w{2}\s+\w{2}/.test(name);
}

window.onload =()=>{
    let regNo = document.getElementById('regNo'),
        name = document.getElementById('name'),
        studentButton = document.getElementById("submit-student-button"),
        update = document.getElementById('update-button'),
        visit = document.getElementById("visit"),
        studentName,
        studentRegNo,
        timeout;

    name.addEventListener('keyup', (event) => {
        event.preventDefault();
        studentName = name.value;
        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkName(studentName)) {
                name.classList.add('is-primary');
                name.classList.remove('is-danger', 'shake');
            } else {
                name.classList.remove('is-primary');
                name.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

    regNo.addEventListener('keyup', (event) => {
        event.preventDefault();

        studentName = name.value;

        studentRegNo = regNo.value;

        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkregNo(studentRegNo) && checkName(studentName)) {
                regNo.classList.add('is-primary');
                regNo.classList.remove('is-danger', 'shake');
                studentButton.removeAttribute('disabled')
            } else {
                regNo.classList.remove('is-primary');
                regNo.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

    visit.addEventListener("click", (event) => {
        event.preventDefault();
        let visitType = visit.value ==="Returning";

        if (visitType ) {
            update.classList.remove("invisible");
            update.removeAttribute("disabled");
            studentButton.classList.add("invisible");
        }

        else {
            update.classList.add('invisible');
            studentButton.classList.remove("invisible");
        }
    });

};