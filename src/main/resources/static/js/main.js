'use strict';

window.onload = () => {
    let button = document.getElementById('submit-buttons');
    let update = document.getElementById('update-button')
    let visit = document.getElementById("visit");
    let staffId = document.getElementById('staffId');
    let nationalId = document.getElementById('nationalId');
    let timeout;
    let studentName;
    let studentRegNo;

    nationalId.addEventListener('keyup', (event) => {
        event.preventDefault();
        let nationalIdValue = nationalId.value;
        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkNationalId(nationalIdValue)) {
                nationalId.classList.add('is-primary');
                nationalId.classList.remove('is-danger', 'shake');
            } else {
                nationalId.classList.remove('is-primary');
                nationalId.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

    visit.addEventListener("click", (event) => {
        event.preventDefault();
        studentName = name.value;
        studentRegNo = regNo.value;
        let visitType = visit.value ==="Returning";

        if (visitType ) {
            update.classList.remove("invisible")
            button.classList.add("invisible");
            update.removeAttribute("disabled");
        }

        else {
            update.classList.add('invisible')
            button.classList.remove('invisible');
        }
    });
};