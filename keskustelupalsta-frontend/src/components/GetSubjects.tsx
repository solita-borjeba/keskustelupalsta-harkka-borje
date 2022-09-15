import React, { useEffect, useState } from 'react';
import { SERVER_URL } from '../constants';

function GetSubjects() {
    const [subjects, setSubjects] = useState([]);

    useEffect(() => {
        fetch(SERVER_URL + 'getSubjects');
        console.log("getSubjects execute");

    }, []);
    return(
        <div>
            GetSubjects suoritettu.
        </div>
    )
}

export default GetSubjects;
