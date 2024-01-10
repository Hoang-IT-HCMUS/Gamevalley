import React, { useState } from "react";
import { Rating, Box, Typography } from "@mui/material";
import './Score.css'

function BasicRating(vl) {

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

  return (
    <div className="score">
      <Typography component="legend">Rating:</Typography>
      <Rating name="half-rating-read" value={vl.score} precision={0.5} readOnly />
      <Box sx={{ ml: 2 }}>{labels[vl.score]}</Box>
    </div>
  );
}

export default BasicRating;