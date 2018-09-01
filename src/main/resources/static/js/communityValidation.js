'use strict';

function checkNationalId(nationalId) {
    return /^[0-9]{6,8}$/.test(nationalId);
}

function checkName(name) {
    return /\w{2}\s+\w{2}/.test(name);
}

window.onload = () => {
    let nationalId = document.getElementById('nationalId'),
        name = document.getElementById('name'),
        update = document.getElementById('update-button'),
        communityButton = document.getElementById("submit-community-button"),
        visit = document.getElementById("visit"),
        timeout;

    name.addEventListener('keyup', (event) => {
        event.preventDefault();
        let communityName = name.value;
        if (timeout !== null) {
            clearTimeout(timeout);
        }

        timeout = setTimeout(() => {
            if (checkName(communityName)) {
                name.classList.add('is-primary');
                name.classList.remove('is-danger', 'shake');
            } else {
                name.classList.remove('is-primary');
                name.classList.add('is-danger', 'shake');
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
                communityButton.removeAttribute('disabled')
            } else {
                nationalId.classList.remove('is-primary');
                nationalId.classList.add('is-danger', 'shake');
            }
        }, 1000);
    });

    visit.addEventListener("click", (event) => {
        event.preventDefault();
        let visitType = visit.value ==="Returning";

        if (visitType ) {
            update.classList.remove("invisible");
            update.removeAttribute("disabled");
            communityButton.classList.add("invisible");
        }

        else {
            update.classList.add('invisible');
            communityButton.classList.remove("invisible");
        }
    });
};