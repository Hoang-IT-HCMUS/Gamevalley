import React from 'react'
import './Comment.css'
import { useState, useEffect } from 'react'
import { Box, Typography, Rating } from '@mui/material'
import { Star } from '@mui/icons-material'

export const Comment = () => {

    const [comment, setComment] = useState("");
    const [comments, setComments] = useState([]);
    const [value, setValue] = React.useState(0);
    const [values, setValues] = useState([]);
    const [lastindex, setLastIndex] = useState(-1);
    const [hover, setHover] = React.useState(-1);

    const labels = {
      0.5: 'Bad',
      1: 'Bad+',
      1.5: 'Poor',
      2: 'Poor+',
      2.5: 'Ok',
      3: 'Ok+',
      3.5: 'Good',
      4: 'Good+',
      4.5: 'Excellent',
      5: 'Excellent+',
    };

    function getLabelText(value) {
      return `${value} Star${value !== 1 ? 's' : ''}, ${labels[value]}`;
    }

    const onClickHandler = () => {
        setComments((comments) => [...comments, comment]);
        setValues((values) => [...values, value]);
    };
    const onChangeHandler = (e) => {
        setComment(e.target.value);
    };
    useEffect(() => {
      setLastIndex(comments.length - 1);
    }, [comments])

    const combineArrays = (text, val) => {
      return (
        <div className="cmttext">
          <p>{text}</p>
          <Rating name="half-rating-read" value={val} precision={0.5} readOnly />
        </div>
      );
    };

  return (
    <div className="main-container">      
      <div className="comment-flexbox">
        <h3 className="comment-text">Comment</h3>
        <textarea
          rows={4}
          cols={248}
          value={comment}
          onChange={onChangeHandler}
          className="input-box"
          placeholder='Comment'
          wrap='soft'
        />

      <div className="rating">
        <Box
        sx={{
          width: 200,
          display: 'flex',
          alignItems: 'center',
        }}
        >
        <Rating
          name="hover-feedback"
          value={value}
          precision={0.5}
          getLabelText={getLabelText}
          onChange={(event, newValue) => {
            setValue(newValue);
          }}
          onChangeActive={(event, newHover) => {
            setHover(newHover);
          }}
          emptyIcon={<Star style={{ opacity: 0.55 }} fontSize="inherit" />}
        />
          {value !== null && (
            <Box sx={{ ml: 2 }}>{labels[hover !== -1 ? hover : value]}</Box>
          )}
        </Box>
      </div>

        <button onClick={onClickHandler} className="comment-button">
          Submit
        </button>
      </div>

      {comments.map((text, cmtIdx) => (
        <div key={cmtIdx}>
          {combineArrays(text, values[cmtIdx])}
        </div>
      ))}
    </div>
  )
}

export default Comment