'use strict';

export default function checkregNo(regNo) {
    return /^[A-Z]{1,2}[0-9]{2}\/[0-9]{5}\/[0-2][0-9]/i.test(regNo);
}

export default function checkName(name) {
    return /\w{2}\s+\w{2}/.test(name);
}

export default function checkStaffId(staffId) {
    return /[0-9]{5}/.test(staffId);
}

export default function checkNationalId(nationalId) {
    return /[0-9]{7,8}/.test(nationalId);
};