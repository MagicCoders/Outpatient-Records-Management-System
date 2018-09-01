'use strict';

function checkStaffId(staffId) {
    return /^[0-9]{5,6}$/.test(staffId);
}

function checkName(name) {
    return /\w{2}\s+\w{2}/.test(name);
}

window.onload = () => {
    let staffId = document.getElementById('staffId'),
        name = document.getElementById('name'),
        update = document.getElementById('update-button'),
        staffButton = document.getElementById("submit-stuff-button"),
        visit = document.getElementById("visit"),
        staffName,
        timeout;

    name.addEventListener('keyup', (event) => {
        event.preventDefault();
        staffName = name.value;
        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkName(staffName)) {
                name.classList.add('is-primary');
                name.classList.remove('is-danger', 'shake');
            } else {
                name.classList.remove('is-primary');
                name.classList.add('is-danger', 'shake');
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
                staffButton.removeAttribute('disabled')
            } else {
                staffId.classList.remove('is-primary');
                staffId.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

    visit.addEventListener("click", (event) => {
        event.preventDefault();
        let visitType = visit.value ==="Returning";

        if (visitType ) {
            update.classList.remove("invisible");
            update.removeAttribute("disabled");
            staffButton.classList.add("invisible");
        }

        else {
            update.classList.add('invisible');
            staffButton.classList.remove("invisible");
        }
    });
};