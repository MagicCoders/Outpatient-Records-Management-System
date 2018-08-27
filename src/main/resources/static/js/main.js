'use strict';

let checkregNo =
    (regNo) => {
        return /^[A-Z]{1,2}[0-9]{2}\/[0-9]{5}\/[0-2][0-9]/i.test(regNo);
    };

let checkName =
    (name) => {
        return /\w{2}\s+\w{2}/.test(name);
    };

let checkStaffId = (staffId) => {
    return /[0-9]{5}/.test(staffId);
};

let checkNationalId = (nationalId) => {
    return /[0-9]{7,8}/.test(nationalId);
};

window.onload = () => {
    let regNo = document.getElementById('regNo');
    let name = document.getElementById('name');
    let button = document.getElementById('submit-buttons');
    let update = document.getElementById('update-button')
    let visit = document.getElementById("visit");
    let staffId = document.getElementById('staffId');
    let nationalId = document.getElementById('nationalId');
    let patientType = document.getElementById("type-selector");
    let studentIdContainer = document.getElementById("studentId-container");
    let staffIdContainer = document.getElementById("staffId-container");
    let nationalIdContainer = document.getElementById("nationalId-container");
    let stuffButton = document.getElementById("submit-staff-button");
    let communityButton = document.getElementById("submit-community-button");
    let studentButton = document.getElementById("submit-student-button");
    let timeout;
    let studentName;
    let studentRegNo;

    patientType.addEventListener("click", (event) => {
        event.preventDefault();
        
        switch (patientType.value) {
            case "student":
                staffIdContainer.classList.add("invisible");
                nationalIdContainer.classList.add("invisible");
                studentIdContainer.classList.remove("invisible");
                stuffButton.classList.add("invisible");
                communityButton.classList.add("invisible");
                studentButton.classList.remove("invisible");
                staffId.disabled = true;
                regNo.disabled = false;
                nationalId.disabled = true;

                break;
            case "staff":
                staffIdContainer.classList.remove("invisible");
                nationalIdContainer.classList.add("invisible");
                studentIdContainer.classList.add("invisible");
                stuffButton.classList.remove("invisible");
                communityButton.classList.add("invisible");
                studentButton.classList.add("invisible");
                staffId.disabled = false;
                regNo.disabled = true;
                nationalId.disabled = true;

                break;
            case "community":
                staffIdContainer.classList.add("invisible");
                nationalIdContainer.classList.remove("invisible");
                studentIdContainer.classList.add("invisible");
                stuffButton.classList.add("invisible");
                communityButton.classList.remove("invisible");
                studentButton.classList.add("invisible");
                staffId.disabled = true;
                regNo.disabled = true;
                nationalId.disabled = false;

                break;
        }
    });

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

    staffId.addEventListener('keyup', (event) => {
        event.preventDefault();
        let staffIdValue = staffId.value;
        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkStaffId(staffIdValue)) {
                staffId.classList.add('is-primary');
                staffId.classList.remove('is-danger', 'shake');
            } else {
                staffId.classList.remove('is-primary');
                staffId.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

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